package io.github.fergoman123.msb.tileentity;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class TileEntitySkullMSB extends TileEntity
{
    private int skullType;
    private int skullRotation;

    @Override
    public void writeToNBT(NBTTagCompound compound) {
        super.writeToNBT(compound);
        compound.setByte("SkullType", (byte)(this.skullType & 255));
        compound.setByte("Rot", (byte)(this.skullType & 255));
    }

    @Override
    public void readFromNBT(NBTTagCompound compound) {
        super.readFromNBT(compound);
        this.skullType = compound.getByte("SkullType");
        this.skullRotation = compound.getByte("Rot");
    }

    //todo define metadata value
    @Override
    public Packet getDescriptionPacket() {
        NBTTagCompound compound = new NBTTagCompound();
        this.writeToNBT(compound);
        return new S35PacketUpdateTileEntity(this.pos, 0, compound);
    }

    public void setType(int type)
    {
        this.skullType = type;
    }

    public int getSkullType(){
        return this.skullType;
    }

    @SideOnly(Side.CLIENT)
    public int getSkullRotation(){
        return this.skullRotation;
    }

    public void setSkullRotation(int skullRotation) {
        this.skullRotation = skullRotation;
    }
}
