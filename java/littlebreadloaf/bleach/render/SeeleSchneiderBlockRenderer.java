package littlebreadloaf.bleach.render;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.FMLLog;
import java.util.ArrayList;
import java.util.List;
import littlebreadloaf.bleach.tiles.TileSeeleSchneider;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;
import org.lwjgl.opengl.GL11;


public class SeeleSchneiderBlockRenderer
  extends TileEntitySpecialRenderer
{
  private ResourceLocation TEXTURE_SEELESCHNEIDER;
  private ResourceLocation TEXTURE_BEAM;
  private ResourceLocation TEXTURE_MODEL;
  private ResourceLocation TEXTURE_BLADE;
  private ResourceLocation TEXTURE_CIRCLE = new ResourceLocation("bleach:models/circle_gray.png");
  
  private IModelCustom model;
  private IModelCustom blade;
  
  public SeeleSchneiderBlockRenderer()
  {
    this.TEXTURE_SEELESCHNEIDER = new ResourceLocation("bleach:models/SeeleSchneider_Bottom.png");
    this.TEXTURE_BEAM = new ResourceLocation("bleach:models/beam_gray.png");
    
    this.TEXTURE_MODEL = new ResourceLocation("bleach:models/SeeleSchneider.obj");
    this.TEXTURE_BLADE = new ResourceLocation("bleach:models/SeeleSchneider_Blade.obj");
    

    this.model = AdvancedModelLoader.loadModel(this.TEXTURE_MODEL);
    this.blade = AdvancedModelLoader.loadModel(this.TEXTURE_BLADE);
  }
  


  public void renderTileEntityAt(TileEntity tileentity, double x, double y, double z, float f)
  {
    GL11.glPushMatrix();
    GL11.glDisable(2896);
    
    GL11.glTranslated(x + 0.5D, y + 1.5D, z + 0.5D);
    GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
    float scale = 0.01F;
    
    GL11.glScalef(scale, scale, scale);
    
    FMLClientHandler.instance().getClient().renderEngine.bindTexture(this.TEXTURE_SEELESCHNEIDER);
    
    this.blade.renderAll();
    this.model.renderAll();
    
    GL11.glEnable(2896);
    GL11.glPopMatrix();
    
    TileSeeleSchneider tile = (TileSeeleSchneider)tileentity;
    
    if (tile.isMain)
    {
      GL11.glPushMatrix();
      
      GL11.glDisable(2896);
      GL11.glDisable(2884);
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      
      GL11.glColor4f(1.0F / (tile.alpha * 50.0F + 120.0F), 1.0F, 1.0F, tile.alpha);
      
      GL11.glTranslated(x, y, z);
      



      FMLClientHandler.instance().getClient().renderEngine.bindTexture(this.TEXTURE_BEAM);
      
      GL11.glBegin(7);
      
      Entity entity = null;
      for (int i = 0; i < tile.getWorldObj().getLoadedEntityList().size(); i++)
      {
        entity = (Entity)tile.getWorldObj().getLoadedEntityList().get(i);
        if (((entity != null) && ((entity instanceof EntityLiving))) || ((entity instanceof EntityPlayer)))
        {
          if (isEntityInCube(entity))
          {
            FMLLog.info("Entity in cube", new Object[0]);
            RenderingHelper.renderBeam(0.5F, 1.5F, 0.5F, entity.posX - tile.xCoord, entity.posY - tile.yCoord - entity.yOffset, entity.posZ - tile.zCoord);
            RenderingHelper.renderBeam(tile.side + 0.5F, 1.5F, 0.5F, entity.posX - tile.xCoord, entity.posY - tile.yCoord - entity.yOffset, entity.posZ - tile.zCoord);
            RenderingHelper.renderBeam(0.5F, 1.5F, tile.side + 0.5F, entity.posX - tile.xCoord, entity.posY - tile.yCoord - entity.yOffset, entity.posZ - tile.zCoord);
            RenderingHelper.renderBeam(tile.side + 0.5F, 1.5F, tile.side + 0.5F, entity.posX - tile.xCoord, entity.posY - tile.yCoord - entity.yOffset, entity.posZ - tile.zCoord);
            
            GL11.glEnd();
            FMLClientHandler.instance().getClient().renderEngine.bindTexture(this.TEXTURE_CIRCLE);
            
            RenderingHelper.renderFacingQuad(0.5D, 1.5D, 0.5D, 1.5F);
            RenderingHelper.renderFacingQuad(tile.side + 0.5F, 1.5D, 0.5D, 1.5F);
            RenderingHelper.renderFacingQuad(0.5D, 1.5D, tile.side + 0.5F, 1.5F);
            RenderingHelper.renderFacingQuad(tile.side + 0.5F, 1.5D, tile.side + 0.5F, 1.5F);
            

            RenderingHelper.renderFacingQuad(entity.posX - tile.xCoord, entity.posY - tile.yCoord + 0.30000001192092896D - entity.yOffset, entity.posZ - tile.zCoord, 8.0F);
            

            FMLClientHandler.instance().getClient().renderEngine.bindTexture(this.TEXTURE_BEAM);
            
            GL11.glBegin(7);
          }
        }
      }
      
      GL11.glEnd();
      
      GL11.glDisable(3042);
      GL11.glEnable(2884);
      GL11.glEnable(2896);
      
      GL11.glPopMatrix();
    }
  }
  




  private boolean isEntityInCube(Entity entity)
  {
    for (int i = 0; i < TileSeeleSchneider.magicSquare.size(); i++)
    {
      int x = ((ChunkCoordinates)TileSeeleSchneider.magicSquare.get(i)).posX;
      int y = ((ChunkCoordinates)TileSeeleSchneider.magicSquare.get(i)).posY;
      int z = ((ChunkCoordinates)TileSeeleSchneider.magicSquare.get(i)).posZ;
      
      TileSeeleSchneider tile = (TileSeeleSchneider)entity.worldObj.getTileEntity(x, y, z);
      if (tile == null)
      {
        TileSeeleSchneider.magicSquare.remove(i);
        return false;
      }
      int side = tile.side;
      
      if ((entity.posX > x + 0.5F) && (entity.posX < x + side - 0.5F) && (entity.posZ > z + 0.5F) && (entity.posZ < z + side - 0.5F) && (entity.posY >= y))
      {
        return true;
      }
    }
    return false;
  }
}
