package com.frank.item.tool;

import com.frank.Main;
import com.frank.creativetab.TabBedrockCraftTool;
import com.frank.registry.MaterialRegistryHandler;
import net.minecraft.item.ItemHoe;

public class ObsidianHoe extends ItemHoe {
        public ObsidianHoe(){
                super(MaterialRegistryHandler.OBSIDIAN_TOOL_MATERIAL);
                this.setRegistryName("obsidian_hoe");
                this.setUnlocalizedName(Main.MOD_ID + ".ObsidianHoe");
                this.setCreativeTab(TabBedrockCraftTool.TAB_BEDROCK_CRAFT_TOOL);
        }
}
