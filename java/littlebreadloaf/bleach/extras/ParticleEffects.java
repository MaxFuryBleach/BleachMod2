package littlebreadloaf.bleach.extras;

import net.minecraft.client.Minecraft;
import net.minecraft.client.particle.EffectRenderer;

public class ParticleEffects
{
  private static Minecraft mc = ;
  private static net.minecraft.world.World theWorld = mc.theWorld;
  private static boolean red = true;
  
  public static net.minecraft.client.particle.EntityFX spawnParticle(String var0, double var1, double var3, double var5, double var7, double var9, double var11)
  {
    if ((mc != null) && (mc.renderViewEntity != null) && (mc.effectRenderer != null))
    {
      int var13 = mc.gameSettings.particleSetting;
      
      if ((var13 == 1) && (theWorld.rand.nextInt(3) == 0))
      {
        var13 = 2;
      }
      

      double var14 = mc.renderViewEntity.posX - var1;
      double var16 = mc.renderViewEntity.posY - var3;
      double var18 = mc.renderViewEntity.posZ - var5;
      EntitySoulFX var20 = null;
      EntitySpiritFX var28 = null;
      EntityTenshoFX var29 = null;
      EntityPoisonGasFX var30 = null;
      EntityWindFX var31 = null;
      double var21 = 16.0D;
      
      if (var14 * var14 + var16 * var16 + var18 * var18 > var21 * var21)
      {
        return null;
      }
      if (var13 > 1)
      {
        return null;
      }
      

      if (var0.equals("soul"))
      {
        var20 = new EntitySoulFX(theWorld, var1, var3, var5, (float)var7, (float)var9, (float)var11);
        mc.effectRenderer.addEffect(var20);
        return var20;
      }
      
      if (var0.equals("spirit"))
      {
        var28 = new EntitySpiritFX(theWorld, var1, var3, var5, var7, var9, var11);
        mc.effectRenderer.addEffect(var28);
        return var28;
      }
      if (var0.equals("tensho"))
      {
        var29 = new EntityTenshoFX(theWorld, var1, var3, var5, var7, var9, var11);
        mc.effectRenderer.addEffect(var29);
        return var29;
      }
      if (var0.equals("poison"))
      {
        var30 = new EntityPoisonGasFX(theWorld, var1, var3, var5, (float)var7, (float)var9, (float)var11);
        mc.effectRenderer.addEffect(var30);
        return var30;
      }
      if (var0.equals("wind"))
      {
        var31 = new EntityWindFX(theWorld, var1, var3, var5, (float)var7, (float)var9, (float)var11);
        mc.effectRenderer.addEffect(var31);
        var31 = new EntityWindFX(theWorld, var1 - 1.0D, var3, var5 + 0.5D, (float)var7 + 1.0F, (float)var9, (float)var11 + 1.0F);
        mc.effectRenderer.addEffect(var31);
        var31 = new EntityWindFX(theWorld, var1 - 2.0D, var3, var5 + 1.0D, (float)var7 + 2.0F, (float)var9, (float)var11 + 2.0F);
        mc.effectRenderer.addEffect(var31);
        var31 = new EntityWindFX(theWorld, var1 - 3.0D, var3, var5 + 1.5D, (float)var7 + 3.0F, (float)var9, (float)var11 + 3.0F);
        mc.effectRenderer.addEffect(var31);
        var31 = new EntityWindFX(theWorld, var1 - 4.0D, var3, var5 + 2.0D, (float)var7 + 4.0F, (float)var9, (float)var11 + 4.0F);
        mc.effectRenderer.addEffect(var31);
        return var31;
      }
      




      return null;
    }
    





    return null;
  }
}
