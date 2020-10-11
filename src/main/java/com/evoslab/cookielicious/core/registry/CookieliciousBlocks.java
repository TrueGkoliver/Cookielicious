package com.evoslab.cookielicious.core.registry;

import com.evoslab.cookielicious.common.CookieliciousProperties;
import com.evoslab.cookielicious.core.Cookielicious;
import com.evoslab.cookielicious.core.compat.CookieliciousMods;
import com.teamabnormals.abnormals_core.common.blocks.AbnormalsStairsBlock;
import com.teamabnormals.abnormals_core.common.blocks.VerticalSlabBlock;
import com.teamabnormals.abnormals_core.core.utils.RegistryHelper;

import net.minecraft.block.Block;
import net.minecraft.block.SlabBlock;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = Cookielicious.MOD_ID, bus = Bus.MOD)
public class CookieliciousBlocks {
	
	public static final RegistryHelper HELPER = Cookielicious.REGISTRY_HELPER;

    // Strawberry
    public static final RegistryObject<Block> STRAWBERRY_COOKIE_TILES = HELPER.createBlock("strawberry_cookie_tiles", () -> new Block(CookieliciousProperties.STRAWBERRY), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> STRAWBERRY_COOKIE_TILE_SLAB = HELPER.createBlock("strawberry_cookie_tile_slab", () -> new SlabBlock(CookieliciousProperties.STRAWBERRY), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> STRAWBERRY_COOKIE_TILE_STAIRS = HELPER.createBlock("strawberry_cookie_tile_stairs", () -> new AbnormalsStairsBlock(STRAWBERRY_COOKIE_TILES.get().getDefaultState(), CookieliciousProperties.STRAWBERRY), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> STRAWBERRY_COOKIE_TILE_VERTICAL_SLAB = HELPER.createCompatBlock(CookieliciousMods.QUARK, "strawberry_cookie_tile_vertical_slab", () -> new VerticalSlabBlock(CookieliciousProperties.STRAWBERRY), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> STRAWBERRY_COOKIE_CRATE = HELPER.createCompatBlock(CookieliciousMods.QUARK, "strawberry_cookie_crate", () -> new Block(CookieliciousProperties.STRAWBERRY), ItemGroup.BUILDING_BLOCKS);

    // Chocolate
    public static final RegistryObject<Block> CHOCOLATE_COOKIE_TILES = HELPER.createBlock("chocolate_cookie_tiles", () -> new Block(CookieliciousProperties.CHOCOLATE), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> CHOCOLATE_COOKIE_TILE_SLAB = HELPER.createBlock("chocolate_cookie_tile_slab", () -> new SlabBlock(CookieliciousProperties.CHOCOLATE), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> CHOCOLATE_COOKIE_TILE_STAIRS = HELPER.createBlock("chocolate_cookie_tile_stairs", () -> new AbnormalsStairsBlock(CHOCOLATE_COOKIE_TILES.get().getDefaultState(), CookieliciousProperties.CHOCOLATE), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> CHOCOLATE_COOKIE_TILE_VERTICAL_SLAB = HELPER.createCompatBlock(CookieliciousMods.QUARK, "chocolate_cookie_tile_vertical_slab", () -> new VerticalSlabBlock(CookieliciousProperties.CHOCOLATE), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> CHOCOLATE_COOKIE_CRATE = HELPER.createCompatBlock(CookieliciousMods.QUARK, "chocolate_cookie_crate", () -> new Block(CookieliciousProperties.CHOCOLATE), ItemGroup.BUILDING_BLOCKS);

    // Vanilla
    public static final RegistryObject<Block> VANILLA_COOKIE_TILES = HELPER.createBlock("vanilla_cookie_tiles", () -> new Block(CookieliciousProperties.VANILLA), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> VANILLA_COOKIE_TILE_SLAB = HELPER.createBlock("vanilla_cookie_tile_slab", () -> new SlabBlock(CookieliciousProperties.VANILLA), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> VANILLA_COOKIE_TILE_STAIRS = HELPER.createBlock("vanilla_cookie_tile_stairs", () -> new AbnormalsStairsBlock(VANILLA_COOKIE_TILES.get().getDefaultState(), CookieliciousProperties.VANILLA), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> VANILLA_COOKIE_TILE_VERTICAL_SLAB = HELPER.createCompatBlock(CookieliciousMods.QUARK, "vanilla_cookie_tile_vertical_slab", () -> new VerticalSlabBlock(CookieliciousProperties.VANILLA), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> VANILLA_COOKIE_CRATE = HELPER.createCompatBlock(CookieliciousMods.QUARK, "vanilla_cookie_crate", () -> new Block(CookieliciousProperties.VANILLA), ItemGroup.BUILDING_BLOCKS);

    // Sandwich
    public static final RegistryObject<Block> SANDWICH_COOKIE_TILES = HELPER.createBlock("sandwich_cookie_tiles", () -> new Block(CookieliciousProperties.SANDWICH), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> SANDWICH_COOKIE_TILE_SLAB = HELPER.createBlock("sandwich_cookie_tile_slab", () -> new SlabBlock(CookieliciousProperties.SANDWICH), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> SANDWICH_COOKIE_TILE_STAIRS = HELPER.createBlock("sandwich_cookie_tile_stairs", () -> new AbnormalsStairsBlock(SANDWICH_COOKIE_TILES.get().getDefaultState(), CookieliciousProperties.SANDWICH), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> SANDWICH_COOKIE_TILE_VERTICAL_SLAB = HELPER.createCompatBlock(CookieliciousMods.QUARK, "sandwich_cookie_tile_vertical_slab", () -> new VerticalSlabBlock(CookieliciousProperties.SANDWICH), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> SANDWICH_COOKIE_CRATE = HELPER.createCompatBlock(CookieliciousMods.QUARK, "sandwich_cookie_crate", () -> new Block(CookieliciousProperties.SANDWICH), ItemGroup.BUILDING_BLOCKS);

    // Honey
    public static final RegistryObject<Block> HONEY_COOKIE_TILES = HELPER.createBlock("honey_cookie_tiles", () -> new Block(CookieliciousProperties.HONEY), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> HONEY_COOKIE_TILE_SLAB = HELPER.createBlock("honey_cookie_tile_slab", () -> new SlabBlock(CookieliciousProperties.HONEY), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> HONEY_COOKIE_TILE_STAIRS = HELPER.createBlock("honey_cookie_tile_stairs", () -> new AbnormalsStairsBlock(STRAWBERRY_COOKIE_TILES.get().getDefaultState(), CookieliciousProperties.HONEY), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> HONEY_COOKIE_TILE_VERTICAL_SLAB = HELPER.createCompatBlock(CookieliciousMods.QUARK, "honey_cookie_tile_vertical_slab", () -> new VerticalSlabBlock(CookieliciousProperties.HONEY), ItemGroup.BUILDING_BLOCKS);

    // Sweet Berry
    public static final RegistryObject<Block> SWEET_BERRY_COOKIE_TILES = HELPER.createBlock("sweet_berry_cookie_tiles", () -> new Block(CookieliciousProperties.SWEET_BERRY), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> SWEET_BERRY_COOKIE_TILE_SLAB = HELPER.createBlock("sweet_berry_cookie_tile_slab", () -> new SlabBlock(CookieliciousProperties.SWEET_BERRY), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> SWEET_BERRY_COOKIE_TILE_STAIRS = HELPER.createBlock("sweet_berry_cookie_tile_stairs", () -> new AbnormalsStairsBlock(STRAWBERRY_COOKIE_TILES.get().getDefaultState(), CookieliciousProperties.SWEET_BERRY), ItemGroup.BUILDING_BLOCKS);
    public static final RegistryObject<Block> SWEET_BERRY_TILE_VERTICAL_SLAB = HELPER.createCompatBlock(CookieliciousMods.QUARK, "sweet_berry_cookie_tile_vertical_slab", () -> new VerticalSlabBlock(CookieliciousProperties.SWEET_BERRY), ItemGroup.BUILDING_BLOCKS);
    
}
