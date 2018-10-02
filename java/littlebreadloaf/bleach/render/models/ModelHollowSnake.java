package littlebreadloaf.bleach.render.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelHollowSnake
  extends ModelBase
{
  ModelRenderer head_top;
  ModelRenderer mask;
  ModelRenderer bottom_jaw;
  ModelRenderer neck;
  ModelRenderer uppertorso;
  ModelRenderer lowertorso;
  ModelRenderer L_lower_arm;
  ModelRenderer L_upper_arm;
  ModelRenderer Lshoulder;
  ModelRenderer R_lower_arm;
  ModelRenderer R_upper_arm;
  ModelRenderer Rshoulder;
  ModelRenderer waist1;
  ModelRenderer waist2;
  ModelRenderer waist3;
  ModelRenderer waist4;
  ModelRenderer tail1;
  ModelRenderer tail2;
  ModelRenderer tail3;
  ModelRenderer tail4;
  
  public ModelHollowSnake()
  {
    this.textureWidth = 128;
    this.textureHeight = 128;
    
    this.head_top = new ModelRenderer(this, 0, 0);
    this.head_top.addBox(-13.3F, -44.0F, 5.0F, 8, 8, 8);
    this.head_top.setRotationPoint(-3.0F, 17.0F, -12.0F);
    this.head_top.setTextureSize(128, 128);
    this.head_top.mirror = true;
    setRotation(this.head_top, 0.2617994F, 0.7679449F, 0.2600541F);
    this.mask = new ModelRenderer(this, 0, 20);
    this.mask.addBox(-13.8F, -44.5F, 4.5F, 9, 9, 9);
    this.mask.setRotationPoint(-3.0F, 17.0F, -12.0F);
    this.mask.setTextureSize(128, 128);
    this.mask.mirror = true;
    setRotation(this.mask, 0.2617994F, 0.7679449F, 0.2600541F);
    this.bottom_jaw = new ModelRenderer(this, 0, 39);
    this.bottom_jaw.addBox(-2.5F, -39.0F, -7.0F, 5, 6, 9);
    this.bottom_jaw.setRotationPoint(0.0F, 17.0F, -5.0F);
    this.bottom_jaw.setTextureSize(128, 128);
    this.bottom_jaw.mirror = true;
    setRotation(this.bottom_jaw, 0.0F, 0.0F, 0.0F);
    this.neck = new ModelRenderer(this, 48, 0);
    this.neck.addBox(-3.0F, -32.0F, 25.0F, 6, 11, 8);
    this.neck.setRotationPoint(0.0F, 17.0F, -3.0F);
    this.neck.setTextureSize(128, 128);
    this.neck.mirror = true;
    setRotation(this.neck, 0.7853982F, 0.0F, 0.0F);
    this.uppertorso = new ModelRenderer(this, 80, 0);
    this.uppertorso.addBox(-6.0F, -30.0F, 13.0F, 12, 10, 12);
    this.uppertorso.setRotationPoint(0.0F, 17.0F, -3.0F);
    this.uppertorso.setTextureSize(128, 128);
    this.uppertorso.mirror = true;
    setRotation(this.uppertorso, 0.4712389F, 0.0F, 0.0F);
    this.lowertorso = new ModelRenderer(this, 43, 21);
    this.lowertorso.addBox(-4.0F, -30.0F, -4.0F, 8, 17, 8);
    this.lowertorso.setRotationPoint(0.0F, 17.0F, -3.0F);
    this.lowertorso.setTextureSize(128, 128);
    this.lowertorso.mirror = true;
    setRotation(this.lowertorso, -0.2617994F, 0.0F, 0.0F);
    this.L_lower_arm = new ModelRenderer(this, 1, 68);
    this.L_lower_arm.addBox(7.5F, -8.0F, 11.0F, 5, 5, 15);
    this.L_lower_arm.setRotationPoint(0.0F, 17.0F, -3.0F);
    this.L_lower_arm.setTextureSize(128, 128);
    this.L_lower_arm.mirror = true;
    setRotation(this.L_lower_arm, 1.047198F, 0.0F, 0.0F);
    this.L_upper_arm = new ModelRenderer(this, 0, 68);
    this.L_upper_arm.addBox(8.0F, -31.0F, 6.0F, 4, 8, 4);
    this.L_upper_arm.setRotationPoint(0.0F, 17.0F, -3.0F);
    this.L_upper_arm.setTextureSize(128, 128);
    this.L_upper_arm.mirror = true;
    setRotation(this.L_upper_arm, 0.0F, 0.0F, 0.0F);
    this.Lshoulder = new ModelRenderer(this, 0, 54);
    this.Lshoulder.addBox(6.0F, -38.0F, 5.0F, 7, 7, 7);
    this.Lshoulder.setRotationPoint(0.0F, 17.0F, -3.0F);
    this.Lshoulder.setTextureSize(128, 128);
    this.Lshoulder.mirror = true;
    setRotation(this.Lshoulder, 0.0F, 0.0F, 0.0F);
    this.R_lower_arm = new ModelRenderer(this, 1, 102);
    this.R_lower_arm.addBox(-12.5F, -8.0F, 11.0F, 5, 5, 15);
    this.R_lower_arm.setRotationPoint(0.0F, 17.0F, -3.0F);
    this.R_lower_arm.setTextureSize(128, 128);
    this.R_lower_arm.mirror = true;
    setRotation(this.R_lower_arm, 1.047198F, 0.0F, 0.0F);
    this.R_upper_arm = new ModelRenderer(this, 0, 102);
    this.R_upper_arm.addBox(-12.0F, -31.0F, 6.0F, 4, 8, 4);
    this.R_upper_arm.setRotationPoint(0.0F, 17.0F, -3.0F);
    this.R_upper_arm.setTextureSize(128, 128);
    this.R_upper_arm.mirror = true;
    setRotation(this.R_upper_arm, 0.0F, 0.0F, 0.0F);
    this.Rshoulder = new ModelRenderer(this, 0, 88);
    this.Rshoulder.addBox(-13.0F, -38.0F, 5.0F, 7, 7, 7);
    this.Rshoulder.setRotationPoint(0.0F, 17.0F, -3.0F);
    this.Rshoulder.setTextureSize(128, 128);
    this.Rshoulder.mirror = true;
    setRotation(this.Rshoulder, 0.0F, 0.0F, 0.0F);
    this.waist1 = new ModelRenderer(this, 77, 25);
    this.waist1.addBox(-5.5F, -11.0F, -13.0F, 11, 7, 11);
    this.waist1.setRotationPoint(0.0F, 17.0F, 3.0F);
    this.waist1.setTextureSize(128, 128);
    this.waist1.mirror = true;
    setRotation(this.waist1, -0.5235988F, 0.0F, 0.0F);
    this.waist2 = new ModelRenderer(this, 47, 46);
    this.waist2.addBox(-5.0F, -8.5F, -5.5F, 10, 8, 10);
    this.waist2.setRotationPoint(0.0F, 17.0F, -3.0F);
    this.waist2.setTextureSize(128, 128);
    this.waist2.mirror = true;
    setRotation(this.waist2, -0.2617994F, 0.0F, 0.0F);
    this.waist3 = new ModelRenderer(this, 87, 44);
    this.waist3.addBox(-4.5F, -2.0F, -5.0F, 9, 3, 10);
    this.waist3.setRotationPoint(0.0F, 17.0F, -3.0F);
    this.waist3.setTextureSize(128, 128);
    this.waist3.mirror = true;
    setRotation(this.waist3, 0.0F, 0.0F, 0.0F);
    this.waist4 = new ModelRenderer(this, 41, 65);
    this.waist4.addBox(-4.0F, -2.5F, -4.0F, 8, 8, 9);
    this.waist4.setRotationPoint(0.0F, 17.0F, -3.0F);
    this.waist4.setTextureSize(128, 128);
    this.waist4.mirror = true;
    setRotation(this.waist4, 0.7853982F, 0.0F, 0.0F);
    this.tail1 = new ModelRenderer(this, 77, 65);
    this.tail1.addBox(-3.5F, -5.0F, -2.0F, 7, 7, 10);
    this.tail1.setRotationPoint(0.0F, 22.0F, 0.0F);
    this.tail1.setTextureSize(128, 128);
    this.tail1.mirror = true;
    setRotation(this.tail1, 0.0F, 0.0F, 0.0F);
    this.tail2 = new ModelRenderer(this, 77, 65);
    this.tail2.addBox(-3.5F, -5.0F, 8.0F, 7, 7, 10);
    this.tail2.setRotationPoint(0.0F, 22.0F, 0.0F);
    this.tail2.setTextureSize(128, 128);
    this.tail2.mirror = true;
    setRotation(this.tail2, 0.0F, 0.0F, 0.0F);
    this.tail3 = new ModelRenderer(this, 45, 83);
    this.tail3.addBox(-3.0F, -4.0F, 18.0F, 6, 6, 10);
    this.tail3.setRotationPoint(0.0F, 22.0F, 0.0F);
    this.tail3.setTextureSize(128, 128);
    this.tail3.mirror = true;
    setRotation(this.tail3, 0.0F, 0.0F, 0.0F);
    this.tail4 = new ModelRenderer(this, 86, 82);
    this.tail4.addBox(-2.0F, -2.0F, 28.0F, 4, 4, 8);
    this.tail4.setRotationPoint(0.0F, 22.0F, 0.0F);
    this.tail4.setTextureSize(128, 128);
    this.tail4.mirror = true;
    setRotation(this.tail4, 0.0F, 0.0F, 0.0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    this.head_top.render(f5);
    this.mask.render(f5);
    this.bottom_jaw.render(f5);
    this.neck.render(f5);
    this.uppertorso.render(f5);
    this.lowertorso.render(f5);
    this.L_lower_arm.render(f5);
    this.L_upper_arm.render(f5);
    this.Lshoulder.render(f5);
    this.R_lower_arm.render(f5);
    this.R_upper_arm.render(f5);
    this.Rshoulder.render(f5);
    this.waist1.render(f5);
    this.waist2.render(f5);
    this.waist3.render(f5);
    this.waist4.render(f5);
    this.tail1.render(f5);
    this.tail2.render(f5);
    this.tail3.render(f5);
    this.tail4.render(f5);
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
    this.R_upper_arm.rotateAngleX = (-MathHelper.cos(f * 0.6662F) * 1.0F * f1 * 0.23F);
    this.L_upper_arm.rotateAngleX = (-MathHelper.cos(f * 0.6662F) * 1.0F * f1 * 0.23F);
    this.R_lower_arm.rotateAngleX = (-MathHelper.cos(f * 0.6662F) * 1.0F * f1 * 0.23F + 1.0F);
    this.L_lower_arm.rotateAngleX = (-MathHelper.cos(f * 0.6662F) * 1.0F * f1 * 0.23F + 1.0F);
    this.Lshoulder.rotateAngleX = (-MathHelper.cos(f * 0.6662F) * 1.0F * f1 * 0.21F);
    this.Rshoulder.rotateAngleX = (-MathHelper.cos(f * 0.6662F) * 1.0F * f1 * 0.21F);
    
    this.uppertorso.rotateAngleX = (-MathHelper.cos(f * 0.6662F) * 1.0F * f1 * 0.17F + 0.4712389F);
    this.lowertorso.rotateAngleX = (-MathHelper.cos(f * 0.6662F) * 1.0F * f1 * 0.2F - 0.2617994F);
    this.waist1.rotateAngleX = (-MathHelper.cos(f * 0.6662F) * 1.0F * f1 * 0.2F - 0.5235988F);
    this.waist2.rotateAngleX = (-MathHelper.cos(f * 0.6662F) * 1.0F * f1 * 0.2F - 0.2617994F);
    this.neck.rotateAngleX = (-MathHelper.cos(f * 0.6662F) * 1.0F * f1 * 0.16F + 0.78F);
    this.bottom_jaw.rotateAngleX = (-MathHelper.cos(f * 0.6662F) * 1.0F * f1 * 0.1F);
    
    this.head_top.rotateAngleX = (-MathHelper.cos(f * 0.6662F) * f1 * 0.2F + 0.2617994F);
    this.mask.rotateAngleX = (-MathHelper.cos(f * 0.6662F) * f1 * 0.2F + 0.2617994F);
    this.head_top.rotateAngleZ = (-MathHelper.cos(f * 0.6662F) * f1 * 0.1F + 0.2617994F);
    this.mask.rotateAngleZ = (-MathHelper.cos(f * 0.6662F) * f1 * 0.1F + 0.2617994F);
    






    this.tail1.rotateAngleY = (MathHelper.cos(f * 0.6662F + 3.1415927F) * 0.1F * f1 * 0.5F);
    this.tail2.rotateAngleY = (MathHelper.cos(f * 0.6662F + 3.1415927F) * 0.3F * f1 * 0.5F);
    this.tail3.rotateAngleY = (MathHelper.cos(f * 0.6662F + 3.1415927F) * 0.5F * f1 * 0.5F);
    this.tail4.rotateAngleY = (MathHelper.cos(f * 0.6662F + 3.1415927F) * 0.7F * f1 * 0.5F);
  }
}
