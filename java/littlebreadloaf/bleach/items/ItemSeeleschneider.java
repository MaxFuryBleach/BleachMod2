package littlebreadloaf.bleach.items;

import com.google.common.collect.Multimap;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import littlebreadloaf.bleach.api.Tools;
import littlebreadloaf.bleach.armor.Armor;
import littlebreadloaf.bleach.blocks.BleachBlocks;
import littlebreadloaf.bleach.events.ExtendedPlayer;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.IAttribute;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.entity.player.PlayerCapabilities;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;


public class ItemSeeleschneider
  extends ItemSword
{
  @SideOnly(Side.CLIENT)
  public static IIcon[] icons;
  private float weaponDamage;
  private final Item.ToolMaterial toolMaterial;
  public float damageBoost = 0.0F;
  public float robeboost = 0.0F;
  public float pantboost = 0.0F;
  public float sandalboost = 0.0F;
  
  private static final String[] ICON = { "seele", "seele2" };
  

  public ItemSeeleschneider(Item.ToolMaterial material)
  {
    super(material);
    this.toolMaterial = material;
    this.maxStackSize = 1;
    setMaxDamage(material.getMaxUses());
    setCreativeTab(BleachItems.tabBleach);
    setHasSubtypes(true);
    this.weaponDamage = (2.0F + material.getDamageVsEntity());
  }
  



  public float func_150931_i()
  {
    return this.toolMaterial.getDamageVsEntity();
  }
  

  public float getDamage()
  {
    return this.weaponDamage;
  }
  


  public String getUnlocalizedName(ItemStack itemstack)
  {
    return littlebreadloaf.bleach.Names.Seeleschneider_UnlocalizedName[itemstack.getItemDamage()];
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
  






  public ItemStack onItemRightClick(ItemStack item, World par2World, EntityPlayer player)
  {
    ExtendedPlayer props = (ExtendedPlayer)player.getExtendedProperties("BleachPlayer");
    if ((item.getItemDamage() == 0) && (!player.worldObj.isRemote) && (props.getCurrentEnergy() >= 70.0F / props.getCurrentCap()) && (props.getFaction() == 2))
    {
      props.consumeEnergy(70);
      item.setItemDamage(1);
    }
    return item;
  }
  

  public boolean onItemUse(ItemStack item, EntityPlayer player, World world, int x, int y, int z, int side, float par8, float par9, float f)
  {
    if (!world.isRemote)
    {
      if ((item.getItemDamage() == 1) && (side == 1) && (World.doesBlockHaveSolidTopSurface(world, x, y, z)))
      {
        world.setBlock(x, y + 1, z, BleachBlocks.seeleSchneiderBlock);
        if (!player.capabilities.isCreativeMode)
        {
          player.getCurrentEquippedItem().stackSize -= 1;
        }
      }
    }
    return true;
  }
  





  public boolean hitEntity(ItemStack par1ItemStack, EntityLivingBase par2EntityLivingBase, EntityLivingBase par3EntityLivingBase)
  {
    EntityPlayer player = (EntityPlayer)par3EntityLivingBase;
    ExtendedPlayer props = (ExtendedPlayer)player.getExtendedProperties("BleachPlayer");
    
    ItemStack var9 = player.inventory.armorInventory[0];
    ItemStack var10 = player.inventory.armorInventory[1];
    ItemStack var11 = player.inventory.armorInventory[2];
    ItemStack var7 = player.inventory.armorInventory[3];
    ItemStack var33 = player.inventory.getCurrentItem();
    
    if ((var33 != null) && (var33.getItem() == BleachItems.seele) && (var33.getItemDamage() == 1))
    {

      if ((var9 != null) && (var9.getItem() == Armor.QuincyShoes))
      {
        this.sandalboost = 1.0F;
      }
      else {
        this.sandalboost = 0.0F;
      }
      
      if ((var10 != null) && (var10.getItem() == Armor.QuincyPants))
      {
        this.pantboost = 1.0F;
      }
      else {
        this.pantboost = 0.0F;
      }
      
      if ((var11 != null) && (var11.getItem() == Armor.QuincyRobe))
      {
        this.robeboost = 1.0F;
      }
      else {
        this.robeboost = 0.0F;
      }
      
      if (par2EntityLivingBase.getCreatureAttribute() == Tools.SPIRIT)
      {
        if ((!player.worldObj.isRemote) && (props.getFaction() == 2))
        {
          props.addSXP(3);
        }
        this.damageBoost = 4.0F;
      }
      else {
        if ((!player.worldObj.isRemote) && (props.getFaction() == 2))
        {
          props.addSXP(1);
        }
        this.damageBoost = 0.0F;
      }
      
      float damage = this.damageBoost + this.sandalboost + this.pantboost + this.robeboost;
      if ((damage > 0.0F) && (props.getFaction() == 2) && (var33.getItemDamage() == 1))
      {
        par2EntityLivingBase.setHealth(par2EntityLivingBase.getHealth() - damage);
      }
    }
    

    return true;
  }
  

  public EnumAction getItemUseAction(ItemStack par1ItemStack)
  {
    return EnumAction.block;
  }
  

  public Multimap getItemAttributeModifiers()
  {
    float damage = getDamage();
    Multimap multimap = super.getItemAttributeModifiers();
    multimap.put(SharedMonsterAttributes.attackDamage.getAttributeUnlocalizedName(), new AttributeModifier(field_111210_e, "Weapon modifier", damage, 0));
    return multimap;
  }
}
