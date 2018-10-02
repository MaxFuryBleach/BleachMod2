package littlebreadloaf.bleach.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;



public class ItemSoulQuartz
  extends Item
{
  public ItemSoulQuartz()
  {
    setCreativeTab(BleachItems.tabBleach);
    setUnlocalizedName("soul_quartz");
  }
  

  @SideOnly(Side.CLIENT)
  public void registerIcons(IIconRegister icon)
  {
    this.itemIcon = icon.registerIcon("bleach".toLowerCase() + ":" + "soul_quartz");
  }
}
