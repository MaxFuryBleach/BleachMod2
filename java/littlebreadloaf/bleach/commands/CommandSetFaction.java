package littlebreadloaf.bleach.commands;

import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import java.util.List;
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

public class CommandSetFaction
  extends CommandBase
{
  public String getCommandName()
  {
    return "setfaction";
  }
  

  public int getRequiredPermissionLevel()
  {
    return 2;
  }
  


  public void processCommand(ICommandSender par1ICommandSender, String[] par2ArrayOfStr)
  {
    EntityPlayer var3 = getCommandSenderAsPlayer(par1ICommandSender);
    ExtendedPlayer props = (ExtendedPlayer)var3.getExtendedProperties("BleachPlayer");
    int faction = 0;
    if (par2ArrayOfStr.length == 1)
    {
      faction = getTypeToSet(par1ICommandSender, par2ArrayOfStr[0]);
      var3.addChatMessage(new ChatComponentText("Setting faction to " + par2ArrayOfStr[0]));
    }
    
    if (par2ArrayOfStr.length > 1)
    {
      EntityPlayerMP entityplayermp = MinecraftServer.getServer().getConfigurationManager().func_152612_a(par2ArrayOfStr[0]);
      var3 = entityplayermp;
      props = (ExtendedPlayer)var3.getExtendedProperties("BleachPlayer");
      faction = getTypeToSet(par1ICommandSender, par2ArrayOfStr[1]);
      var3.addChatMessage(new ChatComponentText("Setting faction to " + par2ArrayOfStr[1]));
      getCommandSenderAsPlayer(par1ICommandSender).addChatMessage(new ChatComponentText("Setting " + par2ArrayOfStr[0] + "'s faction to " + par2ArrayOfStr[1]));
    }
    props.setFaction(faction + 1);
    
    BleachMod.network.sendTo(new ClientSyncMessage(var3), (EntityPlayerMP)var3);
  }
  











  protected int getTypeToSet(ICommandSender par1ICommandSender, String par2Str)
  {
    return !par2Str.equalsIgnoreCase("shinigami") ? 1 : !par2Str.equalsIgnoreCase("quincy") ? 2 : !par2Str.equalsIgnoreCase("hollow") ? 3 : !par2Str.equalsIgnoreCase("arrancar") ? 4 : !par2Str.equalsIgnoreCase("vizard") ? 5 : !par2Str.equalsIgnoreCase("human") ? parseIntBounded(par1ICommandSender, par2Str, 0, 5) : 0;
  }
  




  public List addTabCompletionOptions(ICommandSender par1ICommandSender, String[] par2ArrayOfStr)
  {
    return par2ArrayOfStr.length == 1 ? getListOfStringsMatchingLastWord(par2ArrayOfStr, new String[] { "shinigami", "quincy", "hollow", "arrancar", "vizard", "human" }) : null;
  }
  

  public String getCommandUsage(ICommandSender icommandsender)
  {
    return "/setfaction {username} [quincy, shinigami, human]";
  }
}
