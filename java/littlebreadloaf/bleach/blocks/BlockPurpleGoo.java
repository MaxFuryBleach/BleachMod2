package littlebreadloaf.bleach.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Random;
import littlebreadloaf.bleach.items.BleachItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;



public class BlockPurpleGoo
  extends Block
{
  public BlockPurpleGoo()
  {
    super(Material.cake);
    setCreativeTab(BleachItems.tabBleach);
    setBlockName("purple_goo");
    setHardness(4.0F);
    setResistance(40.0F);
    setStepSound(Block.soundTypeStone);
  }
  

  @SideOnly(Side.CLIENT)
  public void registerBlockIcons(IIconRegister icon)
  {
    this.blockIcon = icon.registerIcon("bleach".toLowerCase() + ":" + "purple_goo");
  }
  





  public int quantityDropped(Random par1Random)
  {
    return 0;
  }
  




  public Item getItemDropped(int par1, Random par2Random, int par3)
  {
    return null;
  }
}
