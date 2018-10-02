package littlebreadloaf.bleach.entities;

import java.util.Random;
import littlebreadloaf.bleach.api.Tools;
import littlebreadloaf.bleach.items.BleachItems;
import net.minecraft.entity.DataWatcher;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAvoidEntity;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITasks;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.ai.attributes.IAttributeInstance;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;


public class EntitySmallHollowLizard
  extends EntityAnimal
{
  private static Random rand = new Random();
  
  public EntitySmallHollowLizard(World par1)
  {
    this(par1, rand.nextInt(7));
  }
  
  public EntitySmallHollowLizard(World par1World, int par2)
  {
    super(par1World);
    setTexture(par2);
    float var3 = 0.55F;
    this.tasks.addTask(0, new EntityAISwimming(this));
    this.tasks.addTask(1, new EntityAIAvoidEntity(this, EntityPlayer.class, 6.0F, 0.550000011920929D, 0.550000011920929D));
    this.tasks.addTask(2, new EntityAIPanic(this, 0.6000000238418579D));
    this.tasks.addTask(4, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
    this.tasks.addTask(5, new EntityAILookIdle(this));
    this.tasks.addTask(7, new EntityAIWander(this, var3));
    setSize(0.9F, 0.2F);
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
    
    getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(10.0D);
  }
  





  protected void dropFewItems(boolean var1, int var2)
  {
    entityDropItem(new ItemStack(BleachItems.reiatsu, 1), 0.0F);
  }
  




  protected int getDropItemId()
  {
    return 0;
  }
  



  public EnumCreatureAttribute getCreatureAttribute()
  {
    return Tools.SPIRIT;
  }
  




  protected String getLivingSound()
  {
    return null;
  }
  



  protected String getHurtSound()
  {
    return "mob.silverfish.hit";
  }
  



  protected String getDeathSound()
  {
    return "mob.bat.death";
  }
  





  protected void fall(float var1) {}
  





  public void initCreature() {}
  




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
  



  public boolean getCanSpawnHere()
  {
    return (this.posY > 65.0D) && (super.getCanSpawnHere());
  }
  

  public EntityAgeable createChild(EntityAgeable entityageable)
  {
    return null;
  }
}
