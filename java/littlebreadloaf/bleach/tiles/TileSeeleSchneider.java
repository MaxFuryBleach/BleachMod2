package littlebreadloaf.bleach.tiles;

import cpw.mods.fml.common.FMLLog;
import java.util.ArrayList;
import littlebreadloaf.bleach.blocks.BleachBlocks;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.world.World;






public class TileSeeleSchneider
  extends TileBleach
{
  public static ArrayList<ChunkCoordinates> magicSquare = new ArrayList();
  
  public boolean isMain = false;
  public int side = -1;
  
  public int tick = 0;
  
  public ChunkCoordinates mainBlock = new ChunkCoordinates(this.xCoord, this.yCoord, this.zCoord);
  
  private boolean init = false;
  
  public float rotation = 0.0F;
  public float alpha = 0.0F;
  

  public void updateEntity()
  {
    this.tick += 1;
    this.rotation += 2.5F;
    if (this.rotation >= 360.0F) { this.rotation -= 360.0F;
    }
    double radius = Math.sin(Math.toRadians(this.rotation * 2.0F)) / 4.0D + 1.0D;
    this.alpha = (0.8F + (float)Math.sin(Math.toRadians(this.rotation * 3.0F)) / 8.0F);
    
    if (!this.worldObj.isRemote)
    {
      if (!this.init)
      {
        checkForShape();
        this.init = true;
      }
    }
  }
  












  public void checkForShape()
  {
    for (int x = 3; x <= 16; x++)
    {
      if ((this.worldObj.getBlock(this.xCoord + x, this.yCoord, this.zCoord) == BleachBlocks.seeleSchneiderBlock) && (this.worldObj.getBlock(this.xCoord, this.yCoord, this.zCoord + x) == BleachBlocks.seeleSchneiderBlock) && (this.worldObj.getBlock(this.xCoord + x, this.yCoord, this.zCoord + x) == BleachBlocks.seeleSchneiderBlock))
      {


        setBlockMain(this.xCoord + x, this.yCoord, this.zCoord, this.xCoord, this.yCoord, this.zCoord);
        setBlockMain(this.xCoord, this.yCoord, this.zCoord + x, this.xCoord, this.yCoord, this.zCoord);
        setBlockMain(this.xCoord + x, this.yCoord, this.zCoord + x, this.xCoord, this.yCoord, this.zCoord);
        
        setMain(x);
        return; }
      if ((this.worldObj.getBlock(this.xCoord - x, this.yCoord, this.zCoord) == BleachBlocks.seeleSchneiderBlock) && (this.worldObj.getBlock(this.xCoord, this.yCoord, this.zCoord - x) == BleachBlocks.seeleSchneiderBlock) && (this.worldObj.getBlock(this.xCoord - x, this.yCoord, this.zCoord - x) == BleachBlocks.seeleSchneiderBlock))
      {


        setBlockMain(this.xCoord - x, this.yCoord, this.zCoord, this.xCoord - x, this.yCoord, this.zCoord - x);
        setBlockMain(this.xCoord, this.yCoord, this.zCoord - x, this.xCoord - x, this.yCoord, this.zCoord - x);
        setBlockMain(this.xCoord, this.yCoord, this.zCoord - x, this.xCoord - x, this.yCoord, this.zCoord - x);
        
        TileSeeleSchneider tile = (TileSeeleSchneider)this.worldObj.getTileEntity(this.xCoord - x, this.yCoord, this.zCoord - x);
        tile.setMain(x);
        return;
      }
      if ((this.worldObj.getBlock(this.xCoord - x, this.yCoord, this.zCoord) == BleachBlocks.seeleSchneiderBlock) && (this.worldObj.getBlock(this.xCoord, this.yCoord, this.zCoord + x) == BleachBlocks.seeleSchneiderBlock) && (this.worldObj.getBlock(this.xCoord - x, this.yCoord, this.zCoord + x) == BleachBlocks.seeleSchneiderBlock))
      {



        setBlockMain(this.xCoord - x, this.yCoord, this.zCoord, this.xCoord - x, this.yCoord, this.zCoord);
        setBlockMain(this.xCoord, this.yCoord, this.zCoord, this.xCoord - x, this.yCoord, this.zCoord);
        setBlockMain(this.xCoord - x, this.yCoord, this.zCoord + x, this.xCoord - x, this.yCoord, this.zCoord);
        
        TileSeeleSchneider tile = (TileSeeleSchneider)this.worldObj.getTileEntity(this.xCoord - x, this.yCoord, this.zCoord);
        tile.setMain(x);
        return; }
      if ((this.worldObj.getBlock(this.xCoord + x, this.yCoord, this.zCoord) == BleachBlocks.seeleSchneiderBlock) && (this.worldObj.getBlock(this.xCoord, this.yCoord, this.zCoord - x) == BleachBlocks.seeleSchneiderBlock) && (this.worldObj.getBlock(this.xCoord + x, this.yCoord, this.zCoord - x) == BleachBlocks.seeleSchneiderBlock))
      {



        setBlockMain(this.xCoord + x, this.yCoord, this.zCoord, this.xCoord, this.yCoord, this.zCoord - x);
        setBlockMain(this.xCoord, this.yCoord, this.zCoord, this.xCoord, this.yCoord, this.zCoord - x);
        setBlockMain(this.xCoord + x, this.yCoord, this.zCoord - x, this.xCoord, this.yCoord, this.zCoord - x);
        
        TileSeeleSchneider tile = (TileSeeleSchneider)this.worldObj.getTileEntity(this.xCoord, this.yCoord, this.zCoord - x);
        tile.setMain(x);
        return;
      }
    }
  }
  
  public void setMain(int side)
  {
    this.isMain = true;
    this.side = side;
    magicSquare.add(new ChunkCoordinates(this.xCoord, this.yCoord, this.zCoord));
    FMLLog.info("[Bleach mod] Main Seeleschneider, side: " + side, new Object[0]);
  }
  





  private void setBlockMain(int x, int y, int z, int i, int j, int k)
  {
    TileSeeleSchneider tile = (TileSeeleSchneider)this.worldObj.getTileEntity(x, y, z);
    tile.mainBlock = new ChunkCoordinates(i, j, k);
  }
  



  public void readFromNBT(NBTTagCompound nbt)
  {
    super.readFromNBT(nbt);
    this.isMain = nbt.getBoolean("isMain");
    this.side = nbt.getInteger("side");
    

    int x = nbt.getInteger("xMain");
    int y = nbt.getInteger("yMain");
    int z = nbt.getInteger("zMain");
    if ((x != 0) && (y != 0) && (z != 0)) {
      this.mainBlock = new ChunkCoordinates(x, y, z);
    }
  }
  



  public void writeToNBT(NBTTagCompound nbt)
  {
    super.writeToNBT(nbt);
    
    nbt.setBoolean("isMain", this.isMain);
    nbt.setInteger("side", this.side);
    

    nbt.setInteger("xMain", this.mainBlock.posX);
    nbt.setInteger("yMain", this.mainBlock.posY);
    nbt.setInteger("zMain", this.mainBlock.posZ);
  }
  
  public TileSeeleSchneider getMainBlockTile()
  {
    return (TileSeeleSchneider)this.worldObj.getTileEntity(this.mainBlock.posX, this.mainBlock.posY, this.mainBlock.posZ);
  }
}
