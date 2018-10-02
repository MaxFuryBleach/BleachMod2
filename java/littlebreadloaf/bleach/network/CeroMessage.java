package littlebreadloaf.bleach.network;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;
import littlebreadloaf.bleach.BleachMod;
import littlebreadloaf.bleach.entities.EntityCero;
import littlebreadloaf.bleach.events.ExtendedPlayer;
import littlebreadloaf.bleach.proxies.CommonProxy;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;


public class CeroMessage
  implements IMessage
{
  private int id;
  
  public CeroMessage() {}
  
  public CeroMessage(int id)
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
    implements IMessageHandler<CeroMessage, IMessage>
  {
    public IMessage onMessage(CeroMessage message, MessageContext ctx)
    {
      EntityPlayer player = BleachMod.proxy.getPlayerFromMessage(ctx);
      ExtendedPlayer props = ExtendedPlayer.get(player);
      
      if (props.getFaction() == 4)
      {

        if (props.getCurrentEnergy() * props.getCurrentCap() > 50.0F)
        {

          EntityCero entityCero = new EntityCero(player.worldObj, player, 2.0F);
          
          player.worldObj.spawnEntityInWorld(entityCero);
        }
      }
      




      return null;
    }
  }
}
