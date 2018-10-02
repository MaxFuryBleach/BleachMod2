package littlebreadloaf.bleach.render.models.armor;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;


public class ModelSnakeMask
  extends ModelBiped
{
  ModelRenderer mask;
  ModelRenderer bottom_jaw;
  
  public ModelSnakeMask(float f)
  {
    super(f, 0.0F, 128, 128);
    this.textureWidth = 128;
    this.textureHeight = 128;
    
    this.mask = new ModelRenderer(this, 0, 20);
    this.mask.addBox(-3.3F, -8.5F, -6.3F, 9, 9, 9);
    this.mask.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.mask.setTextureSize(128, 128);
    this.mask.mirror = true;
    setRotation(this.mask, 0.0F, 0.7853982F, 0.0F);
    this.bottom_jaw = new ModelRenderer(this, 0, 39);
    this.bottom_jaw.addBox(-2.5F, -3.0F, -8.5F, 5, 6, 9);
    this.bottom_jaw.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.bottom_jaw.setTextureSize(128, 128);
    this.bottom_jaw.mirror = true;
    setRotation(this.bottom_jaw, 0.0F, 0.0F, 0.0F);
    
    this.bipedHead.addChild(this.mask);
    this.bipedHead.addChild(this.bottom_jaw);
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
