package littlebreadloaf.bleach.render.entity;

import littlebreadloaf.bleach.entities.EntitySmallHollowLizard;
import littlebreadloaf.bleach.render.models.ModelSmallHollowLizard;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;



public class RenderSmallHollowLizard
  extends RenderLiving
{
  private static final ResourceLocation texture1 = new ResourceLocation("bleach".toLowerCase() + ":textures/models/mobs/hollow_lizard_small.png");
  private static final ResourceLocation texture2 = new ResourceLocation("bleach".toLowerCase() + ":textures/models/mobs/hollow_lizard_small2.png");
  private static final ResourceLocation texture3 = new ResourceLocation("bleach".toLowerCase() + ":textures/models/mobs/hollow_lizard_small3.png");
  private static final ResourceLocation texture4 = new ResourceLocation("bleach".toLowerCase() + ":textures/models/mobs/hollow_lizard_small4.png");
  private static final ResourceLocation texture5 = new ResourceLocation("bleach".toLowerCase() + ":textures/models/mobs/hollow_lizard_small5.png");
  private static final ResourceLocation texture6 = new ResourceLocation("bleach".toLowerCase() + ":textures/models/mobs/hollow_lizard_small6.png");
  private static final ResourceLocation texture7 = new ResourceLocation("bleach".toLowerCase() + ":textures/models/mobs/hollow_lizard_small7.png");
  protected ModelSmallHollowLizard model;
  
  public RenderSmallHollowLizard(ModelBase par1ModelBase, float par2)
  {
    super(par1ModelBase, par2);
    this.model = ((ModelSmallHollowLizard)this.mainModel);
  }
  

  public void renderSmallHollowLizard(EntitySmallHollowLizard par1, double par2, double par3, double par4, float par5, float par6)
  {
    super.doRender(par1, par2, par3, par4, par5, par6);
  }
  




  public void doRender(Entity par1, double par2, double par3, double par4, float par5, float par6)
  {
    renderSmallHollowLizard((EntitySmallHollowLizard)par1, par2, par3, par4, par5, par6);
  }
  





  protected void preRenderCallback(EntityLivingBase par1EntityLivingBase, float par2)
  {
    scaleLizard((EntitySmallHollowLizard)par1EntityLivingBase, par2);
  }
  
  protected void scaleLizard(EntitySmallHollowLizard par1, float par2)
  {
    GL11.glScalef(0.4F, 0.4F, 0.4F);
  }
  
  protected ResourceLocation getEntityTexture(Entity entity) {
    switch (((EntitySmallHollowLizard)entity).getTexture())
    {

    case 5: 
      return texture7;
    case 4: 
      return texture6;
    case 3: 
      return texture5;
    case 2: 
      return texture4;
    case 1: 
      return texture3;
    case 0: 
      return texture2; }
    
    return texture1;
  }
}
