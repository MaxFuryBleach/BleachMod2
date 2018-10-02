package littlebreadloaf.bleach.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemRecord;
import net.minecraft.util.IIcon;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;




public class ItemBleachRecord
  extends ItemRecord
{
  IIcon[] icons;
  private static String[] ICON = { ":asterisk", ":NumberOne", "Escalon" };
  
  public ItemBleachRecord(String discName) {
    super(discName);
    setCreativeTab(null);
    this.maxStackSize = 1;
  }
  



  @SideOnly(Side.CLIENT)
  public IIcon getIconFromDamage(int par1)
  {
    return this.icons[par1];
  }
  

  @SideOnly(Side.CLIENT)
  public String getRecordNameLocal()
  {
    return StatCollector.translateToLocal("item.record." + this.recordName + ".desc");
  }
  
  @SideOnly(Side.CLIENT)
  public void registerIcons(IIconRegister icon)
  {
    this.icons = new IIcon[ICON.length];
    
    for (int i = 0; i < this.icons.length; i++)
    {
      this.icons[i] = icon.registerIcon("bleach".toLowerCase() + ICON[i]);
    }
  }
  







  public ResourceLocation getRecordResource(String name)
  {
    return new ResourceLocation(name);
  }
}
