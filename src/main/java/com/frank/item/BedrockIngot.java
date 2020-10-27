package com.frank.item;

import com.frank.Main;
import com.frank.creativetab.TabBedrockCraft;
import net.minecraft.item.Item;

public class BedrockIngot extends Item {
        public BedrockIngot(){
                this.setUnlocalizedName(Main.MOD_ID + ".BedrockIngot");
                this.setRegistryName("bedrock_ingot");
                this.setMaxStackSize(64);
                this.setCreativeTab(TabBedrockCraft.TAB_BEDROCK_CRAFT);
        }
}
