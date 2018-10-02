package littlebreadloaf.bleach.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import java.util.Random;
import littlebreadloaf.bleach.items.BleachItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPane;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;










public class BlockPaperWall
  extends BlockPane
{
  private final String sideTextureIndex;
  private final boolean canDropItself;
  private final String field_94402_c;
  @SideOnly(Side.CLIENT)
  private IIcon theIcon;
  
  protected BlockPaperWall(String par2Str, String par3Str, Material par4Material, boolean par5)
  {
    super(par3Str, par3Str, par4Material, par5);
    this.sideTextureIndex = ("bleach".toLowerCase() + ":" + par3Str);
    this.canDropItself = par5;
    this.field_94402_c = ("bleach".toLowerCase() + ":" + par2Str);
    setCreativeTab(BleachItems.tabBleach);
  }
  





  public Item getItemDropped(int par1, Random par2Random, int par3)
  {
    return !this.canDropItself ? null : super.getItemDropped(par1, par2Random, par3);
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
    return 41;
  }
  






  @SideOnly(Side.CLIENT)
  public boolean shouldSideBeRendered(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5)
  {
    Block i1 = par1IBlockAccess.getBlock(par2, par3, par4);
    return i1 == this ? false : super.shouldSideBeRendered(par1IBlockAccess, par2, par3, par4, par5);
  }
  





  public void addCollisionBoxesToList(World par1World, int par2, int par3, int par4, AxisAlignedBB par5AxisAlignedBB, List par6List, Entity par7Entity)
  {
    boolean flag = canPaneConnectTo(par1World, par2, par3, par4, ForgeDirection.NORTH);
    boolean flag1 = canPaneConnectTo(par1World, par2, par3, par4, ForgeDirection.SOUTH);
    boolean flag2 = canPaneConnectTo(par1World, par2, par3, par4, ForgeDirection.WEST);
    boolean flag3 = canPaneConnectTo(par1World, par2, par3, par4, ForgeDirection.EAST);
    
    if (((!flag2) || (!flag3)) && ((flag2) || (flag3) || (flag) || (flag1)))
    {
      if ((flag2) && (!flag3))
      {
        setBlockBounds(0.0F, 0.0F, 0.4375F, 0.5F, 1.0F, 0.5625F);
        super.addCollisionBoxesToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
      }
      else if ((!flag2) && (flag3))
      {
        setBlockBounds(0.5F, 0.0F, 0.4375F, 1.0F, 1.0F, 0.5625F);
        super.addCollisionBoxesToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
      }
    }
    else
    {
      setBlockBounds(0.0F, 0.0F, 0.4375F, 1.0F, 1.0F, 0.5625F);
      super.addCollisionBoxesToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
    }
    
    if (((!flag) || (!flag1)) && ((flag2) || (flag3) || (flag) || (flag1)))
    {
      if ((flag) && (!flag1))
      {
        setBlockBounds(0.4375F, 0.0F, 0.0F, 0.5625F, 1.0F, 0.5F);
        super.addCollisionBoxesToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
      }
      else if ((!flag) && (flag1))
      {
        setBlockBounds(0.4375F, 0.0F, 0.5F, 0.5625F, 1.0F, 1.0F);
        super.addCollisionBoxesToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
      }
    }
    else
    {
      setBlockBounds(0.4375F, 0.0F, 0.0F, 0.5625F, 1.0F, 1.0F);
      super.addCollisionBoxesToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
    }
  }
  




  public void setBlockBoundsForItemRender()
  {
    setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
  }
  




  public void setBlockBoundsBasedOnState(IBlockAccess par1IBlockAccess, int par2, int par3, int par4)
  {
    float f = 0.4375F;
    float f1 = 0.5625F;
    float f2 = 0.4375F;
    float f3 = 0.5625F;
    boolean flag = canPaneConnectTo(par1IBlockAccess, par2, par3, par4, ForgeDirection.NORTH);
    boolean flag1 = canPaneConnectTo(par1IBlockAccess, par2, par3, par4, ForgeDirection.SOUTH);
    boolean flag2 = canPaneConnectTo(par1IBlockAccess, par2, par3, par4, ForgeDirection.WEST);
    boolean flag3 = canPaneConnectTo(par1IBlockAccess, par2, par3, par4, ForgeDirection.EAST);
    
    if (((!flag2) || (!flag3)) && ((flag2) || (flag3) || (flag) || (flag1)))
    {
      if ((flag2) && (!flag3))
      {
        f = 0.0F;
      }
      else if ((!flag2) && (flag3))
      {
        f1 = 1.0F;
      }
    }
    else
    {
      f = 0.0F;
      f1 = 1.0F;
    }
    
    if (((!flag) || (!flag1)) && ((flag2) || (flag3) || (flag) || (flag1)))
    {
      if ((flag) && (!flag1))
      {
        f2 = 0.0F;
      }
      else if ((!flag) && (flag1))
      {
        f3 = 1.0F;
      }
    }
    else
    {
      f2 = 0.0F;
      f3 = 1.0F;
    }
    
    setBlockBounds(f, 0.0F, f2, f1, 1.0F, f3);
  }
  





  @SideOnly(Side.CLIENT)
  public IIcon func_150097_e()
  {
    return this.theIcon;
  }
  





  protected boolean canSilkHarvest()
  {
    return true;
  }
  





  protected ItemStack createStackedBlock(int par1)
  {
    return new ItemStack(this, 1, par1);
  }
  






  @SideOnly(Side.CLIENT)
  public void registerBlockIcons(IIconRegister par1IconRegister)
  {
    this.blockIcon = par1IconRegister.registerIcon(this.field_94402_c);
    this.theIcon = par1IconRegister.registerIcon(this.sideTextureIndex);
  }
  


  public boolean canPaneConnectTo(IBlockAccess access, int x, int y, int z, ForgeDirection dir)
  {
    return (canPaneConnectToBlock(access.getBlock(x + dir.offsetX, y + dir.offsetY, z + dir.offsetZ))) || (access.isSideSolid(x + dir.offsetX, y + dir.offsetY, z + dir.offsetZ, dir.getOpposite(), false));
  }
}
