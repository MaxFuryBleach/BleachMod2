package littlebreadloaf.bleach;

import java.io.File;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;

public class ConfigHandler
{
  public static void init(File configFile)
  {
    Configuration config = new Configuration(configFile);
    
    config.load();
    
    BleachIds.reiatsuBlockID = config.get("general", "Reiatsu Block ID", 2181).getInt();
    
    BleachIds.hollowBaitID = config.get("general", "Hollow Bait ID", 2182).getInt();
    
    BleachIds.maskOreID = config.get("general", "Mask Ore ID", 2183).getInt();
    
    BleachIds.purpleGooID = config.get("general", "Purple Goo ID", 2184).getInt();
    
    BleachIds.reiatsuOreID = config.get("general", "Reiatsu Ore ID", 2185).getInt();
    
    BleachIds.sekkisekiID = config.get("general", "Sekkiseki ID", 2186).getInt();
    
    BleachIds.soulQuartzOreID = config.get("general", "Soul Quartz Ore ID", 2187).getInt();
    
    BleachIds.soulQuartzBlockID = config.get("general", "Soul Quartz Block ID", 2188).getInt();
    
    BleachIds.soulQuartzLampID = config.get("general", "Soul Quartz Lamp ID", 2189).getInt();
    
    BleachIds.whitesandID = config.get("World Gen Blocks", "White Sand ID", 250, "").getInt();
    
    BleachIds.paperwallID = config.get("general", "Paper Wall ID", 2191).getInt();
    
    BleachIds.paperdoorID = config.get("general", "Paper Door ID", 2192).getInt();
    
    BleachIds.hollowdiamondID = config.get("general", "Diamond Hollow Block ID", 2193).getInt();
    
    BleachIds.hollowemeraldID = config.get("general", "Emerald Hollow Block  ID", 2194).getInt();
    
    BleachIds.hollowgoldID = config.get("general", "Gold Hollow Block ID", 2195).getInt();
    
    BleachIds.sphereLampID = config.get("general", "Reiatsu Sphere Lamp ID", 2196).getInt();
    
    BleachIds.lanternID = config.get("general", "Paper Lantern ID", 2197).getInt();
    
    BleachIds.seeleschneiderBlockID = config.get("general", "Seeleschneider Block ID", 2198).getInt();
    
    BleachIds.ssportalID = config.get("general", "Soul Society Portal Block ID", 2199).getInt();
    
    BleachIds.shikaiIceBlockID = config.get("general", "Temporary Ice Block ID", 2200).getInt();
    



    BleachIds.shinaiID = config.get("Bleach Mod Items", "Shinai ID", 20170).getInt();
    
    BleachIds.zanpakutoID = config.get("Bleach Mod Items", "Zanpakuto ID", 20171).getInt();
    
    BleachIds.maskShardID = config.get("Bleach Mod Items", "Mask Shard ID", 20172).getInt();
    
    BleachIds.soulClothID = config.get("Bleach Mod Items", "Soul Cloth ID", 20173).getInt();
    
    BleachIds.soulQuartzID = config.get("Bleach Mod Items", "Soul Quartz ID", 20174).getInt();
    
    BleachIds.soulsteelID = config.get("Bleach Mod Items", "Soul Steel ID", 20175).getInt();
    
    BleachIds.quincypendantID = config.get("Bleach Mod Items", "Quincy Pendant ID", 20176).getInt();
    
    BleachIds.seeleschneiderID = config.get("Bleach Mod Items", "Seeleschneider ID", 20177).getInt();
    
    BleachIds.hollowBookID = config.get("Bleach Mod Items", "Hollow Tome ID", 20178).getInt();
    
    BleachIds.factionSelectID = config.get("Bleach Mod Items", "Faction Selector ID", 20179).getInt();
    
    BleachIds.reiatsuID = config.get("Bleach Mod Items", "Reiatsu ID", 20180).getInt();
    

    BleachIds.batHelmetID = config.get("Bleach Mod Items", "Bat Mask ID", 20185).getInt();
    
    BleachIds.blazeHelmetID = config.get("Bleach Mod Items", "Blaze Mask ID", 20186).getInt();
    
    BleachIds.spiderHelmetID = config.get("Bleach Mod Items", "Spider Mask ID", 20187).getInt();
    
    BleachIds.golemHelmetID = config.get("Bleach Mod Items", "Golem Mask ID", 20188).getInt();
    
    BleachIds.snakeHelmetID = config.get("Bleach Mod Items", "Snake Mask ID", 20189).getInt();
    
    BleachIds.waspHelmetID = config.get("Bleach Mod Items", "Wasp Mask ID", 20190).getInt();
    
    BleachIds.stalkerHelmetID = config.get("Bleach Mod Items", "Stalker Mask ID", 20191).getInt();
    
    BleachIds.oreHelmetID = config.get("Bleach Mod Items", "Ore Mask ID", 20192).getInt();
    
    BleachIds.wolfHelmetID = config.get("Bleach Mod Items", "Wolf Mask ID", 20193).getInt();
    
    BleachIds.menosHelmetID = config.get("Bleach Mod Items", "Menos Mask ID", 20200).getInt();
    
    BleachIds.fisherHelmetID = config.get("Bleach Mod Items", "Fisher Mask ID", 20201).getInt();
    
    BleachIds.hollowHelmetID = config.get("Bleach Mod Items", "Hollow Mask ID", 20202).getInt();
    






    BleachIds.shinirobeID = config.get("Bleach Mod Items", "Shinigami Chest ID", 20204).getInt();
    
    BleachIds.shinipantsID = config.get("Bleach Mod Items", "Shinigami Pants ID", 20205).getInt();
    
    BleachIds.sandalsID = config.get("Bleach Mod Items", "Shinigami Sandals ID", 20206).getInt();
    
    BleachIds.quincyrobeID = config.get("Bleach Mod Items", "Quincy Robe ID", 20207).getInt();
    
    BleachIds.quincypantsID = config.get("Bleach Mod Items", "Quincy Pants ID", 20208).getInt();
    
    BleachIds.quincyshoesID = config.get("Bleach Mod Items", "Quincy Shoes ID", 20209).getInt();
    
    BleachIds.arrancartopID = config.get("Bleach Mod Items", "Arrancar Jacket ID", 20210).getInt();
    
    BleachIds.arrancarpantsID = config.get("Bleach Mod Items", "Arrancar Pants ID", 20211).getInt();
    
    BleachIds.arrancarshoesID = config.get("Bleach Mod Items", "Arrancar Shoes ID", 20212).getInt();
    


    BleachIds.playerMask10ID = config.get("Bleach Mod Items", "Player Mask 1-1 ID", 20223).getInt();
    BleachIds.playerMask11ID = config.get("Bleach Mod Items", "Player Mask 1-2 ID", 20224).getInt();
    BleachIds.playerMask12ID = config.get("Bleach Mod Items", "Player Mask 1-3 ID", 20225).getInt();
    BleachIds.playerMask20ID = config.get("Bleach Mod Items", "Player Mask 2-1 ID", 20214).getInt();
    BleachIds.playerMask21ID = config.get("Bleach Mod Items", "Player Mask 2-2 ID", 20215).getInt();
    BleachIds.playerMask22ID = config.get("Bleach Mod Items", "Player Mask 2-3 ID", 20216).getInt();
    BleachIds.playerMask30ID = config.get("Bleach Mod Items", "Player Mask 3-1 ID", 20217).getInt();
    BleachIds.playerMask31ID = config.get("Bleach Mod Items", "Player Mask 3-2 ID", 20218).getInt();
    BleachIds.playerMask32ID = config.get("Bleach Mod Items", "Player Mask 3-3 ID", 20219).getInt();
    BleachIds.playerMask40ID = config.get("Bleach Mod Items", "Player Mask 4-1 ID", 20220).getInt();
    BleachIds.playerMask41ID = config.get("Bleach Mod Items", "Player Mask 4-2 ID", 20221).getInt();
    BleachIds.playerMask42ID = config.get("Bleach Mod Items", "Player Mask 4-3 ID", 20222).getInt();
    
    BleachIds.maleacademytopID = config.get("Bleach Mod Items", "Male Academy Top ID", 20226).getInt();
    BleachIds.maleacademybottomID = config.get("Bleach Mod Items", "Male Academy Bottom ID", 20227).getInt();
    BleachIds.femaleacademytopID = config.get("Bleach Mod Items", "Female Academy Top ID", 20228).getInt();
    BleachIds.femaleacademybottomID = config.get("Bleach Mod Items", "Female Academy Bottom ID", 20229).getInt();
    
    BleachIds.maleschooltopID = config.get("Bleach Mod Items", "Male School Top ID", 20230).getInt();
    BleachIds.maleschoolbottomID = config.get("Bleach Mod Items", "Male School Bottom ID", 20231).getInt();
    BleachIds.femaleschooltopID = config.get("Bleach Mod Items", "Female School Top ID", 20232).getInt();
    BleachIds.femaleschoolbottomID = config.get("Bleach Mod Items", "Female School Bottom ID", 20233).getInt();
    

    BleachIds.quincyBowID = config.get("Bleach Mod Items", "Quincy Bow ID", 20323).getInt();
    

    BleachIds.quincywebID = config.get("Bleach Mod Items", "Quincy Web Bow ID", 20324).getInt();
    
    BleachIds.recordAsteriskID = config.get("Bleach Mod Items", "Asterisk ID", 20325).getInt();
    BleachIds.recordNumberOneID = config.get("Bleach Mod Items", "Number One ID", 20326).getInt();
    BleachIds.recordEscalonID = config.get("Bleach Mod Items", "Escalon ID", 20327).getInt();
    


    BleachIds.shikaifireID = config.get("Shikai", "Fire Shikai ID", 20400).getInt();
    
    BleachIds.shikaiiceID = config.get("Shikai", "Ice Shikai ID", 20401).getInt();
    
    BleachIds.shikaihealID = config.get("Shikai", "Heal Shikai ID", 20402).getInt();
    
    BleachIds.shikaipoisonID = config.get("Shikai", "Poison Shikai ID", 20403).getInt();
    
    BleachIds.shikaiearthID = config.get("Shikai", "Earth Shikai ID", 20404).getInt();
    
    BleachIds.shikaiwindID = config.get("Shikai", "Wind Shikai ID", 20405).getInt();
    
    BleachIds.shikailightID = config.get("Shikai", "Light Shikai ID", 20406).getInt();
    
    BleachIds.shikaidarkID = config.get("Shikai", "Dark Shikai ID", 20407).getInt();
    
    BleachIds.shikailightningID = config.get("Shikai", "Lightning Shikai ID", 20408).getInt();
    
    BleachIds.shikailunarID = config.get("Shikai", "Lunar Shikai ID", 20409).getInt();
    
    BleachIds.shikaiwaterID = config.get("Shikai", "Water Shikai ID", 20410).getInt();
    
    BleachIds.shikainormalID = config.get("Shikai", "Normal Shikai ID", 20411).getInt();
    



    BleachIds.worldHuecoMundoID = config.get("Dimensions", "Hueco Mundo World ID", 6).getInt();
    
    BleachIds.biomeHuecoMundoID = config.get("Biomes", "Hueco Mundo Biome ID", 220).getInt();
    
    BleachIds.worldSoulSocietyID = config.get("Dimensions", "Soul Society World ID", 7).getInt();
    
    BleachIds.biomeSoulSocietyForestID = config.get("Biomes", "Soul Society Forest Biome ID", 221).getInt();
    
    BleachIds.debugItemID = config.get("Bleach Mod Items", "Debug item", 15000).getInt();
    

    config.save();
  }
}
