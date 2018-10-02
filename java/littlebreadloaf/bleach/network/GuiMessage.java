package littlebreadloaf.bleach.network;

import cpw.mods.fml.common.network.internal.FMLNetworkHandler;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;
import java.io.PrintStream;
import littlebreadloaf.bleach.BleachMod;
import littlebreadloaf.bleach.events.ExtendedPlayer;
import littlebreadloaf.bleach.proxies.CommonProxy;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class GuiMessage
  implements IMessage
{
  private int id;
  
  public GuiMessage() {}
  
  public GuiMessage(int id)
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
    implements IMessageHandler<GuiMessage, IMessage>
  {
    public IMessage onMessage(GuiMessage message, MessageContext ctx)
    {
      EntityPlayer player = BleachMod.proxy.getPlayerFromMessage(ctx);
      ExtendedPlayer props = ExtendedPlayer.get(player);
      

      System.out.println(player.worldObj.isRemote);
      FMLNetworkHandler.openGui(player, BleachMod.instance, message.id, player.worldObj, (int)player.posX, (int)player.posY, (int)player.posZ);
      


      return null;
    }
  }
}
