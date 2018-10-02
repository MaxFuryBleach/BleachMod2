package littlebreadloaf.bleach.render.entity;

import cpw.mods.fml.client.FMLClientHandler;
import littlebreadloaf.bleach.entities.EntityMenosGrande;
import littlebreadloaf.bleach.render.RenderingHelper;
import littlebreadloaf.bleach.render.models.ModelMenosGrande;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;



public class RenderMenosGrande
  extends RenderLiving
{
  private static final ResourceLocation texture = new ResourceLocation("bleach".toLowerCase() + ":textures/models/mobs/menos.png");
  protected ModelMenosGrande model;
  
  public RenderMenosGrande(ModelBase par1ModelBase, float par2)
  {
    super(par1ModelBase, par2);
    this.model = ((ModelMenosGrande)this.mainModel);
  }
  
  public void renderMenosGrande(EntityMenosGrande entity, double x, double y, double z, float par5, float par6)
  {
    super.doRender(entity, x, y, z, par5, par6);
  }
  
  protected void func_110846_a(EntityMenosGrande entity, float x, float y, float z, float par5, float par6, float par7)
  {
    bindEntityTexture(entity);
    
    if (!entity.isInvisible())
    {
      this.mainModel.render(entity, x, y, z, par5, par6, par7);
    }
    else if (!entity.isInvisibleToPlayer(Minecraft.getMinecraft().thePlayer))
    {
      GL11.glPushMatrix();
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.15F);
      GL11.glDepthMask(false);
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      GL11.glAlphaFunc(516, 0.003921569F);
      this.mainModel.render(entity, x, y, z, par5, par6, par7);
      GL11.glDisable(3042);
      GL11.glAlphaFunc(516, 0.1F);
      GL11.glPopMatrix();
      GL11.glDepthMask(true);
    }
    else
    {
      this.mainModel.setRotationAngles(x, y, z, par5, par6, par7, entity);
    }
    
    this.mainModel.setRotationAngles(x, y, z, par5, par6, par7, entity);
    

    int charging = 200 - entity.getChargingProgress();
    
    if (charging > 0)
    {
      FMLClientHandler.instance().getClient().renderEngine.bindTexture(new ResourceLocation("bleach".toLowerCase() + ":/textures/blocks/cero.png"));
      RenderingHelper.drawCeroSphere(entity.posX, entity.posY + entity.getEyeHeight(), entity.posZ, 12.0F, 20, 20, entity);
    }
    
    FMLClientHandler.instance().getClient().renderEngine.bindTexture(new ResourceLocation("bleach".toLowerCase() + ":/models/sphereLamp.png"));
    RenderingHelper.drawCeroSphere(entity.posX, entity.posY + entity.getEyeHeight(), entity.posZ, 12.0F, 20, 20, entity);
  }
  




  protected void renderModel(EntityLivingBase entity, float par2, float par3, float par4, float par5, float par6, float par7)
  {
    func_110846_a((EntityMenosGrande)entity, par2, par3, par4, par5, par6, par7);
  }
  


  public void doRender(Entity par1, double par2, double par3, double par4, float par5, float par6)
  {
    renderMenosGrande((EntityMenosGrande)par1, par2, par3, par4, par5, par6);
  }
  

  protected ResourceLocation getEntityTexture(Entity entity)
  {
    return texture;
  }
}
