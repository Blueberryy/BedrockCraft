package com.frank.network;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class BedrockcraftGuiHandler implements IGuiHandler {
        public static final int COMPRESSOR = 1;

        @Override
        public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
                if (ID == COMPRESSOR){
                        return new ContainerCompressor(player,world,x,y,z);
                }
                return null;
        }

        @Override
        public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
                if (ID == COMPRESSOR){
                        return new ContainerCompressor(player, world, x, y, z);
                }
                return null;
        }
}
