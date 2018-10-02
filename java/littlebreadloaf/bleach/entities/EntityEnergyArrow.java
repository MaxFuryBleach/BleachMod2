package littlebreadloaf.bleach.entities;

import java.util.List;
import java.util.Random;
import littlebreadloaf.bleach.armor.Armor;
import littlebreadloaf.bleach.events.ExtendedPlayer;
import littlebreadloaf.bleach.items.BleachItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.DataWatcher;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IProjectile;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.entity.player.PlayerCapabilities;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetHandlerPlayServer;
import net.minecraft.network.play.server.S2BPacketChangeGameState;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class EntityEnergyArrow extends Entity implements IProjectile
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
  
  public EntityEnergyArrow(World var1)
  {
    super(var1);
    this.renderDistanceWeight = 10.0D;
    setSize(0.5F, 0.5F);
  }
  
  public int getBrightnessForRender(float par1)
  {
    return 15728880;
  }
  



  public float getBrightness(float par1)
  {
    return 1.0F;
  }
  
  public EntityEnergyArrow(World var1, double var2, double var4, double var6)
  {
    super(var1);
    this.renderDistanceWeight = 10.0D;
    setSize(0.5F, 0.5F);
    setPosition(var2, var4, var6);
    this.yOffset = 0.0F;
  }
  
  public EntityEnergyArrow(World var1, EntityLiving var2, EntityLiving var3, float var4, float var5)
  {
    super(var1);
    this.renderDistanceWeight = 10.0D;
    this.shootingEntity = var2;
    
    this.posY = (var2.posY + var2.getEyeHeight() - 0.10000000149011612D);
    double var6 = var3.posX - var2.posX;
    double var8 = var3.posY + var3.getEyeHeight() - 0.699999988079071D - this.posY;
    double var10 = var3.posZ - var2.posZ;
    double var12 = MathHelper.sqrt_double(var6 * var6 + var10 * var10);
    
    if (var12 >= 1.0E-7D)
    {
      float var14 = (float)(Math.atan2(var10, var6) * 180.0D / 3.141592653589793D) - 90.0F;
      float var15 = (float)-(Math.atan2(var8, var12) * 180.0D / 3.141592653589793D);
      double var16 = var6 / var12;
      double var18 = var10 / var12;
      setLocationAndAngles(var2.posX + var16, this.posY, var2.posZ + var18, var14, var15);
      this.yOffset = 0.0F;
      float var20 = (float)var12 * 0.2F;
      setThrowableHeading(var6, var8 + var20, var10, var4, var5);
    }
  }
  
  public EntityEnergyArrow(World var1, EntityLivingBase var2, float var3)
  {
    super(var1);
    this.renderDistanceWeight = 10.0D;
    this.shootingEntity = var2;
    
    setSize(0.5F, 0.5F);
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
  
  protected void entityInit()
  {
    this.dataWatcher.addObject(16, Byte.valueOf((byte)0));
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
  




  public void setPositionAndRotation2(double var1, double var3, double var5, float var7, float var8, int var9)
  {
    setPosition(var1, var3, var5);
    setRotation(var7, var8);
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
  
  double robeboost = 0.0D;
  double pantboost = 0.0D;
  double sandalboost = 0.0D;
  double damageboost = 0.0D;
  




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
    if (this.arrowShake > 0)
    {
      this.arrowShake -= 1;
    }
    
    if (this.inGround)
    {
      int j = this.worldObj.getBlockMetadata(this.xTile, this.yTile, this.zTile);
      
      if ((block == this.inTile) && (j == this.inData))
      {
        this.ticksInGround += 1;
        
        if (this.ticksInGround >= 2)
        {
          setDead();
        }
      }
      else {
        this.inGround = false;
        this.motionX *= this.rand.nextFloat() * 0.2F;
        this.motionY *= this.rand.nextFloat() * 0.2F;
        this.motionZ *= this.rand.nextFloat() * 0.2F;
        this.ticksInGround = 0;
        this.ticksInAir = 0;
      }
    }
    else {
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
          if ((this.shootingEntity instanceof EntityPlayer))
          {

            ExtendedPlayer props = (ExtendedPlayer)player.getExtendedProperties("BleachPlayer");
            ItemStack var119 = ((EntityPlayer)this.shootingEntity).getCurrentArmor(0);
            ItemStack var110 = ((EntityPlayer)this.shootingEntity).getCurrentArmor(1);
            ItemStack var111 = ((EntityPlayer)this.shootingEntity).getCurrentArmor(2);
            
            if ((var119 != null) && ((var119.getItem() == Armor.Sandals) || (var119.getItem() == Armor.ArrancarShoes)))
            {
              this.sandalboost = -0.2D;
            } else if ((var119 != null) && (var119.getItem() == Armor.QuincyShoes))
            {
              this.sandalboost = 0.2D;
            }
            else {
              this.sandalboost = 0.0D;
            }
            
            if ((var110 != null) && ((var110.getItem() == Armor.ShiniPants) || (var110.getItem() == Armor.ArrancarPants)))
            {
              this.pantboost = -0.4D;
            } else if ((var110 != null) && (var110.getItem() == Armor.QuincyPants))
            {
              this.pantboost = 0.4D;
            }
            else {
              this.pantboost = 0.0D;
            }
            
            if ((var111 != null) && ((var111.getItem() == Armor.ShiniRobe) || (var111.getItem() == Armor.ArrancarJacket)))
            {
              this.robeboost = -0.8D;
            } else if ((var111 != null) && (var111.getItem() == Armor.QuincyRobe))
            {
              this.robeboost = 0.8D;
            }
            else {
              this.robeboost = 0.0D;
            }
          }
          
          if ((var4.entityHit instanceof EntityLivingBase))
          {
            if (((EntityLivingBase)var4.entityHit).getCreatureAttribute() == littlebreadloaf.bleach.api.Tools.SPIRIT)
            {
              if ((this.shootingEntity instanceof EntityPlayer))
              {
                ExtendedPlayer props = (ExtendedPlayer)player.getExtendedProperties("BleachPlayer");
                
                if ((!player.worldObj.isRemote) && (props.getFaction() == 2))
                {
                  props.addSXP(3);
                }
                
                this.damageboost = 3.0D;
                if (props.getFaction() == 2)
                {
                  double spirit = props.getCurrentCap() * props.getCurrentEnergy() / 100.0D;
                  double ddamage = this.damageboost + this.robeboost + this.sandalboost + this.pantboost + spirit;
                  ((EntityLivingBase)var4.entityHit).setHealth(((EntityLivingBase)var4.entityHit).getHealth() - (float)ddamage);
                }
              }
            }
            if ((this.shootingEntity instanceof EntityPlayer))
            {
              ExtendedPlayer props = (ExtendedPlayer)player.getExtendedProperties("BleachPlayer");
              
              if ((!player.worldObj.isRemote) && (props.getFaction() == 2))
              {
                props.addSXP(1);
              }
              
              this.damageboost = 0.0D;
              if (props.getFaction() == 2)
              {
                double spirit = props.getCurrentCap() * props.getCurrentEnergy() / 100.0D;
                double ddamage = this.damageboost + this.robeboost + this.sandalboost + this.pantboost + spirit;
                ((EntityLivingBase)var4.entityHit).attackEntityFrom(DamageSource.generic, (float)ddamage);
              }
            }
          }
          


          this.ticksInAir = 495;
          
          float var20 = MathHelper.sqrt_double(this.motionX * this.motionX + this.motionY * this.motionY + this.motionZ * this.motionZ);
          int var22 = MathHelper.ceiling_double_int(var20 * this.damage);
          
          if (getIsCritical())
          {
            var22 += this.rand.nextInt(var22 / 2 + 2);
          }
          
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
          setIsCritical(false);
          
          if (this.inTile != net.minecraft.init.Blocks.air)
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
  



  public void writeEntityToNBT(NBTTagCompound var1)
  {
    var1.setShort("xTile", (short)this.xTile);
    var1.setShort("yTile", (short)this.yTile);
    var1.setShort("zTile", (short)this.zTile);
    var1.setByte("inTile", (byte)Block.getIdFromBlock(this.inTile));
    var1.setByte("inData", (byte)this.inData);
    var1.setByte("shake", (byte)this.arrowShake);
    var1.setByte("inGround", (byte)(this.inGround ? 1 : 0));
    var1.setByte("pickup", (byte)this.canBePickedUp);
    var1.setDouble("damage", this.damage);
  }
  



  public void readEntityFromNBT(NBTTagCompound var1)
  {
    this.xTile = var1.getShort("xTile");
    this.yTile = var1.getShort("yTile");
    this.zTile = var1.getShort("zTile");
    this.inTile = Block.getBlockById(var1.getByte("inTile") & 0xFF);
    this.inData = (var1.getByte("inData") & 0xFF);
    this.arrowShake = (var1.getByte("shake") & 0xFF);
    this.inGround = (var1.getByte("inGround") == 1);
    
    if (var1.hasKey("damage"))
    {
      this.damage = var1.getDouble("damage");
    }
    
    if (var1.hasKey("pickup"))
    {
      this.canBePickedUp = var1.getByte("pickup");
    } else if (var1.hasKey("player"))
    {
      this.canBePickedUp = (var1.getBoolean("player") ? 1 : 0);
    }
  }
  



  public void onCollideWithPlayer(EntityPlayer var1)
  {
    if ((!this.worldObj.isRemote) && (this.inGround) && (this.arrowShake <= 0))
    {
      boolean var2 = (this.canBePickedUp == 1) || ((this.canBePickedUp == 2) && (var1.capabilities.isCreativeMode));
      
      if ((this.canBePickedUp == 1) && (!var1.inventory.addItemStackToInventory(new ItemStack(BleachItems.reiatsu, 1))))
      {
        var2 = false;
      }
      
      if (var2)
      {
        playSound("random.pop", 0.2F, ((this.rand.nextFloat() - this.rand.nextFloat()) * 0.7F + 1.0F) * 2.0F);
        var1.onItemPickup(this, 1);
        setDead();
      }
    }
  }
  




  protected boolean canTriggerWalking()
  {
    return false;
  }
  
  public float getShadowSize()
  {
    return 0.0F;
  }
  
  public void setDamage(double var1)
  {
    this.damage = var1;
  }
  
  public double getDamage()
  {
    return this.damage;
  }
  
  public void setKnockbackStrength(int var1)
  {
    this.knockbackStrength = var1;
  }
  



  public boolean canAttackWithItem()
  {
    return false;
  }
  
  public void setIsCritical(boolean var1)
  {
    byte var2 = this.dataWatcher.getWatchableObjectByte(16);
    
    if (var1)
    {
      this.dataWatcher.updateObject(16, Byte.valueOf((byte)(var2 | 0x1)));
    }
    else {
      this.dataWatcher.updateObject(16, Byte.valueOf((byte)(var2 & 0xFFFFFFFE)));
    }
  }
  
  public boolean getIsCritical()
  {
    byte var1 = this.dataWatcher.getWatchableObjectByte(16);
    return (var1 & 0x1) != 0;
  }
}
