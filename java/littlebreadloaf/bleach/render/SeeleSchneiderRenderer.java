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

public class SeeleSchneiderRenderer implements IItemRenderer
{
  public IModelCustom model;
  public IModelCustom blade;
  private ResourceLocation TEXTURE_SEELESCHNEIDER;
  private ResourceLocation TEXTURE_MODEL;
  private ResourceLocation TEXTURE_BLADE;
  
  public SeeleSchneiderRenderer()
  {
    this.TEXTURE_SEELESCHNEIDER = new ResourceLocation("bleach".toLowerCase() + ":models/SeeleSchneider_Bottom.png");
    
    this.TEXTURE_MODEL = new ResourceLocation("bleach".toLowerCase() + ":models/SeeleSchneider.obj");
    this.TEXTURE_BLADE = new ResourceLocation("bleach".toLowerCase() + ":models/SeeleSchneider_Blade.obj");
    
    this.model = AdvancedModelLoader.loadModel(this.TEXTURE_MODEL);
    this.blade = AdvancedModelLoader.loadModel(this.TEXTURE_BLADE);
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
    float scale; switch (type)
    {
    case ENTITY: 
      scale = 0.01F;
      GL11.glScalef(scale, scale, scale);
      break;
    case EQUIPPED: 
      GL11.glRotatef(135.0F, 0.0F, 1.0F, 0.0F);
      GL11.glRotatef(110.0F, 0.0F, 0.0F, 1.0F);
      GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
      
      GL11.glTranslated(1.0D, -2.200000047683716D, 0.0D);
      
      scale = 0.025F;
      
      GL11.glScalef(scale, scale, scale);
      
      break;
    case INVENTORY: 
      GL11.glTranslated(1.5D, 0.0D, 0.5D);
      GL11.glRotatef(45.0F, 1.0F, 0.0F, 1.0F);
      GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
      GL11.glRotatef(-20.0F, 1.0F, 0.0F, 0.0F);
      if (item.getItemDamage() == 0) {
        scale = 0.022F;
      } else {
        scale = 0.008F;
      }
      GL11.glScalef(scale, scale, scale);
      

      break;
    case EQUIPPED_FIRST_PERSON: 
      GL11.glTranslated(-0.5D, -0.4000000059604645D, 0.6000000238418579D);
      
      GL11.glRotatef(50.0F, 0.0F, 1.0F, 0.0F);
      

      GL11.glTranslated(0.30000001192092896D, 0.800000011920929D, -0.10000000149011612D);
      
      GL11.glRotatef(186.0F, 0.0F, 1.0F, 0.0F);
      scale = 0.01F;
      GL11.glScalef(scale, scale, scale);
      
      break;
    }
    
    

    FMLClientHandler.instance().getClient().renderEngine.bindTexture(getTextureForItem(item));
    
    if (item.getItemDamage() == 1)
    {
      this.blade.renderAll();
    }
    getModelForItem(item).renderAll();
    

    GL11.glEnable(2896);
    GL11.glPopMatrix();
  }
  
  private ResourceLocation getTextureForItem(ItemStack item)
  {
    return this.TEXTURE_SEELESCHNEIDER;
  }
  
  private IModelCustom getModelForItem(ItemStack item)
  {
    return this.model;
  }
}
