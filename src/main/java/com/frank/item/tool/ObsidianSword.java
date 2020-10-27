package com.frank.item.tool;

import com.frank.Main;
import com.frank.creativetab.TabBedrockCraftTool;
import com.frank.registry.MaterialRegistryHandler;
import net.minecraft.item.ItemSword;

public class ObsidianSword extends ItemSword {
        public ObsidianSword(){
                super(MaterialRegistryHandler.OBSIDIAN_TOOL_MATERIAL);
                this.setRegistryName("obsidian_sword");
                this.setUnlocalizedName(Main.MOD_ID + ".ObsidianSword");
                this.setCreativeTab(TabBedrockCraftTool.TAB_BEDROCK_CRAFT_TOOL);
        }
}
