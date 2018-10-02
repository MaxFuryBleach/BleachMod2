package littlebreadloaf.bleach.render;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;
import java.awt.Color;
import littlebreadloaf.bleach.BleachIds;
import littlebreadloaf.bleach.tiles.TileSphereLamp;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.IBlockAccess;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.glu.Sphere;


public class RenderSphereLamp
  extends TileEntitySpecialRenderer
  implements ISimpleBlockRenderingHandler
{
  private static ResourceLocation TEXTURE_SPHERE_LAMP = new ResourceLocation("bleach".toLowerCase() + ":/models/sphereLamp.png");
  
  public static void render(TileEntity tile)
  {
    FMLClientHandler.instance().getClient().renderEngine.bindTexture(TEXTURE_SPHERE_LAMP);
    GL11.glRotatef(90.0F, 1.0F, 0.0F, 1.0F);
    new Sphere().draw(1.0F, 20, 18);
  }
  


  public void renderTileEntityAt(TileEntity tile, double x, double y, double z, float f)
  {
    GL11.glPushMatrix();
    GL11.glTranslated(x + 0.5D, y + 0.5D, z + 0.5D);
    float scale = 0.5F;
    GL11.glScalef(scale, scale, scale);
    
    if ((tile instanceof TileSphereLamp))
    {
      TileSphereLamp lampTile = (TileSphereLamp)tile;
      Color color = RenderingHelper.getColorFromPlayer(lampTile.getOwnerEntity());
      GL11.glColor3f(color.getRed(), color.getGreen(), color.getBlue());
    }
    
    render(tile);
    
    GL11.glPopMatrix();
  }
  


  public void renderInventoryBlock(Block block, int metadata, int modelID, RenderBlocks renderer)
  {
    GL11.glPushMatrix();
    GL11.glPushAttrib(8192);
    GL11.glEnable(2929);
    GL11.glTranslated(0.0D, 0.0D, 0.0D);
    float scale = 0.7F;
    GL11.glScalef(scale, scale, scale);
    GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
    
    Color color = RenderingHelper.getColorFromPlayer(FMLClientHandler.instance().getClient().thePlayer);
    GL11.glColor3f(color.getRed(), color.getGreen(), color.getBlue());
    
    render(null);
    GL11.glPopAttrib();
    GL11.glPopMatrix();
  }
  

  public boolean renderWorldBlock(IBlockAccess world, int x, int y, int z, Block block, int modelId, RenderBlocks renderer)
  {
    return false;
  }
  

  public boolean shouldRender3DInInventory(int modelId)
  {
    return true;
  }
  

  public int getRenderId()
  {
    return BleachIds.sphereLampRenderID;
  }
}
