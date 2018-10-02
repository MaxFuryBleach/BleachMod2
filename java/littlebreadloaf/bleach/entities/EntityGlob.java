package littlebreadloaf.bleach.entities;

import java.util.Random;
import littlebreadloaf.bleach.api.Tools;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityGlob extends EntityThrowable
{
  private static final String __OBFID = "CL_00001722";
  
  public EntityGlob(World par1World)
  {
    super(par1World);
  }
  
  public EntityGlob(World par1World, EntityLivingBase par2EntityLivingBase)
  {
    super(par1World, par2EntityLivingBase);
  }
  
  public EntityGlob(World par1World, double par2, double par4, double par6)
  {
    super(par1World, par2, par4, par6);
  }
  



  protected void onImpact(MovingObjectPosition par1MovingObjectPosition)
  {
    if (par1MovingObjectPosition.entityHit != null)
    {
      if ((par1MovingObjectPosition.entityHit instanceof EntityLivingBase))
      {
        EntityLivingBase entity = (EntityLivingBase)par1MovingObjectPosition.entityHit;
        byte b0 = 1;
        
        if (entity.getCreatureAttribute() == Tools.SPIRIT)
        {
          b0 = 4;
        }
        
        entity.attackEntityFrom(DamageSource.causeThrownDamage(this, getThrower()), b0);
        if (this.rand.nextInt(5) == 0) {
          entity.addPotionEffect(new PotionEffect(Potion.poison.id, 80, 0));
        }
      }
    }
    for (int i = 0; i < 8; i++)
    {
      this.worldObj.spawnParticle("slime", this.posX, this.posY, this.posZ, 0.0D, 0.0D, 0.0D);
    }
    
    if (!this.worldObj.isRemote)
    {
      setDead();
    }
  }
}
