package littlebreadloaf.bleach.render;

import java.awt.Color;
import littlebreadloaf.bleach.events.ExtendedPlayer;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.glu.Sphere;









public class RenderingHelper
{
  public static void drawCeroSphere(double x, double y, double z, float r, int slices, int stacks, EntityMob entity)
  {
    GL11.glPushMatrix();
    GL11.glTranslated(x, y, z);
    
    GL11.glTranslated(2.0D, 0.0D, 0.0D);
    

    GL11.glDisable(2884);
    GL11.glDisable(2896);
    GL11.glColor3f(1.0F, 0.0F, 0.0F);
    
    new Sphere().draw(r, 10, 10);
    GL11.glColor3f(1.0F, 1.0F, 1.0F);
    
    GL11.glEnable(2884);
    GL11.glEnable(2896);
    
    GL11.glPopMatrix();
  }
  
  public static Color getColorFromPlayer(EntityPlayer entity)
  {
    Color color = new Color(0);
    
    if (entity == null) {
      return color;
    }
    ExtendedPlayer props = (ExtendedPlayer)entity.getExtendedProperties("BleachPlayer");
    
    switch (props.getZType())
    {
    case 0: 
      color = Color.RED;
      break;
    case 1: 
      color = Color.GREEN;
      break;
    case 2: 
      color = Color.BLUE;
    }
    
    

    return color;
  }
  
  public static void renderBeam(float x, float y, float z, float i, float j, float k)
  {
    float height = 0.1F;
    
    float dist = (float)Math.sqrt((x - i) * (x - i) + (y - j) * (y - j) + (z - k) * (z - k));
    float repeat = dist;
    
    GL11.glTexCoord2f(0.0F, 0.0F);
    GL11.glVertex3f(x, y - height, z);
    GL11.glTexCoord2f(0.0F, 1.0F);
    GL11.glVertex3f(x, y + height, z);
    GL11.glTexCoord2f(1.0F * repeat, 1.0F);
    GL11.glVertex3d(i, j + 0.3F + height, k);
    GL11.glTexCoord2f(1.0F * repeat, 0.0F);
    GL11.glVertex3d(i, j + 0.3F - height, k);
  }
  

  public static void renderBeam(float x, float y, float z, double i, double j, double k)
  {
    renderBeam(x, y, z, (float)i, (float)j, (float)k);
  }
  
  public static void renderFacingQuad(double x, double y, double z, float scale)
  {
    GL11.glPushMatrix();
    GL11.glTranslated(x, y, z);
    applyFloatingRotations();
    GL11.glScaled(0.1F * scale, 0.1F * scale, 1.0D);
    
    int h = 1;
    int w = 1;
    






    GL11.glBegin(7);
    GL11.glTexCoord2f(0.0F, 1.0F);
    GL11.glVertex3f(-w, -h, 0.001F);
    GL11.glTexCoord2f(0.0F, 0.0F);
    GL11.glVertex3f(-w, h, 0.001F);
    GL11.glTexCoord2f(1.0F, 0.0F);
    GL11.glVertex3f(w, h, 0.001F);
    GL11.glTexCoord2f(1.0F, 1.0F);
    GL11.glVertex3f(w, -h, 0.001F);
    GL11.glEnd();
    

    GL11.glPopMatrix();
  }
  
  private static void applyFloatingRotations()
  {
    GL11.glRotatef(-RenderManager.instance.playerViewY, 0.0F, 1.0F, 0.0F);
    GL11.glRotatef(RenderManager.instance.playerViewX, 1.0F, 0.0F, 0.0F);
  }
}
