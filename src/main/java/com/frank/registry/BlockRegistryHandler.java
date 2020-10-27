package com.frank.registry;

import com.frank.block.Compressor;
import com.frank.tileentity.TileEntityCompressor;
import net.minecraft.block.Block;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

@Mod.EventBusSubscriber
public class BlockRegistryHandler {

        public static final Compressor COMPRESSOR = new Compressor();
        @SubscribeEvent
        public static void onRegistry(RegistryEvent.Register<Block> event){
                IForgeRegistry<Block> registry = event.getRegistry();
                registry.register(COMPRESSOR);
                TileEntity.register(TileEntityCompressor.ID,TileEntityCompressor.class);
        }
}
