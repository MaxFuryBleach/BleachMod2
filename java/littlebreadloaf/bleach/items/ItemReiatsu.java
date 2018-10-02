package littlebreadloaf.bleach.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Random;
import littlebreadloaf.bleach.events.ExtendedPlayer;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemReiatsu
  extends Item
{
  public final int itemUseDuration;
  
  public ItemReiatsu()
  {
    setCreativeTab(BleachItems.tabBleach);
    setUnlocalizedName("reiatsu");
    this.itemUseDuration = 32;
  }
  


  @SideOnly(Side.CLIENT)
  public void registerIcons(IIconRegister icon)
  {
    this.itemIcon = icon.registerIcon("bleach".toLowerCase() + ":" + "reiatsu");
  }
  

  public int getMaxItemUseDuration(ItemStack par1ItemStack)
  {
    return 32;
  }
  

  public EnumAction getItemUseAction(ItemStack par1ItemStack)
  {
    return EnumAction.eat;
  }
  





  public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
  {
    par3EntityPlayer.setItemInUse(par1ItemStack, getMaxItemUseDuration(par1ItemStack));
    
    return par1ItemStack;
  }
  


  public ItemStack onEaten(ItemStack itemstack, World world, EntityPlayer player)
  {
    if (!world.isRemote)
    {
      ExtendedPlayer props = (ExtendedPlayer)player.getExtendedProperties("BleachPlayer");
      itemstack.stackSize -= 1;
      if (props.getFaction() == 2)
      {
        props.replenishEnergy(10);
      }
      else
      {
        props.replenishEnergy(5);
      }
      
      world.playSoundAtEntity(player, "random.burp", 0.5F, world.rand.nextFloat() * 0.1F + 0.9F);
    }
    
    return itemstack;
  }
}
