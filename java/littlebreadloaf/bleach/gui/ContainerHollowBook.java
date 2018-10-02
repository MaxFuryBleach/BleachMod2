package littlebreadloaf.bleach.gui;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;


public class ContainerHollowBook
  extends Container
{
  public ContainerHollowBook(EntityPlayer player) {}
  
  public boolean canInteractWith(EntityPlayer entityplayer)
  {
    return true;
  }
}
