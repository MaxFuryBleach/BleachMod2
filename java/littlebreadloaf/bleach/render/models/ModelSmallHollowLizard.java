package littlebreadloaf.bleach.render.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;







public class ModelSmallHollowLizard
  extends ModelBase
{
  ModelRenderer body_1;
  ModelRenderer body2;
  ModelRenderer jawL;
  ModelRenderer head_neck;
  ModelRenderer headBack;
  ModelRenderer head2R;
  ModelRenderer eyeL;
  ModelRenderer head4;
  ModelRenderer eyeR;
  ModelRenderer head3;
  ModelRenderer jaw;
  ModelRenderer head2L;
  ModelRenderer jawR;
  ModelRenderer head1;
  ModelRenderer tail4;
  ModelRenderer tail1;
  ModelRenderer tail2;
  ModelRenderer tail3;
  ModelRenderer finger1L;
  ModelRenderer finger3L;
  ModelRenderer finger2L;
  ModelRenderer shoulderL;
  ModelRenderer upperarmL;
  ModelRenderer lowerarmL;
  ModelRenderer lowerlegL;
  ModelRenderer upperlegL;
  ModelRenderer midlegL;
  ModelRenderer toe1L;
  ModelRenderer toe2L;
  ModelRenderer toe3L;
  ModelRenderer finger1R;
  ModelRenderer finger3R;
  ModelRenderer finger2R;
  ModelRenderer shoulderR;
  ModelRenderer upperarmR;
  ModelRenderer lowerarmR;
  ModelRenderer lowerlegR;
  ModelRenderer upperlegR;
  ModelRenderer midlegR;
  ModelRenderer toe1R;
  ModelRenderer toe2R;
  ModelRenderer toe3R;
  
  public ModelSmallHollowLizard()
  {
    this.textureWidth = 128;
    this.textureHeight = 128;
    
    this.body_1 = new ModelRenderer(this, 70, 0);
    this.body_1.addBox(-4.0F, -4.0F, -10.0F, 8, 8, 9);
    this.body_1.setRotationPoint(0.0F, 18.0F, 0.0F);
    this.body_1.setTextureSize(128, 128);
    this.body_1.mirror = true;
    setRotation(this.body_1, 0.0F, 0.0F, 0.0F);
    this.body2 = new ModelRenderer(this, 70, 17);
    this.body2.addBox(-3.5F, -3.5F, -1.0F, 7, 7, 9);
    this.body2.setRotationPoint(0.0F, 18.0F, 0.0F);
    this.body2.setTextureSize(128, 128);
    this.body2.mirror = true;
    setRotation(this.body2, 0.0F, 0.0F, 0.0F);
    this.jawL = new ModelRenderer(this, 15, 15);
    this.jawL.addBox(5.0F, 0.4F, -12.5F, 1, 1, 6);
    this.jawL.setRotationPoint(0.0F, 19.0F, -8.0F);
    this.jawL.setTextureSize(128, 128);
    this.jawL.mirror = true;
    setRotation(this.jawL, 0.0F, 0.3490659F, 0.0F);
    this.head_neck = new ModelRenderer(this, 0, 0);
    this.head_neck.addBox(-3.0F, -4.0F, -8.0F, 6, 6, 8);
    this.head_neck.setRotationPoint(0.0F, 19.0F, -8.0F);
    this.head_neck.setTextureSize(128, 128);
    this.head_neck.mirror = true;
    setRotation(this.head_neck, 0.0F, 0.0F, 0.0F);
    this.headBack = new ModelRenderer(this, 0, 26);
    this.headBack.addBox(-3.5F, -6.0F, -6.0F, 7, 4, 3);
    this.headBack.setRotationPoint(0.0F, 19.0F, -8.0F);
    this.headBack.setTextureSize(128, 128);
    this.headBack.mirror = true;
    setRotation(this.headBack, 0.2617994F, 0.0F, 0.0F);
    this.head2R = new ModelRenderer(this, 33, 12);
    this.head2R.addBox(-7.0F, -2.0F, -13.0F, 2, 2, 8);
    this.head2R.setRotationPoint(0.0F, 19.0F, -8.0F);
    this.head2R.setTextureSize(128, 128);
    this.head2R.mirror = true;
    setRotation(this.head2R, 0.0F, -0.4014257F, 0.0F);
    this.eyeL = new ModelRenderer(this, 44, 0);
    this.eyeL.addBox(2.6F, -6.5F, -11.0F, 3, 3, 7);
    this.eyeL.setRotationPoint(0.0F, 19.0F, -8.0F);
    this.eyeL.setTextureSize(128, 128);
    this.eyeL.mirror = true;
    setRotation(this.eyeL, 0.3316126F, 0.3141593F, 0.0F);
    this.head4 = new ModelRenderer(this, 28, 4);
    this.head4.addBox(-2.0F, -8.0F, -10.0F, 4, 3, 4);
    this.head4.setRotationPoint(0.0F, 19.0F, -8.0F);
    this.head4.setTextureSize(128, 128);
    this.head4.mirror = true;
    setRotation(this.head4, 0.4363323F, 0.0F, 0.0F);
    this.eyeR = new ModelRenderer(this, 44, 22);
    this.eyeR.addBox(-5.6F, -6.5F, -11.0F, 3, 3, 7);
    this.eyeR.setRotationPoint(0.0F, 19.0F, -8.0F);
    this.eyeR.setTextureSize(128, 128);
    this.eyeR.mirror = true;
    setRotation(this.eyeR, 0.3316126F, -0.3141593F, 0.0F);
    this.head3 = new ModelRenderer(this, 36, 0);
    this.head3.addBox(-1.5F, -6.0F, -13.5F, 3, 1, 3);
    this.head3.setRotationPoint(0.0F, 19.0F, -8.0F);
    this.head3.setTextureSize(128, 128);
    this.head3.mirror = true;
    setRotation(this.head3, 0.2617994F, 0.0F, 0.0F);
    this.jaw = new ModelRenderer(this, 0, 15);
    this.jaw.addBox(-1.5F, 0.5F, -14.5F, 3, 1, 8);
    this.jaw.setRotationPoint(0.0F, 19.0F, -8.0F);
    this.jaw.setTextureSize(128, 128);
    this.jaw.mirror = true;
    setRotation(this.jaw, 0.0F, 0.0F, 0.0F);
    this.head2L = new ModelRenderer(this, 33, 12);
    this.head2L.addBox(5.0F, -2.0F, -13.0F, 2, 2, 8);
    this.head2L.setRotationPoint(0.0F, 19.0F, -8.0F);
    this.head2L.setTextureSize(128, 128);
    this.head2L.mirror = true;
    setRotation(this.head2L, 0.0F, 0.4014257F, 0.0F);
    this.jawR = new ModelRenderer(this, 15, 15);
    this.jawR.addBox(-6.0F, 0.4F, -12.5F, 1, 1, 6);
    this.jawR.setRotationPoint(0.0F, 19.0F, -8.0F);
    this.jawR.setTextureSize(128, 128);
    this.jawR.mirror = true;
    setRotation(this.jawR, 0.0F, -0.3490659F, 0.0F);
    this.head1 = new ModelRenderer(this, 27, 0);
    this.head1.addBox(-1.5F, -2.0F, -14.8F, 3, 2, 1);
    this.head1.setRotationPoint(0.0F, 19.0F, -8.0F);
    this.head1.setTextureSize(128, 128);
    this.head1.mirror = true;
    setRotation(this.head1, 0.0F, 0.0F, 0.0F);
    this.tail4 = new ModelRenderer(this, 70, 69);
    this.tail4.addBox(-1.5F, -1.5F, 21.0F, 3, 3, 6);
    this.tail4.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.tail4.setTextureSize(128, 128);
    this.tail4.mirror = true;
    setRotation(this.tail4, 0.0F, 0.0F, 0.0F);
    this.tail1 = new ModelRenderer(this, 70, 33);
    this.tail1.addBox(-3.0F, -3.0F, 0.0F, 6, 6, 8);
    this.tail1.setRotationPoint(0.0F, 18.0F, 8.0F);
    this.tail1.setTextureSize(128, 128);
    this.tail1.mirror = true;
    setRotation(this.tail1, 0.0F, 0.0F, 0.0F);
    this.tail2 = new ModelRenderer(this, 70, 47);
    this.tail2.addBox(-2.5F, -2.5F, 8.0F, 5, 5, 7);
    this.tail2.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.tail2.setTextureSize(128, 128);
    this.tail2.mirror = true;
    setRotation(this.tail2, 0.0F, 0.0F, 0.0F);
    this.tail3 = new ModelRenderer(this, 70, 59);
    this.tail3.addBox(-2.0F, -2.0F, 15.0F, 4, 4, 6);
    this.tail3.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.tail3.setTextureSize(128, 128);
    this.tail3.mirror = true;
    setRotation(this.tail3, 0.0F, 0.0F, 0.0F);
    this.finger1L = new ModelRenderer(this, 0, 55);
    this.finger1L.addBox(3.0F, 5.0F, -3.0F, 1, 1, 4);
    this.finger1L.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.finger1L.setTextureSize(128, 128);
    this.finger1L.mirror = true;
    setRotation(this.finger1L, 0.0F, 0.5235988F, 0.5235988F);
    this.finger3L = new ModelRenderer(this, 0, 55);
    this.finger3L.addBox(2.3F, 5.0F, -6.5F, 1, 1, 4);
    this.finger3L.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.finger3L.setTextureSize(128, 128);
    this.finger3L.mirror = true;
    setRotation(this.finger3L, 0.0F, -0.5235988F, 0.5235988F);
    this.finger2L = new ModelRenderer(this, 0, 55);
    this.finger2L.addBox(3.0F, 5.0F, -5.0F, 1, 1, 4);
    this.finger2L.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.finger2L.setTextureSize(128, 128);
    this.finger2L.mirror = true;
    setRotation(this.finger2L, 0.0F, 0.0F, 0.5235988F);
    this.shoulderL = new ModelRenderer(this, 0, 42);
    this.shoulderL.addBox(-1.0F, -1.5F, -1.5F, 3, 3, 3);
    this.shoulderL.setRotationPoint(4.0F, 0.0F, -9.0F);
    this.shoulderL.setTextureSize(128, 128);
    this.shoulderL.mirror = true;
    setRotation(this.shoulderL, 0.0F, 0.0F, -0.5235988F);
    this.upperarmL = new ModelRenderer(this, 0, 48);
    this.upperarmL.addBox(-0.5F, 1.5F, -1.0F, 2, 2, 2);
    this.upperarmL.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.upperarmL.setTextureSize(128, 128);
    this.upperarmL.mirror = true;
    setRotation(this.upperarmL, 0.0F, 0.0F, 0.0F);
    this.lowerarmL = new ModelRenderer(this, 0, 53);
    this.lowerarmL.addBox(0.0F, 3.0F, 1.0F, 1, 4, 1);
    this.lowerarmL.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.lowerarmL.setTextureSize(128, 128);
    this.lowerarmL.mirror = true;
    setRotation(this.lowerarmL, -0.4537856F, 0.0F, 0.0F);
    this.lowerlegL = new ModelRenderer(this, 0, 74);
    this.lowerlegL.addBox(0.0F, 5.0F, -3.5F, 1, 1, 4);
    this.lowerlegL.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.lowerlegL.setTextureSize(128, 128);
    this.lowerlegL.mirror = true;
    setRotation(this.lowerlegL, 0.8552113F, 0.0F, 0.0F);
    this.upperlegL = new ModelRenderer(this, 0, 61);
    this.upperlegL.addBox(-1.0F, -1.5F, -1.5F, 3, 5, 3);
    this.upperlegL.setRotationPoint(4.0F, 0.0F, 5.0F);
    this.upperlegL.setTextureSize(128, 128);
    this.upperlegL.mirror = true;
    setRotation(this.upperlegL, -0.2617994F, 0.0F, -0.5235988F);
    this.midlegL = new ModelRenderer(this, 0, 69);
    this.midlegL.addBox(-0.5F, 1.5F, 1.5F, 2, 2, 3);
    this.midlegL.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.midlegL.setTextureSize(128, 128);
    this.midlegL.mirror = true;
    setRotation(this.midlegL, 0.0F, 0.0F, 0.0F);
    this.toe1L = new ModelRenderer(this, 0, 55);
    this.toe1L.addBox(2.0F, 5.0F, -2.0F, 1, 1, 4);
    this.toe1L.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.toe1L.setTextureSize(128, 128);
    this.toe1L.mirror = true;
    setRotation(this.toe1L, 0.0F, 0.5235988F, 0.0F);
    this.toe2L = new ModelRenderer(this, 0, 55);
    this.toe2L.addBox(3.0F, 5.0F, -4.0F, 1, 1, 4);
    this.toe2L.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.toe2L.setTextureSize(128, 128);
    this.toe2L.mirror = true;
    setRotation(this.toe2L, -0.5934119F, 0.0F, 0.5235988F);
    this.toe3L = new ModelRenderer(this, 0, 55);
    this.toe3L.addBox(3.3F, 5.0F, -5.5F, 1, 1, 4);
    this.toe3L.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.toe3L.setTextureSize(128, 128);
    this.toe3L.mirror = true;
    setRotation(this.toe3L, 0.0F, -0.5235988F, 0.0F);
    this.finger1R = new ModelRenderer(this, 0, 55);
    this.finger1R.addBox(-4.0F, 5.0F, -3.0F, 1, 1, 4);
    this.finger1R.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.finger1R.setTextureSize(128, 128);
    this.finger1R.mirror = true;
    setRotation(this.finger1R, 0.0F, -0.5235988F, -0.5235988F);
    this.finger3R = new ModelRenderer(this, 0, 55);
    this.finger3R.addBox(-3.3F, 5.0F, -6.5F, 1, 1, 4);
    this.finger3R.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.finger3R.setTextureSize(128, 128);
    this.finger3R.mirror = true;
    setRotation(this.finger3R, 0.0F, 0.5235988F, -0.5235988F);
    this.finger2R = new ModelRenderer(this, 0, 55);
    this.finger2R.addBox(-4.0F, 5.0F, -5.0F, 1, 1, 4);
    this.finger2R.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.finger2R.setTextureSize(128, 128);
    this.finger2R.mirror = true;
    setRotation(this.finger2R, 0.0F, 0.0F, -0.5235988F);
    this.shoulderR = new ModelRenderer(this, 0, 42);
    this.shoulderR.addBox(-2.0F, -1.5F, -1.5F, 3, 3, 3);
    this.shoulderR.setRotationPoint(-4.0F, 0.0F, -9.0F);
    this.shoulderR.setTextureSize(128, 128);
    this.shoulderR.mirror = true;
    setRotation(this.shoulderR, 0.0F, 0.0F, 0.5235988F);
    this.upperarmR = new ModelRenderer(this, 0, 48);
    this.upperarmR.addBox(-1.5F, 1.5F, -1.0F, 2, 2, 2);
    this.upperarmR.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.upperarmR.setTextureSize(128, 128);
    this.upperarmR.mirror = true;
    setRotation(this.upperarmR, 0.0F, 0.0F, 0.0F);
    this.lowerarmR = new ModelRenderer(this, 0, 53);
    this.lowerarmR.addBox(-1.0F, 3.0F, 1.0F, 1, 4, 1);
    this.lowerarmR.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.lowerarmR.setTextureSize(128, 128);
    this.lowerarmR.mirror = true;
    setRotation(this.lowerarmR, -0.4537856F, 0.0F, 0.0F);
    this.lowerlegR = new ModelRenderer(this, 0, 74);
    this.lowerlegR.addBox(-1.0F, 5.0F, -3.5F, 1, 1, 4);
    this.lowerlegR.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.lowerlegR.setTextureSize(128, 128);
    this.lowerlegR.mirror = true;
    setRotation(this.lowerlegR, 0.8552113F, 0.0F, 0.0F);
    this.upperlegR = new ModelRenderer(this, 0, 61);
    this.upperlegR.addBox(-2.0F, -1.5F, -1.5F, 3, 5, 3);
    this.upperlegR.setRotationPoint(-4.0F, 0.0F, 5.0F);
    this.upperlegR.setTextureSize(128, 128);
    this.upperlegR.mirror = true;
    setRotation(this.upperlegR, -0.2617994F, 0.0F, 0.5235988F);
    this.midlegR = new ModelRenderer(this, 0, 69);
    this.midlegR.addBox(-1.5F, 1.5F, 1.5F, 2, 2, 3);
    this.midlegR.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.midlegR.setTextureSize(128, 128);
    this.midlegR.mirror = true;
    setRotation(this.midlegR, 0.0F, 0.0F, 0.0F);
    this.toe1R = new ModelRenderer(this, 0, 55);
    this.toe1R.addBox(-3.0F, 5.0F, -2.0F, 1, 1, 4);
    this.toe1R.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.toe1R.setTextureSize(128, 128);
    this.toe1R.mirror = true;
    setRotation(this.toe1R, 0.0F, -0.5235988F, 0.0F);
    this.toe2R = new ModelRenderer(this, 0, 55);
    this.toe2R.addBox(-4.0F, 5.0F, -4.0F, 1, 1, 4);
    this.toe2R.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.toe2R.setTextureSize(128, 128);
    this.toe2R.mirror = true;
    setRotation(this.toe2R, -0.5934119F, 0.0F, -0.5235988F);
    this.toe3R = new ModelRenderer(this, 0, 55);
    this.toe3R.addBox(-4.3F, 5.0F, -5.5F, 1, 1, 4);
    this.toe3R.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.toe3R.setTextureSize(128, 128);
    this.toe3R.mirror = true;
    setRotation(this.toe3R, 0.0F, 0.5235988F, 0.0F);
    
    this.body_1.addChild(this.shoulderL);
    this.shoulderL.addChild(this.upperarmL);
    this.upperarmL.addChild(this.lowerarmL);
    this.body_1.addChild(this.shoulderR);
    this.shoulderR.addChild(this.upperarmR);
    this.upperarmR.addChild(this.lowerarmR);
    
    this.upperarmL.addChild(this.finger1L);
    this.upperarmL.addChild(this.finger2L);
    this.upperarmL.addChild(this.finger3L);
    this.upperarmR.addChild(this.finger1R);
    this.upperarmR.addChild(this.finger2R);
    this.upperarmR.addChild(this.finger3R);
    

    this.body2.addChild(this.upperlegL);
    this.upperlegL.addChild(this.midlegL);
    this.midlegL.addChild(this.lowerlegL);
    this.body2.addChild(this.upperlegR);
    this.upperlegR.addChild(this.midlegR);
    this.midlegR.addChild(this.lowerlegR);
    
    this.lowerlegL.addChild(this.toe2L);
    this.toe2L.addChild(this.toe1L);
    this.toe2L.addChild(this.toe3L);
    
    this.lowerlegR.addChild(this.toe2R);
    this.toe2R.addChild(this.toe1R);
    this.toe2R.addChild(this.toe3R);
    


    this.tail1.addChild(this.tail2);
    this.tail2.addChild(this.tail3);
    this.tail3.addChild(this.tail4);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    this.body_1.render(f5);
    this.body2.render(f5);
    this.jawL.render(f5);
    this.head_neck.render(f5);
    this.headBack.render(f5);
    this.head2R.render(f5);
    this.eyeL.render(f5);
    this.head4.render(f5);
    this.eyeR.render(f5);
    this.head3.render(f5);
    this.jaw.render(f5);
    this.head2L.render(f5);
    this.jawR.render(f5);
    this.head1.render(f5);
    
    this.tail1.render(f5);
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
    



    if ((entity.motionX == 0.0D) && (entity.motionZ == 0.0D))
    {
      this.tail1.rotateAngleY = (0.05F * MathHelper.cos(f2 * 0.06662F));
      this.tail2.rotateAngleY = (0.05F * MathHelper.cos(f2 * 0.06662F));
      this.tail3.rotateAngleY = (0.05F * MathHelper.cos(f2 * 0.06662F));
      this.tail4.rotateAngleY = (0.05F * MathHelper.cos(f2 * 0.06662F));
      

      this.tail1.rotateAngleX = -0.1F;
      this.tail2.rotateAngleX = -0.075F;
      this.tail3.rotateAngleX = -0.01F;
      this.tail4.rotateAngleX = 0.0F;
      

      this.body_1.rotateAngleZ = 0.0F;
      this.body2.rotateAngleZ = 0.0F;


    }
    else
    {


      this.tail1.rotateAngleX = 0.0F;
      this.tail2.rotateAngleX = 0.0F;
      this.tail3.rotateAngleX = 0.0F;
      this.tail4.rotateAngleX = 0.0F;
      
      this.body_1.rotateAngleZ = (MathHelper.sin(f * 0.3662F) * 0.2F * f1);
      this.body2.rotateAngleZ = (MathHelper.cos(f * 0.3662F) * 0.2F * f1);
      
      this.tail1.rotateAngleY = (MathHelper.sin(f * 0.3662F) * 0.1F * f1);
      this.tail2.rotateAngleY = (MathHelper.sin(f * 0.3662F) * 0.1F * f1);
      this.tail3.rotateAngleY = (MathHelper.sin(f * 0.3662F) * 0.1F * f1);
      this.tail4.rotateAngleY = (MathHelper.sin(f * 0.3662F) * 0.1F * f1);
      

      this.shoulderL.rotateAngleX = (MathHelper.sin(f * 0.3662F) * 0.3F * f1);
      this.upperarmL.rotateAngleX = (MathHelper.sin(f * 0.3662F) * 0.2F * f1);
      this.lowerarmL.rotateAngleX = (MathHelper.sin(f * 0.3662F) * 0.1F * f1 - 0.4537856F);
      this.shoulderR.rotateAngleX = (-MathHelper.sin(f * 0.3662F) * 0.3F * f1);
      this.upperarmR.rotateAngleX = (-MathHelper.sin(f * 0.3662F) * 0.2F * f1);
      this.lowerarmR.rotateAngleX = (-MathHelper.sin(f * 0.3662F) * 0.1F * f1 - 0.4537856F);
      

      this.upperlegL.rotateAngleX = (MathHelper.cos(f * 0.3662F) * 0.3F * f1 - 0.2617994F);
      this.midlegL.rotateAngleX = (MathHelper.cos(f * 0.3662F) * 0.2F * f1);
      this.lowerlegL.rotateAngleX = (MathHelper.cos(f * 0.3662F) * 0.1F * f1 + 0.8552113F);
      this.upperlegR.rotateAngleX = (-MathHelper.cos(f * 0.3662F) * 0.3F * f1 - 0.2617994F);
      this.midlegR.rotateAngleX = (-MathHelper.cos(f * 0.3662F) * 0.2F * f1);
      this.lowerlegR.rotateAngleX = (-MathHelper.cos(f * 0.3662F) * 0.1F * f1 + 0.8552113F);
    }
  }
}
