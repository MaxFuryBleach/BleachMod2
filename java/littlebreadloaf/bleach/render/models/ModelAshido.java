package littlebreadloaf.bleach.render.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;


public class ModelAshido
  extends ModelBase
{
  ModelRenderer body;
  ModelRenderer rightarm;
  ModelRenderer leftarm;
  ModelRenderer rightleg;
  ModelRenderer leftleg;
  ModelRenderer hairback;
  ModelRenderer furarmR;
  ModelRenderer furarmL;
  ModelRenderer head;
  ModelRenderer mask3;
  ModelRenderer mask1;
  ModelRenderer eyeR;
  ModelRenderer mask5;
  ModelRenderer mask2;
  ModelRenderer eyeL;
  ModelRenderer horn3R;
  ModelRenderer horn1R;
  ModelRenderer horn2R;
  ModelRenderer horn1L;
  ModelRenderer horn2L;
  ModelRenderer horn3L;
  ModelRenderer hair2;
  ModelRenderer hair1;
  ModelRenderer hair3;
  ModelRenderer hair3L;
  ModelRenderer hair1L;
  ModelRenderer hair2L;
  ModelRenderer hair6L;
  ModelRenderer hair5L;
  ModelRenderer hair4;
  ModelRenderer hair7;
  ModelRenderer hair5;
  ModelRenderer hair6;
  ModelRenderer hair1R;
  ModelRenderer hair2R;
  ModelRenderer hair3R;
  ModelRenderer hair5R;
  ModelRenderer hair6R;
  ModelRenderer hollowmasksheild1;
  ModelRenderer hollow_mask_sheild3;
  ModelRenderer hollow_mask_sheild2;
  ModelRenderer skullmask2;
  ModelRenderer skullmask3;
  ModelRenderer skullmask1;
  ModelRenderer hornMaskBackHorn1;
  ModelRenderer hornMaskBack2;
  ModelRenderer hornMaskBack1;
  ModelRenderer hornMaskBackHorn2;
  ModelRenderer hornMaskBack3;
  
  public ModelAshido()
  {
    this.textureWidth = 64;
    this.textureHeight = 128;
    
    this.body = new ModelRenderer(this, 16, 16);
    this.body.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4);
    this.body.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.body.setTextureSize(64, 128);
    this.body.mirror = true;
    setRotation(this.body, 0.0F, 0.0F, 0.0F);
    this.rightarm = new ModelRenderer(this, 40, 16);
    this.rightarm.addBox(-3.0F, -2.0F, -2.0F, 4, 12, 4);
    this.rightarm.setRotationPoint(-5.0F, 2.0F, 0.0F);
    this.rightarm.setTextureSize(64, 128);
    this.rightarm.mirror = true;
    setRotation(this.rightarm, 0.0F, 0.0F, 0.0F);
    this.leftarm = new ModelRenderer(this, 40, 16);
    this.leftarm.addBox(-1.0F, -2.0F, -2.0F, 4, 12, 4);
    this.leftarm.setRotationPoint(5.0F, 2.0F, 0.0F);
    this.leftarm.setTextureSize(64, 128);
    this.leftarm.mirror = true;
    setRotation(this.leftarm, 0.0F, 0.0F, 0.0F);
    this.rightleg = new ModelRenderer(this, 0, 16);
    this.rightleg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4);
    this.rightleg.setRotationPoint(-2.0F, 12.0F, 0.0F);
    this.rightleg.setTextureSize(64, 128);
    this.rightleg.mirror = true;
    setRotation(this.rightleg, 0.0F, 0.0F, 0.0F);
    this.leftleg = new ModelRenderer(this, 0, 16);
    this.leftleg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4);
    this.leftleg.setRotationPoint(2.0F, 12.0F, 0.0F);
    this.leftleg.setTextureSize(64, 128);
    this.leftleg.mirror = true;
    setRotation(this.leftleg, 0.0F, 0.0F, 0.0F);
    this.hairback = new ModelRenderer(this, 42, 74);
    this.hairback.addBox(-4.5F, -0.5F, 0.5F, 9, 16, 2);
    this.hairback.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.hairback.setTextureSize(64, 128);
    this.hairback.mirror = true;
    setRotation(this.hairback, 0.0F, 0.0F, 0.0F);
    this.furarmR = new ModelRenderer(this, 16, 82);
    this.furarmR.addBox(-3.5F, -2.5F, -2.5F, 7, 8, 5);
    this.furarmR.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.furarmR.setTextureSize(64, 128);
    this.furarmR.mirror = true;
    setRotation(this.furarmR, 0.0F, 0.0F, 0.0F);
    this.furarmL = new ModelRenderer(this, 16, 82);
    this.furarmL.addBox(-3.5F, -2.5F, -2.5F, 7, 8, 5);
    this.furarmL.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.furarmL.setTextureSize(64, 128);
    this.furarmL.mirror = true;
    setRotation(this.furarmL, 0.0F, 0.0F, 0.0F);
    this.head = new ModelRenderer(this, 0, 0);
    this.head.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8);
    this.head.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.head.setTextureSize(64, 128);
    this.head.mirror = true;
    setRotation(this.head, 0.0F, 0.0F, 0.0F);
    this.mask3 = new ModelRenderer(this, 32, 38);
    this.mask3.addBox(-2.5F, -8.5F, -5.5F, 5, 2, 3);
    this.mask3.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.mask3.setTextureSize(64, 128);
    this.mask3.mirror = true;
    setRotation(this.mask3, 0.6981317F, 0.0F, 0.0F);
    this.mask1 = new ModelRenderer(this, 32, 0);
    this.mask1.addBox(-4.5F, -8.5F, 0.0F, 9, 5, 6);
    this.mask1.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.mask1.setTextureSize(64, 128);
    this.mask1.mirror = true;
    setRotation(this.mask1, 0.8726646F, 0.0F, 0.0F);
    this.eyeR = new ModelRenderer(this, 24, 0);
    this.eyeR.addBox(-2.5F, -9.5F, 1.0F, 2, 1, 2);
    this.eyeR.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.eyeR.setTextureSize(64, 128);
    this.eyeR.mirror = true;
    setRotation(this.eyeR, 0.8726646F, 0.122173F, 0.0F);
    this.mask5 = new ModelRenderer(this, 32, 43);
    this.mask5.addBox(-2.0F, -9.8F, 1.0F, 4, 1, 2);
    this.mask5.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.mask5.setTextureSize(64, 128);
    this.mask5.mirror = true;
    setRotation(this.mask5, 1.570796F, 0.0F, 0.0F);
    this.mask2 = new ModelRenderer(this, 32, 32);
    this.mask2.addBox(-3.5F, -8.0F, -4.0F, 7, 3, 3);
    this.mask2.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.mask2.setTextureSize(64, 128);
    this.mask2.mirror = true;
    setRotation(this.mask2, 0.5235988F, 0.0F, 0.0F);
    this.eyeL = new ModelRenderer(this, 24, 0);
    this.eyeL.addBox(0.5F, -9.5F, 1.0F, 2, 1, 2);
    this.eyeL.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.eyeL.setTextureSize(64, 128);
    this.eyeL.mirror = true;
    setRotation(this.eyeL, 0.8726646F, -0.122173F, 0.0F);
    this.horn3R = new ModelRenderer(this, 56, 25);
    this.horn3R.addBox(-2.0F, -18.0F, -1.5F, 1, 3, 1);
    this.horn3R.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.horn3R.setTextureSize(64, 128);
    this.horn3R.mirror = true;
    setRotation(this.horn3R, 0.0F, 0.0F, -0.1745329F);
    this.horn1R = new ModelRenderer(this, 56, 16);
    this.horn1R.addBox(-2.0F, -13.0F, -4.0F, 1, 4, 1);
    this.horn1R.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.horn1R.setTextureSize(64, 128);
    this.horn1R.mirror = true;
    setRotation(this.horn1R, -0.0785398F, 0.0F, -0.1745329F);
    this.horn2R = new ModelRenderer(this, 56, 21);
    this.horn2R.addBox(-2.0F, -12.0F, -10.0F, 1, 3, 1);
    this.horn2R.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.horn2R.setTextureSize(64, 128);
    this.horn2R.mirror = true;
    setRotation(this.horn2R, -0.6108652F, 0.0F, -0.1745329F);
    this.horn1L = new ModelRenderer(this, 56, 16);
    this.horn1L.addBox(1.0F, -13.0F, -4.0F, 1, 4, 1);
    this.horn1L.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.horn1L.setTextureSize(64, 128);
    this.horn1L.mirror = true;
    setRotation(this.horn1L, -0.0785398F, 0.0F, 0.1745329F);
    this.horn2L = new ModelRenderer(this, 56, 21);
    this.horn2L.addBox(1.0F, -12.0F, -10.0F, 1, 3, 1);
    this.horn2L.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.horn2L.setTextureSize(64, 128);
    this.horn2L.mirror = true;
    setRotation(this.horn2L, -0.6108652F, 0.0F, 0.1745329F);
    this.horn3L = new ModelRenderer(this, 56, 25);
    this.horn3L.addBox(1.0F, -18.0F, -1.5F, 1, 3, 1);
    this.horn3L.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.horn3L.setTextureSize(64, 128);
    this.horn3L.mirror = true;
    setRotation(this.horn3L, 0.0F, 0.0F, 0.1745329F);
    this.hair2 = new ModelRenderer(this, 0, 38);
    this.hair2.addBox(-4.5F, -11.5F, -2.0F, 9, 3, 3);
    this.hair2.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.hair2.setTextureSize(64, 128);
    this.hair2.mirror = true;
    setRotation(this.hair2, -0.1396263F, 0.0F, 0.0F);
    this.hair1 = new ModelRenderer(this, 0, 32);
    this.hair1.addBox(-3.5F, -9.0F, 5.0F, 7, 3, 3);
    this.hair1.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.hair1.setTextureSize(64, 128);
    this.hair1.mirror = true;
    setRotation(this.hair1, 0.7504916F, 0.0F, 0.0F);
    this.hair3 = new ModelRenderer(this, 0, 44);
    this.hair3.addBox(-5.0F, -9.5F, -6.5F, 10, 5, 6);
    this.hair3.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.hair3.setTextureSize(64, 128);
    this.hair3.mirror = true;
    setRotation(this.hair3, -0.7853982F, 0.0F, 0.0F);
    this.hair3L = new ModelRenderer(this, 30, 67);
    this.hair3L.addBox(3.0F, 0.0F, -3.0F, 3, 3, 4);
    this.hair3L.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.hair3L.setTextureSize(64, 128);
    this.hair3L.mirror = true;
    setRotation(this.hair3L, 0.0F, 0.0F, -0.5934119F);
    this.hair1L = new ModelRenderer(this, 30, 55);
    this.hair1L.addBox(6.0F, -3.0F, 1.0F, 2, 2, 3);
    this.hair1L.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.hair1L.setTextureSize(64, 128);
    this.hair1L.mirror = true;
    setRotation(this.hair1L, 0.0F, 0.0F, -0.5934119F);
    this.hair2L = new ModelRenderer(this, 30, 60);
    this.hair2L.addBox(4.0F, -2.0F, -1.0F, 3, 3, 4);
    this.hair2L.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.hair2L.setTextureSize(64, 128);
    this.hair2L.mirror = true;
    setRotation(this.hair2L, 0.0F, 0.0F, -0.5934119F);
    this.hair6L = new ModelRenderer(this, 30, 79);
    this.hair6L.addBox(4.5F, -4.5F, -3.0F, 1, 1, 2);
    this.hair6L.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.hair6L.setTextureSize(64, 128);
    this.hair6L.mirror = true;
    setRotation(this.hair6L, 1.291544F, 0.0F, 0.0F);
    this.hair5L = new ModelRenderer(this, 30, 74);
    this.hair5L.addBox(4.0F, -4.0F, -3.0F, 2, 2, 3);
    this.hair5L.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.hair5L.setTextureSize(64, 128);
    this.hair5L.mirror = true;
    setRotation(this.hair5L, 0.7853982F, 0.0F, 0.0F);
    this.hair4 = new ModelRenderer(this, 0, 55);
    this.hair4.addBox(-5.5F, -7.0F, 2.0F, 11, 10, 4);
    this.hair4.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.hair4.setTextureSize(64, 128);
    this.hair4.mirror = true;
    setRotation(this.hair4, 0.0F, 0.0F, 0.0F);
    this.hair7 = new ModelRenderer(this, 0, 78);
    this.hair7.addBox(-3.0F, 7.0F, 3.5F, 6, 2, 1);
    this.hair7.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.hair7.setTextureSize(64, 128);
    this.hair7.mirror = true;
    setRotation(this.hair7, 0.0F, 0.0F, 0.0F);
    this.hair5 = new ModelRenderer(this, 0, 69);
    this.hair5.addBox(-5.0F, 3.0F, 2.5F, 10, 2, 3);
    this.hair5.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.hair5.setTextureSize(64, 128);
    this.hair5.mirror = true;
    setRotation(this.hair5, 0.0F, 0.0F, 0.0F);
    this.hair6 = new ModelRenderer(this, 0, 74);
    this.hair6.addBox(-4.0F, 5.0F, 3.0F, 8, 2, 2);
    this.hair6.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.hair6.setTextureSize(64, 128);
    this.hair6.mirror = true;
    setRotation(this.hair6, 0.0F, 0.0F, 0.0F);
    this.hair1R = new ModelRenderer(this, 30, 55);
    this.hair1R.addBox(-8.0F, -3.0F, 1.0F, 2, 2, 3);
    this.hair1R.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.hair1R.setTextureSize(64, 128);
    this.hair1R.mirror = true;
    setRotation(this.hair1R, 0.0F, 0.0F, 0.5934119F);
    this.hair2R = new ModelRenderer(this, 30, 60);
    this.hair2R.addBox(-7.0F, -2.0F, -1.0F, 3, 3, 4);
    this.hair2R.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.hair2R.setTextureSize(64, 128);
    this.hair2R.mirror = true;
    setRotation(this.hair2R, 0.0F, 0.0F, 0.5934119F);
    this.hair3R = new ModelRenderer(this, 30, 67);
    this.hair3R.addBox(-6.0F, 0.0F, -3.0F, 3, 3, 4);
    this.hair3R.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.hair3R.setTextureSize(64, 128);
    this.hair3R.mirror = true;
    setRotation(this.hair3R, 0.0F, 0.0F, 0.5934119F);
    this.hair5R = new ModelRenderer(this, 30, 74);
    this.hair5R.addBox(-6.0F, -4.0F, -3.0F, 2, 2, 3);
    this.hair5R.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.hair5R.setTextureSize(64, 128);
    this.hair5R.mirror = true;
    setRotation(this.hair5R, 0.7853982F, 0.0F, 0.0F);
    this.hair6R = new ModelRenderer(this, 30, 79);
    this.hair6R.addBox(-5.5F, -4.5F, -3.0F, 1, 1, 2);
    this.hair6R.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.hair6R.setTextureSize(64, 128);
    this.hair6R.mirror = true;
    setRotation(this.hair6R, 1.291544F, 0.0F, 0.0F);
    this.hollowmasksheild1 = new ModelRenderer(this, 0, 86);
    this.hollowmasksheild1.addBox(2.0F, -9.0F, -3.0F, 2, 7, 6);
    this.hollowmasksheild1.setRotationPoint(1.0F, 7.0F, 0.0F);
    this.hollowmasksheild1.setTextureSize(64, 128);
    this.hollowmasksheild1.mirror = true;
    setRotation(this.hollowmasksheild1, 0.0F, 0.0F, -0.1570796F);
    this.hollow_mask_sheild3 = new ModelRenderer(this, 0, 112);
    this.hollow_mask_sheild3.addBox(1.5F, 1.0F, -3.0F, 2, 6, 6);
    this.hollow_mask_sheild3.setRotationPoint(1.0F, 7.0F, 0.0F);
    this.hollow_mask_sheild3.setTextureSize(64, 128);
    this.hollow_mask_sheild3.mirror = true;
    setRotation(this.hollow_mask_sheild3, 0.0F, 0.0F, 0.2268928F);
    this.hollow_mask_sheild2 = new ModelRenderer(this, 0, 99);
    this.hollow_mask_sheild2.addBox(1.5F, -3.0F, -4.0F, 2, 5, 8);
    this.hollow_mask_sheild2.setRotationPoint(1.0F, 7.0F, 0.0F);
    this.hollow_mask_sheild2.setTextureSize(64, 128);
    this.hollow_mask_sheild2.mirror = true;
    setRotation(this.hollow_mask_sheild2, 0.0F, 0.0F, 0.0523599F);
    this.skullmask2 = new ModelRenderer(this, 45, 62);
    this.skullmask2.addBox(-3.5F, 6.0F, 5.0F, 7, 5, 1);
    this.skullmask2.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.skullmask2.setTextureSize(64, 128);
    this.skullmask2.mirror = true;
    setRotation(this.skullmask2, 0.0F, -0.6108652F, 0.0F);
    this.skullmask3 = new ModelRenderer(this, 45, 68);
    this.skullmask3.addBox(-2.5F, 9.0F, 7.5F, 5, 3, 1);
    this.skullmask3.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.skullmask3.setTextureSize(64, 128);
    this.skullmask3.mirror = true;
    setRotation(this.skullmask3, -0.2617994F, -0.6108652F, 0.0F);
    this.skullmask1 = new ModelRenderer(this, 45, 60);
    this.skullmask1.addBox(-3.0F, 5.0F, 5.0F, 6, 1, 1);
    this.skullmask1.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.skullmask1.setTextureSize(64, 128);
    this.skullmask1.mirror = true;
    setRotation(this.skullmask1, 0.0F, -0.6108652F, 0.0F);
    this.hornMaskBackHorn1 = new ModelRenderer(this, 56, 51);
    this.hornMaskBackHorn1.addBox(-1.2F, 4.0F, 7.5F, 1, 2, 1);
    this.hornMaskBackHorn1.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.hornMaskBackHorn1.setTextureSize(64, 128);
    this.hornMaskBackHorn1.mirror = true;
    setRotation(this.hornMaskBackHorn1, -0.418879F, 0.5585054F, 0.0F);
    this.hornMaskBack2 = new ModelRenderer(this, 44, 53);
    this.hornMaskBack2.addBox(-2.0F, 8.0F, 4.5F, 5, 3, 1);
    this.hornMaskBack2.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.hornMaskBack2.setTextureSize(64, 128);
    this.hornMaskBack2.mirror = true;
    setRotation(this.hornMaskBack2, 0.0F, 0.5585054F, 0.0F);
    this.hornMaskBack1 = new ModelRenderer(this, 44, 51);
    this.hornMaskBack1.addBox(-1.5F, 7.0F, 4.5F, 4, 1, 1);
    this.hornMaskBack1.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.hornMaskBack1.setTextureSize(64, 128);
    this.hornMaskBack1.mirror = true;
    setRotation(this.hornMaskBack1, 0.0F, 0.5585054F, 0.0F);
    this.hornMaskBackHorn2 = new ModelRenderer(this, 56, 51);
    this.hornMaskBackHorn2.addBox(1.1F, 4.0F, 7.5F, 1, 2, 1);
    this.hornMaskBackHorn2.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.hornMaskBackHorn2.setTextureSize(64, 128);
    this.hornMaskBackHorn2.mirror = true;
    setRotation(this.hornMaskBackHorn2, -0.418879F, 0.5585054F, 0.0F);
    this.hornMaskBack3 = new ModelRenderer(this, 44, 57);
    this.hornMaskBack3.addBox(-1.5F, 10.0F, 5.9F, 4, 2, 1);
    this.hornMaskBack3.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.hornMaskBack3.setTextureSize(64, 128);
    this.hornMaskBack3.mirror = true;
    setRotation(this.hornMaskBack3, -0.1396263F, 0.5585054F, 0.0F);
    
    this.leftarm.addChild(this.furarmL);
    this.rightarm.addChild(this.furarmR);
    
    this.leftarm.addChild(this.hollowmasksheild1);
    this.leftarm.addChild(this.hollow_mask_sheild2);
    this.leftarm.addChild(this.hollow_mask_sheild3);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    this.body.render(f5);
    this.rightarm.render(f5);
    this.leftarm.render(f5);
    this.rightleg.render(f5);
    this.leftleg.render(f5);
    this.hairback.render(f5);
    

    this.head.render(f5);
    this.mask3.render(f5);
    this.mask1.render(f5);
    this.eyeL.render(f5);
    this.mask5.render(f5);
    this.mask2.render(f5);
    this.eyeR.render(f5);
    this.horn3R.render(f5);
    this.horn1R.render(f5);
    this.horn2R.render(f5);
    this.horn1L.render(f5);
    this.horn2L.render(f5);
    this.horn3L.render(f5);
    this.hair2.render(f5);
    this.hair1.render(f5);
    this.hair3.render(f5);
    this.hair3L.render(f5);
    this.hair1L.render(f5);
    this.hair2L.render(f5);
    this.hair6L.render(f5);
    this.hair5L.render(f5);
    this.hair4.render(f5);
    this.hair7.render(f5);
    this.hair5.render(f5);
    this.hair6.render(f5);
    this.hair1R.render(f5);
    this.hair2R.render(f5);
    this.hair3R.render(f5);
    this.hair5R.render(f5);
    this.hair6R.render(f5);
    


    this.skullmask2.render(f5);
    this.skullmask2.render(f5);
    this.skullmask1.render(f5);
    this.hornMaskBackHorn1.render(f5);
    this.hornMaskBack2.render(f5);
    this.hornMaskBack1.render(f5);
    this.hornMaskBackHorn2.render(f5);
    this.hornMaskBack3.render(f5);
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
    

    this.rightarm.rotateAngleX = (MathHelper.cos(f * 0.6662F + 3.1415927F) * 2.0F * f1 * 0.5F);
    this.leftarm.rotateAngleX = (MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5F);
    this.rightarm.rotateAngleZ = 0.0F;
    this.leftarm.rotateAngleZ = 0.0F;
    this.rightleg.rotateAngleX = (MathHelper.cos(f * 0.6662F) * 1.4F * f1);
    this.leftleg.rotateAngleX = (MathHelper.cos(f * 0.6662F + 3.1415927F) * 1.4F * f1);
    this.rightleg.rotateAngleY = 0.0F;
    this.leftleg.rotateAngleY = 0.0F;
  }
}
