package com.frank.item.tool;

import com.frank.Main;
import com.frank.creativetab.TabBedrockCraftTool;
import com.frank.registry.MaterialRegistryHandler;
import net.minecraft.item.ItemAxe;

public class ObsidianAxe extends ItemAxe {
        public ObsidianAxe(){
                super(MaterialRegistryHandler.OBSIDIAN_TOOL_MATERIAL,12f,-2f);
                this.setRegistryName("obsidian_axe");
                this.setUnlocalizedName(Main.MOD_ID + ".ObsidianAxe");
                this.setCreativeTab(TabBedrockCraftTool.TAB_BEDROCK_CRAFT_TOOL);
        }
}
