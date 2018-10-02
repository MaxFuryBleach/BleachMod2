package littlebreadloaf.bleach.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;




public class BlockPoisonShroom
  extends Block
{
  protected BlockPoisonShroom()
  {
    super(Material.plants);
    setBlockTextureName("poison_shroom");
    setBlockName("poison_shroom");
    setHardness(1.0F);
    setResistance(1.0F);
  }
  


  @SideOnly(Side.CLIENT)
  public void registerBlockIcons(IIconRegister icon)
  {
    this.blockIcon = icon.registerIcon("bleach".toLowerCase() + ":poison_shroom");
  }
  




  public boolean canPlaceBlockAt(World par1World, int par2, int par3, int par4)
  {
    return (super.canPlaceBlockAt(par1World, par2, par3, par4)) && (canBlockStay(par1World, par2, par3, par4));
  }
  





  public void onNeighborBlockChange(World par1World, int par2, int par3, int par4, Block block)
  {
    super.onNeighborBlockChange(par1World, par2, par3, par4, block);
    checkFlowerChange(par1World, par2, par3, par4);
  }
  



  protected final void checkFlowerChange(World par1World, int par2, int par3, int par4)
  {
    if (!canBlockStay(par1World, par2, par3, par4))
    {
      dropBlockAsItem(par1World, par2, par3, par4, par1World.getBlockMetadata(par2, par3, par4), 0);
      par1World.setBlock(par2, par3, par4, Blocks.air, 0, 2);
    }
  }
  



  public boolean canBlockStay(World par1World, int par2, int par3, int par4)
  {
    return par1World.getBlock(par2, par3 - 1, par4) == Blocks.grass;
  }
  






  public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4)
  {
    return null;
  }
  




  public boolean isOpaqueCube()
  {
    return false;
  }
  



  public boolean renderAsNormalBlock()
  {
    return false;
  }
  



  public int getRenderType()
  {
    return 1;
  }
  

  public void onEntityCollidedWithBlock(World world, int x, int y, int z, Entity entity)
  {
    if ((entity instanceof EntityLivingBase))
    {
      if (((EntityLivingBase)entity).getActivePotionEffect(Potion.poison) == null)
      {
        ((EntityLivingBase)entity).addPotionEffect(new PotionEffect(Potion.poison.id, 200, 0));
        world.setBlockToAir(x, y, z);
      } }
  }
  
  int iceMeltTimer = 1200;
  





  public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random)
  {
    checkFlowerChange(par1World, par2, par3, par4);
    this.iceMeltTimer -= 1;
    if (this.iceMeltTimer < 0)
    {
      par1World.setBlock(par2, par3, par4, Blocks.water);
      par1World.scheduleBlockUpdate(par2, par3, par4, this, 10);
    }
    par1World.scheduleBlockUpdate(par2, par3, par4, this, 10);
  }
  






  public int getMobilityFlag()
  {
    return 2;
  }
  






  public void onBlockPlacedBy(World world, int i, int j, int k, EntityLivingBase entity, ItemStack ItemStack)
  {
    world.scheduleBlockUpdate(i, j, k, this, 10);
  }
}
