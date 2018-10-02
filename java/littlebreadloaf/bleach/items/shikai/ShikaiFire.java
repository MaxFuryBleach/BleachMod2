package littlebreadloaf.bleach.items.shikai;

import com.google.common.collect.Multimap;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import java.util.Random;
import littlebreadloaf.bleach.Names;
import littlebreadloaf.bleach.api.Tools;
import littlebreadloaf.bleach.armor.Armor;
import littlebreadloaf.bleach.events.ExtendedPlayer;
import littlebreadloaf.bleach.items.BleachItems;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.IAttribute;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntitySmallFireball;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.IIcon;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;




public class ShikaiFire
  extends ItemShikai
{
  public static IIcon[] icons;
  private static final String[] ICON = Names.ShikaiFire_UnlocalizedName;
  
  private float weaponDamage;
  private final Item.ToolMaterial toolMaterial;
  public float damageBoost = 0.0F;
  public float robeboost = 0.0F;
  public float pantboost = 0.0F;
  public float sandalboost = 0.0F;
  public float waspboost = 0.0F;
  
  public ShikaiFire(Item.ToolMaterial material)
  {
    super(material);
    this.toolMaterial = material;
    this.maxStackSize = 1;
    setMaxDamage(material.getMaxUses());
    setCreativeTab(null);
    setHasSubtypes(true);
    this.weaponDamage = (5.0F + material.getDamageVsEntity());
  }
  
  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack itemStack, EntityPlayer player, List data, boolean b)
  {
    if (itemStack.getItemDamage() == 2)
    {
      data.add("Jrich144");
    }
    else if (itemStack.getItemDamage() == 3)
    {
      data.add("SuperToby12");
    }
    else if (itemStack.getItemDamage() == 4)
    {
      data.add("JohnJoyce");
    }
  }
  


  public String getUnlocalizedName(ItemStack itemstack)
  {
    return Names.ShikaiFire_UnlocalizedName[itemstack.getItemDamage()];
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
    par2EntityLivingBase.setFire(10);
    
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
  





  public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10)
  {
    if (par7 == 0)
    {
      par5--;
    }
    
    if (par7 == 1)
    {
      par5++;
    }
    
    if (par7 == 2)
    {
      par6--;
    }
    
    if (par7 == 3)
    {
      par6++;
    }
    
    if (par7 == 4)
    {
      par4--;
    }
    
    if (par7 == 5)
    {
      par4++;
    }
    
    if (!par2EntityPlayer.canPlayerEdit(par4, par5, par6, par7, par1ItemStack))
    {
      return false;
    }
    

    Block var11 = par3World.getBlock(par4, par5, par6);
    
    if (var11 == Blocks.air)
    {
      par3World.playSoundEffect(par4 + 0.5D, par5 + 0.5D, par6 + 0.5D, "fire.ignite", 1.0F, itemRand.nextFloat() * 0.4F + 0.8F);
      par3World.setBlock(par4, par5, par6, Blocks.fire);
    }
    
    return true;
  }
  






  public void onPlayerStoppedUsing(ItemStack var1, World var2, EntityPlayer var3, int var4)
  {
    ExtendedPlayer props = (ExtendedPlayer)var3.getExtendedProperties("BleachPlayer");
    int var6 = getMaxItemUseDuration(var1) - var4;
    float var7 = var6 / 20.0F;
    var7 = (var7 * var7 + var7 * 2.0F) / 3.0F;
    
    if (var7 < 0.1D)
    {
      return;
    }
    
    if (var7 > 1.0F)
    {
      var7 = 1.0F;
      
      if (!var2.isRemote)
      {
        EntitySmallFireball Fireball = new EntitySmallFireball(var2, var3, 5.0D * Math.cos(-var3.rotationPitch * 0.017453292519943295D) * Math.sin(-var3.rotationYaw * 0.017453292519943295D), 5.0D * Math.sin(-var3.rotationPitch * 0.017453292519943295D), 5.0D * Math.cos(-var3.rotationPitch * 0.017453292519943295D) * Math.cos(-var3.rotationYaw * 0.017453292519943295D));
        Vec3 look = var3.getLook(1.0F);
        Fireball.posX = (var3.posX + look.xCoord * 0.800000011920929D);
        Fireball.posY = (var3.posY + 0.6000000238418579D);
        Fireball.posZ = (var3.posZ + look.zCoord * 0.800000011920929D);
        var2.playSoundAtEntity(var3, "mob.ghast.fireball", 1.0F, 1.0F);
        var2.spawnEntityInWorld(Fireball);
        props.consumeEnergy(20);
      }
      
      var3.swingItem();
    }
  }
  



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
        player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 40, 0));
        if (props.getZType() != 1) {
          props.deactivate(par1ItemStack.getItem());
        }
      }
    }
  }
}
