package littlebreadloaf.bleach.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import littlebreadloaf.bleach.items.BleachItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;


public class BlockWhiteSand
  extends Block
{
  public BlockWhiteSand()
  {
    super(Material.sand);
    setCreativeTab(BleachItems.tabBleach);
    setBlockName("white_sand");
    setHardness(2.0F);
    setResistance(6.0F);
    setStepSound(Block.soundTypeStone);
  }
  

  @SideOnly(Side.CLIENT)
  public void registerBlockIcons(IIconRegister icon)
  {
    this.blockIcon = icon.registerIcon("bleach".toLowerCase() + ":" + "white_sand");
  }
}
