package littlebreadloaf.bleach.armor;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import littlebreadloaf.bleach.BleachMod;
import littlebreadloaf.bleach.items.BleachItems;
import littlebreadloaf.bleach.proxies.CommonProxy;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;

public class ItemSnakeHelmet
  extends ItemArmor
{
  public ItemSnakeHelmet(ItemArmor.ArmorMaterial par2, int par3, int par4)
  {
    super(par2, par3, par4);
    setUnlocalizedName("snakemask");
    setTextureName("bleach:snakemask");
    setCreativeTab(BleachItems.tabBleach);
  }
  

  @SideOnly(Side.CLIENT)
  public void registerIcons(IIconRegister par1RegisterIcon)
  {
    this.itemIcon = par1RegisterIcon.registerIcon("bleach".toLowerCase() + ":" + "snakemask");
  }
  

  public String getArmorTexture(ItemStack stack, Entity entity, int slot, String layer)
  {
    return "bleach".toLowerCase() + ":textures/models/armor/snake_mask_1.png";
  }
  

  @SideOnly(Side.CLIENT)
  public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, int armorSlot)
  {
    ModelBiped armorModel = null;
    if (itemStack != null)
    {
      armorModel = BleachMod.proxy.getArmorModel(2);
      if (armorModel != null)
      {
        armorModel.bipedHead.showModel = (armorSlot == 0);
        armorModel.bipedHeadwear.showModel = (armorSlot == 0);
        armorModel.bipedBody.showModel = ((armorSlot == 1) || (armorSlot == 2));
        armorModel.bipedRightArm.showModel = (armorSlot == 1);
        armorModel.bipedLeftArm.showModel = (armorSlot == 1);
        armorModel.bipedRightLeg.showModel = ((armorSlot == 2) || (armorSlot == 3));
        armorModel.bipedLeftLeg.showModel = ((armorSlot == 2) || (armorSlot == 3));
        
        armorModel.isSneak = entityLiving.isSneaking();
        armorModel.isRiding = entityLiving.isRiding();
        armorModel.isChild = entityLiving.isChild();
        armorModel.heldItemRight = (entityLiving.getEquipmentInSlot(0) != null ? 1 : 0);
        if ((entityLiving instanceof EntityPlayer))
        {
          armorModel.aimedBow = (((EntityPlayer)entityLiving).getItemInUseDuration() > 2);
        }
        return armorModel;
      }
    }
    
    return armorModel;
  }
}
