package littlebreadloaf.bleach.events;

import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.ArrayList;
import java.util.Random;
import littlebreadloaf.bleach.BleachMod;
import littlebreadloaf.bleach.api.Tools;
import littlebreadloaf.bleach.armor.Armor;
import littlebreadloaf.bleach.blocks.BleachBlocks;
import littlebreadloaf.bleach.entities.EntityCero;
import littlebreadloaf.bleach.entities.EntityDecoy;
import littlebreadloaf.bleach.entities.EntityHollowOre;
import littlebreadloaf.bleach.entities.EntityWhole;
import littlebreadloaf.bleach.items.BleachItems;
import littlebreadloaf.bleach.items.shikai.ItemShikai;
import littlebreadloaf.bleach.network.CeroMessage;
import littlebreadloaf.bleach.network.ParticleMessage;
import littlebreadloaf.bleach.network.ServerSyncMessage;
import littlebreadloaf.bleach.proxies.CommonProxy;
import littlebreadloaf.bleach.tiles.TileSeeleSchneider;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.entity.player.PlayerCapabilities;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.util.DamageSource;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.EntityEvent.EntityConstructing;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.living.LivingEvent.LivingJumpEvent;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;
import net.minecraftforge.event.entity.living.LivingFallEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.event.entity.player.EntityInteractEvent;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.Action;

public class BleachEvents
{
  public static CommonProxy proxy = new CommonProxy();
  Random rand = new Random();
  EntityPlayer myPlayer = null;
  
  @SubscribeEvent
  public void onEntityConstructing(EntityEvent.EntityConstructing event)
  {
    if (((event.entity instanceof EntityPlayer)) && (event.entity.getExtendedProperties("BleachPlayer") == null))
    {

      this.myPlayer = ((EntityPlayer)event.entity);
      ExtendedPlayer.register((EntityPlayer)event.entity);
    }
  }
  











  @SubscribeEvent
  public void onEntityJoinWorld(EntityJoinWorldEvent event)
  {
    if ((event.entity instanceof EntityPlayer))
    {

      EntityPlayer player = (EntityPlayer)event.entity;
      ExtendedPlayer props = ExtendedPlayer.get(player);
      if (!event.world.isRemote)
        ExtendedPlayer.loadProxyData(player);
      if (props.getFaction() == 0)
      {
        if (!player.worldObj.isRemote)
        {
          player.inventory.addItemStackToInventory(new ItemStack(BleachItems.factionSelect, 1));
          props.replenishEnergy(1);
          if (props.getZTex() == 5)
          {
            props.randomTexture();
          }
        }
      }
    }
    













    if (((event.entity instanceof EntityWhole)) || ((event.entity instanceof EntityDecoy)))
    {
      event.entity.setCurrentItemOrArmor(2, new ItemStack(Armor.SoulChain, 1));
    }
  }
  





  @SubscribeEvent
  public void onLivingDeathEvent(LivingDeathEvent event)
  {
    if ((event.entity instanceof EntityPlayer))
    {
      EntityPlayer player = (EntityPlayer)event.entity;
      if (!event.entity.worldObj.isRemote)
      {

        ExtendedPlayer.saveProxyData(player);
      }
    }
  }
  



  private int replenishTimer = 100;
  

  @SideOnly(Side.CLIENT)
  @SubscribeEvent
  public void onLivingUpdateEvent(LivingEvent.LivingUpdateEvent event)
  {
    if (!event.entity.worldObj.isRemote)
    {
      if (isEntityInCube(event.entity))
      {
        FMLLog.info("[Bleach mod] event", new Object[0]);
        event.entity.motionX = 0.0D;
        event.entity.motionZ = 0.0D;
        if (event.entity.motionY > 0.0D) { event.entity.motionY = 0.0D;
        }
      }
      
      if ((event.entityLiving instanceof EntityPlayer))
      {
        EntityPlayer player = (EntityPlayer)event.entityLiving;
        ExtendedPlayer props = ExtendedPlayer.get(player);
        
        this.replenishTimer -= 1;
        
        if (props.getCeroCharge() > 0)
        {
          props.addCeroCharge(1);
          if (props.getCeroCharge() >= 40)
          {
            props.setCeroCharge(0);
            EntityCero entityCero = new EntityCero(player.worldObj, player, 2.0F);
            if (!player.worldObj.isRemote)
            {
              player.worldObj.spawnEntityInWorld(entityCero);
              BleachMod.network.sendToServer(new CeroMessage(2));
            }
          }
        }
        



        player.capabilities.setPlayerWalkSpeed(0.1F + (float)(props.getCurrentCap() * (7.0E-5D * props.getCurrentEnergy())));
        


        if (this.replenishTimer <= 0)
        {

          props.replenishEnergy((int)(2.5D * (1.0D + 0.001D * props.getCurrentCap())));
          
          BleachMod.network.sendToAll(new ServerSyncMessage(player));
          this.replenishTimer = 100;
        }
      }
    }
  }
  










  @SubscribeEvent
  public void onLivingJumpEvent(LivingEvent.LivingJumpEvent event)
  {
    if ((event.entityLiving instanceof EntityPlayer))
    {
      EntityPlayer player = (EntityPlayer)event.entityLiving;
      ExtendedPlayer props = (ExtendedPlayer)player.getExtendedProperties("BleachPlayer");
      event.entityLiving.motionY += props.getCurrentCap() * (5.0E-4D * props.getCurrentEnergy());
    }
  }
  

  @SubscribeEvent
  public void onLivingFallEvent(LivingFallEvent event)
  {
    if ((event.entityLiving instanceof EntityPlayer))
    {
      EntityPlayer player = (EntityPlayer)event.entityLiving;
      ExtendedPlayer props = (ExtendedPlayer)player.getExtendedProperties("BleachPlayer"); LivingFallEvent 
      
        tmp29_28 = event;tmp29_28.distance = ((float)(tmp29_28.distance - props.getCurrentCap() * (0.02D * props.getCurrentEnergy())));
      
      if ((props.getFaction() == 3) && (props.getBack() == 3))
      {
        event.setCanceled(true);
      }
      if ((props.getFaction() == 3) && (props.getLegs() == 3) && (player.isCollidedHorizontally))
      {
        event.setCanceled(true);
      }
    }
  }
  

  @SubscribeEvent
  public void onItemPickup(EntityItemPickupEvent event)
  {
    if (event.item.getEntityItem().getItem().equals(BleachItems.heart))
    {
      if (event.entityPlayer != null)
      {
        event.entityPlayer.heal(8.0F);
        for (int i = 0; i < 5; i++)
        {


          BleachMod.network.sendToAll(new ParticleMessage(4, (int)event.entityPlayer.posX, (int)event.entityPlayer.posY, (int)event.entityPlayer.posZ));
        }
        
        event.item.setDead();
        event.setCanceled(true);
      }
    }
  }
  






  @SubscribeEvent
  public void onLivingHurtEvent(LivingHurtEvent event)
  {
    if ((event.source.getEntity() != null) && ((event.source.getEntity() instanceof EntityPlayer)))
    {
      EntityPlayer thePlayer = (EntityPlayer)event.source.getEntity();
      ExtendedPlayer props = ExtendedPlayer.get(thePlayer);
      
      if ((props.getFaction() == 3) && (props.getArms() == 1))
      {
        double moveX = event.entity.posX - thePlayer.posX;
        double moveY = event.entity.posY - thePlayer.posY;
        double moveZ = event.entity.posZ - thePlayer.posZ;
        double angle = Math.atan2(moveZ, moveX);
        
        moveX = Math.cos(angle);
        moveZ = Math.sin(angle);
        moveY = 0.5D;
        event.entity.addVelocity(moveX, moveY, moveZ);
      }
    }
    if ((event.entityLiving instanceof EntityPlayer))
    {

      EntityPlayer player = (EntityPlayer)event.entityLiving;
      ExtendedPlayer props = ExtendedPlayer.get(player);
      ItemStack heldItem = player.getCurrentEquippedItem();
      
      ItemStack var9 = player.getEquipmentInSlot(1);
      ItemStack var10 = player.getEquipmentInSlot(2);
      ItemStack var11 = player.getEquipmentInSlot(3);
      

      if (heldItem != null)
      {
        if (heldItem.getItem() == BleachItems.shikaipoison)
        {
          if ((event.source.getEntity() instanceof EntityLivingBase))
          {
            EntityLivingBase var5 = (EntityLivingBase)event.source.getEntity();
            var5.addPotionEffect(new PotionEffect(Potion.poison.id, 80, 0));
          }
        }
      }
      
      if (props.getFaction() == 3)
      {
        if ((event.source.getEntity() instanceof EntityLivingBase))
        {
          EntityLivingBase hurter = (EntityLivingBase)event.source.getEntity();
          if (props.getBack() == 2)
          {

            hurter.attackEntityFrom(DamageSource.generic, 0.5F);
          }
        }
      }
      







      if ((var9 != null) && (var10 != null) && (var11 != null))
      {



        if (((var9.getItem() == Armor.Sandals) && (var10.getItem() == Armor.ShiniPants) && (var11.getItem() == Armor.ShiniRobe)) || ((var9.getItem() == Armor.QuincyShoes) && (var10.getItem() == Armor.QuincyPants) && (var11.getItem() == Armor.QuincyRobe)) || ((var9.getItem() == Armor.ArrancarShoes) && (var10.getItem() == Armor.ArrancarPants) && (var11.getItem() == Armor.ArrancarJacket)))
        {



          if (heldItem != null)
          {
            if ((heldItem.getItem() instanceof ItemShikai))
            {

              if ((props.getCurrentEnergy() * props.getCurrentCap() > event.ammount) && (player.isBlocking()))
              {

                props.consumeEnergy((int)event.ammount);
                event.setCanceled(true);
              }
              else if (props.getCurrentEnergy() * props.getCurrentCap() > event.ammount * 4.0F)
              {
                props.consumeEnergy((int)(event.ammount * 4.0F));
                event.setCanceled(true);
              }
              
            }
            else if (props.getCurrentEnergy() * props.getCurrentCap() > event.ammount * 6.0F)
            {
              props.consumeEnergy((int)(event.ammount * 6.0F));
              event.setCanceled(true);


            }
            


          }
          else if (props.getCurrentEnergy() * props.getCurrentCap() > event.ammount * 6.0F)
          {
            props.consumeEnergy((int)(event.ammount * 6.0F));
            event.setCanceled(true);
          }
        }
      }
    }
    











    if ((event.entityLiving instanceof EntityHollowOre))
    {
      if (event.source.equals(DamageSource.inWall))
      {
        event.setCanceled(true);
      }
    }
    
    if (((event.entityLiving instanceof EntityLivingBase)) && ((event.source.getEntity() instanceof EntityPlayer)))
    {
      ExtendedPlayer props = ExtendedPlayer.get((EntityPlayer)event.source.getEntity());
      if ((props.getFaction() == 3) && (((EntityPlayer)event.source.getEntity()).getHeldItem() == null))
      {
        EntityLivingBase var5 = event.entityLiving;
        if (var5.getCreatureAttribute() == Tools.SPIRIT) {
          props.addSXP(3);
        } else if (this.rand.nextInt(4) == 0) {
          props.addSXP(1);
        }
        

        int extraAmount = (int)(props.getCurrentEnergy() * props.getCurrentCap() / 100.0F);
        
        if (props.getArms() == 1)
          extraAmount += 2;
        var5.attackEntityFrom(DamageSource.generic, extraAmount / 2.0F);
        
        if (props.getTail() == 3)
        {
          var5.addPotionEffect(new PotionEffect(Potion.poison.id, 80, 0));
        }
        if (props.getTail() != 3) {}
      }
    }
  }
  



































  @SubscribeEvent
  public void onEntityInteractEvent(EntityInteractEvent event)
  {
    if (event.entityPlayer != null)
    {
      ExtendedPlayer props = (ExtendedPlayer)event.entityPlayer.getExtendedProperties("BleachPlayer");
      
      if ((event.entityPlayer.getCurrentEquippedItem() != null) && (event.entityPlayer.getCurrentEquippedItem().getItem() == BleachItems.shikaiheal))
      {
        if ((event.target instanceof EntityLiving))
        {
          EntityLiving theTarget = (EntityLiving)event.target;
          if (theTarget.getCreatureAttribute() != EnumCreatureAttribute.UNDEAD)
          {


            if (theTarget.getHealth() < theTarget.getMaxHealth())
            {
              theTarget.heal(2.0F);
              for (int i = 0; i < 5; i++)
              {

                BleachMod.network.sendToAll(new ParticleMessage(4, (int)theTarget.posX, (int)theTarget.posY, (int)theTarget.posZ));
              }
              
              if (!event.entityPlayer.worldObj.isRemote)
                props.consumeEnergy(5);
            }
          }
        }
      }
    }
  }
  
  @SubscribeEvent
  public void onPlayerInteractEvent(PlayerInteractEvent event) {
    ExtendedPlayer props = ExtendedPlayer.get(event.entityPlayer);
    Vec3 look = event.entityPlayer.getLook(1.0F);
    

























    if (event.entityPlayer.worldObj.getBlock(event.x, event.y, event.z) == BleachBlocks.hollowdiamond)
    {
      if (event.action.equals(PlayerInteractEvent.Action.LEFT_CLICK_BLOCK))
      {

        EntityHollowOre var18 = new EntityHollowOre(event.entityPlayer.worldObj, 2);
        
        int var10 = event.x;
        int var11 = event.y;
        int var12 = event.z;
        
        var18.setLocationAndAngles(var10, var11, var12, 0.0F, 0.0F);
        

        event.entityPlayer.worldObj.createExplosion(null, event.x, event.y, event.z, 1.0F, true);
        for (int i = -2; i <= 2; i++)
        {
          for (int j = -2; j <= 2; j++)
          {
            for (int k = -2; k <= 2; k++)
            {
              if (event.entityPlayer.worldObj.getBlock(event.x + i, event.y + k, event.z + j) != net.minecraft.init.Blocks.bedrock)
              {
                event.entityPlayer.worldObj.setBlockToAir(event.x + i, event.y + k, event.z + j);
              }
            }
          }
        }
        event.entityPlayer.worldObj.spawnEntityInWorld(var18);
        event.entityPlayer.worldObj.playSoundAtEntity(var18, "bleach:ore_hollow", 1.4F, 1.0F);
      }
    }
    
    if (event.entityPlayer.worldObj.getBlock(event.x, event.y, event.z) == BleachBlocks.hollowemerald)
    {
      if (event.action.equals(PlayerInteractEvent.Action.LEFT_CLICK_BLOCK))
      {

        EntityHollowOre var18 = new EntityHollowOre(event.entityPlayer.worldObj, 1);
        
        int var10 = event.x;
        int var11 = event.y;
        int var12 = event.z;
        
        var18.setLocationAndAngles(var10, var11, var12, 0.0F, 0.0F);
        

        event.entityPlayer.worldObj.createExplosion(null, event.x, event.y, event.z, 1.0F, true);
        for (int i = -2; i <= 2; i++)
        {
          for (int j = -2; j <= 2; j++)
          {
            for (int k = -2; k <= 2; k++)
            {
              event.entityPlayer.worldObj.setBlockToAir(event.x + i, event.y + k, event.z + j);
            }
          }
        }
        event.entityPlayer.worldObj.spawnEntityInWorld(var18);
        event.entityPlayer.worldObj.playSoundAtEntity(var18, "bleach:ore_hollow", 1.4F, 1.0F);
      }
    }
    if (event.entityPlayer.worldObj.getBlock(event.x, event.y, event.z) == BleachBlocks.hollowgold)
    {
      if (event.action.equals(PlayerInteractEvent.Action.LEFT_CLICK_BLOCK))
      {

        EntityHollowOre var18 = new EntityHollowOre(event.entityPlayer.worldObj, 0);
        
        int var10 = event.x;
        int var11 = event.y;
        int var12 = event.z;
        
        var18.setLocationAndAngles(var10, var11, var12, 0.0F, 0.0F);
        

        event.entityPlayer.worldObj.createExplosion(null, event.x, event.y, event.z, 1.0F, true);
        for (int i = -2; i <= 2; i++)
        {
          for (int j = -2; j <= 2; j++)
          {
            for (int k = -2; k <= 2; k++)
            {
              event.entityPlayer.worldObj.setBlockToAir(event.x + i, event.y + k, event.z + j);
            }
          }
        }
        event.entityPlayer.worldObj.spawnEntityInWorld(var18);
        event.entityPlayer.worldObj.playSoundAtEntity(var18, "bleach:ore_hollow", 1.4F, 1.0F);
      }
    }
  }
  




  private boolean isEntityInCube(Entity entity)
  {
    for (int i = 0; i < TileSeeleSchneider.magicSquare.size(); i++)
    {
      int x = ((ChunkCoordinates)TileSeeleSchneider.magicSquare.get(i)).posX;
      int y = ((ChunkCoordinates)TileSeeleSchneider.magicSquare.get(i)).posY;
      int z = ((ChunkCoordinates)TileSeeleSchneider.magicSquare.get(i)).posZ;
      
      TileSeeleSchneider tile = (TileSeeleSchneider)entity.worldObj.getTileEntity(x, y, z);
      if (tile == null)
      {
        TileSeeleSchneider.magicSquare.remove(i);
        return false;
      }
      int side = tile.side;
      
      if ((entity.posX > x + 0.5F) && (entity.posX < x + side - 0.5F) && (entity.posZ > z + 0.5F) && (entity.posZ < z + side - 0.5F) && (entity.posY >= y))
      {


        return true;
      }
    }
    
    return false;
  }
}
