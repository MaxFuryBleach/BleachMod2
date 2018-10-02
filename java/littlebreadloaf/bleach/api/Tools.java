package littlebreadloaf.bleach.api;

import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class Tools
{
  public static Item.ToolMaterial SOUL = EnumHelper.addToolMaterial("Soul", 1, -1, 6.0F, 1.0F, 14);
  public static Item.ToolMaterial SHIKAI = EnumHelper.addToolMaterial("Shikai", 1, -1, 7.0F, 2.0F, 14);
  public static Item.ToolMaterial SHINAI = EnumHelper.addToolMaterial("Shinai", 1, -1, 2.0F, 1.0F, 14);
  
  public static ItemArmor.ArmorMaterial MASK = EnumHelper.addArmorMaterial("Mask", -1, new int[] { 0, 0, 0, 0 }, 0);
  public static ItemArmor.ArmorMaterial SOULS = EnumHelper.addArmorMaterial("Souls", -1, new int[] { 0, 4, 2, 1 }, 0);
  public static ItemArmor.ArmorMaterial QUINCY = EnumHelper.addArmorMaterial("Quincy", -1, new int[] { 0, 3, 1, 1 }, 0);
  
  public static EnumCreatureAttribute SPIRIT = EnumHelper.addCreatureAttribute("Spirit");
}
