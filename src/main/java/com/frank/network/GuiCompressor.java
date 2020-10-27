package com.frank.network;

import com.frank.Main;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class GuiCompressor extends GuiContainer {
        private static final ResourceLocation TEXTURE = new ResourceLocation(Main.MOD_ID+"textures/gui/container.compressor.png");

        public GuiCompressor(EntityPlayer player, World world,int x,int y,int z){
                super(new ContainerCompressor(player, world, x, y, z));
                this.xSize = 176;
                this.ySize = 176;
        }

        @Override
        public void drawScreen(int mouseX, int mouseY, float partialTicks) {
                super.drawDefaultBackground();
                super.drawScreen(mouseX, mouseY, partialTicks);
                super.renderHoveredToolTip(mouseX,mouseY);
        }

        @Override
        protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
                int left = (this.width - this.xSize) / 2;
                int top = (this.height - this.ySize) / 2;
                GlStateManager.color(1.0f,1.0f,1.0f,1.0f);
                this.mc.getTextureManager().bindTexture(TEXTURE);
                this.drawTexturedModalRect(left,top,0,0,this.xSize,this.ySize);
        }

        @Override
        protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
                String text = I18n.format("tile.bedrockcraft.Compressor.name");
                this.drawCenteredString(this.fontRenderer,text,this.xSize / 2,6,0x00404040);
        }
}
