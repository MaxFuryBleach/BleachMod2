package littlebreadloaf.bleach.events;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent.PlayerTickEvent;
import java.util.List;
import littlebreadloaf.bleach.api.Tools;
import littlebreadloaf.bleach.items.BleachItems;
import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovementInput;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class BleachPlayerTickHandler
{
  private int armorBonus = 3;
  
  private boolean countPoints = true;
  
  private int flapCountdown = 23;
  private int flapsLeft = 4;
  
  private int healTimer = 300;
  
  @SubscribeEvent
  public void onPlayerTick(TickEvent.PlayerTickEvent event)
  {
    EntityPlayer player = event.player;
    ExtendedPlayer props = (ExtendedPlayer)player.getExtendedProperties("BleachPlayer");
    
    ItemStack chest = player.getCurrentArmor(3);
    ItemStack legs = player.getCurrentArmor(2);
    ItemStack shoes = player.getCurrentArmor(1);
    

    if ((props.getFaction() == 3) && (props.getHead() == 3))
    {
      this.healTimer -= 1;
      if ((this.healTimer <= 0) && (!player.worldObj.isRemote))
      {
        player.heal(1.0F);
        this.healTimer = 300;
      }
    }
    if ((props.getFaction() == 3) && (props.getLegs() == 1))
      player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 1, 0));
    if ((props.getFaction() == 3) && (props.getLegs() == 2) && (player.isSneaking()))
      player.motionX = (player.motionZ = 0.0D);
    if ((props.getFaction() == 3) && (props.getArms() == 3))
      player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 1, 0));
    if ((props.getFaction() == 3) && (props.getBack() == 1))
      player.addPotionEffect(new PotionEffect(Potion.resistance.id, 1, 0));
    if ((props.getFaction() == 3) && (props.getTail() == 2) && (player.isInWater())) {
      player.moveFlying(player.moveStrafing, player.moveForward, 0.01F + props.getCurrentEnergy() * props.getCurrentCap() / 10000.0F);
    }
    
    for (int j = -1; j <= 1; j++)
    {
      for (int k = -1; k <= 1; k++)
      {
        if ((player.worldObj.getBlock((int)player.posX, (int)(player.posY + j), (int)(player.posZ + k)) != Blocks.air) && (!props.getValidFlash()))
        {
          props.setValidFlash(true);
        }
      }
    }
    

    if ((!player.onGround) && (player.isSneaking()) && (player.getCurrentEquippedItem() != null) && (player.getCurrentEquippedItem().getItem() == BleachItems.shikaiwind))
    {
      player.motionY = (-0.3D + props.getCurrentEnergy() * props.getCurrentCap() / 10000.0F);
      player.moveFlying(player.moveStrafing, player.moveForward, 0.12F + props.getCurrentEnergy() * props.getCurrentCap() / 10000.0F);
    }
    

    if ((props.getFaction() == 3) && (props.getTail() == 1))
    {
      Vec3 normalizer = Vec3.createVectorHelper(1.0D, 1.0D, 1.0D).normalize();
      List list = player.worldObj.getEntitiesWithinAABBExcludingEntity(player, player.boundingBox.copy().expand(Math.abs(normalizer.xCoord * 25.0D), Math.abs(normalizer.yCoord * 25.0D), Math.abs(normalizer.zCoord * 25.0D)));
      int number = 0;
      for (int l = 0; l < list.size(); l++)
      {
        Entity entity1 = (Entity)list.get(l);
        
        if ((entity1 instanceof EntityLivingBase))
        {
          if (((EntityLivingBase)entity1).getCreatureAttribute() == Tools.SPIRIT)
          {
            number++;
          }
        }
      }
      
      if (number >= 5) {
        player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 0, 1));
      } else if (number >= 2) {
        player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 0, 0));
      }
    }
    if ((props.getFaction() == 3) && (props.getHead() == 2) && (player.isSprinting()))
    {
      Vec3 normalizer = Vec3.createVectorHelper(0.008D, 0.008D, 0.008D).normalize();
      List list = player.worldObj.getEntitiesWithinAABBExcludingEntity(player, player.boundingBox.copy().expand(Math.abs(normalizer.xCoord * 0.5D), Math.abs(normalizer.yCoord * 0.5D), Math.abs(normalizer.zCoord * 0.5D)));
      for (int l = 0; l < list.size(); l++)
      {
        Entity entity1 = (Entity)list.get(l);
        
        if ((entity1 instanceof EntityLivingBase))
        {
          double moveX = entity1.posX - player.posX;
          double moveY = entity1.posY - player.posY;
          double moveZ = entity1.posZ - player.posZ;
          double angle = Math.atan2(moveZ, moveX);
          
          moveX = 0.8D * Math.cos(angle);
          moveZ = 0.8D * Math.sin(angle);
          moveY = 0.5D;
          entity1.addVelocity(moveX, moveY, moveZ);
          
          ((EntityLivingBase)entity1).attackEntityFrom(DamageSource.generic, 1.0F);
        }
      }
    }
    


    if ((player instanceof EntityClientPlayerMP))
    {

      EntityClientPlayerMP SPPlayer = (EntityClientPlayerMP)player;
      if (this.flapCountdown > 0) {
        this.flapCountdown -= 1;
      }
      if ((!player.onGround) && (props.getFaction() == 3) && (props.getBack() == 3))
      {
        if ((SPPlayer.movementInput.jump) && (this.flapCountdown <= 0) && (this.flapsLeft > 0))
        {
          this.flapCountdown = 23;
          player.motionY = 0.800000011920929D;
          this.flapsLeft -= 1;
        }
        if ((player.motionY <= -0.6D) && (!player.isSneaking())) {
          player.motionY = -0.6000000238418579D;
        }
        player.moveFlying(player.moveStrafing, player.moveForward, 0.02F);
      }
      

      if ((player.isCollidedHorizontally) && (props.getFaction() == 3) && (props.getLegs() == 3))
      {
        if (SPPlayer.movementInput.moveForward > 0.0F)
        {
          player.motionY = 0.20000000298023224D;
        }
      }
    }
    

    if (player.onGround)
    {
      this.flapsLeft = 4;
    }
    











    if (props.getCurrentCap() < 50)
    {
      props.setCapMin();
    }
    if (props.getCurrentCap() > 1000)
    {
      props.setCapMax();
    }
    if (props.getCurrentSXP() >= 1.0D)
    {
      props.addCap();
    }
    
    props.balanceTotal();
    




    if (props.getPoints(1) < 0)
    {
      props.setPoints(1, 0);

    }
    else if (props.getPoints(2) < 0)
    {
      props.setPoints(2, 0);


    }
    else if (props.getPoints(3) < 0)
    {
      props.setPoints(3, 0);

    }
    else if (props.getPoints(4) < 0)
    {
      props.setPoints(4, 0);


    }
    else if (props.getPoints(5) < 0)
    {
      props.setPoints(5, 0);


    }
    else if (props.getPoints(6) < 0)
    {
      props.setPoints(6, 0);


    }
    else if (props.getPoints(7) < 0)
    {
      props.setPoints(7, 0);


    }
    else if (props.getPoints(8) < 0)
    {
      props.setPoints(8, 0);
    }
  }
}
