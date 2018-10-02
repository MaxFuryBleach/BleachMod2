package littlebreadloaf.bleach.render.models.armor;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelStalkerMask
  extends ModelBiped
{
  ModelRenderer jaw;
  ModelRenderer head;
  ModelRenderer hornLF;
  ModelRenderer hornLB;
  ModelRenderer hornRF;
  ModelRenderer hornRB;
  
  public ModelStalkerMask(float f)
  {
    super(f, 0.0F, 64, 64);
    this.textureWidth = 64;
    this.textureHeight = 64;
    
    this.jaw = new ModelRenderer(this, 0, 16);
    this.jaw.addBox(-3.0F, -3.0F, -6.5F, 6, 3, 4);
    this.jaw.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.jaw.setTextureSize(64, 64);
    this.jaw.mirror = true;
    setRotation(this.jaw, 0.2443461F, 0.0F, 0.0F);
    this.head = new ModelRenderer(this, 0, 0);
    this.head.addBox(-4.0F, -8.0F, -7.0F, 8, 7, 8);
    this.head.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.head.setTextureSize(64, 64);
    this.head.mirror = true;
    setRotation(this.head, -0.0349066F, 0.0F, 0.0F);
    this.hornLF = new ModelRenderer(this, 0, 0);
    this.hornLF.addBox(2.0F, -9.0F, -7.0F, 1, 2, 1);
    this.hornLF.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.hornLF.setTextureSize(64, 64);
    this.hornLF.mirror = true;
    setRotation(this.hornLF, 0.0F, 0.0F, 0.0F);
    this.hornLB = new ModelRenderer(this, 16, 20);
    this.hornLB.addBox(3.0F, -8.5F, -1.5F, 3, 4, 5);
    this.hornLB.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.hornLB.setTextureSize(64, 64);
    this.hornLB.mirror = true;
    setRotation(this.hornLB, 0.2617994F, 0.5235988F, 0.0F);
    this.hornRF = new ModelRenderer(this, 0, 0);
    this.hornRF.addBox(-3.0F, -9.0F, -7.0F, 1, 2, 1);
    this.hornRF.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.hornRF.setTextureSize(64, 64);
    this.hornRF.mirror = true;
    setRotation(this.hornRF, 0.0F, 0.0F, 0.0F);
    this.hornRB = new ModelRenderer(this, 16, 20);
    this.hornRB.addBox(-6.0F, -8.5F, -1.5F, 3, 4, 5);
    this.hornRB.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.hornRB.setTextureSize(64, 64);
    this.hornRB.mirror = true;
    setRotation(this.hornRB, 0.2617994F, -0.5235988F, 0.0F);
    
    this.bipedHead.addChild(this.jaw);
    this.bipedHead.addChild(this.head);
    this.bipedHead.addChild(this.hornLF);
    this.bipedHead.addChild(this.hornLB);
    this.bipedHead.addChild(this.hornRF);
    this.bipedHead.addChild(this.hornRB);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }
  

  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }
}
