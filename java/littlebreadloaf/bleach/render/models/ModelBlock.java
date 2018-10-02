package littlebreadloaf.bleach.render.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelBlock
  extends ModelBase
{
  ModelRenderer block;
  
  public ModelBlock()
  {
    this.textureWidth = 16;
    this.textureHeight = 16;
    
    this.block = new ModelRenderer(this, 0, 0);
    this.block.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8);
    this.block.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.block.setTextureSize(16, 16);
    this.block.mirror = true;
    setRotation(this.block, 0.0F, 0.0F, 0.0F);
  }
  

  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    this.block.render(f5);
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
    this.block.rotateAngleX = (-0.25F * MathHelper.cos(f2 * 0.06662F * 1.5F));
    this.block.rotateAngleZ = (-0.35F * MathHelper.sin(f2 * 0.16662F * 1.5F));
  }
}
