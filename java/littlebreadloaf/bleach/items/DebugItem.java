package littlebreadloaf.bleach.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Random;
import littlebreadloaf.bleach.BleachIds;
import littlebreadloaf.bleach.events.ExtendedPlayer;
import littlebreadloaf.bleach.world.HuecoMundoTeleporter;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.management.ServerConfigurationManager;
import net.minecraft.world.World;

public class DebugItem
  extends Item
{
  Random rand = new Random();
  





  public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player)
  {
    ExtendedPlayer props = ExtendedPlayer.get(player);
    if ((player.isSneaking()) && ((player instanceof EntityPlayerMP)))
    {
      EntityPlayerMP playermp = (EntityPlayerMP)player;
      if (playermp.dimension == BleachIds.worldHuecoMundoID)
      {
        playermp.mcServer.getConfigurationManager().transferPlayerToDimension(playermp, 0, new HuecoMundoTeleporter(playermp.mcServer.worldServerForDimension(0)));
      }
      else {
        playermp.mcServer.getConfigurationManager().transferPlayerToDimension(playermp, BleachIds.worldHuecoMundoID, new HuecoMundoTeleporter(playermp.mcServer.worldServerForDimension(BleachIds.worldHuecoMundoID)));
      }
    }
    

    return stack;
  }
  


  @SideOnly(Side.CLIENT)
  public void registerIcons(IIconRegister icon)
  {
    this.itemIcon = icon.registerIcon("bleach".toLowerCase() + ":" + "garganta");
  }
}
