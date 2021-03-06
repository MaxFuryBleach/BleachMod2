package littlebreadloaf.bleach.player.models;

import littlebreadloaf.bleach.events.ExtendedPlayer;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;




































public class ModelPlayerHollow
  extends ModelBiped
{
  ModelRenderer default_head;
  ModelRenderer default_neck;
  ModelRenderer spitter_head;
  ModelRenderer spitter_head_eyeR;
  ModelRenderer spitter_head_jaws;
  ModelRenderer spitter_head_eyeL;
  ModelRenderer hornhead_1;
  ModelRenderer hornhead2;
  ModelRenderer hornhead3;
  ModelRenderer hornhead_4;
  ModelRenderer hornhead_jaw;
  ModelRenderer hornhead_hornR;
  ModelRenderer hornhead_hornL;
  ModelRenderer hard_head;
  ModelRenderer hard_head_face;
  ModelRenderer hard_head_top;
  ModelRenderer hard_head_side_R;
  ModelRenderer hard_head_sideL;
  ModelRenderer hard_head_fin;
  ModelRenderer hard_head_jaw;
  public ModelRenderer default_torso;
  ModelRenderer Default_lowertorso;
  ModelRenderer default_wing_stubR;
  ModelRenderer default_wing_stubL;
  ModelRenderer armored_backneck;
  ModelRenderer armored_backTR;
  ModelRenderer armored_back_BR;
  ModelRenderer armored_backTL;
  ModelRenderer armored_back_BL;
  ModelRenderer spike3R;
  ModelRenderer spike1R;
  ModelRenderer spike2R;
  ModelRenderer spike1L;
  ModelRenderer spike2L;
  ModelRenderer spike3L;
  ModelRenderer bugwing_R;
  ModelRenderer bugwing_L;
  ModelRenderer default_legL1;
  ModelRenderer default_legL2;
  ModelRenderer default_legL3;
  ModelRenderer default_legL4;
  ModelRenderer default_legL5;
  ModelRenderer default_legR1;
  ModelRenderer default_legR2;
  ModelRenderer default_legR3;
  ModelRenderer default_legR4;
  ModelRenderer default_legR5;
  ModelRenderer jumper_torso1;
  ModelRenderer jumper_torso2;
  ModelRenderer jumper_leg1R;
  ModelRenderer jumper_leg2R;
  ModelRenderer jumper_leg3R;
  ModelRenderer jumper_footR;
  ModelRenderer jumper_leg1L;
  ModelRenderer jumper_leg2L;
  ModelRenderer jumper_leg3L;
  ModelRenderer jumper_footL;
  ModelRenderer heavy_lower_torso2;
  ModelRenderer heavy_lower_torso1;
  ModelRenderer heavy_leg_2R;
  ModelRenderer heavy_leg_1R;
  ModelRenderer heavy_leg_1L;
  ModelRenderer heavy_leg_2L;
  ModelRenderer crawler_torso1;
  ModelRenderer crawler_torso2;
  ModelRenderer lower_crawler_torso1;
  ModelRenderer lower_crawler_torso2;
  ModelRenderer lower_crawler_torso3;
  ModelRenderer crawler_tail1;
  ModelRenderer crawler_tail2;
  ModelRenderer crawler_leg1BR;
  ModelRenderer crawler_leg1TR;
  ModelRenderer crawler_leg2BR;
  ModelRenderer crawler_leg5R;
  ModelRenderer crawler_leg2TR;
  ModelRenderer crawler_leg3R;
  ModelRenderer crawler_leg4R;
  ModelRenderer crawler_leg1TL;
  ModelRenderer crawler_leg1BL;
  ModelRenderer crawler_leg2TL;
  ModelRenderer crawler_leg2BL;
  ModelRenderer crawler_leg3L;
  ModelRenderer crawler_leg4L;
  ModelRenderer crawler_leg5L;
  public ModelRenderer default_armL1;
  public ModelRenderer default_armL2;
  public ModelRenderer default_armL3;
  public ModelRenderer default_armR1;
  public ModelRenderer default_armR2;
  public ModelRenderer default_armR3;
  ModelRenderer golem_armor_sholderL;
  ModelRenderer golem_sholderL;
  ModelRenderer golem_upper_armL;
  ModelRenderer golem_lower_armL;
  ModelRenderer golem_armor_lower_armL;
  ModelRenderer golem_armor_sholderR;
  ModelRenderer golem_sholderR;
  ModelRenderer golem_upper_armR;
  ModelRenderer golem_lower_armR;
  ModelRenderer golem_armor_lower_armR;
  ModelRenderer mantis_arm1L;
  ModelRenderer mantis_arm3L;
  ModelRenderer mantis_arms3L;
  ModelRenderer mantis_bladeL;
  ModelRenderer mantis_arm1R;
  ModelRenderer mantis_arm3R;
  ModelRenderer mantis_arms3R;
  ModelRenderer mantis_bladeR;
  ModelRenderer bug_lower_arm1L;
  ModelRenderer bug_lower_arm2L;
  ModelRenderer bug_upper_arm1L;
  ModelRenderer bug_upper_arm2L;
  ModelRenderer bug_lower_handL;
  ModelRenderer bug_upper_handL;
  ModelRenderer bug_lower_arm1R;
  ModelRenderer bug_lower_arm2R;
  ModelRenderer bug_upper_arm1R;
  ModelRenderer bug_upper_arm2R;
  ModelRenderer bug_lower_handR;
  ModelRenderer bug_upper_handR;
  ModelRenderer heavyarm1L;
  ModelRenderer heavyarm2L;
  ModelRenderer beavyarm3L;
  ModelRenderer heavyarm4L;
  ModelRenderer heavyarm5L;
  ModelRenderer heavyarmthumbL;
  ModelRenderer heavyarmfinger1L;
  ModelRenderer heavyarmfinger2L;
  ModelRenderer heavyarm1R;
  ModelRenderer heavyarm2R;
  ModelRenderer beavyarm3R;
  ModelRenderer heavyarm4R;
  ModelRenderer heavyarm5R;
  ModelRenderer heavyarmthumbR;
  ModelRenderer heavyarmfinger1R;
  ModelRenderer heavyarmfinger2R;
  ModelRenderer default_tail1;
  ModelRenderer default_tail2;
  ModelRenderer default_tail3;
  ModelRenderer wolf_tail_1;
  ModelRenderer wolf_tail_2;
  ModelRenderer wolf_tail_3;
  ModelRenderer wolf_tail_4;
  ModelRenderer wolf_tail_5;
  ModelRenderer wolf_tail_6;
  ModelRenderer shark_tail_1;
  ModelRenderer shark_tail_2;
  ModelRenderer shark_tail_3;
  ModelRenderer shark_tail_4;
  ModelRenderer shark_tail_fin;
  ModelRenderer shark_finsideR;
  ModelRenderer shark_finsideL;
  ModelRenderer scorpion_stinger1;
  ModelRenderer scorpion_stinger2;
  ModelRenderer scorpion_stinger3;
  ModelRenderer scorpion_tail1;
  ModelRenderer scorpion_tail2;
  ModelRenderer scorpion_tail3;
  ModelRenderer scorpion_tail4;
  ModelRenderer scorpion_tail5;
  ModelRenderer scorpion_tail6;
  ModelRenderer scorpion_tail7;
  ModelRenderer scorpion_tail8;
  ModelRenderer scorpion_tail9;
  
  public ModelPlayerHollow()
  {
    this.textureWidth = 512;
    this.textureHeight = 512;
    
    this.default_head = new ModelRenderer(this, 0, 0);
    this.default_head.addBox(-4.0F, -6.0F, -7.0F, 8, 8, 8);
    this.default_head.setRotationPoint(0.0F, -7.5F, 0.0F);
    this.default_head.setTextureSize(512, 512);
    this.default_head.mirror = true;
    setRotation(this.default_head, 0.0F, 0.0F, 0.0F);
    this.default_neck = new ModelRenderer(this, 33, 0);
    this.default_neck.addBox(-2.0F, -16.0F, 1.0F, 4, 3, 4);
    this.default_neck.setRotationPoint(0.0F, 9.0F, 0.0F);
    this.default_neck.setTextureSize(512, 512);
    this.default_neck.mirror = true;
    setRotation(this.default_neck, 0.2617994F, 0.0F, 0.0F);
    
    this.spitter_head = new ModelRenderer(this, 400, 58);
    this.spitter_head.addBox(-3.0F, -6.0F, -8.0F, 6, 6, 10);
    this.spitter_head.setRotationPoint(0.0F, -7.0F, 0.0F);
    this.spitter_head.setTextureSize(512, 512);
    this.spitter_head.mirror = true;
    setRotation(this.spitter_head, 0.5235988F, 0.0F, 0.0F);
    this.spitter_head_eyeR = new ModelRenderer(this, 400, 77);
    this.spitter_head_eyeR.mirror = true;
    this.spitter_head_eyeR.addBox(-7.0F, -4.0F, -8.0F, 5, 4, 6);
    this.spitter_head_eyeR.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.spitter_head_eyeR.setTextureSize(512, 512);
    this.spitter_head_eyeR.mirror = true;
    setRotation(this.spitter_head_eyeR, -0.5235988F, 0.0F, 0.2617994F);
    this.spitter_head_eyeR.mirror = false;
    this.spitter_head_jaws = new ModelRenderer(this, 400, 89);
    this.spitter_head_jaws.addBox(-3.5F, 0.0F, -11.0F, 7, 4, 8);
    this.spitter_head_jaws.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.spitter_head_jaws.setTextureSize(512, 512);
    this.spitter_head_jaws.mirror = true;
    setRotation(this.spitter_head_jaws, -0.5235988F, 0.0F, 0.0F);
    this.spitter_head_eyeL = new ModelRenderer(this, 400, 77);
    this.spitter_head_eyeL.addBox(2.0F, -4.0F, -8.0F, 5, 4, 6);
    this.spitter_head_eyeL.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.spitter_head_eyeL.setTextureSize(512, 512);
    this.spitter_head_eyeL.mirror = true;
    setRotation(this.spitter_head_eyeL, -0.5235988F, 0.0F, -0.2617994F);
    
    this.hornhead_1 = new ModelRenderer(this, 400, 0);
    this.hornhead_1.addBox(-4.5F, -6.0F, -7.0F, 9, 8, 9);
    this.hornhead_1.setRotationPoint(0.0F, -7.0F, 0.0F);
    this.hornhead_1.setTextureSize(512, 512);
    this.hornhead_1.mirror = true;
    setRotation(this.hornhead_1, 0.2617994F, 0.0F, 0.0F);
    this.hornhead2 = new ModelRenderer(this, 400, 30);
    this.hornhead2.addBox(-4.0F, -6.0F, -8.0F, 8, 2, 3);
    this.hornhead2.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.hornhead2.setTextureSize(512, 512);
    this.hornhead2.mirror = true;
    setRotation(this.hornhead2, -0.2443461F, 0.0F, 0.0F);
    this.hornhead3 = new ModelRenderer(this, 400, 38);
    this.hornhead3.addBox(-3.0F, -9.5F, -1.5F, 6, 3, 3);
    this.hornhead3.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.hornhead3.setTextureSize(512, 512);
    this.hornhead3.mirror = true;
    setRotation(this.hornhead3, 0.5235988F, 0.0F, 0.0F);
    this.hornhead_4 = new ModelRenderer(this, 400, 46);
    this.hornhead_4.addBox(-2.0F, -7.0F, -5.0F, 4, 3, 8);
    this.hornhead_4.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.hornhead_4.setTextureSize(512, 512);
    this.hornhead_4.mirror = true;
    setRotation(this.hornhead_4, -0.2617994F, 0.0F, 0.0F);
    this.hornhead_jaw = new ModelRenderer(this, 400, 19);
    this.hornhead_jaw.addBox(-3.0F, 3.0F, -6.0F, 6, 3, 5);
    this.hornhead_jaw.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.hornhead_jaw.setTextureSize(512, 512);
    this.hornhead_jaw.mirror = true;
    setRotation(this.hornhead_jaw, -0.5235988F, 0.0F, 0.0F);
    this.hornhead_hornR = new ModelRenderer(this, 425, 20);
    this.hornhead_hornR.mirror = true;
    this.hornhead_hornR.addBox(-6.0F, -5.0F, -12.0F, 2, 2, 7);
    this.hornhead_hornR.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.hornhead_hornR.setTextureSize(512, 512);
    this.hornhead_hornR.mirror = true;
    setRotation(this.hornhead_hornR, -0.2617994F, 0.0F, 0.0F);
    this.hornhead_hornR.mirror = false;
    this.hornhead_hornL = new ModelRenderer(this, 425, 20);
    this.hornhead_hornL.addBox(4.0F, -5.0F, -12.0F, 2, 2, 7);
    this.hornhead_hornL.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.hornhead_hornL.setTextureSize(512, 512);
    this.hornhead_hornL.mirror = true;
    setRotation(this.hornhead_hornL, -0.2617994F, 0.0F, 0.0F);
    
    this.hard_head = new ModelRenderer(this, 400, 107);
    this.hard_head.addBox(-4.0F, -6.0F, -7.0F, 8, 8, 8);
    this.hard_head.setRotationPoint(0.0F, -7.0F, 0.0F);
    this.hard_head.setTextureSize(512, 512);
    this.hard_head.mirror = true;
    setRotation(this.hard_head, 0.0F, 0.0F, 0.0F);
    this.hard_head_face = new ModelRenderer(this, 400, 127);
    this.hard_head_face.addBox(-3.0F, -5.0F, -8.0F, 6, 6, 1);
    this.hard_head_face.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.hard_head_face.setTextureSize(512, 512);
    this.hard_head_face.mirror = true;
    setRotation(this.hard_head_face, 0.0F, 0.0F, 0.0F);
    this.hard_head_top = new ModelRenderer(this, 400, 137);
    this.hard_head_top.addBox(-3.0F, -7.0F, -6.0F, 6, 1, 6);
    this.hard_head_top.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.hard_head_top.setTextureSize(512, 512);
    this.hard_head_top.mirror = true;
    setRotation(this.hard_head_top, 0.0F, 0.0F, 0.0F);
    this.hard_head_side_R = new ModelRenderer(this, 435, 107);
    this.hard_head_side_R.addBox(-5.0F, -5.0F, -6.0F, 1, 6, 6);
    this.hard_head_side_R.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.hard_head_side_R.setTextureSize(512, 512);
    this.hard_head_side_R.mirror = true;
    setRotation(this.hard_head_side_R, 0.0F, 0.0F, 0.0F);
    this.hard_head_sideL = new ModelRenderer(this, 435, 107);
    this.hard_head_sideL.addBox(4.0F, -5.0F, -6.0F, 1, 6, 6);
    this.hard_head_sideL.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.hard_head_sideL.setTextureSize(512, 512);
    this.hard_head_sideL.mirror = true;
    setRotation(this.hard_head_sideL, 0.0F, 0.0F, 0.0F);
    this.hard_head_fin = new ModelRenderer(this, 428, 138);
    this.hard_head_fin.addBox(-1.0F, -7.5F, -8.5F, 2, 5, 10);
    this.hard_head_fin.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.hard_head_fin.setTextureSize(512, 512);
    this.hard_head_fin.mirror = true;
    setRotation(this.hard_head_fin, 0.0F, 0.0F, 0.0F);
    this.hard_head_jaw = new ModelRenderer(this, 418, 127);
    this.hard_head_jaw.addBox(-4.5F, 1.0F, -8.0F, 9, 3, 4);
    this.hard_head_jaw.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.hard_head_jaw.setTextureSize(512, 512);
    this.hard_head_jaw.mirror = true;
    setRotation(this.hard_head_jaw, -0.2617994F, 0.0F, 0.0F);
    




    this.default_torso = new ModelRenderer(this, 0, 17);
    this.default_torso.addBox(-6.0F, -13.0F, 0.0F, 12, 8, 8);
    this.default_torso.setRotationPoint(0.0F, 9.0F, 0.0F);
    this.default_torso.setTextureSize(512, 512);
    this.default_torso.mirror = true;
    setRotation(this.default_torso, 0.3141593F, 0.0F, 0.0F);
    this.Default_lowertorso = new ModelRenderer(this, 0, 34);
    this.Default_lowertorso.addBox(-4.0F, -7.0F, -1.0F, 8, 8, 6);
    this.Default_lowertorso.setRotationPoint(0.0F, 9.0F, 0.0F);
    this.Default_lowertorso.setTextureSize(512, 512);
    this.Default_lowertorso.mirror = true;
    setRotation(this.Default_lowertorso, 0.0F, 0.0F, 0.0F);
    
    this.jumper_torso1 = new ModelRenderer(this, 0, 152);
    this.jumper_torso1.addBox(-3.5F, -7.0F, 0.0F, 7, 5, 5);
    this.jumper_torso1.setRotationPoint(0.0F, 9.0F, 0.0F);
    this.jumper_torso1.setTextureSize(512, 512);
    this.jumper_torso1.mirror = true;
    setRotation(this.jumper_torso1, 0.0F, 0.0F, 0.0F);
    this.jumper_torso2 = new ModelRenderer(this, 0, 165);
    this.jumper_torso2.addBox(-4.0F, -2.0F, -1.0F, 8, 3, 5);
    this.jumper_torso2.setRotationPoint(0.0F, 9.0F, 0.0F);
    this.jumper_torso2.setTextureSize(512, 512);
    this.jumper_torso2.mirror = true;
    setRotation(this.jumper_torso2, 0.0F, 0.0F, 0.0F);
    
    this.armored_backTR = new ModelRenderer(this, 41, 492);
    this.armored_backTR.mirror = true;
    this.armored_backTR.addBox(-5.5F, -16.0F, -4.0F, 3, 9, 9);
    this.armored_backTR.setRotationPoint(0.0F, 9.0F, 0.0F);
    this.armored_backTR.setTextureSize(512, 512);
    this.armored_backTR.mirror = true;
    setRotation(this.armored_backTR, 0.0F, 0.0F, 0.0F);
    this.armored_backTR.mirror = false;
    this.armored_backneck = new ModelRenderer(this, 70, 489);
    this.armored_backneck.addBox(-3.0F, -16.0F, 2.0F, 6, 3, 3);
    this.armored_backneck.setRotationPoint(0.0F, 9.0F, 0.0F);
    this.armored_backneck.setTextureSize(512, 512);
    this.armored_backneck.mirror = true;
    setRotation(this.armored_backneck, 0.0F, 0.0F, 0.0F);
    this.armored_back_BR = new ModelRenderer(this, 68, 498);
    this.armored_back_BR.mirror = true;
    this.armored_back_BR.addBox(-6.5F, -6.5F, -1.0F, 5, 3, 9);
    this.armored_back_BR.setRotationPoint(0.0F, 8.0F, 0.0F);
    this.armored_back_BR.setTextureSize(512, 512);
    this.armored_back_BR.mirror = true;
    setRotation(this.armored_back_BR, 0.3141593F, 0.0F, 0.0F);
    this.armored_back_BR.mirror = false;
    this.armored_backTL = new ModelRenderer(this, 41, 492);
    this.armored_backTL.addBox(2.5F, -16.0F, -4.0F, 3, 9, 9);
    this.armored_backTL.setRotationPoint(0.0F, 9.0F, 0.0F);
    this.armored_backTL.setTextureSize(512, 512);
    this.armored_backTL.mirror = true;
    setRotation(this.armored_backTL, 0.0F, 0.0F, 0.0F);
    this.armored_back_BL = new ModelRenderer(this, 68, 498);
    this.armored_back_BL.addBox(1.5F, -6.5F, -1.0F, 5, 3, 9);
    this.armored_back_BL.setRotationPoint(0.0F, 8.0F, 0.0F);
    this.armored_back_BL.setTextureSize(512, 512);
    this.armored_back_BL.mirror = true;
    setRotation(this.armored_back_BL, 0.3141593F, 0.0F, 0.0F);
    
    this.spike3R = new ModelRenderer(this, 95, 490);
    this.spike3R.addBox(-3.0F, -16.0F, -8.0F, 1, 10, 1);
    this.spike3R.setRotationPoint(0.0F, 9.0F, 0.0F);
    this.spike3R.setTextureSize(512, 512);
    this.spike3R.mirror = true;
    setRotation(this.spike3R, -1.308997F, -0.0872665F, 0.0F);
    this.spike3R.mirror = false;
    this.spike1R = new ModelRenderer(this, 95, 490);
    this.spike1R.addBox(-2.0F, -22.0F, -7.0F, 1, 10, 1);
    this.spike1R.setRotationPoint(0.0F, 9.0F, 0.0F);
    this.spike1R.setTextureSize(512, 512);
    this.spike1R.mirror = true;
    setRotation(this.spike1R, -0.7853982F, -0.5235988F, 0.0F);
    this.spike1R.mirror = false;
    this.spike2R = new ModelRenderer(this, 95, 490);
    this.spike2R.addBox(-3.0F, -19.0F, -8.0F, 1, 10, 1);
    this.spike2R.setRotationPoint(0.0F, 9.0F, 0.0F);
    this.spike2R.setTextureSize(512, 512);
    this.spike2R.mirror = true;
    setRotation(this.spike2R, -1.047198F, -0.2617994F, 0.0F);
    this.spike2R.mirror = false;
    this.spike1L = new ModelRenderer(this, 95, 490);
    this.spike1L.addBox(1.0F, -22.0F, -7.0F, 1, 10, 1);
    this.spike1L.setRotationPoint(0.0F, 9.0F, 0.0F);
    this.spike1L.setTextureSize(512, 512);
    this.spike1L.mirror = true;
    setRotation(this.spike1L, -0.7853982F, 0.5235988F, 0.0F);
    this.spike2L = new ModelRenderer(this, 95, 490);
    this.spike2L.addBox(2.0F, -19.0F, -8.0F, 1, 10, 1);
    this.spike2L.setRotationPoint(0.0F, 9.0F, 0.0F);
    this.spike2L.setTextureSize(512, 512);
    this.spike2L.mirror = true;
    setRotation(this.spike2L, -1.047198F, 0.2617994F, 0.0F);
    this.spike3L = new ModelRenderer(this, 95, 490);
    this.spike3L.addBox(2.0F, -16.0F, -8.0F, 1, 10, 1);
    this.spike3L.setRotationPoint(0.0F, 9.0F, 0.0F);
    this.spike3L.setTextureSize(512, 512);
    this.spike3L.mirror = true;
    setRotation(this.spike3L, -1.308997F, 0.0872665F, 0.0F);
    
    this.bugwing_R = new ModelRenderer(this, 0, 479);
    this.bugwing_R.addBox(0.0F, -3.0F, -1.0F, 0, 11, 20);
    this.bugwing_R.setRotationPoint(-3.0F, -3.0F, 5.0F);
    this.bugwing_R.setTextureSize(512, 512);
    this.bugwing_R.mirror = true;
    setRotation(this.bugwing_R, 0.7853982F, -0.5235988F, 0.0F);
    this.bugwing_R.mirror = false;
    this.bugwing_L = new ModelRenderer(this, 0, 479);
    this.bugwing_L.addBox(0.0F, -3.0F, -1.0F, 0, 11, 20);
    this.bugwing_L.setRotationPoint(3.0F, -3.0F, 5.0F);
    this.bugwing_L.setTextureSize(512, 512);
    this.bugwing_L.mirror = true;
    setRotation(this.bugwing_L, 0.7853982F, 0.5235988F, 0.0F);
    


    this.default_legL1 = new ModelRenderer(this, 0, 49);
    this.default_legL1.addBox(-2.0F, -2.0F, -2.0F, 4, 8, 4);
    this.default_legL1.setRotationPoint(4.0F, 9.0F, 2.0F);
    this.default_legL1.setTextureSize(512, 512);
    this.default_legL1.mirror = true;
    setRotation(this.default_legL1, -0.5235988F, 0.0F, 0.0F);
    this.default_legL2 = new ModelRenderer(this, 0, 62);
    this.default_legL2.addBox(-3.0F, 2.0F, -6.0F, 6, 10, 4);
    this.default_legL2.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.default_legL2.setTextureSize(512, 512);
    this.default_legL2.mirror = true;
    setRotation(this.default_legL2, 0.7853982F, 0.0F, 0.0F);
    this.default_legL3 = new ModelRenderer(this, 0, 76);
    this.default_legL3.addBox(-3.5F, 12.0F, -4.0F, 7, 3, 5);
    this.default_legL3.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.default_legL3.setTextureSize(512, 512);
    this.default_legL3.mirror = true;
    setRotation(this.default_legL3, -0.2617994F, 0.0F, 0.0F);
    this.default_legL4 = new ModelRenderer(this, 0, 85);
    this.default_legL4.addBox(-3.0F, 13.0F, -5.0F, 2, 2, 1);
    this.default_legL4.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.default_legL4.setTextureSize(512, 512);
    this.default_legL4.mirror = true;
    setRotation(this.default_legL4, 0.0F, 0.0F, 0.0F);
    this.default_legL5 = new ModelRenderer(this, 0, 85);
    this.default_legL5.addBox(1.0F, 13.0F, -5.0F, 2, 2, 1);
    this.default_legL5.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.default_legL5.setTextureSize(512, 512);
    this.default_legL5.mirror = true;
    setRotation(this.default_legL5, 0.0F, 0.0F, 0.0F);
    this.default_legR1 = new ModelRenderer(this, 0, 49);
    this.default_legR1.mirror = true;
    this.default_legR1.addBox(-2.0F, -2.0F, -2.0F, 4, 8, 4);
    this.default_legR1.setRotationPoint(-4.0F, 9.0F, 2.0F);
    this.default_legR1.setTextureSize(512, 512);
    this.default_legR1.mirror = true;
    setRotation(this.default_legR1, -0.5235988F, 0.0F, 0.0F);
    this.default_legR1.mirror = false;
    this.default_legR2 = new ModelRenderer(this, 0, 62);
    this.default_legR2.mirror = true;
    this.default_legR2.addBox(-3.0F, 2.0F, -6.0F, 6, 10, 4);
    this.default_legR2.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.default_legR2.setTextureSize(512, 512);
    this.default_legR2.mirror = true;
    setRotation(this.default_legR2, 0.7853982F, 0.0F, 0.0F);
    this.default_legR2.mirror = false;
    this.default_legR3 = new ModelRenderer(this, 0, 76);
    this.default_legR3.mirror = true;
    this.default_legR3.addBox(-3.5F, 12.0F, -4.0F, 7, 3, 5);
    this.default_legR3.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.default_legR3.setTextureSize(512, 512);
    this.default_legR3.mirror = true;
    setRotation(this.default_legR3, -0.2617994F, 0.0F, 0.0F);
    this.default_legR3.mirror = false;
    this.default_legR4 = new ModelRenderer(this, 0, 85);
    this.default_legR4.mirror = true;
    this.default_legR4.addBox(1.0F, 13.0F, -5.0F, 2, 2, 1);
    this.default_legR4.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.default_legR4.setTextureSize(512, 512);
    this.default_legR4.mirror = true;
    setRotation(this.default_legR4, 0.0F, 0.0F, 0.0F);
    this.default_legR4.mirror = false;
    this.default_legR5 = new ModelRenderer(this, 0, 85);
    this.default_legR5.mirror = true;
    this.default_legR5.addBox(-3.0F, 13.0F, -5.0F, 2, 2, 1);
    this.default_legR5.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.default_legR5.setTextureSize(512, 512);
    this.default_legR5.mirror = true;
    setRotation(this.default_legR5, 0.0F, 0.0F, 0.0F);
    this.default_legR5.mirror = false;
    
    this.jumper_leg1R = new ModelRenderer(this, 0, 176);
    this.jumper_leg1R.mirror = true;
    this.jumper_leg1R.addBox(-1.5F, -2.0F, -1.0F, 3, 7, 4);
    this.jumper_leg1R.setRotationPoint(-5.0F, 9.0F, 0.0F);
    this.jumper_leg1R.setTextureSize(512, 512);
    this.jumper_leg1R.mirror = true;
    setRotation(this.jumper_leg1R, -0.5235988F, 0.0F, 0.0F);
    this.jumper_leg1R.mirror = false;
    this.jumper_leg2R = new ModelRenderer(this, 16, 176);
    this.jumper_leg2R.mirror = true;
    this.jumper_leg2R.addBox(-1.0F, 4.0F, -1.0F, 2, 2, 7);
    this.jumper_leg2R.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.jumper_leg2R.setTextureSize(512, 512);
    this.jumper_leg2R.mirror = true;
    setRotation(this.jumper_leg2R, 0.2617994F, 0.0F, 0.0F);
    this.jumper_leg2R.mirror = false;
    this.jumper_leg3R = new ModelRenderer(this, 0, 192);
    this.jumper_leg3R.mirror = true;
    this.jumper_leg3R.addBox(-1.5F, 5.0F, 4.0F, 3, 8, 3);
    this.jumper_leg3R.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.jumper_leg3R.setTextureSize(512, 512);
    this.jumper_leg3R.mirror = true;
    setRotation(this.jumper_leg3R, 0.0F, 0.0F, 0.0F);
    this.jumper_leg3R.mirror = false;
    this.jumper_footR = new ModelRenderer(this, 17, 192);
    this.jumper_footR.mirror = true;
    this.jumper_footR.addBox(-2.0F, 13.0F, -2.0F, 4, 2, 5);
    this.jumper_footR.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.jumper_footR.setTextureSize(512, 512);
    this.jumper_footR.mirror = true;
    setRotation(this.jumper_footR, 0.2617994F, 0.0F, 0.0F);
    this.jumper_footR.mirror = false;
    this.jumper_leg1L = new ModelRenderer(this, 0, 176);
    this.jumper_leg1L.addBox(-1.5F, -2.0F, -1.0F, 3, 7, 4);
    this.jumper_leg1L.setRotationPoint(5.0F, 9.0F, 0.0F);
    this.jumper_leg1L.setTextureSize(512, 512);
    this.jumper_leg1L.mirror = true;
    setRotation(this.jumper_leg1L, -0.5235988F, 0.0F, 0.0F);
    this.jumper_leg2L = new ModelRenderer(this, 16, 176);
    this.jumper_leg2L.addBox(-1.0F, 4.0F, -1.0F, 2, 2, 7);
    this.jumper_leg2L.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.jumper_leg2L.setTextureSize(512, 512);
    this.jumper_leg2L.mirror = true;
    setRotation(this.jumper_leg2L, 0.2617994F, 0.0F, 0.0F);
    this.jumper_leg3L = new ModelRenderer(this, 0, 192);
    this.jumper_leg3L.addBox(-1.5F, 5.0F, 4.0F, 3, 8, 3);
    this.jumper_leg3L.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.jumper_leg3L.setTextureSize(512, 512);
    this.jumper_leg3L.mirror = true;
    setRotation(this.jumper_leg3L, 0.0F, 0.0F, 0.0F);
    this.jumper_footL = new ModelRenderer(this, 17, 192);
    this.jumper_footL.addBox(-2.0F, 13.0F, -2.0F, 4, 2, 5);
    this.jumper_footL.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.jumper_footL.setTextureSize(512, 512);
    this.jumper_footL.mirror = true;
    setRotation(this.jumper_footL, 0.2617994F, 0.0F, 0.0F);
    
    this.heavy_lower_torso2 = new ModelRenderer(this, 0, 332);
    this.heavy_lower_torso2.addBox(-2.5F, -2.0F, -1.0F, 5, 5, 6);
    this.heavy_lower_torso2.setRotationPoint(0.0F, 9.0F, 0.0F);
    this.heavy_lower_torso2.setTextureSize(512, 512);
    this.heavy_lower_torso2.mirror = true;
    setRotation(this.heavy_lower_torso2, 0.0F, 0.0F, 0.0F);
    this.heavy_lower_torso1 = new ModelRenderer(this, 0, 314);
    this.heavy_lower_torso1.addBox(-4.5F, -8.0F, -2.5F, 9, 6, 9);
    this.heavy_lower_torso1.setRotationPoint(0.0F, 9.0F, 0.0F);
    this.heavy_lower_torso1.setTextureSize(512, 512);
    this.heavy_lower_torso1.mirror = true;
    setRotation(this.heavy_lower_torso1, 0.0F, 0.0F, 0.0F);
    this.heavy_leg_2R = new ModelRenderer(this, 0, 363);
    this.heavy_leg_2R.mirror = true;
    this.heavy_leg_2R.addBox(-4.5F, 5.0F, -5.0F, 7, 9, 8);
    this.heavy_leg_2R.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.heavy_leg_2R.setTextureSize(512, 512);
    this.heavy_leg_2R.mirror = true;
    setRotation(this.heavy_leg_2R, 0.2617994F, 0.0F, 0.0F);
    this.heavy_leg_2R.mirror = false;
    this.heavy_leg_1R = new ModelRenderer(this, 0, 346);
    this.heavy_leg_1R.mirror = true;
    this.heavy_leg_1R.addBox(-4.0F, -2.0F, -3.0F, 6, 8, 7);
    this.heavy_leg_1R.setRotationPoint(-3.0F, 10.0F, 1.0F);
    this.heavy_leg_1R.setTextureSize(512, 512);
    this.heavy_leg_1R.mirror = true;
    setRotation(this.heavy_leg_1R, -0.2617994F, 0.0F, 0.0F);
    this.heavy_leg_1R.mirror = false;
    this.heavy_leg_1L = new ModelRenderer(this, 0, 346);
    this.heavy_leg_1L.addBox(-2.0F, -2.0F, -3.0F, 6, 8, 7);
    this.heavy_leg_1L.setRotationPoint(3.0F, 10.0F, 1.0F);
    this.heavy_leg_1L.setTextureSize(512, 512);
    this.heavy_leg_1L.mirror = true;
    setRotation(this.heavy_leg_1L, -0.2617994F, 0.0F, 0.0F);
    this.heavy_leg_2L = new ModelRenderer(this, 0, 363);
    this.heavy_leg_2L.addBox(-2.5F, 5.0F, -5.0F, 7, 9, 8);
    this.heavy_leg_2L.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.heavy_leg_2L.setTextureSize(512, 512);
    this.heavy_leg_2L.mirror = true;
    setRotation(this.heavy_leg_2L, 0.2617994F, 0.0F, 0.0F);
    
    this.crawler_torso1 = new ModelRenderer(this, 0, 204);
    this.crawler_torso1.addBox(-5.0F, -7.0F, -1.0F, 10, 6, 6);
    this.crawler_torso1.setRotationPoint(0.0F, 9.0F, 0.0F);
    this.crawler_torso1.setTextureSize(512, 512);
    this.crawler_torso1.mirror = true;
    setRotation(this.crawler_torso1, 0.0F, 0.0F, 0.0F);
    this.crawler_torso2 = new ModelRenderer(this, 0, 217);
    this.crawler_torso2.addBox(-4.0F, -3.0F, -2.0F, 8, 9, 5);
    this.crawler_torso2.setRotationPoint(0.0F, 9.0F, 0.0F);
    this.crawler_torso2.setTextureSize(512, 512);
    this.crawler_torso2.mirror = true;
    setRotation(this.crawler_torso2, -0.5235988F, 0.0F, 0.0F);
    this.lower_crawler_torso1 = new ModelRenderer(this, 0, 233);
    this.lower_crawler_torso1.addBox(-3.0F, -2.0F, -1.0F, 6, 5, 5);
    this.lower_crawler_torso1.setRotationPoint(0.0F, 6.0F, 0.0F);
    this.lower_crawler_torso1.setTextureSize(512, 512);
    this.lower_crawler_torso1.mirror = true;
    setRotation(this.lower_crawler_torso1, 0.5235988F, 0.0F, 0.0F);
    this.lower_crawler_torso2 = new ModelRenderer(this, 25, 233);
    this.lower_crawler_torso2.addBox(-2.5F, 2.0F, -2.0F, 5, 7, 5);
    this.lower_crawler_torso2.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.lower_crawler_torso2.setTextureSize(512, 512);
    this.lower_crawler_torso2.mirror = true;
    setRotation(this.lower_crawler_torso2, 0.5235988F, 0.0F, 0.0F);
    this.lower_crawler_torso3 = new ModelRenderer(this, 0, 245);
    this.lower_crawler_torso3.addBox(-2.0F, 5.0F, 3.0F, 4, 4, 9);
    this.lower_crawler_torso3.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.lower_crawler_torso3.setTextureSize(512, 512);
    this.lower_crawler_torso3.mirror = true;
    setRotation(this.lower_crawler_torso3, -0.5235988F, 0.0F, 0.0F);
    this.crawler_tail1 = new ModelRenderer(this, 0, 259);
    this.crawler_tail1.addBox(-1.5F, 12.0F, 2.0F, 3, 3, 9);
    this.crawler_tail1.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.crawler_tail1.setTextureSize(512, 512);
    this.crawler_tail1.mirror = true;
    setRotation(this.crawler_tail1, 0.7853982F, 0.0F, 0.0F);
    this.crawler_tail2 = new ModelRenderer(this, 0, 273);
    this.crawler_tail2.addBox(-1.0F, 6.0F, 16.0F, 2, 2, 6);
    this.crawler_tail2.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.crawler_tail2.setTextureSize(512, 512);
    this.crawler_tail2.mirror = true;
    setRotation(this.crawler_tail2, -0.5235988F, 0.0F, 0.0F);
    this.crawler_leg1BR = new ModelRenderer(this, 0, 295);
    this.crawler_leg1BR.mirror = true;
    this.crawler_leg1BR.addBox(-0.5F, 2.0F, -4.5F, 1, 6, 1);
    this.crawler_leg1BR.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.crawler_leg1BR.setTextureSize(512, 512);
    this.crawler_leg1BR.mirror = true;
    setRotation(this.crawler_leg1BR, -0.3617994F, 0.0F, 0.0F);
    this.crawler_leg1BR.mirror = false;
    this.crawler_leg1TR = new ModelRenderer(this, 0, 285);
    this.crawler_leg1TR.mirror = true;
    this.crawler_leg1TR.addBox(-1.0F, -1.0F, -5.0F, 2, 2, 6);
    this.crawler_leg1TR.setRotationPoint(-4.0F, 3.0F, -2.0F);
    this.crawler_leg1TR.setTextureSize(512, 512);
    this.crawler_leg1TR.mirror = true;
    setRotation(this.crawler_leg1TR, 0.2617994F, 0.5235988F, 0.0F);
    this.crawler_leg1TR.mirror = false;
    this.crawler_leg2BR = new ModelRenderer(this, 9, 295);
    this.crawler_leg2BR.mirror = true;
    this.crawler_leg2BR.addBox(-3.5F, 1.5F, -0.5F, 1, 8, 1);
    this.crawler_leg2BR.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.crawler_leg2BR.setTextureSize(512, 512);
    this.crawler_leg2BR.mirror = true;
    setRotation(this.crawler_leg2BR, 0.0F, 0.0F, 0.5235988F);
    this.crawler_leg2BR.mirror = false;
    this.crawler_leg5R = new ModelRenderer(this, 0, 321);
    this.crawler_leg5R.mirror = true;
    this.crawler_leg5R.addBox(-4.0F, -0.5F, -0.5F, 4, 1, 1);
    this.crawler_leg5R.setRotationPoint(-2.0F, 7.0F, 11.0F);
    this.crawler_leg5R.setTextureSize(512, 512);
    this.crawler_leg5R.mirror = true;
    setRotation(this.crawler_leg5R, 0.5235988F, 0.7853982F, -0.7853982F);
    this.crawler_leg5R.mirror = false;
    this.crawler_leg2TR = new ModelRenderer(this, 18, 289);
    this.crawler_leg2TR.mirror = true;
    this.crawler_leg2TR.addBox(-4.0F, -1.0F, -1.0F, 5, 2, 2);
    this.crawler_leg2TR.setRotationPoint(-3.0F, 2.0F, 1.0F);
    this.crawler_leg2TR.setTextureSize(512, 512);
    this.crawler_leg2TR.mirror = true;
    setRotation(this.crawler_leg2TR, 0.0F, -0.3490659F, 0.0F);
    this.crawler_leg2TR.mirror = false;
    this.crawler_leg3R = new ModelRenderer(this, 0, 309);
    this.crawler_leg3R.mirror = true;
    this.crawler_leg3R.addBox(-5.0F, -0.5F, -0.5F, 5, 1, 1);
    this.crawler_leg3R.setRotationPoint(-2.0F, 7.0F, 0.0F);
    this.crawler_leg3R.setTextureSize(512, 512);
    this.crawler_leg3R.mirror = true;
    setRotation(this.crawler_leg3R, -0.5235988F, 0.0F, -0.7853982F);
    this.crawler_leg3R.mirror = false;
    this.crawler_leg4R = new ModelRenderer(this, 0, 315);
    this.crawler_leg4R.mirror = true;
    this.crawler_leg4R.addBox(-4.0F, -0.5F, -0.5F, 4, 1, 1);
    this.crawler_leg4R.setRotationPoint(-2.0F, 6.0F, 7.0F);
    this.crawler_leg4R.setTextureSize(512, 512);
    this.crawler_leg4R.mirror = true;
    setRotation(this.crawler_leg4R, 0.5235988F, 0.0F, -0.7853982F);
    this.crawler_leg4R.mirror = false;
    this.crawler_leg1TL = new ModelRenderer(this, 0, 285);
    this.crawler_leg1TL.addBox(-1.0F, -1.0F, -5.0F, 2, 2, 6);
    this.crawler_leg1TL.setRotationPoint(4.0F, 3.0F, -2.0F);
    this.crawler_leg1TL.setTextureSize(512, 512);
    this.crawler_leg1TL.mirror = true;
    setRotation(this.crawler_leg1TL, 0.2617994F, -0.5235988F, 0.0F);
    this.crawler_leg1BL = new ModelRenderer(this, 0, 295);
    this.crawler_leg1BL.addBox(-0.5F, 2.0F, -4.5F, 1, 6, 1);
    this.crawler_leg1BL.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.crawler_leg1BL.setTextureSize(512, 512);
    this.crawler_leg1BL.mirror = true;
    setRotation(this.crawler_leg1BL, -0.3617994F, 0.0F, 0.0F);
    this.crawler_leg2TL = new ModelRenderer(this, 18, 289);
    this.crawler_leg2TL.addBox(-1.0F, -1.0F, -1.0F, 5, 2, 2);
    this.crawler_leg2TL.setRotationPoint(3.0F, 2.0F, 1.0F);
    this.crawler_leg2TL.setTextureSize(512, 512);
    this.crawler_leg2TL.mirror = true;
    setRotation(this.crawler_leg2TL, 0.0F, 0.3490659F, 0.0F);
    this.crawler_leg2BL = new ModelRenderer(this, 9, 295);
    this.crawler_leg2BL.addBox(2.5F, 1.5F, -0.5F, 1, 8, 1);
    this.crawler_leg2BL.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.crawler_leg2BL.setTextureSize(512, 512);
    this.crawler_leg2BL.mirror = true;
    setRotation(this.crawler_leg2BL, 0.0F, 0.0F, -0.5235988F);
    this.crawler_leg3L = new ModelRenderer(this, 0, 309);
    this.crawler_leg3L.addBox(0.0F, -0.5F, -0.5F, 5, 1, 1);
    this.crawler_leg3L.setRotationPoint(2.0F, 7.0F, 0.0F);
    this.crawler_leg3L.setTextureSize(512, 512);
    this.crawler_leg3L.mirror = true;
    setRotation(this.crawler_leg3L, -0.5235988F, 0.0F, 0.7853982F);
    this.crawler_leg4L = new ModelRenderer(this, 0, 315);
    this.crawler_leg4L.addBox(0.0F, -0.5F, -0.5F, 4, 1, 1);
    this.crawler_leg4L.setRotationPoint(2.0F, 6.0F, 7.0F);
    this.crawler_leg4L.setTextureSize(512, 512);
    this.crawler_leg4L.mirror = true;
    setRotation(this.crawler_leg4L, 0.5235988F, 0.0F, 0.7853982F);
    this.crawler_leg5L = new ModelRenderer(this, 0, 321);
    this.crawler_leg5L.addBox(0.0F, -0.5F, -0.5F, 4, 1, 1);
    this.crawler_leg5L.setRotationPoint(2.0F, 7.0F, 11.0F);
    this.crawler_leg5L.setTextureSize(512, 512);
    this.crawler_leg5L.mirror = true;
    setRotation(this.crawler_leg5L, 0.5235988F, -0.7853982F, 0.7853982F);
    







    this.default_armL1 = new ModelRenderer(this, 0, 111);
    this.default_armL1.addBox(-2.0F, -3.0F, -3.0F, 6, 6, 6);
    this.default_armL1.setRotationPoint(7.0F, -3.0F, 1.0F);
    this.default_armL1.setTextureSize(512, 512);
    this.default_armL1.mirror = true;
    setRotation(this.default_armL1, 0.0F, 0.0F, -0.5235988F);
    this.default_armL2 = new ModelRenderer(this, 0, 124);
    this.default_armL2.addBox(-1.0F, 1.0F, -2.0F, 4, 5, 4);
    this.default_armL2.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.default_armL2.setTextureSize(512, 512);
    this.default_armL2.mirror = true;
    setRotation(this.default_armL2, 0.0F, 0.0F, 0.4363323F);
    this.default_armL3 = new ModelRenderer(this, 0, 133);
    this.default_armL3.addBox(-1.0F, 5.0F, -1.0F, 5, 7, 5);
    this.default_armL3.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.default_armL3.setTextureSize(512, 512);
    this.default_armL3.mirror = true;
    setRotation(this.default_armL3, -0.2617994F, 0.0F, 0.0872665F);
    this.default_armR1 = new ModelRenderer(this, 0, 111);
    this.default_armR1.mirror = true;
    this.default_armR1.addBox(-4.0F, -3.0F, -3.0F, 6, 6, 6);
    this.default_armR1.setRotationPoint(-7.0F, -3.0F, 1.0F);
    this.default_armR1.setTextureSize(512, 512);
    this.default_armR1.mirror = true;
    setRotation(this.default_armR1, 0.0F, 0.0F, 0.5235988F);
    this.default_armR1.mirror = false;
    this.default_armR2 = new ModelRenderer(this, 0, 124);
    this.default_armR2.mirror = true;
    this.default_armR2.addBox(-3.0F, 1.0F, -2.0F, 4, 5, 4);
    this.default_armR2.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.default_armR2.setTextureSize(512, 512);
    this.default_armR2.mirror = true;
    setRotation(this.default_armR2, 0.0F, 0.0F, -0.4363323F);
    this.default_armR2.mirror = false;
    this.default_armR3 = new ModelRenderer(this, 0, 133);
    this.default_armR3.mirror = true;
    this.default_armR3.addBox(-4.0F, 5.0F, -1.0F, 5, 7, 5);
    this.default_armR3.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.default_armR3.setTextureSize(512, 512);
    this.default_armR3.mirror = true;
    setRotation(this.default_armR3, -0.2617994F, 0.0F, -0.0872665F);
    this.default_armR3.mirror = false;
    
    this.golem_sholderL = new ModelRenderer(this, 52, 1);
    this.golem_sholderL.addBox(-2.0F, -3.0F, -2.0F, 7, 7, 7);
    this.golem_sholderL.setRotationPoint(7.0F, -3.0F, 1.0F);
    this.golem_sholderL.setTextureSize(512, 512);
    this.golem_sholderL.mirror = true;
    setRotation(this.golem_sholderL, 0.0F, 0.0F, 0.0F);
    this.golem_armor_sholderL = new ModelRenderer(this, 52, 51);
    this.golem_armor_sholderL.addBox(-3.0F, -4.0F, -3.0F, 9, 7, 9);
    this.golem_armor_sholderL.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.golem_armor_sholderL.setTextureSize(512, 512);
    this.golem_armor_sholderL.mirror = true;
    setRotation(this.golem_armor_sholderL, 0.0F, 0.0F, 0.0F);
    this.golem_upper_armL = new ModelRenderer(this, 54, 17);
    this.golem_upper_armL.addBox(0.0F, 4.0F, 0.0F, 3, 9, 3);
    this.golem_upper_armL.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.golem_upper_armL.setTextureSize(512, 512);
    this.golem_upper_armL.mirror = true;
    setRotation(this.golem_upper_armL, 0.0F, 0.0F, -0.2617994F);
    this.golem_lower_armL = new ModelRenderer(this, 52, 31);
    this.golem_lower_armL.addBox(-1.0F, 9.0F, -16.0F, 6, 7, 13);
    this.golem_lower_armL.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.golem_lower_armL.setTextureSize(512, 512);
    this.golem_lower_armL.mirror = true;
    setRotation(this.golem_lower_armL, 0.5235988F, 0.0F, 0.0F);
    this.golem_armor_lower_armL = new ModelRenderer(this, 64, 75);
    this.golem_armor_lower_armL.addBox(-1.5F, 8.5F, -16.5F, 7, 8, 14);
    this.golem_armor_lower_armL.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.golem_armor_lower_armL.setTextureSize(512, 512);
    this.golem_armor_lower_armL.mirror = true;
    setRotation(this.golem_armor_lower_armL, 0.0F, 0.0F, -0.0F);
    this.golem_sholderR = new ModelRenderer(this, 52, 1);
    this.golem_sholderR.mirror = true;
    this.golem_sholderR.addBox(-5.0F, -3.0F, -2.0F, 7, 7, 7);
    this.golem_sholderR.setRotationPoint(-7.0F, -3.0F, 1.0F);
    this.golem_sholderR.setTextureSize(512, 512);
    this.golem_sholderR.mirror = true;
    setRotation(this.golem_sholderR, 0.0F, 0.0F, 0.0F);
    this.golem_sholderR.mirror = false;
    this.golem_armor_sholderR = new ModelRenderer(this, 52, 51);
    this.golem_armor_sholderR.mirror = true;
    this.golem_armor_sholderR.addBox(-6.0F, -4.0F, -3.0F, 9, 7, 9);
    this.golem_armor_sholderR.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.golem_armor_sholderR.setTextureSize(512, 512);
    this.golem_armor_sholderR.mirror = true;
    setRotation(this.golem_armor_sholderR, 0.0F, 0.0F, 0.0F);
    this.golem_armor_sholderR.mirror = false;
    this.golem_upper_armR = new ModelRenderer(this, 54, 17);
    this.golem_upper_armR.mirror = true;
    this.golem_upper_armR.addBox(-3.0F, 4.0F, 0.0F, 3, 9, 3);
    this.golem_upper_armR.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.golem_upper_armR.setTextureSize(512, 512);
    this.golem_upper_armR.mirror = true;
    setRotation(this.golem_upper_armR, 0.0F, 0.0F, 0.2617994F);
    this.golem_upper_armR.mirror = false;
    this.golem_lower_armR = new ModelRenderer(this, 52, 31);
    this.golem_lower_armR.mirror = true;
    this.golem_lower_armR.addBox(-5.0F, 9.0F, -16.0F, 6, 7, 13);
    this.golem_lower_armR.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.golem_lower_armR.setTextureSize(512, 512);
    this.golem_lower_armR.mirror = true;
    setRotation(this.golem_lower_armR, 0.5235988F, 0.0F, 0.0F);
    this.golem_lower_armR.mirror = false;
    this.golem_armor_lower_armR = new ModelRenderer(this, 64, 75);
    this.golem_armor_lower_armR.mirror = true;
    this.golem_armor_lower_armR.addBox(-5.5F, 8.5F, -16.5F, 7, 8, 14);
    this.golem_armor_lower_armR.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.golem_armor_lower_armR.setTextureSize(512, 512);
    this.golem_armor_lower_armR.mirror = true;
    setRotation(this.golem_armor_lower_armR, 0.0F, 0.0F, 0.0F);
    this.golem_armor_lower_armR.mirror = false;
    
    this.mantis_arm1L = new ModelRenderer(this, 180, 0);
    this.mantis_arm1L.mirror = true;
    this.mantis_arm1L.addBox(-1.0F, -1.5F, -1.5F, 3, 3, 3);
    this.mantis_arm1L.setRotationPoint(7.0F, -3.0F, 1.0F);
    this.mantis_arm1L.setTextureSize(512, 512);
    this.mantis_arm1L.mirror = true;
    setRotation(this.mantis_arm1L, 0.0F, 0.0F, 0.0F);
    this.mantis_arm1L.mirror = false;
    this.mantis_arm3L = new ModelRenderer(this, 180, 6);
    this.mantis_arm3L.mirror = true;
    this.mantis_arm3L.addBox(0.0F, 1.0F, -1.0F, 1, 8, 2);
    this.mantis_arm3L.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.mantis_arm3L.setTextureSize(512, 512);
    this.mantis_arm3L.mirror = true;
    setRotation(this.mantis_arm3L, 0.0872665F, 0.0F, -0.5235988F);
    this.mantis_arm3L.mirror = false;
    this.mantis_arm3L.mirror = true;
    this.mantis_arms3L = new ModelRenderer(this, 180, 9);
    this.mantis_arms3L.addBox(-1.0F, 7.0F, -8.0F, 3, 4, 8);
    this.mantis_arms3L.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.mantis_arms3L.setTextureSize(512, 512);
    this.mantis_arms3L.mirror = true;
    setRotation(this.mantis_arms3L, 0.0F, 0.0F, 0.0F);
    this.mantis_arms3L.mirror = false;
    this.mantis_bladeL = new ModelRenderer(this, 180, 21);
    this.mantis_bladeL.mirror = true;
    this.mantis_bladeL.addBox(5.0F, 7.0F, -11.0F, 1, 18, 6);
    this.mantis_bladeL.setRotationPoint(-5.0F, 1.0F, -2.0F);
    this.mantis_bladeL.setTextureSize(512, 512);
    this.mantis_bladeL.mirror = true;
    setRotation(this.mantis_bladeL, 0.0F, 0.0F, 0.0F);
    this.mantis_bladeL.mirror = false;
    this.mantis_arm1R = new ModelRenderer(this, 180, 0);
    this.mantis_arm1R.addBox(-2.0F, -1.5F, -1.5F, 3, 3, 3);
    this.mantis_arm1R.setRotationPoint(-7.0F, -3.0F, 1.0F);
    this.mantis_arm1R.setTextureSize(512, 512);
    this.mantis_arm1R.mirror = true;
    setRotation(this.mantis_arm1R, 0.0F, 0.0F, 0.0F);
    this.mantis_arm3R = new ModelRenderer(this, 180, 6);
    this.mantis_arm3R.addBox(-1.0F, 1.0F, -1.0F, 1, 8, 2);
    this.mantis_arm3R.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.mantis_arm3R.setTextureSize(512, 512);
    this.mantis_arm3R.mirror = true;
    setRotation(this.mantis_arm3R, 0.0872665F, 0.0F, 0.5235988F);
    this.mantis_arms3R = new ModelRenderer(this, 180, 9);
    this.mantis_arms3R.addBox(-2.0F, 7.0F, -8.0F, 3, 4, 8);
    this.mantis_arms3R.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.mantis_arms3R.setTextureSize(512, 512);
    this.mantis_arms3R.mirror = true;
    setRotation(this.mantis_arms3R, 0.0F, 0.0F, 0.0F);
    this.mantis_bladeR = new ModelRenderer(this, 180, 21);
    this.mantis_bladeR.addBox(-6.0F, 7.0F, -11.0F, 1, 18, 6);
    this.mantis_bladeR.setRotationPoint(5.0F, 1.0F, -2.0F);
    this.mantis_bladeR.setTextureSize(512, 512);
    this.mantis_bladeR.mirror = true;
    setRotation(this.mantis_bladeR, 0.0F, 0.0F, 0.0F);
    
    this.bug_lower_arm1L = new ModelRenderer(this, 167, 0);
    this.bug_lower_arm1L.addBox(-1.5F, -2.0F, -1.5F, 3, 7, 3);
    this.bug_lower_arm1L.setRotationPoint(7.0F, 2.0F, 1.0F);
    this.bug_lower_arm1L.setTextureSize(512, 512);
    this.bug_lower_arm1L.mirror = true;
    setRotation(this.bug_lower_arm1L, -0.2617994F, 0.0F, -0.7853982F);
    this.bug_lower_arm2L = new ModelRenderer(this, 167, 15);
    this.bug_lower_arm2L.addBox(2.0F, 3.0F, -1.5F, 2, 8, 2);
    this.bug_lower_arm2L.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.bug_lower_arm2L.setTextureSize(512, 512);
    this.bug_lower_arm2L.mirror = true;
    setRotation(this.bug_lower_arm2L, 0.0F, 0.0F, 0.7853982F);
    this.bug_lower_handL = new ModelRenderer(this, 167, 29);
    this.bug_lower_handL.addBox(1.5F, 11.0F, -2.5F, 3, 4, 3);
    this.bug_lower_handL.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.bug_lower_handL.setTextureSize(512, 512);
    this.bug_lower_handL.mirror = true;
    setRotation(this.bug_lower_handL, 0.0F, 0.0F, 0.0F);
    this.bug_upper_arm1L = new ModelRenderer(this, 167, 0);
    this.bug_upper_arm1L.addBox(-1.5F, -2.0F, -1.5F, 3, 7, 3);
    this.bug_upper_arm1L.setRotationPoint(7.0F, -3.0F, 1.0F);
    this.bug_upper_arm1L.setTextureSize(512, 512);
    this.bug_upper_arm1L.mirror = true;
    setRotation(this.bug_upper_arm1L, -0.5235988F, 0.0F, -0.7853982F);
    this.bug_upper_arm2L = new ModelRenderer(this, 167, 15);
    this.bug_upper_arm2L.addBox(2.0F, 3.0F, -2.0F, 2, 8, 2);
    this.bug_upper_arm2L.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.bug_upper_arm2L.setTextureSize(512, 512);
    this.bug_upper_arm2L.mirror = true;
    setRotation(this.bug_upper_arm2L, 0.0F, 0.0F, 0.7853982F);
    this.bug_upper_handL = new ModelRenderer(this, 167, 29);
    this.bug_upper_handL.addBox(1.5F, 11.0F, -2.5F, 3, 4, 3);
    this.bug_upper_handL.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.bug_upper_handL.setTextureSize(512, 512);
    this.bug_upper_handL.mirror = true;
    setRotation(this.bug_upper_handL, 0.0F, 0.0F, 0.0F);
    this.bug_lower_arm1R = new ModelRenderer(this, 167, 0);
    this.bug_lower_arm1R.mirror = true;
    this.bug_lower_arm1R.addBox(-1.5F, -2.0F, -1.5F, 3, 7, 3);
    this.bug_lower_arm1R.setRotationPoint(-7.0F, 2.0F, 1.0F);
    this.bug_lower_arm1R.setTextureSize(512, 512);
    this.bug_lower_arm1R.mirror = true;
    setRotation(this.bug_lower_arm1R, -0.2617994F, 0.0F, 0.7853982F);
    this.bug_lower_arm1R.mirror = false;
    this.bug_lower_arm2R = new ModelRenderer(this, 167, 15);
    this.bug_lower_arm2R.mirror = true;
    this.bug_lower_arm2R.addBox(-4.0F, 3.0F, -1.5F, 2, 8, 2);
    this.bug_lower_arm2R.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.bug_lower_arm2R.setTextureSize(512, 512);
    this.bug_lower_arm2R.mirror = true;
    setRotation(this.bug_lower_arm2R, 0.0F, 0.0F, -0.7853982F);
    this.bug_lower_arm2R.mirror = false;
    this.bug_lower_handR = new ModelRenderer(this, 167, 29);
    this.bug_lower_handR.mirror = true;
    this.bug_lower_handR.addBox(-4.5F, 11.0F, -2.5F, 3, 4, 3);
    this.bug_lower_handR.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.bug_lower_handR.setTextureSize(512, 512);
    this.bug_lower_handR.mirror = true;
    setRotation(this.bug_lower_handR, 0.0F, 0.0F, 0.0F);
    this.bug_lower_handR.mirror = false;
    this.bug_upper_arm1R = new ModelRenderer(this, 167, 0);
    this.bug_upper_arm1R.mirror = true;
    this.bug_upper_arm1R.addBox(-1.5F, -2.0F, -1.5F, 3, 7, 3);
    this.bug_upper_arm1R.setRotationPoint(-7.0F, -3.0F, 1.0F);
    this.bug_upper_arm1R.setTextureSize(512, 512);
    this.bug_upper_arm1R.mirror = true;
    setRotation(this.bug_upper_arm1R, -0.5235988F, 0.0F, 0.7853982F);
    this.bug_upper_arm1R.mirror = false;
    this.bug_upper_arm2R = new ModelRenderer(this, 167, 15);
    this.bug_upper_arm2R.mirror = true;
    this.bug_upper_arm2R.addBox(-4.0F, 3.0F, -2.0F, 2, 8, 2);
    this.bug_upper_arm2R.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.bug_upper_arm2R.setTextureSize(512, 512);
    this.bug_upper_arm2R.mirror = true;
    setRotation(this.bug_upper_arm2R, 0.0F, 0.0F, -0.7853982F);
    this.bug_upper_arm2R.mirror = false;
    this.bug_upper_handR = new ModelRenderer(this, 167, 29);
    this.bug_upper_handR.mirror = true;
    this.bug_upper_handR.addBox(-4.5F, 11.0F, -2.5F, 3, 4, 3);
    this.bug_upper_handR.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.bug_upper_handR.setTextureSize(512, 512);
    this.bug_upper_handR.mirror = true;
    setRotation(this.bug_upper_handR, 0.0F, 0.0F, 0.0F);
    this.bug_upper_handR.mirror = false;
    
    this.heavyarm1L = new ModelRenderer(this, 203, 0);
    this.heavyarm1L.addBox(-1.0F, -4.0F, -3.0F, 5, 6, 6);
    this.heavyarm1L.setRotationPoint(7.0F, -3.0F, 1.0F);
    this.heavyarm1L.setTextureSize(512, 512);
    this.heavyarm1L.mirror = true;
    setRotation(this.heavyarm1L, 0.0F, 0.0F, -0.296706F);
    this.heavyarm2L = new ModelRenderer(this, 203, 13);
    this.heavyarm2L.addBox(0.0F, -8.0F, -4.0F, 2, 9, 8);
    this.heavyarm2L.setRotationPoint(7.0F, -3.0F, 1.0F);
    this.heavyarm2L.setTextureSize(512, 512);
    this.heavyarm2L.mirror = true;
    setRotation(this.heavyarm2L, 0.0F, 0.0F, 0.2268928F);
    this.beavyarm3L = new ModelRenderer(this, 203, 31);
    this.beavyarm3L.addBox(-1.0F, 0.0F, -2.0F, 4, 8, 5);
    this.beavyarm3L.setRotationPoint(7.0F, -3.0F, 1.0F);
    this.beavyarm3L.setTextureSize(512, 512);
    this.beavyarm3L.mirror = true;
    setRotation(this.beavyarm3L, -0.7679449F, -0.122173F, -0.2268928F);
    this.heavyarm4L = new ModelRenderer(this, 203, 44);
    this.heavyarm4L.addBox(-11.0F, 3.0F, -8.0F, 11, 6, 4);
    this.heavyarm4L.setRotationPoint(7.0F, -3.0F, 1.0F);
    this.heavyarm4L.setTextureSize(512, 512);
    this.heavyarm4L.mirror = true;
    setRotation(this.heavyarm4L, -0.2617994F, -1.047198F, 0.0F);
    this.heavyarm5L = new ModelRenderer(this, 203, 55);
    this.heavyarm5L.addBox(-14.0F, 1.0F, -7.0F, 17, 10, 2);
    this.heavyarm5L.setRotationPoint(7.0F, -3.0F, 1.0F);
    this.heavyarm5L.setTextureSize(512, 512);
    this.heavyarm5L.mirror = true;
    setRotation(this.heavyarm5L, -0.2617994F, -1.047198F, 0.0F);
    this.heavyarmthumbL = new ModelRenderer(this, 222, 31);
    this.heavyarmthumbL.addBox(-8.0F, 3.0F, -10.0F, 4, 3, 1);
    this.heavyarmthumbL.setRotationPoint(7.0F, -3.0F, 1.0F);
    this.heavyarmthumbL.setTextureSize(512, 512);
    this.heavyarmthumbL.mirror = true;
    setRotation(this.heavyarmthumbL, 0.0F, -0.418879F, 0.0F);
    this.heavyarmfinger1L = new ModelRenderer(this, 222, 31);
    this.heavyarmfinger1L.addBox(-6.0F, 3.0F, -15.0F, 4, 3, 1);
    this.heavyarmfinger1L.setRotationPoint(7.0F, -3.0F, 1.0F);
    this.heavyarmfinger1L.setTextureSize(512, 512);
    this.heavyarmfinger1L.mirror = true;
    setRotation(this.heavyarmfinger1L, -0.2617994F, -0.0523599F, -0.3490659F);
    this.heavyarmfinger2L = new ModelRenderer(this, 222, 31);
    this.heavyarmfinger2L.addBox(-7.0F, 5.0F, -16.0F, 4, 3, 1);
    this.heavyarmfinger2L.setRotationPoint(7.0F, -3.0F, 1.0F);
    this.heavyarmfinger2L.setTextureSize(512, 512);
    this.heavyarmfinger2L.mirror = true;
    setRotation(this.heavyarmfinger2L, 0.0F, -0.2094395F, 0.0523599F);
    this.heavyarm1R = new ModelRenderer(this, 203, 0);
    this.heavyarm1R.mirror = true;
    this.heavyarm1R.addBox(-4.0F, -4.0F, -3.0F, 5, 6, 6);
    this.heavyarm1R.setRotationPoint(-7.0F, -3.0F, 1.0F);
    this.heavyarm1R.setTextureSize(512, 512);
    this.heavyarm1R.mirror = true;
    setRotation(this.heavyarm1R, 0.0F, 0.0F, 0.296706F);
    this.heavyarm1R.mirror = false;
    this.heavyarm2R = new ModelRenderer(this, 203, 13);
    this.heavyarm2R.mirror = true;
    this.heavyarm2R.addBox(-2.0F, -8.0F, -4.0F, 2, 9, 8);
    this.heavyarm2R.setRotationPoint(-7.0F, -3.0F, 1.0F);
    this.heavyarm2R.setTextureSize(512, 512);
    this.heavyarm2R.mirror = true;
    setRotation(this.heavyarm2R, 0.0F, 0.0F, -0.2268928F);
    this.heavyarm2R.mirror = false;
    this.beavyarm3R = new ModelRenderer(this, 203, 31);
    this.beavyarm3R.mirror = true;
    this.beavyarm3R.addBox(-3.0F, 0.0F, -2.0F, 4, 8, 5);
    this.beavyarm3R.setRotationPoint(-7.0F, -3.0F, 1.0F);
    this.beavyarm3R.setTextureSize(512, 512);
    this.beavyarm3R.mirror = true;
    setRotation(this.beavyarm3R, -0.7679449F, 0.122173F, 0.2268928F);
    this.beavyarm3R.mirror = false;
    this.heavyarm4R = new ModelRenderer(this, 203, 44);
    this.heavyarm4R.mirror = true;
    this.heavyarm4R.addBox(0.0F, 3.0F, -8.0F, 11, 6, 4);
    this.heavyarm4R.setRotationPoint(-7.0F, -3.0F, 1.0F);
    this.heavyarm4R.setTextureSize(512, 512);
    this.heavyarm4R.mirror = true;
    setRotation(this.heavyarm4R, -0.2617994F, 1.047198F, 0.0F);
    this.heavyarm4R.mirror = false;
    this.heavyarm5R = new ModelRenderer(this, 203, 55);
    this.heavyarm5R.mirror = true;
    this.heavyarm5R.addBox(-3.0F, 1.0F, -7.0F, 17, 10, 2);
    this.heavyarm5R.setRotationPoint(-7.0F, -3.0F, 1.0F);
    this.heavyarm5R.setTextureSize(512, 512);
    this.heavyarm5R.mirror = true;
    setRotation(this.heavyarm5R, -0.2617994F, 1.047198F, 0.0F);
    this.heavyarm5R.mirror = false;
    this.heavyarmthumbR = new ModelRenderer(this, 222, 31);
    this.heavyarmthumbR.mirror = true;
    this.heavyarmthumbR.addBox(4.0F, 3.0F, -10.0F, 4, 3, 1);
    this.heavyarmthumbR.setRotationPoint(-7.0F, -3.0F, 1.0F);
    this.heavyarmthumbR.setTextureSize(512, 512);
    this.heavyarmthumbR.mirror = true;
    setRotation(this.heavyarmthumbR, 0.0F, 0.418879F, 0.0F);
    this.heavyarmthumbR.mirror = false;
    this.heavyarmfinger1R = new ModelRenderer(this, 222, 31);
    this.heavyarmfinger1R.mirror = true;
    this.heavyarmfinger1R.addBox(2.0F, 3.0F, -15.0F, 4, 3, 1);
    this.heavyarmfinger1R.setRotationPoint(-7.0F, -3.0F, 1.0F);
    this.heavyarmfinger1R.setTextureSize(512, 512);
    this.heavyarmfinger1R.mirror = true;
    setRotation(this.heavyarmfinger1R, -0.2617994F, 0.0523599F, 0.3490659F);
    this.heavyarmfinger1R.mirror = false;
    this.heavyarmfinger2R = new ModelRenderer(this, 222, 31);
    this.heavyarmfinger2R.mirror = true;
    this.heavyarmfinger2R.addBox(3.0F, 5.0F, -16.0F, 4, 3, 1);
    this.heavyarmfinger2R.setRotationPoint(-7.0F, -3.0F, 1.0F);
    this.heavyarmfinger2R.setTextureSize(512, 512);
    this.heavyarmfinger2R.mirror = true;
    setRotation(this.heavyarmfinger2R, 0.0F, 0.2094395F, -0.0523599F);
    this.heavyarmfinger2R.mirror = false;
    




    this.default_tail1 = new ModelRenderer(this, 0, 90);
    this.default_tail1.addBox(-3.0F, -2.0F, -2.0F, 6, 5, 3);
    this.default_tail1.setRotationPoint(0.0F, 8.0F, 6.0F);
    this.default_tail1.setTextureSize(512, 512);
    this.default_tail1.mirror = true;
    setRotation(this.default_tail1, -0.5235988F, 0.0F, 0.0F);
    this.default_tail2 = new ModelRenderer(this, 0, 99);
    this.default_tail2.addBox(-2.0F, -1.0F, 0.0F, 4, 3, 3);
    this.default_tail2.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.default_tail2.setTextureSize(512, 512);
    this.default_tail2.mirror = true;
    setRotation(this.default_tail2, 0.2617994F, 0.0F, 0.0F);
    this.default_tail3 = new ModelRenderer(this, 0, 106);
    this.default_tail3.addBox(-1.5F, 0.5F, 2.0F, 3, 2, 2);
    this.default_tail3.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.default_tail3.setTextureSize(512, 512);
    this.default_tail3.mirror = true;
    setRotation(this.default_tail3, 0.2617994F, 0.0F, 0.0F);
    
    this.wolf_tail_1 = new ModelRenderer(this, 400, 251);
    this.wolf_tail_1.addBox(-1.5F, 0.0F, -1.5F, 3, 3, 3);
    this.wolf_tail_1.setRotationPoint(0.0F, 8.0F, 4.0F);
    this.wolf_tail_1.setTextureSize(512, 512);
    this.wolf_tail_1.mirror = true;
    setRotation(this.wolf_tail_1, 1.134464F, 0.0F, 0.0F);
    this.wolf_tail_2 = new ModelRenderer(this, 400, 257);
    this.wolf_tail_2.addBox(-2.0F, 3.0F, -2.0F, 4, 4, 4);
    this.wolf_tail_2.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.wolf_tail_2.setTextureSize(512, 512);
    this.wolf_tail_2.mirror = true;
    setRotation(this.wolf_tail_2, 0.0F, 0.0F, 0.0F);
    this.wolf_tail_3 = new ModelRenderer(this, 400, 265);
    this.wolf_tail_3.addBox(-2.5F, 7.0F, -2.5F, 5, 4, 5);
    this.wolf_tail_3.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.wolf_tail_3.setTextureSize(512, 512);
    this.wolf_tail_3.mirror = true;
    setRotation(this.wolf_tail_3, 0.0F, 0.0F, 0.0F);
    this.wolf_tail_4 = new ModelRenderer(this, 400, 273);
    this.wolf_tail_4.addBox(-2.0F, 10.0F, -2.0F, 4, 4, 4);
    this.wolf_tail_4.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.wolf_tail_4.setTextureSize(512, 512);
    this.wolf_tail_4.mirror = true;
    setRotation(this.wolf_tail_4, 0.0F, 0.0F, 0.0F);
    this.wolf_tail_5 = new ModelRenderer(this, 400, 282);
    this.wolf_tail_5.addBox(-1.5F, 14.0F, -1.5F, 3, 2, 3);
    this.wolf_tail_5.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.wolf_tail_5.setTextureSize(512, 512);
    this.wolf_tail_5.mirror = true;
    setRotation(this.wolf_tail_5, 0.0F, 0.0F, 0.0F);
    this.wolf_tail_6 = new ModelRenderer(this, 400, 288);
    this.wolf_tail_6.addBox(-1.0F, 16.0F, -1.0F, 2, 1, 2);
    this.wolf_tail_6.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.wolf_tail_6.setTextureSize(512, 512);
    this.wolf_tail_6.mirror = true;
    setRotation(this.wolf_tail_6, 0.0F, 0.0F, 0.0F);
    
    this.shark_tail_1 = new ModelRenderer(this, 400, 163);
    this.shark_tail_1.addBox(-3.0F, -3.0F, -3.0F, 6, 6, 7);
    this.shark_tail_1.setRotationPoint(0.0F, 8.0F, 6.0F);
    this.shark_tail_1.setTextureSize(512, 512);
    this.shark_tail_1.mirror = true;
    setRotation(this.shark_tail_1, -0.2617994F, 0.0F, 0.0F);
    this.shark_tail_2 = new ModelRenderer(this, 400, 178);
    this.shark_tail_2.addBox(-2.5F, -3.5F, 0.0F, 5, 5, 7);
    this.shark_tail_2.setRotationPoint(0.0F, 1.0F, 3.0F);
    this.shark_tail_2.setTextureSize(512, 512);
    this.shark_tail_2.mirror = true;
    setRotation(this.shark_tail_2, 0.1047198F, 0.0F, 0.0F);
    this.shark_tail_3 = new ModelRenderer(this, 400, 192);
    this.shark_tail_3.addBox(-2.0F, -3.0F, 0.0F, 4, 4, 7);
    this.shark_tail_3.setRotationPoint(0.0F, 0.0F, 6.0F);
    this.shark_tail_3.setTextureSize(512, 512);
    this.shark_tail_3.mirror = true;
    setRotation(this.shark_tail_3, 0.1047197F, 0.0F, 0.0F);
    this.shark_tail_4 = new ModelRenderer(this, 400, 206);
    this.shark_tail_4.addBox(-0.5F, -2.0F, -1.0F, 1, 13, 17);
    this.shark_tail_4.setRotationPoint(0.0F, 0.0F, 6.0F);
    this.shark_tail_4.setTextureSize(512, 512);
    this.shark_tail_4.mirror = true;
    setRotation(this.shark_tail_4, 0.9948377F, 0.0F, 0.0F);
    this.shark_tail_fin = new ModelRenderer(this, 400, 238);
    this.shark_tail_fin.addBox(-0.5F, -3.0F, 1.0F, 1, 6, 7);
    this.shark_tail_fin.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.shark_tail_fin.setTextureSize(512, 512);
    this.shark_tail_fin.mirror = true;
    setRotation(this.shark_tail_fin, 1.0471976F, 0.0F, 0.0F);
    this.shark_finsideR = new ModelRenderer(this, 420, 238);
    this.shark_finsideR.mirror = true;
    this.shark_finsideR.addBox(-1.5F, -2.5F, 2.0F, 1, 3, 4);
    this.shark_finsideR.setRotationPoint(0.0F, 1.0F, 0.0F);
    this.shark_finsideR.setTextureSize(512, 512);
    this.shark_finsideR.mirror = true;
    setRotation(this.shark_finsideR, -0.6283186F, 0.0F, 0.5235988F);
    this.shark_finsideR.mirror = false;
    this.shark_finsideL = new ModelRenderer(this, 420, 238);
    this.shark_finsideL.addBox(0.5F, -2.5F, 2.0F, 1, 3, 4);
    this.shark_finsideL.setRotationPoint(0.0F, 1.0F, 0.0F);
    this.shark_finsideL.setTextureSize(512, 512);
    this.shark_finsideL.mirror = true;
    setRotation(this.shark_finsideL, -0.6283186F, 0.0F, -0.5235988F);
    

    this.scorpion_tail1 = new ModelRenderer(this, 400, 292);
    this.scorpion_tail1.addBox(-2.0F, -2.0F, 0.0F, 4, 4, 4);
    this.scorpion_tail1.setRotationPoint(0.0F, 8.0F, 5.0F);
    this.scorpion_tail1.setTextureSize(512, 512);
    this.scorpion_tail1.mirror = true;
    setRotation(this.scorpion_tail1, 0.0F, 0.0F, 0.0F);
    this.scorpion_tail2 = new ModelRenderer(this, 400, 292);
    this.scorpion_tail2.addBox(-2.0F, -2.0F, 0.0F, 4, 4, 4);
    this.scorpion_tail2.setRotationPoint(0.0F, -1.0F, 4.0F);
    this.scorpion_tail2.setTextureSize(512, 512);
    this.scorpion_tail2.mirror = true;
    setRotation(this.scorpion_tail2, 0.0F, 0.0F, 0.0F);
    this.scorpion_tail3 = new ModelRenderer(this, 400, 292);
    this.scorpion_tail3.addBox(-2.0F, -2.0F, 0.0F, 4, 4, 4);
    this.scorpion_tail3.setRotationPoint(0.0F, -2.0F, 3.5F);
    this.scorpion_tail3.setTextureSize(512, 512);
    this.scorpion_tail3.mirror = true;
    setRotation(this.scorpion_tail3, 0.0F, 0.0F, 0.0F);
    this.scorpion_tail4 = new ModelRenderer(this, 400, 292);
    this.scorpion_tail4.addBox(-2.0F, -2.0F, 0.0F, 4, 4, 4);
    this.scorpion_tail4.setRotationPoint(0.0F, -3.0F, 2.5F);
    this.scorpion_tail4.setTextureSize(512, 512);
    this.scorpion_tail4.mirror = true;
    setRotation(this.scorpion_tail4, 0.0F, 0.0F, 0.0F);
    this.scorpion_tail5 = new ModelRenderer(this, 400, 292);
    this.scorpion_tail5.addBox(-2.0F, -2.0F, 0.0F, 4, 4, 4);
    this.scorpion_tail5.setRotationPoint(0.0F, -3.0F, 2.0F);
    this.scorpion_tail5.setTextureSize(512, 512);
    this.scorpion_tail5.mirror = true;
    setRotation(this.scorpion_tail5, 0.0F, 0.0F, 0.0F);
    this.scorpion_tail6 = new ModelRenderer(this, 400, 292);
    this.scorpion_tail6.addBox(-2.0F, -2.0F, 0.0F, 4, 4, 4);
    this.scorpion_tail6.setRotationPoint(0.0F, -4.0F, 1.0F);
    this.scorpion_tail6.setTextureSize(512, 512);
    this.scorpion_tail6.mirror = true;
    setRotation(this.scorpion_tail6, 0.0F, 0.0F, 0.0F);
    this.scorpion_tail7 = new ModelRenderer(this, 400, 292);
    this.scorpion_tail7.addBox(-2.0F, -2.0F, 0.0F, 4, 4, 4);
    this.scorpion_tail7.setRotationPoint(0.0F, -4.0F, 1.0F);
    this.scorpion_tail7.setTextureSize(512, 512);
    this.scorpion_tail7.mirror = true;
    setRotation(this.scorpion_tail7, 0.0F, 0.0F, 0.0F);
    this.scorpion_tail8 = new ModelRenderer(this, 400, 292);
    this.scorpion_tail8.addBox(-2.0F, -2.0F, 0.0F, 4, 4, 4);
    this.scorpion_tail8.setRotationPoint(0.0F, -4.0F, -1.0F);
    this.scorpion_tail8.setTextureSize(512, 512);
    this.scorpion_tail8.mirror = true;
    setRotation(this.scorpion_tail8, 0.0F, 0.0F, 0.0F);
    this.scorpion_tail9 = new ModelRenderer(this, 400, 292);
    this.scorpion_tail9.addBox(-2.0F, -2.0F, 0.0F, 4, 4, 4);
    this.scorpion_tail9.setRotationPoint(0.0F, -4.0F, -2.0F);
    this.scorpion_tail9.setTextureSize(512, 512);
    this.scorpion_tail9.mirror = true;
    setRotation(this.scorpion_tail9, 0.0F, 0.0F, 0.0F);
    this.scorpion_stinger1 = new ModelRenderer(this, 400, 300);
    this.scorpion_stinger1.addBox(-2.5F, -7.0F, -2.0F, 5, 7, 5);
    this.scorpion_stinger1.setRotationPoint(0.0F, -3.0F, 1.0F);
    this.scorpion_stinger1.setTextureSize(512, 512);
    this.scorpion_stinger1.mirror = true;
    setRotation(this.scorpion_stinger1, 2.059489F, 0.0F, 0.0F);
    this.scorpion_stinger2 = new ModelRenderer(this, 400, 312);
    this.scorpion_stinger2.addBox(-1.5F, -11.0F, -1.0F, 3, 4, 3);
    this.scorpion_stinger2.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.scorpion_stinger2.setTextureSize(512, 512);
    this.scorpion_stinger2.mirror = true;
    setRotation(this.scorpion_stinger2, 0.0F, 0.0F, 0.0F);
    this.scorpion_stinger3 = new ModelRenderer(this, 399, 312);
    this.scorpion_stinger3.addBox(-0.5F, -13.0F, 0.0F, 1, 2, 1);
    this.scorpion_stinger3.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.scorpion_stinger3.setTextureSize(512, 512);
    this.scorpion_stinger3.mirror = true;
    setRotation(this.scorpion_stinger3, 0.0F, 0.0F, 0.0F);
    





    this.default_wing_stubR = new ModelRenderer(this, 18, 49);
    this.default_wing_stubR.mirror = true;
    this.default_wing_stubR.addBox(-1.0F, -2.0F, 0.0F, 2, 4, 1);
    this.default_wing_stubR.setRotationPoint(-3.0F, -3.0F, 4.0F);
    this.default_wing_stubR.setTextureSize(512, 512);
    this.default_wing_stubR.mirror = true;
    setRotation(this.default_wing_stubR, 0.2617994F, 0.0F, 0.0F);
    this.default_wing_stubR.mirror = false;
    this.default_wing_stubL = new ModelRenderer(this, 18, 49);
    this.default_wing_stubL.addBox(-1.0F, -2.0F, 0.0F, 2, 4, 1);
    this.default_wing_stubL.setRotationPoint(3.0F, -3.0F, 4.0F);
    this.default_wing_stubL.setTextureSize(512, 512);
    this.default_wing_stubL.mirror = true;
    setRotation(this.default_wing_stubL, 0.2617994F, 0.0F, 0.0F);
    



    this.default_armL1.addChild(this.default_armL2);
    this.default_armL2.addChild(this.default_armL3);
    this.default_armR1.addChild(this.default_armR2);
    this.default_armR2.addChild(this.default_armR3);
    
    this.golem_sholderL.addChild(this.golem_armor_sholderL);
    this.golem_sholderL.addChild(this.golem_upper_armL);
    this.golem_upper_armL.addChild(this.golem_lower_armL);
    this.golem_lower_armL.addChild(this.golem_armor_lower_armL);
    this.golem_sholderR.addChild(this.golem_armor_sholderR);
    this.golem_sholderR.addChild(this.golem_upper_armR);
    this.golem_upper_armR.addChild(this.golem_lower_armR);
    this.golem_lower_armR.addChild(this.golem_armor_lower_armR);
    
    this.default_legL1.addChild(this.default_legL2);
    this.default_legL2.addChild(this.default_legL3);
    this.default_legL3.addChild(this.default_legL4);
    this.default_legL3.addChild(this.default_legL5);
    this.default_legR1.addChild(this.default_legR2);
    this.default_legR2.addChild(this.default_legR3);
    this.default_legR3.addChild(this.default_legR4);
    this.default_legR3.addChild(this.default_legR5);
    
    this.default_tail1.addChild(this.default_tail2);
    this.default_tail2.addChild(this.default_tail3);
    


    this.jumper_leg1L.addChild(this.jumper_leg2L);
    this.jumper_leg2L.addChild(this.jumper_leg3L);
    this.jumper_leg3L.addChild(this.jumper_footL);
    this.jumper_leg1R.addChild(this.jumper_leg2R);
    this.jumper_leg2R.addChild(this.jumper_leg3R);
    this.jumper_leg3R.addChild(this.jumper_footR);
    

    this.heavy_leg_1L.addChild(this.heavy_leg_2L);
    this.heavy_leg_1R.addChild(this.heavy_leg_2R);
    
    this.crawler_torso2.addChild(this.lower_crawler_torso1);
    this.lower_crawler_torso1.addChild(this.lower_crawler_torso2);
    this.lower_crawler_torso2.addChild(this.lower_crawler_torso3);
    this.lower_crawler_torso3.addChild(this.crawler_tail1);
    this.crawler_tail1.addChild(this.crawler_tail2);
    
    this.lower_crawler_torso3.addChild(this.crawler_leg5L);
    this.lower_crawler_torso3.addChild(this.crawler_leg5R);
    this.lower_crawler_torso3.addChild(this.crawler_leg4L);
    this.lower_crawler_torso3.addChild(this.crawler_leg4R);
    this.lower_crawler_torso2.addChild(this.crawler_leg3L);
    this.lower_crawler_torso2.addChild(this.crawler_leg3R);
    this.lower_crawler_torso1.addChild(this.crawler_leg2TL);
    this.lower_crawler_torso1.addChild(this.crawler_leg2TR);
    this.crawler_leg2TL.addChild(this.crawler_leg2BL);
    this.crawler_leg2TR.addChild(this.crawler_leg2BR);
    this.crawler_torso2.addChild(this.crawler_leg1TL);
    this.crawler_torso2.addChild(this.crawler_leg1TR);
    this.crawler_leg1TL.addChild(this.crawler_leg1BL);
    this.crawler_leg1TR.addChild(this.crawler_leg1BR);
    
    this.wolf_tail_1.addChild(this.wolf_tail_2);
    this.wolf_tail_2.addChild(this.wolf_tail_3);
    this.wolf_tail_3.addChild(this.wolf_tail_4);
    this.wolf_tail_4.addChild(this.wolf_tail_5);
    this.wolf_tail_5.addChild(this.wolf_tail_6);
    
    this.shark_tail_1.addChild(this.shark_tail_2);
    this.shark_tail_2.addChild(this.shark_tail_3);
    this.shark_tail_3.addChild(this.shark_tail_4);
    this.shark_tail_1.addChild(this.shark_tail_fin);
    this.shark_tail_2.addChild(this.shark_finsideL);
    this.shark_tail_2.addChild(this.shark_finsideR);
    

    this.spitter_head.addChild(this.spitter_head_eyeL);
    this.spitter_head.addChild(this.spitter_head_eyeR);
    this.spitter_head.addChild(this.spitter_head_jaws);
    
    this.bipedHead.addChild(this.hornhead_1);
    this.hornhead_1.addChild(this.hornhead2);
    this.hornhead_1.addChild(this.hornhead3);
    this.hornhead_1.addChild(this.hornhead_4);
    this.hornhead_1.addChild(this.hornhead_hornL);
    this.hornhead_1.addChild(this.hornhead_hornR);
    this.hornhead_1.addChild(this.hornhead_jaw);
    
    this.hard_head.addChild(this.hard_head_face);
    this.hard_head.addChild(this.hard_head_fin);
    this.hard_head.addChild(this.hard_head_jaw);
    this.hard_head.addChild(this.hard_head_sideL);
    this.hard_head.addChild(this.hard_head_side_R);
    this.hard_head.addChild(this.hard_head_top);
    
    this.scorpion_tail1.addChild(this.scorpion_tail2);
    this.scorpion_tail2.addChild(this.scorpion_tail3);
    this.scorpion_tail3.addChild(this.scorpion_tail4);
    this.scorpion_tail4.addChild(this.scorpion_tail5);
    this.scorpion_tail5.addChild(this.scorpion_tail6);
    this.scorpion_tail6.addChild(this.scorpion_tail7);
    this.scorpion_tail7.addChild(this.scorpion_tail8);
    this.scorpion_tail8.addChild(this.scorpion_tail9);
    this.scorpion_tail9.addChild(this.scorpion_stinger1);
    this.scorpion_stinger1.addChild(this.scorpion_stinger2);
    this.scorpion_stinger2.addChild(this.scorpion_stinger3);
    

    this.mantis_arm1L.addChild(this.mantis_arm3L);
    this.mantis_arm3L.addChild(this.mantis_arms3L);
    this.mantis_arms3L.addChild(this.mantis_bladeL);
    this.mantis_arm1R.addChild(this.mantis_arm3R);
    this.mantis_arm3R.addChild(this.mantis_arms3R);
    this.mantis_arms3R.addChild(this.mantis_bladeR);
    
    this.bug_lower_arm1L.addChild(this.bug_lower_arm2L);
    this.bug_lower_arm2L.addChild(this.bug_lower_handL);
    this.bug_lower_arm1R.addChild(this.bug_lower_arm2R);
    this.bug_lower_arm2R.addChild(this.bug_lower_handR);
    
    this.bug_upper_arm1L.addChild(this.bug_upper_arm2L);
    this.bug_upper_arm2L.addChild(this.bug_upper_handL);
    this.bug_upper_arm1R.addChild(this.bug_upper_arm2R);
    this.bug_upper_arm2R.addChild(this.bug_upper_handR);
  }
  



  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    

    if ((entity instanceof EntityPlayer))
    {
      EntityPlayer player = (EntityPlayer)entity;
      ExtendedPlayer props = ExtendedPlayer.get(player);
      this.default_torso.render(f5);
      if (props.getFaction() == 3)
      {
        if (props.getHead() == 0)
        {
          this.default_head.render(f5);
          this.default_neck.render(f5);
        }
        if (props.getHead() == 1)
        {
          this.spitter_head.render(f5);
        }
        if (props.getHead() == 2)
        {
          this.hornhead_1.render(f5);
        }
        if (props.getHead() == 3)
        {
          this.hard_head.render(f5);
        }
        if (props.getBack() == 0)
        {
          this.default_wing_stubR.render(f5);
          this.default_wing_stubL.render(f5);
        }
        if (props.getBack() == 1)
        {
          this.armored_backTR.render(f5);
          this.armored_backneck.render(f5);
          this.armored_back_BR.render(f5);
          this.armored_backTL.render(f5);
          this.armored_back_BL.render(f5);
        }
        if (props.getBack() == 2)
        {
          this.spike3R.render(f5);
          this.spike1R.render(f5);
          this.spike2R.render(f5);
          this.spike1L.render(f5);
          this.spike2L.render(f5);
          this.spike3L.render(f5);
        }
        if (props.getBack() == 3)
        {
          this.bugwing_R.render(f5);
          this.bugwing_L.render(f5);
        }
        if (props.getLegs() == 0)
        {
          this.Default_lowertorso.render(f5);
          this.default_legL1.render(f5);
          this.default_legR1.render(f5);
        }
        if (props.getLegs() == 1)
        {
          this.jumper_torso1.render(f5);
          this.jumper_torso2.render(f5);
          this.jumper_leg1R.render(f5);
          this.jumper_leg1L.render(f5);
        }
        if (props.getLegs() == 2)
        {
          this.heavy_lower_torso2.render(f5);
          this.heavy_lower_torso1.render(f5);
          this.heavy_leg_1R.render(f5);
          this.heavy_leg_1L.render(f5);
        }
        if (props.getLegs() == 3)
        {
          this.crawler_torso1.render(f5);
          this.crawler_torso2.render(f5);
        }
        if (props.getArms() == 0)
        {
          this.default_armL1.render(f5);
          this.default_armR1.render(f5);
        }
        if (props.getArms() == 1)
        {
          this.golem_sholderL.render(f5);
          this.golem_sholderR.render(f5);
        }
        if (props.getArms() == 2)
        {
          this.heavyarm1L.render(f5);
          this.heavyarm2L.render(f5);
          this.beavyarm3L.render(f5);
          this.heavyarm4L.render(f5);
          this.heavyarm5L.render(f5);
          this.heavyarmthumbL.render(f5);
          this.heavyarmfinger1L.render(f5);
          this.heavyarmfinger2L.render(f5);
          this.heavyarm1R.render(f5);
          this.heavyarm2R.render(f5);
          this.beavyarm3R.render(f5);
          this.heavyarm4R.render(f5);
          this.heavyarm5R.render(f5);
          this.heavyarmthumbR.render(f5);
          this.heavyarmfinger1R.render(f5);
          this.heavyarmfinger2R.render(f5);
        }
        

        if (props.getArms() == 3)
        {
          this.bug_lower_arm1L.render(f5);
          
          this.bug_upper_arm1L.render(f5);
          


          this.bug_lower_arm1R.render(f5);
          
          this.bug_upper_arm1R.render(f5);
        }
        


        if ((props.getTail() == 0) && (props.getLegs() != 3))
        {
          this.default_tail1.render(f5);
        }
        if ((props.getTail() == 1) && (props.getLegs() != 3))
        {
          this.wolf_tail_1.render(f5);
        }
        if ((props.getTail() == 2) && (props.getLegs() != 3))
        {
          this.shark_tail_1.render(f5);
        }
        if ((props.getTail() == 3) && (props.getLegs() != 3))
        {
          this.scorpion_tail1.render(f5);
        }
        
      }
      else
      {
        this.bipedBody.render(f5);
        this.bipedEars.render(f5);
        this.bipedCloak.render(f5);
        this.bipedHead.render(f5);
        this.bipedHeadwear.render(f5);
        this.bipedLeftArm.render(f5);
        this.bipedLeftLeg.render(f5);
        this.bipedRightArm.render(f5);
        this.bipedRightLeg.render(f5);
      }
    }
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
    
    if ((entity instanceof EntityPlayer))
    {

      EntityPlayer player = (EntityPlayer)entity;
      
      this.bipedBody.showModel = false;
      this.bipedCloak.showModel = false;
      this.bipedEars.showModel = false;
      this.bipedHead.showModel = false;
      this.bipedHeadwear.showModel = false;
      this.bipedLeftArm.showModel = false;
      this.bipedLeftLeg.showModel = false;
      this.bipedRightArm.showModel = false;
      this.bipedRightLeg.showModel = false;
      

      this.default_head.rotateAngleY = (f3 / 57.295776F);
      this.default_head.rotateAngleX = (f4 / 57.295776F);
      
      this.spitter_head.rotateAngleY = (f3 / 57.295776F);
      this.spitter_head.rotateAngleX = (f4 / 57.295776F + 0.5235988F);
      
      this.hornhead_1.rotateAngleY = (f3 / 57.295776F);
      this.hornhead_1.rotateAngleX = (f4 / 57.295776F + 0.2617994F);
      
      this.hard_head.rotateAngleY = (f3 / 57.295776F);
      this.hard_head.rotateAngleX = (f4 / 57.295776F);
      

      this.default_armL1.rotateAngleX = (MathHelper.cos(f * 0.3662F + 3.1415927F) * 0.6F * f1);
      this.default_armR1.rotateAngleX = (MathHelper.cos(f * 0.3662F) * 0.6F * f1);
      this.default_armL2.rotateAngleX = (MathHelper.cos(f * 0.3662F + 3.1415927F) * f1 * 0.5F);
      this.default_armR2.rotateAngleX = (MathHelper.cos(f * 0.3662F) * f1 * 0.5F);
      
      this.golem_sholderL.rotateAngleX = (MathHelper.cos(f * 0.3662F + 3.1415927F) * 0.3F * f1);
      this.golem_sholderR.rotateAngleX = (MathHelper.cos(f * 0.3662F) * 0.3F * f1);
      this.golem_upper_armL.rotateAngleX = (MathHelper.cos(f * 0.3662F + 3.1415927F) * f1 * 0.5F);
      this.golem_upper_armR.rotateAngleX = (MathHelper.cos(f * 0.3662F) * f1 * 0.5F);
      
      this.mantis_arm1L.rotateAngleX = (MathHelper.cos(f * 0.3662F + 3.1415927F) * 0.3F * f1);
      this.mantis_arm1R.rotateAngleX = (MathHelper.cos(f * 0.3662F) * 0.3F * f1);
      this.mantis_arm3L.rotateAngleX = (MathHelper.cos(f * 0.3662F + 3.1415927F) * f1 * 0.5F);
      this.mantis_arm3R.rotateAngleX = (MathHelper.cos(f * 0.3662F) * f1 * 0.5F);
      
      this.bug_upper_arm1L.rotateAngleX = (MathHelper.cos(f * 0.3662F + 3.1415927F) * 0.2F * f1 - 0.5235988F);
      this.bug_upper_arm1R.rotateAngleX = (MathHelper.cos(f * 0.3662F) * 0.2F * f1 - 0.5235988F);
      this.bug_upper_arm2L.rotateAngleX = (MathHelper.cos(f * 0.3662F + 3.1415927F) * f1 * 0.1F);
      this.bug_upper_arm2R.rotateAngleX = (MathHelper.cos(f * 0.3662F) * f1 * 0.1F);
      this.bug_lower_arm1L.rotateAngleX = (MathHelper.cos(f * 0.3662F + 3.1415927F + 0.5235988F) * 0.2F * f1 - 0.2617994F);
      this.bug_lower_arm1R.rotateAngleX = (MathHelper.cos(f * 0.3662F + 0.5235988F) * 0.2F * f1 - 0.2617994F);
      this.bug_lower_arm2L.rotateAngleX = (MathHelper.cos(f * 0.3662F + 3.1415927F + 0.5235988F) * f1 * 0.1F);
      this.bug_lower_arm2R.rotateAngleX = (MathHelper.cos(f * 0.3662F + 0.5235988F) * f1 * 0.1F);
      
      if ((player.motionX == 0.0D) && (player.motionZ == 0.0D))
      {
        this.wolf_tail_1.rotateAngleZ = (0.05F * MathHelper.cos(f2 * 0.06662F));
        this.wolf_tail_2.rotateAngleZ = (0.05F * MathHelper.cos(f2 * 0.06662F));
        this.wolf_tail_3.rotateAngleZ = (0.05F * MathHelper.cos(f2 * 0.06662F));
        this.wolf_tail_4.rotateAngleZ = (0.05F * MathHelper.cos(f2 * 0.06662F));
        this.wolf_tail_5.rotateAngleZ = (0.05F * MathHelper.cos(f2 * 0.06662F));
        this.wolf_tail_6.rotateAngleZ = (0.05F * MathHelper.cos(f2 * 0.06662F));
        
        this.wolf_tail_1.rotateAngleX = 0.834464F;
      }
      else
      {
        this.wolf_tail_1.rotateAngleZ = 0.0F;
        this.wolf_tail_2.rotateAngleZ = 0.0F;
        this.wolf_tail_3.rotateAngleZ = 0.0F;
        this.wolf_tail_4.rotateAngleZ = 0.0F;
        this.wolf_tail_5.rotateAngleZ = 0.0F;
        this.wolf_tail_6.rotateAngleZ = 0.0F;
        
        this.wolf_tail_1.rotateAngleX = (MathHelper.sin(f * 0.3662F) * 0.1F * f1 + 1.134464F);
        this.wolf_tail_2.rotateAngleX = (MathHelper.sin(f * 0.3662F) * 0.1F * f1);
        this.wolf_tail_3.rotateAngleX = (MathHelper.sin(f * 0.3662F) * 0.1F * f1);
        this.wolf_tail_4.rotateAngleX = (MathHelper.sin(f * 0.3662F) * 0.07F * f1);
        this.wolf_tail_5.rotateAngleX = (MathHelper.sin(f * 0.3662F) * 0.05F * f1);
        this.wolf_tail_6.rotateAngleX = (MathHelper.sin(f * 0.3662F) * 0.05F * f1);
      }
      


      if (player.isSneaking())
      {
        this.default_torso.rotateAngleX = 0.47F;
        this.Default_lowertorso.rotateAngleX = 0.15F;
        this.default_tail1.rotateAngleX = -0.4F;
        this.default_neck.rotateAngleX = 0.4017994F;
        this.default_armL1.rotationPointY = -2.0F;
        this.default_armR1.rotationPointY = -2.0F;
        this.default_armL1.rotationPointZ = -1.0F;
        this.default_armR1.rotationPointZ = -1.0F;
        this.golem_sholderL.rotationPointY = -2.0F;
        this.golem_sholderR.rotationPointY = -2.0F;
        this.mantis_arm1L.rotationPointY = -2.0F;
        this.mantis_arm1R.rotationPointY = -2.0F;
        this.mantis_arm1L.rotationPointZ = 0.0F;
        this.mantis_arm1R.rotationPointZ = 0.0F;
        this.bug_upper_arm1L.rotationPointY = -2.0F;
        this.bug_upper_arm1R.rotationPointY = -2.0F;
        this.bug_lower_arm1L.rotationPointY = 1.0F;
        this.bug_lower_arm1R.rotationPointY = 1.0F;
        this.default_head.rotationPointY = -6.5F;
        this.default_head.rotationPointZ = -2.0F;
        this.default_wing_stubR.rotationPointY = -2.0F;
        this.default_wing_stubL.rotationPointY = -2.0F;
        this.default_wing_stubR.rotationPointZ = 2.0F;
        this.default_wing_stubL.rotationPointZ = 2.0F;
        this.default_legR1.rotateAngleX = (MathHelper.cos(f * 0.3662F + 3.1415927F) * 0.6F * f1 - 0.7235988F);
        this.default_legL1.rotateAngleX = (MathHelper.cos(f * 0.3662F) * 0.6F * f1 - 0.7235988F);
        this.default_legR2.rotateAngleX = (MathHelper.cos(f * 0.3662F + 3.1415927F) * 0.3F * f1 + 0.2617994F + 0.9235988F);
        this.default_legL2.rotateAngleX = (MathHelper.cos(f * 0.3662F) * 0.3F * f1 + 0.2617994F + 0.9235988F);
        this.default_legL2.rotationPointZ = -1.5F;
        this.default_legR2.rotationPointZ = -1.5F;
        
        this.spitter_head.rotationPointY = -6.0F;
        this.spitter_head.rotationPointZ = -2.0F;
        
        this.hornhead_1.rotationPointY = -6.0F;
        this.hornhead_1.rotationPointZ = -2.0F;
        
        this.hard_head.rotationPointY = -6.0F;
        this.hard_head.rotationPointZ = -2.0F;
        
        this.armored_back_BL.rotateAngleX = 0.4641593F;
        this.armored_back_BR.rotateAngleX = 0.4641593F;
        this.armored_backneck.rotateAngleX = 0.15F;
        this.armored_backTL.rotateAngleX = 0.15F;
        this.armored_backTR.rotateAngleX = 0.15F;
        
        this.spike3L.rotateAngleX = -1.158997F;
        this.spike3R.rotateAngleX = -1.158997F;
        this.spike2L.rotateAngleX = -0.8547198F;
        this.spike2R.rotateAngleX = -0.8547198F;
        this.spike1R.rotateAngleX = -0.6353982F;
        this.spike1L.rotateAngleX = -0.6353982F;
        
        this.bugwing_L.rotateAngleX = -0.4F;
        this.bugwing_R.rotateAngleX = -0.4F;
        this.bugwing_L.rotateAngleY = -0.9F;
        this.bugwing_R.rotateAngleY = 0.9F;
        this.bugwing_L.rotateAngleZ = -1.0F;
        this.bugwing_R.rotateAngleZ = 1.0F;
        
        this.bugwing_L.rotationPointZ = 3.0F;
        this.bugwing_R.rotationPointZ = 3.0F;
        this.bugwing_L.rotationPointY = -5.0F;
        this.bugwing_R.rotationPointY = -5.0F;
        
        this.jumper_leg1R.rotateAngleX = (MathHelper.cos(f * 0.3662F + 3.1415927F) * 0.6F * f1 - 0.6235988F);
        this.jumper_leg1L.rotateAngleX = (MathHelper.cos(f * 0.3662F) * 0.6F * f1 - 0.6235988F);
        this.jumper_leg2R.rotateAngleX = (MathHelper.cos(f * 0.3662F + 3.1415927F) * 0.4F * f1 - 0.2617994F + 0.8735988F);
        this.jumper_leg2L.rotateAngleX = (MathHelper.cos(f * 0.3662F) * 0.4F * f1 - 0.2617994F + 0.8735988F);
        
        this.jumper_torso1.rotateAngleX = 0.06F;
        
        this.heavy_leg_1R.rotateAngleX = (MathHelper.cos(f * 0.3662F + 3.1415927F) * 0.3F * f1 - 0.4617994F);
        this.heavy_leg_1L.rotateAngleX = (MathHelper.cos(f * 0.3662F) * 0.3F * f1 - 0.4617994F);
        this.heavy_leg_2R.rotateAngleX = (MathHelper.cos(f * 0.3662F + 3.1415927F) * 0.2F * f1 + 0.4617994F);
        this.heavy_leg_2L.rotateAngleX = (MathHelper.cos(f * 0.3662F) * 0.2F * f1 + 0.4617994F);
        this.heavy_leg_2L.rotationPointY = -1.0F;
        this.heavy_leg_2R.rotationPointY = -1.0F;
        
        this.crawler_torso2.rotationPointY = 7.0F;
        this.crawler_torso2.rotateAngleX = (MathHelper.cos(f * 0.3662F) * 0.2F * f1 - 0.5235988F);
        this.lower_crawler_torso1.rotateAngleX = (MathHelper.cos(f * 0.3662F) * 0.1F * f1 + 0.5235988F);
        this.lower_crawler_torso2.rotateAngleX = (-MathHelper.cos(f * 0.3662F) * 0.1F * f1 + 0.5235988F);
        this.lower_crawler_torso3.rotateAngleX = (-MathHelper.cos(f * 0.3662F) * 0.05F * f1 - 0.5235988F);
        this.crawler_tail1.rotateAngleX = (MathHelper.cos(f * 0.3662F + 3.1415927F) * 0.03F * f1 + 0.7853982F);
        this.crawler_tail2.rotateAngleX = (MathHelper.cos(f * 0.3662F + 4.712389F) * 0.01F * f1 + 0.2617994F - 0.7853982F);
        
        this.crawler_torso1.rotateAngleX = (MathHelper.cos(f * 0.3662F) * 0.2F * f1 + 0.1F);
        this.crawler_leg5L.rotateAngleZ = (MathHelper.sin(f * 2.0F * 0.3662F + 3.1415927F) * 0.3F * f1 + 0.7853982F);
        this.crawler_leg5R.rotateAngleZ = (MathHelper.sin(f * 2.0F * 0.3662F) * 0.3F * f1 - 0.7853982F);
        this.crawler_leg5L.rotateAngleY = (MathHelper.cos(f * 2.0F * 0.3662F + 3.1415927F) * 0.3F * f1 - 0.7853982F);
        this.crawler_leg5R.rotateAngleY = (MathHelper.cos(f * 2.0F * 0.3662F) * 0.3F * f1 + 0.7853982F);
        this.crawler_leg4L.rotateAngleZ = (MathHelper.sin(f * 2.0F * 0.3662F + 3.1415927F + 0.7853982F) * 0.3F * f1 + 0.7853982F);
        this.crawler_leg4R.rotateAngleZ = (MathHelper.sin(f * 2.0F * 0.3662F + 0.7853982F) * 0.3F * f1 - 0.7853982F);
        this.crawler_leg4L.rotateAngleY = (MathHelper.cos(f * 2.0F * 0.3662F + 3.1415927F + 0.7853982F) * 0.3F * f1);
        this.crawler_leg4R.rotateAngleY = (MathHelper.cos(f * 2.0F * 0.3662F + 0.7853982F) * 0.3F * f1);
        this.crawler_leg3L.rotateAngleZ = (MathHelper.sin(f * 2.0F * 0.3662F + 3.1415927F + 1.5707964F) * 0.3F * f1 + 0.7853982F);
        this.crawler_leg3R.rotateAngleZ = (MathHelper.sin(f * 2.0F * 0.3662F + 1.5707964F) * 0.3F * f1 - 0.7853982F);
        this.crawler_leg3L.rotateAngleY = (MathHelper.cos(f * 2.0F * 0.3662F + 3.1415927F + 1.5707964F) * 0.3F * f1);
        this.crawler_leg3R.rotateAngleY = (MathHelper.cos(f * 2.0F * 0.3662F + 1.5707964F) * 0.3F * f1);
        this.crawler_leg2TL.rotateAngleZ = (MathHelper.sin(f * 2.0F * 0.3662F + 3.1415927F + 2.3561945F) * 0.3F * f1 + 0.7853982F);
        this.crawler_leg2TR.rotateAngleZ = (MathHelper.sin(f * 2.0F * 0.3662F + 2.3561945F) * 0.3F * f1 - 0.7853982F);
        this.crawler_leg2TL.rotateAngleY = (MathHelper.cos(f * 2.0F * 0.3662F + 3.1415927F + 2.3561945F) * 0.3F * f1 + 0.3490659F);
        this.crawler_leg2TR.rotateAngleY = (MathHelper.cos(f * 2.0F * 0.3662F + 2.3561945F) * 0.3F * f1 - 0.3490659F);
        
        this.wolf_tail_1.rotateAngleZ = (0.05F * MathHelper.cos(f2 * 0.06662F));
        this.wolf_tail_2.rotateAngleZ = (0.05F * MathHelper.cos(f2 * 0.06662F));
        this.wolf_tail_3.rotateAngleZ = (0.05F * MathHelper.cos(f2 * 0.06662F));
        this.wolf_tail_4.rotateAngleZ = (0.05F * MathHelper.cos(f2 * 0.06662F));
        this.wolf_tail_5.rotateAngleZ = (0.05F * MathHelper.cos(f2 * 0.06662F));
        this.wolf_tail_6.rotateAngleZ = (0.05F * MathHelper.cos(f2 * 0.06662F));
        
        this.wolf_tail_1.rotateAngleX = 1.034464F;
        
        this.shark_tail_1.rotateAngleY = (0.1F * MathHelper.cos(f2 * 0.06662F));
        this.shark_tail_2.rotateAngleY = (0.1F * MathHelper.cos(f2 * 0.06662F - 0.5235988F));
        this.shark_tail_3.rotateAngleY = (0.1F * MathHelper.cos(f2 * 0.06662F - 1.0471976F));
        

        this.scorpion_tail1.rotationPointY = 8.0F;
        
        this.scorpion_tail1.rotateAngleX = (0.01F * MathHelper.cos(f2 * 0.03662F));
        this.scorpion_tail2.rotateAngleX = (0.01F * MathHelper.cos(f2 * 0.03662F - 0.2617994F));
        this.scorpion_tail3.rotateAngleX = (0.01F * MathHelper.cos(f2 * 0.03662F - 0.5235988F));
        this.scorpion_tail4.rotateAngleX = (0.01F * MathHelper.cos(f2 * 0.03662F - 0.7853982F));
        this.scorpion_tail5.rotateAngleX = (0.01F * MathHelper.cos(f2 * 0.03662F - 1.0471976F));
        this.scorpion_tail6.rotateAngleX = (0.01F * MathHelper.cos(f2 * 0.03662F - 1.3089969F));
        this.scorpion_tail7.rotateAngleX = (0.01F * MathHelper.cos(f2 * 0.03662F - 1.5707964F));
        this.scorpion_tail8.rotateAngleX = (0.01F * MathHelper.cos(f2 * 0.03662F - 1.8325957F));
        this.scorpion_tail9.rotateAngleX = (0.01F * MathHelper.cos(f2 * 0.03662F - 2.0943952F));

      }
      else
      {
        this.default_torso.rotateAngleX = 0.3141593F;
        this.Default_lowertorso.rotateAngleX = 0.0F;
        this.default_tail1.rotateAngleX = -0.5235988F;
        this.default_neck.rotateAngleX = 0.2617994F;
        this.default_armL1.rotationPointY = -3.0F;
        this.default_armR1.rotationPointY = -3.0F;
        this.default_armL1.rotationPointZ = 1.0F;
        this.default_armR1.rotationPointZ = 1.0F;
        this.golem_sholderL.rotationPointY = -3.0F;
        this.golem_sholderR.rotationPointY = -3.0F;
        this.mantis_arm1L.rotationPointY = -3.0F;
        this.mantis_arm1R.rotationPointY = -3.0F;
        this.mantis_arm1L.rotationPointZ = 1.0F;
        this.mantis_arm1R.rotationPointZ = 1.0F;
        this.bug_upper_arm1L.rotationPointY = -3.0F;
        this.bug_upper_arm1R.rotationPointY = -3.0F;
        this.bug_lower_arm1L.rotationPointY = 2.0F;
        this.bug_lower_arm1R.rotationPointY = 2.0F;
        this.default_head.rotationPointY = -7.5F;
        this.default_head.rotationPointZ = 0.0F;
        this.default_wing_stubR.rotationPointY = -3.0F;
        this.default_wing_stubL.rotationPointY = -3.0F;
        this.default_wing_stubR.rotationPointZ = 4.0F;
        this.default_wing_stubL.rotationPointZ = 4.0F;
        this.default_legR1.rotateAngleX = (MathHelper.cos(f * 0.3662F + 3.1415927F) * 0.6F * f1 - 0.5235988F);
        this.default_legL1.rotateAngleX = (MathHelper.cos(f * 0.3662F) * 0.6F * f1 - 0.5235988F);
        this.default_legR2.rotateAngleX = (MathHelper.cos(f * 0.3662F + 3.1415927F) * 0.3F * f1 + 0.2617994F + 0.5235988F);
        this.default_legL2.rotateAngleX = (MathHelper.cos(f * 0.3662F) * 0.3F * f1 + 0.2617994F + 0.5235988F);
        this.default_legL2.rotationPointZ = 0.0F;
        this.default_legR2.rotationPointZ = 0.0F;
        
        this.spitter_head.rotationPointY = -7.0F;
        this.spitter_head.rotationPointZ = 0.0F;
        
        this.hornhead_1.rotationPointY = -7.0F;
        this.hornhead_1.rotationPointZ = 0.0F;
        
        this.hard_head.rotationPointY = -7.0F;
        this.hard_head.rotationPointZ = 0.0F;
        
        this.armored_back_BL.rotateAngleX = 0.3141593F;
        this.armored_back_BR.rotateAngleX = 0.3141593F;
        this.armored_backneck.rotateAngleX = 0.0F;
        this.armored_backTL.rotateAngleX = 0.0F;
        this.armored_backTR.rotateAngleX = 0.0F;
        
        this.spike3L.rotateAngleX = -1.308997F;
        this.spike3R.rotateAngleX = -1.308997F;
        this.spike2L.rotateAngleX = -1.047198F;
        this.spike2R.rotateAngleX = -1.047198F;
        this.spike1R.rotateAngleX = -0.7853982F;
        this.spike1L.rotateAngleX = -0.7853982F;
        if ((!player.onGround) && (!player.isInWater()))
        {

          this.bugwing_L.rotateAngleX = (0.4F * MathHelper.cos(f2 * 2.0F * 0.66662F) + 0.7853982F);
          this.bugwing_R.rotateAngleX = (0.4F * MathHelper.cos(f2 * 2.0F * 0.66662F) + 0.7853982F);
          this.bugwing_L.rotateAngleY = (-0.4F * MathHelper.cos(f2 * 2.0F * 0.66662F) + 0.5235988F);
          this.bugwing_R.rotateAngleY = (0.4F * MathHelper.cos(f2 * 2.0F * 0.66662F) - 0.5235988F);
          this.bugwing_L.rotateAngleZ = (-0.3F * MathHelper.cos(f2 * 2.0F * 0.66662F - 4.712389F));
          this.bugwing_R.rotateAngleZ = (0.3F * MathHelper.cos(f2 * 2.0F * 0.66662F - 4.712389F));

        }
        else
        {

          this.bugwing_L.rotateAngleX = (0.2F * MathHelper.cos(f2 * 0.06662F) + 0.7853982F);
          this.bugwing_R.rotateAngleX = (0.2F * MathHelper.cos(f2 * 0.06662F) + 0.7853982F);
          this.bugwing_L.rotateAngleY = (-0.2F * MathHelper.cos(f2 * 0.06662F) + 0.5235988F);
          this.bugwing_R.rotateAngleY = (0.2F * MathHelper.cos(f2 * 0.06662F) - 0.5235988F);
          this.bugwing_L.rotateAngleZ = (-0.2F * MathHelper.cos(f2 * 0.06662F - 4.712389F));
          this.bugwing_R.rotateAngleZ = (0.2F * MathHelper.cos(f2 * 0.06662F - 4.712389F));
        }
        
        this.bugwing_L.rotationPointZ = 5.0F;
        this.bugwing_R.rotationPointZ = 5.0F;
        this.bugwing_L.rotationPointY = -3.0F;
        this.bugwing_R.rotationPointY = -3.0F;
        
        this.jumper_leg1R.rotateAngleX = (MathHelper.cos(f * 0.3662F + 3.1415927F) * 0.6F * f1 - 0.5235988F);
        this.jumper_leg1L.rotateAngleX = (MathHelper.cos(f * 0.3662F) * 0.6F * f1 - 0.5235988F);
        this.jumper_leg2R.rotateAngleX = (MathHelper.cos(f * 0.3662F + 3.1415927F) * 0.4F * f1 - 0.2617994F + 0.5235988F);
        this.jumper_leg2L.rotateAngleX = (MathHelper.cos(f * 0.3662F) * 0.4F * f1 - 0.2617994F + 0.5235988F);
        this.jumper_torso1.rotateAngleX = 0.0F;
        
        this.heavy_leg_1R.rotateAngleX = (MathHelper.cos(f * 0.3662F + 3.1415927F) * 0.3F * f1 - 0.2617994F);
        this.heavy_leg_1L.rotateAngleX = (MathHelper.cos(f * 0.3662F) * 0.3F * f1 - 0.2617994F);
        this.heavy_leg_2R.rotateAngleX = (MathHelper.cos(f * 0.3662F + 3.1415927F) * 0.2F * f1 + 0.2617994F);
        this.heavy_leg_2L.rotateAngleX = (MathHelper.cos(f * 0.3662F) * 0.2F * f1 + 0.2617994F);
        this.heavy_leg_2L.rotationPointY = 0.0F;
        this.heavy_leg_2R.rotationPointY = 0.0F;
        
        this.crawler_torso2.rotationPointY = 9.0F;
        this.crawler_torso2.rotateAngleX = (MathHelper.cos(f * 0.3662F) * 0.2F * f1 - 0.5235988F);
        this.lower_crawler_torso1.rotateAngleX = (MathHelper.cos(f * 0.3662F) * 0.1F * f1 + 0.5235988F);
        this.lower_crawler_torso2.rotateAngleX = (-MathHelper.cos(f * 0.3662F) * 0.1F * f1 + 0.5235988F);
        this.lower_crawler_torso3.rotateAngleX = (-MathHelper.cos(f * 0.3662F) * 0.05F * f1 - 0.5235988F);
        this.crawler_tail1.rotateAngleX = (MathHelper.cos(f * 0.3662F + 3.1415927F) * 0.03F * f1 + 0.7853982F);
        this.crawler_tail2.rotateAngleX = (MathHelper.cos(f * 0.3662F + 4.712389F) * 0.01F * f1 + 0.2617994F - 0.7853982F);
        this.crawler_torso1.rotateAngleX = (MathHelper.cos(f * 0.3662F) * 0.1F * f1);
        
        this.crawler_leg5L.rotateAngleZ = (MathHelper.sin(f * 2.0F * 0.3662F + 3.1415927F) * 0.3F * f1 + 0.7853982F);
        this.crawler_leg5R.rotateAngleZ = (MathHelper.sin(f * 2.0F * 0.3662F) * 0.3F * f1 - 0.7853982F);
        this.crawler_leg5L.rotateAngleY = (MathHelper.cos(f * 2.0F * 0.3662F + 3.1415927F) * 0.3F * f1 - 0.7853982F);
        this.crawler_leg5R.rotateAngleY = (MathHelper.cos(f * 2.0F * 0.3662F) * 0.3F * f1 + 0.7853982F);
        this.crawler_leg4L.rotateAngleZ = (MathHelper.sin(f * 2.0F * 0.3662F + 3.1415927F + 0.7853982F) * 0.3F * f1 + 0.7853982F);
        this.crawler_leg4R.rotateAngleZ = (MathHelper.sin(f * 2.0F * 0.3662F + 0.7853982F) * 0.3F * f1 - 0.7853982F);
        this.crawler_leg4L.rotateAngleY = (MathHelper.cos(f * 2.0F * 0.3662F + 3.1415927F + 0.7853982F) * 0.3F * f1);
        this.crawler_leg4R.rotateAngleY = (MathHelper.cos(f * 2.0F * 0.3662F + 0.7853982F) * 0.3F * f1);
        this.crawler_leg3L.rotateAngleZ = (MathHelper.sin(f * 2.0F * 0.3662F + 3.1415927F + 1.5707964F) * 0.3F * f1 + 0.7853982F);
        this.crawler_leg3R.rotateAngleZ = (MathHelper.sin(f * 2.0F * 0.3662F + 1.5707964F) * 0.3F * f1 - 0.7853982F);
        this.crawler_leg3L.rotateAngleY = (MathHelper.cos(f * 2.0F * 0.3662F + 3.1415927F + 1.5707964F) * 0.3F * f1);
        this.crawler_leg3R.rotateAngleY = (MathHelper.cos(f * 2.0F * 0.3662F + 1.5707964F) * 0.3F * f1);
        this.crawler_leg2TL.rotateAngleZ = (MathHelper.sin(f * 2.0F * 0.3662F + 3.1415927F + 2.3561945F) * 0.3F * f1 + 0.7853982F);
        this.crawler_leg2TR.rotateAngleZ = (MathHelper.sin(f * 2.0F * 0.3662F + 2.3561945F) * 0.3F * f1 - 0.7853982F);
        this.crawler_leg2TL.rotateAngleY = (MathHelper.cos(f * 2.0F * 0.3662F + 3.1415927F + 2.3561945F) * 0.3F * f1 + 0.3490659F);
        this.crawler_leg2TR.rotateAngleY = (MathHelper.cos(f * 2.0F * 0.3662F + 2.3561945F) * 0.3F * f1 - 0.3490659F);
        

        this.shark_tail_1.rotateAngleY = (0.15F * MathHelper.cos(f2 * 0.16662F));
        this.shark_tail_2.rotateAngleY = (0.15F * MathHelper.cos(f2 * 0.16662F - 0.5235988F));
        this.shark_tail_3.rotateAngleY = (0.15F * MathHelper.cos(f2 * 0.16662F - 1.0471976F));
        
        this.scorpion_tail1.rotationPointY = 9.0F;
        
        this.scorpion_tail1.rotateAngleX = (0.02F * MathHelper.cos(f2 * 0.06662F));
        this.scorpion_tail2.rotateAngleX = (0.02F * MathHelper.cos(f2 * 0.06662F - 0.2617994F));
        this.scorpion_tail3.rotateAngleX = (0.02F * MathHelper.cos(f2 * 0.06662F - 0.5235988F));
        this.scorpion_tail4.rotateAngleX = (0.02F * MathHelper.cos(f2 * 0.06662F - 0.7853982F));
        this.scorpion_tail5.rotateAngleX = (0.02F * MathHelper.cos(f2 * 0.06662F - 1.0471976F));
        this.scorpion_tail6.rotateAngleX = (0.02F * MathHelper.cos(f2 * 0.06662F - 1.3089969F));
        this.scorpion_tail7.rotateAngleX = (0.02F * MathHelper.cos(f2 * 0.06662F - 1.5707964F));
        this.scorpion_tail8.rotateAngleX = (0.02F * MathHelper.cos(f2 * 0.06662F - 1.8325957F));
        this.scorpion_tail9.rotateAngleX = (0.02F * MathHelper.cos(f2 * 0.06662F - 2.0943952F));
      }
      

      if (player.getHeldItem() != null)
      {
        this.default_armR1.rotateAngleY = this.bipedRightArm.rotateAngleY;
      }
      
      if (((player.worldObj.getBlock((int)player.posX, (int)player.posY, (int)player.posZ) == Blocks.water) || (player.worldObj.getBlock((int)player.posX, (int)player.posY - 1, (int)player.posZ) == Blocks.water)) && ((Math.abs(player.motionX) > 0.0D) || (Math.abs(player.motionZ) > 0.0D)))
      {
        this.shark_tail_1.rotateAngleY = (0.25F * MathHelper.cos(f2 * 0.36662F));
        this.shark_tail_2.rotateAngleY = (0.25F * MathHelper.cos(f2 * 0.36662F - 0.5235988F));
        this.shark_tail_3.rotateAngleY = (0.25F * MathHelper.cos(f2 * 0.36662F - 1.0471976F));
      }
    }
  }
}
