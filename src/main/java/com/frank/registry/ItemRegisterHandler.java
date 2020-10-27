package com.frank.registry;

import com.frank.item.BedrockIngot;
import com.frank.item.ObsidianIngot;
import com.frank.item.armor.BedrockArmor;
import com.frank.item.tool.*;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.*;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistry;

@EventBusSubscriber
public class ItemRegisterHandler {

        public static final BedrockIngot BEDROCK_INGOT = new BedrockIngot();
        public static final BedrockPickaxe BEDROCK_PICKAXE = new BedrockPickaxe(MaterialRegistryHandler.BEDROCK_TOOL_MATERIAL);
        public static final BedrockAxe BEDROCK_AXE = new BedrockAxe(MaterialRegistryHandler.BEDROCK_TOOL_MATERIAL,14f,-2.5f);
        public static final BedrockShovel BEDROCK_SHOVEL = new BedrockShovel(MaterialRegistryHandler.BEDROCK_TOOL_MATERIAL);
        public static final BedrockHoe BEDROCK_HOE = new BedrockHoe(MaterialRegistryHandler.BEDROCK_TOOL_MATERIAL);
        public static final BedrockSword BEDROCK_SWORD = new BedrockSword(MaterialRegistryHandler.BEDROCK_TOOL_MATERIAL);
        public static final BedrockArmor BEDROCK_BOOTS = new BedrockArmor(EntityEquipmentSlot.FEET);
        public static final BedrockArmor BEDROCK_LEGGINGS = new BedrockArmor(EntityEquipmentSlot.LEGS);
        public static final BedrockArmor BEDROCK_CHESTPLATE = new BedrockArmor(EntityEquipmentSlot.CHEST);
        public static final BedrockArmor BEDROCK_HELMET = new BedrockArmor(EntityEquipmentSlot.HEAD);
        public static final ObsidianIngot OBSIDIAN_INGOT = new ObsidianIngot();
        public static final ObsidianPickaxe OBSIDIAN_PICKAXE = new ObsidianPickaxe();
        public static final ObsidianAxe OBSIDIAN_AXE = new ObsidianAxe();
        public static final ObsidianShovel OBSIDIAN_SHOVEL = new ObsidianShovel();
        public static final ObsidianHoe OBSIDIAN_HOE = new ObsidianHoe();
        public static final ObsidianSword OBSIDIAN_SWORD = new ObsidianSword();

        public static final ItemBlock COMPRESSOR = withRegistryName(new ItemBlock(BlockRegistryHandler.COMPRESSOR));

        @SubscribeEvent
        public static void onRegistry(RegistryEvent.Register<Item> event) {
                IForgeRegistry<Item> registry = event.getRegistry();

                registry.register(BEDROCK_INGOT);
                registry.register(BEDROCK_PICKAXE);
                registry.register(BEDROCK_AXE);
                registry.register(BEDROCK_SHOVEL);
                registry.register(BEDROCK_HOE);
                registry.register(BEDROCK_SWORD);
                registry.register(BEDROCK_BOOTS);
                registry.register(BEDROCK_LEGGINGS);
                registry.register(BEDROCK_CHESTPLATE);
                registry.register(BEDROCK_HELMET);
                registry.register(OBSIDIAN_INGOT);
                registry.register(OBSIDIAN_PICKAXE);
                registry.register(OBSIDIAN_AXE);
                registry.register(OBSIDIAN_SHOVEL);
                registry.register(OBSIDIAN_HOE);
                registry.register(OBSIDIAN_SWORD);

                registry.register(COMPRESSOR);
        }

        @SubscribeEvent
        @SideOnly(Side.CLIENT)
        public static void onModelRegistry(ModelRegistryEvent event) {

                registerModel(BEDROCK_INGOT);
                registerModel(BEDROCK_PICKAXE);
                registerModel(BEDROCK_AXE);
                registerModel(BEDROCK_SHOVEL);
                registerModel(BEDROCK_HOE);
                registerModel(BEDROCK_SWORD);
                registerModel(BEDROCK_BOOTS);
                registerModel(BEDROCK_LEGGINGS);
                registerModel(BEDROCK_CHESTPLATE);
                registerModel(BEDROCK_HELMET);
                registerModel(OBSIDIAN_INGOT);
                registerModel(OBSIDIAN_PICKAXE);
                registerModel(OBSIDIAN_AXE);
                registerModel(OBSIDIAN_SHOVEL);
                registerModel(OBSIDIAN_HOE);
                registerModel(OBSIDIAN_SWORD);

                registerModel(COMPRESSOR);
        }

        private static ItemBlock withRegistryName(ItemBlock item){
                item.setRegistryName(item.getBlock().getRegistryName());
                return item;
        }
        @SideOnly(Side.CLIENT)
        private static void registerModel(Item item){
                ModelResourceLocation modelResourceLocation = new ModelResourceLocation(item.getRegistryName(),"inventory");
                ModelLoader.setCustomModelResourceLocation(item,0,modelResourceLocation);
        }

}
