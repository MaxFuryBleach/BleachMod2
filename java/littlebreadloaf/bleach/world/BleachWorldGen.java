package littlebreadloaf.bleach.world;

import cpw.mods.fml.common.IWorldGenerator;
import java.io.File;
import java.util.Random;
import littlebreadloaf.bleach.BleachIds;
import littlebreadloaf.bleach.world.gen.BleachGenHole;
import littlebreadloaf.bleach.world.gen.BleachGenMenosTree;
import net.minecraft.world.World;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.WorldServer;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.storage.ISaveHandler;





public class BleachWorldGen
  implements IWorldGenerator
{
  public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
  {
    WorldServer worlds = (WorldServer)world;
    File theWorld = new File("./saves/" + worlds.getSaveHandler().getWorldDirectoryName() + "/DIM7");
    File soulSociety = new File("./assets/bleach/maps/DIM7");
    soulSociety.mkdirs();
    












    if (world.provider.dimensionId == BleachIds.worldHuecoMundoID)
    {
      genHuecoMundo(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
    }
    if (world.provider.dimensionId == BleachIds.worldSoulSocietyID)
    {
      genSoulSociety(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
    }
  }
  
  private void genHuecoMundo(Random rand, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
  {
    int k = chunkX * 16;
    int l = chunkZ * 16;
    
    int x = k + rand.nextInt(16) + 8;
    int z = l + rand.nextInt(16) + 8;
    if (rand.nextInt(10) == 0) {
      new BleachGenHole(59).generate(world, rand, x, 0, z);
    }
    x = k + rand.nextInt(16) + 8;
    z = l + rand.nextInt(16) + 8;
    
    new BleachGenMenosTree(10).generate(world, rand, x, 0, z);
  }
  
  private void genSoulSociety(Random rand, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
  {
    int k = chunkX * 16;
    int l = chunkZ * 16;
    
    int x = k + rand.nextInt(16) + 8;
    int z = l + rand.nextInt(16) + 8;
  }
}
