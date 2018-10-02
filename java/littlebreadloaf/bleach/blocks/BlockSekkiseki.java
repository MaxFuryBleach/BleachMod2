package littlebreadloaf.bleach.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import littlebreadloaf.bleach.items.BleachItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;


public class BlockSekkiseki
  extends Block
{
  public BlockSekkiseki(int id)
  {
    super(Material.iron);
    setCreativeTab(BleachItems.tabBleach);
    setBlockName("sekkiseki");
    setHardness(10.0F);
    setResistance(30.0F);
    setStepSound(Block.soundTypeStone);
  }
  

  @SideOnly(Side.CLIENT)
  public void registerBlockIcons(IIconRegister icon)
  {
    this.blockIcon = icon.registerIcon("bleach".toLowerCase() + ":" + "sekkiseki");
  }
}
