package com.frank.item.tool;

import com.frank.Main;
import com.frank.creativetab.TabBedrockCraftTool;
import net.minecraft.item.ItemHoe;

public class BedrockHoe extends ItemHoe {

        public BedrockHoe(ToolMaterial material) {
                super(material);
                this.setUnlocalizedName(Main.MOD_ID + ".BedrockHoe");
                this.setRegistryName("bedrock_hoe");
                this.setCreativeTab(TabBedrockCraftTool.TAB_BEDROCK_CRAFT_TOOL);
        }
}
