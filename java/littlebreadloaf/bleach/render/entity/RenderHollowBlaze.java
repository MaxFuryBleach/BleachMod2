package littlebreadloaf.bleach.render.entity;

import littlebreadloaf.bleach.entities.EntityHollowBlaze;
import littlebreadloaf.bleach.render.models.ModelHollowBlaze;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;


public class RenderHollowBlaze
  extends RenderLiving
{
  private static final ResourceLocation texture1 = new ResourceLocation("bleach".toLowerCase() + ":textures/models/mobs/hollow_blaze.png");
  private static final ResourceLocation texture2 = new ResourceLocation("bleach".toLowerCase() + ":textures/models/mobs/hollow_blaze2.png");
  private static final ResourceLocation texture3 = new ResourceLocation("bleach".toLowerCase() + ":textures/models/mobs/hollow_blaze3.png");
  protected ModelHollowBlaze model;
  
  public RenderHollowBlaze(ModelBase par1ModelBase, float par2)
  {
    super(par1ModelBase, par2);
    this.model = ((ModelHollowBlaze)this.mainModel);
  }
  
  public void renderHollowBlaze(EntityHollowBlaze par1, double par2, double par3, double par4, float par5, float par6)
  {
    super.doRender(par1, par2, par3, par4, par5, par6);
  }
  



  public void doRender(Entity par1, double par2, double par3, double par4, float par5, float par6)
  {
    renderHollowBlaze((EntityHollowBlaze)par1, par2, par3, par4, par5, par6);
  }
  
  protected ResourceLocation getEntityTexture(Entity entity)
  {
    switch (((EntityHollowBlaze)entity).getTexture())
    {
    case 0: 
      return texture2;
    case 1: 
      return texture3;
    }
    return texture1;
  }
}
