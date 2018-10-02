package littlebreadloaf.bleach.entities;

import java.util.Random;
import littlebreadloaf.bleach.armor.Armor;
import littlebreadloaf.bleach.events.ExtendedPlayer;
import littlebreadloaf.bleach.items.BleachItems;
import net.minecraft.entity.DataWatcher;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIAvoidEntity;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAITasks;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.ai.attributes.IAttributeInstance;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;

public class EntityHollowSnake extends EntityMob
{
  private static Random rand = new Random();
  
  public EntityHollowSnake(World par1)
  {
    this(par1, rand.nextInt(3));
  }
  
  public EntityHollowSnake(World par1World, int par2)
  {
    super(par1World);
    setTexture(par2);
    this.tasks.addTask(0, new net.minecraft.entity.ai.EntityAISwimming(this));
    this.tasks.addTask(1, new EntityAIAttackOnCollide(this, EntityPlayer.class, 0.4D, false));
    this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityWhole.class, 0.4D, false));
    this.tasks.addTask(3, new EntityAIAttackOnCollide(this, EntityShinigami.class, 0.4D, false));
    this.tasks.addTask(4, new EntityAIAvoidEntity(this, EntityIronGolem.class, 6.0F, 0.30000001192092896D, 0.30000001192092896D));
    this.tasks.addTask(5, new EntityAIMoveTowardsRestriction(this, 0.4D));
    this.tasks.addTask(6, new EntityAIWander(this, 0.4D));
    this.tasks.addTask(7, new EntityAILookIdle(this));
    this.tasks.addTask(8, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
    this.tasks.addTask(9, new EntityAIWatchClosest(this, EntityWhole.class, 8.0F));
    this.targetTasks.addTask(0, new EntityAIHurtByTarget(this, false));
    this.targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
    this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityWhole.class, 0, false));
    this.targetTasks.addTask(3, new EntityAINearestAttackableTarget(this, EntityShinigami.class, 0, false));
    this.experienceValue = 15;
    this.ignoreFrustumCheck = true;
    setSize(1.2F, 3.1F);
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
      getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(70.0D);
      
      getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(6.0D);
    }
    else {
      getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(50.0D);
      
      getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(4.0D);
    }
    getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(50.0D);
  }
  

  public net.minecraft.entity.EnumCreatureAttribute getCreatureAttribute()
  {
    return littlebreadloaf.bleach.api.Tools.SPIRIT;
  }
  




  protected String getHurtSound()
  {
    if (rand.nextInt(100) >= 50)
    {
      return "bleach:hollowscream";
    }
    
    return null;
  }
  





  protected String getLivingSound()
  {
    if (rand.nextInt(100) >= 25)
    {
      return "bleach:hollowscream";
    }
    
    return null;
  }
  





  protected String getDeathSound()
  {
    return "bleach:hollowscream";
  }
  
  protected void dropFewItems(boolean par1, int par2)
  {
    super.dropFewItems(par1, par2);
    entityDropItem(new ItemStack(BleachItems.reiatsu, 2 + rand.nextInt(3) + par2), 0.0F);
    
    if (rand.nextInt(20 - par2) == 0)
    {
      dropItem(Armor.SnakeHelmet, 1);
    }
  }
  

  public void onLivingUpdate()
  {
    super.onLivingUpdate();
  }
  
  public int getMaxSpawnedInChunk()
  {
    return 1;
  }
  

  protected void fall(float var1) {}
  

  public boolean attackEntityAsMob(Entity par1Entity)
  {
    if (super.attackEntityAsMob(par1Entity))
    {
      if ((par1Entity instanceof EntityLivingBase))
      {
        byte b0 = 0;
        

        if (this.worldObj.difficultySetting == EnumDifficulty.NORMAL)
        {
          b0 = 7;
        } else if (this.worldObj.difficultySetting == EnumDifficulty.HARD)
        {
          b0 = 15;
        }
        

        if (b0 > 0)
        {
          ((EntityLivingBase)par1Entity).addPotionEffect(new PotionEffect(Potion.poison.id, b0 * 20, 0));
        }
      }
      
      return true;
    }
    
    return false;
  }
  




  public void onDeath(DamageSource par1DamageSource)
  {
    super.onDeath(par1DamageSource);
    
    if ((par1DamageSource.getEntity() instanceof EntityPlayer))
    {
      ExtendedPlayer props = (ExtendedPlayer)this.attackingPlayer.getExtendedProperties("BleachPlayer");
      if ((props.getFaction() == 1) && (this.attackingPlayer.inventory.getCurrentItem() != null) && (this.attackingPlayer.inventory.getCurrentItem().getItem() == BleachItems.zanpakuto) && (props.getZTotal() < 400))
      {

        props.addPoints(3, 4);
        props.addPoints(8, 3);
        props.addPoints(4, -2);
      }
      
      if (props.getFaction() == 3) {
        props.addSXP(8);
      }
    }
  }
  
  public void setTexture(int par1)
  {
    this.dataWatcher.updateObject(19, Integer.valueOf(par1));
  }
  
  public int getTexture()
  {
    return this.dataWatcher.getWatchableObjectInt(19);
  }
  
  protected void entityInit()
  {
    super.entityInit();
    this.dataWatcher.addObject(19, Integer.valueOf(0));
  }
  



  public void writeEntityToNBT(NBTTagCompound par1NBTTagCompound)
  {
    super.writeEntityToNBT(par1NBTTagCompound);
    par1NBTTagCompound.setInteger("Texture", getTexture());
  }
  



  public void readEntityFromNBT(NBTTagCompound par1NBTTagCompound)
  {
    super.readEntityFromNBT(par1NBTTagCompound);
    setTexture(par1NBTTagCompound.getInteger("Texture"));
  }
}
