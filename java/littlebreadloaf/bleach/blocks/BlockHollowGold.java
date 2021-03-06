package littlebreadloaf.bleach.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import littlebreadloaf.bleach.items.BleachItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;


public class BlockHollowGold
  extends Block
{
  public BlockHollowGold()
  {
    super(Material.rock);
    setCreativeTab(BleachItems.tabBleach);
    setBlockName("hollow_gold");
    setHardness(6.0F);
    setResistance(8.0F);
    setStepSound(Block.soundTypeStone);
  }
  

  @SideOnly(Side.CLIENT)
  public void registerBlockIcons(IIconRegister icon)
  {
    this.blockIcon = icon.registerIcon("bleach".toLowerCase() + ":" + "hollow_gold");
  }
}
