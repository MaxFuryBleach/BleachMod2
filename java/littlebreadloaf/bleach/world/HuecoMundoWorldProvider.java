package littlebreadloaf.bleach.world;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import littlebreadloaf.bleach.BleachIds;
import littlebreadloaf.bleach.render.SkyRendererHuecoMundo;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.IChunkProvider;

public class HuecoMundoWorldProvider extends WorldProvider
{
  public void registerWorldChunkManager()
  {
    this.dimensionId = BleachIds.worldHuecoMundoID;
    this.worldChunkMgr = new HuecoMundoChunkManager(this.worldObj);
    if (FMLCommonHandler.instance().getSide() == Side.CLIENT)
    {
      setSkyRenderer(new SkyRendererHuecoMundo());
    }
  }
  



  @SideOnly(Side.CLIENT)
  public Vec3 getSkyColor(Entity cameraEntity, float partialTicks)
  {
    return Vec3.createVectorHelper(0.1D, 0.1D, 0.1D);
  }
  




  @SideOnly(Side.CLIENT)
  public float[] calcSunriseSunsetColors(float par1, float par2)
  {
    return null;
  }
  





  @SideOnly(Side.CLIENT)
  public boolean isSurfaceWorld()
  {
    return false;
  }
  





  public float calculateCelestialAngle(long par1, float par3)
  {
    int j = (int)(par1 % 24000L);
    float f1 = (j + par3) / 24000.0F - 0.25F;
    
    if (f1 < 0.0F)
    {
      f1 += 1.0F;
    }
    
    if (f1 > 1.0F)
    {
      f1 -= 1.0F;
    }
    
    float f2 = f1;
    f1 = 1.0F - (float)((Math.cos(f1 * 3.141592653589793D) + 1.0D) / 2.0D);
    f1 = f2 + (f1 - f2) / 3.0F;
    return f1;
  }
  




  @SideOnly(Side.CLIENT)
  public Vec3 getFogColor(float par1, float par2)
  {
    float f2 = MathHelper.cos(par1 * 3.1415927F * 2.0F) * 2.0F + 0.5F;
    
    if (f2 < 0.0F)
    {
      f2 = 0.0F;
    }
    
    if (f2 > 1.0F)
    {
      f2 = 1.0F;
    }
    
    float f3 = 0.7529412F;
    float f4 = 0.84705883F;
    float f5 = 1.0F;
    f3 *= (f2 * 0.94F + 0.06F);
    f4 *= (f2 * 0.94F + 0.06F);
    f5 *= (f2 * 0.91F + 0.09F);
    return Vec3.createVectorHelper(f3, f4, f5);
  }
  




  @SideOnly(Side.CLIENT)
  public boolean doesXZShowFog(int par1, int par2)
  {
    return false;
  }
  

  public IChunkProvider createChunkGenerator()
  {
    return new HuecoMundoChunkProvider(this.worldObj, this.worldObj.getSeed(), true);
  }
  

  public boolean isDaytime()
  {
    return false;
  }
  

  public int getActualHeight()
  {
    return 256;
  }
  

  public boolean canDoLightning(Chunk chunk)
  {
    return false;
  }
  

  public void generateLightBrightnessTable()
  {
    float f = 0.005F;
    for (int i = 0; i <= 15; i++)
    {
      float f1 = 1.0F - i / 15.0F;
      this.lightBrightnessTable[i] = ((1.0F - f1) / (f1 * 3.0F + 1.0F) * (1.0F - f) + f);
    }
  }
  

  public boolean canDoRainSnowIce(Chunk chunk)
  {
    return false;
  }
  

  public String getDimensionName()
  {
    return "Hueco Mundo";
  }
}
