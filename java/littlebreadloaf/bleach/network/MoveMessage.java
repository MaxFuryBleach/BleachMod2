package littlebreadloaf.bleach.network;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;
import littlebreadloaf.bleach.BleachMod;
import littlebreadloaf.bleach.proxies.CommonProxy;
import net.minecraft.entity.player.EntityPlayer;




public class MoveMessage
  implements IMessage
{
  private int distance;
  
  public MoveMessage() {}
  
  public MoveMessage(int distance)
  {
    this.distance = distance;
  }
  



  public void fromBytes(ByteBuf buf)
  {
    this.distance = buf.readInt();
  }
  




  public void toBytes(ByteBuf buf)
  {
    buf.writeInt(this.distance);
  }
  

  public static class Handler
    implements IMessageHandler<MoveMessage, IMessage>
  {
    public IMessage onMessage(MoveMessage message, MessageContext ctx)
    {
      EntityPlayer player = BleachMod.proxy.getPlayerFromMessage(ctx);
      

      player.moveEntity(message.distance * Math.cos(-player.rotationPitch * 0.017453292519943295D) * Math.sin(-player.rotationYaw * 0.017453292519943295D), message.distance * Math.sin(-player.rotationPitch * 0.017453292519943295D), message.distance * Math.cos(-player.rotationPitch * 0.017453292519943295D) * Math.cos(-player.rotationYaw * 0.017453292519943295D));
      

      return null;
    }
  }
}
