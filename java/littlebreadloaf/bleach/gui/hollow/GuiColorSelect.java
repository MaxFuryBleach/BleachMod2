package littlebreadloaf.bleach.gui.hollow;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.network.internal.FMLNetworkHandler;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import java.util.List;
import java.util.Random;
import littlebreadloaf.bleach.BleachMod;
import littlebreadloaf.bleach.events.ExtendedPlayer;
import littlebreadloaf.bleach.network.HollowPieceMessage;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.PlayerCapabilities;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class GuiColorSelect
  extends GuiScreen
{
  Random rand = new Random();
  ResourceLocation texture = new ResourceLocation("bleach".toLowerCase(), "textures/guis/color_select_gui.png");
  public final int xSizeOfTexture = 256;
  public final int ySizeOfTexture = 171;
  

  EntityPlayer thePlayer;
  
  ExtendedPlayer props;
  
  private int id = -1;
  private int choice = this.rand.nextInt(16);
  private int choice2 = this.rand.nextInt(16);
  
  String line1;
  String line2;
  String line3;
  
  public GuiColorSelect(EntityPlayer player)
  {
    this.thePlayer = player;
    this.props = ExtendedPlayer.get(player); }
  
  public static final float[][] colorTable = { { 1.0F, 1.0F, 1.0F }, { 0.85F, 0.5F, 0.2F }, { 0.7F, 0.3F, 0.85F }, { 0.4F, 0.6F, 0.85F }, { 0.9F, 0.9F, 0.2F }, { 0.5F, 0.8F, 0.1F }, { 0.95F, 0.5F, 0.65F }, { 0.3F, 0.3F, 0.3F }, { 0.6F, 0.6F, 0.6F }, { 0.3F, 0.5F, 0.6F }, { 0.5F, 0.25F, 0.7F }, { 0.2F, 0.3F, 0.7F }, { 0.4F, 0.3F, 0.2F }, { 0.4F, 0.5F, 0.2F }, { 0.6F, 0.2F, 0.2F }, { 0.1F, 0.1F, 0.1F } };
  

  public void drawScreen(int x, int y, float f)
  {
    drawDefaultBackground();
    

    GL11.glColor3f(colorTable[this.choice][0], colorTable[this.choice][1], colorTable[this.choice][2]);
    
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
    
    this.line1 = "Background color is your";
    this.line2 = "  Hollow's base color.";
    this.line3 = "Click Randomize to change.";
    var35 = "Costs 1 Point";
    
    String var34 = "Free Points: " + this.props.getCurrentHPoints();
    var8.drawString(var34, var6 / 2 - 117, var7 / 2 + 70, 0);
    
    var8.drawString(this.line1, var6 / 2 - 20, var7 / 2 - 45, 0);
    var8.drawString(this.line2, var6 / 2 - 20, var7 / 2 - 35, 0);
    var8.drawString(this.line3, var6 / 2 - 20, var7 / 2 - 25, 0);
    var8.drawString(var35, (this.width - 256) / 2 + 107, (this.height - 171) / 2 + 135, 0);
    

    super.drawScreen(x, y, f);
  }
  
  public void initGui()
  {
    int posX = (this.width - 256) / 2;
    int posY = (this.height - 171) / 2;
    

    this.buttonList.add(new GuiButton(0, posX + 5, posY + 60, 80, 20, "Randomize"));
    
    this.buttonList.add(new GuiButton(1, posX + 110, posY + 145, 50, 20, "Accept"));
    this.buttonList.add(new GuiButton(2, posX + 200, posY + 145, 50, 20, "Cancel"));
  }
  





  EntityClientPlayerMP player = FMLClientHandler.instance().getClient().thePlayer;
  
  public void actionPerformed(GuiButton button) { switch (button.id)
    {

    case 0: 
      this.choice = this.rand.nextInt(16);
      
      break;
    case 1: 
      if ((ExtendedPlayer.get(this.player).getCurrentHPoints() >= 1) || (this.player.capabilities.isCreativeMode))
      {
        BleachMod.network.sendToServer(new HollowPieceMessage(5, this.choice, 1));
        ((ExtendedPlayer)this.thePlayer.getExtendedProperties("BleachPlayer")).setHColor(this.choice);
      }
      this.mc.displayGuiScreen((GuiScreen)null);
      break;
    case 2: 
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
