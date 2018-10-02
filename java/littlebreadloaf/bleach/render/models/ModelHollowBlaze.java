package littlebreadloaf.bleach.render.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelHollowBlaze
  extends ModelBase
{
  private ModelRenderer[] blazeSticks = new ModelRenderer[18];
  private ModelRenderer blazeHead;
  
  public ModelHollowBlaze()
  {
    for (int var1 = 0; var1 < this.blazeSticks.length; var1++)
    {
      this.blazeSticks[var1] = new ModelRenderer(this, 0, 16);
      this.blazeSticks[var1].addBox(0.0F, 0.0F, 0.0F, 2, 8, 2);
    }
    
    this.blazeHead = new ModelRenderer(this, 0, 0);
    this.blazeHead.addBox(-4.0F, -4.0F, -4.0F, 8, 8, 8);
  }
  
  public int func_78104_a()
  {
    return 18;
  }
  



  public void render(Entity par1Entity, float par2, float par3, float par4, float par5, float par6, float par7)
  {
    setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
    this.blazeHead.render(par7);
    
    for (int var8 = 0; var8 < this.blazeSticks.length; var8++)
    {
      this.blazeSticks[var8].render(par7);
    }
  }
  





  public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity)
  {
    float var8 = par3 * 3.1415927F * -0.1F;
    

    for (int var9 = 0; var9 < 6; var9++)
    {
      this.blazeSticks[var9].rotationPointY = (-2.0F + MathHelper.cos((var9 * 2 + par3) * 0.25F));
      this.blazeSticks[var9].rotationPointX = (MathHelper.cos(var8) * 9.0F);
      this.blazeSticks[var9].rotationPointZ = (MathHelper.sin(var8) * 9.0F);
      var8 += 1.0F;
    }
    
    var8 = 0.7853982F + par3 * 3.1415927F * 0.03F;
    
    for (var9 = 6; var9 < 12; var9++)
    {
      this.blazeSticks[var9].rotationPointY = (2.0F + MathHelper.cos((var9 * 2 + par3) * 0.25F));
      this.blazeSticks[var9].rotationPointX = (MathHelper.cos(var8) * 7.0F);
      this.blazeSticks[var9].rotationPointZ = (MathHelper.sin(var8) * 7.0F);
      var8 += 1.0F;
    }
    
    var8 = 0.47123894F + par3 * 3.1415927F * -0.05F;
    
    for (var9 = 12; var9 < 18; var9++)
    {
      this.blazeSticks[var9].rotationPointY = (11.0F + MathHelper.cos((var9 * 1.5F + par3) * 0.5F));
      this.blazeSticks[var9].rotationPointX = (MathHelper.cos(var8) * 5.0F);
      this.blazeSticks[var9].rotationPointZ = (MathHelper.sin(var8) * 5.0F);
      var8 += 1.0F;
    }
    
    this.blazeHead.rotateAngleY = (par4 / 57.295776F);
    this.blazeHead.rotateAngleX = (par5 / 57.295776F);
  }
}
