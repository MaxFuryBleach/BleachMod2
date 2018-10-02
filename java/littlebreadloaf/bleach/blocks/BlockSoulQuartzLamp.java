package littlebreadloaf.bleach.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import littlebreadloaf.bleach.items.BleachItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;


public class BlockSoulQuartzLamp
  extends Block
{
  public BlockSoulQuartzLamp()
  {
    super(Material.rock);
    setCreativeTab(BleachItems.tabBleach);
    setBlockName("soul_quartz_lamp");
    setHardness(3.0F);
    setResistance(10.0F);
    setStepSound(Block.soundTypeStone);
    setLightLevel(1.0F);
  }
  

  @SideOnly(Side.CLIENT)
  public void registerBlockIcons(IIconRegister icon)
  {
    this.blockIcon = icon.registerIcon("bleach".toLowerCase() + ":" + "soul_quartz_lamp");
  }
}
