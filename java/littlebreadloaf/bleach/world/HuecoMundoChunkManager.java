package littlebreadloaf.bleach.world;

import cpw.mods.fml.common.eventhandler.EventBus;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import littlebreadloaf.bleach.world.biomes.BleachBiomes;
import net.minecraft.world.ChunkPosition;
import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.BiomeCache;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.IntCache;
import net.minecraft.world.storage.WorldInfo;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.terraingen.WorldTypeEvent.InitBiomeGens;

public class HuecoMundoChunkManager extends net.minecraft.world.biome.WorldChunkManager
{
  public BiomeGenBase[] huecoMundoBiomes = { BleachBiomes.HuecoMundo };
  

  private GenLayer genBiomes;
  

  private GenLayer biomeIndexLayer;
  
  private BiomeCache biomeCache;
  
  private List biomesToSpawnIn;
  

  protected HuecoMundoChunkManager()
  {
    allowedBiomes.clear();
    allowedBiomes.add(BleachBiomes.HuecoMundo);
    
    this.biomeCache = new BiomeCache(this);
    
    this.biomesToSpawnIn = new ArrayList();
    this.biomesToSpawnIn.addAll(allowedBiomes);
  }
  
  public HuecoMundoChunkManager(long seed, WorldType worldType)
  {
    this();
    GenLayer[] agenlayer = GenLayer.initializeAllBiomeGenerators(seed, worldType);
    agenlayer = getModdedBiomeGenerators(worldType, seed, agenlayer);
    this.genBiomes = agenlayer[0];
    this.biomeIndexLayer = agenlayer[1];
  }
  
  public HuecoMundoChunkManager(World world)
  {
    this(world.getSeed(), world.getWorldInfo().getTerrainType());
  }
  




  public List getBiomesToSpawnIn()
  {
    return this.biomesToSpawnIn;
  }
  




  public BiomeGenBase getBiomeGenAt(int par1, int par2)
  {
    return this.biomeCache.getBiomeGenAt(par1, par2);
  }
  



  public float[] getRainfall(float[] par1ArrayOfFloat, int par2, int par3, int par4, int par5)
  {
    
    


    if ((par1ArrayOfFloat == null) || (par1ArrayOfFloat.length < par4 * par5))
    {
      par1ArrayOfFloat = new float[par4 * par5];
    }
    
    int[] aint = this.biomeIndexLayer.getInts(par2, par3, par4, par5);
    
    for (int i1 = 0; i1 < par4 * par5; i1++)
    {
      float f = this.huecoMundoBiomes[(aint[i1] % this.huecoMundoBiomes.length)].getIntRainfall() / 65536.0F;
      
      if (f > 1.0F)
      {
        f = 1.0F;
      }
      
      par1ArrayOfFloat[i1] = f;
    }
    
    return par1ArrayOfFloat;
  }
  




  @SideOnly(Side.CLIENT)
  public float getTemperatureAtHeight(float par1, int par2)
  {
    return par1;
  }
  




  public BiomeGenBase[] getBiomesForGeneration(BiomeGenBase[] par1ArrayOfBiomeGenBase, int par2, int par3, int par4, int par5)
  {
    
    



    if ((par1ArrayOfBiomeGenBase == null) || (par1ArrayOfBiomeGenBase.length < par4 * par5))
    {
      par1ArrayOfBiomeGenBase = new BiomeGenBase[par4 * par5];
    }
    
    int[] aint = this.genBiomes.getInts(par2, par3, par4, par5);
    
    for (int i1 = 0; i1 < par4 * par5; i1++)
    {
      par1ArrayOfBiomeGenBase[i1] = this.huecoMundoBiomes[(aint[i1] % this.huecoMundoBiomes.length)];
    }
    
    return par1ArrayOfBiomeGenBase;
  }
  








  public BiomeGenBase[] loadBlockGeneratorData(BiomeGenBase[] par1ArrayOfBiomeGenBase, int par2, int par3, int par4, int par5)
  {
    return getBiomeGenAt(par1ArrayOfBiomeGenBase, par2, par3, par4, par5, true);
  }
  




  public BiomeGenBase[] getBiomeGenAt(BiomeGenBase[] par1ArrayOfBiomeGenBase, int par2, int par3, int par4, int par5, boolean par6)
  {
    
    


    if ((par1ArrayOfBiomeGenBase == null) || (par1ArrayOfBiomeGenBase.length < par4 * par5))
    {
      par1ArrayOfBiomeGenBase = new BiomeGenBase[par4 * par5];
    }
    
    if ((par6) && (par4 == 16) && (par5 == 16) && ((par2 & 0xF) == 0) && ((par3 & 0xF) == 0))
    {
      BiomeGenBase[] abiomegenbase1 = this.biomeCache.getCachedBiomes(par2, par3);
      System.arraycopy(abiomegenbase1, 0, par1ArrayOfBiomeGenBase, 0, par4 * par5);
      return par1ArrayOfBiomeGenBase;
    }
    
    int[] aint = this.biomeIndexLayer.getInts(par2, par3, par4, par5);
    
    for (int i1 = 0; i1 < par4 * par5; i1++)
    {
      par1ArrayOfBiomeGenBase[i1] = this.huecoMundoBiomes[(aint[i1] % this.huecoMundoBiomes.length)];
    }
    
    return par1ArrayOfBiomeGenBase;
  }
  





  public boolean areBiomesViable(int par1, int par2, int par3, List par4List)
  {
    IntCache.resetIntCache();
    int l = par1 - par3 >> 2;
    int i1 = par2 - par3 >> 2;
    int j1 = par1 + par3 >> 2;
    int k1 = par2 + par3 >> 2;
    int l1 = j1 - l + 1;
    int i2 = k1 - i1 + 1;
    int[] aint = this.genBiomes.getInts(l, i1, l1, i2);
    
    for (int j2 = 0; j2 < l1 * i2; j2++)
    {
      BiomeGenBase biomegenbase = this.huecoMundoBiomes[(aint[j2] % this.huecoMundoBiomes.length)];
      
      if (!par4List.contains(biomegenbase))
      {
        return false;
      }
    }
    
    return true;
  }
  






  public ChunkPosition findBiomePosition(int par1, int par2, int par3, List par4List, Random par5Random)
  {
    IntCache.resetIntCache();
    int l = par1 - par3 >> 2;
    int i1 = par2 - par3 >> 2;
    int j1 = par1 + par3 >> 2;
    int k1 = par2 + par3 >> 2;
    int l1 = j1 - l + 1;
    int i2 = k1 - i1 + 1;
    int[] aint = this.genBiomes.getInts(l, i1, l1, i2);
    ChunkPosition chunkposition = null;
    int j2 = 0;
    
    for (int k2 = 0; k2 < l1 * i2; k2++)
    {
      int l2 = l + k2 % l1 << 2;
      int i3 = i1 + k2 / l1 << 2;
      BiomeGenBase biomegenbase = this.huecoMundoBiomes[(aint[k2] % this.huecoMundoBiomes.length)];
      
      if ((par4List.contains(biomegenbase)) && ((chunkposition == null) || (par5Random.nextInt(j2 + 1) == 0)))
      {
        chunkposition = new ChunkPosition(l2, 0, i3);
        j2++;
      }
    }
    
    return chunkposition;
  }
  



  public void cleanupCache()
  {
    this.biomeCache.cleanupCache();
  }
  
  public GenLayer[] getModdedBiomeGenerators(WorldType worldType, long seed, GenLayer[] original)
  {
    WorldTypeEvent.InitBiomeGens event = new WorldTypeEvent.InitBiomeGens(worldType, seed, original);
    MinecraftForge.TERRAIN_GEN_BUS.post(event);
    return event.newBiomeGens;
  }
}
