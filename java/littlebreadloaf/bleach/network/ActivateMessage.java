package littlebreadloaf.bleach.network;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;
import littlebreadloaf.bleach.events.ExtendedPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.network.NetHandlerPlayServer;


public class ActivateMessage
  implements IMessage
{
  private int id;
  
  public ActivateMessage() {}
  
  public ActivateMessage(int id)
  {
    this.id = id;
  }
  



  public void fromBytes(ByteBuf buf)
  {
    this.id = buf.readInt();
  }
  




  public void toBytes(ByteBuf buf)
  {
    buf.writeInt(this.id);
  }
  

  public static class Handler
    implements IMessageHandler<ActivateMessage, IMessage>
  {
    public IMessage onMessage(ActivateMessage message, MessageContext ctx)
    {
      ExtendedPlayer props = ExtendedPlayer.get(ctx.getServerHandler().playerEntity);
      if (ctx.getServerHandler().playerEntity.getHeldItem() != null)
        props.activate(ctx.getServerHandler().playerEntity.getHeldItem());
      return null;
    }
  }
}
