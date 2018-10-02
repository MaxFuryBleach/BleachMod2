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

public class CommandSetType
  extends CommandBase
{
  public String getCommandName()
  {
    return "settype";
  }
  

  public int getRequiredPermissionLevel()
  {
    return 2;
  }
  

  public void processCommand(ICommandSender par1ICommandSender, String[] par2ArrayOfStr)
  {
    EntityPlayer var4 = getCommandSenderAsPlayer(par1ICommandSender);
    ExtendedPlayer props = (ExtendedPlayer)var4.getExtendedProperties("BleachPlayer");
    int var5 = 0;
    

    if (par2ArrayOfStr.length == 3)
    {
      EntityPlayerMP entityplayermp = MinecraftServer.getServer().getConfigurationManager().func_152612_a(par2ArrayOfStr[0]);
      var4 = entityplayermp;
      props = (ExtendedPlayer)var4.getExtendedProperties("BleachPlayer");
      var5 = parseIntBounded(par1ICommandSender, par2ArrayOfStr[2], 0, 4);
      getCommandSenderAsPlayer(par1ICommandSender).addChatMessage(new ChatComponentText("Setting " + par2ArrayOfStr[0] + "'s Type to " + par2ArrayOfStr[1]));
      var4.addChatMessage(new ChatComponentText("Zanpakuto Type set to " + par2ArrayOfStr[1]));
      if (getTypeToSet(par1ICommandSender, par2ArrayOfStr[1]) < 12)
      {
        props.setType(getTypeToSet(par1ICommandSender, par2ArrayOfStr[1]));
        props.setZType(getTypeToSet(par1ICommandSender, par2ArrayOfStr[1]) + 1);
      }
      else
      {
        props.resetType();
      }
    }
    

    if (par2ArrayOfStr.length == 2)
    {
      if (MinecraftServer.getServer().getConfigurationManager().func_152612_a(par2ArrayOfStr[0]) != null)
      {
        EntityPlayerMP entityplayermp = MinecraftServer.getServer().getConfigurationManager().func_152612_a(par2ArrayOfStr[0]);
        var4 = entityplayermp;
        props = (ExtendedPlayer)var4.getExtendedProperties("BleachPlayer");
        var4.addChatMessage(new ChatComponentText("Zanpakuto Type set to " + par2ArrayOfStr[1]));
        getCommandSenderAsPlayer(par1ICommandSender).addChatMessage(new ChatComponentText("Setting " + par2ArrayOfStr[0] + "'s Type to " + par2ArrayOfStr[1]));
        if (getTypeToSet(par1ICommandSender, par2ArrayOfStr[1]) < 12)
        {
          props.setType(getTypeToSet(par1ICommandSender, par2ArrayOfStr[1]));
          props.setZType(getTypeToSet(par1ICommandSender, par2ArrayOfStr[1]) + 1);
        }
        else
        {
          props.resetType();
        }
      }
      else
      {
        var5 = parseIntBounded(par1ICommandSender, par2ArrayOfStr[1], 0, 4);
        if (getTypeToSet(par1ICommandSender, par2ArrayOfStr[0]) < 12)
        {
          props.setType(getTypeToSet(par1ICommandSender, par2ArrayOfStr[0]));
          props.setZType(getTypeToSet(par1ICommandSender, par2ArrayOfStr[0]) + 1);
        }
        else
        {
          props.resetType();
        }
        var4.addChatMessage(new ChatComponentText("Setting Zanpakuto Type to " + par2ArrayOfStr[0]));
      }
    }
    
    if (par2ArrayOfStr.length == 1)
    {
      int var3 = getTypeToSet(par1ICommandSender, par2ArrayOfStr[0]);
      if (var3 != 12)
      {
        props.setType(var3);
        props.setZType(var3 + 1);
      }
      if (var3 == 12)
      {
        props.resetType();
      }
      var4.addChatMessage(new ChatComponentText("Zanpakuto Type set to " + par2ArrayOfStr[0]));
    }
    


    props.setTexture(var5);
    BleachMod.network.sendTo(new ClientSyncMessage(var4), (EntityPlayerMP)var4);
  }
  





  protected int getTypeToSet(ICommandSender par1ICommandSender, String par2Str)
  {
    return !par2Str.equalsIgnoreCase("fire") ? 1 : !par2Str.equalsIgnoreCase("ice") ? 2 : !par2Str.equalsIgnoreCase("poison") ? 3 : !par2Str.equalsIgnoreCase("heal") ? 4 : !par2Str.equalsIgnoreCase("earth") ? 5 : !par2Str.equalsIgnoreCase("wind") ? 6 : !par2Str.equalsIgnoreCase("light") ? 7 : !par2Str.equalsIgnoreCase("dark") ? 8 : !par2Str.equalsIgnoreCase("lunar") ? 9 : !par2Str.equalsIgnoreCase("lightning") ? 10 : !par2Str.equalsIgnoreCase("normal") ? 11 : !par2Str.equalsIgnoreCase("water") ? 12 : !par2Str.equalsIgnoreCase("null") ? parseIntBounded(par1ICommandSender, par2Str, 0, 12) : 0;
  }
  




  public List addTabCompletionOptions(ICommandSender par1ICommandSender, String[] par2ArrayOfStr)
  {
    return par2ArrayOfStr.length == 1 ? getListOfStringsMatchingLastWord(par2ArrayOfStr, new String[] { "fire", "ice", "poison", "heal", "earth", "wind", "light", "dark", "lunar", "lightning", "normal", "water", "null" }) : null;
  }
  

  public String getCommandUsage(ICommandSender icommandsender)
  {
    return "/settype {username} <type> [texture 0-4] ";
  }
}
