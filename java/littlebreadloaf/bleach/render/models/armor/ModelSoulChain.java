package littlebreadloaf.bleach.render.models.armor;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;












public class ModelSoulChain
  extends ModelBiped
{
  ModelRenderer soulchainanchor;
  ModelRenderer soulchainchain;
  
  public ModelSoulChain(float f)
  {
    super(f);
    this.textureWidth = 64;
    this.textureHeight = 32;
    
    this.soulchainanchor = new ModelRenderer(this, 24, 4);
    this.soulchainanchor.addBox(1.0F, 1.0F, -2.5F, 3, 3, 1);
    this.soulchainanchor.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.soulchainanchor.setTextureSize(64, 32);
    this.soulchainanchor.mirror = true;
    setRotation(this.soulchainanchor, 0.0F, 0.0F, 0.7853982F);
    this.soulchainchain = new ModelRenderer(this, 0, 0);
    this.soulchainchain.addBox(-1.5F, 4.0F, -2.0F, 3, 7, 0);
    this.soulchainchain.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.soulchainchain.setTextureSize(64, 32);
    this.soulchainchain.mirror = true;
    setRotation(this.soulchainchain, -0.1396263F, 0.0F, -0.7853982F);
    
    this.bipedBody.addChild(this.soulchainanchor);
    this.soulchainanchor.addChild(this.soulchainchain);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }
  

  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }
}
