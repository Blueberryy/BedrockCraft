package com.frank.item.armor;

import com.frank.Main;
import com.frank.creativetab.TabBedrockCraftTool;
import com.frank.registry.MaterialRegistryHandler;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class BedrockArmor extends ItemArmor {
        public BedrockArmor(EntityEquipmentSlot equipmentSlotIn) {
                super(MaterialRegistryHandler.BEDROCK_ARMOR_MATERIAL,0, equipmentSlotIn);
                this.setUnlocalizedName(Main.MOD_ID + ".BedrockArmor." + equipmentSlotIn.getName());
                this.setRegistryName("bedrock_armor_" + equipmentSlotIn.getName());
                this.setCreativeTab(TabBedrockCraftTool.TAB_BEDROCK_CRAFT_TOOL);

        }
}
