package littlebreadloaf.bleach.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Random;
import littlebreadloaf.bleach.entities.EntityHollowBat;
import littlebreadloaf.bleach.entities.EntityHollowBlaze;
import littlebreadloaf.bleach.entities.EntityHollowGolem;
import littlebreadloaf.bleach.entities.EntityHollowOre;
import littlebreadloaf.bleach.entities.EntityHollowSnake;
import littlebreadloaf.bleach.entities.EntityHollowSpider;
import littlebreadloaf.bleach.entities.EntityHollowStalker;
import littlebreadloaf.bleach.entities.EntityHollowWasp;
import littlebreadloaf.bleach.entities.EntityHollowWolf;
import littlebreadloaf.bleach.entities.EntityMenosGrande;
import littlebreadloaf.bleach.extras.ParticleEffects;
import littlebreadloaf.bleach.items.BleachItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;




public class BlockHollowBait
  extends Block
{
  @SideOnly(Side.CLIENT)
  private IIcon cakeTopIcon;
  @SideOnly(Side.CLIENT)
  private IIcon cakeBottomIcon;
  @SideOnly(Side.CLIENT)
  private IIcon field_94382_c;
  protected Random rand;
  public int posX;
  public int posY;
  public int posZ;
  public boolean activated;
  public int baitTimer;
  
  protected BlockHollowBait()
  {
    super(Material.cake);
    setTickRandomly(false);
    this.rand = new Random();
    setCreativeTab(BleachItems.tabBleach);
    setBlockName("hollow_bait");
    setHardness(3.0F);
    setResistance(15.0F);
    setStepSound(Block.soundTypeStone);
  }
  

  public int tickRate(World par1World)
  {
    return 10;
  }
  






  public void setBlockBoundsBasedOnState(IBlockAccess par1IBlockAccess, int par2, int par3, int par4)
  {
    int l = par1IBlockAccess.getBlockMetadata(par2, par3, par4);
    float f = 0.0625F;
    float f1 = (1 + l * 2) / 16.0F;
    float f2 = 0.5F;
    setBlockBounds(f1, 0.0F, f, 1.0F - f, f2, 1.0F - f);
  }
  





  public void setBlockBoundsForItemRender()
  {
    float f = 0.0625F;
    float f1 = 0.5F;
    setBlockBounds(f, 0.0F, f, 1.0F - f, f1, 1.0F - f);
  }
  







  public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4)
  {
    int l = par1World.getBlockMetadata(par2, par3, par4);
    float f = 0.0625F;
    float f1 = (1 + l * 2) / 16.0F;
    float f2 = 0.5F;
    return AxisAlignedBB.getBoundingBox(par2 + f1, par3, par4 + f, par2 + 1 - f, par3 + f2 - f, par4 + 1 - f);
  }
  





  public boolean renderAsNormalBlock()
  {
    return false;
  }
  





  @SideOnly(Side.CLIENT)
  public AxisAlignedBB getSelectedBoundingBoxFromPool(World par1World, int par2, int par3, int par4)
  {
    int l = par1World.getBlockMetadata(par2, par3, par4);
    float f = 0.0625F;
    float f1 = (1 + l * 2) / 16.0F;
    float f2 = 0.5F;
    return AxisAlignedBB.getBoundingBox(par2 + f1, par3, par4 + f, par2 + 1 - f, par3 + f2, par4 + 1 - f);
  }
  





  @SideOnly(Side.CLIENT)
  public IIcon getIcon(int par1, int par2)
  {
    return (par2 > 0) && (par1 == 4) ? this.field_94382_c : par1 == 0 ? this.cakeBottomIcon : par1 == 1 ? this.cakeTopIcon : this.blockIcon;
  }
  






  @SideOnly(Side.CLIENT)
  public void registerBlockIcons(IIconRegister par1IconRegister)
  {
    this.blockIcon = par1IconRegister.registerIcon("bleach".toLowerCase() + ":" + "hollow_bait" + "2");
    this.field_94382_c = par1IconRegister.registerIcon("cake_inner");
    this.cakeTopIcon = par1IconRegister.registerIcon("bleach".toLowerCase() + ":" + "hollow_bait" + "1");
    this.cakeBottomIcon = par1IconRegister.registerIcon("bleach".toLowerCase() + ":" + "hollow_bait" + "2");
  }
  







  public boolean isOpaqueCube()
  {
    return false;
  }
  






  public boolean onBlockActivated(World var1, int var2, int var3, int var4, EntityPlayer var5, int var6, float var7, float var8, float var9)
  {
    this.baitTimer = 0;
    var1.scheduleBlockUpdate(var2, var3, var4, this, tickRate(var1));
    this.posX = var2;
    this.posY = var3;
    this.posZ = var4;
    this.activated = true;
    return true;
  }
  






  public void onBlockClicked(World var1, int var2, int var3, int var4, EntityPlayer var5)
  {
    this.baitTimer = 0;
    var1.scheduleBlockUpdate(var2, var3, var4, this, tickRate(var1));
    this.posX = var2;
    this.posY = var3;
    this.posZ = var4;
    this.activated = true;
  }
  









  public void onNeighborBlockChange(World par1World, int par2, int par3, int par4, Block par5)
  {
    if (!canBlockStay(par1World, par2, par3, par4))
    {
      par1World.setBlockToAir(par2, par3, par4);
    }
  }
  
  boolean var18 = false;
  

  public void updateTick(World var1, int var2, int var3, int var4, Random var5)
  {
    this.baitTimer += 1;
    
    if (this.baitTimer < 840)
    {
      EntityHollowBat var6 = new EntityHollowBat(var1);
      EntityHollowBlaze var7 = new EntityHollowBlaze(var1);
      EntityHollowSpider var8 = new EntityHollowSpider(var1);
      EntityMenosGrande var9 = new EntityMenosGrande(var1);
      EntityHollowSnake var14 = new EntityHollowSnake(var1);
      EntityHollowGolem var15 = new EntityHollowGolem(var1);
      EntityHollowWasp var16 = new EntityHollowWasp(var1);
      EntityHollowStalker var17 = new EntityHollowStalker(var1);
      EntityHollowOre var18 = new EntityHollowOre(var1);
      EntityHollowWolf var19 = new EntityHollowWolf(var1);
      
      int var10 = this.posX + this.rand.nextInt(100) - this.rand.nextInt(100);
      int var11 = this.posY + 60;
      int var12 = this.posZ + this.rand.nextInt(100) - this.rand.nextInt(100);
      
      var6.setLocationAndAngles(var10, var11, var12, 0.0F, 0.0F);
      var7.setLocationAndAngles(var10, var11, var12, 0.0F, 0.0F);
      var8.setLocationAndAngles(var10, var11, var12, 0.0F, 0.0F);
      var9.setLocationAndAngles(var10, var11, var12, 0.0F, 0.0F);
      var14.setLocationAndAngles(var10, var11, var12, 0.0F, 0.0F);
      var15.setLocationAndAngles(var10, var11, var12, 0.0F, 0.0F);
      var16.setLocationAndAngles(var10, var11, var12, 0.0F, 0.0F);
      var17.setLocationAndAngles(var10, var11, var12, 0.0F, 0.0F);
      var18.setLocationAndAngles(var10, var11, var12, 0.0F, 0.0F);
      var19.setLocationAndAngles(var10, var11, var12, 0.0F, 0.0F);
      
      int randomHollows = this.rand.nextInt(90);
      int randomMenos = this.rand.nextInt(2000);
      
      if (randomHollows == 0)
      {
        var1.spawnEntityInWorld(var6);
      }
      
      if (randomHollows == 1)
      {
        var1.spawnEntityInWorld(var7);
      }
      
      if (randomHollows == 2)
      {
        var1.spawnEntityInWorld(var8);
      }
      
      if (randomHollows == 4)
      {
        var1.spawnEntityInWorld(var14);
      }
      if (randomHollows == 5)
      {
        var1.spawnEntityInWorld(var15);
      }
      if (randomHollows == 6)
      {
        var1.spawnEntityInWorld(var16);
      }
      if (randomHollows == 7)
      {
        var1.spawnEntityInWorld(var17);
      }
      if (randomHollows == 8)
      {
        var1.spawnEntityInWorld(var18);
      }
      if (randomHollows == 9)
      {
        var1.spawnEntityInWorld(var19);
      }
      
      if (randomMenos == 3)
      {
        var1.spawnEntityInWorld(var9);
      }
      
      var1.scheduleBlockUpdate(var2, var3, var4, this, tickRate(var1));
    }
    
    if (this.baitTimer >= 840)
    {
      var1.setBlockToAir(var2, var3, var4);
      this.baitTimer = 0;
      this.activated = false;
    }
  }
  








  public int quantityDropped(Random par1Random)
  {
    return 0;
  }
  





  public Item getItemDropped(int par1, Random par2Random, int par3)
  {
    return null;
  }
  





  public void randomDisplayTick(World var1, int var2, int var3, int var4, Random var5)
  {
    double var6 = var2 + 0.1F + var5.nextFloat() * 0.8F;
    double var8 = var3 + 0.3F + var5.nextFloat() * 0.3F;
    double var10 = var4 + 0.1F + var5.nextFloat() * 0.8F;
    ParticleEffects.spawnParticle("soul", var6, var8, var10, 0.0D, 0.0D, 0.0D);
  }
}
