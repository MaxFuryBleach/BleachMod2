package littlebreadloaf.bleach.extras;

import java.util.Random;
import net.minecraft.client.particle.EntityFX;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.world.World;

public class EntityTenshoFX
  extends EntityFX
{
  private float flameScale;
  int counter;
  
  public EntityTenshoFX(World par1World, double par2, double par4, double par6, double par8, double par10, double par12)
  {
    super(par1World, par2, par4, par6, par8, par10, par12);
    this.motionX = 1.0D;
    this.motionY = (this.motionY * 0.009999999776482582D + par10);
    this.motionZ = 1.0D;
    double d6 = par2 + (this.rand.nextFloat() - this.rand.nextFloat()) * 0.05F;
    d6 = par4 + (this.rand.nextFloat() - this.rand.nextFloat()) * 0.05F;
    d6 = par6 + (this.rand.nextFloat() - this.rand.nextFloat()) * 0.05F;
    this.flameScale = this.particleScale;
    this.particleRed = 1.0F;
    this.particleGreen = 1.0F;
    this.particleBlue = 1.0F;
    this.particleMaxAge = ((int)(8.0D / (Math.random() * 0.8D + 0.2D)) + 4);
    this.noClip = true;
    
    setParticleTextureIndex(96);
  }
  

  public void renderParticle(Tessellator par1Tessellator, float par2, float par3, float par4, float par5, float par6, float par7)
  {
    float f6 = (this.particleAge + par2) / this.particleMaxAge;
    this.particleScale = (this.flameScale * (2.0F - f6 * f6 * 0.5F));
    super.renderParticle(par1Tessellator, par2, par3, par4, par5, par6, par7);
  }
  


  public int getBrightnessForRender(float par1)
  {
    return 205;
  }
  



  public float getBrightness(float par1)
  {
    float f1 = (this.particleAge + par1) / this.particleMaxAge;
    
    if (f1 < 0.0F)
    {
      f1 = 0.0F;
    }
    
    if (f1 > 1.0F)
    {
      f1 = 1.0F;
    }
    
    float f2 = super.getBrightness(par1);
    return f2 * f1 + (1.0F - f1);
  }
  





  public void onUpdate()
  {
    this.prevPosX = this.posX;
    this.prevPosY = this.posY;
    this.prevPosZ = this.posZ;
    this.counter += 1;
    

    if (this.particleAge++ >= this.particleMaxAge)
    {
      setDead();
    }
    


    this.motionX = (Math.sin(this.counter) * 0.1D);
    this.motionY *= 1.2959999978542327D;
    this.motionZ = (Math.cos(this.counter) * 0.1D);
    moveEntity(this.motionX, this.motionY, this.motionZ);
    this.flameScale = ((float)(this.flameScale + 0.02D));
    

    if (this.onGround)
    {
      this.motionX *= 0.699999988079071D;
      this.motionZ *= 0.699999988079071D;
    }
  }
}
