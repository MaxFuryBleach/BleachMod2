package littlebreadloaf.bleach.blocks;

import littlebreadloaf.bleach.BleachIds;
import littlebreadloaf.bleach.tiles.TileSphereLamp;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;




public class BlockLampSphere
  extends BleachBlockContainer
{
  public BlockLampSphere()
  {
    super(Material.glass);
    setBlockName("reiatsu_lamp");
    setHardness(5.0F);
    setResistance(15.0F);
    setStepSound(Block.soundTypeGlass);
    setLightLevel(0.9F);
  }
  

  public int getRenderType()
  {
    return BleachIds.sphereLampRenderID;
  }
  

  public boolean renderAsNormalBlock()
  {
    return false;
  }
  

  public boolean isOpaqueCube()
  {
    return false;
  }
  

  public TileEntity createNewTileEntity(World world, int metadata)
  {
    return new TileSphereLamp();
  }
  




  public void onBlockPlacedBy(World world, int i, int j, int k, EntityLivingBase entity, ItemStack ItemStack)
  {
    if (((world.getTileEntity(i, j, k) instanceof TileSphereLamp)) && ((entity instanceof EntityPlayer)))
    {
      ((TileSphereLamp)world.getTileEntity(i, j, k)).setOwnerEntity((EntityPlayer)entity);
    }
  }
}
