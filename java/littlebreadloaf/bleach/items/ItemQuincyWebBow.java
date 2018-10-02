package littlebreadloaf.bleach.items;

import cpw.mods.fml.common.eventhandler.EventBus;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import littlebreadloaf.bleach.entities.EntityEnergyArrow;
import littlebreadloaf.bleach.entities.EntitySeeleArrow;
import littlebreadloaf.bleach.events.ExtendedPlayer;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.entity.player.PlayerCapabilities;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.ArrowLooseEvent;
import net.minecraftforge.event.entity.player.ArrowNockEvent;



public class ItemQuincyWebBow
  extends Item
{
  @SideOnly(Side.CLIENT)
  public static IIcon[] iconArray;
  private static final String[] bowPullIconNameArray = { "web_seele1", "web_seele2", "web_seele3" };
  
  private static final String __OBFID = "CL_00001777";
  private boolean isSeele;
  
  public ItemQuincyWebBow()
  {
    this.maxStackSize = 1;
    setMaxDamage(-1);
    setUnlocalizedName("quincy_web");
    setCreativeTab(null);
  }
  



  public void onPlayerStoppedUsing(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer, int par4)
  {
    int j = getMaxItemUseDuration(par1ItemStack) - par4;
    
    ExtendedPlayer props = (ExtendedPlayer)par3EntityPlayer.getExtendedProperties("BleachPlayer");
    
    ArrowLooseEvent event = new ArrowLooseEvent(par3EntityPlayer, par1ItemStack, j);
    MinecraftForge.EVENT_BUS.post(event);
    if (event.isCanceled())
    {
      return;
    }
    j = event.charge;
    
    boolean flag = par3EntityPlayer.capabilities.isCreativeMode;
    if (par3EntityPlayer.inventory.hasItemStack(new ItemStack(BleachItems.seele, 1, 1)))
    {
      float f = j / 20.0F;
      f = (f * f + f * 2.0F) / 3.0F;
      
      if (f < 0.1D)
      {
        return;
      }
      
      if (f > 1.0F)
      {
        f = 1.0F;
      }
      
      EntitySeeleArrow entitySeeleArrow = new EntitySeeleArrow(par2World, par3EntityPlayer, 2.0F);
      
      if (f == 1.0F)
      {
        entitySeeleArrow.setIsCritical(true);
        if (!par3EntityPlayer.capabilities.isCreativeMode)
        {
          par3EntityPlayer.inventory.consumeInventoryItem(BleachItems.seele);
        }
        
        par2World.spawnEntityInWorld(entitySeeleArrow);
        if (!par2World.isRemote)
        {
          par2World.playSoundAtEntity(par3EntityPlayer, "bleach:bowfire", 0.4F, 1.0F);
        }
      }
    }
  }
  






  public ItemStack onEaten(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
  {
    return par1ItemStack;
  }
  




  public int getMaxItemUseDuration(ItemStack par1ItemStack)
  {
    return 72000;
  }
  





  public EnumAction getItemUseAction(ItemStack par1ItemStack)
  {
    return EnumAction.bow;
  }
  


  private boolean getIsSeele()
  {
    return this.isSeele;
  }
  





  public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
  {
    ExtendedPlayer props = (ExtendedPlayer)par3EntityPlayer.getExtendedProperties("BleachPlayer");
    if (props.getFaction() == 2)
    {
      ArrowNockEvent event = new ArrowNockEvent(par3EntityPlayer, par1ItemStack);
      MinecraftForge.EVENT_BUS.post(event);
      if (event.isCanceled())
      {
        return event.result;
      }
      if (par3EntityPlayer.inventory.hasItemStack(new ItemStack(BleachItems.seele, 1, 1)))
      {
        par3EntityPlayer.setItemInUse(par1ItemStack, getMaxItemUseDuration(par1ItemStack));
        this.isSeele = true;
        par2World.playSoundAtEntity(par3EntityPlayer, "bleach:bowcharge", 0.4F, 1.0F);
      }
      if ((par3EntityPlayer.capabilities.isCreativeMode) || (props.getCurrentEnergy() >= 1.0F / props.getCurrentCap()))
      {
        par3EntityPlayer.setItemInUse(par1ItemStack, getMaxItemUseDuration(par1ItemStack));
        this.isSeele = false;
      }
    }
    
    return par1ItemStack;
  }
  





  public int getItemEnchantability()
  {
    return 1;
  }
  

  @SideOnly(Side.CLIENT)
  public void registerIcons(IIconRegister par1IconRegister)
  {
    this.itemIcon = par1IconRegister.registerIcon("bleach".toLowerCase() + ":" + "quincy_web");
    iconArray = new IIcon[bowPullIconNameArray.length];
    
    for (int i = 0; i < iconArray.length; i++)
    {
      iconArray[i] = par1IconRegister.registerIcon("bleach:" + bowPullIconNameArray[i]); }
  }
  
  private int bowCoolDown = 20;
  



  int shikaiTimer = 40;
  




  public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5)
  {
    if ((par3Entity instanceof EntityPlayer))
    {
      EntityPlayer player = (EntityPlayer)par3Entity;
      ExtendedPlayer props = (ExtendedPlayer)player.getExtendedProperties("BleachPlayer");
      ItemStack heldItem = player.getCurrentEquippedItem();
      ItemStack var13 = new ItemStack(BleachItems.quincypendant, 1, 1);
      

      if ((heldItem != null) && (heldItem == par1ItemStack))
      {

        if (props.getCurrentEnergy() <= 0.0F)
        {
          props.deactivate(par1ItemStack.getItem());
        }
      }
      this.shikaiTimer -= 1;
      if ((this.shikaiTimer <= 0) && (!player.worldObj.isRemote))
      {
        this.shikaiTimer = 40;
        props.consumeEnergy(3);
      }
    }
  }
  


  public void onUsingTick(ItemStack stack, EntityPlayer player, int count)
  {
    ExtendedPlayer props = (ExtendedPlayer)player.getExtendedProperties("BleachPlayer");
    if ((props.getCurrentEnergy() > 0.0F) && (props.getFaction() == 2) && (!player.inventory.hasItemStack(new ItemStack(BleachItems.seele, 1, 1))))
    {


      if (count % 21 == 0)
      {

        EntityEnergyArrow entityEnergyArrow = new EntityEnergyArrow(player.worldObj, player, 2.0F);
        

        entityEnergyArrow.setIsCritical(true);
        

        player.worldObj.spawnEntityInWorld(entityEnergyArrow);
        player.worldObj.playSoundAtEntity(player, "bleach:bowfire", 0.4F, 1.0F);

      }
      


    }
    else if ((props.getCurrentEnergy() > 0.0F) && (props.getFaction() == 2) && (player.inventory.hasItem(BleachItems.seele)))
    {
      this.isSeele = true;
    }
  }
  







  @SideOnly(Side.CLIENT)
  public IIcon getIcon(ItemStack stack, int renderPass, EntityPlayer player, ItemStack usingItem, int useRemaining)
  {
    if (player.getItemInUse() == null) return this.itemIcon;
    int Pulling = stack.getMaxItemUseDuration() - useRemaining;
    if (getIsSeele())
    {
      if (Pulling >= 18)
      {

        return iconArray[2];
      }
      
      if (Pulling > 13)
      {

        return iconArray[1];
      }
      
      if (Pulling > 0)
      {
        return iconArray[0];
      }
    }
    

    return this.itemIcon;
  }
}
