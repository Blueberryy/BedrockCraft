package com.frank.block;

import com.frank.Main;
import com.frank.creativetab.TabBedrockCraft;
import com.frank.network.BedrockcraftGuiHandler;
import com.frank.tileentity.TileEntityCompressor;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;

public class Compressor extends BlockContainer {
        public Compressor(){
                super(Material.IRON);
                this.setRegistryName("compressor");
                this.setUnlocalizedName(Main.MOD_ID + ".Compressor");
                this.setCreativeTab(TabBedrockCraft.TAB_BEDROCK_CRAFT);
                this.setHardness(10);
                this.setHarvestLevel("pickaxe",1);
        }

        @Override
        public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
                if (!worldIn.isRemote){
                        int x = pos.getX(),y = pos.getY(),z = pos.getZ();
                        playerIn.openGui(Main.MOD_ID, BedrockcraftGuiHandler.COMPRESSOR,worldIn,x,y,z);
                }
                return true;
        }



        @Override
        public TileEntity createNewTileEntity(World worldIn, int meta) {
                return new TileEntityCompressor();
        }

        @Override
        public EnumBlockRenderType getRenderType(IBlockState state) {
                return EnumBlockRenderType.MODEL;
        }

        @Override
        public void breakBlock(World worldIn, BlockPos pos, IBlockState state) {
                TileEntity tileEntity = worldIn.getTileEntity(pos);
                Capability<IItemHandler> itemHandlerCapability = CapabilityItemHandler.ITEM_HANDLER_CAPABILITY;
                IItemHandler up = tileEntity.getCapability(itemHandlerCapability,EnumFacing.UP);
                IItemHandler down = tileEntity.getCapability(itemHandlerCapability,EnumFacing.DOWN);
                IItemHandler side = tileEntity.getCapability(itemHandlerCapability,EnumFacing.NORTH);
                Block.spawnAsEntity(worldIn,pos,up.getStackInSlot(0));
                Block.spawnAsEntity(worldIn,pos,down.getStackInSlot(0));
                Block.spawnAsEntity(worldIn,pos,side.getStackInSlot(0));
                super.breakBlock(worldIn, pos, state);
        }
}
