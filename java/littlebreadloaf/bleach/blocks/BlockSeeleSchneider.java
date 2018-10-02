package littlebreadloaf.bleach.blocks;

import cpw.mods.fml.common.FMLLog;
import java.util.ArrayList;
import java.util.Random;
import littlebreadloaf.bleach.BleachIds;
import littlebreadloaf.bleach.items.BleachItems;
import littlebreadloaf.bleach.tiles.TileSeeleSchneider;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class BlockSeeleSchneider
  extends BleachBlockContainer
{
  public BlockSeeleSchneider(Material mat)
  {
    super(mat);
    setCreativeTab(null);
    
    setBlockTextureName("seeleblock");
    setHardness(1.0F);
    setResistance(1.0F);
    setStepSound(Block.soundTypeMetal);
    setLightLevel(0.9F);
    
    setBlockBounds(0.4375F, 0.0F, 0.4375F, 0.5625F, 1.5F, 0.5625F);
  }
  

  public int getRenderType()
  {
    return BleachIds.seeleSchneiderRenderingID;
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
    return new TileSeeleSchneider();
  }
  




  public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int par6, float par7, float par8, float par9)
  {
    if (player.getCurrentEquippedItem() == null)
    {
      dropBlockAsItem(world, x, y, z, 1, 0);
      world.setBlockToAir(x, y, z);
    }
    return false;
  }
  





  public void onBlockPreDestroy(World world, int i, int j, int k, int meta)
  {
    TileSeeleSchneider tile = (TileSeeleSchneider)world.getTileEntity(i, j, k);
    

    if (tile.isMain)
    {
      for (int var = 0; var < TileSeeleSchneider.magicSquare.size(); var++)
      {
        int x = ((ChunkCoordinates)TileSeeleSchneider.magicSquare.get(var)).posX;
        int y = ((ChunkCoordinates)TileSeeleSchneider.magicSquare.get(var)).posY;
        int z = ((ChunkCoordinates)TileSeeleSchneider.magicSquare.get(var)).posZ;
        if ((x == i) && (y == j) && (z == k))
        {
          TileSeeleSchneider.magicSquare.remove(var);
        }
      }
    }
    else {
      tile = tile.getMainBlockTile();
      if (tile == null)
      {
        FMLLog.info("[BleachMod] Seeleschneider tile null", new Object[0]);
        return;
      }
      for (int var = 0; var < TileSeeleSchneider.magicSquare.size(); var++)
      {
        int x = ((ChunkCoordinates)TileSeeleSchneider.magicSquare.get(var)).posX;
        int y = ((ChunkCoordinates)TileSeeleSchneider.magicSquare.get(var)).posY;
        int z = ((ChunkCoordinates)TileSeeleSchneider.magicSquare.get(var)).posZ;
        if ((x == tile.xCoord) && (y == tile.yCoord) && (z == tile.zCoord))
        {
          TileSeeleSchneider.magicSquare.remove(var);
        }
      }
      tile.isMain = false;
    }
  }
  




  public Item getItemDropped(int par1, Random par2Random, int par3)
  {
    return BleachItems.seele;
  }
  





  public int damageDropped(int par1)
  {
    return 0;
  }
  






  public void onNeighborBlockChange(World world, int x, int y, int z, Block block)
  {
    if (world.getBlock(x, y - 1, z) == Blocks.air)
    {
      dropBlockAsItem(world, x, y, z, 1, 0);
      world.setBlockToAir(x, y, z);
    }
  }
  

  public ItemStack getPickBlock(MovingObjectPosition target, World world, int x, int y, int z)
  {
    return new ItemStack(BleachItems.seele, 1, 1);
  }
}
