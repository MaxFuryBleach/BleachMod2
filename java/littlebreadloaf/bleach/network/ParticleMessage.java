package littlebreadloaf.bleach.network;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;
import java.util.Random;
import littlebreadloaf.bleach.BleachMod;
import littlebreadloaf.bleach.extras.ParticleEffects;
import littlebreadloaf.bleach.proxies.CommonProxy;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;


public class ParticleMessage
  implements IMessage
{
  private int id;
  private double posx;
  private double posy;
  private double posz;
  Random rand = new Random();
  

  public ParticleMessage() {}
  

  public ParticleMessage(int id, double x, double y, double z)
  {
    this.id = id;
    this.posx = x;
    this.posy = y;
    this.posz = z;
  }
  



  public void fromBytes(ByteBuf buf)
  {
    this.id = buf.readInt();
    this.posx = buf.readDouble();
    this.posy = buf.readDouble();
    this.posz = buf.readDouble();
  }
  





  public void toBytes(ByteBuf buf)
  {
    buf.writeInt(this.id);
    buf.writeDouble(this.posx);
    buf.writeDouble(this.posy);
    buf.writeDouble(this.posz);
  }
  
  public static class Handler implements IMessageHandler<ParticleMessage, IMessage>
  {
    Random rand = new Random();
    
    public IMessage onMessage(ParticleMessage message, MessageContext ctx)
    {
      EntityPlayer player = BleachMod.proxy.getPlayerFromMessage(ctx);
      
      if (message.id == 0)
      {
        ParticleEffects.spawnParticle("tensho", message.posx + this.rand.nextDouble(), message.posy + this.rand.nextDouble(), message.posz + this.rand.nextDouble(), 0.0D, 0.0D, 0.0D);
      }
      if (message.id == 1)
      {
        ParticleEffects.spawnParticle("poison", message.posx + this.rand.nextDouble() - this.rand.nextDouble(), message.posy + this.rand.nextDouble() - this.rand.nextDouble(), message.posz + this.rand.nextDouble() - this.rand.nextDouble(), 0.0D, 0.0D, 0.0D);
      }
      if (message.id == 2)
      {
        Block block = player.worldObj.getBlock((int)player.posX, (int)player.posY - 2, (int)player.posZ);
        if (block != Blocks.air)
        {
          player.worldObj.spawnParticle("blockcrack_" + Block.getIdFromBlock(block) + "_0", message.posx + this.rand.nextDouble(), message.posy + this.rand.nextDouble(), message.posz + this.rand.nextDouble(), 0.0D, 0.002D, 0.0D);
          player.worldObj.spawnParticle("blockcrack_" + Block.getIdFromBlock(block) + "_0", message.posx + this.rand.nextDouble(), message.posy + this.rand.nextDouble(), message.posz + this.rand.nextDouble(), 0.0D, 0.002D, 0.0D);
          player.worldObj.spawnParticle("blockcrack_" + Block.getIdFromBlock(block) + "_0", message.posx + this.rand.nextDouble(), message.posy + this.rand.nextDouble(), message.posz + this.rand.nextDouble(), 0.0D, 0.002D, 0.0D);
        }
        else
        {
          player.worldObj.spawnParticle("blockcrack_" + Block.getIdFromBlock(Blocks.stone) + "_0", message.posx + this.rand.nextDouble(), message.posy + this.rand.nextDouble(), message.posz + this.rand.nextDouble(), 0.0D, 0.002D, 0.0D);
          player.worldObj.spawnParticle("blockcrack_" + Block.getIdFromBlock(Blocks.stone) + "_0", message.posx + this.rand.nextDouble(), message.posy + this.rand.nextDouble(), message.posz + this.rand.nextDouble(), 0.0D, 0.002D, 0.0D);
          player.worldObj.spawnParticle("blockcrack_" + Block.getIdFromBlock(Blocks.stone) + "_0", message.posx + this.rand.nextDouble(), message.posy + this.rand.nextDouble(), message.posz + this.rand.nextDouble(), 0.0D, 0.002D, 0.0D);
        }
      }
      

      if (message.id == 3)
      {
        ParticleEffects.spawnParticle("wind", message.posx, message.posy, message.posz, 0.0D, 0.0D, 0.0D);
      }
      if (message.id == 4)
      {
        double d0 = this.rand.nextGaussian() * 0.02D;
        double d1 = this.rand.nextGaussian() * 0.02D;
        double d2 = this.rand.nextGaussian() * 0.02D;
        player.worldObj.spawnParticle("heart", message.posx + this.rand.nextFloat() * 2.0F, message.posy + 0.5D + this.rand.nextFloat(), message.posz + this.rand.nextFloat() * 2.0F, d0, d1, d2);
      }
      
      if (message.id == 5)
      {
        ParticleEffects.spawnParticle("spirit", message.posx + this.rand.nextDouble(), message.posy + this.rand.nextDouble(), message.posz + this.rand.nextDouble(), 0.0D, 0.0D, 0.0D);
        ParticleEffects.spawnParticle("spirit", message.posx + this.rand.nextDouble(), message.posy + this.rand.nextDouble(), message.posz + this.rand.nextDouble(), 0.0D, 0.0D, 0.0D);
        ParticleEffects.spawnParticle("spirit", message.posx + this.rand.nextDouble(), message.posy + this.rand.nextDouble(), message.posz + this.rand.nextDouble(), 0.0D, 0.0D, 0.0D);
      }
      
      return null;
    }
  }
}
