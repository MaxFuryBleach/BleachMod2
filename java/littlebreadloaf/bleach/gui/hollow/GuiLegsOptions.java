package littlebreadloaf.bleach.gui.hollow;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.network.internal.FMLNetworkHandler;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import java.util.List;
import littlebreadloaf.bleach.BleachMod;
import littlebreadloaf.bleach.events.ExtendedPlayer;
import littlebreadloaf.bleach.network.HollowPieceMessage;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.PlayerCapabilities;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class GuiLegsOptions extends GuiScreen
{
  ResourceLocation texture = new ResourceLocation("bleach".toLowerCase(), "textures/guis/legs_select_gui.png");
  public final int xSizeOfTexture = 256;
  public final int ySizeOfTexture = 171;
  

  EntityPlayer thePlayer;
  
  ExtendedPlayer props;
  
  private int id = -1;
  private int choice = 1;
  
  String line1;
  String line2;
  String line3;
  
  public GuiLegsOptions(EntityPlayer player)
  {
    this.thePlayer = player;
    this.props = ExtendedPlayer.get(player);
  }
  
  int points = 0;
  
  public void drawScreen(int x, int y, float f) {
    drawDefaultBackground();
    
    GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
    ScaledResolution var5 = new ScaledResolution(this.mc, this.mc.displayWidth, this.mc.displayHeight);
    int var6 = var5.getScaledWidth();
    int var7 = var5.getScaledHeight();
    FontRenderer var8 = this.mc.fontRenderer;
    Minecraft.getMinecraft().getTextureManager().bindTexture(this.texture);
    
    int posX = (this.width - 256) / 2;
    int posY = (this.height - 171) / 2;
    drawTexturedModalRect(posX, posY, 0, 0, 256, 171);
    drawTexturedModalRect(posX + 140, posY + 10, 86 * (this.choice - 1) + 1, 172, 83, 83);
    
    String var35 = "";
    if (this.choice == 1)
    {
      this.line1 = "  Gives the player";
      this.line2 = "various agility boosts";
      this.line3 = " like speed and jump.";
      this.points = 1;
    }
    if (this.choice == 2)
    {
      this.line1 = "  Hold shift to ";
      this.line2 = " protect yourself";
      this.line3 = "from all knockback";
      this.points = 1;
    }
    if (this.choice == 3)
    {
      this.line1 = "Allows the player to";
      this.line2 = "climb up any wall by";
      this.line3 = " walking towards it";
      this.points = 2;
    }
    var35 = "Costs " + this.points + " Point" + (this.points > 1 ? "s" : "");
    String var34 = "Free Points: " + this.props.getCurrentHPoints();
    var8.drawString(var34, var6 / 2 - 117, var7 / 2 + 70, 0);
    
    var8.drawString(this.line1, var6 / 2 - 30, var7 / 2 + 15, 0);
    var8.drawString(this.line2, var6 / 2 - 30, var7 / 2 + 25, 0);
    var8.drawString(this.line3, var6 / 2 - 30, var7 / 2 + 35, 0);
    var8.drawString(var35, (this.width - 256) / 2 + 107, (this.height - 171) / 2 + 135, 0);
    

    super.drawScreen(x, y, f);
  }
  
  public void initGui()
  {
    int posX = (this.width - 256) / 2;
    int posY = (this.height - 171) / 2;
    

    this.buttonList.add(new GuiButton(0, posX + 5, posY + 20, 80, 20, "Jumper Legs"));
    this.buttonList.add(new GuiButton(1, posX + 5, posY + 70, 80, 20, "Heavy Legs"));
    this.buttonList.add(new GuiButton(2, posX + 5, posY + 120, 80, 20, "Crawler Legs"));
    this.buttonList.add(new GuiButton(3, posX + 110, posY + 145, 50, 20, "Accept"));
    this.buttonList.add(new GuiButton(4, posX + 200, posY + 145, 50, 20, "Cancel"));
  }
  



  EntityClientPlayerMP player = FMLClientHandler.instance().getClient().thePlayer;
  
  public void actionPerformed(GuiButton button) { switch (button.id)
    {

    case 0: 
      this.choice = 1;
      break;
    
    case 1: 
      this.choice = 2;
      break;
    
    case 2: 
      this.choice = 3;
      break;
    case 3: 
      if ((ExtendedPlayer.get(this.player).getCurrentHPoints() >= this.points) || (this.player.capabilities.isCreativeMode))
      {
        BleachMod.network.sendToServer(new HollowPieceMessage(4, this.choice, this.points));
        ((ExtendedPlayer)this.thePlayer.getExtendedProperties("BleachPlayer")).setLegs(this.choice);
      }
      this.mc.displayGuiScreen((GuiScreen)null);
      break;
    case 4: 
      this.mc.displayGuiScreen((GuiScreen)null);
      FMLNetworkHandler.openGui(this.player, BleachMod.instance, 3, this.player.worldObj, (int)this.player.posX, (int)this.player.posY, (int)this.player.posZ);
      break;
    }
    
  }
  



  public boolean doesGuiPauseGame()
  {
    return true;
  }
}
