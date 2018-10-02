package littlebreadloaf.bleach.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Random;
import littlebreadloaf.bleach.items.BleachItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;



public class BlockMaskOre
  extends Block
{
  private Random rand = new Random();
  
  public BlockMaskOre() {
    super(Material.rock);
    setCreativeTab(BleachItems.tabBleach);
    setBlockName("mask_ore");
    setHardness(3.0F);
    setResistance(10.0F);
    setStepSound(Block.soundTypeStone);
  }
  

  @SideOnly(Side.CLIENT)
  public void registerBlockIcons(IIconRegister icon)
  {
    this.blockIcon = icon.registerIcon("bleach".toLowerCase() + ":" + "mask_ore");
  }
  




  public int quantityDropped(Random par1Random)
  {
    return this.rand.nextInt(3);
  }
  



  public Item getItemDropped(int par1, Random par2Random, int par3)
  {
    return BleachItems.maskshard;
  }
}
