package com.evoslab.cookielicious.core.registry;

import com.evoslab.cookielicious.core.Cookielicious;
import com.minecraftabnormals.abnormals_core.common.blocks.AbnormalsStairsBlock;
import com.minecraftabnormals.abnormals_core.common.blocks.VerticalSlabBlock;

import co.eltrut.differentiate.core.registrator.BlockHelper;
import co.eltrut.differentiate.core.util.CompatUtil.Mods;
import net.minecraft.block.Block;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(modid = Cookielicious.MOD_ID, bus = Bus.MOD)
public class CookieliciousBlocks {
	
	public static final BlockHelper HELPER = Cookielicious.REGISTRATOR.getHelper(ForgeRegistries.BLOCKS);
	
    // Strawberry
    public static final RegistryObject<Block> STRAWBERRY_COOKIE_TILES = HELPER.createSimpleBlock("strawberry_cookie_tiles", () -> new Block(Properties.COOKIE), ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> STRAWBERRY_COOKIE_TILE_SLAB = HELPER.createSimpleBlock("strawberry_cookie_tile_slab", () -> new SlabBlock(Properties.COOKIE), ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> STRAWBERRY_COOKIE_TILE_STAIRS = HELPER.createSimpleBlock("strawberry_cookie_tile_stairs", () -> new AbnormalsStairsBlock(STRAWBERRY_COOKIE_TILES.get().defaultBlockState(), Properties.COOKIE), ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> STRAWBERRY_COOKIE_TILE_VERTICAL_SLAB = HELPER.createSimpleBlock("strawberry_cookie_tile_vertical_slab", () -> new VerticalSlabBlock(Properties.COOKIE), ItemGroup.TAB_BUILDING_BLOCKS, Mods.QUARK);
    public static final RegistryObject<Block> STRAWBERRY_COOKIE_CRATE = HELPER.createSimpleBlock("strawberry_cookie_crate", () -> new Block(Properties.COOKIE), ItemGroup.TAB_DECORATIONS, Mods.QUARK);

    // Chocolate
    public static final RegistryObject<Block> CHOCOLATE_COOKIE_TILES = HELPER.createSimpleBlock("chocolate_cookie_tiles", () -> new Block(Properties.COOKIE), ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> CHOCOLATE_COOKIE_TILE_SLAB = HELPER.createSimpleBlock("chocolate_cookie_tile_slab", () -> new SlabBlock(Properties.COOKIE), ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> CHOCOLATE_COOKIE_TILE_STAIRS = HELPER.createSimpleBlock("chocolate_cookie_tile_stairs", () -> new AbnormalsStairsBlock(CHOCOLATE_COOKIE_TILES.get().defaultBlockState(), Properties.COOKIE), ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> CHOCOLATE_COOKIE_TILE_VERTICAL_SLAB = HELPER.createSimpleBlock("chocolate_cookie_tile_vertical_slab", () -> new VerticalSlabBlock(Properties.COOKIE), ItemGroup.TAB_BUILDING_BLOCKS, Mods.QUARK);
    public static final RegistryObject<Block> CHOCOLATE_COOKIE_CRATE = HELPER.createSimpleBlock("chocolate_cookie_crate", () -> new Block(Properties.COOKIE), ItemGroup.TAB_DECORATIONS, Mods.QUARK);

    // Vanilla
    public static final RegistryObject<Block> VANILLA_COOKIE_TILES = HELPER.createSimpleBlock("vanilla_cookie_tiles", () -> new Block(Properties.COOKIE), ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> VANILLA_COOKIE_TILE_SLAB = HELPER.createSimpleBlock("vanilla_cookie_tile_slab", () -> new SlabBlock(Properties.COOKIE), ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> VANILLA_COOKIE_TILE_STAIRS = HELPER.createSimpleBlock("vanilla_cookie_tile_stairs", () -> new AbnormalsStairsBlock(VANILLA_COOKIE_TILES.get().defaultBlockState(), Properties.COOKIE), ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> VANILLA_COOKIE_TILE_VERTICAL_SLAB = HELPER.createSimpleBlock("vanilla_cookie_tile_vertical_slab", () -> new VerticalSlabBlock(Properties.COOKIE), ItemGroup.TAB_BUILDING_BLOCKS, Mods.QUARK);
    public static final RegistryObject<Block> VANILLA_COOKIE_CRATE = HELPER.createSimpleBlock("vanilla_cookie_crate", () -> new Block(Properties.COOKIE), ItemGroup.TAB_DECORATIONS, Mods.QUARK);

    // Sandwich
    public static final RegistryObject<Block> SANDWICH_COOKIE_TILES = HELPER.createSimpleBlock("sandwich_cookie_tiles", () -> new Block(Properties.COOKIE), ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> SANDWICH_COOKIE_TILE_SLAB = HELPER.createSimpleBlock("sandwich_cookie_tile_slab", () -> new SlabBlock(Properties.COOKIE), ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> SANDWICH_COOKIE_TILE_STAIRS = HELPER.createSimpleBlock("sandwich_cookie_tile_stairs", () -> new AbnormalsStairsBlock(SANDWICH_COOKIE_TILES.get().defaultBlockState(), Properties.COOKIE), ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> SANDWICH_COOKIE_TILE_VERTICAL_SLAB = HELPER.createSimpleBlock("sandwich_cookie_tile_vertical_slab", () -> new VerticalSlabBlock(Properties.COOKIE), ItemGroup.TAB_BUILDING_BLOCKS, Mods.QUARK);
    public static final RegistryObject<Block> SANDWICH_COOKIE_CRATE = HELPER.createSimpleBlock("sandwich_cookie_crate", () -> new Block(Properties.COOKIE), ItemGroup.TAB_DECORATIONS, Mods.QUARK);

    // Honey
    public static final RegistryObject<Block> HONEY_COOKIE_TILES = HELPER.createSimpleBlock("honey_cookie_tiles", () -> new Block(Properties.COOKIE), ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> HONEY_COOKIE_TILE_SLAB = HELPER.createSimpleBlock("honey_cookie_tile_slab", () -> new SlabBlock(Properties.COOKIE), ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> HONEY_COOKIE_TILE_STAIRS = HELPER.createSimpleBlock("honey_cookie_tile_stairs", () -> new AbnormalsStairsBlock(STRAWBERRY_COOKIE_TILES.get().defaultBlockState(), Properties.COOKIE), ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> HONEY_COOKIE_TILE_VERTICAL_SLAB = HELPER.createSimpleBlock("honey_cookie_tile_vertical_slab", () -> new VerticalSlabBlock(Properties.COOKIE), ItemGroup.TAB_BUILDING_BLOCKS, "farmersdelight", Mods.QUARK);

    // Sweet Berry
    public static final RegistryObject<Block> SWEET_BERRY_COOKIE_TILES = HELPER.createSimpleBlock("sweet_berry_cookie_tiles", () -> new Block(Properties.COOKIE), ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> SWEET_BERRY_COOKIE_TILE_SLAB = HELPER.createSimpleBlock("sweet_berry_cookie_tile_slab", () -> new SlabBlock(Properties.COOKIE), ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> SWEET_BERRY_COOKIE_TILE_STAIRS = HELPER.createSimpleBlock("sweet_berry_cookie_tile_stairs", () -> new AbnormalsStairsBlock(STRAWBERRY_COOKIE_TILES.get().defaultBlockState(), Properties.COOKIE), ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> SWEET_BERRY_TILE_VERTICAL_SLAB = HELPER.createSimpleBlock("sweet_berry_cookie_tile_vertical_slab", () -> new VerticalSlabBlock(Properties.COOKIE), ItemGroup.TAB_BUILDING_BLOCKS, "farmersdelight", Mods.QUARK);
    
    public static class Properties {
    	public static final Block.Properties COOKIE = Block.Properties.of(Material.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD).harvestTool(ToolType.AXE);
    }
    
}
