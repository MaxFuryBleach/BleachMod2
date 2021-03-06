package littlebreadloaf.bleach.network;

import cpw.mods.fml.common.network.ByteBufUtils;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;
import littlebreadloaf.bleach.BleachMod;
import littlebreadloaf.bleach.events.ExtendedPlayer;
import littlebreadloaf.bleach.proxies.CommonProxy;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;

public class ServerSyncMessage implements IMessage
{
  private NBTTagCompound data;
  
  public ServerSyncMessage() {}
  
  public ServerSyncMessage(EntityPlayer player)
  {
    this.data = new NBTTagCompound();
    ExtendedPlayer.get(player).saveNBTData(this.data);
  }
  



  public void fromBytes(ByteBuf buf)
  {
    this.data = ByteBufUtils.readTag(buf);
  }
  




  public void toBytes(ByteBuf buf)
  {
    ByteBufUtils.writeTag(buf, this.data);
  }
  

  public static class Handler
    implements IMessageHandler<ServerSyncMessage, IMessage>
  {
    public IMessage onMessage(ServerSyncMessage message, MessageContext ctx)
    {
      EntityPlayer player = BleachMod.proxy.getPlayerFromMessage(ctx);
      ExtendedPlayer props = ExtendedPlayer.get(BleachMod.proxy.getPlayerFromMessage(ctx));
      props.loadNBTData(message.data);
      
      return null;
    }
  }
}
