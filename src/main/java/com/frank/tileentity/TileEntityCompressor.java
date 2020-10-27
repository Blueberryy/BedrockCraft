package com.frank.tileentity;

import com.frank.Main;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemStackHandler;

public class TileEntityCompressor extends TileEntity {
        public static final String ID = Main.MOD_ID + ".compressor";

        private final ItemStackHandler right = new ItemStackHandler(1){
                @Override
                protected void onContentsChanged(int slot) {
                        TileEntityCompressor.this.markDirty();
                }
        };
        private final ItemStackHandler left = new ItemStackHandler(1){
                @Override
                protected void onContentsChanged(int slot) {
                        TileEntityCompressor.this.markDirty();
                }
        };
        private final ItemStackHandler down = new ItemStackHandler(1){
                @Override
                protected void onContentsChanged(int slot) {
                        TileEntityCompressor.this.markDirty();
                }
        };

        @Override
        public void readFromNBT(NBTTagCompound compound) {
                this.down.deserializeNBT(compound.getCompoundTag("Down"));
                this.left.deserializeNBT(compound.getCompoundTag("Left"));
                this.right.deserializeNBT(compound.getCompoundTag("Right"));
                super.readFromNBT(compound);
        }

        @Override
        public NBTTagCompound writeToNBT(NBTTagCompound compound) {
                compound.setTag("Down",this.down.serializeNBT());
                compound.setTag("Left",this.left.serializeNBT());
                compound.setTag("Right",this.right.serializeNBT());
                return super.writeToNBT(compound);
        }

        @Override
        public boolean hasCapability(Capability<?> capability, EnumFacing facing) {
                Capability<IItemHandler> itemHandlerCapability = CapabilityItemHandler.ITEM_HANDLER_CAPABILITY;
                return  itemHandlerCapability.equals(capability) || super.hasCapability(capability,facing);
        }

        @Override
        public <T> T getCapability(Capability<T> capability,EnumFacing facing) {
                Capability<IItemHandler> itemHandlerCapability = CapabilityItemHandler.ITEM_HANDLER_CAPABILITY;
                if (itemHandlerCapability.equals(facing)){
                        if (EnumFacing.DOWN.equals(facing)){
                                return itemHandlerCapability.cast(this.down);
                        }
                }
                return super.getCapability(capability, facing);
        }
}
