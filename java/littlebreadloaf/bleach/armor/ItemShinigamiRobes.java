package littlebreadloaf.bleach.armor;

import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import littlebreadloaf.bleach.BleachMod;
import littlebreadloaf.bleach.events.ExtendedPlayer;
import littlebreadloaf.bleach.items.BleachItems;
import littlebreadloaf.bleach.network.ServerSyncMessage;
import littlebreadloaf.bleach.proxies.CommonProxy;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Items;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemShinigamiRobes extends ItemArmor
{
  public ItemShinigamiRobes(ItemArmor.ArmorMaterial par2, int par3, int par4)
  {
    super(par2, par3, par4);
    setCreativeTab(BleachItems.tabBleach);
    if (par4 == 1)
    {
      setTextureName("bleach:shinirobe");
    }
    else if (par4 == 2)
    {
      setTextureName("bleach:shinipants");
    }
    else if (par4 == 3)
    {
      setTextureName("bleach:sandals");
    }
  }
  

  @SideOnly(Side.CLIENT)
  public void registerIcons(IIconRegister par1RegisterIcon)
  {
    if (this == Armor.ShiniRobe)
    {

      this.itemIcon = par1RegisterIcon.registerIcon("bleach".toLowerCase() + ":" + "shinirobe");
    }
    
    if (this == Armor.ShiniPants)
    {
      this.itemIcon = par1RegisterIcon.registerIcon("bleach".toLowerCase() + ":" + "shinipants");
    }
    
    if (this == Armor.Sandals)
    {
      this.itemIcon = par1RegisterIcon.registerIcon("bleach".toLowerCase() + ":" + "sandals");
    }
  }
  



  public String getArmorTexture(ItemStack stack, Entity entity, int slot, String layer)
  {
    if ((stack.getItem() == Armor.ShiniRobe) || (stack.getItem() == Armor.Sandals))
    {

      return "bleach".toLowerCase() + ":textures/models/armor/shinigami_1.png";
    }
    if (stack.getItem() == Armor.ShiniPants)
    {
      return "bleach".toLowerCase() + ":textures/models/armor/shinigami_2.png";
    }
    

    return null;
  }
  


  int replenishTimer = 200;
  
  public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack)
  {
    if (!world.isRemote)
    {
      this.replenishTimer -= 1;
      ExtendedPlayer props = (ExtendedPlayer)player.getExtendedProperties("BleachPlayer");
      
      if ((this.replenishTimer <= 0) && (props.getFaction() == 1))
      {


        props.replenishEnergy(2);
        if ((player instanceof EntityPlayerMP))
          BleachMod.network.sendTo(new ServerSyncMessage(player), (EntityPlayerMP)player);
        this.replenishTimer = 200;
      }
    }
  }
  




  @SideOnly(Side.CLIENT)
  public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, int armorSlot)
  {
    ModelBiped armorModel = null;
    if (itemStack != null)
    {
      armorModel = BleachMod.proxy.getArmorModel(0);
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
        
        return armorModel;
      }
    }
    
    return armorModel;
  }
}
