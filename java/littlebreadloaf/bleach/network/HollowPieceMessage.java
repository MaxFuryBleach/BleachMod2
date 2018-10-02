package littlebreadloaf.bleach.network;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;
import littlebreadloaf.bleach.events.ExtendedPlayer;
import net.minecraft.network.NetHandlerPlayServer;



public class HollowPieceMessage
  implements IMessage
{
  private int part;
  private int choice;
  private int points;
  
  public HollowPieceMessage() {}
  
  public HollowPieceMessage(int part, int choice, int points)
  {
    this.part = part;
    this.choice = choice;
    this.points = points;
  }
  



  public void fromBytes(ByteBuf buf)
  {
    this.part = buf.readInt();
    this.choice = buf.readInt();
    this.points = buf.readInt();
  }
  




  public void toBytes(ByteBuf buf)
  {
    buf.writeInt(this.part);
    buf.writeInt(this.choice);
    buf.writeInt(this.points);
  }
  

  public static class Handler
    implements IMessageHandler<HollowPieceMessage, IMessage>
  {
    public IMessage onMessage(HollowPieceMessage message, MessageContext ctx)
    {
      ExtendedPlayer props = ExtendedPlayer.get(ctx.getServerHandler().playerEntity);
      
      props.subtractCurrentHPoints(message.points);
      switch (message.part)
      {
      case 0: 
        props.setHead(message.choice);
        break;
      case 1: 
        props.setBack(message.choice);
        break;
      case 2: 
        props.setArms(message.choice);
        break;
      case 3: 
        props.setTail(message.choice);
        break;
      case 4: 
        props.setLegs(message.choice);
        break;
      case 5: 
        props.setHColor(message.choice);
      }
      
      


      return null;
    }
  }
}
