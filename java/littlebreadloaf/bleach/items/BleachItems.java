package littlebreadloaf.bleach.items;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import littlebreadloaf.bleach.Names;
import littlebreadloaf.bleach.api.Tools;
import littlebreadloaf.bleach.armor.Armor;
import littlebreadloaf.bleach.items.shikai.ShikaiDark;
import littlebreadloaf.bleach.items.shikai.ShikaiEarth;
import littlebreadloaf.bleach.items.shikai.ShikaiFire;
import littlebreadloaf.bleach.items.shikai.ShikaiHeal;
import littlebreadloaf.bleach.items.shikai.ShikaiIce;
import littlebreadloaf.bleach.items.shikai.ShikaiLight;
import littlebreadloaf.bleach.items.shikai.ShikaiLightning;
import littlebreadloaf.bleach.items.shikai.ShikaiLunar;
import littlebreadloaf.bleach.items.shikai.ShikaiNormal;
import littlebreadloaf.bleach.items.shikai.ShikaiPoison;
import littlebreadloaf.bleach.items.shikai.ShikaiWater;
import littlebreadloaf.bleach.items.shikai.ShikaiWind;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;













public class BleachItems
{
  public static Item reiatsu;
  public static Item shinai;
  public static Item zanpakuto;
  public static Item maskshard;
  public static Item quincybow;
  public static Item soulcloth;
  public static Item oremask;
  public static Item menosmask;
  public static Item fishermask;
  public static Item seele;
  public static Item soulquartz;
  public static Item quincypendant;
  public static Item quincyweb;
  public static Item soulsteel;
  public static Item hollowbook;
  public static Item factionSelect;
  public static Item heart;
  public static Item recordAsterisk;
  public static Item recordNumberOne;
  public static Item recordEscalon;
  public static Item shikaifire;
  public static Item shikaiice;
  public static Item shikaiheal;
  public static Item shikaipoison;
  public static Item shikaiearth;
  public static Item shikaiwind;
  public static Item shikailight;
  public static Item shikaidark;
  public static Item shikailightning;
  public static Item shikailunar;
  public static Item shikaiwater;
  public static Item shikainormal;
  public static Item debugItem;
  public static final CreativeTabs tabBleach = new CreativeTabs("Bleach Mod")
  {

    @SideOnly(Side.CLIENT)
    public Item getTabIconItem()
    {
      return Armor.HollowHelmet;
    }
  };
  




  public static void init()
  {
    shinai = new ItemShinai(Tools.SHINAI).setTextureName("bleach".toLowerCase() + "shinai");
    reiatsu = new ItemReiatsu().setTextureName("bleach".toLowerCase() + "reiatsu");
    quincybow = new ItemQuincyBow().setTextureName("bleach".toLowerCase() + "quincy_bow");
    zanpakuto = new ItemZanpakuto(Tools.SOUL).setTextureName("bleach".toLowerCase() + "zanpakuto");
    maskshard = new ItemMaskShard().setTextureName("bleach".toLowerCase() + "mask_shard");
    soulcloth = new ItemSoulCloth().setTextureName("bleach".toLowerCase() + "soulcloth");
    oremask = new ItemOreMask().setTextureName("bleach".toLowerCase() + "oremask");
    menosmask = new ItemMenosMask().setTextureName("bleach".toLowerCase() + "menosmask");
    fishermask = new ItemFisherMask().setTextureName("bleach".toLowerCase() + "fishermask");
    seele = new ItemSeeleschneider(Tools.SOUL).setTextureName("bleach".toLowerCase() + Names.SeeleSchneider_Name);
    soulquartz = new ItemSoulQuartz().setTextureName("bleach".toLowerCase() + "soul_quartz");
    quincypendant = new ItemPendant().setTextureName("bleach".toLowerCase() + Names.QuincyPendant_UnlocalizedName);
    quincyweb = new ItemQuincyWebBow().setTextureName("bleach".toLowerCase() + "quincy_web");
    soulsteel = new ItemSoulSteel().setTextureName("bleach".toLowerCase() + "soul_steel");
    hollowbook = new ItemHollowBook().setTextureName("bleach".toLowerCase() + "hollow_book");
    factionSelect = new ItemFactionSelector().setTextureName("bleach".toLowerCase() + "faction_selector");
    heart = new ItemHeart().setTextureName("bleach".toLowerCase() + "heart");
    
    recordAsterisk = new ItemBleachRecord("bleach".toLowerCase() + ":asterisk").setUnlocalizedName("asterisk").setTextureName("bleach".toLowerCase() + ":record_asterisk");
    recordNumberOne = new ItemBleachRecord("bleach".toLowerCase() + ":NumberOne").setUnlocalizedName("numberone").setTextureName("bleach".toLowerCase() + ":record_NumberOne");
    recordEscalon = new ItemBleachRecord("bleach".toLowerCase() + ":Escalon").setUnlocalizedName("escalon").setTextureName("bleach".toLowerCase() + ":record_Escalon");
    

    shikaifire = new ShikaiFire(Tools.SHIKAI).setTextureName("bleach".toLowerCase() + Names.ShikaiFire_UnlocalizedName);
    shikaiice = new ShikaiIce(Tools.SHIKAI).setTextureName("bleach".toLowerCase() + Names.ShikaiIce_UnlocalizedName);
    shikaiheal = new ShikaiHeal(Tools.SHIKAI).setTextureName("bleach".toLowerCase() + Names.ShikaiHeal_UnlocalizedName);
    shikaipoison = new ShikaiPoison(Tools.SHIKAI).setTextureName("bleach".toLowerCase() + Names.ShikaiPoison_UnlocalizedName);
    shikaiearth = new ShikaiEarth(Tools.SHIKAI).setTextureName("bleach".toLowerCase() + Names.ShikaiEarth_UnlocalizedName);
    shikaiwind = new ShikaiWind(Tools.SHIKAI).setTextureName("bleach".toLowerCase() + Names.ShikaiWind_UnlocalizedName);
    shikailight = new ShikaiLight(Tools.SHIKAI).setTextureName("bleach".toLowerCase() + Names.ShikaiLight_UnlocalizedName);
    shikaidark = new ShikaiDark(Tools.SHIKAI).setTextureName("bleach".toLowerCase() + Names.ShikaiDark_UnlocalizedName);
    shikailightning = new ShikaiLightning(Tools.SHIKAI).setTextureName("bleach".toLowerCase() + Names.ShikaiLightning_UnlocalizedName);
    shikailunar = new ShikaiLunar(Tools.SHIKAI).setTextureName("bleach".toLowerCase() + Names.ShikaiNormal_UnlocalizedName);
    shikaiwater = new ShikaiWater(Tools.SHIKAI).setTextureName("bleach".toLowerCase() + Names.ShikaiWater_UnlocalizedName);
    shikainormal = new ShikaiNormal(Tools.SHIKAI).setTextureName("bleach".toLowerCase() + Names.ShikaiNormal_UnlocalizedName);
    
    debugItem = new DebugItem().setUnlocalizedName("debug").setCreativeTab(tabBleach).setTextureName("bleach".toLowerCase() + "test_garganta");
  }
  



  public static void registerItems()
  {
    GameRegistry.registerItem(shinai, "Shinai");
    GameRegistry.registerItem(reiatsu, "Reiatsu");
    GameRegistry.registerItem(quincybow, "Quincy Bow");
    GameRegistry.registerItem(zanpakuto, "Zanpakuto");
    GameRegistry.registerItem(maskshard, "Mask Shard");
    GameRegistry.registerItem(soulcloth, "Soul Cloth");
    GameRegistry.registerItem(oremask, "Ore Hollow Mask");
    GameRegistry.registerItem(menosmask, "Menos Mask");
    GameRegistry.registerItem(fishermask, "Grand Fisher Mask");
    GameRegistry.registerItem(seele, Names.SeeleSchneider_Name);
    GameRegistry.registerItem(soulquartz, "Soul Quartz");
    GameRegistry.registerItem(quincypendant, "Quincy Pendant");
    GameRegistry.registerItem(quincyweb, "Web Quincy Bow");
    GameRegistry.registerItem(soulsteel, "Soul Steel");
    GameRegistry.registerItem(hollowbook, "Hollow Tome");
    GameRegistry.registerItem(factionSelect, "Faction Selector");
    GameRegistry.registerItem(heart, "Heart");
    
    GameRegistry.registerItem(recordAsterisk, "ASTERISK");
    GameRegistry.registerItem(recordNumberOne, "NUMBER ONE");
    GameRegistry.registerItem(recordEscalon, "ESCALON");
    
    GameRegistry.registerItem(shikaifire, "Fire Shikai");
    GameRegistry.registerItem(shikaiice, "Ice Shikai");
    GameRegistry.registerItem(shikaiheal, "Heal Shikai");
    GameRegistry.registerItem(shikaipoison, "Poison Shikai");
    GameRegistry.registerItem(shikaiearth, "Earth Shikai");
    GameRegistry.registerItem(shikaiwind, "Wind Shikai");
    GameRegistry.registerItem(shikailight, "Light Shikai");
    GameRegistry.registerItem(shikaidark, "Dark Shikai");
    GameRegistry.registerItem(shikailightning, "Lightning Shikai");
    GameRegistry.registerItem(shikailunar, "Lunar Shikai");
    GameRegistry.registerItem(shikaiwater, "Water Shikai");
    GameRegistry.registerItem(shikainormal, "Normal Shikai");
    GameRegistry.registerItem(debugItem, "Test Garganta");
  }
}
