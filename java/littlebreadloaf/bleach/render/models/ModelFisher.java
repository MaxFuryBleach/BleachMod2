package littlebreadloaf.bleach.render.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelFisher
  extends ModelBase
{
  ModelRenderer TailEnd1;
  ModelRenderer Tail1;
  ModelRenderer Tail2;
  ModelRenderer Tail3;
  ModelRenderer TailEnd2;
  ModelRenderer leftfoot;
  ModelRenderer leftleg1;
  ModelRenderer leftleg3;
  ModelRenderer leftleg2;
  ModelRenderer rightleg1;
  ModelRenderer rightleg2;
  ModelRenderer rightleg3;
  ModelRenderer rightfoot;
  ModelRenderer body4;
  ModelRenderer body3;
  ModelRenderer rightarm1;
  ModelRenderer rightarm2;
  ModelRenderer leftarm3;
  ModelRenderer leftarm1;
  ModelRenderer leftarm2;
  ModelRenderer rightarm3;
  ModelRenderer Mask;
  ModelRenderer body1;
  ModelRenderer body2;
  ModelRenderer Mask1;
  ModelRenderer Mask2;
  ModelRenderer Mask3;
  ModelRenderer body5;
  ModelRenderer body6;
  ModelRenderer Mask4;
  ModelRenderer Mask5;
  
  public ModelFisher()
  {
    this.textureWidth = 128;
    this.textureHeight = 256;
    
    this.TailEnd1 = new ModelRenderer(this, 85, 0);
    this.TailEnd1.addBox(-5.0F, -16.0F, -28.0F, 2, 13, 2);
    this.TailEnd1.setRotationPoint(-0.5F, -13.0F, -17.0F);
    this.TailEnd1.setTextureSize(128, 256);
    this.TailEnd1.mirror = true;
    setRotation(this.TailEnd1, -0.1396263F, 0.0F, 0.2094395F);
    this.Tail1 = new ModelRenderer(this, 59, 0);
    this.Tail1.addBox(-2.0F, -12.0F, -2.0F, 2, 13, 2);
    this.Tail1.setRotationPoint(1.0F, -38.3F, -13.0F);
    this.Tail1.setTextureSize(128, 256);
    this.Tail1.mirror = true;
    setRotation(this.Tail1, 0.8551081F, 0.0F, 0.0F);
    this.Tail2 = new ModelRenderer(this, 71, 0);
    this.Tail2.addBox(-1.0F, -18.0F, 8.5F, 2, 13, 2);
    this.Tail2.setRotationPoint(0.0F, -37.0F, -15.0F);
    this.Tail2.setTextureSize(128, 256);
    this.Tail2.mirror = true;
    setRotation(this.Tail2, 1.784573F, 0.0F, 0.0F);
    this.Tail3 = new ModelRenderer(this, 79, 0);
    this.Tail3.addBox(-0.5F, -19.0F, 18.5F, 1, 13, 1);
    this.Tail3.setRotationPoint(0.0F, -37.0F, -15.0F);
    this.Tail3.setTextureSize(128, 256);
    this.Tail3.mirror = true;
    setRotation(this.Tail3, 2.558508F, 0.0F, 0.0F);
    this.TailEnd2 = new ModelRenderer(this, 93, 0);
    this.TailEnd2.addBox(3.5F, -18.0F, -27.5F, 2, 13, 2);
    this.TailEnd2.setRotationPoint(-0.5F, -14.0F, -15.0F);
    this.TailEnd2.setTextureSize(128, 256);
    this.TailEnd2.mirror = true;
    setRotation(this.TailEnd2, 0.0F, 0.0F, -0.2094395F);
    this.leftfoot = new ModelRenderer(this, 0, 191);
    this.leftfoot.addBox(-3.0F, 29.0F, -14.0F, 7, 3, 12);
    this.leftfoot.setRotationPoint(9.0F, -8.0F, 6.0F);
    this.leftfoot.setTextureSize(128, 256);
    this.leftfoot.mirror = true;
    setRotation(this.leftfoot, 0.0F, -0.3549525F, 0.0F);
    this.leftleg1 = new ModelRenderer(this, 0, 132);
    this.leftleg1.addBox(-6.0F, 0.0F, -6.0F, 12, 21, 12);
    this.leftleg1.setRotationPoint(9.0F, -8.0F, 6.0F);
    this.leftleg1.setTextureSize(128, 256);
    this.leftleg1.mirror = true;
    setRotation(this.leftleg1, -0.3490659F, -0.3549525F, 0.0F);
    this.leftleg3 = new ModelRenderer(this, 68, 175);
    this.leftleg3.addBox(-2.0F, 13.0F, -19.0F, 4, 12, 4);
    this.leftleg3.setRotationPoint(9.0F, -8.0F, 6.0F);
    this.leftleg3.setTextureSize(128, 256);
    this.leftleg3.mirror = true;
    setRotation(this.leftleg3, 0.4712389F, -0.3549525F, 0.0F);
    this.leftleg2 = new ModelRenderer(this, 0, 165);
    this.leftleg2.addBox(-4.0F, 21.0F, -4.0F, 8, 2, 8);
    this.leftleg2.setRotationPoint(9.0F, -8.0F, 6.0F);
    this.leftleg2.setTextureSize(128, 256);
    this.leftleg2.mirror = true;
    setRotation(this.leftleg2, -0.3490659F, -0.3549525F, 0.0F);
    this.rightleg1 = new ModelRenderer(this, 0, 132);
    this.rightleg1.addBox(-6.0F, 0.0F, -6.0F, 12, 21, 12);
    this.rightleg1.setRotationPoint(-9.0F, -8.0F, 6.0F);
    this.rightleg1.setTextureSize(128, 256);
    this.rightleg1.mirror = true;
    setRotation(this.rightleg1, -0.3490659F, 0.3549476F, 0.0F);
    this.rightleg2 = new ModelRenderer(this, 0, 165);
    this.rightleg2.addBox(-4.0F, 21.0F, -4.0F, 8, 2, 8);
    this.rightleg2.setRotationPoint(-9.0F, -8.0F, 6.0F);
    this.rightleg2.setTextureSize(128, 256);
    this.rightleg2.mirror = true;
    setRotation(this.rightleg2, -0.3490659F, 0.3549476F, 0.0F);
    this.rightleg3 = new ModelRenderer(this, 68, 175);
    this.rightleg3.addBox(-2.0F, 13.0F, -19.0F, 4, 12, 4);
    this.rightleg3.setRotationPoint(-9.0F, -8.0F, 6.0F);
    this.rightleg3.setTextureSize(128, 256);
    this.rightleg3.mirror = true;
    setRotation(this.rightleg3, 0.4712389F, 0.3549476F, 0.0F);
    this.rightfoot = new ModelRenderer(this, 0, 191);
    this.rightfoot.addBox(-4.0F, 29.0F, -14.0F, 7, 3, 12);
    this.rightfoot.setRotationPoint(-9.0F, -8.0F, 6.0F);
    this.rightfoot.setTextureSize(128, 256);
    this.rightfoot.mirror = true;
    setRotation(this.rightfoot, 0.0F, 0.3549476F, 0.0F);
    this.body4 = new ModelRenderer(this, 0, 116);
    this.body4.addBox(-10.0F, 0.0F, 0.0F, 20, 3, 12);
    this.body4.setRotationPoint(0.0F, -5.0F, 2.0F);
    this.body4.setTextureSize(128, 256);
    this.body4.mirror = true;
    setRotation(this.body4, 0.3717861F, 0.0F, 0.0F);
    this.body3 = new ModelRenderer(this, 0, 71);
    this.body3.addBox(-14.0F, 0.0F, 0.0F, 28, 30, 15);
    this.body3.setRotationPoint(0.0F, -32.0F, -10.0F);
    this.body3.setTextureSize(128, 256);
    this.body3.mirror = true;
    setRotation(this.body3, 0.3717861F, 0.0F, 0.0F);
    this.rightarm1 = new ModelRenderer(this, 90, 30);
    this.rightarm1.addBox(-8.0F, -2.0F, -4.0F, 9, 20, 10);
    this.rightarm1.setRotationPoint(-12.0F, -31.81333F, -4.0F);
    this.rightarm1.setTextureSize(128, 256);
    this.rightarm1.mirror = true;
    setRotation(this.rightarm1, 0.0F, 0.0594858F, 0.4454204F);
    this.rightarm2 = new ModelRenderer(this, 98, 60);
    this.rightarm2.addBox(-6.5F, 2.0F, 11.0F, 7, 17, 8);
    this.rightarm2.setRotationPoint(-12.0F, -31.81333F, -4.0F);
    this.rightarm2.setTextureSize(128, 256);
    this.rightarm2.mirror = true;
    setRotation(this.rightarm2, -1.186824F, 0.0594858F, 0.4454204F);
    this.leftarm3 = new ModelRenderer(this, 116, 85);
    this.leftarm3.addBox(0.5F, 19.0F, 13.0F, 3, 8, 3);
    this.leftarm3.setRotationPoint(12.0F, -31.8F, -4.0F);
    this.leftarm3.setTextureSize(128, 256);
    this.leftarm3.mirror = true;
    setRotation(this.leftarm3, -1.189716F, -0.1499587F, -0.4977854F);
    this.leftarm1 = new ModelRenderer(this, 90, 30);
    this.leftarm1.addBox(-1.0F, -2.0F, -4.0F, 9, 20, 10);
    this.leftarm1.setRotationPoint(12.0F, -31.8F, -4.0F);
    this.leftarm1.setTextureSize(128, 256);
    this.leftarm1.mirror = true;
    setRotation(this.leftarm1, 0.0F, -0.1499587F, -0.4977854F);
    this.leftarm2 = new ModelRenderer(this, 98, 60);
    this.leftarm2.addBox(-0.5F, 2.0F, 11.0F, 7, 17, 8);
    this.leftarm2.setRotationPoint(12.0F, -31.8F, -4.0F);
    this.leftarm2.setTextureSize(128, 256);
    this.leftarm2.mirror = true;
    setRotation(this.leftarm2, -1.186824F, -0.1499587F, -0.4977854F);
    this.rightarm3 = new ModelRenderer(this, 116, 85);
    this.rightarm3.addBox(-4.5F, 19.0F, 13.0F, 3, 8, 3);
    this.rightarm3.setRotationPoint(-12.0F, -31.81333F, -4.0F);
    this.rightarm3.setTextureSize(128, 256);
    this.rightarm3.mirror = true;
    setRotation(this.rightarm3, -1.189716F, 0.0594858F, 0.4454204F);
    this.Mask = new ModelRenderer(this, 22, 16);
    this.Mask.addBox(0.0F, -10.0F, 0.0F, 10, 9, 1);
    this.Mask.setRotationPoint(0.0F, -15.0F, -8.0F);
    this.Mask.setTextureSize(128, 256);
    this.Mask.mirror = true;
    setRotation(this.Mask, 0.3839724F, -0.3316126F, -0.1396263F);
    this.body1 = new ModelRenderer(this, 0, 30);
    this.body1.addBox(-10.0F, 0.0F, 0.0F, 20, 5, 12);
    this.body1.setRotationPoint(0.0F, -41.0F, -14.0F);
    this.body1.setTextureSize(128, 256);
    this.body1.mirror = true;
    setRotation(this.body1, 0.5288657F, 0.0F, 0.0F);
    this.body2 = new ModelRenderer(this, 0, 46);
    this.body2.addBox(-12.0F, 0.0F, 0.0F, 24, 11, 14);
    this.body2.setRotationPoint(0.0F, -39.0F, -14.0F);
    this.body2.setTextureSize(128, 256);
    this.body2.mirror = true;
    setRotation(this.body2, 0.5288657F, 0.0F, 0.0F);
    this.Mask1 = new ModelRenderer(this, 0, 0);
    this.Mask1.addBox(-11.7F, -24.0F, -1.0F, 12, 15, 1);
    this.Mask1.setRotationPoint(0.0F, -15.0F, -8.0F);
    this.Mask1.setTextureSize(128, 256);
    this.Mask1.mirror = true;
    setRotation(this.Mask1, 0.3839724F, 0.3316126F, 0.1396263F);
    this.Mask2 = new ModelRenderer(this, 26, 0);
    this.Mask2.addBox(-0.3F, -24.0F, -1.0F, 12, 15, 1);
    this.Mask2.setRotationPoint(0.0F, -15.0F, -8.0F);
    this.Mask2.setTextureSize(128, 256);
    this.Mask2.mirror = true;
    setRotation(this.Mask2, 0.3839724F, -0.3316126F, -0.1396263F);
    this.Mask3 = new ModelRenderer(this, 0, 16);
    this.Mask3.addBox(-10.0F, -10.0F, 0.0F, 10, 9, 1);
    this.Mask3.setRotationPoint(0.0F, -15.0F, -8.0F);
    this.Mask3.setTextureSize(128, 256);
    this.Mask3.mirror = true;
    setRotation(this.Mask3, 0.3839724F, 0.3316126F, 0.1396263F);
    this.body5 = new ModelRenderer(this, 57, 149);
    this.body5.addBox(-1.4F, 3.5F, -7.5F, 7, 3, 11);
    this.body5.setRotationPoint(0.0F, -42.0F, -10.0F);
    this.body5.setTextureSize(128, 256);
    this.body5.mirror = true;
    setRotation(this.body5, 0.2387955F, 1.058731F, 0.7175527F);
    this.body6 = new ModelRenderer(this, 57, 149);
    this.body6.addBox(-5.4F, 3.5F, -7.5F, 7, 3, 11);
    this.body6.setRotationPoint(0.0F, -42.0F, -9.8F);
    this.body6.setTextureSize(128, 256);
    this.body6.mirror = true;
    setRotation(this.body6, 0.2387959F, -1.058734F, -0.7175572F);
    this.Mask4 = new ModelRenderer(this, 112, 132);
    this.Mask4.addBox(0.0F, -1.0F, 0.0F, 7, 5, 1);
    this.Mask4.setRotationPoint(0.0F, -15.0F, -8.0F);
    this.Mask4.setTextureSize(128, 256);
    this.Mask4.mirror = true;
    setRotation(this.Mask4, 0.3839724F, -0.3316126F, -0.1396263F);
    this.Mask5 = new ModelRenderer(this, 95, 132);
    this.Mask5.addBox(-7.0F, -1.0F, 0.0F, 7, 5, 1);
    this.Mask5.setRotationPoint(0.0F, -15.0F, -8.0F);
    this.Mask5.setTextureSize(128, 256);
    this.Mask5.mirror = true;
    setRotation(this.Mask5, 0.3839724F, 0.3316126F, 0.1396263F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    this.TailEnd1.render(f5);
    this.Tail1.render(f5);
    this.Tail2.render(f5);
    this.Tail3.render(f5);
    this.TailEnd2.render(f5);
    this.leftfoot.render(f5);
    this.leftleg1.render(f5);
    this.leftleg3.render(f5);
    this.leftleg2.render(f5);
    this.rightleg1.render(f5);
    this.rightleg2.render(f5);
    this.rightleg3.render(f5);
    this.rightfoot.render(f5);
    this.body4.render(f5);
    this.body3.render(f5);
    this.rightarm1.render(f5);
    this.rightarm2.render(f5);
    this.leftarm3.render(f5);
    this.leftarm1.render(f5);
    this.leftarm2.render(f5);
    this.rightarm3.render(f5);
    this.Mask.render(f5);
    this.body1.render(f5);
    this.body2.render(f5);
    this.Mask1.render(f5);
    this.Mask2.render(f5);
    this.Mask3.render(f5);
    this.body5.render(f5);
    this.body6.render(f5);
    this.Mask4.render(f5);
    this.Mask5.render(f5);
  }
  

  private void setRotation(ModelRenderer var1, float var2, float var3, float var4)
  {
    var1.rotateAngleX = var2;
    var1.rotateAngleY = var3;
    var1.rotateAngleZ = var4;
  }
  





  public void setRotationAngles(float var1, float var2, float var3, float var4, float var5, float var6, Entity var7)
  {
    super.setRotationAngles(var1, var2, var3, var4, var5, var6, var7);
    this.rightleg1.rotateAngleX = ((float)(MathHelper.cos(var1 * 0.6662F) * 0.6F * var2 - 0.35D));
    this.rightleg1.rotateAngleY = 0.35F;
    this.leftleg1.rotateAngleX = ((float)(MathHelper.cos(var1 * 0.6662F + 3.1415927F) * 0.6F * var2 - 0.35D));
    this.leftleg1.rotateAngleY = -0.35F;
    this.rightleg2.rotateAngleX = ((float)(MathHelper.cos(var1 * 0.6662F) * 0.6F * var2 - 0.35D));
    this.rightleg2.rotateAngleY = 0.35F;
    this.leftleg2.rotateAngleX = ((float)(MathHelper.cos(var1 * 0.6662F + 3.1415927F) * 0.6F * var2 - 0.35D));
    this.leftleg2.rotateAngleY = -0.35F;
    this.rightleg3.rotateAngleX = ((float)(MathHelper.cos(var1 * 0.6662F) * 0.6F * var2 + 0.45D));
    this.rightleg3.rotateAngleY = 0.35F;
    this.rightfoot.rotateAngleX = (MathHelper.cos(var1 * 0.6662F) * 0.6F * var2);
    this.rightfoot.rotateAngleY = 0.35F;
    this.leftleg3.rotateAngleX = ((float)(MathHelper.cos(var1 * 0.6662F + 3.1415927F) * 0.6F * var2 + 0.45D));
    this.leftleg3.rotateAngleY = -0.35F;
    this.leftfoot.rotateAngleX = (MathHelper.cos(var1 * 0.6662F + 3.1415927F) * 0.6F * var2);
    this.leftfoot.rotateAngleY = -0.35F;
    
    this.Tail1.rotateAngleX = ((float)(MathHelper.cos(var1 * 0.5F) * 0.19F * var2 + 0.85D));
    this.Tail2.rotateAngleX = ((float)(MathHelper.cos(var1 * 0.5F) * 0.14F * var2 + 1.83D));
    this.Tail3.rotateAngleX = ((float)(MathHelper.cos(var1 * 0.5F) * 0.08F * var2 + 2.6D));
    this.TailEnd1.rotateAngleX = ((float)(MathHelper.cos(var1 * 0.5F) * 0.07F * var2 + 6.2D));
    this.TailEnd2.rotateAngleX = ((float)(MathHelper.cos(var1 * 0.5F) * 0.07F * var2 + 6.32D));
    
    this.rightarm1.rotateAngleX = (MathHelper.cos(var1 * 0.6662F + 3.1415927F) * 2.0F * var2 * 0.1F);
    this.leftarm1.rotateAngleX = (MathHelper.cos(var1 * 0.6662F) * 2.0F * var2 * 0.1F);
    this.rightarm1.rotateAngleZ = 0.43F;
    this.leftarm1.rotateAngleZ = -0.46F;
    this.rightarm2.rotateAngleX = ((float)(MathHelper.cos(var1 * 0.6662F + 3.1415927F) * 2.0F * var2 * 0.2F - 1.2D));
    this.leftarm2.rotateAngleX = ((float)(MathHelper.cos(var1 * 0.6662F) * 2.0F * var2 * 0.2F - 1.2D));
    this.rightarm2.rotateAngleZ = 0.43F;
    this.leftarm2.rotateAngleZ = -0.46F;
    this.rightarm3.rotateAngleX = ((float)(MathHelper.cos(var1 * 0.6662F + 3.1415927F) * 2.0F * var2 * 0.2F - 1.2D));
    this.leftarm3.rotateAngleX = ((float)(MathHelper.cos(var1 * 0.6662F) * 2.0F * var2 * 0.2F - 1.2D));
    this.rightarm3.rotateAngleZ = 0.43F;
    this.leftarm3.rotateAngleZ = -0.46F;
    
    this.body5.rotateAngleX = 0.33F;
    this.body6.rotateAngleX = 0.32F;
    this.body5.rotateAngleY = 1.96F;
    this.body6.rotateAngleY = -2.06F;
    this.body5.rotateAngleZ = 0.5F;
    this.body6.rotateAngleZ = -0.5F;
  }
}