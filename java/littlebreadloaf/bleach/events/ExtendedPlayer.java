package littlebreadloaf.bleach.events;

import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import java.util.List;
import java.util.Random;
import littlebreadloaf.bleach.BleachMod;
import littlebreadloaf.bleach.armor.Armor;
import littlebreadloaf.bleach.entities.EntityGlob;
import littlebreadloaf.bleach.items.BleachItems;
import littlebreadloaf.bleach.items.shikai.ItemShikai;
import littlebreadloaf.bleach.network.ClientSyncMessage;
import littlebreadloaf.bleach.network.GuiMessage;
import littlebreadloaf.bleach.network.MoveMessage;
import littlebreadloaf.bleach.proxies.CommonProxy;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import net.minecraftforge.common.IExtendedEntityProperties;



public class ExtendedPlayer
  implements IExtendedEntityProperties
{
  public static final String EXT_PROP_NAME = "BleachPlayer";
  private final EntityPlayer player;
  private Random rand = new Random();
  private int SoulCap = 50;
  private float SoulEnergy = 1.0F;
  private float SoulXP = 0.0F;
  private int Flame = 0;
  private int Ice = 0;
  private int Heal = 0;
  private int Poison = 0;
  private int Earth = 0;
  private int Wind = 0;
  private int Light = 0;
  private int Dark = 0;
  private int ZTotal = 0;
  private int ZType = 0;
  private int ZTex = 5;
  private String ZName = "";
  
  private int CurrentHPoints;
  
  private int TotalHPoints;
  private static boolean does3D = false;
  
  private boolean validFlash = true;
  
  private int faction = 0;
  
  private int HTex;
  
  private int Head;
  private int Back;
  private int Arms;
  private int Legs;
  private int Tail;
  private int HColor = this.rand.nextInt(16);
  private int MColor = this.rand.nextInt(16);
  
  private boolean hasBlock = false;
  





  int ceroCharge = 0;
  
  public ExtendedPlayer(EntityPlayer player)
  {
    this.player = player;
    this.SoulCap = 50;
    this.faction = 0;
  }
  





  public static final void register(EntityPlayer player)
  {
    player.registerExtendedProperties("BleachPlayer", new ExtendedPlayer(player));
  }
  



  public static final ExtendedPlayer get(EntityPlayer player)
  {
    return (ExtendedPlayer)player.getExtendedProperties("BleachPlayer");
  }
  


  public void saveNBTData(NBTTagCompound nbt)
  {
    NBTTagCompound properties = new NBTTagCompound();
    properties.setInteger("SoulCap", this.SoulCap);
    properties.setFloat("SoulEnergy", this.SoulEnergy);
    properties.setFloat("SoulXP", this.SoulXP);
    
    properties.setInteger("Flame", this.Flame);
    properties.setInteger("Ice", this.Ice);
    properties.setInteger("Heal", this.Heal);
    properties.setInteger("Poison", this.Poison);
    properties.setInteger("Earth", this.Earth);
    properties.setInteger("Wind", this.Wind);
    properties.setInteger("Light", this.Light);
    properties.setInteger("Dark", this.Dark);
    properties.setInteger("ZTotal", this.ZTotal);
    properties.setInteger("ZType", this.ZType);
    properties.setInteger("ZTex", this.ZTex);
    properties.setString("ZName", this.ZName);
    

    properties.setInteger("Faction", this.faction);
    
    properties.setBoolean("Does3D", does3D);
    
    properties.setInteger("HTex", this.HTex);
    properties.setInteger("Head", this.Head);
    properties.setInteger("Back", this.Back);
    properties.setInteger("Arms", this.Arms);
    properties.setInteger("Legs", this.Legs);
    properties.setInteger("Tail", this.Tail);
    properties.setInteger("HColor", this.HColor);
    properties.setInteger("MColor", this.MColor);
    

    properties.setInteger("HpointsC", this.CurrentHPoints);
    properties.setInteger("HpointsT", this.TotalHPoints);
    

    nbt.setTag("BleachPlayer", properties);
  }
  

  public void loadNBTData(NBTTagCompound nbt)
  {
    NBTTagCompound properties = (NBTTagCompound)nbt.getTag("BleachPlayer");
    this.SoulCap = properties.getInteger("SoulCap");
    this.SoulEnergy = properties.getFloat("SoulEnergy");
    this.SoulXP = properties.getFloat("SoulXP");
    
    this.Flame = properties.getInteger("Flame");
    this.Ice = properties.getInteger("Ice");
    this.Heal = properties.getInteger("Heal");
    this.Poison = properties.getInteger("Poison");
    this.Earth = properties.getInteger("Earth");
    this.Wind = properties.getInteger("Wind");
    this.Light = properties.getInteger("Light");
    this.Dark = properties.getInteger("Dark");
    this.ZTotal = properties.getInteger("ZTotal");
    this.ZType = properties.getInteger("ZType");
    this.ZTex = properties.getInteger("ZTex");
    this.ZName = properties.getString("ZName");
    

    this.faction = properties.getInteger("Faction");
    does3D = properties.getBoolean("Does3D");
    
    this.HTex = properties.getInteger("HTex");
    this.Head = properties.getInteger("Head");
    this.Back = properties.getInteger("Back");
    this.Arms = properties.getInteger("Arms");
    this.Legs = properties.getInteger("Legs");
    this.Tail = properties.getInteger("Tail");
    this.HColor = properties.getInteger("HColor");
    this.MColor = properties.getInteger("MColor");
    
    this.CurrentHPoints = properties.getInteger("HpointsC");
    this.TotalHPoints = properties.getInteger("HpointsT");
  }
  





  private static String getSaveKey(EntityPlayer player)
  {
    return player.getCommandSenderName() + ":" + "BleachPlayer";
  }
  





  public static void saveProxyData(EntityPlayer player)
  {
    ExtendedPlayer playerData = get(player);
    NBTTagCompound savedData = new NBTTagCompound();
    
    playerData.saveNBTData(savedData);
    
    CommonProxy.storeEntityData(getSaveKey(player), savedData);
  }
  
  public static final void loadProxyData(EntityPlayer player)
  {
    ExtendedPlayer playerData = get(player);
    
    NBTTagCompound savedData = CommonProxy.getEntityData(getSaveKey(player));
    
    if (savedData != null) { playerData.loadNBTData(savedData);
    }
  }
  












  public void init(Entity entity, World world) {}
  












  public void setCurrentEnergy(float amount)
  {
    this.SoulEnergy = (amount > 0.0F ? amount : 0.0F);
  }
  
  public void setMaxCap(int amount)
  {
    this.SoulCap = (amount > 0 ? amount : 0);
  }
  
  public void setCapMin()
  {
    this.SoulCap = 50;
  }
  
  public void setCapMax()
  {
    this.SoulCap = 1000;
  }
  
  public void setZType(int var1)
  {
    this.ZType = var1;
  }
  
  public void setName(String name)
  {
    this.ZName = name;
  }
  
  public void setZName(String name) {
    this.ZName = name;
  }
  
  public void setTexture(int var1)
  {
    this.ZTex = var1;
  }
  
  public void setFaction(int var1) {
    this.faction = var1;
  }
  

  public void setHTex(int var1)
  {
    this.HTex = var1;
  }
  
  public void setHead(int var1)
  {
    this.Head = var1;
  }
  

  public void setBack(int var1)
  {
    this.Back = var1;
  }
  
  public void setArms(int var1)
  {
    this.Arms = var1;
  }
  
  public void setLegs(int var1)
  {
    this.Legs = var1;
  }
  
  public void setTail(int var1)
  {
    this.Tail = var1;
  }
  
  public void setHColor(int var1)
  {
    this.HColor = var1;
  }
  
  public void setMColor(int var1) {
    this.MColor = var1;
  }
  
  public void subtractCurrentHPoints(int var1) {
    this.CurrentHPoints -= var1;
  }
  
  public void setTotalHPoints(int var1) {
    this.TotalHPoints = var1;
  }
  
  public void setValidFlash(boolean var1) {
    this.validFlash = var1;
  }
  

  public static void set3D(boolean var1)
  {
    does3D = var1;
  }
  
  public void setHasBlock(boolean var1) {
    this.hasBlock = var1;
  }
  


  public void addCeroCharge(int var2)
  {
    this.ceroCharge += var2;
  }
  
  public void setCeroCharge(int var2) {
    this.ceroCharge = var2;
  }
  


  public void setType(int var3)
  {
    if (var3 == 0)
    {
      this.Flame = 400;
      this.Ice = 0;
      this.Poison = 0;
      this.Heal = 0;
      this.Earth = 0;
      this.Wind = 0;
      this.Light = 0;
      this.Dark = 0;
    }
    if (var3 == 1)
    {
      this.Flame = 0;
      this.Ice = 400;
      this.Poison = 0;
      this.Heal = 0;
      this.Earth = 0;
      this.Wind = 0;
      this.Light = 0;
      this.Dark = 0;
    }
    if (var3 == 2)
    {
      this.Flame = 0;
      this.Ice = 0;
      this.Poison = 400;
      this.Heal = 0;
      this.Earth = 0;
      this.Wind = 0;
      this.Light = 0;
      this.Dark = 0;
    }
    if (var3 == 3)
    {
      this.Flame = 0;
      this.Ice = 0;
      this.Poison = 0;
      this.Heal = 400;
      this.Earth = 0;
      this.Wind = 0;
      this.Light = 0;
      this.Dark = 0;
    }
    if (var3 == 4)
    {
      this.Flame = 0;
      this.Ice = 0;
      this.Poison = 0;
      this.Heal = 0;
      this.Earth = 400;
      this.Wind = 0;
      this.Light = 0;
      this.Dark = 0;
    }
    if (var3 == 5)
    {
      this.Flame = 0;
      this.Ice = 0;
      this.Poison = 0;
      this.Heal = 0;
      this.Earth = 0;
      this.Wind = 400;
      this.Light = 0;
      this.Dark = 0;
    }
    if (var3 == 6)
    {
      this.Flame = 0;
      this.Ice = 0;
      this.Poison = 0;
      this.Heal = 0;
      this.Earth = 0;
      this.Wind = 0;
      this.Light = 400;
      this.Dark = 0;
    }
    if (var3 == 7)
    {
      this.Flame = 0;
      this.Ice = 0;
      this.Poison = 0;
      this.Heal = 0;
      this.Earth = 0;
      this.Wind = 0;
      this.Light = 0;
      this.Dark = 400;
    }
    if (var3 == 8)
    {
      this.Flame = 0;
      this.Ice = 0;
      this.Poison = 0;
      this.Heal = 0;
      this.Earth = 0;
      this.Wind = 0;
      this.Light = 200;
      this.Dark = 200;
    }
    if (var3 == 9)
    {
      this.Flame = 0;
      this.Ice = 0;
      this.Poison = 0;
      this.Heal = 0;
      this.Earth = 0;
      this.Wind = 200;
      this.Light = 200;
      this.Dark = 0;
    }
    
    if (var3 == 10)
    {
      this.Flame = 50;
      this.Ice = 50;
      this.Poison = 50;
      this.Heal = 50;
      this.Earth = 50;
      this.Wind = 50;
      this.Light = 50;
      this.Dark = 50;
    }
    
    if (var3 == 11)
    {
      this.Flame = 200;
      this.Ice = 200;
      this.Poison = 0;
      this.Heal = 0;
      this.Earth = 0;
      this.Wind = 0;
      this.Light = 0;
      this.Dark = 0;
    }
  }
  

  public void setPoints(int var1, int amount)
  {
    if (var1 == 1)
    {
      this.Flame = amount;
    }
    if (var1 == 2)
    {
      this.Ice = amount;
    }
    if (var1 == 3)
    {
      this.Poison = amount;
    }
    if (var1 == 4)
    {
      this.Heal = amount;
    }
    if (var1 == 5)
    {
      this.Earth = amount;
    }
    if (var1 == 6)
    {
      this.Wind = amount;
    }
    if (var1 == 7)
    {
      this.Light = amount;
    }
    if (var1 == 8)
    {
      this.Dark = amount;
    }
    else
    {
      this.ZTotal = amount;
    }
  }
  



  public void resetType()
  {
    this.Flame = 0;
    this.Ice = 0;
    this.Heal = 0;
    this.Poison = 0;
    this.Earth = 0;
    this.Wind = 0;
    this.Light = 0;
    this.Dark = 0;
    this.ZTotal = 0;
    this.ZType = 0;
    randomTexture();
    this.ZName = "";
  }
  










  public int getCurrentCap()
  {
    return this.SoulCap;
  }
  
  public float getCurrentEnergy() {
    return this.SoulEnergy;
  }
  
  public float getCurrentSXP() {
    return this.SoulXP;
  }
  
  public String getName() {
    return this.ZName;
  }
  
  public int getZTex() {
    return this.ZTex;
  }
  
  public int getZTotal() {
    return this.ZTotal;
  }
  
  public String getZName() {
    return this.ZName;
  }
  
  public int getZType() {
    return this.ZType;
  }
  
  public int getFaction()
  {
    return this.faction;
  }
  
  public int getHTex()
  {
    return this.HTex;
  }
  
  public int getHead()
  {
    return this.Head;
  }
  
  public int getBack()
  {
    return this.Back;
  }
  
  public int getArms()
  {
    return this.Arms;
  }
  
  public int getLegs()
  {
    return this.Legs;
  }
  
  public int getTail()
  {
    return this.Tail;
  }
  
  public int getHColor()
  {
    return this.HColor;
  }
  
  public int getMColor() {
    return this.MColor;
  }
  
  public int getCurrentHPoints() {
    return this.CurrentHPoints;
  }
  
  public int getTotalHPoints() {
    return this.TotalHPoints;
  }
  
  public boolean getValidFlash() {
    return this.validFlash;
  }
  
  public static boolean getIs3D() {
    return does3D;
  }
  
  public boolean getHasBlock() {
    return this.hasBlock;
  }
  



  public int getCeroCharge()
  {
    return this.ceroCharge;
  }
  


  public int getPoints(int var1)
  {
    if (var1 == 1)
    {
      return this.Flame;
    }
    if (var1 == 2)
    {
      return this.Ice;
    }
    if (var1 == 3)
    {
      return this.Poison;
    }
    if (var1 == 4)
    {
      return this.Heal;
    }
    if (var1 == 5)
    {
      return this.Earth;
    }
    if (var1 == 6)
    {
      return this.Wind;
    }
    if (var1 == 7)
    {
      return this.Light;
    }
    if (var1 == 8)
    {
      return this.Dark;
    }
    if (var1 == 23)
    {
      return 2;
    }
    

    return this.ZTotal;
  }
  















  public void addCap()
  {
    this.SoulCap += 5;
    this.SoulXP = 0.0F;
    
    if ((getFaction() == 3) && (this.SoulCap / (this.TotalHPoints + 2) == 50))
    {
      if (this.TotalHPoints < 6)
      {
        this.TotalHPoints += 1;
        this.CurrentHPoints += 1;
      }
    }
    
    if ((this.player instanceof EntityPlayerMP)) {
      BleachMod.network.sendTo(new ClientSyncMessage(this.player), (EntityPlayerMP)this.player);
    }
  }
  
  public void addSXP(int amount) {
    this.SoulXP += amount / (this.SoulCap - 50);
    if ((this.player instanceof EntityPlayerMP)) {
      BleachMod.network.sendTo(new ClientSyncMessage(this.player), (EntityPlayerMP)this.player);
    }
  }
  
  public boolean consumeEnergy(int amount) {
    boolean sufficient = amount <= this.SoulEnergy * this.SoulCap;
    
    this.SoulEnergy -= (amount < this.SoulEnergy * this.SoulCap ? amount / this.SoulCap : this.SoulEnergy);
    if (this.SoulEnergy <= 0.0F)
    {
      this.SoulEnergy = 0.0F;
    }
    if ((this.player instanceof EntityPlayerMP))
      BleachMod.network.sendTo(new ClientSyncMessage(this.player), (EntityPlayerMP)this.player);
    return sufficient;
  }
  
  public boolean replenishEnergy(int amount)
  {
    boolean sufficient = this.SoulEnergy < 1.0F;
    this.SoulEnergy += (this.SoulEnergy < 1.0F ? amount / this.SoulCap : this.SoulEnergy);
    if (this.SoulEnergy >= 1.0F)
    {
      this.SoulEnergy = 1.0F;
    }
    if ((this.player instanceof EntityPlayerMP))
      BleachMod.network.sendTo(new ClientSyncMessage(this.player), (EntityPlayerMP)this.player);
    return sufficient;
  }
  
  public void addPoints(int type, int amount)
  {
    if (type == 1)
    {
      this.Flame += amount;
    }
    if (type == 2)
    {
      this.Ice += amount;
    }
    if (type == 3)
    {
      this.Poison += amount;
    }
    if (type == 4)
    {
      this.Heal += amount;
    }
    if (type == 5)
    {
      this.Earth += amount;
    }
    if (type == 6)
    {
      this.Wind += amount;
    }
    if (type == 7)
    {
      this.Light += amount;
    }
    if (type == 8)
    {
      this.Dark += amount;
    }
    else
    {
      this.ZTotal += amount;
    }
    if ((this.player instanceof EntityPlayerMP)) {
      BleachMod.network.sendTo(new ClientSyncMessage(this.player), (EntityPlayerMP)this.player);
    }
  }
  
  public void balanceTotal() {
    this.ZTotal = (this.Flame + this.Ice + this.Heal + this.Poison + this.Earth + this.Wind + this.Light + this.Dark);
    if ((this.player instanceof EntityPlayerMP)) {
      BleachMod.network.sendTo(new ClientSyncMessage(this.player), (EntityPlayerMP)this.player);
    }
  }
  











  public void randomTexture()
  {
    this.ZTex = this.rand.nextInt(5);
    if ((this.player instanceof EntityPlayerMP)) {
      BleachMod.network.sendTo(new ClientSyncMessage(this.player), (EntityPlayerMP)this.player);
    }
  }
  













  public void decideWhatToDo(int readInt)
  {
    if (readInt == 1)
    {

      ItemStack var9 = this.player.inventory.armorInventory[0];
      ItemStack var10 = this.player.inventory.armorInventory[1];
      ItemStack var11 = this.player.inventory.armorInventory[2];
      int distance = 9;
      
      if ((getValidFlash()) && (getCurrentEnergy() >= 5.0F / getCurrentCap()))
      {
        if ((this.faction == 1) && (var9 != null) && (var9.getItem() == Armor.Sandals) && (var10 != null) && (var10.getItem() == Armor.ShiniPants) && (var11 != null) && (var11.getItem() == Armor.ShiniRobe) && (getCurrentEnergy() >= 5.0F / getCurrentCap()))
        {
          this.player.worldObj.playSoundAtEntity(this.player, "bleach:shunpo", 0.4F, 1.0F);
          
          if ((this.player instanceof EntityPlayerMP))
            BleachMod.network.sendTo(new MoveMessage(distance), (EntityPlayerMP)this.player);
          consumeEnergy(5);
          this.player.worldObj.playSoundAtEntity(this.player, "bleach:shunpo", 0.4F, 1.0F);
          
          setValidFlash(false);
        }
        else if ((this.faction == 2) && (var9 != null) && (var9.getItem() == Armor.QuincyShoes) && (var10 != null) && (var10.getItem() == Armor.QuincyPants) && (var11 != null) && (var11.getItem() == Armor.QuincyRobe) && (getCurrentEnergy() >= 5.0F / getCurrentCap()))
        {
          this.player.worldObj.playSoundAtEntity(this.player, "bleach:shunpo", 0.4F, 1.0F);
          
          if ((this.player instanceof EntityPlayerMP))
            BleachMod.network.sendTo(new MoveMessage(distance), (EntityPlayerMP)this.player);
          this.player.worldObj.playSoundAtEntity(this.player, "bleach:shunpo", 0.4F, 1.0F);
          consumeEnergy(5);
          setValidFlash(false);
        }
        else if ((this.faction == 4) && (var9 != null) && (var9.getItem() == Armor.ArrancarShoes) && (var10 != null) && (var10.getItem() == Armor.ArrancarPants) && (var11 != null) && (var11.getItem() == Armor.ArrancarJacket) && (getCurrentEnergy() >= 5.0F / getCurrentCap()))
        {
          this.player.worldObj.playSoundAtEntity(this.player, "bleach:shunpo", 0.4F, 1.0F);
          
          if ((this.player instanceof EntityPlayerMP))
            BleachMod.network.sendTo(new MoveMessage(distance), (EntityPlayerMP)this.player);
          this.player.worldObj.playSoundAtEntity(this.player, "bleach:shunpo", 0.4F, 1.0F);
          consumeEnergy(5);
          setValidFlash(false);
        }
        else if ((this.faction == 1) && (var9 != null) && (var9.getItem() == Armor.Sandals) && (var10 != null) && (var10.getItem() == Armor.MaleAcademyBottom) && (var11 != null) && (var11.getItem() == Armor.MaleAcademyTop) && (getCurrentEnergy() >= 5.0F / getCurrentCap()))
        {
          this.player.worldObj.playSoundAtEntity(this.player, "bleach:shunpo", 0.4F, 1.0F);
          
          if ((this.player instanceof EntityPlayerMP))
            BleachMod.network.sendTo(new MoveMessage(distance), (EntityPlayerMP)this.player);
          this.player.worldObj.playSoundAtEntity(this.player, "bleach:shunpo", 0.4F, 1.0F);
          consumeEnergy(5);
          setValidFlash(false);
        }
        else if ((this.faction == 1) && (var9 != null) && (var9.getItem() == Armor.Sandals) && (var10 != null) && (var10.getItem() == Armor.FemaleAcademyBottom) && (var11 != null) && (var11.getItem() == Armor.FemaleAcademyTop) && (getCurrentEnergy() >= 5.0F / getCurrentCap()))
        {
          this.player.worldObj.playSoundAtEntity(this.player, "bleach:shunpo", 0.4F, 1.0F);
          
          if ((this.player instanceof EntityPlayerMP))
            BleachMod.network.sendTo(new MoveMessage(distance), (EntityPlayerMP)this.player);
          this.player.worldObj.playSoundAtEntity(this.player, "bleach:shunpo", 0.4F, 1.0F);
          consumeEnergy(5);
          setValidFlash(false);
        }
      }
    }
    else if (readInt == 2)
    {
      if (getFaction() == 4)
      {

        if ((getCurrentEnergy() * getCurrentCap() > 50.0F) && (this.ceroCharge == 0))
        {
          this.ceroCharge = 1;
          
          if (!this.player.worldObj.isRemote)
          {
            consumeEnergy(50);
          }
        }
      }
      if ((getFaction() == 3) && (getHead() == 1))
      {
        if (getCurrentEnergy() * getCurrentCap() > 10.0F)
        {


          if (!this.player.worldObj.isRemote)
          {
            this.player.worldObj.spawnEntityInWorld(new EntityGlob(this.player.worldObj, this.player));
            consumeEnergy(10);
          }
          
        }
        
      }
    }
    else if (readInt == 4)
    {
      ExtendedPlayer props = get(this.player);
      if ((props.getFaction() == 3) && 
        ((this.player instanceof EntityPlayerMP))) {
        BleachMod.network.sendTo(new GuiMessage(3), (EntityPlayerMP)this.player);
      }
    }
    else if (readInt == 11) {
      setFaction(1);
    } else if (readInt == 12) {
      setFaction(2);
    } else if (readInt == 13) {
      setFaction(3);
    } else if (readInt == 14) {
      setFaction(6);
    }
  }
  

  ItemStack[] Shikai = { new ItemStack(BleachItems.shikaifire, 1), new ItemStack(BleachItems.shikaiice, 1), new ItemStack(BleachItems.shikaipoison, 1), new ItemStack(BleachItems.shikaiheal, 1), new ItemStack(BleachItems.shikaiearth, 1), new ItemStack(BleachItems.shikaiwind, 1), new ItemStack(BleachItems.shikailight, 1), new ItemStack(BleachItems.shikaidark, 1), new ItemStack(BleachItems.shikailunar, 1), new ItemStack(BleachItems.shikailightning, 1), new ItemStack(BleachItems.shikainormal, 1), new ItemStack(BleachItems.shikaiwater, 1) };
  












  public void activate(ItemStack stack)
  {
    if (stack.getItem() == BleachItems.zanpakuto)
    {
      if ((getCurrentCap() >= 200) && (getPoints(9) >= 400) && (stack.hasDisplayName()) && (stack.getDisplayName().equals(getZName())) && (getFaction() == 1))
      {

        if (!this.player.worldObj.isRemote)
        {
          if ((getZType() == 1) && (getZName().equalsIgnoreCase("vox populi")))
          {
            setTexture(5);
          }
          else if ((getZType() == 2) && (getZName().equalsIgnoreCase("ice cream")))
          {
            setTexture(5);
          }
          else if ((getZType() == 3) && (getZName().equalsIgnoreCase("ashisogi jizo")))
          {
            setTexture(5);
          }
          else if ((getZType() == 4) && (getZName().equalsIgnoreCase("love")))
          {
            setTexture(5);
          }
          else if ((getZType() == 5) && (getZName().equalsIgnoreCase("piko piko")))
          {
            setTexture(5);
          }
          else if ((getZType() == 6) && (getZName().equalsIgnoreCase("fightin words")))
          {
            setTexture(5);
          }
          else if ((getZType() == 7) && (getZName().equalsIgnoreCase("master sword")))
          {
            setTexture(5);
          }
          else if ((getZType() == 8) && (getZName().equalsIgnoreCase("souledge")))
          {
            setTexture(5);
          }
          else if ((getZType() == 9) && (getZName().equalsIgnoreCase("zangetsu")))
          {
            setTexture(5);
          }
          else if ((getZType() == 10) && (getZName().equalsIgnoreCase("mjolnir")))
          {
            setTexture(5);
          }
          else if ((getZType() == 12) && (getZName().equalsIgnoreCase("sakana")))
          {
            setTexture(5);
          }
          else if ((getZType() == 11) && (getZName().equalsIgnoreCase("ticonderoga")))
          {
            setTexture(5);
          }
          
          ItemStack shikai = this.Shikai[(getZType() - 1)];
          shikai.setStackDisplayName(stack.getDisplayName());
          this.player.setCurrentItemOrArmor(0, shikai);
          Vec3 normalizer = Vec3.createVectorHelper(0.008D, 0.008D, 0.008D).normalize();
          List list = this.player.worldObj.getEntitiesWithinAABB(EntityPlayer.class, this.player.boundingBox.copy().expand(Math.abs(normalizer.xCoord * 15.0D), Math.abs(normalizer.yCoord * 15.0D), Math.abs(normalizer.zCoord * 15.0D)));
          for (int l = 0; l < list.size(); l++)
          {
            Entity entity1 = (Entity)list.get(l);
            
            if ((entity1 instanceof EntityPlayer))
            {
              EntityPlayer surroundingPlayers = (EntityPlayer)entity1;
              
              surroundingPlayers.addChatMessage(new ChatComponentText(littlebreadloaf.bleach.Names.ShikaiPhrases[(6 * (getZType() - 1) + getZTex())] + " " + stack.getDisplayName() + "!"));
            }
          }
        }
      }
      
      consumeEnergy(10);
    }
  }
  


  public void deactivate(Item theItem)
  {
    if ((theItem instanceof ItemShikai))
    {
      ItemStack Sword = new ItemStack(BleachItems.zanpakuto, 1);
      if (this.player.getHeldItem().getDisplayName() != null)
        Sword.setStackDisplayName(this.player.getHeldItem().getDisplayName());
      this.player.setCurrentItemOrArmor(0, Sword);
    }
    else if (theItem == BleachItems.quincybow)
    {
      ItemStack Pendant = new ItemStack(BleachItems.quincypendant, 1, 0);
      this.player.setCurrentItemOrArmor(0, Pendant);
      this.player.getHeldItem().setItemDamage(0);
    }
    else if (theItem == BleachItems.quincyweb)
    {
      ItemStack Pendant = new ItemStack(BleachItems.quincypendant, 1, 1);
      this.player.setCurrentItemOrArmor(0, Pendant);
      this.player.getHeldItem().setItemDamage(1);
    }
  }
}
