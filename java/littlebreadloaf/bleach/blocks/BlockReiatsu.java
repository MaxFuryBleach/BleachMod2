package littlebreadloaf.bleach.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import littlebreadloaf.bleach.items.BleachItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;


public class BlockReiatsu
  extends Block
{
  public BlockReiatsu()
  {
    super(Material.iron);
    setCreativeTab(BleachItems.tabBleach);
    setBlockName("reiatsu_block");
    setHardness(5.0F);
    setResistance(15.0F);
    setStepSound(Block.soundTypeStone);
    setLightLevel(0.9F);
  }
  

  @SideOnly(Side.CLIENT)
  public void registerBlockIcons(IIconRegister icon)
  {
    this.blockIcon = icon.registerIcon("bleach".toLowerCase() + ":" + "reiatsu_block");
  }
}
