package littlebreadloaf.bleach.render.models.armor;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelWolfMask
  extends ModelBiped
{
  ModelRenderer WolfHead;
  ModelRenderer Nose;
  
  public ModelWolfMask(float f)
  {
    super(f, 0.0F, 128, 128);
    this.textureWidth = 128;
    this.textureHeight = 128;
    
    this.WolfHead = new ModelRenderer(this, 0, 0);
    this.WolfHead.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8);
    this.WolfHead.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.WolfHead.setTextureSize(128, 128);
    this.WolfHead.mirror = true;
    setRotation(this.WolfHead, 0.0F, 0.0F, 0.0F);
    this.Nose = new ModelRenderer(this, 0, 20);
    this.Nose.addBox(-3.0F, -5.0F, -8.0F, 6, 4, 6);
    this.Nose.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Nose.setTextureSize(128, 128);
    this.Nose.mirror = true;
    setRotation(this.Nose, 0.0F, 0.0F, 0.0F);
    
    this.bipedHead.addChild(this.WolfHead);
    this.bipedHead.addChild(this.Nose);
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
