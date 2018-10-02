package littlebreadloaf.bleach.gui.hollow;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.network.internal.FMLNetworkHandler;
import java.util.List;
import littlebreadloaf.bleach.BleachMod;
import littlebreadloaf.bleach.events.ExtendedPlayer;
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

public class GuiHollowSelect
  extends GuiScreen
{
  ResourceLocation texture = new ResourceLocation("bleach".toLowerCase(), "textures/guis/hollow_select_gui.png");
  public final int xSizeOfTexture = 256;
  public final int ySizeOfTexture = 171;
  

  EntityPlayer thePlayer;
  
  ExtendedPlayer props;
  
  private int id = -1;
  
  public GuiHollowSelect(EntityPlayer player)
  {
    this.thePlayer = player;
    this.props = ExtendedPlayer.get(player);
  }
  
  public void drawScreen(int x, int y, float f)
  {
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
    
    String var34 = "Free Points: " + (this.player.capabilities.isCreativeMode ? "Inf." : Integer.valueOf(this.props.getCurrentHPoints()));
    String var35 = "Hollow Evolution";
    var8.drawString(var34, (var6 - var8.getStringWidth(var34)) / 2, var7 / 2 + 70, 0);
    
    var8.drawString(var35, (var6 - var8.getStringWidth(var34)) / 2 + 1, var7 / 2 - 70, 0);
    var8.drawString(var35, (var6 - var8.getStringWidth(var34)) / 2 - 1, var7 / 2 - 70, 0);
    var8.drawString(var35, (var6 - var8.getStringWidth(var34)) / 2, var7 / 2 - 69, 0);
    var8.drawString(var35, (var6 - var8.getStringWidth(var34)) / 2, var7 / 2 - 71, 0);
    var8.drawString(var35, (var6 - var8.getStringWidth(var34)) / 2, var7 / 2 - 70, 1953999);
    super.drawScreen(x, y, f);
  }
  
  public void initGui()
  {
    int posX = (this.width - 256) / 2;
    int posY = (this.height - 171) / 2;
    
    if ((this.props.getHead() == 0) || (this.player.capabilities.isCreativeMode))
      this.buttonList.add(new GuiButton(0, posX + 190, posY + 5, 50, 20, "Head"));
    if ((this.props.getBack() == 0) || (this.player.capabilities.isCreativeMode))
      this.buttonList.add(new GuiButton(1, posX + 15, posY + 15, 50, 20, "Torso"));
    if ((this.props.getArms() == 0) || (this.player.capabilities.isCreativeMode))
      this.buttonList.add(new GuiButton(2, posX + 200, posY + 55, 50, 20, "Arms"));
    if ((this.props.getTail() == 0) || (this.player.capabilities.isCreativeMode))
      this.buttonList.add(new GuiButton(3, posX + 10, posY + 60, 50, 20, "Tail"));
    if ((this.props.getLegs() == 0) || (this.player.capabilities.isCreativeMode))
      this.buttonList.add(new GuiButton(4, posX + 15, posY + 125, 50, 20, "Legs"));
    this.buttonList.add(new GuiButton(5, posX + 190, posY + 130, 50, 20, "Color"));
  }
  

  EntityClientPlayerMP player = FMLClientHandler.instance().getClient().thePlayer;
  
  public void actionPerformed(GuiButton button) { switch (button.id)
    {


    case 0: 
      this.mc.displayGuiScreen((GuiScreen)null);
      FMLNetworkHandler.openGui(this.player, BleachMod.instance, 4, this.player.worldObj, (int)this.player.posX, (int)this.player.posY, (int)this.player.posZ);
      break;
    
    case 1: 
      this.mc.displayGuiScreen((GuiScreen)null);
      FMLNetworkHandler.openGui(this.player, BleachMod.instance, 5, this.player.worldObj, (int)this.player.posX, (int)this.player.posY, (int)this.player.posZ);
      break;
    
    case 2: 
      this.mc.displayGuiScreen((GuiScreen)null);
      FMLNetworkHandler.openGui(this.player, BleachMod.instance, 10, this.player.worldObj, (int)this.player.posX, (int)this.player.posY, (int)this.player.posZ);
      break;
    
    case 3: 
      this.mc.displayGuiScreen((GuiScreen)null);
      FMLNetworkHandler.openGui(this.player, BleachMod.instance, 7, this.player.worldObj, (int)this.player.posX, (int)this.player.posY, (int)this.player.posZ);
      break;
    case 4: 
      this.mc.displayGuiScreen((GuiScreen)null);
      FMLNetworkHandler.openGui(this.player, BleachMod.instance, 8, this.player.worldObj, (int)this.player.posX, (int)this.player.posY, (int)this.player.posZ);
      break;
    case 5: 
      this.mc.displayGuiScreen((GuiScreen)null);
      FMLNetworkHandler.openGui(this.player, BleachMod.instance, 9, this.player.worldObj, (int)this.player.posX, (int)this.player.posY, (int)this.player.posZ);
      break;
    }
    
  }
  




  public boolean doesGuiPauseGame()
  {
    return true;
  }
}
