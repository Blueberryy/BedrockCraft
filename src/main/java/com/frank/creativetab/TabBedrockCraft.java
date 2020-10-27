package com.frank.creativetab;

import com.frank.registry.ItemRegisterHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class TabBedrockCraft extends CreativeTabs {
        public static final TabBedrockCraft TAB_BEDROCK_CRAFT = new TabBedrockCraft();
        @Override
        public ItemStack getTabIconItem() {
                return new ItemStack(ItemRegisterHandler.BEDROCK_INGOT);
        }
        public TabBedrockCraft(){
                super("bedrockcraft");
        }
}
