package littlebreadloaf.bleach.render.models;

import littlebreadloaf.bleach.entities.EntityHollowWolf;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.MathHelper;













public class ModelHollowWolf
  extends ModelBase
{
  ModelRenderer Body;
  ModelRenderer Mane;
  ModelRenderer Ear1;
  ModelRenderer Ear2;
  ModelRenderer WolfHead;
  ModelRenderer Jaw;
  ModelRenderer Nose;
  ModelRenderer Tail1;
  ModelRenderer Tail2;
  ModelRenderer Tail4;
  ModelRenderer Tail3;
  ModelRenderer Tail5;
  ModelRenderer Tail6;
  ModelRenderer upperleg_LF;
  ModelRenderer lower_leg_LF;
  ModelRenderer paw_LF;
  ModelRenderer upperleg_LB;
  ModelRenderer midleg_LB;
  ModelRenderer lower_leg_LB;
  ModelRenderer paw_LB;
  ModelRenderer upperleg_RF;
  ModelRenderer lower_leg_RF;
  ModelRenderer paw_RF;
  ModelRenderer upperleg_RB;
  ModelRenderer midleg_RB;
  ModelRenderer lower_leg_RB;
  ModelRenderer pawRB;
  
  public ModelHollowWolf()
  {
    this.textureWidth = 128;
    this.textureHeight = 128;
    
    this.Body = new ModelRenderer(this, 44, 21);
    this.Body.addBox(-4.0F, -3.0F, -2.0F, 8, 11, 8);
    this.Body.setRotationPoint(0.0F, 12.0F, 3.0F);
    this.Body.setTextureSize(128, 128);
    this.Body.mirror = true;
    setRotation(this.Body, 1.37881F, 0.0F, 0.0F);
    this.Mane = new ModelRenderer(this, 44, 0);
    this.Mane.addBox(-6.0F, -5.0F, -3.0F, 12, 10, 11);
    this.Mane.setRotationPoint(0.0F, 13.0F, -3.0F);
    this.Mane.setTextureSize(128, 128);
    this.Mane.mirror = true;
    setRotation(this.Mane, 1.692969F, 0.0F, 0.0F);
    this.Ear1 = new ModelRenderer(this, 0, 0);
    this.Ear1.addBox(-3.0F, -5.0F, 1.0F, 2, 2, 1);
    this.Ear1.setRotationPoint(0.0F, 9.5F, -11.0F);
    this.Ear1.setTextureSize(128, 128);
    this.Ear1.mirror = true;
    setRotation(this.Ear1, 0.0F, 0.0F, 0.0F);
    this.Ear2 = new ModelRenderer(this, 0, 0);
    this.Ear2.addBox(1.0F, -5.0F, 1.0F, 2, 2, 1);
    this.Ear2.setRotationPoint(0.0F, 9.5F, -11.0F);
    this.Ear2.setTextureSize(128, 128);
    this.Ear2.mirror = true;
    setRotation(this.Ear2, 0.0F, 0.0F, 0.0F);
    this.WolfHead = new ModelRenderer(this, 0, 0);
    this.WolfHead.addBox(-4.0F, -3.0F, -3.0F, 8, 8, 6);
    this.WolfHead.setRotationPoint(0.0F, 9.5F, -11.0F);
    this.WolfHead.setTextureSize(128, 128);
    this.WolfHead.mirror = true;
    setRotation(this.WolfHead, 0.0F, 0.0F, 0.0F);
    this.Jaw = new ModelRenderer(this, 28, 0);
    this.Jaw.addBox(-2.5F, 2.0F, -8.5F, 5, 3, 6);
    this.Jaw.setRotationPoint(0.0F, 9.5F, -11.0F);
    this.Jaw.setTextureSize(128, 128);
    this.Jaw.mirror = true;
    setRotation(this.Jaw, 0.0F, 0.0F, 0.0F);
    this.Nose = new ModelRenderer(this, 0, 14);
    this.Nose.addBox(-3.0F, 0.0F, -9.0F, 6, 4, 6);
    this.Nose.setRotationPoint(0.0F, 9.5F, -11.0F);
    this.Nose.setTextureSize(128, 128);
    this.Nose.mirror = true;
    setRotation(this.Nose, 0.0F, 0.0F, 0.0F);
    this.Tail1 = new ModelRenderer(this, 0, 56);
    this.Tail1.addBox(-1.5F, 0.0F, -1.5F, 3, 3, 3);
    this.Tail1.setRotationPoint(0.0F, 9.0F, 11.0F);
    this.Tail1.setTextureSize(128, 128);
    this.Tail1.mirror = true;
    setRotation(this.Tail1, 1.130069F, 0.0F, 0.0F);
    this.Tail2 = new ModelRenderer(this, 0, 62);
    this.Tail2.addBox(-2.0F, 3.0F, -2.0F, 4, 4, 4);
    this.Tail2.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Tail2.setTextureSize(128, 128);
    this.Tail2.mirror = true;
    setRotation(this.Tail2, 0.0F, 0.0F, 0.0F);
    this.Tail4 = new ModelRenderer(this, 0, 79);
    this.Tail4.addBox(-2.0F, 10.0F, -2.0F, 4, 4, 4);
    this.Tail4.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Tail4.setTextureSize(128, 128);
    this.Tail4.mirror = true;
    setRotation(this.Tail4, 0.0F, 0.0F, 0.0F);
    this.Tail3 = new ModelRenderer(this, 0, 70);
    this.Tail3.addBox(-2.5F, 7.0F, -2.5F, 5, 4, 5);
    this.Tail3.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Tail3.setTextureSize(128, 128);
    this.Tail3.mirror = true;
    setRotation(this.Tail3, 0.0F, 0.0F, 0.0F);
    this.Tail5 = new ModelRenderer(this, 0, 87);
    this.Tail5.addBox(-1.5F, 14.0F, -1.5F, 3, 2, 3);
    this.Tail5.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Tail5.setTextureSize(128, 128);
    this.Tail5.mirror = true;
    setRotation(this.Tail5, 0.0F, 0.0F, 0.0F);
    this.Tail6 = new ModelRenderer(this, 0, 92);
    this.Tail6.addBox(-1.0F, 16.0F, -1.0F, 2, 2, 2);
    this.Tail6.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Tail6.setTextureSize(128, 128);
    this.Tail6.mirror = true;
    setRotation(this.Tail6, 1.130069F, 0.0F, 0.0F);
    this.upperleg_LF = new ModelRenderer(this, 0, 25);
    this.upperleg_LF.addBox(-1.0F, -2.0F, -1.5F, 3, 8, 3);
    this.upperleg_LF.setRotationPoint(5.5F, 11.0F, -5.0F);
    this.upperleg_LF.setTextureSize(128, 128);
    this.upperleg_LF.mirror = true;
    setRotation(this.upperleg_LF, 0.0F, 0.0F, 0.0F);
    this.lower_leg_LF = new ModelRenderer(this, 0, 36);
    this.lower_leg_LF.addBox(-0.5F, 4.0F, -0.5F, 2, 8, 2);
    this.lower_leg_LF.setRotationPoint(0.0F, 1.0F, 0.0F);
    this.lower_leg_LF.setTextureSize(128, 128);
    this.lower_leg_LF.mirror = true;
    setRotation(this.lower_leg_LF, -0.2617994F, 0.0F, 0.0F);
    this.paw_LF = new ModelRenderer(this, 8, 41);
    this.paw_LF.addBox(-1.0F, 11.0F, -5.0F, 3, 2, 3);
    this.paw_LF.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.paw_LF.setTextureSize(128, 128);
    this.paw_LF.mirror = true;
    setRotation(this.paw_LF, 0.2617994F, 0.0F, 0.0F);
    this.upperleg_LB = new ModelRenderer(this, 44, 42);
    this.upperleg_LB.addBox(0.0F, -2.0F, -5.0F, 3, 4, 7);
    this.upperleg_LB.setRotationPoint(4.0F, 10.0F, 8.0F);
    this.upperleg_LB.setTextureSize(128, 128);
    this.upperleg_LB.mirror = true;
    setRotation(this.upperleg_LB, 0.7853982F, 0.0F, 0.0F);
    this.midleg_LB = new ModelRenderer(this, 44, 53);
    this.midleg_LB.addBox(0.5F, 2.0F, -5.0F, 2, 7, 2);
    this.midleg_LB.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.midleg_LB.setTextureSize(128, 128);
    this.midleg_LB.mirror = true;
    setRotation(this.midleg_LB, -0.3490659F, 0.0F, 0.0F);
    this.lower_leg_LB = new ModelRenderer(this, 52, 53);
    this.lower_leg_LB.addBox(-1.0F, 5.0F, -12.0F, 3, 3, 6);
    this.lower_leg_LB.setRotationPoint(1.0F, 0.0F, 0.0F);
    this.lower_leg_LB.setTextureSize(128, 128);
    this.lower_leg_LB.mirror = true;
    setRotation(this.lower_leg_LB, 0.3490659F, 0.0F, 0.0F);
    this.paw_LB = new ModelRenderer(this, 44, 62);
    this.paw_LB.addBox(-0.5F, 12.0F, -7.0F, 4, 2, 5);
    this.paw_LB.setRotationPoint(-1.0F, 0.0F, 0.0F);
    this.paw_LB.setTextureSize(128, 128);
    this.paw_LB.mirror = true;
    setRotation(this.paw_LB, -0.7853982F, 0.0F, 0.0F);
    this.upperleg_RF = new ModelRenderer(this, 0, 25);
    this.upperleg_RF.addBox(-2.0F, -2.0F, -1.5F, 3, 8, 3);
    this.upperleg_RF.setRotationPoint(-5.5F, 11.0F, -5.0F);
    this.upperleg_RF.setTextureSize(128, 128);
    this.upperleg_RF.mirror = true;
    setRotation(this.upperleg_RF, 0.0F, 0.0F, 0.0F);
    this.lower_leg_RF = new ModelRenderer(this, 0, 36);
    this.lower_leg_RF.addBox(-1.5F, 4.0F, -0.5F, 2, 8, 2);
    this.lower_leg_RF.setRotationPoint(0.0F, 1.0F, 0.0F);
    this.lower_leg_RF.setTextureSize(128, 128);
    this.lower_leg_RF.mirror = true;
    setRotation(this.lower_leg_RF, -0.2617994F, 0.0F, 0.0F);
    this.paw_RF = new ModelRenderer(this, 8, 41);
    this.paw_RF.addBox(-2.0F, 11.0F, -5.0F, 3, 2, 3);
    this.paw_RF.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.paw_RF.setTextureSize(128, 128);
    this.paw_RF.mirror = true;
    setRotation(this.paw_RF, 0.2617994F, 0.0F, 0.0F);
    this.upperleg_RB = new ModelRenderer(this, 44, 42);
    this.upperleg_RB.addBox(-3.0F, -2.0F, -5.0F, 3, 4, 7);
    this.upperleg_RB.setRotationPoint(-4.0F, 10.0F, 8.0F);
    this.upperleg_RB.setTextureSize(128, 128);
    this.upperleg_RB.mirror = true;
    setRotation(this.upperleg_RB, 0.7853982F, 0.0F, 0.0F);
    this.midleg_RB = new ModelRenderer(this, 44, 53);
    this.midleg_RB.addBox(-2.5F, 2.0F, -5.0F, 2, 7, 2);
    this.midleg_RB.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.midleg_RB.setTextureSize(128, 128);
    this.midleg_RB.mirror = true;
    setRotation(this.midleg_RB, -0.3490659F, 0.0F, 0.0F);
    this.lower_leg_RB = new ModelRenderer(this, 52, 53);
    this.lower_leg_RB.addBox(-2.0F, 5.0F, -12.0F, 3, 3, 6);
    this.lower_leg_RB.setRotationPoint(-1.0F, 0.0F, 0.0F);
    this.lower_leg_RB.setTextureSize(128, 128);
    this.lower_leg_RB.mirror = true;
    setRotation(this.lower_leg_RB, 0.3490659F, 0.0F, 0.0F);
    this.pawRB = new ModelRenderer(this, 44, 62);
    this.pawRB.addBox(-3.5F, 12.0F, -7.0F, 4, 2, 5);
    this.pawRB.setRotationPoint(1.0F, 0.0F, 0.0F);
    this.pawRB.setTextureSize(128, 128);
    this.pawRB.mirror = true;
    setRotation(this.pawRB, -0.7853982F, 0.0F, 0.0F);
    

    this.Tail1.addChild(this.Tail2);
    this.Tail2.addChild(this.Tail3);
    this.Tail3.addChild(this.Tail4);
    this.Tail4.addChild(this.Tail5);
    this.Tail5.addChild(this.Tail6);
    
    this.upperleg_LF.addChild(this.lower_leg_LF);
    this.upperleg_RF.addChild(this.lower_leg_RF);
    this.upperleg_LB.addChild(this.midleg_LB);
    this.upperleg_RB.addChild(this.midleg_RB);
    this.midleg_LB.addChild(this.lower_leg_LB);
    this.midleg_RB.addChild(this.lower_leg_RB);
    
    this.lower_leg_LF.addChild(this.paw_LF);
    this.lower_leg_RF.addChild(this.paw_RF);
    this.lower_leg_LB.addChild(this.paw_LB);
    this.lower_leg_RB.addChild(this.pawRB);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    this.Body.render(f5);
    this.Mane.render(f5);
    this.Ear1.render(f5);
    this.Ear2.render(f5);
    this.WolfHead.render(f5);
    this.Jaw.render(f5);
    this.Nose.render(f5);
    this.Tail1.render(f5);
    




    this.upperleg_LF.render(f5);
    

    this.upperleg_LB.render(f5);
    


    this.upperleg_RF.render(f5);
    

    this.upperleg_RB.render(f5);
  }
  








  public void setLivingAnimations(EntityLivingBase par1EntityLivingBase, float par2, float par3, float par4) {}
  








  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    
    EntityHollowWolf wolf = (EntityHollowWolf)entity;
    




    if ((entity.motionX == 0.0D) && (entity.motionZ == 0.0D))
    {
      this.Tail1.rotateAngleZ = (0.05F * MathHelper.cos(f2 * 0.06662F));
      this.Tail2.rotateAngleZ = (0.05F * MathHelper.cos(f2 * 0.06662F));
      this.Tail3.rotateAngleZ = (0.05F * MathHelper.cos(f2 * 0.06662F));
      this.Tail4.rotateAngleZ = (0.05F * MathHelper.cos(f2 * 0.06662F));
      this.Tail5.rotateAngleZ = (0.05F * MathHelper.cos(f2 * 0.06662F));
      this.Tail6.rotateAngleZ = (0.05F * MathHelper.cos(f2 * 0.06662F));


    }
    else
    {

      this.Tail1.rotateAngleZ = 0.0F;
      this.Tail2.rotateAngleZ = 0.0F;
      this.Tail3.rotateAngleZ = 0.0F;
      this.Tail4.rotateAngleZ = 0.0F;
      this.Tail5.rotateAngleZ = 0.0F;
      this.Tail6.rotateAngleZ = 0.0F;
      
      this.Tail1.rotateAngleX = (MathHelper.sin(f * 0.3662F) * 0.1F * f1 + 1.130069F);
      this.Tail2.rotateAngleX = (MathHelper.sin(f * 0.3662F) * 0.1F * f1);
      this.Tail3.rotateAngleX = (MathHelper.sin(f * 0.3662F) * 0.1F * f1);
      this.Tail4.rotateAngleX = (MathHelper.sin(f * 0.3662F) * 0.1F * f1);
      this.Tail5.rotateAngleX = (MathHelper.sin(f * 0.3662F) * 0.1F * f1);
      this.Tail6.rotateAngleX = (MathHelper.sin(f * 0.3662F) * 0.1F * f1);
      

      this.upperleg_LF.rotateAngleX = (MathHelper.sin(f * 0.3662F + 1.0471976F) * 0.35F * f1);
      this.lower_leg_LF.rotateAngleX = (MathHelper.sin(f * 0.3662F + 1.0471976F) * 0.35F * f1 - 0.2617994F);
      this.upperleg_RF.rotateAngleX = (MathHelper.sin(f * 0.3662F) * 0.35F * f1);
      this.lower_leg_RF.rotateAngleX = (MathHelper.sin(f * 0.3662F) * 0.35F * f1 - 0.2617994F);
      

      this.upperleg_LB.rotateAngleX = (MathHelper.sin(f * 0.3662F + 2.0943952F) * 0.25F * f1 + 0.7853982F);
      this.upperleg_RB.rotateAngleX = (MathHelper.sin(f * 0.3662F + 3.1415927F) * 0.25F * f1 + 0.7853982F);
      this.midleg_LB.rotateAngleX = (MathHelper.sin(f * 0.3662F + 2.0943952F) * 0.25F * f1 - 0.3490659F);
      this.midleg_RB.rotateAngleX = (MathHelper.sin(f * 0.3662F + 3.1415927F) * 0.25F * f1 - 0.3490659F);
      this.lower_leg_LB.rotateAngleX = (MathHelper.sin(f * 0.3662F + 2.0943952F) * 0.15F * f1 + 0.3490659F);
      this.lower_leg_RB.rotateAngleX = (MathHelper.sin(f * 0.3662F + 3.1415927F) * 0.15F * f1 + 0.3490659F);
    }
  }
}
