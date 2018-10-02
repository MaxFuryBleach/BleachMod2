package littlebreadloaf.bleach.extras;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent.KeyInputEvent;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import littlebreadloaf.bleach.BleachMod;
import littlebreadloaf.bleach.network.ActivateMessage;
import littlebreadloaf.bleach.network.DeactivateMessage;
import littlebreadloaf.bleach.network.FlashMessage;
import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.player.EntityPlayer;




public class BleachKeyHandler
{
  public static final int FLASH = 0;
  public static final int ACTIVATE = 1;
  public static final int DEACTIVATE = 2;
  public static final int HOLLOW = 3;
  public static final int CERO = 4;
  Minecraft mc = Minecraft.getMinecraft();
  EntityPlayer Player = this.mc.thePlayer;
  


  private static final String[] desc = { "key.flash.desc", "key.activate.desc", "key.deactivate.desc", "key.hollow.desc", "key.cero.desc" };
  

  private static final int[] keyValues = { 46, 45, 44, 47, 48 };
  private final KeyBinding[] keys;
  
  public BleachKeyHandler() {
    this.keys = new KeyBinding[desc.length];
    for (int i = 0; i < desc.length; i++) {
      this.keys[i] = new KeyBinding(desc[i], keyValues[i], "key.bleach.category");
      ClientRegistry.registerKeyBinding(this.keys[i]);
    }
  }
  


  @SubscribeEvent
  public void onKeyInput(InputEvent.KeyInputEvent event)
  {
    if ((!FMLClientHandler.instance().getClient().inGameHasFocus) || 
    
      (this.keys[0].isPressed()))
    {
      BleachMod.network.sendToServer(new FlashMessage(1));
    }
    if (this.keys[1].isPressed())
    {
      BleachMod.network.sendToServer(new ActivateMessage());
    }
    if (this.keys[2].isPressed())
    {
      BleachMod.network.sendToServer(new DeactivateMessage());
    }
    if (this.keys[3].isPressed())
    {
      BleachMod.network.sendToServer(new FlashMessage(4));
    }
    if (this.keys[4].isPressed())
    {
      BleachMod.network.sendToServer(new FlashMessage(2));
    }
  }
}
