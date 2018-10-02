package littlebreadloaf.bleach.entities;

import java.util.Random;
import littlebreadloaf.bleach.api.Tools;
import littlebreadloaf.bleach.events.ExtendedPlayer;
import littlebreadloaf.bleach.items.BleachItems;
import net.minecraft.entity.DataWatcher;
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
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class EntityWhole extends EntityMob
{
  private static Random rand = new Random();
  
  public EntityWhole(World par1)
  {
    this(par1, rand.nextInt(10));
  }
  
  public EntityWhole(World par1World, int par2)
  {
    super(par1World);
    setTexture(par2);
    float var3 = 0.38F;
    this.tasks.addTask(0, new EntityAISwimming(this));
    this.tasks.addTask(1, new EntityAIAvoidEntity(this, EntityHollowBat.class, 6.0F, 0.44999998807907104D, 0.44999998807907104D));
    this.tasks.addTask(1, new EntityAIAvoidEntity(this, EntityHollowBlaze.class, 6.0F, 0.44999998807907104D, 0.44999998807907104D));
    this.tasks.addTask(1, new EntityAIAvoidEntity(this, EntityHollowSpider.class, 6.0F, 0.44999998807907104D, 0.44999998807907104D));
    this.tasks.addTask(1, new EntityAIAvoidEntity(this, EntityHollowGolem.class, 6.0F, 0.44999998807907104D, 0.44999998807907104D));
    this.tasks.addTask(1, new EntityAIAvoidEntity(this, EntityHollowSnake.class, 6.0F, 0.44999998807907104D, 0.44999998807907104D));
    this.tasks.addTask(1, new EntityAIAvoidEntity(this, EntityHollowWasp.class, 6.0F, 0.44999998807907104D, 0.44999998807907104D));
    this.tasks.addTask(1, new EntityAIAvoidEntity(this, EntityHollowStalker.class, 6.0F, 0.44999998807907104D, 0.44999998807907104D));
    this.tasks.addTask(1, new EntityAIAvoidEntity(this, EntityHollowWolf.class, 6.0F, 0.44999998807907104D, 0.44999998807907104D));
    this.tasks.addTask(1, new EntityAIAvoidEntity(this, EntityHollowOre.class, 6.0F, 0.44999998807907104D, 0.44999998807907104D));
    this.tasks.addTask(1, new EntityAIAvoidEntity(this, EntityFisher.class, 6.0F, 0.44999998807907104D, 0.44999998807907104D));
    this.tasks.addTask(1, new EntityAIAvoidEntity(this, EntityMenosGrande.class, 6.0F, 0.44999998807907104D, 0.44999998807907104D));
    this.tasks.addTask(2, new EntityAIPanic(this, 0.5D));
    this.tasks.addTask(3, new net.minecraft.entity.ai.EntityAITempt(this, 0.4000000059604645D, BleachItems.zanpakuto, false));
    this.tasks.addTask(4, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
    this.tasks.addTask(5, new EntityAILookIdle(this));
    this.tasks.addTask(6, new EntityAILookIdle(this));
    this.tasks.addTask(7, new EntityAIWander(this, var3));
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
    
    getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(40.0D);
    
    getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(2.0D);
  }
  




  protected void dropFewItems(boolean var1, int var2)
  {
    entityDropItem(new ItemStack(BleachItems.reiatsu, 1), 0.0F);
  }
  






  public EnumCreatureAttribute getCreatureAttribute()
  {
    return Tools.SPIRIT;
  }
  





  public boolean interact(EntityPlayer var1)
  {
    ItemStack var2 = var1.inventory.getCurrentItem();
    
    if ((var2 != null) && (var2.getItem() == BleachItems.zanpakuto))
    {
      if (!this.worldObj.isRemote)
      {
        int var3 = 4 + rand.nextInt(3);
        
        entityDropItem(new ItemStack(BleachItems.reiatsu, var3), 0.0F);
      }
      

      playSound("mob.endermen.portal", 1.0F, 1.0F);
      setDead();
    }
    
    return super.interact(var1);
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
    int randomHollow = rand.nextInt(12);
    
    if ((par1DamageSource.getEntity() instanceof EntityPlayer))
    {
      ExtendedPlayer props = (ExtendedPlayer)this.attackingPlayer.getExtendedProperties("BleachPlayer");
      if (props.getFaction() == 3) {
        props.addSXP(5);
      }
    }
    EntityHollowBat par3 = new EntityHollowBat(this.worldObj);
    EntityHollowBlaze par4 = new EntityHollowBlaze(this.worldObj);
    EntityHollowSpider par5 = new EntityHollowSpider(this.worldObj);
    EntityHollowGolem par6 = new EntityHollowGolem(this.worldObj);
    EntityHollowSnake par7 = new EntityHollowSnake(this.worldObj);
    EntityHollowWasp par8 = new EntityHollowWasp(this.worldObj);
    EntityHollowStalker par9 = new EntityHollowStalker(this.worldObj);
    EntityHollowOre par10 = new EntityHollowOre(this.worldObj);
    EntityHollowWolf par11 = new EntityHollowWolf(this.worldObj);
    
    par3.setLocationAndAngles(this.posX, this.posY, this.posZ, 0.0F, 0.0F);
    par4.setLocationAndAngles(this.posX, this.posY, this.posZ, 0.0F, 0.0F);
    par5.setLocationAndAngles(this.posX, this.posY, this.posZ, 0.0F, 0.0F);
    par6.setLocationAndAngles(this.posX, this.posY, this.posZ, 0.0F, 0.0F);
    par7.setLocationAndAngles(this.posX, this.posY, this.posZ, 0.0F, 0.0F);
    par8.setLocationAndAngles(this.posX, this.posY, this.posZ, 0.0F, 0.0F);
    par9.setLocationAndAngles(this.posX, this.posY, this.posZ, 0.0F, 0.0F);
    par10.setLocationAndAngles(this.posX, this.posY, this.posZ, 0.0F, 0.0F);
    par11.setLocationAndAngles(this.posX, this.posY, this.posZ, 0.0F, 0.0F);
    
    if ((par1DamageSource.getEntity() instanceof EntityHollowBat))
    {

      if (randomHollow == 2)
      {
        this.worldObj.spawnEntityInWorld(par4);
      } else if (randomHollow == 3)
      {
        this.worldObj.spawnEntityInWorld(par5);
      } else if (randomHollow == 4)
      {
        this.worldObj.spawnEntityInWorld(par6);
      } else if (randomHollow == 5)
      {
        this.worldObj.spawnEntityInWorld(par7);
      } else if (randomHollow == 6)
      {
        this.worldObj.spawnEntityInWorld(par8);
      } else if (randomHollow == 7)
      {
        this.worldObj.spawnEntityInWorld(par9);
      } else if (randomHollow == 8)
      {
        this.worldObj.spawnEntityInWorld(par10);
      } else if (randomHollow == 9)
      {
        this.worldObj.spawnEntityInWorld(par11);
      }
    }
    

    if ((par1DamageSource.getEntity() instanceof EntityHollowBlaze))
    {
      if (randomHollow == 1)
      {
        this.worldObj.spawnEntityInWorld(par3);

      }
      else if (randomHollow == 3)
      {
        this.worldObj.spawnEntityInWorld(par5);
      } else if (randomHollow == 4)
      {
        this.worldObj.spawnEntityInWorld(par6);
      } else if (randomHollow == 5)
      {
        this.worldObj.spawnEntityInWorld(par7);
      } else if (randomHollow == 6)
      {
        this.worldObj.spawnEntityInWorld(par8);
      } else if (randomHollow == 7)
      {
        this.worldObj.spawnEntityInWorld(par9);
      } else if (randomHollow == 8)
      {
        this.worldObj.spawnEntityInWorld(par10);
      } else if (randomHollow == 9)
      {
        this.worldObj.spawnEntityInWorld(par11);
      }
    }
    

    if ((par1DamageSource.getEntity() instanceof EntityHollowSpider))
    {
      if (randomHollow == 1)
      {
        this.worldObj.spawnEntityInWorld(par3);
      } else if (randomHollow == 2)
      {
        this.worldObj.spawnEntityInWorld(par4);

      }
      else if (randomHollow == 4)
      {
        this.worldObj.spawnEntityInWorld(par6);
      } else if (randomHollow == 5)
      {
        this.worldObj.spawnEntityInWorld(par7);
      } else if (randomHollow == 6)
      {
        this.worldObj.spawnEntityInWorld(par8);
      } else if (randomHollow == 7)
      {
        this.worldObj.spawnEntityInWorld(par9);
      } else if (randomHollow == 8)
      {
        this.worldObj.spawnEntityInWorld(par10);
      } else if (randomHollow == 9)
      {
        this.worldObj.spawnEntityInWorld(par11);
      }
    }
    

    if ((par1DamageSource.getEntity() instanceof EntityHollowGolem))
    {
      if (randomHollow == 1)
      {
        this.worldObj.spawnEntityInWorld(par3);
      } else if (randomHollow == 2)
      {
        this.worldObj.spawnEntityInWorld(par4);
      } else if (randomHollow == 3)
      {
        this.worldObj.spawnEntityInWorld(par5);

      }
      else if (randomHollow == 5)
      {
        this.worldObj.spawnEntityInWorld(par7);
      } else if (randomHollow == 6)
      {
        this.worldObj.spawnEntityInWorld(par8);
      } else if (randomHollow == 7)
      {
        this.worldObj.spawnEntityInWorld(par9);
      } else if (randomHollow == 8)
      {
        this.worldObj.spawnEntityInWorld(par10);
      } else if (randomHollow == 9)
      {
        this.worldObj.spawnEntityInWorld(par11);
      }
    }
    

    if ((par1DamageSource.getEntity() instanceof EntityHollowSnake))
    {
      if (randomHollow == 1)
      {
        this.worldObj.spawnEntityInWorld(par3);
      } else if (randomHollow == 2)
      {
        this.worldObj.spawnEntityInWorld(par4);
      } else if (randomHollow == 3)
      {
        this.worldObj.spawnEntityInWorld(par5);
      } else if (randomHollow == 4)
      {
        this.worldObj.spawnEntityInWorld(par6);
      } else if (randomHollow == 6)
      {
        this.worldObj.spawnEntityInWorld(par8);
      } else if (randomHollow == 7)
      {
        this.worldObj.spawnEntityInWorld(par9);
      } else if (randomHollow == 8)
      {
        this.worldObj.spawnEntityInWorld(par10);
      } else if (randomHollow == 9)
      {
        this.worldObj.spawnEntityInWorld(par11);
      }
    }
    
    if ((par1DamageSource.getEntity() instanceof EntityHollowWasp))
    {
      if (randomHollow == 1)
      {
        this.worldObj.spawnEntityInWorld(par3);
      } else if (randomHollow == 2)
      {
        this.worldObj.spawnEntityInWorld(par4);
      } else if (randomHollow == 3)
      {
        this.worldObj.spawnEntityInWorld(par5);
      } else if (randomHollow == 4)
      {
        this.worldObj.spawnEntityInWorld(par6);
      } else if (randomHollow == 6)
      {
        this.worldObj.spawnEntityInWorld(par7);
      } else if (randomHollow == 7)
      {
        this.worldObj.spawnEntityInWorld(par9);
      } else if (randomHollow == 8)
      {
        this.worldObj.spawnEntityInWorld(par10);
      } else if (randomHollow == 9)
      {
        this.worldObj.spawnEntityInWorld(par11);
      }
    }
    
    if ((par1DamageSource.getEntity() instanceof EntityHollowStalker))
    {
      if (randomHollow == 1)
      {
        this.worldObj.spawnEntityInWorld(par3);
      } else if (randomHollow == 2)
      {
        this.worldObj.spawnEntityInWorld(par4);
      } else if (randomHollow == 3)
      {
        this.worldObj.spawnEntityInWorld(par5);
      } else if (randomHollow == 4)
      {
        this.worldObj.spawnEntityInWorld(par6);
      } else if (randomHollow == 6)
      {
        this.worldObj.spawnEntityInWorld(par7);
      } else if (randomHollow == 7)
      {
        this.worldObj.spawnEntityInWorld(par8);
      } else if (randomHollow == 8)
      {
        this.worldObj.spawnEntityInWorld(par10);
      } else if (randomHollow == 9)
      {
        this.worldObj.spawnEntityInWorld(par11);
      }
    }
    

    if ((par1DamageSource.getEntity() instanceof EntityHollowOre))
    {
      if (randomHollow == 1)
      {
        this.worldObj.spawnEntityInWorld(par3);
      } else if (randomHollow == 2)
      {
        this.worldObj.spawnEntityInWorld(par4);
      } else if (randomHollow == 3)
      {
        this.worldObj.spawnEntityInWorld(par5);
      } else if (randomHollow == 4)
      {
        this.worldObj.spawnEntityInWorld(par6);
      } else if (randomHollow == 6)
      {
        this.worldObj.spawnEntityInWorld(par7);
      } else if (randomHollow == 7)
      {
        this.worldObj.spawnEntityInWorld(par8);
      } else if (randomHollow == 8)
      {
        this.worldObj.spawnEntityInWorld(par9);
      } else if (randomHollow == 9)
      {
        this.worldObj.spawnEntityInWorld(par11);
      }
    }
    

    if ((par1DamageSource.getEntity() instanceof EntityHollowWolf))
    {
      if (randomHollow == 1)
      {
        this.worldObj.spawnEntityInWorld(par3);
      } else if (randomHollow == 2)
      {
        this.worldObj.spawnEntityInWorld(par4);
      } else if (randomHollow == 3)
      {
        this.worldObj.spawnEntityInWorld(par5);
      } else if (randomHollow == 4)
      {
        this.worldObj.spawnEntityInWorld(par6);
      } else if (randomHollow == 6)
      {
        this.worldObj.spawnEntityInWorld(par7);
      } else if (randomHollow == 7)
      {
        this.worldObj.spawnEntityInWorld(par8);
      } else if (randomHollow == 8)
      {
        this.worldObj.spawnEntityInWorld(par9);
      } else if (randomHollow == 9)
      {
        this.worldObj.spawnEntityInWorld(par10);
      }
    }
    

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
