package littlebreadloaf.bleach.items.shikai;

import com.google.common.collect.Multimap;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import littlebreadloaf.bleach.Names;
import littlebreadloaf.bleach.api.Tools;
import littlebreadloaf.bleach.armor.Armor;
import littlebreadloaf.bleach.events.ExtendedPlayer;
import littlebreadloaf.bleach.items.BleachItems;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.IAttribute;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;



public class ShikaiNormal
  extends ItemShikai
{
  public static IIcon[] icons;
  private static final String[] ICON = Names.ShikaiNormal_UnlocalizedName;
  
  private float weaponDamage;
  private final Item.ToolMaterial toolMaterial;
  public float damageBoost = 0.0F;
  public float robeboost = 0.0F;
  public float pantboost = 0.0F;
  public float sandalboost = 0.0F;
  
  public ShikaiNormal(Item.ToolMaterial material)
  {
    super(material);
    this.toolMaterial = material;
    this.maxStackSize = 1;
    setMaxDamage(material.getMaxUses());
    setCreativeTab(null);
    setHasSubtypes(true);
    this.weaponDamage = (5.0F + material.getDamageVsEntity());
  }
  



  public String getUnlocalizedName(ItemStack itemstack)
  {
    return Names.ShikaiNormal_UnlocalizedName[itemstack.getItemDamage()];
  }
  
  public float getDamage()
  {
    return this.weaponDamage;
  }
  


  @SideOnly(Side.CLIENT)
  public IIcon getIconFromDamage(int damage)
  {
    return icons[damage];
  }
  

  @SideOnly(Side.CLIENT)
  public void registerIcons(IIconRegister icon)
  {
    icons = new IIcon[ICON.length];
    
    for (int i = 0; i < icons.length; i++)
    {
      icons[i] = icon.registerIcon("bleach".toLowerCase() + ":" + ICON[i]);
    }
  }
  











  public float func_150931_i()
  {
    return this.toolMaterial.getDamageVsEntity();
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
    if (!player.worldObj.isRemote)
    {
      par2EntityLivingBase.motionY += 0.2000000059604645D;
    }
    

    if (par2EntityLivingBase.getCreatureAttribute() == Tools.SPIRIT)
    {
      if ((!player.worldObj.isRemote) && (props.getFaction() == 1))
      {
        props.addSXP(5);
      }
      this.damageBoost = 2.0F;
    }
    else
    {
      if ((!player.worldObj.isRemote) && (props.getFaction() == 1))
      {
        props.addSXP(2);
      }
      this.damageBoost = 0.0F;
    }
    float damage = this.damageBoost + this.sandalboost + this.pantboost + this.robeboost;
    if ((damage > 0.0F) && (props.getFaction() == 1) && (damage <= par2EntityLivingBase.getHealth()))
    {
      par2EntityLivingBase.attackEntityFrom(DamageSource.generic, damage);
    }
    return true;
  }
  





  @SideOnly(Side.CLIENT)
  public boolean isFull3D()
  {
    return true;
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
    
    return par1ItemStack;
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
  







  public void onPlayerStoppedUsing(ItemStack var1, World var2, EntityPlayer var3, int var4) {}
  







  public boolean isBookEnchantable(ItemStack itemstack1, ItemStack itemstack2)
  {
    return false;
  }
  
  int shikaiTimer = 40;
  




  public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5)
  {
    if ((par3Entity instanceof EntityPlayer))
    {
      EntityPlayer player = (EntityPlayer)par3Entity;
      ExtendedPlayer props = (ExtendedPlayer)player.getExtendedProperties("BleachPlayer");
      ItemStack heldItem = player.getCurrentEquippedItem();
      ItemStack var13 = new ItemStack(BleachItems.zanpakuto, 1);
      
      this.shikaiTimer -= 1;
      if ((this.shikaiTimer <= 0) && (!player.worldObj.isRemote))
      {
        this.shikaiTimer = 40;
        props.consumeEnergy(3);
      }
      
      if ((heldItem != null) && (heldItem == par1ItemStack))
      {
        if (props.getCurrentEnergy() <= 0.0F)
        {
          props.deactivate(par1ItemStack.getItem());
        }
        heldItem.setItemDamage(props.getZTex());
        player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 40, 1));
        player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 40, 0));
        

        if (props.getZType() != 11) {
          props.deactivate(par1ItemStack.getItem());
        }
      }
    }
  }
}
