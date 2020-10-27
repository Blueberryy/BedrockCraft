package com.frank.item.tool;

import com.frank.Main;
import com.frank.creativetab.TabBedrockCraftTool;
import com.frank.registry.MaterialRegistryHandler;
import net.minecraft.item.ItemSpade;

public class ObsidianShovel extends ItemSpade {
        public ObsidianShovel(){
                super(MaterialRegistryHandler.OBSIDIAN_TOOL_MATERIAL);
                this.setRegistryName("obsidian_shovel");
                this.setUnlocalizedName(Main.MOD_ID + ".ObsidianShovel");
                this.setCreativeTab(TabBedrockCraftTool.TAB_BEDROCK_CRAFT_TOOL);
        }
}
