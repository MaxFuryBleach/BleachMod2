package littlebreadloaf.bleach.render.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelHollowGolem
  extends ModelBase
{
  ModelRenderer uppertorso;
  ModelRenderer FR_spike;
  ModelRenderer FL_spike;
  ModelRenderer BL_spike;
  ModelRenderer BR_spike;
  ModelRenderer lower_torso;
  ModelRenderer head;
  ModelRenderer mask;
  ModelRenderer upper_arm_R;
  ModelRenderer lower_arm_R;
  ModelRenderer shoulderR;
  ModelRenderer lower_arm_armor_R;
  ModelRenderer armor_R_shoulder;
  ModelRenderer lower_leg_R;
  ModelRenderer upper_leg_R;
  ModelRenderer upper_arm_L;
  ModelRenderer lower_arm_L;
  ModelRenderer shoulderL;
  ModelRenderer lower_arm_armor_L;
  ModelRenderer armor_L_shoulder;
  ModelRenderer lower_leg_L;
  ModelRenderer upper_leg_L;
  
  public ModelHollowGolem()
  {
    this.textureWidth = 128;
    this.textureHeight = 128;
    
    this.uppertorso = new ModelRenderer(this, 64, 0);
    this.uppertorso.addBox(-8.0F, -7.0F, -7.0F, 16, 16, 16);
    this.uppertorso.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.uppertorso.setTextureSize(128, 128);
    this.uppertorso.mirror = true;
    setRotation(this.uppertorso, 0.0F, 0.0F, 0.0F);
    this.FR_spike = new ModelRenderer(this, 71, 0);
    this.FR_spike.addBox(-5.0F, -14.0F, -5.0F, 2, 9, 2);
    this.FR_spike.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FR_spike.setTextureSize(128, 128);
    this.FR_spike.mirror = true;
    setRotation(this.FR_spike, -0.7853982F, -0.3490659F, 0.0F);
    this.FL_spike = new ModelRenderer(this, 71, 0);
    this.FL_spike.addBox(2.0F, -14.0F, -5.0F, 2, 9, 2);
    this.FL_spike.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.FL_spike.setTextureSize(128, 128);
    this.FL_spike.mirror = true;
    setRotation(this.FL_spike, -0.7853982F, 0.3490659F, 0.0F);
    this.BL_spike = new ModelRenderer(this, 63, 0);
    this.BL_spike.addBox(1.0F, -19.0F, 2.0F, 2, 9, 2);
    this.BL_spike.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.BL_spike.setTextureSize(128, 128);
    this.BL_spike.mirror = true;
    setRotation(this.BL_spike, -0.7853982F, 0.2617994F, 0.0F);
    this.BR_spike = new ModelRenderer(this, 63, 0);
    this.BR_spike.addBox(-4.0F, -19.0F, 2.0F, 2, 9, 2);
    this.BR_spike.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.BR_spike.setTextureSize(128, 128);
    this.BR_spike.mirror = true;
    setRotation(this.BR_spike, -0.7853982F, -0.2617994F, 0.0F);
    this.lower_torso = new ModelRenderer(this, 81, 32);
    this.lower_torso.addBox(-3.0F, 9.0F, -4.0F, 6, 5, 10);
    this.lower_torso.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.lower_torso.setTextureSize(128, 128);
    this.lower_torso.mirror = true;
    setRotation(this.lower_torso, 0.0F, 0.0F, 0.0F);
    this.head = new ModelRenderer(this, 0, 0);
    this.head.addBox(-5.0F, -7.0F, -5.0F, 10, 10, 10);
    this.head.setRotationPoint(0.0F, -5.0F, -6.0F);
    this.head.setTextureSize(128, 128);
    this.head.mirror = true;
    setRotation(this.head, 0.0F, 0.0F, 0.0F);
    this.mask = new ModelRenderer(this, 0, 21);
    this.mask.addBox(-4.0F, -8.2F, -6.0F, 10, 10, 10);
    this.mask.setRotationPoint(0.0F, -5.0F, -6.0F);
    this.mask.setTextureSize(128, 128);
    this.mask.mirror = true;
    setRotation(this.mask, 0.2094395F, 0.7853982F, 0.2094395F);
    this.upper_arm_R = new ModelRenderer(this, 3, 65);
    this.upper_arm_R.addBox(-2.0F, 4.0F, 0.0F, 3, 9, 3);
    this.upper_arm_R.setRotationPoint(-10.0F, -6.0F, 0.0F);
    this.upper_arm_R.setTextureSize(128, 128);
    this.upper_arm_R.mirror = true;
    setRotation(this.upper_arm_R, 0.0F, 0.0F, 0.2617994F);
    this.lower_arm_R = new ModelRenderer(this, 0, 79);
    this.lower_arm_R.addBox(-4.0F, 9.0F, -16.0F, 6, 7, 13);
    this.lower_arm_R.setRotationPoint(-10.0F, -6.0F, 0.0F);
    this.lower_arm_R.setTextureSize(128, 128);
    this.lower_arm_R.mirror = true;
    setRotation(this.lower_arm_R, 0.5235988F, 0.0F, 0.2617994F);
    this.shoulderR = new ModelRenderer(this, 0, 49);
    this.shoulderR.addBox(-5.0F, -3.0F, -2.0F, 7, 7, 7);
    this.shoulderR.setRotationPoint(-10.0F, -6.0F, 0.0F);
    this.shoulderR.setTextureSize(128, 128);
    this.shoulderR.mirror = true;
    setRotation(this.shoulderR, 0.0F, 0.0F, 0.0F);
    this.lower_arm_armor_R = new ModelRenderer(this, 36, 99);
    this.lower_arm_armor_R.addBox(-4.5F, 8.5F, -16.5F, 7, 8, 14);
    this.lower_arm_armor_R.setRotationPoint(-10.0F, -6.0F, 0.0F);
    this.lower_arm_armor_R.setTextureSize(128, 128);
    this.lower_arm_armor_R.mirror = true;
    setRotation(this.lower_arm_armor_R, 0.5235988F, 0.0F, 0.2617994F);
    this.armor_R_shoulder = new ModelRenderer(this, 38, 81);
    this.armor_R_shoulder.addBox(-6.0F, -4.0F, -3.0F, 9, 7, 9);
    this.armor_R_shoulder.setRotationPoint(-10.0F, -6.0F, 0.0F);
    this.armor_R_shoulder.setTextureSize(128, 128);
    this.armor_R_shoulder.mirror = true;
    setRotation(this.armor_R_shoulder, 0.0F, 0.0F, 0.0F);
    this.lower_leg_R = new ModelRenderer(this, 87, 48);
    this.lower_leg_R.addBox(-4.0F, 4.0F, -7.0F, 6, 9, 8);
    this.lower_leg_R.setRotationPoint(-4.0F, 11.0F, 2.0F);
    this.lower_leg_R.setTextureSize(128, 128);
    this.lower_leg_R.mirror = true;
    setRotation(this.lower_leg_R, 0.0F, 0.0F, 0.0F);
    this.upper_leg_R = new ModelRenderer(this, 68, 48);
    this.upper_leg_R.addBox(-3.0F, -1.0F, -2.0F, 4, 9, 5);
    this.upper_leg_R.setRotationPoint(-4.0F, 11.0F, 2.0F);
    this.upper_leg_R.setTextureSize(128, 128);
    this.upper_leg_R.mirror = true;
    setRotation(this.upper_leg_R, -0.7853982F, 0.0F, 0.0F);
    this.upper_arm_L = new ModelRenderer(this, 3, 65);
    this.upper_arm_L.addBox(0.0F, 4.0F, 0.0F, 3, 9, 3);
    this.upper_arm_L.setRotationPoint(10.0F, -6.0F, 0.0F);
    this.upper_arm_L.setTextureSize(128, 128);
    this.upper_arm_L.mirror = true;
    setRotation(this.upper_arm_L, 0.0F, 0.0F, -0.2617994F);
    this.lower_arm_L = new ModelRenderer(this, 0, 79);
    this.lower_arm_L.addBox(-1.0F, 9.0F, -16.0F, 6, 7, 13);
    this.lower_arm_L.setRotationPoint(10.0F, -6.0F, 0.0F);
    this.lower_arm_L.setTextureSize(128, 128);
    this.lower_arm_L.mirror = true;
    setRotation(this.lower_arm_L, 0.5235988F, 0.0F, -0.2617994F);
    this.shoulderL = new ModelRenderer(this, 0, 49);
    this.shoulderL.addBox(-2.0F, -3.0F, -2.0F, 7, 7, 7);
    this.shoulderL.setRotationPoint(10.0F, -6.0F, 0.0F);
    this.shoulderL.setTextureSize(128, 128);
    this.shoulderL.mirror = true;
    setRotation(this.shoulderL, 0.0F, 0.0F, 0.0F);
    this.lower_arm_armor_L = new ModelRenderer(this, 78, 99);
    this.lower_arm_armor_L.addBox(-1.5F, 8.5F, -16.5F, 7, 8, 14);
    this.lower_arm_armor_L.setRotationPoint(10.0F, -6.0F, 0.0F);
    this.lower_arm_armor_L.setTextureSize(128, 128);
    this.lower_arm_armor_L.mirror = true;
    setRotation(this.lower_arm_armor_L, 0.5235988F, 0.0F, -0.2617994F);
    this.armor_L_shoulder = new ModelRenderer(this, 0, 99);
    this.armor_L_shoulder.addBox(-3.0F, -4.0F, -3.0F, 9, 7, 9);
    this.armor_L_shoulder.setRotationPoint(10.0F, -6.0F, 0.0F);
    this.armor_L_shoulder.setTextureSize(128, 128);
    this.armor_L_shoulder.mirror = true;
    setRotation(this.armor_L_shoulder, 0.0F, 0.0F, 0.0F);
    this.lower_leg_L = new ModelRenderer(this, 87, 48);
    this.lower_leg_L.addBox(-2.0F, 4.0F, -7.0F, 6, 9, 8);
    this.lower_leg_L.setRotationPoint(4.0F, 11.0F, 2.0F);
    this.lower_leg_L.setTextureSize(128, 128);
    this.lower_leg_L.mirror = true;
    setRotation(this.lower_leg_L, 0.0F, 0.0F, 0.0F);
    this.upper_leg_L = new ModelRenderer(this, 68, 48);
    this.upper_leg_L.addBox(-1.0F, -1.0F, -2.0F, 4, 9, 5);
    this.upper_leg_L.setRotationPoint(4.0F, 11.0F, 2.0F);
    this.upper_leg_L.setTextureSize(128, 128);
    this.upper_leg_L.mirror = true;
    setRotation(this.upper_leg_L, -0.7853982F, 0.0F, 0.0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    this.uppertorso.render(f5);
    this.FR_spike.render(f5);
    this.FL_spike.render(f5);
    this.BL_spike.render(f5);
    this.BR_spike.render(f5);
    this.lower_torso.render(f5);
    this.head.render(f5);
    this.mask.render(f5);
    this.upper_arm_R.render(f5);
    this.lower_arm_R.render(f5);
    this.shoulderR.render(f5);
    this.lower_arm_armor_R.render(f5);
    this.armor_R_shoulder.render(f5);
    this.lower_leg_R.render(f5);
    this.upper_leg_R.render(f5);
    this.upper_arm_L.render(f5);
    this.lower_arm_L.render(f5);
    this.shoulderL.render(f5);
    this.lower_arm_armor_L.render(f5);
    this.armor_L_shoulder.render(f5);
    this.lower_leg_L.render(f5);
    this.upper_leg_L.render(f5);
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
    this.mask.rotateAngleZ = 0.165F;
    
    this.upper_arm_R.rotateAngleX = (MathHelper.cos(f * 0.6662F + 3.1415927F) * 2.0F * f1 * 0.5F);
    this.upper_arm_L.rotateAngleX = (MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5F);
    this.upper_arm_R.rotateAngleZ = 0.3F;
    this.upper_arm_L.rotateAngleZ = -0.3F;
    this.lower_arm_R.rotateAngleX = (MathHelper.cos(f * 0.6662F + 3.1415927F) * 2.0F * f1 * 0.5F + 0.52F);
    this.lower_arm_L.rotateAngleX = (MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5F + 0.52F);
    this.lower_arm_R.rotateAngleZ = 0.27F;
    this.lower_arm_L.rotateAngleZ = -0.27F;
    this.lower_arm_armor_R.rotateAngleX = (MathHelper.cos(f * 0.6662F + 3.1415927F) * 2.0F * f1 * 0.5F + 0.52F);
    this.lower_arm_armor_L.rotateAngleX = (MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5F + 0.52F);
    this.lower_arm_armor_R.rotateAngleZ = 0.27F;
    this.lower_arm_armor_L.rotateAngleZ = -0.27F;
    
    this.upper_leg_R.rotateAngleX = ((float)(MathHelper.cos(f * 0.6662F) * 1.4F * f1 - 0.75D));
    this.upper_leg_L.rotateAngleX = ((float)(MathHelper.cos(f * 0.6662F + 3.1415927F) * 1.4F * f1 - 0.75D));
    this.upper_leg_R.rotateAngleY = 0.0F;
    this.upper_leg_L.rotateAngleY = 0.0F;
    this.lower_leg_R.rotateAngleX = (MathHelper.cos(f * 0.6662F) * 1.4F * f1);
    this.lower_leg_L.rotateAngleX = (MathHelper.cos(f * 0.6662F + 3.1415927F) * 1.4F * f1);
    this.lower_leg_R.rotateAngleY = 0.0F;
    this.lower_leg_L.rotateAngleY = 0.0F;
  }
}
