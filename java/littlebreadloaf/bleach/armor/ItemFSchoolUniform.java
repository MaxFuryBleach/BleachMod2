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
import net.minecraft.init.Items;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;

public class ItemFSchoolUniform
  extends ItemArmor
{
  public ItemFSchoolUniform(ItemArmor.ArmorMaterial par2, int par3, int armorType)
  {
    super(par2, par3, armorType);
    setCreativeTab(BleachItems.tabBleach);
    if (armorType == 1)
    {
      setTextureName("bleach:facademy_top");
    }
    else if (armorType == 2)
    {
      setTextureName("bleach:facademy_bottom");
    }
  }
  

  @SideOnly(Side.CLIENT)
  public void registerIcons(IIconRegister par1RegisterIcon)
  {
    if (this == Armor.FemaleSchoolTop)
    {
      this.itemIcon = par1RegisterIcon.registerIcon("bleach".toLowerCase() + ":" + "fschool_top");
    }
    
    if (this == Armor.FemaleSchoolBottom)
    {
      this.itemIcon = par1RegisterIcon.registerIcon("bleach".toLowerCase() + ":" + "fschool_bottom");
    }
  }
  





  public String getArmorTexture(ItemStack stack, Entity entity, int slot, String layer)
  {
    if (stack.getItem() == Armor.FemaleSchoolTop)
    {
      return "bleach".toLowerCase() + ":textures/models/armor/female_school_1.png";
    }
    if (stack.getItem() == Armor.FemaleSchoolBottom)
    {
      return "bleach".toLowerCase() + ":textures/models/armor/female_school_2.png";
    }
    

    return null;
  }
  





  @SideOnly(Side.CLIENT)
  public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, int armorSlot)
  {
    ModelBiped armorModel = BleachMod.proxy.getArmorModel(0);
    if (itemStack != null)
    {
      int type = ((ItemArmor)itemStack.getItem()).armorType;
      
      if ((type == 1) || (type == 3)) {
        armorModel = BleachMod.proxy.getArmorModel(0);
      } else {
        armorModel = BleachMod.proxy.getArmorModel(5);
      }
      
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
        if (((entityLiving instanceof EntityPlayer)) && (entityLiving.getHeldItem() != null))
        {

          if ((entityLiving.getHeldItem().getItem() == Items.bow) || (entityLiving.getHeldItem().getItem() == BleachItems.quincybow) || (entityLiving.getHeldItem().getItem() == BleachItems.quincyweb))
          {
            armorModel.aimedBow = (((EntityPlayer)entityLiving).getItemInUseDuration() > 2);


          }
          else if (((EntityPlayer)entityLiving).getItemInUseDuration() > 0) {
            armorModel.heldItemRight = 3;
          }
        }
      }
    }
    

    return armorModel;
  }
}
