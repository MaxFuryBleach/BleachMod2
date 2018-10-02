package littlebreadloaf.bleach.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;



public class ItemSoulCloth
  extends Item
{
  public ItemSoulCloth()
  {
    setCreativeTab(BleachItems.tabBleach);
    setUnlocalizedName("soulcloth");
  }
  

  @SideOnly(Side.CLIENT)
  public void registerIcons(IIconRegister icon)
  {
    this.itemIcon = icon.registerIcon("bleach".toLowerCase() + ":" + "soulcloth");
  }
}
