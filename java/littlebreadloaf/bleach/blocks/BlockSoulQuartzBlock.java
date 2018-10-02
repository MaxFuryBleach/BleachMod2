package littlebreadloaf.bleach.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import littlebreadloaf.bleach.items.BleachItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;


public class BlockSoulQuartzBlock
  extends Block
{
  public BlockSoulQuartzBlock()
  {
    super(Material.rock);
    setCreativeTab(BleachItems.tabBleach);
    setBlockName("soul_quartz_block");
    setHardness(4.0F);
    setResistance(10.0F);
    setStepSound(Block.soundTypeStone);
  }
  

  @SideOnly(Side.CLIENT)
  public void registerBlockIcons(IIconRegister icon)
  {
    this.blockIcon = icon.registerIcon("bleach".toLowerCase() + ":" + "soul_quartz_block");
  }
}
