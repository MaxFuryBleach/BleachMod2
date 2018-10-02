package littlebreadloaf.bleach.network;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;
import littlebreadloaf.bleach.events.ExtendedPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.network.NetHandlerPlayServer;

public class DeactivateMessage
  implements IMessage
{
  private int id;
  
  public DeactivateMessage() {}
  
  public DeactivateMessage(int id)
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
    implements IMessageHandler<DeactivateMessage, IMessage>
  {
    public IMessage onMessage(DeactivateMessage message, MessageContext ctx)
    {
      ExtendedPlayer props = ExtendedPlayer.get(ctx.getServerHandler().playerEntity);
      if (ctx.getServerHandler().playerEntity.getHeldItem() != null)
        props.deactivate(ctx.getServerHandler().playerEntity.getHeldItem().getItem());
      return null;
    }
  }
}
