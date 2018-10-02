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


public class CommandResetHollow
  extends CommandBase
{
  public String getCommandName()
  {
    return "resethollow";
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
    props.setArms(0);
    props.setBack(0);
    props.setHColor(0);
    props.setHead(0);
    props.setHTex(0);
    props.setLegs(0);
    props.setMColor(0);
    props.setTail(0);
    props.setTotalHPoints(0);
    props.subtractCurrentHPoints(props.getCurrentHPoints());
    var3.addChatMessage(new ChatComponentText("Resetting Hollow"));
    BleachMod.network.sendTo(new ClientSyncMessage(var3), (EntityPlayerMP)var3);
  }
  


  public String getCommandUsage(ICommandSender icommandsender)
  {
    return "/resethollow";
  }
}
