package littlebreadloaf.bleach.entities;

import java.util.Random;
import littlebreadloaf.bleach.events.ExtendedPlayer;
import littlebreadloaf.bleach.items.BleachItems;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAITasks;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.ai.attributes.IAttributeInstance;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;

public class EntityMenosGrande extends EntityMob
{
  public int deathTicks = 0;
  
  private int ceroCooldown = 100;
  private int ceroCharging = 60;
  
  private EntityPlayer target = null;
  
  public EntityMenosGrande(World par1World)
  {
    super(par1World);
    this.tasks.addTask(1, new EntityAIAttackOnCollide(this, EntityPlayer.class, 0.4D, false));
    this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityWhole.class, 0.4D, false));
    this.tasks.addTask(3, new EntityAIAttackOnCollide(this, EntityShinigami.class, 0.4D, false));
    this.tasks.addTask(5, new EntityAIMoveTowardsRestriction(this, 0.4D));
    this.tasks.addTask(6, new EntityAIWander(this, 0.4D));
    this.tasks.addTask(7, new EntityAILookIdle(this));
    this.tasks.addTask(8, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
    this.tasks.addTask(9, new EntityAIWatchClosest(this, EntityWhole.class, 8.0F));
    this.targetTasks.addTask(0, new net.minecraft.entity.ai.EntityAIHurtByTarget(this, false));
    this.targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
    this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityWhole.class, 0, false));
    this.targetTasks.addTask(3, new EntityAINearestAttackableTarget(this, EntityShinigami.class, 0, false));
    this.isImmuneToFire = true;
    this.ignoreFrustumCheck = true;
    setSize(1.9F, 20.9F);
    this.stepHeight = 3.5F;
  }
  
  public float getEyeHeight()
  {
    return this.height - 1.0F;
  }
  
  protected boolean isAIEnabled()
  {
    return true;
  }
  

  public int getTotalArmorValue()
  {
    return 4;
  }
  

  protected void applyEntityAttributes()
  {
    super.applyEntityAttributes();
    if ((this.worldObj.difficultySetting == EnumDifficulty.NORMAL) || (this.worldObj.difficultySetting == EnumDifficulty.HARD))
    {
      getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(170.0D);
      
      getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(8.0D);
    }
    else {
      getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(150.0D);
      
      getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(6.0D);
    }
    getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(60.0D);
    
    getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setBaseValue(10.0D);
  }
  

  public net.minecraft.entity.EnumCreatureAttribute getCreatureAttribute()
  {
    return littlebreadloaf.bleach.api.Tools.SPIRIT;
  }
  




  protected String getHurtSound()
  {
    if (this.rand.nextInt(2) == 0)
    {
      return "bleach:hollowscream";
    }
    
    return null;
  }
  





  protected String getLivingSound()
  {
    if (this.rand.nextInt(100) >= 25)
    {
      return "bleach:hollowscream";
    }
    
    return null;
  }
  





  protected String getDeathSound()
  {
    return "bleach:hollowscream";
  }
  



  protected float getSoundPitch()
  {
    return super.getSoundPitch() * 0.8F;
  }
  



  protected float getSoundVolume()
  {
    return 3.0F;
  }
  
  protected void dropFewItems(boolean par1, int par2)
  {
    super.dropFewItems(par1, par2);
    entityDropItem(new ItemStack(BleachItems.reiatsu, 8 + this.rand.nextInt(3) + par2), 0.0F);
    
    if (this.rand.nextInt(20 - par2) == 0)
    {
      dropItem(BleachItems.menosmask, 1);
    }
  }
  

  public void onLivingUpdate()
  {
    super.onLivingUpdate();
  }
  
  public int getMaxSpawnedInChunk()
  {
    return 16;
  }
  





























































  protected void fall(float var1) {}
  





























































  protected void onDeathUpdate()
  {
    this.deathTicks += 1;
    int var1 = MathHelper.floor_double(this.posY);
    int var2 = MathHelper.floor_double(this.posX);
    int var3 = MathHelper.floor_double(this.posZ);
    


    if (this.deathTicks <= 200)
    {
      for (int var4 = -3; var4 <= 3; var4++)
      {
        for (int var5 = -3; var5 <= 3; var5++)
        {
          for (int var6 = -1; var6 <= 20; var6++)
          {
            if (this.rand.nextInt(1500) == 0)
            {
              int var7 = var2 + var4;
              int var8 = var1 + var6;
              int var9 = var3 + var5;
              this.worldObj.spawnParticle("largeexplode", var7, var8, var9, 0.0D, 0.0D, 0.0D);
            }
          }
        }
      }
    }
    
    if (!this.worldObj.isRemote)
    {
      if ((this.deathTicks > 150) && (this.deathTicks % 5 == 0))
      {
        int var4 = 10;
        
        while (var4 > 0)
        {
          int var5 = EntityXPOrb.getXPSplit(var4);
          var4 -= var5;
          this.worldObj.spawnEntityInWorld(new EntityXPOrb(this.worldObj, this.posX, this.posY, this.posZ, var5));
        }
      }
      
      if (this.deathTicks == 1)
      {
        this.worldObj.playBroadcastSound(1018, (int)this.posX, (int)this.posY, (int)this.posZ, 0);
      }
    }
    
    if ((this.deathTicks == 200) && (!this.worldObj.isRemote))
    {
      int var4 = 10;
      
      while (var4 > 0)
      {
        int var5 = EntityXPOrb.getXPSplit(var4);
        var4 -= var5;
        this.worldObj.spawnEntityInWorld(new EntityXPOrb(this.worldObj, this.posX, this.posY, this.posZ, var5));
      }
      
      setDead();
    }
  }
  



  public void onDeath(DamageSource par1DamageSource)
  {
    super.onDeath(par1DamageSource);
    Item var2;
    if ((par1DamageSource.getEntity() instanceof EntityPlayer))
    {
      ExtendedPlayer props = (ExtendedPlayer)this.attackingPlayer.getExtendedProperties("BleachPlayer");
      if (props.getFaction() == 3)
        props.addSXP(10);
      if ((props.getFaction() == 1) && (this.attackingPlayer.inventory.getCurrentItem() != null) && (this.attackingPlayer.inventory.getCurrentItem().getItem() == BleachItems.zanpakuto) && (props.getZTotal() < 376))
      {

        for (int i = 0; i < 25; i++)
        {
          props.addPoints(this.rand.nextInt(8) + 1, 1);
        }
      }
      
      if (this.rand.nextInt(50) == 0)
      {
        var2 = BleachItems.recordNumberOne;
      }
    }
  }
  





  public int getChargingProgress()
  {
    return this.ceroCharging;
  }
  




  public boolean getCanSpawnHere()
  {
    return (this.posY < 50.0D) && (this.worldObj.difficultySetting != EnumDifficulty.PEACEFUL) && (!this.worldObj.isAnyLiquid(this.boundingBox));
  }
  
  public boolean canDespawn()
  {
    return false;
  }
}
