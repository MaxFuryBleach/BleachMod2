package littlebreadloaf.bleach.render;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;
import littlebreadloaf.bleach.BleachIds;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.IBlockAccess;
import org.lwjgl.opengl.GL11;

public class RenderGraveStone extends TileEntitySpecialRenderer implements ISimpleBlockRenderingHandler
{
  private final ResourceLocation TEXTURE_LANTERN = new ResourceLocation("bleach:textures/models/paper_lantern.png");
  
  public static ModelBase model = new ModelBase() {};
  
  private ModelRenderer b5;
  
  private ModelRenderer b4;
  
  private ModelRenderer b3;
  
  private ModelRenderer b2;
  private ModelRenderer b1;
  private ModelRenderer b6;
  private ModelRenderer b7;
  private ModelRenderer b8;
  private ModelRenderer b9;
  
  public RenderGraveStone()
  {
    model.textureWidth = 64;
    model.textureHeight = 128;
    
    this.b5 = new ModelRenderer(model, 0, 41);
    this.b5.addBox(-7.0F, 0.0F, -7.0F, 14, 6, 14);
    this.b5.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.b5.setTextureSize(64, 128);
    this.b5.mirror = true;
    setRotation(this.b5, 0.0F, 0.0F, 0.0F);
    this.b4 = new ModelRenderer(model, 0, 27);
    this.b4.addBox(-6.0F, -2.0F, -6.0F, 12, 2, 12);
    this.b4.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.b4.setTextureSize(64, 128);
    this.b4.mirror = true;
    setRotation(this.b4, 0.0F, 0.0F, 0.0F);
    this.b3 = new ModelRenderer(model, 0, 16);
    this.b3.addBox(-5.0F, -3.0F, -5.0F, 10, 1, 10);
    this.b3.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.b3.setTextureSize(64, 128);
    this.b3.mirror = true;
    setRotation(this.b3, 0.0F, 0.0F, 0.0F);
    this.b2 = new ModelRenderer(model, 0, 7);
    this.b2.addBox(-4.0F, -4.0F, -4.0F, 8, 1, 8);
    this.b2.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.b2.setTextureSize(64, 128);
    this.b2.mirror = true;
    setRotation(this.b2, 0.0F, 0.0F, 0.0F);
    this.b1 = new ModelRenderer(model, 0, 0);
    this.b1.addBox(-3.0F, -5.0F, -3.0F, 6, 1, 6);
    this.b1.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.b1.setTextureSize(64, 128);
    this.b1.mirror = true;
    setRotation(this.b1, 0.0F, 0.0F, 0.0F);
    this.b6 = new ModelRenderer(model, 0, 61);
    this.b6.addBox(-6.0F, 6.0F, -6.0F, 12, 2, 12);
    this.b6.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.b6.setTextureSize(64, 128);
    this.b6.mirror = true;
    setRotation(this.b6, 0.0F, 0.0F, 0.0F);
    this.b7 = new ModelRenderer(model, 0, 75);
    this.b7.addBox(-5.0F, 8.0F, -5.0F, 10, 1, 10);
    this.b7.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.b7.setTextureSize(64, 128);
    this.b7.mirror = true;
    setRotation(this.b7, 0.0F, 0.0F, 0.0F);
    this.b8 = new ModelRenderer(model, 0, 86);
    this.b8.addBox(-4.0F, 9.0F, -4.0F, 8, 1, 8);
    this.b8.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.b8.setTextureSize(64, 128);
    this.b8.mirror = true;
    setRotation(this.b8, 0.0F, 0.0F, 0.0F);
    this.b9 = new ModelRenderer(model, 0, 95);
    this.b9.addBox(-3.0F, 10.0F, -3.0F, 6, 1, 6);
    this.b9.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.b9.setTextureSize(64, 128);
    this.b9.mirror = true;
    setRotation(this.b9, 0.0F, 0.0F, 0.0F);
  }
  

  public void render(float f5)
  {
    GL11.glDisable(2884);
    this.b5.render(f5);
    this.b4.render(f5);
    this.b3.render(f5);
    this.b2.render(f5);
    this.b1.render(f5);
    this.b6.render(f5);
    this.b7.render(f5);
    this.b8.render(f5);
    this.b9.render(f5);
    GL11.glEnable(2884);
  }
  

  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  

  public void renderTileEntityAt(TileEntity tile, double x, double y, double z, float f)
  {
    GL11.glPushMatrix();
    GL11.glTranslated(x + 0.5D, y + 0.68D, z + 0.5D);
    GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
    
    Minecraft.getMinecraft().renderEngine.bindTexture(this.TEXTURE_LANTERN);
    render(0.0625F);
    GL11.glPopMatrix();
  }
  

  public void renderInventoryBlock(Block block, int metadata, int modelID, RenderBlocks renderer)
  {
    GL11.glPushMatrix();
    GL11.glPushAttrib(8192);
    GL11.glEnable(2929);
    GL11.glTranslated(0.0D, 0.30000001192092896D, 0.0D);
    GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
    GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F);
    FMLClientHandler.instance().getClient().renderEngine.bindTexture(this.TEXTURE_LANTERN);
    render(0.0625F);
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
    return BleachIds.lanternRenderingID;
  }
}
