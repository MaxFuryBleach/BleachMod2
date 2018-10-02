package littlebreadloaf.bleach.tiles;

import littlebreadloaf.bleach.events.ExtendedPlayer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public class TileSphereLamp extends TileBleach
{
  private String owner;
  byte tick = 0;
  
  public ExtendedPlayer props = null;
  


  public void updateEntity()
  {
    this.tick = ((byte)(this.tick + 1));
    if (this.tick > 20) { this.tick = ((byte)(this.tick - 20));
    }
    if (getOwnerEntity() != null) {
      this.props = ((ExtendedPlayer)getOwnerEntity().getExtendedProperties("BleachPlayer"));
    }
    if ((!this.worldObj.isRemote) && (this.tick == 20))
    {
      if (this.props != null)
      {
        this.props.consumeEnergy(1);
      }
    }
    

    super.updateEntity();
  }
  

  public void readFromNBT(NBTTagCompound nbt)
  {
    super.readFromNBT(nbt);
    
    this.owner = nbt.getString("owner");
  }
  

  public void writeToNBT(NBTTagCompound nbt)
  {
    super.writeToNBT(nbt);
    nbt.setString("owner", this.owner);
  }
  
  public void setOwner(String owner)
  {
    this.owner = owner;
  }
  
  public void setOwnerEntity(EntityPlayer owner)
  {
    this.owner = owner.getCommandSenderName();
  }
  
  public String getOwner()
  {
    return this.owner;
  }
  
  public EntityPlayer getOwnerEntity()
  {
    return this.worldObj.getPlayerEntityByName(this.owner);
  }
}
