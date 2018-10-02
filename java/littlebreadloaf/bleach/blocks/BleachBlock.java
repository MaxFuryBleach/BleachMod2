package littlebreadloaf.bleach.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import littlebreadloaf.bleach.items.BleachItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;




public class BleachBlock
  extends Block
{
  public BleachBlock()
  {
    super(Material.rock);
    setCreativeTab(BleachItems.tabBleach);
  }
  



  @SideOnly(Side.CLIENT)
  public void registerBlockIcons(IIconRegister itemIcon)
  {
    this.blockIcon = itemIcon.registerIcon("bleach:" + getUnlocalizedName().substring(5));
  }
}
