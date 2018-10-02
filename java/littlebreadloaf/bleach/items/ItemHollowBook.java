package littlebreadloaf.bleach.items;

import cpw.mods.fml.common.network.internal.FMLNetworkHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import littlebreadloaf.bleach.BleachMod;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;


public class ItemHollowBook
  extends Item
{
  public final int itemUseDuration;
  
  public ItemHollowBook()
  {
    setCreativeTab(BleachItems.tabBleach);
    setUnlocalizedName("hollow_book");
    this.itemUseDuration = 32;
    this.maxStackSize = 1;
  }
  


  @SideOnly(Side.CLIENT)
  public void registerIcons(IIconRegister icon)
  {
    this.itemIcon = icon.registerIcon("bleach".toLowerCase() + ":" + "hollow_book");
  }
  








  public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
  {
    FMLNetworkHandler.openGui(par3EntityPlayer, BleachMod.instance, 1, par2World, (int)par3EntityPlayer.posX, (int)par3EntityPlayer.posY, (int)par3EntityPlayer.posZ);
    

    return par1ItemStack;
  }
}
