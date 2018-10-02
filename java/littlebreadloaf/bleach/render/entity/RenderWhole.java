package littlebreadloaf.bleach.render.entity;

import littlebreadloaf.bleach.entities.EntityWhole;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;



public class RenderWhole
  extends RenderBiped
{
  private static final ResourceLocation texture1 = new ResourceLocation("bleach".toLowerCase() + ":textures/models/mobs/whole.png");
  private static final ResourceLocation texture2 = new ResourceLocation("bleach".toLowerCase() + ":textures/models/mobs/whole1.png");
  private static final ResourceLocation texture3 = new ResourceLocation("bleach".toLowerCase() + ":textures/models/mobs/whole2.png");
  private static final ResourceLocation texture4 = new ResourceLocation("bleach".toLowerCase() + ":textures/models/mobs/whole3.png");
  private static final ResourceLocation texture5 = new ResourceLocation("bleach".toLowerCase() + ":textures/models/mobs/whole4.png");
  private static final ResourceLocation texture6 = new ResourceLocation("bleach".toLowerCase() + ":textures/models/mobs/whole5.png");
  private static final ResourceLocation texture7 = new ResourceLocation("bleach".toLowerCase() + ":textures/models/mobs/whole6.png");
  private static final ResourceLocation texture8 = new ResourceLocation("bleach".toLowerCase() + ":textures/models/mobs/whole7.png");
  private static final ResourceLocation texture9 = new ResourceLocation("bleach".toLowerCase() + ":textures/models/mobs/whole8.png");
  private static final ResourceLocation texture10 = new ResourceLocation("bleach".toLowerCase() + ":textures/models/mobs/whole9.png");
  protected ModelBiped model;
  
  public RenderWhole(ModelBiped par1ModelBase, float par2)
  {
    super(par1ModelBase, par2);
    this.model = ((ModelBiped)this.mainModel);
  }
  
  public void renderWhole(EntityWhole par1, double par2, double par3, double par4, float par5, float par6)
  {
    super.doRender(par1, par2, par3, par4, par5, par6);
  }
  



  public void doRender(Entity par1, double par2, double par3, double par4, float par5, float par6)
  {
    renderWhole((EntityWhole)par1, par2, par3, par4, par5, par6);
  }
  
  protected ResourceLocation getEntityTexture(Entity entity)
  {
    switch (((EntityWhole)entity).getTexture())
    {
    case 0: 
      return texture2;
    case 1: 
      return texture3;
    case 2: 
      return texture4;
    case 3: 
      return texture5;
    case 4: 
      return texture6;
    case 5: 
      return texture7;
    case 6: 
      return texture8;
    case 7: 
      return texture9;
    case 8: 
      return texture10;
    }
    return texture1;
  }
}
