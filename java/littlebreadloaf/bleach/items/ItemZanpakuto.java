package littlebreadloaf.bleach.items;

import com.google.common.collect.Multimap;
import cpw.mods.fml.common.network.internal.FMLNetworkHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Random;
import littlebreadloaf.bleach.BleachMod;
import littlebreadloaf.bleach.api.Tools;
import littlebreadloaf.bleach.armor.Armor;
import littlebreadloaf.bleach.events.ExtendedPlayer;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.IAttribute;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;












public class ItemZanpakuto
  extends ItemSword
{
  private float weaponDamage;
  private final Item.ToolMaterial toolMaterial;
  public float damageBoost = 0.0F;
  public float robeboost = 0.0F;
  public float pantboost = 0.0F;
  public float sandalboost = 0.0F;
  public float waspboost = 0.0F;
  Random rand = new Random();
  
  public ItemZanpakuto(Item.ToolMaterial par2EnumToolReiatsu)
  {
    super(par2EnumToolReiatsu);
    this.toolMaterial = par2EnumToolReiatsu;
    this.maxStackSize = 1;
    setMaxDamage(par2EnumToolReiatsu.getMaxUses());
    setUnlocalizedName("zanpakuto");
    setCreativeTab(BleachItems.tabBleach);
    this.weaponDamage = (4.0F + par2EnumToolReiatsu.getDamageVsEntity());
  }
  

  public float func_150931_i()
  {
    return this.toolMaterial.getDamageVsEntity();
  }
  

  @SideOnly(Side.CLIENT)
  public void registerIcons(IIconRegister icon)
  {
    this.itemIcon = icon.registerIcon("bleach".toLowerCase() + ":" + "zanpakuto");
  }
  


  public float getDamage()
  {
    return this.weaponDamage;
  }
  








  public boolean hitEntity(ItemStack par1ItemStack, EntityLivingBase par2EntityLivingBase, EntityLivingBase par3EntityLivingBase)
  {
    EntityPlayer player = (EntityPlayer)par3EntityLivingBase;
    ExtendedPlayer props = (ExtendedPlayer)player.getExtendedProperties("BleachPlayer");
    
    ItemStack var9 = player.inventory.armorInventory[0];
    ItemStack var10 = player.inventory.armorInventory[1];
    ItemStack var11 = player.inventory.armorInventory[2];
    ItemStack var7 = player.inventory.armorInventory[3];
    

    if ((var9 != null) && ((var9.getItem() == Armor.Sandals) || (var9.getItem() == Armor.ArrancarShoes)))
    {
      this.sandalboost = 1.0F;
    }
    else if ((var9 != null) && (var9.getItem() == Armor.QuincyShoes))
    {
      this.sandalboost = -1.0F;
    }
    else
    {
      this.sandalboost = 0.0F;
    }
    

    if ((var10 != null) && ((var10.getItem() == Armor.ShiniPants) || (var10.getItem() == Armor.ArrancarPants)))
    {
      this.pantboost = 2.0F;
    }
    else if ((var10 != null) && (var10.getItem() == Armor.QuincyPants))
    {
      this.pantboost = -1.0F;
    }
    else
    {
      this.pantboost = 0.0F;
    }
    

    if ((var11 != null) && ((var11.getItem() == Armor.ShiniRobe) || (var11.getItem() == Armor.ArrancarPants)))
    {
      this.robeboost = 3.0F;
    }
    else if ((var11 != null) && (var11.getItem() == Armor.QuincyRobe))
    {
      this.robeboost = -2.0F;
    }
    else
    {
      this.robeboost = 0.0F;
    }
    if ((var7 != null) && (var7.getItem() == Armor.GolemHelmet) && (props.getFaction() == 1))
    {
      if ((!player.worldObj.isRemote) && (props.consumeEnergy(3)))
      {
        par2EntityLivingBase.setFire(6);
      }
    }
    if ((var7 != null) && (var7.getItem() == Armor.SnakeHelmet) && (props.getFaction() == 1))
    {
      if ((!player.worldObj.isRemote) && (props.consumeEnergy(3)))
      {
        par2EntityLivingBase.addPotionEffect(new PotionEffect(Potion.poison.id, 200, 1));
      }
    }
    
    if ((var7 != null) && (var7.getItem() == Armor.WaspHelmet) && (props.getFaction() == 1))
    {
      if (!player.worldObj.isRemote)
      {
        props.replenishEnergy(1);
      }
    }
    



    if (par2EntityLivingBase.getCreatureAttribute() == Tools.SPIRIT)
    {
      if ((!player.worldObj.isRemote) && (props.getFaction() == 1))
      {
        props.addSXP(3);
      }
      this.damageBoost = 2.0F;
    }
    else
    {
      if ((!player.worldObj.isRemote) && (props.getFaction() == 1))
      {
        props.addSXP(1);
      }
      this.damageBoost = 0.0F;
    }
    float damage = this.damageBoost + this.sandalboost + this.pantboost + this.robeboost;
    if ((damage > 0.0F) && (props.getFaction() == 1) && (damage <= par2EntityLivingBase.getHealth()))
    {
      par2EntityLivingBase.setHealth(par2EntityLivingBase.getHealth() - damage);
    }
    if (props.getFaction() == 2)
    {
      player.dropPlayerItemWithRandomChoice(par1ItemStack, false);
      player.destroyCurrentEquippedItem();
    }
    return true;
  }
  






  @SideOnly(Side.CLIENT)
  public boolean isFull3D()
  {
    return true;
  }
  


  public void onCreated(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
  {
    ExtendedPlayer props = (ExtendedPlayer)par3EntityPlayer.getExtendedProperties("BleachPlayer");
  }
  






  public EnumAction getItemUseAction(ItemStack par1ItemStack)
  {
    return EnumAction.block;
  }
  





  public int getMaxItemUseDuration(ItemStack par1ItemStack)
  {
    return 72000;
  }
  




  public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
  {
    par3EntityPlayer.setItemInUse(par1ItemStack, getMaxItemUseDuration(par1ItemStack));
    ExtendedPlayer props = (ExtendedPlayer)par3EntityPlayer.getExtendedProperties("BleachPlayer");
    
    if (par3EntityPlayer.isSneaking())
    {
      if ((props.getZName().length() <= 0) && (par1ItemStack.hasDisplayName()))
      {
        props.setZName(par1ItemStack.getDisplayName());
      }
      



      if (props.getZName().length() >= 0)
      {
        FMLNetworkHandler.openGui(par3EntityPlayer, BleachMod.instance, 0, par2World, (int)par3EntityPlayer.posX, (int)par3EntityPlayer.posY, (int)par3EntityPlayer.posZ);
        if (props.getZTex() == 5) {
          props.randomTexture();
        }
      }
      if (props.getPoints(9) >= 400)
      {
        int check = 1;
        for (int i = 1; i < 9; i++)
        {
          if (props.getPoints(i) > props.getPoints(check))
          {
            check = i;
          }
        }
        if (props.getPoints(check) >= 100)
        {
          props.setZType(check);
          
          int secondType = 23;
          for (int j = 1; j < 9; j++)
          {
            if ((props.getPoints(j) >= props.getPoints(secondType)) && (j != check))
            {
              secondType = j;
            }
          }
          
          if (props.getPoints(secondType) >= 100)
          {
            if (((check == 6) && (secondType == 7)) || ((check == 7) && (secondType == 6)))
            {
              props.setZType(10);
            }
            else if (((check == 7) && (secondType == 8)) || ((check == 8) && (secondType == 7)))
            {
              props.setZType(9);
            }
            else if (((check == 1) && (secondType == 2)) || ((check == 2) && (secondType == 1)))
            {
              props.setZType(12);
            }
            
          }
          

        }
        else
        {
          props.setZType(11);
        }
      }
    }
    



    return par1ItemStack;
  }
  

  @SideOnly(Side.CLIENT)
  public void onUsingTick(ItemStack stack, EntityPlayer player, int count)
  {
    ExtendedPlayer props = (ExtendedPlayer)player.getExtendedProperties("BleachPlayer");
    double var4; if ((props.getCurrentCap() >= 200) && (props.getPoints(9) >= 400) && (stack.hasDisplayName()) && (stack.getDisplayName().equals(props.getZName())) && (props.getFaction() == 1))
    {
      double var2 = player.posX;
      double var3 = player.posY;
      var4 = player.posZ;
    }
  }
  














  public int getItemEnchantability()
  {
    return this.toolMaterial.getEnchantability();
  }
  





  public String getToolMaterialName()
  {
    return this.toolMaterial.toString();
  }
  



  public Multimap getItemAttributeModifiers()
  {
    float damage = getDamage();
    Multimap multimap = super.getItemAttributeModifiers();
    multimap.put(SharedMonsterAttributes.attackDamage.getAttributeUnlocalizedName(), new AttributeModifier(field_111210_e, "Weapon modifier", damage, 0));
    return multimap;
  }
}
