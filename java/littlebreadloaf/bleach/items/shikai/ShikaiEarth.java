package littlebreadloaf.bleach.items.shikai;

import com.google.common.collect.Multimap;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import java.util.Random;
import littlebreadloaf.bleach.BleachMod;
import littlebreadloaf.bleach.Names;
import littlebreadloaf.bleach.api.Tools;
import littlebreadloaf.bleach.armor.Armor;
import littlebreadloaf.bleach.events.ExtendedPlayer;
import littlebreadloaf.bleach.items.BleachItems;
import littlebreadloaf.bleach.network.ParticleMessage;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.IAttribute;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.util.IIcon;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;


public class ShikaiEarth
  extends ItemShikai
{
  public static IIcon[] icons;
  private static final String[] ICON = Names.ShikaiEarth_UnlocalizedName;
  
  private float weaponDamage;
  private final Item.ToolMaterial toolMaterial;
  public float damageBoost = 0.0F;
  public float robeboost = 0.0F;
  public float pantboost = 0.0F;
  public float sandalboost = 0.0F;
  public float waspboost = 0.0F;
  
  Random rand = new Random();
  
  public ShikaiEarth(Item.ToolMaterial material)
  {
    super(material);
    this.toolMaterial = material;
    this.maxStackSize = 1;
    setMaxDamage(material.getMaxUses());
    setCreativeTab(null);
    setHasSubtypes(true);
    this.weaponDamage = (7.0F + material.getDamageVsEntity());
  }
  

  @SideOnly(Side.CLIENT)
  public void addInformation(ItemStack itemStack, EntityPlayer player, List data, boolean b)
  {
    if (itemStack.getItemDamage() == 3)
    {
      data.add("BrandonKgp13");
    }
  }
  

  public String getUnlocalizedName(ItemStack itemstack)
  {
    return Names.ShikaiEarth_UnlocalizedName[itemstack.getItemDamage()];
  }
  
  public float getDamage()
  {
    return this.weaponDamage;
  }
  


  @SideOnly(Side.CLIENT)
  public IIcon getIconFromDamage(int damage)
  {
    return icons[damage];
  }
  

  @SideOnly(Side.CLIENT)
  public void registerIcons(IIconRegister icon)
  {
    icons = new IIcon[ICON.length];
    
    for (int i = 0; i < icons.length; i++)
    {
      icons[i] = icon.registerIcon("bleach".toLowerCase() + ":" + ICON[i]);
    }
  }
  










  public float func_150931_i()
  {
    return this.toolMaterial.getDamageVsEntity();
  }
  





  public boolean hitEntity(ItemStack par1ItemStack, EntityLivingBase par2EntityLivingBase, EntityLivingBase par3EntityLivingBase)
  {
    EntityPlayer player = (EntityPlayer)par3EntityLivingBase;
    ExtendedPlayer props = (ExtendedPlayer)player.getExtendedProperties("BleachPlayer");
    
    ItemStack var9 = player.inventory.armorInventory[0];
    ItemStack var10 = player.inventory.armorInventory[1];
    ItemStack var11 = player.inventory.armorInventory[2];
    ItemStack var7 = player.inventory.armorInventory[3];
    

    if ((var9 != null) && ((var9.getItem() == Armor.Sandals) || (var9.getItem() == Armor.ArrancarShoes)))
    {
      this.sandalboost = 1.0F;
    }
    else if ((var9 != null) && (var9.getItem() == Armor.QuincyShoes))
    {
      this.sandalboost = -1.0F;
    }
    else
    {
      this.sandalboost = 0.0F;
    }
    

    if ((var10 != null) && ((var10.getItem() == Armor.ShiniPants) || (var10.getItem() == Armor.ArrancarPants)))
    {
      this.pantboost = 2.0F;
    }
    else if ((var10 != null) && (var10.getItem() == Armor.QuincyPants))
    {
      this.pantboost = -1.0F;
    }
    else
    {
      this.pantboost = 0.0F;
    }
    

    if ((var11 != null) && ((var11.getItem() == Armor.ShiniRobe) || (var11.getItem() == Armor.ArrancarPants)))
    {
      this.robeboost = 3.0F;
    }
    else if ((var11 != null) && (var11.getItem() == Armor.QuincyRobe))
    {
      this.robeboost = -2.0F;
    }
    else
    {
      this.robeboost = 0.0F;
    }
    if (!player.worldObj.isRemote)
    {
      par2EntityLivingBase.addVelocity(player.motionX * 52.8D * 0.7000000238418579D, 0.1D, player.motionZ * 52.8D * 0.7000000238418579D);
      par2EntityLivingBase.motionY += 0.2000000059604645D;
    }
    

    if (par2EntityLivingBase.getCreatureAttribute() == Tools.SPIRIT)
    {
      if ((!player.worldObj.isRemote) && (props.getFaction() == 1))
      {
        props.addSXP(5);
      }
      this.damageBoost = 2.0F;
    }
    else
    {
      if ((!player.worldObj.isRemote) && (props.getFaction() == 1))
      {
        props.addSXP(2);
      }
      this.damageBoost = 0.0F;
    }
    float damage = this.damageBoost + this.sandalboost + this.pantboost + this.robeboost;
    if ((damage > 0.0F) && (props.getFaction() == 1) && (damage <= par2EntityLivingBase.getHealth()))
    {
      par2EntityLivingBase.attackEntityFrom(DamageSource.generic, damage);
    }
    
    return true;
  }
  







  @SideOnly(Side.CLIENT)
  public boolean isFull3D()
  {
    return true;
  }
  




  public EnumAction getItemUseAction(ItemStack par1ItemStack)
  {
    return EnumAction.block;
  }
  




  public int getMaxItemUseDuration(ItemStack par1ItemStack)
  {
    return 72000;
  }
  




  public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
  {
    par3EntityPlayer.setItemInUse(par1ItemStack, getMaxItemUseDuration(par1ItemStack));
    
    return par1ItemStack;
  }
  





  public int getItemEnchantability()
  {
    return this.toolMaterial.getEnchantability();
  }
  




  public String getToolMaterialName()
  {
    return this.toolMaterial.toString();
  }
  



  public Multimap getItemAttributeModifiers()
  {
    float damage = getDamage();
    Multimap multimap = super.getItemAttributeModifiers();
    multimap.put(SharedMonsterAttributes.attackDamage.getAttributeUnlocalizedName(), new AttributeModifier(field_111210_e, "Weapon modifier", damage, 0));
    return multimap;
  }
  


  int ringTimer = 3;
  int shockwaveRing = 0;
  int shockwaveMax = 5;
  
  int Xpos;
  int Ypos;
  int Zpos;
  
  public void onPlayerStoppedUsing(ItemStack var1, World var2, EntityPlayer var3, int var4)
  {
    ExtendedPlayer props = (ExtendedPlayer)var3.getExtendedProperties("BleachPlayer");
    int var6 = getMaxItemUseDuration(var1) - var4;
    float var7 = var6 / 20.0F;
    var7 = (var7 * var7 + var7 * 2.0F) / 3.0F;
    
    var3.swingItem();
    if (var7 < 0.1D)
    {
      return;
    }
    
    if (var7 > 1.0F)
    {
      if (var7 > 3.0F)
      {
        var7 = 3.0F;
      }
      
      if ((!var2.isRemote) && (var2.getBlock((int)var3.posX, (int)var3.posY - 1, (int)var3.posZ) != Blocks.air))
      {
        this.shockwaveRing = 1;
        this.shockwaveMax = (5 + (int)var7);
        this.Xpos = ((int)var3.posX);
        this.Ypos = ((int)var3.posY);
        this.Zpos = ((int)var3.posZ);
        Vec3 normalizer = Vec3.createVectorHelper(0.008D, 0.008D, 0.008D).normalize();
        List list = var2.getEntitiesWithinAABBExcludingEntity(var3, var3.boundingBox.copy().expand(Math.abs(normalizer.xCoord * 3.0D) + 3.0D, Math.abs(normalizer.yCoord * 3.0D) + 3.0D, Math.abs(normalizer.zCoord * 3.0D) - 3.0D + this.shockwaveMax));
        for (int l = 0; l < list.size(); l++)
        {
          Entity entity1 = (Entity)list.get(l);
          
          if ((entity1 instanceof EntityLivingBase))
          {
            double moveX = entity1.posX - var3.posX;
            double moveY = entity1.posY - var3.posY;
            double moveZ = entity1.posZ - var3.posZ;
            double angle = Math.atan2(moveZ, moveX);
            
            moveX = 0.4D * Math.cos(angle);
            moveZ = 0.4D * Math.sin(angle);
            moveY = 0.30000001192092896D;
            entity1.addVelocity(moveX, moveY, moveZ);
            
            ((EntityLivingBase)entity1).attackEntityFrom(DamageSource.generic, 6.0F);
          }
        }
        

        props.consumeEnergy(20);
      }
    }
  }
  





  public boolean isBookEnchantable(ItemStack itemstack1, ItemStack itemstack2)
  {
    return false;
  }
  
  int shikaiTimer = 40;
  




  public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5)
  {
    if ((par3Entity instanceof EntityPlayer))
    {
      if (this.shockwaveRing > 0)
      {
        this.ringTimer -= 1;
        for (int i = -this.shockwaveRing; i < this.shockwaveRing; i++)
        {
          for (int k = -this.shockwaveRing; k < this.shockwaveRing; k++)
          {
            if (Math.ceil(par3Entity.getDistance(par3Entity.posX + i, par3Entity.posY, par3Entity.posZ + k)) == this.shockwaveRing)
            {
              BleachMod.network.sendToAll(new ParticleMessage(2, this.Xpos + i, this.Ypos, this.Zpos + k));
            }
          }
        }
        if (this.ringTimer <= 0)
        {
          this.shockwaveRing += 1;
          this.ringTimer = (2 + this.shockwaveRing);
        }
        if (this.shockwaveRing > this.shockwaveMax)
          this.shockwaveRing = 0;
      }
      EntityPlayer player = (EntityPlayer)par3Entity;
      ExtendedPlayer props = (ExtendedPlayer)player.getExtendedProperties("BleachPlayer");
      ItemStack heldItem = player.getCurrentEquippedItem();
      ItemStack var13 = new ItemStack(BleachItems.zanpakuto, 1);
      this.shikaiTimer -= 1;
      if ((this.shikaiTimer <= 0) && (!player.worldObj.isRemote))
      {
        this.shikaiTimer = 40;
        props.consumeEnergy(3);
      }
      

      if ((heldItem != null) && (heldItem == par1ItemStack))
      {
        if (props.getCurrentEnergy() <= 0.0F)
        {
          props.deactivate(par1ItemStack.getItem());
        }
        heldItem.setItemDamage(props.getZTex());
        
        if (props.getZType() != 5) {
          props.deactivate(par1ItemStack.getItem());
        }
      }
    }
  }
}
