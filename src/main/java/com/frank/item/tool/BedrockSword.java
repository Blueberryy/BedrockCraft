package com.frank.item.tool;

import com.frank.Main;
import com.frank.creativetab.TabBedrockCraftTool;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;

public class BedrockSword extends ItemSword {
        public BedrockSword(Item.ToolMaterial material) {
                super(material);
                this.setUnlocalizedName(Main.MOD_ID + ".BedrockSword");
                this.setRegistryName("bedrock_sword");
                this.setCreativeTab(TabBedrockCraftTool.TAB_BEDROCK_CRAFT_TOOL);
        }
}
