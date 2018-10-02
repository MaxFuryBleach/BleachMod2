package littlebreadloaf.bleach.armor;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import littlebreadloaf.bleach.events.ExtendedPlayer;
import littlebreadloaf.bleach.items.BleachItems;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;


public class ItemBatHelmet
  extends ItemArmor
{
  public ItemBatHelmet(ItemArmor.ArmorMaterial par2, int par3, int par4)
  {
    super(par2, par3, par4);
    setUnlocalizedName("batmask");
    setCreativeTab(BleachItems.tabBleach);
    setTextureName("bleach:batmask");
  }
  

  @SideOnly(Side.CLIENT)
  public void registerIcons(IIconRegister par1RegisterIcon)
  {
    this.itemIcon = par1RegisterIcon.registerIcon("bleach".toLowerCase() + ":" + "batmask");
  }
  

  public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
  {
    return "bleach".toLowerCase() + ":textures/models/armor/bat_mask_1.png";
  }
  
  int depleteTimer = 40;
  
  public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack)
  {
    this.depleteTimer -= 1;
    ExtendedPlayer props = (ExtendedPlayer)player.getExtendedProperties("BleachPlayer");
    if (props.getCurrentEnergy() > 0.0F)
    {
      player.addPotionEffect(new PotionEffect(Potion.nightVision.getId(), 220, 0));
      if (this.depleteTimer <= 0)
      {
        this.depleteTimer = 40;
        if (!world.isRemote) {
          props.consumeEnergy(1);
        }
      }
    }
  }
}
