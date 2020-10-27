package com.frank.event;

import net.minecraft.block.BlockObsidian;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class EventHandler {
	@SubscribeEvent
	public static void onObsidianBroke(BlockEvent.BreakEvent event){
		int count = 0;
		if (event.getState().getBlock() instanceof BlockObsidian){

		}
	}
}
