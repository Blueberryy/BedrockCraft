package com.frank.item.tool;

import com.frank.Main;
import com.frank.creativetab.TabBedrockCraftTool;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;

public class BedrockPickaxe  extends ItemPickaxe {

        public BedrockPickaxe(Item.ToolMaterial material) {
                super(material);
                this.setUnlocalizedName(Main.MOD_ID + ".BedrockPickaxe");
                this.setRegistryName("bedrock_pickaxe");
                this.setCreativeTab(TabBedrockCraftTool.TAB_BEDROCK_CRAFT_TOOL);
        }
}
