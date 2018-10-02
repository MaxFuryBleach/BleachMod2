package littlebreadloaf.bleach.items;

import com.google.common.collect.Multimap;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Random;
import littlebreadloaf.bleach.api.Tools;
import littlebreadloaf.bleach.events.ExtendedPlayer;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.IAttribute;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.world.World;




public class ItemShinai
  extends ItemSword
{
  private float weaponDamage;
  private final Item.ToolMaterial toolMaterial;
  Random rand = new Random();
  
  public ItemShinai(Item.ToolMaterial par2EnumToolReiatsu)
  {
    super(par2EnumToolReiatsu);
    this.toolMaterial = par2EnumToolReiatsu;
    this.maxStackSize = 1;
    setMaxDamage(par2EnumToolReiatsu.getMaxUses());
    setCreativeTab(BleachItems.tabBleach);
    setUnlocalizedName("shinai");
    this.weaponDamage = 1.0F;
  }
  

  public float func_150931_i()
  {
    return this.toolMaterial.getDamageVsEntity();
  }
  

  @SideOnly(Side.CLIENT)
  public void registerIcons(IIconRegister icon)
  {
    this.itemIcon = icon.registerIcon("bleach".toLowerCase() + ":" + "shinai");
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
    




    if (par2EntityLivingBase.getCreatureAttribute() == Tools.SPIRIT)
    {
      if ((!player.worldObj.isRemote) && (props.getFaction() == 1))
      {
        props.addSXP(2);
      }
      

    }
    else if ((!player.worldObj.isRemote) && (props.getFaction() == 1))
    {
      props.addSXP(1);
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
  




  public boolean canHarvestBlock(Block par1Block)
  {
    return par1Block == Blocks.web;
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
