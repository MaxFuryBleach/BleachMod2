package littlebreadloaf.bleach.tiles;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class TileBleach extends TileEntity
{
  public boolean isUseableByPlayer(EntityPlayer player)
  {
    return (this.worldObj.getTileEntity(this.xCoord, this.yCoord, this.zCoord) == this) && (player.getDistanceSq(this.xCoord + 0.5D, this.yCoord + 0.5D, this.zCoord + 0.5D) < 6.0D);
  }
  


  public void onDataPacket(NetworkManager net, S35PacketUpdateTileEntity pkt)
  {
    NBTTagCompound nbt = pkt.func_148857_g();
    readFromNBT(nbt);
  }
  

  public Packet getDescriptionPacket()
  {
    NBTTagCompound nbt = new NBTTagCompound();
    writeToNBT(nbt);
    return new S35PacketUpdateTileEntity(this.xCoord, this.yCoord, this.zCoord, 0, nbt);
  }
}
