package littlebreadloaf.bleach.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;


public class ItemSoulSteel
  extends Item
{
  public final int itemUseDuration;
  
  public ItemSoulSteel()
  {
    setCreativeTab(BleachItems.tabBleach);
    setUnlocalizedName("soul_steel");
    this.itemUseDuration = 32;
  }
  


  @SideOnly(Side.CLIENT)
  public void registerIcons(IIconRegister icon)
  {
    this.itemIcon = icon.registerIcon("bleach".toLowerCase() + ":" + "soul_steel");
  }
  

  public int getMaxItemUseDuration(ItemStack par1ItemStack)
  {
    return 32;
  }
  

  public EnumAction getItemUseAction(ItemStack par1ItemStack)
  {
    return null;
  }
}
