package com.frank.registry;

import com.frank.Main;
import com.frank.network.BedrockcraftGuiHandler;
import net.minecraftforge.fml.common.network.NetworkRegistry;

public class NetworkRegistryHandler {
	public static void register(){
		NetworkRegistry.INSTANCE.registerGuiHandler(Main.MOD_ID,new BedrockcraftGuiHandler());
	}
}
