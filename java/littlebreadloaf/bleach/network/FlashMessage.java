package littlebreadloaf.bleach.network;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;
import littlebreadloaf.bleach.events.ExtendedPlayer;
import net.minecraft.network.NetHandlerPlayServer;



public class FlashMessage
  implements IMessage
{
  private int id;
  
  public FlashMessage() {}
  
  public FlashMessage(int id)
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
    implements IMessageHandler<FlashMessage, IMessage>
  {
    public IMessage onMessage(FlashMessage message, MessageContext ctx)
    {
      ExtendedPlayer props = ExtendedPlayer.get(ctx.getServerHandler().playerEntity);
      props.decideWhatToDo(message.id);
      
      return null;
    }
  }
}
