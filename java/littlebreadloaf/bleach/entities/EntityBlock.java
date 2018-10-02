package littlebreadloaf.bleach.entities;

import java.util.Random;
import littlebreadloaf.bleach.events.ExtendedPlayer;
import littlebreadloaf.bleach.items.BleachItems;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;














public class EntityBlock
  extends Entity
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
  
  public EntityBlock(World par1World) {
    super(par1World);
    setSize(1.0F, 1.0F);
  }
  
  public EntityBlock(World var1, EntityLivingBase var2, float var3, int id)
  {
    super(var1);
    this.renderDistanceWeight = 10.0D;
    this.shootingEntity = var2;
    this.ignoreFrustumCheck = true;
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
    if ((this.shootingEntity != null) && ((this.shootingEntity instanceof EntityPlayer)))
    {
      EntityPlayer player = (EntityPlayer)this.shootingEntity;
      
      ExtendedPlayer props = ExtendedPlayer.get(player);
      if ((player.getCurrentEquippedItem() != null) && (player.getCurrentEquippedItem().getItem() == BleachItems.shikaiearth))
      {
        if (props.getHasBlock())
        {

          Vec3 look = player.getLook(1.0F);
          this.posX = (this.shootingEntity.posX + look.xCoord);
          this.posY = (this.shootingEntity.posY + look.yCoord);
          this.posZ = (this.shootingEntity.posZ + look.zCoord);
        }
        else
        {
          setDead();
        }
      }
      else
      {
        props.setHasBlock(false);
        setDead();
      }
    }
    else
    {
      setDead();
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
