package littlebreadloaf.bleach.entities;

import java.util.Random;
import littlebreadloaf.bleach.api.Tools;
import littlebreadloaf.bleach.items.BleachItems;
import net.minecraft.entity.DataWatcher;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITasks;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.ai.attributes.IAttributeInstance;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.world.GameRules;
import net.minecraft.world.World;

public class EntityDecoy extends EntityMob
{
  private static Random rand = new Random();
  
  public EntityDecoy(World par1)
  {
    this(par1, rand.nextInt(10));
  }
  
  public EntityDecoy(World par1World, int par2)
  {
    super(par1World);
    setTexture(par2);
    float var3 = 0.43F;
    this.tasks.addTask(0, new EntityAISwimming(this));
    this.tasks.addTask(1, new EntityAIPanic(this, 0.3799999952316284D));
    this.tasks.addTask(2, new net.minecraft.entity.ai.EntityAITempt(this, 0.25D, BleachItems.zanpakuto, false));
    this.tasks.addTask(3, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
    this.tasks.addTask(4, new EntityAILookIdle(this));
    this.tasks.addTask(12, new EntityAILookIdle(this));
    this.tasks.addTask(13, new EntityAIWander(this, var3));
  }
  



  protected boolean isAIEnabled()
  {
    return true;
  }
  





  public void onLivingUpdate()
  {
    super.onLivingUpdate();
  }
  

  protected void applyEntityAttributes()
  {
    super.applyEntityAttributes();
    
    getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(1.0D);
    
    getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(2.0D);
  }
  






  protected void dropFewItems(boolean var1, int var2) {}
  





  protected int getDropItemId()
  {
    return 0;
  }
  



  public net.minecraft.entity.EnumCreatureAttribute getCreatureAttribute()
  {
    return Tools.SPIRIT;
  }
  





  public boolean interact(EntityPlayer var1)
  {
    ItemStack var2 = var1.inventory.getCurrentItem();
    
    if ((var2 != null) && (var2.getItem() == BleachItems.zanpakuto))
    {



      EntityFisher par1 = new EntityFisher(this.worldObj);
      par1.setLocationAndAngles(this.posX, this.posY, this.posZ, 0.0F, 0.0F);
      if (!this.worldObj.isRemote)
      {
        this.worldObj.createExplosion(this, this.posX, this.posY, this.posZ, 3.0F, this.worldObj.getGameRules().getGameRuleBooleanValue("mobGriefing"));
        
        this.worldObj.spawnEntityInWorld(par1);
      }
      setDead();
    }
    
    return true;
  }
  



  protected String getLivingSound()
  {
    return "mob.endermen.idle";
  }
  



  protected String getHurtSound()
  {
    return "mob.endermen.idle";
  }
  



  protected String getDeathSound()
  {
    return "mob.endermen.portal";
  }
  



  protected void fall(float var1) {}
  


  public int getBrightnessForRender(float par1)
  {
    return 15728880;
  }
  



  public float getBrightness(float par1)
  {
    return 1.0F;
  }
  



  public void initCreature() {}
  



  public void onDeath(DamageSource par1DamageSource)
  {
    this.worldObj.createExplosion(this, this.posX, this.posY, this.posZ, 3.0F, this.worldObj.getGameRules().getGameRuleBooleanValue("mobGriefing"));
    EntityFisher par1 = new EntityFisher(this.worldObj);
    par1.setLocationAndAngles(this.posX, this.posY, this.posZ, 0.0F, 0.0F);
    this.worldObj.spawnEntityInWorld(par1);
    
    setDead();
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
