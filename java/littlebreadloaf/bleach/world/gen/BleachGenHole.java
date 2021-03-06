package littlebreadloaf.bleach.world.gen;

import java.util.Random;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;



public class BleachGenHole
  extends WorldGenerator
{
  int seeLevel;
  
  public BleachGenHole(int seeLevel)
  {
    this.seeLevel = seeLevel;
  }
  

  public boolean generate(World world, Random random, int i, int j, int k)
  {
    if (world.getBlock(i, this.seeLevel + 1, j) == Blocks.air) {
      return false;
    }
    int top = world.getTopSolidOrLiquidBlock(i, k);
    int bottom = this.seeLevel;
    
    int radiusMax = random.nextInt(2) + 2;
    float radiusMin = 0.7F + random.nextInt(7) / 10;
    
    for (int y = 0; y < top - bottom; y++)
    {
      for (int x = -radiusMax; x <= radiusMax; x++)
      {
        for (int z = -radiusMax; z <= radiusMax; z++)
        {

          float lerp = 1.0F - y / (top - bottom);
          float radius = (int)lerp(radiusMin, radiusMax, lerp);
          

          if (x * x + z * z <= radius * radius) {
            world.setBlockToAir(x + i, y + bottom, z + k);
          }
        }
      }
    }
    return true;
  }
  
  float lerp(float v0, float v1, float t)
  {
    return v0 + (v1 - v0) * t;
  }
}
