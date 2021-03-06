package littlebreadloaf.bleach.world.gen;

import java.util.Random;
import littlebreadloaf.bleach.blocks.BleachBlocks;
import littlebreadloaf.bleach.entities.EntityMenosGrande;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;



public class BleachGenMenosTree
  extends WorldGenerator
{
  int seeLevel;
  
  public BleachGenMenosTree(int seeLevel)
  {
    this.seeLevel = seeLevel;
  }
  


  public boolean generate(World world, Random random, int i, int j, int k)
  {
    if (random.nextInt(100) == 0)
    {
      EntityMenosGrande Menos = new EntityMenosGrande(world);
      Menos.setLocationAndAngles(i + 6, j, k + 6, 0.0F, 0.0F);
      world.spawnEntityInWorld(Menos);
    }
    int radius = 2;
    if (random.nextInt(300) == 0)
    {

      radius = random.nextInt(3) + 6;

    }
    else
    {
      radius = random.nextInt(3) + 2;
    }
    
    for (int x = -radius; x <= radius; x++)
    {
      for (int z = -radius; z <= radius; z++)
      {
        for (int y = this.seeLevel; y < 25; y++)
        {
          if (Math.sqrt(z * z + x * x) <= radius)
          {
            world.setBlock(x + i, y, z + k, BleachBlocks.soulQuartzBlock);
            world.setBlock(x + i, y + random.nextInt(2), z + k, BleachBlocks.soulQuartzBlock);
            world.setBlock(x + i, y + random.nextInt(3), z + k, BleachBlocks.soulQuartzBlock);
            world.setBlock(x + i, y + random.nextInt(3), z + k, BleachBlocks.soulQuartzBlock);
            world.setBlock(x + i, y + random.nextInt(4), z + k, BleachBlocks.soulQuartzBlock);
          }
        }
      }
    }
    radius -= 1;
    
    for (int x = -radius; x <= radius; x++)
    {
      for (int z = -radius; z <= radius; z++)
      {
        for (int y = 24; y < 40; y++)
        {
          if (Math.sqrt(z * z + x * x) <= radius)
          {
            world.setBlock(x + i, y, z + k, BleachBlocks.soulQuartzBlock);
            world.setBlock(x + i, y + random.nextInt(2), z + k, BleachBlocks.soulQuartzBlock);
            world.setBlock(x + i, y + random.nextInt(3), z + k, BleachBlocks.soulQuartzBlock);
            world.setBlock(x + i, y + random.nextInt(3), z + k, BleachBlocks.soulQuartzBlock);
            world.setBlock(x + i, y + random.nextInt(4), z + k, BleachBlocks.soulQuartzBlock);
          }
        }
      }
    }
    if (radius > 0)
    {
      radius -= 1;
      
      for (int x = -radius; x <= radius; x++)
      {
        for (int z = -radius; z <= radius; z++)
        {
          for (int y = 39; y < 55; y++)
          {
            if (Math.sqrt(z * z + x * x) <= radius)
            {
              world.setBlock(x + i, y, z + k, BleachBlocks.soulQuartzBlock);
              world.setBlock(x + i, y + random.nextInt(2), z + k, BleachBlocks.soulQuartzBlock);
              world.setBlock(x + i, y + random.nextInt(3), z + k, BleachBlocks.soulQuartzBlock);
              world.setBlock(x + i, y + random.nextInt(3), z + k, BleachBlocks.soulQuartzBlock);
              world.setBlock(x + i, y + random.nextInt(4), z + k, BleachBlocks.soulQuartzBlock);
              

              if (random.nextInt(30) == 0)
              {
                int directionX = 0;
                int directionZ = 0;
                while ((directionZ == 0) && (directionX == 0))
                {
                  directionX = random.nextInt(2) - random.nextInt(2);
                  directionZ = random.nextInt(2) - random.nextInt(2);
                }
                
                int length = 4 + random.nextInt(4);
                int blockX = x + i;
                int blockZ = z + k;
                
                for (int b = 0; b < length; b++)
                {
                  blockX += directionX;
                  blockZ += directionZ;
                  world.setBlock(blockX, y, blockZ, BleachBlocks.soulQuartzBlock);
                  if (random.nextInt(3) == 0)
                  {
                    y++;
                  }
                }
              }
            }
          }
        }
      }
    }
    radius -= 1;
    
    if (radius > 0)
    {
      for (int x = -radius; x <= radius; x++)
      {
        for (int z = -radius; z <= radius; z++)
        {
          for (int y = 54; y < 65; y++)
          {
            if (Math.sqrt(z * z + x * x) <= radius)
            {
              world.setBlock(x + i, y, z + k, BleachBlocks.soulQuartzBlock);
              world.setBlock(x + i, y + random.nextInt(2), z + k, BleachBlocks.soulQuartzBlock);
              world.setBlock(x + i, y + random.nextInt(3), z + k, BleachBlocks.soulQuartzBlock);
              world.setBlock(x + i, y + random.nextInt(3), z + k, BleachBlocks.soulQuartzBlock);
              world.setBlock(x + i, y + random.nextInt(4), z + k, BleachBlocks.soulQuartzBlock);
            }
          }
        }
      }
    }
    return true;
  }
}
