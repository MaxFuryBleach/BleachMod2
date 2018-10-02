package littlebreadloaf.bleach.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import littlebreadloaf.bleach.BleachIds;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;








public class BleachBlocks
{
  public static Block reiatsuBlock;
  public static Block hollowBait;
  public static Block maskOre;
  public static Block purpleGoo;
  public static Block reiatsuOre;
  public static Block sekkiseki;
  public static Block soulQuartzOre;
  public static Block soulQuartzBlock;
  public static Block soulQuartzLamp;
  public static Block whitesand;
  public static Block paperwall;
  public static Block paperdoor;
  public static Block hollowdiamond;
  public static Block hollowemerald;
  public static Block hollowgold;
  public static Block paperLamp;
  public static Block seeleSchneiderBlock;
  public static Block shikaiIceBlock;
  public static Block poisonShroom;
  
  public static void init()
  {
    reiatsuBlock = new BlockReiatsu().setBlockTextureName("bleachreiatsu_block");
    
    hollowBait = new BlockHollowBait().setBlockTextureName("bleachhollow_bait");
    
    maskOre = new BlockMaskOre().setBlockTextureName("bleachmask_ore");
    
    purpleGoo = new BlockPurpleGoo().setBlockTextureName("bleachpurple_goo");
    
    reiatsuOre = new BlockReiatsuOre().setBlockTextureName("bleachreiatsu_ore");
    
    sekkiseki = new BlockSekkiseki(BleachIds.sekkisekiID).setBlockTextureName("bleachsekkiseki");
    
    soulQuartzOre = new BlockSoulQuartzOre().setBlockTextureName("bleachsoul_quartz_ore");
    
    soulQuartzBlock = new BlockSoulQuartzBlock().setBlockTextureName("bleachsoul_quartz_block");
    
    soulQuartzLamp = new BlockSoulQuartzLamp().setBlockTextureName("bleachsoul_quartz_lamp");
    
    whitesand = new BlockWhiteSand().setBlockTextureName("bleachwhite_sand");
    
    paperwall = new BlockPaperWall("paper_wall", "paper_wall", Material.wood, true).setHardness(5.0F).setResistance(10.0F).setBlockName("paper_wall").setBlockTextureName("bleachpaper_wall");
    



    hollowdiamond = new BlockHollowDiamond().setBlockTextureName("bleachhollow_diamond");
    
    hollowemerald = new BlockHollowEmerald().setBlockTextureName("bleachhollow_emerald");
    
    hollowgold = new BlockHollowGold().setBlockTextureName("bleachhollow_gold");
    



    paperLamp = new BlockLantern(Material.glass).setBlockTextureName("bleachlantern");
    
    seeleSchneiderBlock = new BlockSeeleSchneider(Material.iron);
    

    shikaiIceBlock = new BlockShikaiIce();
    
    poisonShroom = new BlockPoisonShroom();
  }
  
  public static void registerBlocks()
  {
    GameRegistry.registerBlock(reiatsuBlock, "Reiatsu Block");
    GameRegistry.registerBlock(hollowBait, "Hollow Bait");
    GameRegistry.registerBlock(maskOre, "Mask Ore");
    GameRegistry.registerBlock(purpleGoo, "Precipice Plasma");
    GameRegistry.registerBlock(reiatsuOre, "Reiatsu Ore");
    GameRegistry.registerBlock(sekkiseki, "Sekkiseki");
    GameRegistry.registerBlock(soulQuartzOre, "Soul Quartz Ore");
    GameRegistry.registerBlock(soulQuartzBlock, "Soul Quartz Block");
    GameRegistry.registerBlock(soulQuartzLamp, "Soul Quartz Lamp");
    GameRegistry.registerBlock(whitesand, "White Sand");
    GameRegistry.registerBlock(paperwall, "Paper Wall");
    GameRegistry.registerBlock(hollowdiamond, "Diamond Hollow Block");
    GameRegistry.registerBlock(hollowemerald, "Emerald Hollow Block");
    GameRegistry.registerBlock(hollowgold, "Gold Hollow Block");
    GameRegistry.registerBlock(paperLamp, "Paper Lantern");
    GameRegistry.registerBlock(seeleSchneiderBlock, "Seeleschneider Block");
    GameRegistry.registerBlock(shikaiIceBlock, "Temporary Ice Block");
    GameRegistry.registerBlock(poisonShroom, "Poison Mushroom");
  }
}
