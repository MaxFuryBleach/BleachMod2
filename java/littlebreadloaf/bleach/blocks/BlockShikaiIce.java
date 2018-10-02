package littlebreadloaf.bleach.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Random;
import littlebreadloaf.bleach.items.BleachItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBreakable;
import net.minecraft.block.material.Material;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.world.WorldProvider;



public class BlockShikaiIce
  extends BlockBreakable
{
  public BlockShikaiIce()
  {
    super("ice", Material.ice, false);
    this.slipperiness = 0.98F;
    setTickRandomly(true);
    setCreativeTab(BleachItems.tabBleach);
    setBlockName("icey");
  }
  





  @SideOnly(Side.CLIENT)
  public int getRenderBlockPass()
  {
    return 1;
  }
  






  @SideOnly(Side.CLIENT)
  public boolean shouldSideBeRendered(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5)
  {
    return super.shouldSideBeRendered(par1IBlockAccess, par2, par3, par4, 1 - par5);
  }
  





  public void harvestBlock(World par1World, EntityPlayer par2EntityPlayer, int par3, int par4, int par5, int par6)
  {
    par2EntityPlayer.addExhaustion(0.025F);
    
    if ((!canSilkHarvest()) || (!EnchantmentHelper.getSilkTouchModifier(par2EntityPlayer)))
    {




      if (par1World.provider.isHellWorld)
      {
        par1World.setBlockToAir(par3, par4, par5);
        return;
      }
      
      Material material = par1World.getBlock(par3, par4 - 1, par5).getMaterial();
      
      if ((material.blocksMovement()) || (material.isLiquid()))
      {
        par1World.setBlock(par3, par4, par5, Blocks.water);
      }
    }
  }
  




  public int quantityDropped(Random par1Random)
  {
    return 0;
  }
  
  int iceMeltTimer = 10;
  





  public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random)
  {
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
    return 0;
  }
  






  public void onBlockPlacedBy(World world, int i, int j, int k, EntityLivingBase entity, ItemStack ItemStack)
  {
    world.scheduleBlockUpdate(i, j, k, this, 10);
  }
}
