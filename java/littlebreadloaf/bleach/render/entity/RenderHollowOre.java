package littlebreadloaf.bleach.render.entity;

import littlebreadloaf.bleach.entities.EntityHollowOre;
import littlebreadloaf.bleach.render.models.ModelHollowOre;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;


public class RenderHollowOre
  extends RenderLiving
{
  private static final ResourceLocation texture1 = new ResourceLocation("bleach".toLowerCase() + ":textures/models/mobs/hollow_ore.png");
  private static final ResourceLocation texture2 = new ResourceLocation("bleach".toLowerCase() + ":textures/models/mobs/hollow_ore2.png");
  private static final ResourceLocation texture3 = new ResourceLocation("bleach".toLowerCase() + ":textures/models/mobs/hollow_ore3.png");
  protected ModelHollowOre model;
  
  public RenderHollowOre(ModelBase par1ModelBase, float par2)
  {
    super(par1ModelBase, par2);
    this.model = ((ModelHollowOre)this.mainModel);
  }
  
  public void renderHollowOre(EntityHollowOre par1, double par2, double par3, double par4, float par5, float par6)
  {
    super.doRender(par1, par2, par3, par4, par5, par6);
  }
  



  public void doRender(Entity par1, double par2, double par3, double par4, float par5, float par6)
  {
    renderHollowOre((EntityHollowOre)par1, par2, par3, par4, par5, par6);
  }
  
  protected ResourceLocation getEntityTexture(Entity entity)
  {
    switch (((EntityHollowOre)entity).getTexture())
    {
    case 0: 
      return texture2;
    case 1: 
      return texture3;
    }
    return texture1;
  }
}
