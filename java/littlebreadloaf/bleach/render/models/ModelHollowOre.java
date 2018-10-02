package littlebreadloaf.bleach.render.models;

import littlebreadloaf.bleach.entities.EntityHollowOre;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;


public class ModelHollowOre
  extends ModelBase
{
  ModelRenderer body2;
  ModelRenderer tail3;
  ModelRenderer tail1;
  ModelRenderer tail2;
  ModelRenderer body1;
  ModelRenderer body4;
  ModelRenderer body3;
  ModelRenderer armL;
  ModelRenderer finger1L;
  ModelRenderer finger2L;
  ModelRenderer finger3L;
  ModelRenderer upperlegL;
  ModelRenderer lower_legL;
  ModelRenderer toe1L;
  ModelRenderer toe2L;
  ModelRenderer toe3L;
  ModelRenderer armR;
  ModelRenderer finger1R;
  ModelRenderer finger2R;
  ModelRenderer finger3R;
  ModelRenderer upperlegR;
  ModelRenderer lower_legR;
  ModelRenderer toe1R;
  ModelRenderer toe2R;
  ModelRenderer toe3R;
  ModelRenderer head;
  ModelRenderer jaw;
  ModelRenderer mask;
  ModelRenderer fake_ore;
  ModelRenderer lure2;
  ModelRenderer lure1;
  
  public ModelHollowOre()
  {
    this.textureWidth = 128;
    this.textureHeight = 256;
    
    this.body2 = new ModelRenderer(this, 69, 172);
    this.body2.addBox(-8.0F, -15.0F, 1.0F, 16, 16, 13);
    this.body2.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.body2.setTextureSize(128, 256);
    this.body2.mirror = true;
    setRotation(this.body2, -0.4363323F, 0.0F, 0.0F);
    this.tail3 = new ModelRenderer(this, 122, 234);
    this.tail3.addBox(10.0F, 14.0F, -22.0F, 1, 9, 1);
    this.tail3.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.tail3.setTextureSize(128, 256);
    this.tail3.mirror = true;
    setRotation(this.tail3, 2.1816616F, -0.5235988F, 0.0F);
    this.tail1 = new ModelRenderer(this, 122, 234);
    this.tail1.addBox(-11.0F, 14.0F, -22.0F, 1, 9, 1);
    this.tail1.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.tail1.setTextureSize(128, 256);
    this.tail1.mirror = true;
    setRotation(this.tail1, 2.1816616F, 0.5235988F, 0.0F);
    this.tail2 = new ModelRenderer(this, 122, 234);
    this.tail2.addBox(-0.5F, 17.0F, -23.0F, 1, 9, 1);
    this.tail2.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.tail2.setTextureSize(128, 256);
    this.tail2.mirror = true;
    setRotation(this.tail2, 2.1816616F, 0.0F, 0.0F);
    this.body1 = new ModelRenderer(this, 47, 132);
    this.body1.addBox(-10.0F, -15.0F, -12.0F, 20, 20, 20);
    this.body1.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.body1.setTextureSize(128, 256);
    this.body1.mirror = true;
    setRotation(this.body1, -0.5235988F, 0.0F, 0.0F);
    this.body4 = new ModelRenderer(this, 103, 221);
    this.body4.addBox(-3.0F, 6.0F, 21.0F, 6, 6, 6);
    this.body4.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.body4.setTextureSize(128, 256);
    this.body4.mirror = true;
    setRotation(this.body4, 0.5585053F, 0.0F, 0.0F);
    this.body3 = new ModelRenderer(this, 87, 201);
    this.body3.addBox(-5.0F, -9.0F, 14.0F, 10, 10, 10);
    this.body3.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.body3.setTextureSize(128, 256);
    this.body3.mirror = true;
    setRotation(this.body3, 0.3141593F, 0.0F, 0.0F);
    this.armL = new ModelRenderer(this, 0, 132);
    this.armL.addBox(-1.0F, -2.0F, -2.0F, 3, 8, 4);
    this.armL.setRotationPoint(11.0F, 0.0F, 0.0F);
    this.armL.setTextureSize(128, 256);
    this.armL.mirror = true;
    setRotation(this.armL, 0.0F, 0.0F, -0.7853982F);
    this.finger1L = new ModelRenderer(this, 14, 132);
    this.finger1L.addBox(0.0F, 4.0F, 3.0F, 1, 5, 1);
    this.finger1L.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.finger1L.setTextureSize(128, 256);
    this.finger1L.mirror = true;
    setRotation(this.finger1L, -0.7853982F, 0.0F, 0.0F);
    this.finger2L = new ModelRenderer(this, 14, 132);
    this.finger2L.addBox(0.5F, 6.0F, -0.5F, 1, 5, 1);
    this.finger2L.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.finger2L.setTextureSize(128, 256);
    this.finger2L.mirror = true;
    setRotation(this.finger2L, 0.0F, 0.0F, 0.0F);
    this.finger3L = new ModelRenderer(this, 14, 132);
    this.finger3L.addBox(0.0F, 4.0F, -4.0F, 1, 5, 1);
    this.finger3L.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.finger3L.setTextureSize(128, 256);
    this.finger3L.mirror = true;
    setRotation(this.finger3L, 0.7853982F, 0.0F, 0.0F);
    this.upperlegL = new ModelRenderer(this, 0, 145);
    this.upperlegL.addBox(-2.0F, -2.0F, -2.0F, 4, 10, 4);
    this.upperlegL.setRotationPoint(11.0F, 7.0F, 3.0F);
    this.upperlegL.setTextureSize(128, 256);
    this.upperlegL.mirror = true;
    setRotation(this.upperlegL, -0.2617994F, 0.0F, 0.0F);
    this.lower_legL = new ModelRenderer(this, 16, 145);
    this.lower_legL.addBox(-3.5F, 7.0F, -6.0F, 7, 10, 7);
    this.lower_legL.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.lower_legL.setTextureSize(128, 256);
    this.lower_legL.mirror = true;
    setRotation(this.lower_legL, 0.2617994F, 0.0F, 0.0F);
    this.toe1L = new ModelRenderer(this, 0, 160);
    this.toe1L.addBox(1.0F, 16.0F, -9.0F, 2, 1, 4);
    this.toe1L.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.toe1L.setTextureSize(128, 256);
    this.toe1L.mirror = true;
    setRotation(this.toe1L, 0.0F, 0.7853982F, 0.0F);
    this.toe2L = new ModelRenderer(this, 0, 160);
    this.toe2L.addBox(-1.0F, 16.0F, -10.0F, 2, 1, 4);
    this.toe2L.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.toe2L.setTextureSize(128, 256);
    this.toe2L.mirror = true;
    setRotation(this.toe2L, 0.0F, 0.0F, 0.0F);
    this.toe3L = new ModelRenderer(this, 0, 160);
    this.toe3L.addBox(-3.0F, 16.0F, -9.0F, 2, 1, 4);
    this.toe3L.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.toe3L.setTextureSize(128, 256);
    this.toe3L.mirror = true;
    setRotation(this.toe3L, 0.0F, -0.7853982F, 0.0F);
    this.armR = new ModelRenderer(this, 0, 132);
    this.armR.addBox(-2.0F, -2.0F, -2.0F, 3, 8, 4);
    this.armR.setRotationPoint(-11.0F, 0.0F, 0.0F);
    this.armR.setTextureSize(128, 256);
    this.armR.mirror = true;
    setRotation(this.armR, 0.0F, 0.0F, 0.7853982F);
    this.finger1R = new ModelRenderer(this, 14, 132);
    this.finger1R.addBox(-1.0F, 4.0F, 3.0F, 1, 5, 1);
    this.finger1R.setRotationPoint(-0.0F, 0.0F, 0.0F);
    this.finger1R.setTextureSize(128, 256);
    this.finger1R.mirror = true;
    setRotation(this.finger1R, -0.7853982F, 0.0F, 0.0F);
    this.finger2R = new ModelRenderer(this, 14, 132);
    this.finger2R.addBox(-1.5F, 6.0F, -0.5F, 1, 5, 1);
    this.finger2R.setRotationPoint(-0.0F, 0.0F, 0.0F);
    this.finger2R.setTextureSize(128, 256);
    this.finger2R.mirror = true;
    setRotation(this.finger2R, 0.0F, 0.0F, 0.0F);
    this.finger3R = new ModelRenderer(this, 14, 132);
    this.finger3R.addBox(-1.0F, 4.0F, -4.0F, 1, 5, 1);
    this.finger3R.setRotationPoint(-0.0F, 0.0F, 0.0F);
    this.finger3R.setTextureSize(128, 256);
    this.finger3R.mirror = true;
    setRotation(this.finger3R, 0.7853982F, 0.0F, 0.0F);
    this.upperlegR = new ModelRenderer(this, 0, 145);
    this.upperlegR.addBox(-2.0F, -2.0F, -2.0F, 4, 10, 4);
    this.upperlegR.setRotationPoint(-11.0F, 7.0F, 3.0F);
    this.upperlegR.setTextureSize(128, 256);
    this.upperlegR.mirror = true;
    setRotation(this.upperlegR, -0.2617994F, 0.0F, 0.0F);
    this.lower_legR = new ModelRenderer(this, 16, 145);
    this.lower_legR.addBox(-3.5F, 7.0F, -6.0F, 7, 10, 7);
    this.lower_legR.setRotationPoint(-0.0F, 0.0F, 0.0F);
    this.lower_legR.setTextureSize(128, 256);
    this.lower_legR.mirror = true;
    setRotation(this.lower_legR, 0.2617994F, 0.0F, 0.0F);
    this.toe1R = new ModelRenderer(this, 0, 160);
    this.toe1R.addBox(-3.0F, 16.0F, -9.0F, 2, 1, 4);
    this.toe1R.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.toe1R.setTextureSize(128, 256);
    this.toe1R.mirror = true;
    setRotation(this.toe1R, 0.0F, -0.7853982F, 0.0F);
    this.toe2R = new ModelRenderer(this, 0, 160);
    this.toe2R.addBox(-1.0F, 16.0F, -10.0F, 2, 1, 4);
    this.toe2R.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.toe2R.setTextureSize(128, 256);
    this.toe2R.mirror = true;
    setRotation(this.toe2R, 0.0F, 0.0F, 0.0F);
    this.toe3R = new ModelRenderer(this, 0, 160);
    this.toe3R.addBox(1.0F, 16.0F, -9.0F, 2, 1, 4);
    this.toe3R.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.toe3R.setTextureSize(128, 256);
    this.toe3R.mirror = true;
    setRotation(this.toe3R, 0.0F, 0.7853982F, 0.0F);
    this.head = new ModelRenderer(this, 0, 0);
    this.head.addBox(-13.0F, -20.0F, -13.0F, 26, 26, 26);
    this.head.setRotationPoint(0.0F, 0.0F, -15.0F);
    this.head.setTextureSize(128, 256);
    this.head.mirror = true;
    setRotation(this.head, 0.0F, 0.0F, 0.0F);
    this.jaw = new ModelRenderer(this, 0, 95);
    this.jaw.addBox(-13.5F, -8.0F, -15.0F, 27, 17, 19);
    this.jaw.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.jaw.setTextureSize(128, 256);
    this.jaw.mirror = true;
    setRotation(this.jaw, 0.0F, 0.0F, 0.0F);
    this.mask = new ModelRenderer(this, 0, 52);
    this.mask.addBox(-14.0F, -21.0F, -16.0F, 28, 21, 22);
    this.mask.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.mask.setTextureSize(128, 256);
    this.mask.mirror = true;
    setRotation(this.mask, 0.0F, 0.0F, 0.0F);
    this.fake_ore = new ModelRenderer(this, 0, 224);
    this.fake_ore.addBox(-8.0F, -37.0F, -48.0F, 16, 16, 16);
    this.fake_ore.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.fake_ore.setTextureSize(128, 256);
    this.fake_ore.mirror = true;
    setRotation(this.fake_ore, 0.2617994F, 0.0F, 0.0F);
    this.lure2 = new ModelRenderer(this, 91, 54);
    this.lure2.addBox(-2.0F, -26.0F, -40.0F, 4, 4, 14);
    this.lure2.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.lure2.setTextureSize(128, 256);
    this.lure2.mirror = true;
    setRotation(this.lure2, 0.418879F, 0.0F, 0.0F);
    this.lure1 = new ModelRenderer(this, 79, 0);
    this.lure1.addBox(-3.0F, -14.0F, -34.0F, 6, 6, 18);
    this.lure1.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.lure1.setTextureSize(128, 256);
    this.lure1.mirror = true;
    setRotation(this.lure1, -0.6806784F, 0.0F, 0.0F);
    



    this.armL.addChild(this.finger1L);
    this.armL.addChild(this.finger2L);
    this.armL.addChild(this.finger3L);
    
    this.armR.addChild(this.finger1R);
    this.armR.addChild(this.finger2R);
    this.armR.addChild(this.finger3R);
    
    this.upperlegL.addChild(this.lower_legL);
    this.upperlegR.addChild(this.lower_legR);
    
    this.lower_legL.addChild(this.toe1L);
    this.lower_legL.addChild(this.toe2L);
    this.lower_legL.addChild(this.toe3L);
    this.lower_legR.addChild(this.toe1R);
    this.lower_legR.addChild(this.toe2R);
    this.lower_legR.addChild(this.toe3R);
    
    this.body1.addChild(this.body2);
    this.body2.addChild(this.body3);
    this.body3.addChild(this.body4);
    this.body4.addChild(this.tail1);
    this.body4.addChild(this.tail2);
    this.body4.addChild(this.tail3);
    
    this.head.addChild(this.mask);
    this.head.addChild(this.jaw);
    this.head.addChild(this.lure1);
    this.lure1.addChild(this.lure2);
    this.lure2.addChild(this.fake_ore);
  }
  



  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    



    this.body1.render(f5);
    

    this.armL.render(f5);
    


    this.upperlegL.render(f5);
    



    this.armR.render(f5);
    


    this.upperlegR.render(f5);
    



    this.head.render(f5);
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
    

    EntityHollowOre Hollow = (EntityHollowOre)entity;
    

    this.armR.rotateAngleX = (MathHelper.cos(f * 0.3662F + 3.1415927F) * 2.0F * f1 * 0.5F);
    this.armL.rotateAngleX = (MathHelper.cos(f * 0.3662F) * 2.0F * f1 * 0.5F);
    this.armR.rotateAngleY = (MathHelper.cos(f * 0.3662F + 3.1415927F) * f1 * 0.5F);
    this.armL.rotateAngleY = (MathHelper.cos(f * 0.3662F) * f1 * 0.5F);
    
    this.upperlegR.rotateAngleX = (MathHelper.cos(f * 0.4662F) * 0.6F * f1 - 0.2617994F);
    this.upperlegL.rotateAngleX = (MathHelper.cos(f * 0.4662F + 3.1415927F) * 0.6F * f1 - 0.2617994F);
    
    this.lower_legR.rotateAngleX = (-(MathHelper.cos(f * 0.4662F) * 0.2F * f1) + 0.2617994F);
    this.lower_legL.rotateAngleX = (-(MathHelper.cos(f * 0.4662F + 3.1415927F) * 0.2F * f1) + 0.2617994F);
    





    if ((entity.motionX == 0.0D) && (entity.motionZ == 0.0D))
    {
      this.armR.rotateAngleZ = (-0.25F * MathHelper.cos(f2 * 0.06662F * 1.5F) + 0.7853982F);
      this.armL.rotateAngleZ = (0.25F * MathHelper.cos(f2 * 0.06662F * 1.5F) - 0.7853982F);
    }
    

    this.head.rotateAngleX = (-0.025F * MathHelper.cos(f2 * 0.06662F));
    

    this.body1.rotateAngleX = (0.07F * MathHelper.cos(f2 * 0.06662F) - 0.5235988F);
    this.body2.rotateAngleX = (0.07F * MathHelper.cos(f2 * 0.06662F) - 0.4363323F);
    this.body3.rotateAngleX = (0.07F * MathHelper.cos(f2 * 0.06662F) + 0.3141593F);
    this.body4.rotateAngleX = (0.08F * MathHelper.cos(f2 * 0.06662F) + 0.5585053F);
    
    this.jaw.rotateAngleY = (0.02F * MathHelper.cos(f2 * 0.06662F));
    this.jaw.rotateAngleZ = (0.02F * MathHelper.cos(f2 * 0.06662F * 2.0F));
    
    this.mask.rotateAngleX = (0.07F * MathHelper.cos(f2 * 0.06662F));
  }
}
