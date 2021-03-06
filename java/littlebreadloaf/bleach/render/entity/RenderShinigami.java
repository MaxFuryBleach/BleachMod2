package littlebreadloaf.bleach.render.entity;

import littlebreadloaf.bleach.entities.EntityShinigami;
import littlebreadloaf.bleach.events.ExtendedPlayer;
import littlebreadloaf.bleach.items.BleachItems;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.ItemRenderer;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.IItemRenderer.ItemRenderType;
import net.minecraftforge.client.IItemRenderer.ItemRendererHelper;
import net.minecraftforge.client.MinecraftForgeClient;
import org.lwjgl.opengl.GL11;





public class RenderShinigami
  extends RenderBiped
{
  private static final ResourceLocation texture1 = new ResourceLocation("bleach".toLowerCase() + ":textures/models/mobs/shinigami.png");
  private static final ResourceLocation texture2 = new ResourceLocation("bleach".toLowerCase() + ":textures/models/mobs/shinigami1.png");
  private static final ResourceLocation texture3 = new ResourceLocation("bleach".toLowerCase() + ":textures/models/mobs/shinigami2.png");
  private static final ResourceLocation texture4 = new ResourceLocation("bleach".toLowerCase() + ":textures/models/mobs/shinigami3.png");
  private static final ResourceLocation texture5 = new ResourceLocation("bleach".toLowerCase() + ":textures/models/mobs/shinigami4.png");
  private static final ResourceLocation texture6 = new ResourceLocation("bleach".toLowerCase() + ":textures/models/mobs/shinigami5.png");
  private static final ResourceLocation texture7 = new ResourceLocation("bleach".toLowerCase() + ":textures/models/mobs/shinigami6.png");
  private static final ResourceLocation texture8 = new ResourceLocation("bleach".toLowerCase() + ":textures/models/mobs/shinigami7.png");
  private static final ResourceLocation texture9 = new ResourceLocation("bleach".toLowerCase() + ":textures/models/mobs/shinigami8.png");
  private static final ResourceLocation texture10 = new ResourceLocation("bleach".toLowerCase() + ":textures/models/mobs/shinigami9.png");
  private static final ResourceLocation texture11 = new ResourceLocation("bleach".toLowerCase() + ":textures/models/mobs/shinigami10.png");
  protected ModelBiped model;
  
  public RenderShinigami(ModelBiped par1ModelBiped, float par2)
  {
    super(par1ModelBiped, par2);
    this.model = ((ModelBiped)this.mainModel);
  }
  

  protected void renderEquippedItems(EntityLiving par1EntityLiving, float par2)
  {
    ItemStack itemstack = par1EntityLiving.getHeldItem();
    if (ExtendedPlayer.getIs3D())
    {
      float f1 = 1.0F;
      GL11.glColor3f(f1, f1, f1);
      

      if (itemstack != null)
      {
        GL11.glPushMatrix();
        
        if (this.mainModel.isChild)
        {
          float f2 = 0.5F;
          GL11.glTranslatef(0.0F, 0.625F, 0.0F);
          GL11.glRotatef(-20.0F, -1.0F, 0.0F, 0.0F);
          GL11.glScalef(f2, f2, f2);
        }
        
        this.modelBipedMain.bipedRightArm.postRender(0.0625F);
        

        IItemRenderer customRenderer = MinecraftForgeClient.getItemRenderer(itemstack, IItemRenderer.ItemRenderType.EQUIPPED);
        boolean is3D = (customRenderer != null) && (customRenderer.shouldUseRenderHelper(IItemRenderer.ItemRenderType.EQUIPPED, itemstack, IItemRenderer.ItemRendererHelper.BLOCK_3D));
        
        if (itemstack.getItem() == BleachItems.zanpakuto)
        {
          float f2 = 0.4F;
          GL11.glScalef(f2, f2, f2);
          
          GL11.glTranslatef(0.13F, -0.15F, -0.75F);
          GL11.glRotatef(45.0F, 0.0F, 0.0F, 1.0F);
          GL11.glRotatef(-45.0F, 0.0F, 1.0F, 0.0F);
          GL11.glRotatef(-55.0F, 1.0F, 0.0F, 0.0F);
          
          customRenderer.renderItem(IItemRenderer.ItemRenderType.EQUIPPED, itemstack, new Object[0]);
        }
        



        GL11.glPopMatrix();
      }
    }
    else
    {
      float f1 = 1.0F;
      GL11.glColor3f(f1, f1, f1);
      

      if (itemstack != null)
      {
        GL11.glPushMatrix();
        
        if (this.mainModel.isChild)
        {
          float f2 = 1.0F;
          GL11.glTranslatef(0.0F, 0.625F, 0.0F);
          GL11.glRotatef(-20.0F, -1.0F, 0.0F, 0.0F);
          GL11.glScalef(f2, f2, f2);
        }
        
        this.modelBipedMain.bipedRightArm.postRender(0.0625F);
        


        if (itemstack.getItem() == BleachItems.zanpakuto)
        {
          float f2 = 0.725F;
          GL11.glScalef(f2, f2, f2);
          

          GL11.glTranslatef(-0.15F, 0.8F, 0.0F);
          
          GL11.glRotatef(-129.0F, 14.2F, -9.0F, 9.0F);
          GL11.glRotatef(-10.0F, 0.0F, 6.4F, -0.0F);
          GL11.glRotated(33.0D, 0.0D, -178.0D, -9.0D);
          GL11.glRotated(175.0D, 0.0D, -180.0D, -12.0D);
          GL11.glRotatef(-26.0F, 0.0F, 0.0F, -0.0F);
          
          this.renderManager.itemRenderer.renderItem(par1EntityLiving, itemstack, 0);
        }
        


        GL11.glPopMatrix();
      }
    }
  }
  
  public void renderShinigami(EntityShinigami par1, double par2, double par3, double par4, float par5, float par6)
  {
    super.doRender(par1, par2, par3, par4, par5, par6);
  }
  


  public void doRender(Entity par1, double par2, double par3, double par4, float par5, float par6)
  {
    renderShinigami((EntityShinigami)par1, par2, par3, par4, par5, par6);
  }
  
  protected ResourceLocation getEntityTexture(Entity entity)
  {
    switch (((EntityShinigami)entity).getTexture())
    {
    case 0: 
      return texture2;
    case 1: 
      return texture3;
    case 2: 
      return texture4;
    case 3: 
      return texture5;
    case 4: 
      return texture6;
    case 5: 
      return texture7;
    case 6: 
      return texture8;
    case 7: 
      return texture9;
    case 8: 
      return texture10;
    case 9: 
      return texture11;
    }
    return texture1;
  }
}
