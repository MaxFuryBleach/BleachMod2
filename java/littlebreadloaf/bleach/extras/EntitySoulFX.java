package littlebreadloaf.bleach.extras;

import net.minecraft.client.particle.EntityFX;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.world.World;


public class EntitySoulFX
  extends EntityFX
{
  float reddustParticleScale;
  
  public EntitySoulFX(World var1, double var2, double var4, double var6, float var8, float var9, float var10)
  {
    this(var1, var2, var4, var6, 1.0F, var8, var9, var10);
  }
  
  public EntitySoulFX(World var1, double var2, double var4, double var6, float var8, float var9, float var10, float var11)
  {
    super(var1, var2, var4, var6, 0.0D, 0.0D, 0.0D);
    this.motionX *= 0.10000000149011612D;
    this.motionY *= 0.10000000149011612D;
    this.motionZ *= 0.10000000149011612D;
    
    if (var9 == 0.0F)
    {
      var9 = 1.0F;
    }
    
    float var12 = (float)Math.random() * 0.4F + 0.6F;
    this.particleRed = 2.0F;
    this.particleGreen = 2.0F;
    this.particleBlue = 2.0F;
    this.particleScale *= 0.75F;
    this.particleScale *= var8;
    this.reddustParticleScale = this.particleScale;
    this.particleMaxAge = ((int)(8.0D / (Math.random() * 0.8D + 0.2D)));
    this.particleMaxAge = ((int)(this.particleMaxAge * var8));
    this.noClip = false;
  }
  
  public void renderParticle(Tessellator var1, float var2, float var3, float var4, float var5, float var6, float var7)
  {
    float var8 = (this.particleAge + var2) / this.particleMaxAge * 32.0F;
    
    if (var8 < 0.0F)
    {
      var8 = 0.0F;
    }
    
    if (var8 > 1.0F)
    {
      var8 = 1.0F;
    }
    
    this.particleScale = (this.reddustParticleScale * var8);
    super.renderParticle(var1, var2, var3, var4, var5, var6, var7);
  }
  



  public void onUpdate()
  {
    this.prevPosX = this.posX;
    this.prevPosY = this.posY;
    this.prevPosZ = this.posZ;
    
    if (this.particleAge++ >= this.particleMaxAge)
    {
      setDead();
    }
    
    setParticleTextureIndex(7 - this.particleAge * 8 / this.particleMaxAge);
    moveEntity(this.motionX, this.motionY, this.motionZ);
    
    if (this.posY == this.prevPosY)
    {
      this.motionX *= 1.1D;
      this.motionZ *= 1.1D;
    }
    
    this.motionX *= 0.9599999785423279D;
    this.motionY *= 0.9599999785423279D;
    this.motionZ *= 0.9599999785423279D;
    
    if (this.onGround)
    {
      this.motionX *= 0.699999988079071D;
      this.motionZ *= 0.699999988079071D;
    }
  }
}
