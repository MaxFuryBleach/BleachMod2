package littlebreadloaf.bleach.entities;

import java.util.List;
import java.util.Random;
import littlebreadloaf.bleach.api.Tools;
import littlebreadloaf.bleach.events.ExtendedPlayer;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IProjectile;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetHandlerPlayServer;
import net.minecraft.network.play.server.S2BPacketChangeGameState;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class EntityShotBlock
  extends Entity implements IProjectile
{
  private int xTile = -1;
  private int yTile = -1;
  private int zTile = -1;
  private Block inTile;
  private int inData = 0;
  private boolean inGround = false;
  public int canBePickedUp = 0;
  public int arrowShake = 0;
  public Entity shootingEntity;
  private int ticksInGround;
  private int ticksInAir = 0;
  private double damage = 2.0D;
  private int knockbackStrength;
  public int blockID;
  
  public EntityShotBlock(World par1World) {
    super(par1World);
    setSize(1.0F, 1.0F);
  }
  
  public EntityShotBlock(World var1, EntityLivingBase var2, float var3, int id)
  {
    super(var1);
    this.renderDistanceWeight = 10.0D;
    this.shootingEntity = var2;
    
    this.blockID = id;
    setSize(1.0F, 1.0F);
    setLocationAndAngles(var2.posX, var2.posY + var2.getEyeHeight(), var2.posZ, var2.rotationYaw, var2.rotationPitch);
    this.posX -= MathHelper.cos(this.rotationYaw / 180.0F * 3.1415927F) * 0.16F;
    this.posY -= 0.10000000149011612D;
    this.posZ -= MathHelper.sin(this.rotationYaw / 180.0F * 3.1415927F) * 0.16F;
    setPosition(this.posX, this.posY, this.posZ);
    this.yOffset = 0.0F;
    this.motionX = (-MathHelper.sin(this.rotationYaw / 180.0F * 3.1415927F) * MathHelper.cos(this.rotationPitch / 180.0F * 3.1415927F));
    this.motionZ = (MathHelper.cos(this.rotationYaw / 180.0F * 3.1415927F) * MathHelper.cos(this.rotationPitch / 180.0F * 3.1415927F));
    this.motionY = (-MathHelper.sin(this.rotationPitch / 180.0F * 3.1415927F));
    setThrowableHeading(this.motionX, this.motionY, this.motionZ, var3 * 1.5F, 1.0F);
  }
  




  public void setThrowableHeading(double var1, double var3, double var5, float var7, float var8)
  {
    float var9 = MathHelper.sqrt_double(var1 * var1 + var3 * var3 + var5 * var5);
    var1 /= var9;
    var3 /= var9;
    var5 /= var9;
    var1 += this.rand.nextGaussian() * 0.007499999832361937D * var8;
    var3 += this.rand.nextGaussian() * 0.007499999832361937D * var8;
    var5 += this.rand.nextGaussian() * 0.007499999832361937D * var8;
    var1 *= var7;
    var3 *= var7;
    var5 *= var7;
    this.motionX = var1;
    this.motionY = var3;
    this.motionZ = var5;
    float var10 = MathHelper.sqrt_double(var1 * var1 + var5 * var5);
    this.prevRotationYaw = (this.rotationYaw = (float)(Math.atan2(var1, var5) * 180.0D / 3.141592653589793D));
    this.prevRotationPitch = (this.rotationPitch = (float)(Math.atan2(var3, var10) * 180.0D / 3.141592653589793D));
    this.ticksInGround = 0;
  }
  




  public void setVelocity(double var1, double var3, double var5)
  {
    this.motionX = var1;
    this.motionY = var3;
    this.motionZ = var5;
    
    if ((this.prevRotationPitch == 0.0F) && (this.prevRotationYaw == 0.0F))
    {
      float var7 = MathHelper.sqrt_double(var1 * var1 + var5 * var5);
      this.prevRotationYaw = (this.rotationYaw = (float)(Math.atan2(var1, var5) * 180.0D / 3.141592653589793D));
      this.prevRotationPitch = (this.rotationPitch = (float)(Math.atan2(var3, var7) * 180.0D / 3.141592653589793D));
      this.prevRotationPitch = this.rotationPitch;
      this.prevRotationYaw = this.rotationYaw;
      setLocationAndAngles(this.posX, this.posY, this.posZ, this.rotationYaw, this.rotationPitch);
      this.ticksInGround = 0;
    }
  }
  





  public void onUpdate()
  {
    super.onUpdate();
    if ((this.prevRotationPitch == 0.0F) && (this.prevRotationYaw == 0.0F))
    {
      float var1 = MathHelper.sqrt_double(this.motionX * this.motionX + this.motionZ * this.motionZ);
      this.prevRotationYaw = (this.rotationYaw = (float)(Math.atan2(this.motionX, this.motionZ) * 180.0D / 3.141592653589793D));
      this.prevRotationPitch = (this.rotationPitch = (float)(Math.atan2(this.motionY, var1) * 180.0D / 3.141592653589793D));
    }
    
    Block block = this.worldObj.getBlock(this.xTile, this.yTile, this.zTile);
    
    if (block.getMaterial() != Material.air)
    {
      block.setBlockBoundsBasedOnState(this.worldObj, this.xTile, this.yTile, this.zTile);
      AxisAlignedBB axisalignedbb = block.getCollisionBoundingBoxFromPool(this.worldObj, this.xTile, this.yTile, this.zTile);
      
      if ((axisalignedbb != null) && (axisalignedbb.isVecInside(Vec3.createVectorHelper(this.posX, this.posY, this.posZ))))
      {
        this.inGround = true;
      }
    }
    


    if (this.inGround)
    {
      int j = this.worldObj.getBlockMetadata(this.xTile, this.yTile, this.zTile);
      
      if ((block == this.inTile) && (j == this.inData))
      {
        if (this.blockID == 0) {
          this.worldObj.setBlock(this.xTile, this.yTile + 1, this.zTile, Blocks.grass);
        }
        if (this.blockID == 1) {
          this.worldObj.setBlock(this.xTile, this.yTile + 1, this.zTile, Blocks.dirt);
        }
        if (this.blockID == 2) {
          this.worldObj.setBlock(this.xTile, this.yTile + 1, this.zTile, Blocks.stone);
        }
      }
    }
    else
    {
      this.ticksInAir += 1;
      Vec3 var18 = Vec3.createVectorHelper(this.posX, this.posY, this.posZ);
      Vec3 var19 = Vec3.createVectorHelper(this.posX + this.motionX, this.posY + this.motionY, this.posZ + this.motionZ);
      MovingObjectPosition var4 = this.worldObj.func_147447_a(var18, var19, false, true, false);
      var18 = Vec3.createVectorHelper(this.posX, this.posY, this.posZ);
      var19 = Vec3.createVectorHelper(this.posX + this.motionX, this.posY + this.motionY, this.posZ + this.motionZ);
      
      if (var4 != null)
      {
        var19 = Vec3.createVectorHelper(var4.hitVec.xCoord, var4.hitVec.yCoord, var4.hitVec.zCoord);
      }
      
      if (this.ticksInAir == 200)
      {
        setDead();
      }
      
      Entity var5 = null;
      List var6 = this.worldObj.getEntitiesWithinAABBExcludingEntity(this, this.boundingBox.addCoord(this.motionX, this.motionY, this.motionZ).expand(1.0D, 1.0D, 1.0D));
      double var7 = 0.0D;
      


      for (int var9 = 0; var9 < var6.size(); var9++)
      {
        Entity var11 = (Entity)var6.get(var9);
        
        if ((var11.canBeCollidedWith()) && ((var11 != this.shootingEntity) || (this.ticksInAir >= 5)))
        {
          float var10 = 0.3F;
          AxisAlignedBB var12 = var11.boundingBox.expand(var10, var10, var10);
          MovingObjectPosition var13 = var12.calculateIntercept(var18, var19);
          
          if (var13 != null)
          {
            double var14 = var18.distanceTo(var13.hitVec);
            
            if ((var14 < var7) || (var7 == 0.0D))
            {
              var5 = var11;
              var7 = var14;
            }
          }
        }
      }
      
      if (var5 != null)
      {
        var4 = new MovingObjectPosition(var5);
      }
      



      if (var4 != null)
      {
        if (var4.entityHit != null)
        {

          EntityPlayer player = (EntityPlayer)this.shootingEntity;
          ExtendedPlayer props; if ((!(this.shootingEntity instanceof EntityPlayer)) || 
          




            ((var4.entityHit instanceof EntityLivingBase)))
          {
            if (((EntityLivingBase)var4.entityHit).getCreatureAttribute() == Tools.SPIRIT)
            {
              if ((this.shootingEntity instanceof EntityPlayer))
              {
                ExtendedPlayer props = (ExtendedPlayer)player.getExtendedProperties("BleachPlayer");
                
                if ((!player.worldObj.isRemote) && (props.getFaction() == 1))
                {
                  props.addSXP(3);
                }
              }
            }
            

            if ((this.shootingEntity instanceof EntityPlayer))
            {
              props = (ExtendedPlayer)player.getExtendedProperties("BleachPlayer");
            }
          }
          






          this.ticksInAir = 495;
          
          float var20 = MathHelper.sqrt_double(this.motionX * this.motionX + this.motionY * this.motionY + this.motionZ * this.motionZ);
          int var22 = MathHelper.ceiling_double_int(var20 * this.damage);
          

          DamageSource var23 = null;
          
          if (this.shootingEntity == null)
          {
            var23 = DamageSource.causeThrownDamage(this, this);
          }
          else {
            var23 = DamageSource.causeThrownDamage(this, this.shootingEntity);
          }
          
          if ((isBurning()) && (!(var4.entityHit instanceof EntityEnderman)))
          {
            var4.entityHit.setFire(5);
          }
          
          if (var4.entityHit.attackEntityFrom(var23, var22))
          {
            if ((var4.entityHit instanceof EntityLivingBase))
            {
              EntityLivingBase var15 = (EntityLivingBase)var4.entityHit;
              
              if (!this.worldObj.isRemote)
              {
                var15.setArrowCountInEntity(var15.getArrowCountInEntity() + 1);
              }
              
              if (this.knockbackStrength > 0)
              {
                float var21 = MathHelper.sqrt_double(this.motionX * this.motionX + this.motionZ * this.motionZ);
                
                if (var21 > 0.0F)
                {
                  var4.entityHit.addVelocity(this.motionX * this.knockbackStrength * 0.6000000238418579D / var21, 0.1D, this.motionZ * this.knockbackStrength * 0.6000000238418579D / var21);
                }
              }
              
              if ((this.shootingEntity != null) && ((this.shootingEntity instanceof EntityLivingBase)))
              {
                EnchantmentHelper.func_151384_a(var15, this.shootingEntity);
                EnchantmentHelper.func_151385_b((EntityLivingBase)this.shootingEntity, var15);
              }
              if ((this.shootingEntity != null) && (var4.entityHit != this.shootingEntity) && ((var4.entityHit instanceof EntityPlayer)) && ((this.shootingEntity instanceof EntityPlayerMP)))
              {

                ((EntityPlayerMP)this.shootingEntity).playerNetServerHandler.sendPacket(new S2BPacketChangeGameState(6, 0.0F));
              }
            }
            
            playSound("random.bowhit", 1.0F, 1.2F / (this.rand.nextFloat() * 0.2F + 0.9F));
            
            if (!(var4.entityHit instanceof EntityEnderman))
            {
              setDead();
            }
          }
          else {
            this.motionX *= -0.10000000149011612D;
            this.motionY *= -0.10000000149011612D;
            this.motionZ *= -0.10000000149011612D;
            this.rotationYaw += 180.0F;
            this.prevRotationYaw += 180.0F;
            this.ticksInAir = 0;
          }
          setDead();
        }
        else {
          this.xTile = var4.blockX;
          this.yTile = var4.blockY;
          this.zTile = var4.blockZ;
          this.inTile = this.worldObj.getBlock(this.xTile, this.yTile, this.zTile);
          this.inData = this.worldObj.getBlockMetadata(this.xTile, this.yTile, this.zTile);
          this.motionX = ((float)(var4.hitVec.xCoord - this.posX));
          this.motionY = ((float)(var4.hitVec.yCoord - this.posY));
          this.motionZ = ((float)(var4.hitVec.zCoord - this.posZ));
          float var20 = MathHelper.sqrt_double(this.motionX * this.motionX + this.motionY * this.motionY + this.motionZ * this.motionZ);
          this.posX -= this.motionX / var20 * 0.05000000074505806D;
          this.posY -= this.motionY / var20 * 0.05000000074505806D;
          this.posZ -= this.motionZ / var20 * 0.05000000074505806D;
          playSound("random.bowhit", 1.0F, 1.2F / (this.rand.nextFloat() * 0.2F + 0.9F));
          this.inGround = true;
          this.arrowShake = 7;
          
          if (this.inTile != Blocks.air)
          {
            this.inTile.onEntityCollidedWithBlock(this.worldObj, this.xTile, this.yTile, this.zTile, this);
          }
        }
      }
      
      this.posX += this.motionX;
      this.posY += this.motionY;
      this.posZ += this.motionZ;
      float var20 = MathHelper.sqrt_double(this.motionX * this.motionX + this.motionZ * this.motionZ);
      this.rotationYaw = ((float)(Math.atan2(this.motionX, this.motionZ) * 180.0D / 3.141592653589793D));
      
      for (this.rotationPitch = ((float)(Math.atan2(this.motionY, var20) * 180.0D / 3.141592653589793D)); this.rotationPitch - this.prevRotationPitch < -180.0F; this.prevRotationPitch -= 360.0F) {}
      




      while (this.rotationPitch - this.prevRotationPitch >= 180.0F)
      {
        this.prevRotationPitch += 360.0F;
      }
      
      while (this.rotationYaw - this.prevRotationYaw < -180.0F)
      {
        this.prevRotationYaw -= 360.0F;
      }
      
      while (this.rotationYaw - this.prevRotationYaw >= 180.0F)
      {
        this.prevRotationYaw += 360.0F;
      }
      
      this.rotationPitch = (this.prevRotationPitch + (this.rotationPitch - this.prevRotationPitch) * 0.2F);
      this.rotationYaw = (this.prevRotationYaw + (this.rotationYaw - this.prevRotationYaw) * 0.2F);
      float var24 = 0.99F;
      float var10 = 0.05F;
      
      if (isInWater())
      {
        for (int var25 = 0; var25 < 4; var25++)
        {
          float var21 = 0.25F;
          this.worldObj.spawnParticle("bubble", this.posX - this.motionX * var21, this.posY - this.motionY * var21, this.posZ - this.motionZ * var21, this.motionX, this.motionY, this.motionZ);
        }
        

        var24 = 0.8F;
      }
      
      this.motionX *= var24;
      this.motionZ *= var24;
      setPosition(this.posX, this.posY, this.posZ);
      func_145775_I();
    }
  }
  


  protected void entityInit() {}
  

  protected void readEntityFromNBT(NBTTagCompound var1)
  {
    this.blockID = var1.getInteger("BlockID");
  }
  


  protected void writeEntityToNBT(NBTTagCompound var1)
  {
    var1.setInteger("BlockID", this.blockID);
  }
}
