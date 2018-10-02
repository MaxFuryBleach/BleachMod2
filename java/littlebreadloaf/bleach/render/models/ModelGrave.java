package littlebreadloaf.bleach.render.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;


public class ModelGrave
  extends ModelBase
{
  ModelRenderer Shape1;
  ModelRenderer Shape2;
  ModelRenderer Shape3;
  ModelRenderer Shape4;
  ModelRenderer Shape5;
  ModelRenderer Shape6;
  ModelRenderer Shape7;
  ModelRenderer Shape8;
  ModelRenderer Shape9;
  ModelRenderer Shape10;
  ModelRenderer Shape11;
  ModelRenderer Shape12;
  
  public ModelGrave()
  {
    this.textureWidth = 64;
    this.textureHeight = 64;
    
    this.Shape1 = new ModelRenderer(this, 0, 0);
    this.Shape1.addBox(-4.0F, 12.0F, -4.0F, 8, 12, 8);
    this.Shape1.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Shape1.setTextureSize(64, 64);
    this.Shape1.mirror = true;
    setRotation(this.Shape1, 0.0F, 0.0F, 0.0F);
    this.Shape2 = new ModelRenderer(this, 0, 0);
    this.Shape2.addBox(-3.0F, 10.0F, -3.0F, 6, 2, 6);
    this.Shape2.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Shape2.setTextureSize(64, 64);
    this.Shape2.mirror = true;
    setRotation(this.Shape2, 0.0F, 0.0F, 0.0F);
    this.Shape3 = new ModelRenderer(this, 0, 0);
    this.Shape3.addBox(-2.0F, 8.0F, -2.0F, 4, 2, 4);
    this.Shape3.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Shape3.setTextureSize(64, 64);
    this.Shape3.mirror = true;
    setRotation(this.Shape3, 0.0F, 0.0F, 0.0F);
    this.Shape4 = new ModelRenderer(this, 0, 0);
    this.Shape4.addBox(-6.0F, -1.0F, -3.0F, 3, 3, 3);
    this.Shape4.setRotationPoint(0.0F, 24.0F, 0.0F);
    this.Shape4.setTextureSize(64, 64);
    this.Shape4.mirror = true;
    setRotation(this.Shape4, 0.4886922F, 0.3316126F, 0.4886922F);
    this.Shape5 = new ModelRenderer(this, 0, 0);
    this.Shape5.addBox(0.0F, -3.0F, -6.0F, 2, 2, 2);
    this.Shape5.setRotationPoint(0.0F, 24.0F, 0.0F);
    this.Shape5.setTextureSize(64, 64);
    this.Shape5.mirror = true;
    setRotation(this.Shape5, 0.3141593F, -0.296706F, 0.0F);
    this.Shape6 = new ModelRenderer(this, 0, 0);
    this.Shape6.addBox(-1.0F, -4.0F, -5.0F, 4, 2, 2);
    this.Shape6.setRotationPoint(0.0F, 24.0F, 0.0F);
    this.Shape6.setTextureSize(64, 64);
    this.Shape6.mirror = true;
    setRotation(this.Shape6, 0.418879F, 0.3490659F, 0.0174533F);
    this.Shape7 = new ModelRenderer(this, 0, 0);
    this.Shape7.addBox(-5.0F, -1.0F, -5.0F, 1, 1, 1);
    this.Shape7.setRotationPoint(0.0F, 24.0F, 0.0F);
    this.Shape7.setTextureSize(64, 64);
    this.Shape7.mirror = true;
    setRotation(this.Shape7, 0.0F, 0.0F, 0.0F);
    this.Shape8 = new ModelRenderer(this, 0, 0);
    this.Shape8.addBox(0.0F, 3.0F, 3.0F, 2, 2, 2);
    this.Shape8.setRotationPoint(0.0F, 24.0F, 0.0F);
    this.Shape8.setTextureSize(64, 64);
    this.Shape8.mirror = true;
    setRotation(this.Shape8, 0.9599311F, -0.296706F, 0.2268928F);
    this.Shape9 = new ModelRenderer(this, 0, 0);
    this.Shape9.addBox(0.0F, 0.0F, 5.0F, 4, 3, 2);
    this.Shape9.setRotationPoint(0.0F, 24.0F, 0.0F);
    this.Shape9.setTextureSize(64, 64);
    this.Shape9.mirror = true;
    setRotation(this.Shape9, 0.2792527F, 0.5759587F, -0.3141593F);
    this.Shape10 = new ModelRenderer(this, 0, 0);
    this.Shape10.addBox(-1.0F, -1.0F, 5.0F, 1, 1, 1);
    this.Shape10.setRotationPoint(0.0F, 24.0F, 0.0F);
    this.Shape10.setTextureSize(64, 64);
    this.Shape10.mirror = true;
    setRotation(this.Shape10, -0.0174533F, -0.7679449F, 0.5934119F);
    this.Shape11 = new ModelRenderer(this, 0, 0);
    this.Shape11.addBox(2.0F, -4.0F, 0.0F, 3, 3, 3);
    this.Shape11.setRotationPoint(0.0F, 24.0F, 0.0F);
    this.Shape11.setTextureSize(64, 64);
    this.Shape11.mirror = true;
    setRotation(this.Shape11, 0.4886922F, 0.3316126F, 0.4886922F);
    this.Shape12 = new ModelRenderer(this, 0, 0);
    this.Shape12.addBox(0.0F, -1.0F, 7.0F, 1, 1, 1);
    this.Shape12.setRotationPoint(0.0F, 24.0F, 0.0F);
    this.Shape12.setTextureSize(64, 64);
    this.Shape12.mirror = true;
    setRotation(this.Shape12, -0.0174533F, 0.3665191F, 0.0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    this.Shape1.render(f5);
    this.Shape2.render(f5);
    this.Shape3.render(f5);
    this.Shape4.render(f5);
    this.Shape5.render(f5);
    this.Shape6.render(f5);
    this.Shape7.render(f5);
    this.Shape8.render(f5);
    this.Shape9.render(f5);
    this.Shape10.render(f5);
    this.Shape11.render(f5);
    this.Shape12.render(f5);
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
