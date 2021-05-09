package com.evoslab.cookielicious.core.registry;

import com.evoslab.cookielicious.core.Cookielicious;
import com.evoslab.cookielicious.core.other.CookieliciousMods;
import com.minecraftabnormals.abnormals_core.common.blocks.AbnormalsStairsBlock;
import com.minecraftabnormals.abnormals_core.common.blocks.VerticalSlabBlock;
import com.minecraftabnormals.abnormals_core.core.util.registry.BlockSubRegistryHelper;

import net.minecraft.block.Block;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = Cookielicious.MOD_ID, bus = Bus.MOD)
public class CookieliciousBlocks {
	
	public static final BlockSubRegistryHelper HELPER = Cookielicious.REGISTRY_HELPER.getBlockSubHelper();

    // Strawberry
    public static final RegistryObject<Block> STRAWBERRY_COOKIE_TILES = HELPER.createBlock("strawberry_cookie_tiles", () -> new Block(Properties.COOKIE), ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> STRAWBERRY_COOKIE_TILE_SLAB = HELPER.createBlock("strawberry_cookie_tile_slab", () -> new SlabBlock(Properties.COOKIE), ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> STRAWBERRY_COOKIE_TILE_STAIRS = HELPER.createBlock("strawberry_cookie_tile_stairs", () -> new AbnormalsStairsBlock(STRAWBERRY_COOKIE_TILES.get().defaultBlockState(), Properties.COOKIE), ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> STRAWBERRY_COOKIE_TILE_VERTICAL_SLAB = HELPER.createCompatBlock(CookieliciousMods.QUARK, "strawberry_cookie_tile_vertical_slab", () -> new VerticalSlabBlock(Properties.COOKIE), ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> STRAWBERRY_COOKIE_CRATE = HELPER.createCompatBlock(CookieliciousMods.QUARK, "strawberry_cookie_crate", () -> new Block(Properties.COOKIE), ItemGroup.TAB_DECORATIONS);

    // Chocolate
    public static final RegistryObject<Block> CHOCOLATE_COOKIE_TILES = HELPER.createBlock("chocolate_cookie_tiles", () -> new Block(Properties.COOKIE), ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> CHOCOLATE_COOKIE_TILE_SLAB = HELPER.createBlock("chocolate_cookie_tile_slab", () -> new SlabBlock(Properties.COOKIE), ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> CHOCOLATE_COOKIE_TILE_STAIRS = HELPER.createBlock("chocolate_cookie_tile_stairs", () -> new AbnormalsStairsBlock(CHOCOLATE_COOKIE_TILES.get().defaultBlockState(), Properties.COOKIE), ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> CHOCOLATE_COOKIE_TILE_VERTICAL_SLAB = HELPER.createCompatBlock(CookieliciousMods.QUARK, "chocolate_cookie_tile_vertical_slab", () -> new VerticalSlabBlock(Properties.COOKIE), ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> CHOCOLATE_COOKIE_CRATE = HELPER.createCompatBlock(CookieliciousMods.QUARK, "chocolate_cookie_crate", () -> new Block(Properties.COOKIE), ItemGroup.TAB_DECORATIONS);

    // Vanilla
    public static final RegistryObject<Block> VANILLA_COOKIE_TILES = HELPER.createBlock("vanilla_cookie_tiles", () -> new Block(Properties.COOKIE), ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> VANILLA_COOKIE_TILE_SLAB = HELPER.createBlock("vanilla_cookie_tile_slab", () -> new SlabBlock(Properties.COOKIE), ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> VANILLA_COOKIE_TILE_STAIRS = HELPER.createBlock("vanilla_cookie_tile_stairs", () -> new AbnormalsStairsBlock(VANILLA_COOKIE_TILES.get().defaultBlockState(), Properties.COOKIE), ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> VANILLA_COOKIE_TILE_VERTICAL_SLAB = HELPER.createCompatBlock(CookieliciousMods.QUARK, "vanilla_cookie_tile_vertical_slab", () -> new VerticalSlabBlock(Properties.COOKIE), ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> VANILLA_COOKIE_CRATE = HELPER.createCompatBlock(CookieliciousMods.QUARK, "vanilla_cookie_crate", () -> new Block(Properties.COOKIE), ItemGroup.TAB_DECORATIONS);

    // Sandwich
    public static final RegistryObject<Block> SANDWICH_COOKIE_TILES = HELPER.createBlock("sandwich_cookie_tiles", () -> new Block(Properties.COOKIE), ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> SANDWICH_COOKIE_TILE_SLAB = HELPER.createBlock("sandwich_cookie_tile_slab", () -> new SlabBlock(Properties.COOKIE), ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> SANDWICH_COOKIE_TILE_STAIRS = HELPER.createBlock("sandwich_cookie_tile_stairs", () -> new AbnormalsStairsBlock(SANDWICH_COOKIE_TILES.get().defaultBlockState(), Properties.COOKIE), ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> SANDWICH_COOKIE_TILE_VERTICAL_SLAB = HELPER.createCompatBlock(CookieliciousMods.QUARK, "sandwich_cookie_tile_vertical_slab", () -> new VerticalSlabBlock(Properties.COOKIE), ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> SANDWICH_COOKIE_CRATE = HELPER.createCompatBlock(CookieliciousMods.QUARK, "sandwich_cookie_crate", () -> new Block(Properties.COOKIE), ItemGroup.TAB_DECORATIONS);

    // Honey
    public static final RegistryObject<Block> HONEY_COOKIE_TILES = HELPER.createCompatBlock(CookieliciousMods.FARMERS_DELIGHT, "honey_cookie_tiles", () -> new Block(Properties.COOKIE), ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> HONEY_COOKIE_TILE_SLAB = HELPER.createCompatBlock(CookieliciousMods.FARMERS_DELIGHT, "honey_cookie_tile_slab", () -> new SlabBlock(Properties.COOKIE), ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> HONEY_COOKIE_TILE_STAIRS = HELPER.createCompatBlock(CookieliciousMods.FARMERS_DELIGHT, "honey_cookie_tile_stairs", () -> new AbnormalsStairsBlock(STRAWBERRY_COOKIE_TILES.get().defaultBlockState(), Properties.COOKIE), ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> HONEY_COOKIE_TILE_VERTICAL_SLAB = HELPER.createCompatBlock("honey_cookie_tile_vertical_slab", () -> new VerticalSlabBlock(Properties.COOKIE), ItemGroup.TAB_BUILDING_BLOCKS, CookieliciousMods.FARMERS_DELIGHT, CookieliciousMods.QUARK);

    // Sweet Berry
    public static final RegistryObject<Block> SWEET_BERRY_COOKIE_TILES = HELPER.createCompatBlock(CookieliciousMods.FARMERS_DELIGHT, "sweet_berry_cookie_tiles", () -> new Block(Properties.COOKIE), ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> SWEET_BERRY_COOKIE_TILE_SLAB = HELPER.createCompatBlock(CookieliciousMods.FARMERS_DELIGHT, "sweet_berry_cookie_tile_slab", () -> new SlabBlock(Properties.COOKIE), ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> SWEET_BERRY_COOKIE_TILE_STAIRS = HELPER.createCompatBlock(CookieliciousMods.FARMERS_DELIGHT, "sweet_berry_cookie_tile_stairs", () -> new AbnormalsStairsBlock(STRAWBERRY_COOKIE_TILES.get().defaultBlockState(), Properties.COOKIE), ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> SWEET_BERRY_TILE_VERTICAL_SLAB = HELPER.createCompatBlock("sweet_berry_cookie_tile_vertical_slab", () -> new VerticalSlabBlock(Properties.COOKIE), ItemGroup.TAB_BUILDING_BLOCKS, CookieliciousMods.FARMERS_DELIGHT, CookieliciousMods.QUARK);
    
    public static class Properties {
    	public static final Block.Properties COOKIE = Block.Properties.of(Material.WOOD)
    			.strength(1.0f, 1.0f)
    			.sound(SoundType.WOOD)
    			.harvestTool(ToolType.AXE);
    }
    
}
