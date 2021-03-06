package littlebreadloaf.bleach.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Random;
import littlebreadloaf.bleach.items.BleachItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;



public class BlockSoulQuartzOre
  extends Block
{
  private Random rand = new Random();
  
  public BlockSoulQuartzOre() {
    super(Material.rock);
    setCreativeTab(BleachItems.tabBleach);
    setBlockName("soul_quartz_ore");
    setHardness(3.0F);
    setResistance(10.0F);
    setStepSound(Block.soundTypeStone);
  }
  

  @SideOnly(Side.CLIENT)
  public void registerBlockIcons(IIconRegister icon)
  {
    this.blockIcon = icon.registerIcon("bleach".toLowerCase() + ":" + "soul_quartz_ore");
  }
  




  public int quantityDropped(Random par1Random)
  {
    return 2 + this.rand.nextInt(3);
  }
  





  public Item getItemDropped(int par1, Random par2Random, int par3)
  {
    return BleachItems.soulquartz;
  }
}
