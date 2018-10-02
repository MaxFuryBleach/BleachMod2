package littlebreadloaf.bleach.entities;

import java.util.Random;
import littlebreadloaf.bleach.api.Tools;
import littlebreadloaf.bleach.events.ExtendedPlayer;
import littlebreadloaf.bleach.items.BleachItems;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIAvoidEntity;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITasks;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.ai.attributes.IAttributeInstance;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;

public class EntityFisher extends EntityMob
{
  public EntityFisher(World par1World)
  {
    super(par1World);
    this.tasks.addTask(0, new EntityAISwimming(this));
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
    setSize(1.2F, 3.4F);
    this.experienceValue = 15;
  }
  

  protected boolean isAIEnabled()
  {
    return true;
  }
  

  int invis = 0;
  

  protected void updateAITasks()
  {
    super.updateAITasks();
    this.invis += 1;
    int length = 10;
    if (this.worldObj.difficultySetting == EnumDifficulty.NORMAL)
    {
      length = 10;
    }
    if (this.worldObj.difficultySetting == EnumDifficulty.HARD)
    {
      length = 15;
    }
    if (this.invis == 1800)
    {
      addPotionEffect(new PotionEffect(Potion.invisibility.id, 20 * length, 0));
      this.invis = 0;
    }
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
  

  public EnumCreatureAttribute getCreatureAttribute()
  {
    return Tools.SPIRIT;
  }
  



  protected float getSoundVolume()
  {
    return 0.6F;
  }
  




  protected String getHurtSound()
  {
    if (this.rand.nextInt(100) >= 25)
    {
      return "bleach:hollowscream";
    }
    
    return null;
  }
  





  protected String getLivingSound()
  {
    if (this.rand.nextInt(10) < 4)
      return "bleach:fisherlaugh1";
    if (this.rand.nextInt(10) < 4) {
      return "bleach:fisherlaugh2";
    }
    return "bleach:fisherlaugh3";
  }
  




  protected String getDeathSound()
  {
    return "bleach:hollowscream";
  }
  

  protected void dropFewItems(boolean par1, int par2)
  {
    super.dropFewItems(par1, par2);
    entityDropItem(new ItemStack(BleachItems.reiatsu, 2 + this.rand.nextInt(3) + par2), 0.0F);
    
    if (this.rand.nextInt(20 - par2) == 0)
    {
      dropItem(BleachItems.fishermask, 1);
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
  



  public void onDeath(DamageSource par1DamageSource)
  {
    super.onDeath(par1DamageSource);
    
    if ((par1DamageSource.getEntity() instanceof EntityPlayer))
    {

      ExtendedPlayer props = (ExtendedPlayer)this.attackingPlayer.getExtendedProperties("BleachPlayer");
      if ((props.getFaction() == 1) && (this.attackingPlayer.inventory.getCurrentItem() != null) && (this.attackingPlayer.inventory.getCurrentItem().getItem() == BleachItems.zanpakuto) && (props.getZTotal() < 400))
      {

        props.addPoints(3, 5);
        props.addPoints(7, 2);
        props.addPoints(4, -2);
      }
      if (props.getFaction() == 3)
        props.addSXP(8);
    }
    Item var2;
    if (this.rand.nextInt(50) == 0)
    {
      var2 = BleachItems.recordAsterisk;
    }
  }
}
