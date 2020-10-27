package com.frank.item;

import com.frank.Main;
import com.frank.creativetab.TabBedrockCraft;
import net.minecraft.item.Item;

public class ObsidianIngot extends Item {
        public ObsidianIngot(){
                this.setRegistryName("obsidian_ingot");
                this.setUnlocalizedName(Main.MOD_ID + ".ObsidianIngot");
                this.setMaxStackSize(64);
                this.setCreativeTab(TabBedrockCraft.TAB_BEDROCK_CRAFT);
        }
}
