package littlebreadloaf.bleach.entities;

import java.util.Random;
import littlebreadloaf.bleach.api.Tools;
import littlebreadloaf.bleach.items.BleachItems;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITasks;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.ai.attributes.IAttributeInstance;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;









public class EntityAshido
  extends EntityMob
{
  private static Random rand = new Random();
  private boolean angry;
  
  public EntityAshido(World par1)
  {
    this(par1, 1);
  }
  
  public EntityAshido(World par1World, int par2)
  {
    super(par1World);
    this.tasks.addTask(0, new EntityAISwimming(this));
    this.tasks.addTask(1, new EntityAIAttackOnCollide(this, EntityHollowBat.class, 0.5D, false));
    this.tasks.addTask(1, new EntityAIAttackOnCollide(this, EntityHollowBlaze.class, 0.5D, true));
    this.tasks.addTask(1, new EntityAIAttackOnCollide(this, EntityHollowGolem.class, 0.5D, true));
    this.tasks.addTask(1, new EntityAIAttackOnCollide(this, EntityHollowSnake.class, 0.5D, false));
    this.tasks.addTask(1, new EntityAIAttackOnCollide(this, EntityHollowSpider.class, 0.5D, true));
    this.tasks.addTask(1, new EntityAIAttackOnCollide(this, EntityHollowOre.class, 0.5D, false));
    this.tasks.addTask(1, new EntityAIAttackOnCollide(this, EntityHollowWolf.class, 0.5D, true));
    this.tasks.addTask(1, new EntityAIAttackOnCollide(this, EntityFisher.class, 0.5D, true));
    this.tasks.addTask(1, new EntityAIAttackOnCollide(this, EntityMenosGrande.class, 0.5D, true));
    this.tasks.addTask(1, new EntityAIAttackOnCollide(this, EntityHollowWasp.class, 0.5D, true));
    this.tasks.addTask(1, new EntityAIAttackOnCollide(this, EntityHollowStalker.class, 0.5D, true));
    this.tasks.addTask(11, new EntityAIMoveTowardsRestriction(this, 0.5D));
    this.tasks.addTask(12, new EntityAIWander(this, 0.5D));
    this.tasks.addTask(13, new EntityAILookIdle(this));
    this.tasks.addTask(14, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
    this.targetTasks.addTask(0, new EntityAIHurtByTarget(this, false));
    this.targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, false));
    this.targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityHollowBat.class, 0, false));
    this.targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityHollowBlaze.class, 0, false));
    this.targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityHollowGolem.class, 0, false));
    this.targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityHollowSnake.class, 0, false));
    this.targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityHollowSpider.class, 0, false));
    this.targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityHollowWolf.class, 0, false));
    this.targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityHollowOre.class, 0, false));
    this.targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityFisher.class, 0, false));
    this.targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityMenosGrande.class, 0, false));
    this.targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityHollowWasp.class, 0, false));
    this.targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityHollowStalker.class, 0, false));
    this.experienceValue = 15;
    setSize(1.0F, 1.4F);
  }
  

  protected boolean isAIEnabled()
  {
    return true;
  }
  

  public int getTotalArmorValue()
  {
    return 6;
  }
  

  protected void applyEntityAttributes()
  {
    super.applyEntityAttributes();
    
    getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(300.0D);
    
    getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(6.0D);
    
    getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(50.0D);
  }
  

  public static final ItemStack heldItem = new ItemStack(BleachItems.zanpakuto, 1);
  

  public ItemStack getHeldItem()
  {
    return heldItem;
  }
  



  public EnumCreatureAttribute getCreatureAttribute()
  {
    return Tools.SPIRIT;
  }
  

  public boolean attackEntityFrom(DamageSource par1DamageSource, float par2)
  {
    if ((par1DamageSource.getEntity() instanceof EntityPlayer))
    {
      this.tasks.addTask(4, new EntityAIAttackOnCollide(this, EntityPlayer.class, 0.5D, true));
    }
    this.angry = true;
    return super.attackEntityFrom(par1DamageSource, par2);
  }
  





  protected String getHurtSound()
  {
    if (rand.nextInt(100) >= 50)
    {
      return null;
    }
    
    return null;
  }
  





  protected String getLivingSound()
  {
    if (rand.nextInt(100) >= 25)
    {
      return null;
    }
    
    return null;
  }
  





  protected String getDeathSound()
  {
    return null;
  }
  
  protected void dropFewItems(boolean par1, int par2)
  {
    super.dropFewItems(par1, par2);
    entityDropItem(new ItemStack(BleachItems.reiatsu, 2 + rand.nextInt(3) + par2), 0.0F);
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
  



  protected Entity findPlayerToAttack()
  {
    return this.angry ? null : super.findPlayerToAttack();
  }
}
