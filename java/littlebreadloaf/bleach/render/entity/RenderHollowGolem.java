package littlebreadloaf.bleach.render.entity;

import littlebreadloaf.bleach.entities.EntityHollowGolem;
import littlebreadloaf.bleach.render.models.ModelHollowGolem;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;




public class RenderHollowGolem
  extends RenderLiving
{
  private static final ResourceLocation texture1 = new ResourceLocation("bleach".toLowerCase() + ":textures/models/mobs/hollow_golem.png");
  private static final ResourceLocation texture2 = new ResourceLocation("bleach".toLowerCase() + ":textures/models/mobs/hollow_golem2.png");
  private static final ResourceLocation texture3 = new ResourceLocation("bleach".toLowerCase() + ":textures/models/mobs/hollow_golem3.png");
  protected ModelHollowGolem model;
  
  public RenderHollowGolem(ModelBase par1ModelBase, float par2)
  {
    super(par1ModelBase, par2);
    this.model = ((ModelHollowGolem)this.mainModel);
  }
  
  public void renderHollowGolem(EntityHollowGolem par1, double par2, double par3, double par4, float par5, float par6)
  {
    super.doRender(par1, par2, par3, par4, par5, par6);
  }
  








  protected void preRenderCallback(EntityLivingBase par1EntityLivingBase, float par2)
  {
    scaleHollow((EntityHollowGolem)par1EntityLivingBase, par2);
  }
  
  protected void scaleHollow(EntityHollowGolem par1, float par2)
  {
    float scale = par1.getRenderSize() / 100.0F;
    GL11.glScalef(0.6F + scale, 0.6F + scale, 0.6F + scale);
  }
  

  public void doRender(Entity par1, double par2, double par3, double par4, float par5, float par6)
  {
    renderHollowGolem((EntityHollowGolem)par1, par2, par3, par4, par5, par6);
  }
  
  protected ResourceLocation getEntityTexture(Entity entity)
  {
    switch (((EntityHollowGolem)entity).getTexture())
    {
    case 0: 
      return texture2;
    case 1: 
      return texture3;
    }
    return texture1;
  }
}
