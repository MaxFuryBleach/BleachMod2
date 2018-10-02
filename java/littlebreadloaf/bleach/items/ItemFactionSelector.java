package littlebreadloaf.bleach.items;

import cpw.mods.fml.common.network.internal.FMLNetworkHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import littlebreadloaf.bleach.BleachMod;
import littlebreadloaf.bleach.events.ExtendedPlayer;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;


public class ItemFactionSelector
  extends Item
{
  public final int itemUseDuration;
  
  public ItemFactionSelector()
  {
    setCreativeTab(BleachItems.tabBleach);
    setUnlocalizedName("faction_selector");
    this.itemUseDuration = 32;
    this.maxStackSize = 1;
  }
  


  @SideOnly(Side.CLIENT)
  public void registerIcons(IIconRegister icon)
  {
    this.itemIcon = icon.registerIcon("bleach".toLowerCase() + ":" + "faction_selector");
  }
  








  public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
  {
    if (((ExtendedPlayer)par3EntityPlayer.getExtendedProperties("BleachPlayer")).getFaction() == 0)
    {
      FMLNetworkHandler.openGui(par3EntityPlayer, BleachMod.instance, 2, par2World, (int)par3EntityPlayer.posX, (int)par3EntityPlayer.posY, (int)par3EntityPlayer.posZ);
      par1ItemStack.stackSize -= 1;
    }
    return par1ItemStack;
  }
}
