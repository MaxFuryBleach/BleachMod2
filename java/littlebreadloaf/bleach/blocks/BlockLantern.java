package littlebreadloaf.bleach.blocks;

import littlebreadloaf.bleach.BleachIds;
import littlebreadloaf.bleach.tiles.TileLantern;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;





public class BlockLantern
  extends BleachBlockContainer
{
  public BlockLantern(Material material)
  {
    super(material);
    
    setBlockTextureName("lantern_item");
    setBlockName("lantern");
    setHardness(5.0F);
    setResistance(15.0F);
    setStepSound(Block.soundTypeGlass);
    setLightLevel(1.0F);
  }
  

  public int getRenderType()
  {
    return BleachIds.lanternRenderingID;
  }
  

  public boolean renderAsNormalBlock()
  {
    return false;
  }
  

  public boolean isOpaqueCube()
  {
    return false;
  }
  

  public TileEntity createNewTileEntity(World world, int metadata)
  {
    return new TileLantern();
  }
}
