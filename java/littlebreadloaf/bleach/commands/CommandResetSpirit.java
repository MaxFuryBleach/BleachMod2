package littlebreadloaf.bleach.commands;

import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import littlebreadloaf.bleach.BleachMod;
import littlebreadloaf.bleach.events.ExtendedPlayer;
import littlebreadloaf.bleach.network.ClientSyncMessage;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.ChatComponentText;


public class CommandResetSpirit
  extends CommandBase
{
  public String getCommandName()
  {
    return "resetspirit";
  }
  

  public int getRequiredPermissionLevel()
  {
    return 0;
  }
  

  public void processCommand(ICommandSender par1ICommandSender, String[] par2ArrayOfStr)
  {
    EntityPlayer var3 = getCommandSenderAsPlayer(par1ICommandSender);
    ExtendedPlayer props = (ExtendedPlayer)var3.getExtendedProperties("BleachPlayer");
    props.setCapMin();
    var3.addChatMessage(new ChatComponentText("Resetting spiritual energy"));
    BleachMod.network.sendTo(new ClientSyncMessage(var3), (EntityPlayerMP)var3);
  }
  


  public String getCommandUsage(ICommandSender icommandsender)
  {
    return "/resetspirit";
  }
}
