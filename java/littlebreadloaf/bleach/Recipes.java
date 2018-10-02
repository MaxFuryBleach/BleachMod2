package littlebreadloaf.bleach;

import cpw.mods.fml.common.registry.GameRegistry;
import littlebreadloaf.bleach.armor.Armor;
import littlebreadloaf.bleach.blocks.BleachBlocks;
import littlebreadloaf.bleach.items.BleachItems;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;




public class Recipes
{
  public static void init()
  {
    GameRegistry.addRecipe(new ItemStack(BleachBlocks.reiatsuBlock, 1), new Object[] { "***", "***", "***", Character.valueOf('*'), BleachItems.reiatsu });
    






    GameRegistry.addRecipe(new ItemStack(BleachItems.reiatsu, 9), new Object[] { "*", Character.valueOf('*'), BleachBlocks.reiatsuBlock });
    





    GameRegistry.addRecipe(new ItemStack(BleachItems.shinai, 1), new Object[] { "*", "*", "#", Character.valueOf('*'), Items.reeds, Character.valueOf('#'), Items.stick });
    







    GameRegistry.addRecipe(new ItemStack(BleachBlocks.hollowBait, 1), new Object[] { " * ", "*#*", " * ", Character.valueOf('*'), BleachBlocks.reiatsuBlock, Character.valueOf('#'), BleachItems.maskshard });
    






    GameRegistry.addRecipe(new ItemStack(BleachBlocks.paperwall, 8), new Object[] { "*#*", "###", "*#*", Character.valueOf('*'), BleachItems.soulcloth, Character.valueOf('#'), Items.stick });
    






    GameRegistry.addRecipe(new ItemStack(BleachItems.soulcloth, 1), new Object[] { "***", "*#*", "***", Character.valueOf('*'), BleachItems.reiatsu, Character.valueOf('#'), BleachBlocks.reiatsuBlock });
    






    GameRegistry.addRecipe(new ItemStack(BleachItems.zanpakuto, 1), new Object[] { "*", "*", "#", Character.valueOf('*'), BleachBlocks.reiatsuBlock, Character.valueOf('#'), BleachItems.soulsteel });
    







    GameRegistry.addRecipe(new ItemStack(BleachItems.seele, 1), new Object[] { "*", "#", "#", Character.valueOf('*'), BleachBlocks.reiatsuBlock, Character.valueOf('#'), BleachItems.soulsteel });
    







    GameRegistry.addRecipe(new ItemStack(Armor.HollowHelmet, 1), new Object[] { "***", "***", "***", Character.valueOf('*'), BleachItems.maskshard });
    






    GameRegistry.addRecipe(new ItemStack(BleachItems.maskshard, 1), new Object[] { "*", Character.valueOf('*'), Armor.BatHelmet });
    GameRegistry.addRecipe(new ItemStack(BleachItems.maskshard, 1), new Object[] { "*", Character.valueOf('*'), Armor.SpiderHelmet });
    GameRegistry.addRecipe(new ItemStack(BleachItems.maskshard, 1), new Object[] { "*", Character.valueOf('*'), Armor.BlazeHelmet });
    GameRegistry.addRecipe(new ItemStack(BleachItems.maskshard, 1), new Object[] { "*", Character.valueOf('*'), Armor.SnakeHelmet });
    GameRegistry.addRecipe(new ItemStack(BleachItems.maskshard, 1), new Object[] { "*", Character.valueOf('*'), Armor.GolemHelmet });
    GameRegistry.addRecipe(new ItemStack(BleachItems.maskshard, 1), new Object[] { "*", Character.valueOf('*'), Armor.WaspHelmet });
    GameRegistry.addRecipe(new ItemStack(BleachItems.maskshard, 1), new Object[] { "*", Character.valueOf('*'), Armor.StalkerHelmet });
    GameRegistry.addRecipe(new ItemStack(BleachItems.maskshard, 2), new Object[] { "*", Character.valueOf('*'), BleachItems.oremask });
    GameRegistry.addRecipe(new ItemStack(BleachItems.maskshard, 1), new Object[] { "*", Character.valueOf('*'), Armor.WolfHelmet });
    GameRegistry.addRecipe(new ItemStack(BleachItems.maskshard, 1), new Object[] { "*", Character.valueOf('*'), BleachItems.fishermask });
    GameRegistry.addRecipe(new ItemStack(BleachItems.maskshard, 3), new Object[] { "*", Character.valueOf('*'), BleachItems.menosmask });
    



    GameRegistry.addRecipe(new ItemStack(BleachItems.soulsteel, 1), new Object[] { "***", "*#*", "***", Character.valueOf('*'), BleachItems.reiatsu, Character.valueOf('#'), Items.iron_ingot });
    






    GameRegistry.addRecipe(new ItemStack(BleachItems.quincypendant, 1, 0), new Object[] { " * ", "*#*", " * ", Character.valueOf('*'), BleachItems.soulsteel, Character.valueOf('#'), BleachBlocks.reiatsuBlock });
    





    ItemStack quincyPendant = new ItemStack(BleachItems.quincypendant, 1, 0);
    
    GameRegistry.addRecipe(new ItemStack(BleachItems.quincypendant, 1, 1), new Object[] { "* *", " # ", "* *", Character.valueOf('*'), BleachItems.soulsteel, Character.valueOf('#'), quincyPendant.getItem() });
    







    GameRegistry.addRecipe(new ItemStack(BleachBlocks.paperLamp, 2), new Object[] { "***", "&#&", "***", Character.valueOf('&'), BleachItems.soulcloth, Character.valueOf('#'), Blocks.torch, Character.valueOf('*'), Items.paper });
    







    GameRegistry.addShapelessRecipe(new ItemStack(BleachItems.hollowbook, 1), new Object[] { new ItemStack(BleachItems.maskshard), new ItemStack(Items.book) });
    


    GameRegistry.addRecipe(new ItemStack(Armor.ShiniRobe, 1), new Object[] { "* *", "***", "***", Character.valueOf('*'), BleachItems.soulcloth });
    





    GameRegistry.addRecipe(new ItemStack(Armor.ShiniPants, 1), new Object[] { "***", "* *", "* *", Character.valueOf('*'), BleachItems.soulcloth });
    





    GameRegistry.addRecipe(new ItemStack(Armor.Sandals, 1), new Object[] { "* *", "* *", Character.valueOf('*'), BleachItems.soulcloth });
    






    GameRegistry.addRecipe(new ItemStack(Armor.QuincyRobe, 1), new Object[] { "* *", "*#*", "*#*", Character.valueOf('*'), BleachItems.soulcloth, Character.valueOf('#'), Blocks.lapis_block });
    





    GameRegistry.addRecipe(new ItemStack(Armor.QuincyPants, 1), new Object[] { "###", "* *", "* *", Character.valueOf('*'), BleachItems.soulcloth, Character.valueOf('#'), Blocks.lapis_block });
    





    GameRegistry.addRecipe(new ItemStack(Armor.QuincyShoes, 1), new Object[] { "# #", "* *", Character.valueOf('*'), BleachItems.soulcloth, Character.valueOf('#'), Blocks.lapis_block });
  }
}
