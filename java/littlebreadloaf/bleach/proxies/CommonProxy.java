package littlebreadloaf.bleach.proxies;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.eventhandler.EventBus;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import java.util.HashMap;
import littlebreadloaf.bleach.events.BleachPlayerTickHandler;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetHandlerPlayServer;
import net.minecraft.world.World;








public class CommonProxy
  implements IGuiHandler
{
  private static HashMap<String, NBTTagCompound> extendedEntityData = new HashMap();
  


  public void initRenderers() {}
  


  public int addArmor(String string)
  {
    return 0;
  }
  

  public Object getServerGuiElement(int guiId, EntityPlayer player, World world, int x, int y, int z)
  {
    return null;
  }
  

  public Object getClientGuiElement(int guiId, EntityPlayer player, World world, int x, int y, int z)
  {
    return null;
  }
  
  public static void storeEntityData(String name, NBTTagCompound compound)
  {
    extendedEntityData.put(name, compound);
  }
  
  public static NBTTagCompound getEntityData(String name)
  {
    return (NBTTagCompound)extendedEntityData.remove(name);
  }
  
  public void loadParts()
  {
    FMLCommonHandler.instance().bus().register(new BleachPlayerTickHandler());
  }
  



  public void loadGUI() {}
  


  public void loadKeys() {}
  


  public void initZanpakutoRenderers() {}
  


  public ModelBiped getArmorModel(int id)
  {
    return null;
  }
  


  public void loadMessages() {}
  

  public EntityPlayer getPlayerFromMessage(MessageContext ctx)
  {
    return ctx.getServerHandler().playerEntity;
  }
}
