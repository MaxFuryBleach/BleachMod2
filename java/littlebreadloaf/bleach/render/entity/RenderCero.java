package littlebreadloaf.bleach.render.entity;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import littlebreadloaf.bleach.entities.EntityCero;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;



@SideOnly(Side.CLIENT)
public class RenderCero
  extends Render
{
  private static final ResourceLocation arrowTextures = new ResourceLocation("bleach".toLowerCase() + ":textures/items/energyarrows.png");
  private static final ResourceLocation ceroTexture = new ResourceLocation("bleach".toLowerCase() + ":textures/blocks/cero.png");
  
  public void renderCero(EntityCero par1EntityCero, double par2, double par4, double par6, float par8, float par9)
  {
    if ((par1EntityCero.startingX != 0.0D) && (par1EntityCero.startingY != 0.0D) && (par1EntityCero.startingZ != 0.0D))
    {

      float f2 = par9 + 0.8F;
      float f3 = MathHelper.sin(f2 * 0.2F) / 2.0F + 0.5F;
      f3 = (f3 * f3 + f3) * 0.2F;
      float f4 = (float)(par1EntityCero.startingX - par1EntityCero.posX - (par1EntityCero.prevPosX - par1EntityCero.posX) * (1.0F - par9));
      float f5 = (float)(f3 + par1EntityCero.startingY - 1.2D - par1EntityCero.posY - (par1EntityCero.prevPosY - par1EntityCero.posY) * (1.0F - par9));
      float f6 = (float)(par1EntityCero.startingZ - par1EntityCero.posZ - (par1EntityCero.prevPosZ - par1EntityCero.posZ) * (1.0F - par9));
      float f7 = MathHelper.sqrt_float(f4 * f4 + f6 * f6);
      float f8 = MathHelper.sqrt_float(f4 * f4 + f5 * f5 + f6 * f6);
      GL11.glPushMatrix();
      GL11.glTranslatef((float)par2, (float)par4 + 2.0F, (float)par6);
      GL11.glRotatef((float)-Math.atan2(f6, f4) * 180.0F / 3.1415927F - 90.0F, 0.0F, 1.0F, 0.0F);
      GL11.glRotatef((float)-Math.atan2(f7, f5) * 180.0F / 3.1415927F - 90.0F, 1.0F, 0.0F, 0.0F);
      Tessellator tessellator = Tessellator.instance;
      RenderHelper.disableStandardItemLighting();
      GL11.glDisable(2884);
      bindTexture(ceroTexture);
      GL11.glShadeModel(7425);
      float f9 = 0.0F - (par1EntityCero.ticksExisted + par9) * 0.01F;
      float f10 = MathHelper.sqrt_float(f4 * f4 + f5 * f5 + f6 * f6) / 32.0F - (par1EntityCero.ticksExisted + par9) * 0.01F;
      tessellator.startDrawing(5);
      byte b0 = 8;
      
      for (int i = 0; i <= b0; i++)
      {
        float f11 = MathHelper.sin(i % b0 * 3.1415927F * 2.0F / b0) * 0.75F;
        float f12 = MathHelper.cos(i % b0 * 3.1415927F * 2.0F / b0) * 0.75F;
        float f13 = i % b0 * 1.0F / b0;
        tessellator.setColorOpaque_I(10223616);
        tessellator.addVertexWithUV(f11 * 0.2F, f12 * 0.2F, 0.0D, f13, f10);
        tessellator.setColorOpaque_I(16777215);
        tessellator.addVertexWithUV(f11, f12, f8, f13, f9);
      }
      
      tessellator.draw();
      GL11.glEnable(2884);
      GL11.glShadeModel(7424);
      RenderHelper.enableStandardItemLighting();
      GL11.glPopMatrix();
    }
  }
  




  protected ResourceLocation getArrowTextures(EntityCero par1EntityCero)
  {
    return arrowTextures;
  }
  
  protected ResourceLocation getEntityTexture(Entity par1Entity)
  {
    return getArrowTextures((EntityCero)par1Entity);
  }
  








  public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9)
  {
    renderCero((EntityCero)par1Entity, par2, par4, par6, par8, par9);
    renderLine((EntityCero)par1Entity, par2, par4, par6, par8, par9);
  }
  



  private void renderLine(EntityCero par1Entity, double par2, double par4, double par6, float par8, float par9) {}
  


  private double func_110828_a(double par1, double par3, double par5)
  {
    return par1 + (par3 - par1) * par5;
  }
}
