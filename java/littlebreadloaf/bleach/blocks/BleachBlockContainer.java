package littlebreadloaf.bleach.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;






public abstract class BleachBlockContainer
  extends BleachBlock
  implements ITileEntityProvider
{
  public BleachBlockContainer(Material mat) {}
  
  public void breakBlock(World world, int x, int y, int z, Block par5, int par6)
  {
    super.breakBlock(world, x, y, z, par5, par6);
    world.removeTileEntity(x, y, z);
  }
  





  public boolean onBlockEventReceived(World world, int x, int y, int z, int blockID, int eventID)
  {
    super.onBlockEventReceived(world, x, y, z, blockID, eventID);
    TileEntity tileentity = world.getTileEntity(x, y, z);
    return tileentity != null ? tileentity.receiveClientEvent(blockID, eventID) : false;
  }
}
