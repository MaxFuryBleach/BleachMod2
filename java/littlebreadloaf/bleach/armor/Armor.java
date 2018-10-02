package littlebreadloaf.bleach.armor;

import cpw.mods.fml.common.registry.GameRegistry;
import littlebreadloaf.bleach.BleachMod;
import littlebreadloaf.bleach.api.Tools;
import littlebreadloaf.bleach.proxies.CommonProxy;
import net.minecraft.item.Item;













public class Armor
{
  public static Item HollowHelmet;
  public static Item BatHelmet;
  public static Item SpiderHelmet;
  public static Item BlazeHelmet;
  public static Item SnakeHelmet;
  public static Item GolemHelmet;
  public static Item WaspHelmet;
  public static Item StalkerHelmet;
  public static Item WolfHelmet;
  public static Item ShiniRobe;
  public static Item ShiniPants;
  public static Item Sandals;
  public static Item QuincyRobe;
  public static Item QuincyPants;
  public static Item QuincyShoes;
  public static Item ArrancarJacket;
  public static Item ArrancarPants;
  public static Item ArrancarShoes;
  public static Item MaleAcademyTop;
  public static Item MaleAcademyBottom;
  public static Item FemaleAcademyTop;
  public static Item FemaleAcademyBottom;
  public static Item MaleSchoolTop;
  public static Item MaleSchoolBottom;
  public static Item FemaleSchoolTop;
  public static Item FemaleSchoolBottom;
  public static Item SoulChain;
  
  public static void init()
  {
    HollowHelmet = new ItemHollowHelmet(Tools.MASK, BleachMod.proxy.addArmor("hollow_helmet"), 0);
    BatHelmet = new ItemBatHelmet(Tools.MASK, BleachMod.proxy.addArmor("bat_helmet"), 0);
    SpiderHelmet = new ItemSpiderHelmet(Tools.MASK, BleachMod.proxy.addArmor("spider_helmet"), 0);
    BlazeHelmet = new ItemBlazeHelmet(Tools.MASK, BleachMod.proxy.addArmor("blaze_helmet"), 0);
    SnakeHelmet = new ItemSnakeHelmet(Tools.MASK, BleachMod.proxy.addArmor("snake_helmet"), 0);
    GolemHelmet = new ItemGolemHelmet(Tools.MASK, BleachMod.proxy.addArmor("golem_helmet"), 0);
    WaspHelmet = new ItemWaspHelmet(Tools.MASK, BleachMod.proxy.addArmor("wasp_helmet"), 0);
    StalkerHelmet = new ItemStalkerHelmet(Tools.MASK, BleachMod.proxy.addArmor("stalker_helmet"), 0);
    WolfHelmet = new ItemWolfHelmet(Tools.MASK, BleachMod.proxy.addArmor("wolf_helmet"), 0);
    
    ShiniRobe = new ItemShinigamiRobes(Tools.SOULS, BleachMod.proxy.addArmor("shinigami"), 1).setUnlocalizedName("shinirobe");
    ShiniPants = new ItemShinigamiRobes(Tools.SOULS, BleachMod.proxy.addArmor("shinigami"), 2).setUnlocalizedName("shinipants");
    Sandals = new ItemShinigamiRobes(Tools.SOULS, BleachMod.proxy.addArmor("shinigami"), 3).setUnlocalizedName("sandals");
    
    QuincyRobe = new ItemQuincyRobes(Tools.SOULS, BleachMod.proxy.addArmor("quincy"), 1).setUnlocalizedName("quincytop");
    QuincyPants = new ItemQuincyRobes(Tools.SOULS, BleachMod.proxy.addArmor("quincy"), 2).setUnlocalizedName("quincyslacks");
    QuincyShoes = new ItemQuincyRobes(Tools.SOULS, BleachMod.proxy.addArmor("quincy"), 3).setUnlocalizedName("quincyshoes");
    
    ArrancarJacket = new ItemArrancarArmor(Tools.SOULS, BleachMod.proxy.addArmor("arrancar"), 1).setUnlocalizedName("arrancar_top");
    ArrancarPants = new ItemArrancarArmor(Tools.SOULS, BleachMod.proxy.addArmor("arrancar"), 2).setUnlocalizedName("arrancar_pants");
    ArrancarShoes = new ItemArrancarArmor(Tools.SOULS, BleachMod.proxy.addArmor("arrancar"), 3).setUnlocalizedName("arrancar_shoes");
    
    MaleAcademyTop = new ItemMAcademyRobes(Tools.MASK, BleachMod.proxy.addArmor("academy"), 1).setUnlocalizedName("macademy_top");
    MaleAcademyBottom = new ItemMAcademyRobes(Tools.MASK, BleachMod.proxy.addArmor("academy"), 2).setUnlocalizedName("macademy_bottom");
    FemaleAcademyTop = new ItemFAcademyRobes(Tools.MASK, BleachMod.proxy.addArmor("academy2"), 1).setUnlocalizedName("facademy_top");
    FemaleAcademyBottom = new ItemFAcademyRobes(Tools.MASK, BleachMod.proxy.addArmor("academy2"), 2).setUnlocalizedName("facademy_bottom");
    
    MaleSchoolTop = new ItemMSchoolUniform(Tools.MASK, BleachMod.proxy.addArmor("school"), 1).setUnlocalizedName("mschool_top");
    MaleSchoolBottom = new ItemMSchoolUniform(Tools.MASK, BleachMod.proxy.addArmor("school"), 2).setUnlocalizedName("mschool_bottom");
    FemaleSchoolTop = new ItemFSchoolUniform(Tools.MASK, BleachMod.proxy.addArmor("school2"), 1).setUnlocalizedName("fschool_top");
    FemaleSchoolBottom = new ItemFSchoolUniform(Tools.MASK, BleachMod.proxy.addArmor("school2"), 2).setUnlocalizedName("fschool_bottom");
    
    SoulChain = new ItemSoulChain(Tools.MASK, BleachMod.proxy.addArmor("chain"), 1).setUnlocalizedName("soul_chain");
  }
  
  public static void registerItems()
  {
    GameRegistry.registerItem(HollowHelmet, "Hollow Mask");
    GameRegistry.registerItem(BatHelmet, "Bat Hollow Mask");
    GameRegistry.registerItem(SpiderHelmet, "Spider Hollow Mask");
    GameRegistry.registerItem(BlazeHelmet, "Blaze Hollow Mask");
    GameRegistry.registerItem(SnakeHelmet, "Snake Hollow Mask");
    GameRegistry.registerItem(GolemHelmet, "Golem Hollow Mask");
    GameRegistry.registerItem(WaspHelmet, "Wasp Hollow Mask");
    GameRegistry.registerItem(StalkerHelmet, "Stalker Hollow Mask");
    GameRegistry.registerItem(WolfHelmet, "Wolf Hollow Mask");
    
    GameRegistry.registerItem(ShiniRobe, "Shihakusho Top");
    GameRegistry.registerItem(ShiniPants, "Shihakusho Bottom");
    GameRegistry.registerItem(Sandals, "Sandals");
    
    GameRegistry.registerItem(QuincyRobe, "Quincy Tunic");
    GameRegistry.registerItem(QuincyPants, "Quincy Slacks");
    GameRegistry.registerItem(QuincyShoes, "Quincy Shoes");
    
    GameRegistry.registerItem(ArrancarJacket, "Arrancar Jacket");
    GameRegistry.registerItem(ArrancarPants, "Arrancar Pants");
    GameRegistry.registerItem(ArrancarShoes, "Arrancar Shoes");
    
    GameRegistry.registerItem(MaleAcademyTop, "Male Academy Top");
    GameRegistry.registerItem(MaleAcademyBottom, "Male Academy Bottom");
    GameRegistry.registerItem(FemaleAcademyTop, "Female Academy Top");
    GameRegistry.registerItem(FemaleAcademyBottom, "Female Academy Bottom");
    GameRegistry.registerItem(MaleSchoolTop, "Male School Top");
    GameRegistry.registerItem(MaleSchoolBottom, "Male School Bottom");
    GameRegistry.registerItem(FemaleSchoolTop, "Female School Top");
    GameRegistry.registerItem(FemaleSchoolBottom, "Female School Bottom");
    
    GameRegistry.registerItem(SoulChain, "Soul Chain");
  }
}
