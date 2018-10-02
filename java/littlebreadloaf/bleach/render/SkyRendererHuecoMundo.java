package littlebreadloaf.bleach.render;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import littlebreadloaf.bleach.BleachIds;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Vec3;
import net.minecraft.world.WorldProvider;
import net.minecraftforge.client.IRenderHandler;
import org.lwjgl.opengl.GL11;

public class SkyRendererHuecoMundo extends IRenderHandler
{
  private static final ResourceLocation TEXTURE_SKY = new ResourceLocation("bleach:textures/environment/hueco_mundo_sky.png");
  private static final ResourceLocation TEXTURE_MOON = new ResourceLocation("bleach:textures/environment/moon.png");
  

  @SideOnly(Side.CLIENT)
  public void render(float partialTicks, WorldClient world, Minecraft mc)
  {
    if (world.provider.dimensionId == BleachIds.worldHuecoMundoID)
    {


      float f18 = world.getStarBrightness(partialTicks) * (1.0F - world.getRainStrength(partialTicks));
      


      renderNightSky(partialTicks);
      


      GL11.glDisable(3553);
      Vec3 vec3 = world.getSkyColor(mc.renderViewEntity, partialTicks);
      float f1 = (float)vec3.xCoord;
      float f2 = (float)vec3.yCoord;
      float f3 = (float)vec3.zCoord;
      

      if (mc.gameSettings.anaglyph)
      {
        float f5 = (f1 * 30.0F + f2 * 59.0F + f3 * 11.0F) / 100.0F;
        float f6 = (f1 * 30.0F + f2 * 70.0F) / 100.0F;
        float f4 = (f1 * 30.0F + f3 * 70.0F) / 100.0F;
        f1 = f5;
        f2 = f6;
        f3 = f4;
      }
      
      GL11.glColor3f(f1, f2, f3);
      Tessellator tessellator1 = Tessellator.instance;
      GL11.glDepthMask(false);
      



      GL11.glDisable(3008);
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      RenderHelper.disableStandardItemLighting();
      float[] afloat = world.provider.calcSunriseSunsetColors(world.getCelestialAngle(partialTicks), partialTicks);
      




      if (afloat != null)
      {
        GL11.glDisable(3553);
        GL11.glShadeModel(7425);
        GL11.glPushMatrix();
        GL11.glRotatef(90.0F, 1.0F, 0.0F, 0.0F);
        GL11.glRotatef(135.0F, 0.0F, 0.0F, 1.0F);
        GL11.glRotatef(90.0F, 0.0F, 0.0F, 1.0F);
        float f4 = afloat[0];
        float f7 = afloat[1];
        float f8 = afloat[2];
        

        if (mc.gameSettings.anaglyph)
        {
          float f9 = (f4 * 30.0F + f7 * 59.0F + f8 * 11.0F) / 100.0F;
          float f10 = (f4 * 30.0F + f7 * 70.0F) / 100.0F;
          float f11 = (f4 * 30.0F + f8 * 70.0F) / 100.0F;
          f4 = f9;
          f7 = f10;
          f8 = f11;
        }
        
        tessellator1.startDrawing(6);
        tessellator1.setColorRGBA_F(f4, f7, f8, afloat[3]);
        tessellator1.addVertex(0.0D, 100.0D, 0.0D);
        byte b0 = 16;
        tessellator1.setColorRGBA_F(afloat[0], afloat[1], afloat[2], 0.0F);
        
        for (int j = 0; j <= b0; j++)
        {
          float f11 = j * 3.1415927F * 2.0F / b0;
          float f12 = MathHelper.sin(f11);
          float f13 = MathHelper.cos(f11);
          tessellator1.addVertex(f12 * 120.0F, f13 * 120.0F, -f13 * 40.0F * afloat[3]);
        }
        
        tessellator1.draw();
        GL11.glPopMatrix();
        GL11.glShadeModel(7424);
      }
      
      GL11.glEnable(3553);
      GL11.glBlendFunc(770, 1);
      GL11.glPushMatrix();
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glTranslatef(0.0F, 0.0F, 0.0F);
      GL11.glRotatef(-90.0F, 0.0F, 1.0F, 0.0F);
      GL11.glRotatef(135.0F, 1.0F, 0.0F, 0.0F);
      float f10 = 20.0F;
      FMLClientHandler.instance().getClient().renderEngine.bindTexture(TEXTURE_MOON);
      tessellator1.startDrawingQuads();
      tessellator1.addVertexWithUV(-f10, -100.0D, f10, 0.0D, 1.0D);
      tessellator1.addVertexWithUV(f10, -100.0D, f10, 1.0D, 1.0D);
      tessellator1.addVertexWithUV(f10, -100.0D, -f10, 1.0D, 0.0D);
      tessellator1.addVertexWithUV(-f10, -100.0D, -f10, 0.0D, 0.0D);
      tessellator1.draw();
      GL11.glDisable(3553);
      

      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glDisable(3042);
      GL11.glEnable(3008);
      GL11.glEnable(2912);
      GL11.glPopMatrix();
      GL11.glDisable(3553);
      GL11.glColor3f(0.0F, 0.0F, 0.0F);
      double d0 = mc.thePlayer.getPosition(partialTicks).yCoord - world.getHorizon();
      
      if (d0 < 0.0D)
      {
        float f8 = 1.0F;
        float f9 = -(float)(d0 + 65.0D);
        f10 = -f8;
        tessellator1.startDrawingQuads();
        tessellator1.setColorRGBA_I(0, 255);
        tessellator1.addVertex(-f8, f9, f8);
        tessellator1.addVertex(f8, f9, f8);
        tessellator1.addVertex(f8, f10, f8);
        tessellator1.addVertex(-f8, f10, f8);
        tessellator1.addVertex(-f8, f10, -f8);
        tessellator1.addVertex(f8, f10, -f8);
        tessellator1.addVertex(f8, f9, -f8);
        tessellator1.addVertex(-f8, f9, -f8);
        tessellator1.addVertex(f8, f10, -f8);
        tessellator1.addVertex(f8, f10, f8);
        tessellator1.addVertex(f8, f9, f8);
        tessellator1.addVertex(f8, f9, -f8);
        tessellator1.addVertex(-f8, f9, -f8);
        tessellator1.addVertex(-f8, f9, f8);
        tessellator1.addVertex(-f8, f10, f8);
        tessellator1.addVertex(-f8, f10, -f8);
        tessellator1.addVertex(-f8, f10, -f8);
        tessellator1.addVertex(-f8, f10, f8);
        tessellator1.addVertex(f8, f10, f8);
        tessellator1.addVertex(f8, f10, -f8);
        tessellator1.draw();
      }
      









      GL11.glEnable(3553);
      GL11.glDepthMask(true);
    }
  }
  


  private void renderNightSky(float partialTicks)
  {
    GL11.glDisable(2912);
    GL11.glDisable(3008);
    GL11.glEnable(3042);
    GL11.glBlendFunc(770, 771);
    RenderHelper.disableStandardItemLighting();
    GL11.glDepthMask(false);
    FMLClientHandler.instance().getClient().renderEngine.bindTexture(TEXTURE_SKY);
    Tessellator tessellator = Tessellator.instance;
    
    GL11.glColor4f(0.4F, 0.4F, 0.4F, 1.0F);
    




    for (int i = 0; i < 6; i++)
    {
      GL11.glPushMatrix();
      
      if (i == 1)
      {
        GL11.glRotatef(90.0F, 1.0F, 0.0F, 0.0F);
      }
      
      if (i == 2)
      {
        GL11.glRotatef(-90.0F, 1.0F, 0.0F, 0.0F);
      }
      
      if (i == 3)
      {
        GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
      }
      
      if (i == 4)
      {
        GL11.glRotatef(90.0F, 0.0F, 0.0F, 1.0F);
      }
      
      if (i == 5)
      {
        GL11.glRotatef(-90.0F, 0.0F, 0.0F, 1.0F);
      }
      
      tessellator.startDrawingQuads();
      
      tessellator.addVertexWithUV(-100.0D, -100.0D, -100.0D, 0.0D, 0.0D);
      tessellator.addVertexWithUV(-100.0D, -100.0D, 100.0D, 0.0D, 2.0D);
      tessellator.addVertexWithUV(100.0D, -100.0D, 100.0D, 2.0D, 2.0D);
      tessellator.addVertexWithUV(100.0D, -100.0D, -100.0D, 2.0D, 0.0D);
      tessellator.draw();
      GL11.glPopMatrix();
    }
    
    GL11.glDepthMask(true);
    GL11.glEnable(3553);
    GL11.glEnable(3008);
  }
}
