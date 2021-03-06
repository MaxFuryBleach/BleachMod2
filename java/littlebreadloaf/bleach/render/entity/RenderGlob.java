package littlebreadloaf.bleach.render.entity;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.entity.Entity;
import net.minecraft.entity.projectile.EntityPotion;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPotion;
import net.minecraft.potion.PotionHelper;
import net.minecraft.util.IIcon;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;


@SideOnly(Side.CLIENT)
public class RenderGlob
  extends Render
{
  private Item field_94151_a;
  private int field_94150_f;
  private static final String __OBFID = "CL_00001008";
  
  public RenderGlob(Item par1Item, int par2)
  {
    this.field_94151_a = par1Item;
    this.field_94150_f = par2;
  }
  
  public RenderGlob(Item par1Item)
  {
    this(par1Item, 0);
  }
  






  public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9)
  {
    IIcon iicon = this.field_94151_a.getIconFromDamage(this.field_94150_f);
    
    if (iicon != null)
    {
      GL11.glPushMatrix();
      GL11.glTranslatef((float)par2, (float)par4, (float)par6);
      GL11.glEnable(32826);
      GL11.glScalef(0.5F, 0.5F, 0.5F);
      bindEntityTexture(par1Entity);
      Tessellator tessellator = Tessellator.instance;
      
      if (iicon == ItemPotion.func_94589_d("bottle_splash"))
      {
        int i = PotionHelper.func_77915_a(((EntityPotion)par1Entity).getPotionDamage(), false);
        float f2 = (i >> 16 & 0xFF) / 255.0F;
        float f3 = (i >> 8 & 0xFF) / 255.0F;
        float f4 = (i & 0xFF) / 255.0F;
        GL11.glColor3f(f2, f3, f4);
        GL11.glPushMatrix();
        func_77026_a(tessellator, ItemPotion.func_94589_d("overlay"));
        GL11.glPopMatrix();
        GL11.glColor3f(1.0F, 1.0F, 1.0F);
      }
      
      func_77026_a(tessellator, iicon);
      GL11.glDisable(32826);
      GL11.glPopMatrix();
    }
  }
  



  protected ResourceLocation getEntityTexture(Entity par1Entity)
  {
    return TextureMap.locationItemsTexture;
  }
  
  private void func_77026_a(Tessellator par1Tessellator, IIcon par2Icon)
  {
    float f = par2Icon.getMinU();
    float f1 = par2Icon.getMaxU();
    float f2 = par2Icon.getMinV();
    float f3 = par2Icon.getMaxV();
    float f4 = 1.0F;
    float f5 = 0.5F;
    float f6 = 0.25F;
    GL11.glRotatef(180.0F - this.renderManager.playerViewY, 0.0F, 1.0F, 0.0F);
    GL11.glRotatef(-this.renderManager.playerViewX, 1.0F, 0.0F, 0.0F);
    par1Tessellator.startDrawingQuads();
    par1Tessellator.setNormal(0.0F, 1.0F, 0.0F);
    par1Tessellator.addVertexWithUV(0.0F - f5, 0.0F - f6, 0.0D, f, f3);
    par1Tessellator.addVertexWithUV(f4 - f5, 0.0F - f6, 0.0D, f1, f3);
    par1Tessellator.addVertexWithUV(f4 - f5, f4 - f6, 0.0D, f1, f2);
    par1Tessellator.addVertexWithUV(0.0F - f5, f4 - f6, 0.0D, f, f2);
    par1Tessellator.draw();
  }
}
