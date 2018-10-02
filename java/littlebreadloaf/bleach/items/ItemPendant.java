package littlebreadloaf.bleach.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import littlebreadloaf.bleach.events.ExtendedPlayer;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;





public class ItemPendant
  extends Item
{
  @SideOnly(Side.CLIENT)
  public static IIcon[] icons;
  private float weaponDamage;
  public float damageBoost = 0.0F;
  public float robeboost = 0.0F;
  public float pantboost = 0.0F;
  public float sandalboost = 0.0F;
  
  private static final String[] ICON = { "quincy_pendant", "quincy_pentacle" };
  
  public ItemPendant()
  {
    this.maxStackSize = 1;
    setCreativeTab(BleachItems.tabBleach);
    setHasSubtypes(true);
  }
  






  public String getUnlocalizedName(ItemStack itemstack)
  {
    return littlebreadloaf.bleach.Names.QuincyPendant_UnlocalizedName[itemstack.getItemDamage()];
  }
  

  @SideOnly(Side.CLIENT)
  public IIcon getIconFromDamage(int damage)
  {
    return icons[damage];
  }
  

  @SideOnly(Side.CLIENT)
  public void registerIcons(IIconRegister icon)
  {
    icons = new IIcon[ICON.length];
    
    for (int i = 0; i < icons.length; i++)
    {
      icons[i] = icon.registerIcon("bleach".toLowerCase() + ":" + ICON[i]);
    }
  }
  










  public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
  {
    ExtendedPlayer props = (ExtendedPlayer)par3EntityPlayer.getExtendedProperties("BleachPlayer");
    if ((par1ItemStack.getItemDamage() == 0) && (!par3EntityPlayer.worldObj.isRemote) && (props.getCurrentEnergy() >= 10.0F / props.getCurrentCap()) && (props.getFaction() == 2))
    {
      props.consumeEnergy(10);
      par1ItemStack = new ItemStack(BleachItems.quincybow, 1);

    }
    else if ((par1ItemStack.getItemDamage() == 1) && (!par3EntityPlayer.worldObj.isRemote) && (props.getCurrentEnergy() >= 20.0F / props.getCurrentCap()) && (props.getFaction() == 2))
    {
      props.consumeEnergy(20);
      par1ItemStack = new ItemStack(BleachItems.quincyweb, 1);
    }
    return par1ItemStack;
  }
  


  public EnumAction getItemUseAction(ItemStack par1ItemStack)
  {
    return null;
  }
  

  public void getSubItems(Item item, CreativeTabs tab, List list)
  {
    for (int i = 0; i < icons.length; i++)
    {
      ItemStack itemstack = new ItemStack(item, 1, i);
      list.add(itemstack);
    }
  }
}
