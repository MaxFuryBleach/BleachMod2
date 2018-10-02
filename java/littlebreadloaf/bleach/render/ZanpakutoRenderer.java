package littlebreadloaf.bleach.render;

import cpw.mods.fml.client.FMLClientHandler;
import littlebreadloaf.bleach.events.ExtendedPlayer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.IItemRenderer.ItemRenderType;
import net.minecraftforge.client.IItemRenderer.ItemRendererHelper;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;
import org.lwjgl.opengl.GL11;

public class ZanpakutoRenderer implements IItemRenderer
{
  public IModelCustom zanpakuto1;
  private ResourceLocation TEXTURE_ZANPAKUTO_1;
  private ResourceLocation TEXTURE_SWORD;
  
  public ZanpakutoRenderer()
  {
    this.TEXTURE_ZANPAKUTO_1 = new ResourceLocation("bleach".toLowerCase() + ":models/Zanpakuto.png");
    
    this.TEXTURE_SWORD = new ResourceLocation("bleach".toLowerCase() + ":models/Zanpakuto.obj");
    if (this.TEXTURE_SWORD != null) {
      this.zanpakuto1 = AdvancedModelLoader.loadModel(this.TEXTURE_SWORD);
    }
  }
  


  public boolean handleRenderType(ItemStack item, IItemRenderer.ItemRenderType type)
  {
    return ExtendedPlayer.getIs3D();
  }
  


  public boolean shouldUseRenderHelper(IItemRenderer.ItemRenderType type, ItemStack item, IItemRenderer.ItemRendererHelper helper)
  {
    return true;
  }
  

  public void renderItem(IItemRenderer.ItemRenderType type, ItemStack item, Object... data)
  {
    GL11.glPushMatrix();
    
    GL11.glDisable(2896);
    float scale;
    switch (type)
    {

    case ENTITY: 
      scale = 0.15F;
      GL11.glScalef(scale, scale, scale);
      break;
    case EQUIPPED: 
      GL11.glTranslated(1.2000000476837158D, 0.5D, 1.2000000476837158D);
      
      GL11.glRotatef(0.0F, 0.0F, 0.0F, 1.0F);
      GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
      GL11.glRotatef(-55.0F, 1.0F, 0.0F, 0.0F);
      scale = 0.3F;
      GL11.glScalef(scale, scale, scale);
      
      break;
    case INVENTORY: 
      GL11.glRotatef(-45.0F, 0.0F, 1.0F, 0.0F);
      GL11.glRotatef(20.0F, 0.0F, 0.0F, 1.0F);
      GL11.glRotatef(45.0F, 1.0F, 0.0F, 0.0F);
      
      scale = 0.14F;
      GL11.glScalef(scale, scale, scale);
      
      GL11.glTranslated(0.0D, -7.400000095367432D, 0.0D);
      
      break;
    case EQUIPPED_FIRST_PERSON: 
      GL11.glTranslated(-0.5D, 0.0D, 0.30000001192092896D);
      
      GL11.glRotatef(-45.0F, 0.0F, 1.0F, 0.0F);
      

      GL11.glTranslated(0.30000001192092896D, 0.800000011920929D, -0.10000000149011612D);
      
      GL11.glRotatef(186.0F, 0.0F, 1.0F, 0.0F);
      scale = 0.12F;
      GL11.glScalef(scale, scale, scale);
      
      break;
    }
    
    

    FMLClientHandler.instance().getClient().renderEngine.bindTexture(getTextureForItem(item));
    
    getModelForItem(item).renderAll();
    

    GL11.glEnable(2896);
    GL11.glPopMatrix();
  }
  
  private ResourceLocation getTextureForItem(ItemStack item)
  {
    return this.TEXTURE_ZANPAKUTO_1;
  }
  
  private IModelCustom getModelForItem(ItemStack item)
  {
    return this.zanpakuto1;
  }
}
