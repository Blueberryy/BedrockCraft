package com.frank.item.tool;

import com.frank.Main;
import com.frank.creativetab.TabBedrockCraftTool;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;

public class BedrockAxe extends ItemAxe {

        public BedrockAxe(Item.ToolMaterial material,float damage,float speed) {
                super(material,damage,speed);
                this.setUnlocalizedName(Main.MOD_ID + ".BedrockAxe");
                this.setRegistryName("bedrock_axe");
                this.setCreativeTab(TabBedrockCraftTool.TAB_BEDROCK_CRAFT_TOOL);
        }
}
