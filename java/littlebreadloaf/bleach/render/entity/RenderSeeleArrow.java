package littlebreadloaf.bleach.render.entity;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import littlebreadloaf.bleach.entities.EntitySeeleArrow;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;




@SideOnly(Side.CLIENT)
public class RenderSeeleArrow
  extends Render
{
  private static final ResourceLocation arrowTextures = new ResourceLocation("bleach".toLowerCase() + ":textures/items/seelearrows.png");
  
  public void renderSeeleArrow(EntitySeeleArrow par1EntitySeeleArrow, double par2, double par4, double par6, float par8, float par9)
  {
    bindEntityTexture(par1EntitySeeleArrow);
    GL11.glPushMatrix();
    GL11.glTranslatef((float)par2, (float)par4, (float)par6);
    GL11.glRotatef(par1EntitySeeleArrow.prevRotationYaw + (par1EntitySeeleArrow.rotationYaw - par1EntitySeeleArrow.prevRotationYaw) * par9 - 90.0F, 0.0F, 1.0F, 0.0F);
    GL11.glRotatef(par1EntitySeeleArrow.prevRotationPitch + (par1EntitySeeleArrow.rotationPitch - par1EntitySeeleArrow.prevRotationPitch) * par9, 0.0F, 0.0F, 1.0F);
    Tessellator tessellator = Tessellator.instance;
    byte b0 = 0;
    float f2 = 0.0F;
    float f3 = 0.5F;
    float f4 = (0 + b0 * 10) / 32.0F;
    float f5 = (5 + b0 * 10) / 32.0F;
    float f6 = 0.0F;
    float f7 = 0.15625F;
    float f8 = (5 + b0 * 10) / 32.0F;
    float f9 = (10 + b0 * 10) / 32.0F;
    float f10 = 0.05625F;
    GL11.glEnable(32826);
    float f11 = par1EntitySeeleArrow.arrowShake - par9;
    
    if (f11 > 0.0F)
    {
      float f12 = -MathHelper.sin(f11 * 3.0F) * f11;
      GL11.glRotatef(f12, 0.0F, 0.0F, 1.0F);
    }
    
    GL11.glRotatef(45.0F, 1.0F, 0.0F, 0.0F);
    GL11.glScalef(f10, f10, f10);
    GL11.glTranslatef(-4.0F, 0.0F, 0.0F);
    GL11.glNormal3f(f10, 0.0F, 0.0F);
    tessellator.startDrawingQuads();
    tessellator.addVertexWithUV(-7.0D, -2.0D, -2.0D, f6, f8);
    tessellator.addVertexWithUV(-7.0D, -2.0D, 2.0D, f7, f8);
    tessellator.addVertexWithUV(-7.0D, 2.0D, 2.0D, f7, f9);
    tessellator.addVertexWithUV(-7.0D, 2.0D, -2.0D, f6, f9);
    tessellator.draw();
    GL11.glNormal3f(-f10, 0.0F, 0.0F);
    tessellator.startDrawingQuads();
    tessellator.addVertexWithUV(-7.0D, 2.0D, -2.0D, f6, f8);
    tessellator.addVertexWithUV(-7.0D, 2.0D, 2.0D, f7, f8);
    tessellator.addVertexWithUV(-7.0D, -2.0D, 2.0D, f7, f9);
    tessellator.addVertexWithUV(-7.0D, -2.0D, -2.0D, f6, f9);
    tessellator.draw();
    
    for (int i = 0; i < 4; i++)
    {
      GL11.glRotatef(90.0F, 1.0F, 0.0F, 0.0F);
      GL11.glNormal3f(0.0F, 0.0F, f10);
      tessellator.startDrawingQuads();
      tessellator.addVertexWithUV(-8.0D, -2.0D, 0.0D, f2, f4);
      tessellator.addVertexWithUV(8.0D, -2.0D, 0.0D, f3, f4);
      tessellator.addVertexWithUV(8.0D, 2.0D, 0.0D, f3, f5);
      tessellator.addVertexWithUV(-8.0D, 2.0D, 0.0D, f2, f5);
      tessellator.draw();
    }
    
    GL11.glDisable(32826);
    GL11.glPopMatrix();
  }
  
  protected ResourceLocation getArrowTextures(EntitySeeleArrow par1EntitySeeleArrow)
  {
    return arrowTextures;
  }
  
  protected ResourceLocation getEntityTexture(Entity par1Entity)
  {
    return getArrowTextures((EntitySeeleArrow)par1Entity);
  }
  








  public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9)
  {
    renderSeeleArrow((EntitySeeleArrow)par1Entity, par2, par4, par6, par8, par9);
  }
}
