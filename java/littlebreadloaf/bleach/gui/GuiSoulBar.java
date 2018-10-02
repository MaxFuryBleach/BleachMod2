package littlebreadloaf.bleach.gui;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import littlebreadloaf.bleach.events.ExtendedPlayer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.profiler.Profiler;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent.ElementType;
import org.lwjgl.opengl.GL11;

@SideOnly(Side.CLIENT)
public class GuiSoulBar extends Gui
{
  private Minecraft mc;
  private static final ResourceLocation texture = new ResourceLocation("bleach".toLowerCase(), "textures/guis/spirit_bar.png");
  

  public GuiSoulBar(Minecraft mc)
  {
    this.mc = mc;
  }
  
  int flux = 0;
  boolean neg = false;
  
  @SubscribeEvent
  public void onRenderExperienceBar(RenderGameOverlayEvent event)
  {
    ScaledResolution var5 = new ScaledResolution(this.mc, this.mc.displayWidth, this.mc.displayHeight);
    int var6 = var5.getScaledWidth();
    int var7 = var5.getScaledHeight();
    int var233 = var7 / 2 - 63;
    int var181 = var6 - 12;
    
    if ((event.isCancelable()) || (event.type != RenderGameOverlayEvent.ElementType.EXPERIENCE))
    {
      return;
    }
    
    ExtendedPlayer props = (ExtendedPlayer)this.mc.thePlayer.getExtendedProperties("BleachPlayer");
    
    if ((props == null) || (props.getCurrentCap() == 0))
    {
      return;
    }
    
    GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
    GL11.glDisable(2896);
    this.mc.getTextureManager().bindTexture(texture);
    FontRenderer var8 = this.mc.fontRenderer;
    
    if (props.getFaction() != 0)
    {
      int var111 = var7;
      short var21 = 91;
      int var22 = (int)(props.getCurrentEnergy() * (var21 + 1));
      int var29 = 91 - var22;
      drawTexturedModalRect(var181, var233, 0, 84, 10, var21);
      drawTexturedModalRect(var181, var233 + var29, 10, 84 + var29, 10, 91);
      
      this.mc.mcProfiler.endStartSection("SoulLevel");
      int var12 = 1953999;
      String var34 = "" + (int)(props.getCurrentEnergy() * props.getCurrentCap());
      int var182 = var6 - var8.getStringWidth(var34) + 10;
      var8.drawString(var34, var182 - 10, var233 + 43, 0);
      var8.drawString(var34, var182 - 12, var233 + 43, 0);
      var8.drawString(var34, var182 - 11, var233 + 42, 0);
      var8.drawString(var34, var182 - 11, var233 + 44, 0);
      var8.drawString(var34, var182 - 11, var233 + 43, var12);
    }
    











    this.mc.mcProfiler.startSection("isShinigami");
    boolean flag1 = false;
    int i2 = 1953999;
    String s;
    String s; if (props.getFaction() == 1)
    {
      s = "Shinigami";
    } else { String s;
      if (props.getFaction() == 2)
      {
        s = "Quincy";
      } else { String s;
        if (props.getFaction() == 3)
        {

          if (props.getCurrentHPoints() > 0)
          {
            if (this.neg) {
              this.flux += 256;
            } else {
              this.flux -= 256;
            }
            if (this.flux < 62976)
              this.neg = true;
            if (this.flux > 25600)
              this.neg = false;
            i2 = 15019520 + this.flux;
          }
          s = "Hollow";
        } else { String s;
          if (props.getFaction() == 4)
          {
            s = "Arrancar";
          } else { String s;
            if (props.getFaction() == 5)
            {
              s = "Vizard";
            } else { String s;
              if (props.getFaction() == 6)
              {
                s = "Human";
              }
              else
              {
                s = "Human"; }
            } } } } }
    int l2 = (var6 - var8.getStringWidth(s)) / 2;
    int k2 = 5;
    boolean flag2 = false;
    var8.drawString(s, l2 + 1, k2, 0);
    var8.drawString(s, l2 - 1, k2, 0);
    var8.drawString(s, l2, k2 + 1, 0);
    var8.drawString(s, l2, k2 - 1, 0);
    var8.drawString(s, l2, k2, i2);
    this.mc.mcProfiler.endSection();
  }
}
