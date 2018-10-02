package littlebreadloaf.bleach.world;

import java.util.Random;
import net.minecraft.entity.Entity;
import net.minecraft.world.Teleporter;
import net.minecraft.world.WorldServer;

public class SoulSocietyTeleporter extends Teleporter
{
  private final WorldServer worldServer;
  
  public SoulSocietyTeleporter(WorldServer worldServer)
  {
    super(worldServer);
    this.worldServer = worldServer;
  }
  
  public boolean canPlacePortalAt(int x, int y, int z)
  {
    return true;
  }
  


  public void placeInPortal(Entity entity, double px, double py, double pz, float pitch)
  {
    int x = (int)Math.floor(px);
    int z = (int)Math.floor(pz);
    int y = 128;
    
    double d = this.worldServer.rand.nextDouble() * 3.141592653589793D * 2.0D;
    entity.posX = (x + 0.5D + Math.cos(d) * 1.5D);
    entity.posZ = (z + 0.5D + Math.sin(d) * 1.5D);
    entity.posY = (this.worldServer.getTopSolidOrLiquidBlock((int)entity.posX, (int)entity.posZ) + 4);
  }
}
