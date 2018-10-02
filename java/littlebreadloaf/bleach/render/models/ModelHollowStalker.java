package littlebreadloaf.bleach.render.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;












public class ModelHollowStalker
  extends ModelBase
{
  public ModelRenderer upperarmR;
  ModelRenderer lowerarmR;
  ModelRenderer thumb1R;
  ModelRenderer thumb2R;
  ModelRenderer finger32R;
  ModelRenderer finger31R;
  ModelRenderer finger11R;
  ModelRenderer finger22R;
  ModelRenderer finger12R;
  ModelRenderer finger21R;
  ModelRenderer leglowerR;
  ModelRenderer legmidR;
  ModelRenderer legupperR;
  ModelRenderer toe1R;
  ModelRenderer toe2R;
  ModelRenderer upperarmL;
  ModelRenderer lowerarmL;
  ModelRenderer thumb1L;
  ModelRenderer thumb2L;
  ModelRenderer finger32L;
  ModelRenderer finger31L;
  ModelRenderer finger11L;
  ModelRenderer finger22L;
  ModelRenderer finger12L;
  ModelRenderer finger21L;
  ModelRenderer lower_torso;
  ModelRenderer upper_torso;
  ModelRenderer tailbone;
  ModelRenderer hips;
  ModelRenderer neck;
  ModelRenderer leglowerL;
  ModelRenderer legmidL;
  ModelRenderer legupperL;
  ModelRenderer toe1L;
  ModelRenderer toe2L;
  ModelRenderer jaw;
  ModelRenderer head;
  ModelRenderer hornLF;
  ModelRenderer hornLB;
  ModelRenderer hornRF;
  ModelRenderer hornRB;
  
  public ModelHollowStalker()
  {
    this.textureWidth = 128;
    this.textureHeight = 128;
    
    this.upperarmR = new ModelRenderer(this, 0, 49);
    this.upperarmR.addBox(-16.0F, -1.0F, -1.0F, 16, 2, 2);
    this.upperarmR.setRotationPoint(-4.0F, -13.0F, 13.0F);
    this.upperarmR.setTextureSize(128, 128);
    this.upperarmR.mirror = true;
    setRotation(this.upperarmR, -0.5235988F, 0.0F, -0.7853982F);
    this.lowerarmR = new ModelRenderer(this, 3, 29);
    this.lowerarmR.addBox(-3.0F, -1.5F, -15.0F, 4, 3, 16);
    this.lowerarmR.setRotationPoint(-15.0F, 0.0F, 0.0F);
    this.lowerarmR.setTextureSize(128, 128);
    this.lowerarmR.mirror = true;
    setRotation(this.lowerarmR, 0.7853982F, 0.7853982F, 0.0F);
    
    this.thumb1R = new ModelRenderer(this, 0, 39);
    this.thumb1R.addBox(-0.5F, -0.5F, -4.5F, 1, 1, 5);
    this.thumb1R.setRotationPoint(0.0F, -0.0F, -0.0F);
    this.thumb1R.setTextureSize(128, 128);
    this.thumb1R.mirror = true;
    setRotation(this.thumb1R, 0.9075712F, 0.296706F, -1.029744F);
    this.thumb2R = new ModelRenderer(this, 8, 40);
    this.thumb2R.addBox(-4.5F, -0.5F, -4.5F, 4, 1, 1);
    this.thumb2R.setRotationPoint(0.0F, -0.0F, -0.0F);
    this.thumb2R.setTextureSize(128, 128);
    this.thumb2R.mirror = true;
    setRotation(this.thumb2R, 0.9075712F, 0.296706F, -1.029744F);
    
    this.finger11R = new ModelRenderer(this, 0, 33);
    this.finger11R.addBox(-0.5F, -0.5F, -5.0F, 1, 1, 5);
    this.finger11R.setRotationPoint(0.5F, -0.7F, -14.0F);
    this.finger11R.setTextureSize(128, 128);
    this.finger11R.mirror = true;
    setRotation(this.finger11R, 0.0F, 0.0F, -0.0F);
    this.finger12R = new ModelRenderer(this, 0, 33);
    this.finger12R.addBox(-0.5F, -0.5F, -6.0F, 1, 4, 1);
    this.finger12R.setRotationPoint(0.5F, -0.7F, -14.0F);
    this.finger12R.setTextureSize(128, 128);
    this.finger12R.mirror = true;
    setRotation(this.finger12R, 0.0F, 0.0F, -0.0F);
    this.finger21R = new ModelRenderer(this, 0, 33);
    this.finger21R.addBox(-0.5F, -0.5F, -5.0F, 1, 1, 5);
    this.finger21R.setRotationPoint(-1.0F, -0.7F, -14.0F);
    this.finger21R.setTextureSize(128, 128);
    this.finger21R.mirror = true;
    setRotation(this.finger21R, -0.07F, 0.0F, -0.0F);
    this.finger22R = new ModelRenderer(this, 0, 33);
    this.finger22R.addBox(-0.5F, -0.5F, -6.0F, 1, 4, 1);
    this.finger22R.setRotationPoint(-1.0F, -0.7F, -14.0F);
    this.finger22R.setTextureSize(128, 128);
    this.finger22R.mirror = true;
    setRotation(this.finger22R, -0.07F, 0.0F, -0.0F);
    this.finger31R = new ModelRenderer(this, 0, 33);
    this.finger31R.addBox(-0.5F, -0.5F, -5.0F, 1, 1, 5);
    this.finger31R.setRotationPoint(-2.5F, -0.7F, -14.0F);
    this.finger31R.setTextureSize(128, 128);
    this.finger31R.mirror = true;
    setRotation(this.finger31R, 0.01F, 0.0F, -0.0F);
    this.finger32R = new ModelRenderer(this, 0, 33);
    this.finger32R.addBox(-0.5F, -0.5F, -6.0F, 1, 4, 1);
    this.finger32R.setRotationPoint(-2.5F, -0.7F, -14.0F);
    this.finger32R.setTextureSize(128, 128);
    this.finger32R.mirror = true;
    setRotation(this.finger32R, 0.01F, 0.0F, -0.0F);
    
    this.leglowerR = new ModelRenderer(this, 104, 80);
    this.leglowerR.addBox(-4.0F, 10.0F, 0.0F, 4, 18, 5);
    this.leglowerR.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.leglowerR.setTextureSize(128, 128);
    this.leglowerR.mirror = true;
    setRotation(this.leglowerR, 0.5235988F, 0.0F, 0.0F);
    this.legmidR = new ModelRenderer(this, 88, 82);
    this.legmidR.addBox(-3.5F, 8.0F, 2.0F, 3, 3, 5);
    this.legmidR.setRotationPoint(-0.0F, -0.0F, 0.0F);
    this.legmidR.setTextureSize(128, 128);
    this.legmidR.mirror = true;
    setRotation(this.legmidR, 0.0F, 0.0F, 0.0F);
    this.legupperR = new ModelRenderer(this, 72, 81);
    this.legupperR.addBox(-4.0F, -1.0F, -2.0F, 4, 12, 4);
    this.legupperR.setRotationPoint(-5.0F, -5.0F, 11.0F);
    this.legupperR.setTextureSize(128, 128);
    this.legupperR.mirror = true;
    setRotation(this.legupperR, -0.7853982F, 0.0F, 0.0F);
    this.toe1R = new ModelRenderer(this, 72, 99);
    this.toe1R.addBox(-3.0F, 24.0F, -15.0F, 2, 3, 5);
    this.toe1R.setRotationPoint(-0.0F, -0.0F, 0.0F);
    this.toe1R.setTextureSize(128, 128);
    this.toe1R.mirror = true;
    setRotation(this.toe1R, 0.4516126F, 0.296F, 0.05F);
    this.toe2R = new ModelRenderer(this, 72, 99);
    this.toe2R.addBox(-3.0F, 24.0F, -15.0F, 2, 3, 5);
    this.toe2R.setRotationPoint(-0.0F, -0.0F, 0.0F);
    this.toe2R.setTextureSize(128, 128);
    this.toe2R.mirror = true;
    setRotation(this.toe2R, 0.5016126F, -0.396F, -0.07F);
    this.upperarmL = new ModelRenderer(this, 0, 49);
    this.upperarmL.addBox(0.0F, -1.0F, -1.0F, 16, 2, 2);
    this.upperarmL.setRotationPoint(4.0F, -13.0F, 13.0F);
    this.upperarmL.setTextureSize(128, 128);
    this.upperarmL.mirror = true;
    setRotation(this.upperarmL, -0.5235988F, 0.0F, 0.7853982F);
    this.lowerarmL = new ModelRenderer(this, 3, 29);
    this.lowerarmL.addBox(-1.0F, -1.5F, -15.0F, 4, 3, 16);
    this.lowerarmL.setRotationPoint(15.0F, 0.0F, 0.0F);
    this.lowerarmL.setTextureSize(128, 128);
    this.lowerarmL.mirror = true;
    setRotation(this.lowerarmL, 0.7853982F, -0.7853982F, 0.0F);
    
    this.thumb1L = new ModelRenderer(this, 0, 39);
    this.thumb1L.addBox(-0.5F, -0.5F, -4.5F, 1, 1, 5);
    this.thumb1L.setRotationPoint(0.0F, -0.0F, -0.0F);
    this.thumb1L.setTextureSize(128, 128);
    this.thumb1L.mirror = true;
    setRotation(this.thumb1L, 0.9075712F, 0.296706F, 1.029744F);
    this.thumb2L = new ModelRenderer(this, 8, 40);
    this.thumb2L.addBox(-4.5F, -0.5F, -4.5F, 4, 1, 1);
    this.thumb2L.setRotationPoint(0.0F, 0.0F, -0.0F);
    this.thumb2L.setTextureSize(128, 128);
    this.thumb2L.mirror = true;
    setRotation(this.thumb2L, 0.9075712F, 0.296706F, 1.029744F);
    
    this.finger11L = new ModelRenderer(this, 0, 33);
    this.finger11L.addBox(-0.5F, -0.5F, -5.0F, 1, 1, 5);
    this.finger11L.setRotationPoint(2.5F, -0.7F, -14.0F);
    this.finger11L.setTextureSize(128, 128);
    this.finger11L.mirror = true;
    setRotation(this.finger11L, -0.03F, 0.0F, -0.0F);
    this.finger12L = new ModelRenderer(this, 0, 33);
    this.finger12L.addBox(-0.5F, -0.5F, -6.0F, 1, 4, 1);
    this.finger12L.setRotationPoint(2.5F, -0.7F, -14.0F);
    this.finger12L.setTextureSize(128, 128);
    this.finger12L.mirror = true;
    setRotation(this.finger12L, -0.03F, 0.0F, -0.0F);
    this.finger21L = new ModelRenderer(this, 0, 33);
    this.finger21L.addBox(-0.5F, -0.5F, -5.0F, 1, 1, 5);
    this.finger21L.setRotationPoint(1.0F, -0.7F, -14.0F);
    this.finger21L.setTextureSize(128, 128);
    this.finger21L.mirror = true;
    setRotation(this.finger21L, 0.06F, 0.0F, -0.0F);
    this.finger22L = new ModelRenderer(this, 0, 33);
    this.finger22L.addBox(-0.5F, -0.5F, -6.0F, 1, 4, 1);
    this.finger22L.setRotationPoint(1.0F, -0.7F, -14.0F);
    this.finger22L.setTextureSize(128, 128);
    this.finger22L.mirror = true;
    setRotation(this.finger22L, 0.06F, 0.0F, -0.0F);
    this.finger31L = new ModelRenderer(this, 0, 33);
    this.finger31L.addBox(-0.5F, -0.5F, -5.0F, 1, 1, 5);
    this.finger31L.setRotationPoint(-0.5F, -0.7F, -14.0F);
    this.finger31L.setTextureSize(128, 128);
    this.finger31L.mirror = true;
    setRotation(this.finger31L, 0.0F, 0.0F, -0.0F);
    this.finger32L = new ModelRenderer(this, 0, 33);
    this.finger32L.addBox(-0.5F, -0.5F, -6.0F, 1, 4, 1);
    this.finger32L.setRotationPoint(-0.5F, -0.7F, -14.0F);
    this.finger32L.setTextureSize(128, 128);
    this.finger32L.mirror = true;
    setRotation(this.finger32L, 0.0F, 0.0F, -0.0F);
    
    this.lower_torso = new ModelRenderer(this, 90, 0);
    this.lower_torso.addBox(-4.0F, -8.0F, 8.0F, 8, 10, 6);
    this.lower_torso.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.lower_torso.setTextureSize(128, 128);
    this.lower_torso.mirror = true;
    setRotation(this.lower_torso, 0.2617994F, 0.0F, 0.0F);
    this.upper_torso = new ModelRenderer(this, 54, 0);
    this.upper_torso.addBox(-5.0F, -14.0F, 9.0F, 10, 10, 8);
    this.upper_torso.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.upper_torso.setTextureSize(128, 128);
    this.upper_torso.mirror = true;
    setRotation(this.upper_torso, 0.2617994F, 0.0F, 0.0F);
    this.tailbone = new ModelRenderer(this, 90, 18);
    this.tailbone.addBox(-1.5F, 2.0F, 9.0F, 3, 7, 4);
    this.tailbone.setRotationPoint(0.0F, -5.0F, 0.0F);
    this.tailbone.setTextureSize(128, 128);
    this.tailbone.mirror = true;
    setRotation(this.tailbone, 0.3141593F, 0.0F, 0.0F);
    this.hips = new ModelRenderer(this, 55, 19);
    this.hips.addBox(-5.0F, -1.0F, 8.0F, 10, 5, 5);
    this.hips.setRotationPoint(0.0F, -5.0F, 0.0F);
    this.hips.setTextureSize(128, 128);
    this.hips.mirror = true;
    setRotation(this.hips, 0.0F, 0.0F, 0.0F);
    this.neck = new ModelRenderer(this, 37, 0);
    this.neck.addBox(-2.0F, -17.0F, 14.0F, 4, 7, 4);
    this.neck.setRotationPoint(0.0F, -5.0F, 0.0F);
    this.neck.setTextureSize(128, 128);
    this.neck.mirror = true;
    setRotation(this.neck, 0.7853982F, 0.0F, 0.0F);
    this.leglowerL = new ModelRenderer(this, 104, 80);
    this.leglowerL.addBox(0.0F, 10.0F, 0.0F, 4, 18, 5);
    this.leglowerL.setRotationPoint(0.0F, -0.0F, 0.0F);
    this.leglowerL.setTextureSize(128, 128);
    this.leglowerL.mirror = true;
    setRotation(this.leglowerL, 0.5235988F, 0.0F, 0.0F);
    this.legmidL = new ModelRenderer(this, 88, 82);
    this.legmidL.addBox(0.5F, 8.0F, 2.0F, 3, 3, 5);
    this.legmidL.setRotationPoint(0.0F, -0.0F, 0.0F);
    this.legmidL.setTextureSize(128, 128);
    this.legmidL.mirror = true;
    setRotation(this.legmidL, 0.0F, 0.0F, 0.0F);
    this.legupperL = new ModelRenderer(this, 72, 81);
    this.legupperL.addBox(0.0F, -1.0F, -2.0F, 4, 12, 4);
    this.legupperL.setRotationPoint(5.0F, -5.0F, 11.0F);
    this.legupperL.setTextureSize(128, 128);
    this.legupperL.mirror = true;
    setRotation(this.legupperL, -0.7853982F, 0.0F, 0.0F);
    this.toe1L = new ModelRenderer(this, 72, 99);
    this.toe1L.addBox(1.0F, 24.0F, -15.0F, 2, 3, 5);
    this.toe1L.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.toe1L.setTextureSize(128, 128);
    this.toe1L.mirror = true;
    setRotation(this.toe1L, 0.4516126F, 0.2961799F, 0.04F);
    this.toe2L = new ModelRenderer(this, 72, 99);
    this.toe2L.addBox(1.0F, 24.0F, -15.0F, 2, 3, 5);
    this.toe2L.setRotationPoint(0.0F, -0.0F, 0.0F);
    this.toe2L.setTextureSize(128, 128);
    this.toe2L.mirror = true;
    setRotation(this.toe2L, 0.4016126F, -0.2667994F, -0.05F);
    this.jaw = new ModelRenderer(this, 0, 16);
    this.jaw.addBox(-3.0F, -1.0F, -7.0F, 6, 3, 4);
    this.jaw.setRotationPoint(0.0F, -28.0F, 0.0F);
    this.jaw.setTextureSize(128, 128);
    this.jaw.mirror = true;
    setRotation(this.jaw, 0.2443461F, 0.0F, 0.0F);
    this.head = new ModelRenderer(this, 0, 0);
    this.head.addBox(-4.0F, -6.0F, -7.0F, 8, 7, 8);
    this.head.setRotationPoint(0.0F, -28.0F, 0.0F);
    this.head.setTextureSize(128, 128);
    this.head.mirror = true;
    setRotation(this.head, -0.0349066F, 0.0F, 0.0F);
    this.hornLF = new ModelRenderer(this, 0, 0);
    this.hornLF.addBox(2.0F, -7.0F, -7.5F, 1, 2, 1);
    this.hornLF.setRotationPoint(0.0F, -28.0F, 0.0F);
    this.hornLF.setTextureSize(128, 128);
    this.hornLF.mirror = true;
    setRotation(this.hornLF, 0.0F, 0.0F, 0.0F);
    this.hornLB = new ModelRenderer(this, 19, 18);
    this.hornLB.addBox(3.0F, -6.5F, -2.0F, 3, 4, 5);
    this.hornLB.setRotationPoint(0.0F, -28.0F, 0.0F);
    this.hornLB.setTextureSize(128, 128);
    this.hornLB.mirror = true;
    setRotation(this.hornLB, 0.2617994F, 0.5235988F, 0.0F);
    this.hornRF = new ModelRenderer(this, 0, 0);
    this.hornRF.addBox(-3.0F, -7.0F, -7.5F, 1, 2, 1);
    this.hornRF.setRotationPoint(0.0F, -28.0F, 0.0F);
    this.hornRF.setTextureSize(128, 128);
    this.hornRF.mirror = true;
    setRotation(this.hornRF, 0.0F, 0.0F, 0.0F);
    this.hornRB = new ModelRenderer(this, 19, 18);
    this.hornRB.addBox(-6.0F, -6.5F, -2.0F, 3, 4, 5);
    this.hornRB.setRotationPoint(0.0F, -28.0F, 0.0F);
    this.hornRB.setTextureSize(128, 128);
    this.hornRB.mirror = true;
    setRotation(this.hornRB, 0.2617994F, -0.5235988F, 0.0F);
    



    this.legupperL.addChild(this.legmidL);
    this.legupperR.addChild(this.legmidR);
    this.legmidL.addChild(this.leglowerL);
    this.legmidR.addChild(this.leglowerR);
    
    this.leglowerL.addChild(this.toe1L);
    this.leglowerL.addChild(this.toe2L);
    this.leglowerR.addChild(this.toe1R);
    this.leglowerR.addChild(this.toe2R);
    
    this.upperarmL.addChild(this.lowerarmL);
    this.upperarmR.addChild(this.lowerarmR);
    
    this.lowerarmR.addChild(this.finger11R);
    this.lowerarmR.addChild(this.finger12R);
    this.lowerarmR.addChild(this.finger21R);
    this.lowerarmR.addChild(this.finger22R);
    this.lowerarmR.addChild(this.finger31R);
    this.lowerarmR.addChild(this.finger32R);
    

    this.finger11R.addChild(this.thumb1R);
    

    this.lowerarmL.addChild(this.finger11L);
    this.lowerarmL.addChild(this.finger12L);
    this.lowerarmL.addChild(this.finger21L);
    this.lowerarmL.addChild(this.finger22L);
    this.lowerarmL.addChild(this.finger31L);
    this.lowerarmL.addChild(this.finger32L);
    

    this.finger31L.addChild(this.thumb1L);
    

    this.hips.addChild(this.lower_torso);
    this.lower_torso.addChild(this.upper_torso);
    this.upper_torso.addChild(this.upperarmL);
    this.upper_torso.addChild(this.upperarmR);
  }
  

  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    











    this.legupperR.render(f5);
    













    this.tailbone.render(f5);
    this.hips.render(f5);
    this.neck.render(f5);
    

    this.legupperL.render(f5);
    

    this.jaw.render(f5);
    this.head.render(f5);
    this.hornLF.render(f5);
    this.hornLB.render(f5);
    this.hornRF.render(f5);
    this.hornRB.render(f5);
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
    if (MathHelper.cos(f * 0.6662F) > 0.0F)
    {
      this.legupperR.rotateAngleX = ((float)(MathHelper.cos(f * 0.6662F) * 0.5F * f1 - 0.75D));
      this.legupperL.rotateAngleX = ((float)(MathHelper.cos(f * 0.6662F + 3.1415927F) * 0.2F * f1 - 0.75D));
    }
    else
    {
      this.legupperL.rotateAngleX = ((float)(MathHelper.cos(f * 0.6662F + 3.1415927F) * 0.5F * f1 - 0.75D));
      this.legupperR.rotateAngleX = ((float)(MathHelper.cos(f * 0.6662F) * 0.2F * f1 - 0.75D));
    }
    


    this.upperarmR.rotateAngleY = (MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5F);
    this.upperarmL.rotateAngleY = (MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5F);
    this.upperarmR.rotateAngleZ = -0.7853982F;
    this.upperarmL.rotateAngleZ = 0.7853982F;
    



    if ((entity.motionX == 0.0D) && (entity.motionZ == 0.0D))
    {
      this.upperarmR.rotateAngleZ = (0.05F * MathHelper.cos(f2 * 0.06662F) - 0.7853982F);
      this.upperarmL.rotateAngleZ = (-0.05F * MathHelper.cos(f2 * 0.06662F) + 0.7853982F);
      
      this.lower_torso.rotateAngleX = (-0.02F * MathHelper.cos(f2 * 0.06662F) + 0.2617994F);
      this.upper_torso.rotateAngleX = (-0.02F * MathHelper.cos(f2 * 0.06662F) + 0.5235988F - 0.2617994F);


    }
    else
    {

      this.upperarmR.rotateAngleZ = -0.7853982F;
      this.upperarmL.rotateAngleZ = 0.7853982F;
    }
  }
}
