package littlebreadloaf.bleach.gui;

import java.io.PrintStream;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class GuiHollowBook
  extends GuiScreen
{
  ResourceLocation texture = new ResourceLocation("bleach".toLowerCase(), "textures/guis/hollowbook_gui.png");
  public final int xSizeOfTexture = 256;
  public final int ySizeOfTexture = 256;
  
  private int id = -1;
  

  public GuiHollowBook(EntityPlayer player) {}
  

  public void drawScreen(int x, int y, float f)
  {
    drawDefaultBackground();
    
    GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
    
    Minecraft.getMinecraft().getTextureManager().bindTexture(this.texture);
    
    int posX = (this.width - 256) / 2;
    int posY = (this.height - 256) / 2;
    drawTexturedModalRect(posX, posY, 0, 0, 256, 256);
    
    super.drawScreen(x, y, f);
  }
  
  public void initGui() {
    int posX = (this.width - 256) / 2;
    int posY = (this.height - 256) / 2;
  }
  
  public void actionPerformed(GuiButton button) {
    switch (button.id) {
    case 0:  System.out.println("pressed");
      break;
    }
    
  }
  
  public boolean doesGuiPauseGame()
  {
    return false;
  }
}
