package com.frank.creativetab;

import com.frank.registry.ItemRegisterHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class TabBedrockCraftTool extends CreativeTabs {
        public static final TabBedrockCraftTool TAB_BEDROCK_CRAFT_TOOL = new TabBedrockCraftTool();
        @Override
        public ItemStack getTabIconItem() {
                return new ItemStack(ItemRegisterHandler.BEDROCK_PICKAXE);

        }
        public TabBedrockCraftTool(){
                super("bedrockcraftTool");
        }
}
