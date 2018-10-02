package littlebreadloaf.bleach.world.biomes;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.BiomeGenBase;


public class HuecoMundoBiome
  extends BiomeGenBase
{
  public HuecoMundoBiome(int id)
  {
    super(id);
    this.theBiomeDecorator = new HuecoMundoBiomeDecorator();
    setBiomeName("Hueco Mundo");
    setDisableRain();
    setTemperatureRainfall(0.5F, 0.0F);
    setHeight(height_Default);
    
    this.spawnableMonsterList.clear();
    this.spawnableCreatureList.clear();
    this.spawnableWaterCreatureList.clear();
    this.spawnableCaveCreatureList.clear();
    

    this.topBlock = Blocks.grass;
    this.fillerBlock = Blocks.clay;
  }
  




  @SideOnly(Side.CLIENT)
  public int getSkyColorByTemp(float par1)
  {
    return 0;
  }
}
