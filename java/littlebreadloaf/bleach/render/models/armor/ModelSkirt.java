package littlebreadloaf.bleach.render.models.armor;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;


public class ModelSkirt
  extends ModelBiped
{
  ModelRenderer Shape13;
  ModelRenderer Shape12;
  ModelRenderer Shape11;
  ModelRenderer Shape10;
  ModelRenderer Shape9;
  ModelRenderer Shape8;
  ModelRenderer Shape7;
  ModelRenderer Shape6;
  ModelRenderer Shape5;
  ModelRenderer Shape4;
  ModelRenderer Shape3;
  ModelRenderer Shape2;
  ModelRenderer Shape1;
  ModelRenderer body;
  
  public ModelSkirt(float f)
  {
    super(f, 0.0F, 64, 64);
    this.textureWidth = 64;
    this.textureHeight = 64;
    
    this.Shape13 = new ModelRenderer(this, 4, 18);
    this.Shape13.addBox(-3.0F, 11.0F, 0.5F, 2, 5, 2);
    this.Shape13.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Shape13.setTextureSize(64, 64);
    this.Shape13.mirror = true;
    setRotation(this.Shape13, -0.2792527F, 3.141593F, 0.0F);
    this.Shape12 = new ModelRenderer(this, 4, 18);
    this.Shape12.addBox(-1.0F, 11.5F, -1.0F, 2, 5, 2);
    this.Shape12.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Shape12.setTextureSize(64, 64);
    this.Shape12.mirror = true;
    setRotation(this.Shape12, -0.2792527F, -1.570796F, 0.0F);
    this.Shape11 = new ModelRenderer(this, 4, 18);
    this.Shape11.addBox(-2.5F, 11.5F, -1.0F, 2, 5, 2);
    this.Shape11.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Shape11.setTextureSize(64, 64);
    this.Shape11.mirror = true;
    setRotation(this.Shape11, -0.2792527F, -2.356194F, 0.0F);
    this.Shape10 = new ModelRenderer(this, 4, 18);
    this.Shape10.addBox(0.5F, 11.5F, -1.0F, 2, 5, 2);
    this.Shape10.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Shape10.setTextureSize(64, 64);
    this.Shape10.mirror = true;
    setRotation(this.Shape10, -0.2792527F, -0.7853982F, 0.0F);
    this.Shape9 = new ModelRenderer(this, 4, 18);
    this.Shape9.addBox(1.0F, 11.0F, 0.5F, 2, 5, 2);
    this.Shape9.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Shape9.setTextureSize(64, 64);
    this.Shape9.mirror = true;
    setRotation(this.Shape9, -0.2792527F, 0.0F, 0.0F);
    this.Shape8 = new ModelRenderer(this, 4, 18);
    this.Shape8.addBox(-1.0F, 11.5F, -1.0F, 2, 5, 2);
    this.Shape8.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Shape8.setTextureSize(64, 64);
    this.Shape8.mirror = true;
    setRotation(this.Shape8, -0.2792527F, 1.570796F, 0.0F);
    this.Shape7 = new ModelRenderer(this, 4, 18);
    this.Shape7.addBox(1.0F, 11.0F, 0.5F, 2, 5, 2);
    this.Shape7.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Shape7.setTextureSize(64, 64);
    this.Shape7.mirror = true;
    setRotation(this.Shape7, -0.2792527F, 3.141593F, 0.0F);
    this.Shape6 = new ModelRenderer(this, 4, 18);
    this.Shape6.addBox(-3.0F, 11.0F, 0.5F, 2, 5, 2);
    this.Shape6.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Shape6.setTextureSize(64, 64);
    this.Shape6.mirror = true;
    setRotation(this.Shape6, -0.2792527F, 0.0F, 0.0F);
    this.Shape5 = new ModelRenderer(this, 4, 18);
    this.Shape5.addBox(-2.5F, 11.5F, -1.0F, 2, 5, 2);
    this.Shape5.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Shape5.setTextureSize(64, 64);
    this.Shape5.mirror = true;
    setRotation(this.Shape5, -0.2792527F, 0.7853982F, 0.0F);
    this.Shape4 = new ModelRenderer(this, 4, 18);
    this.Shape4.addBox(0.5F, 11.5F, -1.0F, 2, 5, 2);
    this.Shape4.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Shape4.setTextureSize(64, 64);
    this.Shape4.mirror = true;
    setRotation(this.Shape4, -0.2792527F, 2.356194F, 0.0F);
    this.Shape3 = new ModelRenderer(this, 4, 18);
    this.Shape3.addBox(-1.0F, 11.0F, 1.0F, 2, 5, 2);
    this.Shape3.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Shape3.setTextureSize(64, 64);
    this.Shape3.mirror = true;
    setRotation(this.Shape3, -0.2792527F, 3.141593F, 0.0F);
    this.Shape2 = new ModelRenderer(this, 4, 18);
    this.Shape2.addBox(-1.0F, 11.0F, 1.0F, 2, 5, 2);
    this.Shape2.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Shape2.setTextureSize(64, 64);
    this.Shape2.mirror = true;
    setRotation(this.Shape2, -0.2792527F, 0.0F, 0.0F);
    this.Shape1 = new ModelRenderer(this, 4, 18);
    this.Shape1.addBox(-1.0F, 11.5F, -1.0F, 2, 5, 2);
    this.Shape1.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Shape1.setTextureSize(64, 64);
    this.Shape1.mirror = true;
    setRotation(this.Shape1, -0.2792527F, 1.570796F, 0.0F);
    this.body = new ModelRenderer(this, 16, 16);
    this.body.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4);
    this.body.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.body.setTextureSize(64, 64);
    this.body.mirror = true;
    setRotation(this.body, 0.0F, 0.0F, 0.0F);
    
    this.bipedBody.addChild(this.body);
    this.bipedBody.addChild(this.Shape1);
    this.bipedBody.addChild(this.Shape2);
    this.bipedBody.addChild(this.Shape3);
    this.bipedBody.addChild(this.Shape4);
    this.bipedBody.addChild(this.Shape5);
    this.bipedBody.addChild(this.Shape6);
    this.bipedBody.addChild(this.Shape7);
    this.bipedBody.addChild(this.Shape8);
    this.bipedBody.addChild(this.Shape9);
    this.bipedBody.addChild(this.Shape10);
    this.bipedBody.addChild(this.Shape11);
    this.bipedBody.addChild(this.Shape12);
    this.bipedBody.addChild(this.Shape13);
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
