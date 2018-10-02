package littlebreadloaf.bleach.render.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;



public class ModelHollowWasp
  extends ModelBase
{
  ModelRenderer mainbody;
  ModelRenderer midsection;
  ModelRenderer stinger1;
  ModelRenderer neck;
  ModelRenderer legBL;
  ModelRenderer legML;
  ModelRenderer legFL;
  ModelRenderer legBR;
  ModelRenderer legMR;
  ModelRenderer legFR;
  ModelRenderer stinger;
  ModelRenderer stinger2;
  ModelRenderer stinger4;
  ModelRenderer Stinger3;
  ModelRenderer head;
  ModelRenderer mask;
  ModelRenderer mouth;
  ModelRenderer wingL;
  ModelRenderer wingR;
  private float rotatewings;
  private float rotatebody;
  private float rotatelegs;
  
  public ModelHollowWasp()
  {
    this.textureWidth = 128;
    this.textureHeight = 64;
    
    this.mainbody = new ModelRenderer(this, 37, 0);
    this.mainbody.addBox(-3.0F, -3.0F, 0.0F, 6, 6, 6);
    this.mainbody.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.mainbody.setTextureSize(128, 64);
    this.mainbody.mirror = true;
    setRotation(this.mainbody, 0.0F, 0.0F, 0.0F);
    this.midsection = new ModelRenderer(this, 61, 0);
    this.midsection.addBox(-1.0F, -5.0F, 3.0F, 2, 2, 8);
    this.midsection.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.midsection.setTextureSize(128, 64);
    this.midsection.mirror = true;
    setRotation(this.midsection, -0.7853982F, 0.0F, 0.0F);
    this.stinger1 = new ModelRenderer(this, 76, 0);
    this.stinger1.addBox(-2.0F, 8.0F, 5.0F, 4, 2, 4);
    this.stinger1.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.stinger1.setTextureSize(128, 64);
    this.stinger1.mirror = true;
    setRotation(this.stinger1, 0.4363323F, 0.0F, 0.0F);
    this.neck = new ModelRenderer(this, 24, 0);
    this.neck.addBox(-1.0F, -2.0F, -4.0F, 2, 2, 4);
    this.neck.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.neck.setTextureSize(128, 64);
    this.neck.mirror = true;
    setRotation(this.neck, 0.0F, 0.0F, 0.0F);
    this.legBL = new ModelRenderer(this, 21, 28);
    this.legBL.addBox(3.0F, -1.0F, 4.5F, 5, 1, 1);
    this.legBL.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.legBL.setTextureSize(128, 64);
    this.legBL.mirror = true;
    setRotation(this.legBL, 0.0F, -0.2268928F, 0.6853982F);
    this.legML = new ModelRenderer(this, 21, 28);
    this.legML.addBox(3.0F, -1.0F, 2.5F, 5, 1, 1);
    this.legML.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.legML.setTextureSize(128, 64);
    this.legML.mirror = true;
    setRotation(this.legML, 0.0F, 0.0F, 0.7853982F);
    this.legFL = new ModelRenderer(this, 21, 28);
    this.legFL.addBox(3.0F, -1.0F, 0.5F, 5, 1, 1);
    this.legFL.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.legFL.setTextureSize(128, 64);
    this.legFL.mirror = true;
    setRotation(this.legFL, 0.0F, 0.2268928F, 0.7853982F);
    this.legBR = new ModelRenderer(this, 21, 26);
    this.legBR.addBox(-8.0F, -1.0F, 4.5F, 5, 1, 1);
    this.legBR.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.legBR.setTextureSize(128, 64);
    this.legBR.mirror = true;
    setRotation(this.legBR, 0.0F, 0.2268928F, -0.7853982F);
    this.legMR = new ModelRenderer(this, 21, 26);
    this.legMR.addBox(-8.0F, -1.0F, 2.5F, 5, 1, 1);
    this.legMR.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.legMR.setTextureSize(128, 64);
    this.legMR.mirror = true;
    setRotation(this.legMR, 0.0F, 0.0F, -0.7853982F);
    this.legFR = new ModelRenderer(this, 21, 26);
    this.legFR.addBox(-8.0F, -1.0F, 0.5F, 5, 1, 1);
    this.legFR.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.legFR.setTextureSize(128, 64);
    this.legFR.mirror = true;
    setRotation(this.legFR, 0.0F, -0.2268928F, -0.7853982F);
    this.stinger = new ModelRenderer(this, 68, 14);
    this.stinger.addBox(-0.5F, 10.5F, 4.0F, 1, 1, 2);
    this.stinger.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.stinger.setTextureSize(128, 64);
    this.stinger.mirror = true;
    setRotation(this.stinger, 0.0F, 0.0F, 0.0F);
    this.stinger2 = new ModelRenderer(this, 92, 0);
    this.stinger2.addBox(-2.5F, 8.0F, 6.5F, 5, 4, 5);
    this.stinger2.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.stinger2.setTextureSize(128, 64);
    this.stinger2.mirror = true;
    setRotation(this.stinger2, 0.2617994F, 0.0F, 0.0F);
    this.stinger4 = new ModelRenderer(this, 58, 14);
    this.stinger4.addBox(-1.0F, 11.0F, 4.0F, 2, 2, 2);
    this.stinger4.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.stinger4.setTextureSize(128, 64);
    this.stinger4.mirror = true;
    setRotation(this.stinger4, 0.1745329F, 0.0F, 0.0F);
    this.Stinger3 = new ModelRenderer(this, 39, 12);
    this.Stinger3.addBox(-1.5F, 12.0F, -2.466667F, 3, 4, 6);
    this.Stinger3.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.Stinger3.setTextureSize(128, 64);
    this.Stinger3.mirror = true;
    setRotation(this.Stinger3, 0.7853982F, 0.0F, 0.0F);
    this.head = new ModelRenderer(this, 0, 0);
    this.head.addBox(-2.5F, -2.0F, -2.0F, 5, 5, 4);
    this.head.setRotationPoint(0.0F, -1.0F, -5.0F);
    this.head.setTextureSize(128, 64);
    this.head.mirror = true;
    setRotation(this.head, -0.5235988F, 0.0F, 0.0F);
    this.mask = new ModelRenderer(this, 0, 9);
    this.mask.addBox(-3.0F, -3.0F, -1.5F, 6, 6, 5);
    this.mask.setRotationPoint(0.0F, -1.0F, -6.0F);
    this.mask.setTextureSize(128, 64);
    this.mask.mirror = true;
    setRotation(this.mask, -0.5235988F, 0.0F, 0.0F);
    this.mouth = new ModelRenderer(this, 0, 21);
    this.mouth.addBox(-2.0F, 1.0F, -4.0F, 4, 3, 4);
    this.mouth.setRotationPoint(0.0F, -1.0F, -5.0F);
    this.mouth.setTextureSize(128, 64);
    this.mouth.mirror = true;
    setRotation(this.mouth, 0.1919862F, 0.0F, 0.0F);
    this.wingL = new ModelRenderer(this, 21, 24);
    this.wingL.addBox(0.0F, -11.0F, -1.0F, 0, 12, 8);
    this.wingL.setRotationPoint(2.0F, -3.0F, 1.0F);
    this.wingL.setTextureSize(128, 64);
    this.wingL.mirror = true;
    setRotation(this.wingL, 0.2617994F, 0.0F, 1.5235988F);
    this.wingR = new ModelRenderer(this, 21, 36);
    this.wingR.addBox(0.0F, -11.0F, -1.0F, 0, 12, 8);
    this.wingR.setRotationPoint(-2.0F, -3.0F, 1.0F);
    this.wingR.setTextureSize(128, 64);
    this.wingR.mirror = true;
    setRotation(this.wingR, 0.2617994F, 0.0F, -1.5235988F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    this.mainbody.render(f5);
    this.midsection.render(f5);
    this.stinger1.render(f5);
    this.neck.render(f5);
    this.legBL.render(f5);
    this.legML.render(f5);
    this.legFL.render(f5);
    this.legBR.render(f5);
    this.legMR.render(f5);
    this.legFR.render(f5);
    this.stinger.render(f5);
    this.stinger2.render(f5);
    this.stinger4.render(f5);
    this.Stinger3.render(f5);
    this.head.render(f5);
    this.mask.render(f5);
    this.mouth.render(f5);
    this.wingL.render(f5);
    this.wingR.render(f5);
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
    
    if (this.wingR.rotateAngleZ > 0.1D)
    {
      this.rotatewings = (0.17F * (MathHelper.cos(f1 * 1.3F) * 3.1415927F * 0.25F));
    }
    else if (this.wingR.rotateAngleZ < -1.5D)
    {
      this.rotatewings = (-(0.17F * (MathHelper.cos(f1 * 1.3F) * 3.1415927F * 0.25F)));
    }
    this.wingR.rotateAngleZ -= this.rotatewings;
    this.wingL.rotateAngleZ = (-this.wingR.rotateAngleZ);
    

    if (this.midsection.rotateAngleX > -0.8D)
    {
      this.rotatebody = (7.0E-4F * (MathHelper.cos(f1 * 1.3F) * 3.1415927F * 0.25F));
    }
    else if (this.midsection.rotateAngleX < -1.1D)
    {
      this.rotatebody = (-(7.0E-4F * (MathHelper.cos(f1 * 1.3F) * 3.1415927F * 0.25F)));
    }
    this.midsection.rotateAngleX -= 0.8F * this.rotatebody;
    this.stinger.rotateAngleX -= 0.6F * this.rotatebody;
    this.stinger1.rotateAngleX -= 0.6F * this.rotatebody;
    this.stinger2.rotateAngleX -= 0.6F * this.rotatebody;
    this.Stinger3.rotateAngleX -= 0.5F * this.rotatebody;
    this.stinger4.rotateAngleX -= 0.5F * this.rotatebody;
    this.mainbody.rotateAngleX -= 0.4F * this.rotatebody;
    

    if (this.legBL.rotateAngleX > -0.1D)
    {
      this.rotatelegs = (9.0E-4F * (MathHelper.cos(f1 * 1.3F) * 3.1415927F * 0.25F));
    }
    else if (this.legBL.rotateAngleX < -0.2D)
    {
      this.rotatelegs = (-(9.0E-4F * (MathHelper.cos(f1 * 1.3F) * 3.1415927F * 0.25F)));
    }
    this.legBL.rotateAngleX -= 0.8F * this.rotatelegs;
    this.legBL.rotateAngleZ += 0.7F * this.rotatelegs;
    this.legBR.rotateAngleX += 0.8F * this.rotatelegs;
    this.legBR.rotateAngleZ -= 0.7F * this.rotatelegs;
    this.legML.rotateAngleX += 0.5F * this.rotatelegs;
    this.legML.rotateAngleZ -= 0.4F * this.rotatelegs;
    this.legMR.rotateAngleX -= 0.5F * this.rotatelegs;
    this.legMR.rotateAngleZ += 0.4F * this.rotatelegs;
    this.legFL.rotateAngleX -= 0.6F * this.rotatelegs;
    this.legFL.rotateAngleZ += 0.7F * this.rotatelegs;
    this.legFR.rotateAngleX += 0.6F * this.rotatelegs;
    this.legFR.rotateAngleZ -= 0.7F * this.rotatelegs;
  }
}
