package littlebreadloaf.bleach.commands;

import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import littlebreadloaf.bleach.BleachMod;
import littlebreadloaf.bleach.events.ExtendedPlayer;
import littlebreadloaf.bleach.network.ClientSyncMessage;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.management.ServerConfigurationManager;
import net.minecraft.util.ChatComponentText;

public class CommandSpirit extends CommandBase
{
  public String getCommandName()
  {
    return "spirit";
  }
  

  public int getRequiredPermissionLevel()
  {
    return 2;
  }
  

  public void processCommand(ICommandSender par1ICommandSender, String[] par2ArrayOfStr)
  {
    if ((par2ArrayOfStr.length >= 1) && (par2ArrayOfStr[0].length() > 0))
    {
      EntityPlayerMP entityplayermp = MinecraftServer.getServer().getConfigurationManager().func_152612_a(par2ArrayOfStr[0]);
      EntityPlayer var3 = entityplayermp;
      ExtendedPlayer props = (ExtendedPlayer)var3.getExtendedProperties("BleachPlayer");
      props.setCurrentEnergy(1.0F);
      var3.addChatMessage(new ChatComponentText("Full Spiritual Energy"));
      getCommandSenderAsPlayer(par1ICommandSender).addChatMessage(new ChatComponentText("Filling " + par2ArrayOfStr[0] + "'s Spiritual Energy"));
      BleachMod.network.sendTo(new ClientSyncMessage(var3), (EntityPlayerMP)var3);
    }
    else
    {
      EntityPlayer var3 = getCommandSenderAsPlayer(par1ICommandSender);
      ExtendedPlayer props = (ExtendedPlayer)var3.getExtendedProperties("BleachPlayer");
      props.setCurrentEnergy(1.0F);
      var3.addChatMessage(new ChatComponentText("Full Spiritual Energy"));
      BleachMod.network.sendTo(new ClientSyncMessage(var3), (EntityPlayerMP)var3);
    }
  }
  


  public String getCommandUsage(ICommandSender icommandsender)
  {
    return "/spirit [username]";
  }
}
