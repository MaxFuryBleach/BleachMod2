package littlebreadloaf.bleach.gui;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import java.util.List;
import littlebreadloaf.bleach.BleachMod;
import littlebreadloaf.bleach.events.ExtendedPlayer;
import littlebreadloaf.bleach.network.FlashMessage;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class GuiFaction extends GuiScreen
{
  ResourceLocation texture = new ResourceLocation("bleach".toLowerCase(), "textures/guis/faction_gui.png");
  public final int xSizeOfTexture = 256;
  public final int ySizeOfTexture = 256;
  

  EntityPlayer thePlayer;
  

  private int id = -1;
  
  public GuiFaction(EntityPlayer player)
  {
    this.thePlayer = player;
  }
  
  public void drawScreen(int x, int y, float f)
  {
    drawDefaultBackground();
    
    GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
    
    Minecraft.getMinecraft().getTextureManager().bindTexture(this.texture);
    
    int posX = (this.width - 256) / 2;
    int posY = (this.height - 256) / 2;
    drawTexturedModalRect(posX, posY + 50, 0, 0, 256, 256);
    
    super.drawScreen(x, y, f);
  }
  
  public void initGui()
  {
    int posX = (this.width - 256) / 2;
    int posY = (this.height - 256) / 2;
    

    this.buttonList.add(new GuiButton(0, posX + 130, posY + 100, 100, 20, "Shinigami"));
    this.buttonList.add(new GuiButton(1, posX + 10, posY + 100, 100, 20, "Quincy"));
    
    this.buttonList.add(new GuiButton(3, posX + 10, posY + 180, 100, 20, "Human"));
  }
  

  EntityClientPlayerMP player = FMLClientHandler.instance().getClient().thePlayer;
  
  public void actionPerformed(GuiButton button) { switch (button.id)
    {

    case 0: 
      BleachMod.network.sendToServer(new FlashMessage(11));
      ((ExtendedPlayer)this.thePlayer.getExtendedProperties("BleachPlayer")).setFaction(1);
      this.mc.displayGuiScreen((GuiScreen)null);
      break;
    
    case 1: 
      BleachMod.network.sendToServer(new FlashMessage(12));
      ((ExtendedPlayer)this.thePlayer.getExtendedProperties("BleachPlayer")).setFaction(2);
      this.mc.displayGuiScreen((GuiScreen)null);
      break;
    case 2: 
      BleachMod.network.sendToServer(new FlashMessage(13));
      ((ExtendedPlayer)this.thePlayer.getExtendedProperties("BleachPlayer")).setFaction(3);
      this.mc.displayGuiScreen((GuiScreen)null);
      break;
    case 3: 
      BleachMod.network.sendToServer(new FlashMessage(14));
      ((ExtendedPlayer)this.thePlayer.getExtendedProperties("BleachPlayer")).setFaction(3);
      this.mc.displayGuiScreen((GuiScreen)null);
      break;
    }
    
  }
  



  public boolean doesGuiPauseGame()
  {
    return true;
  }
}
