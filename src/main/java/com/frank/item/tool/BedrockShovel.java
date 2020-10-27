package com.frank.item.tool;

import com.frank.Main;
import com.frank.creativetab.TabBedrockCraftTool;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSpade;

public class BedrockShovel extends ItemSpade {
        public BedrockShovel(Item.ToolMaterial material){
                super(material);
                this.setUnlocalizedName(Main.MOD_ID + ".BedrockShovel");
                this.setRegistryName("bedrock_shovel");
                this.setCreativeTab(TabBedrockCraftTool.TAB_BEDROCK_CRAFT_TOOL);
        }
}
