package com.evoslab.cookielicious.util;

import com.minecraftabnormals.neapolitan.common.item.HealingItem;
import com.evoslab.cookielicious.Cookielicious;
import com.evoslab.cookielicious.blocks.*;
import com.evoslab.cookielicious.items.SandwichCookie;
import com.evoslab.cookielicious.items.VanillaCookie;
import com.teamabnormals.abnormals_core.common.blocks.VerticalSlabBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.StairsBlock;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Cookielicious.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Cookielicious.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
    // Items
    public static final RegistryObject<Item> STRAWBERRY_COOKIE           = ITEMS.register("strawberry_cookie", () -> new HealingItem(1F, new Item.Properties().food(Foods.STRAWBERRY_COOKIE).group(ItemGroup.FOOD)));
    public static final RegistryObject<VanillaCookie> VANILLA_COOKIE = ITEMS.register("vanilla_cookie", VanillaCookie::new);
    public static final RegistryObject<SandwichCookie> SANDWICH_COOKIE = ITEMS.register("sandwich_cookie", SandwichCookie::new);
    // Blocks
    public static final RegistryObject<Block> STRAWBERRY_COOKIE_TILES = BLOCKS.register("strawberry_cookie_tiles", StrawberryCookieTiles::new);
    public static final RegistryObject<Block> STRAWBERRY_COOKIE_TILE_SLAB = BLOCKS.register("strawberry_cookie_tile_slab", () -> new SlabBlock(AbstractBlock.Properties.from(STRAWBERRY_COOKIE_TILES.get())));
    public static final RegistryObject<Block> STRAWBERRY_COOKIE_TILE_STAIRS = BLOCKS.register("strawberry_cookie_tile_stairs", () -> new StairsBlock(STRAWBERRY_COOKIE_TILES.get().getDefaultState(), Block.Properties.from(STRAWBERRY_COOKIE_TILES.get())));
    public static final RegistryObject<Block> STRAWBERRY_COOKIE_TILE_VERTICAL_SLAB = BLOCKS.register("strawberry_cookie_tile_vertical_slab", () -> new VerticalSlabBlock(AbstractBlock.Properties.from(STRAWBERRY_COOKIE_TILES.get())));
    public static final RegistryObject<Block> STRAWBERRY_COOKIE_CRATE = BLOCKS.register("strawberry_cookie_crate", StrawberryCookieTiles::new);

    public static final RegistryObject<Block> CHOCOLATE_COOKIE_TILES = BLOCKS.register("chocolate_cookie_tiles", ChocolateCookieTiles::new);
    public static final RegistryObject<Block> CHOCOLATE_COOKIE_TILE_SLAB = BLOCKS.register("chocolate_cookie_tile_slab", () -> new SlabBlock(AbstractBlock.Properties.from(CHOCOLATE_COOKIE_TILES.get())));
    public static final RegistryObject<Block> CHOCOLATE_COOKIE_TILE_STAIRS = BLOCKS.register("chocolate_cookie_tile_stairs", () -> new StairsBlock(CHOCOLATE_COOKIE_TILES.get().getDefaultState(), Block.Properties.from(CHOCOLATE_COOKIE_TILES.get())));
    public static final RegistryObject<Block> CHOCOLATE_COOKIE_TILE_VERTICAL_SLAB = BLOCKS.register("chocolate_cookie_tile_vertical_slab", () -> new VerticalSlabBlock(AbstractBlock.Properties.from(CHOCOLATE_COOKIE_TILES.get())));
    public static final RegistryObject<Block> CHOCOLATE_COOKIE_CRATE = BLOCKS.register("chocolate_cookie_crate", ChocolateCookieTiles::new);

    public static final RegistryObject<Block> VANILLA_COOKIE_TILES = BLOCKS.register("vanilla_cookie_tiles", VanillaCookieTiles::new);
    public static final RegistryObject<Block> VANILLA_COOKIE_TILE_SLAB = BLOCKS.register("vanilla_cookie_tile_slab", () -> new SlabBlock(AbstractBlock.Properties.from(VANILLA_COOKIE_TILES.get())));
    public static final RegistryObject<Block> VANILLA_COOKIE_TILE_STAIRS = BLOCKS.register("vanilla_cookie_tile_stairs", () -> new StairsBlock(VANILLA_COOKIE_TILES.get().getDefaultState(), Block.Properties.from(VANILLA_COOKIE_TILES.get())));
    public static final RegistryObject<Block> VANILLA_COOKIE_TILE_VERTICAL_SLAB = BLOCKS.register("vanilla_cookie_tile_vertical_slab", () -> new VerticalSlabBlock(AbstractBlock.Properties.from(VANILLA_COOKIE_TILES.get())));
    public static final RegistryObject<Block> VANILLA_COOKIE_CRATE = BLOCKS.register("vanilla_cookie_crate", ChocolateCookieTiles::new);

    public static final RegistryObject<Block> SANDWICH_COOKIE_TILES = BLOCKS.register("sandwich_cookie_tiles", SandwichCookieTiles::new);
    public static final RegistryObject<Block> SANDWICH_COOKIE_TILE_SLAB = BLOCKS.register("sandwich_cookie_tile_slab", () -> new SlabBlock(AbstractBlock.Properties.from(SANDWICH_COOKIE_TILES.get())));
    public static final RegistryObject<Block> SANDWICH_COOKIE_TILE_STAIRS = BLOCKS.register("sandwich_cookie_tile_stairs", () -> new StairsBlock(SANDWICH_COOKIE_TILES.get().getDefaultState(), Block.Properties.from(SANDWICH_COOKIE_TILES.get())));
    public static final RegistryObject<Block> SANDWICH_COOKIE_TILE_VERTICAL_SLAB = BLOCKS.register("sandwich_cookie_tile_vertical_slab", () -> new VerticalSlabBlock(AbstractBlock.Properties.from(SANDWICH_COOKIE_TILES.get())));
    public static final RegistryObject<Block> SANDWICH_COOKIE_CRATE = BLOCKS.register("sandwich_cookie_crate", ChocolateCookieTiles::new);


    public static final RegistryObject<Block> HONEY_COOKIE_TILES = BLOCKS.register("honey_cookie_tiles", StrawberryCookieTiles::new);
    public static final RegistryObject<Block> HONEY_COOKIE_TILE_SLAB = BLOCKS.register("honey_cookie_tile_slab", () -> new SlabBlock(AbstractBlock.Properties.from(STRAWBERRY_COOKIE_TILES.get())));
    public static final RegistryObject<Block> HONEY_COOKIE_TILE_STAIRS = BLOCKS.register("honey_cookie_tile_stairs", () -> new StairsBlock(STRAWBERRY_COOKIE_TILES.get().getDefaultState(), Block.Properties.from(STRAWBERRY_COOKIE_TILES.get())));
    public static final RegistryObject<Block> HONEY_COOKIE_TILE_VERTICAL_SLAB = BLOCKS.register("honey_cookie_tile_vertical_slab", () -> new VerticalSlabBlock(AbstractBlock.Properties.from(STRAWBERRY_COOKIE_TILES.get())));

    public static final RegistryObject<Block> SWEET_BERRY_COOKIE_TILES = BLOCKS.register("sweet_berry_cookie_tiles", StrawberryCookieTiles::new);
    public static final RegistryObject<Block> SWEET_BERRY_COOKIE_TILE_SLAB = BLOCKS.register("sweet_berry_cookie_tile_slab", () -> new SlabBlock(AbstractBlock.Properties.from(STRAWBERRY_COOKIE_TILES.get())));
    public static final RegistryObject<Block> SWEET_BERRY_COOKIE_TILE_STAIRS = BLOCKS.register("sweet_berry_cookie_tile_stairs", () -> new StairsBlock(STRAWBERRY_COOKIE_TILES.get().getDefaultState(), Block.Properties.from(STRAWBERRY_COOKIE_TILES.get())));
    public static final RegistryObject<Block> SWEET_BERRY_TILE_VERTICAL_SLAB = BLOCKS.register("sweet_berry_cookie_tile_vertical_slab", () -> new VerticalSlabBlock(AbstractBlock.Properties.from(STRAWBERRY_COOKIE_TILES.get())));

    // Block Items
    public static final RegistryObject<Item> STRAWBERRY_COOKIE_TILES_ITEM = ITEMS.register("strawberry_cookie_tiles", () -> new BlockItemBase(STRAWBERRY_COOKIE_TILES.get()));
    public static final RegistryObject<Item> STRAWBERRY_COOKIE_TILE_SLAB_ITEM = ITEMS.register("strawberry_cookie_tile_slab", () -> new BlockItemBase(STRAWBERRY_COOKIE_TILE_SLAB.get()));
    public static final RegistryObject<Item> STRAWBERRY_COOKIE_TILE_STAIRS_ITEM = ITEMS.register("strawberry_cookie_tile_stairs", () -> new BlockItemBase(STRAWBERRY_COOKIE_TILE_STAIRS.get()));
    public static final RegistryObject<Item> STRAWBERRY_COOKIE_TILE_VERTICAL_SLAB_ITEM = ITEMS.register("strawberry_cookie_tile_vertical_slab", () -> new BlockItemBase(STRAWBERRY_COOKIE_TILE_VERTICAL_SLAB.get()));
    public static final RegistryObject<Item> STRAWBERRY_COOKIE_CRATE_ITEM = ITEMS.register("strawberry_cookie_crate", () -> new BlockItemBase(STRAWBERRY_COOKIE_CRATE.get()));

    public static final RegistryObject<Item> VANILLA_COOKIE_TILES_ITEM = ITEMS.register("vanilla_cookie_tiles", () -> new BlockItemBase(VANILLA_COOKIE_TILES.get()));
    public static final RegistryObject<Item> VANILLA_COOKIE_TILE_SLAB_ITEM = ITEMS.register("vanilla_cookie_tile_slab", () -> new BlockItemBase(VANILLA_COOKIE_TILE_SLAB.get()));
    public static final RegistryObject<Item> VANILLA_COOKIE_TILE_STAIRS_ITEM = ITEMS.register("vanilla_cookie_tile_stairs", () -> new BlockItemBase(VANILLA_COOKIE_TILE_STAIRS.get()));
    public static final RegistryObject<Item> VANILLA_COOKIE_TILE_VERTICAL_SLAB_ITEM = ITEMS.register("vanilla_cookie_tile_vertical_slab", () -> new BlockItemBase(VANILLA_COOKIE_TILE_VERTICAL_SLAB.get()));
    public static final RegistryObject<Item> VANILLA_COOKIE_CRATE_ITEM = ITEMS.register("vanilla_cookie_crate", () -> new BlockItemBase(VANILLA_COOKIE_CRATE.get()));

    public static final RegistryObject<Item> SANDWICH_COOKIE_TILES_ITEM = ITEMS.register("sandwich_cookie_tiles", () -> new BlockItemBase(SANDWICH_COOKIE_TILES.get()));
    public static final RegistryObject<Item> SANDWICH_COOKIE_TILE_SLAB_ITEM = ITEMS.register("sandwich_cookie_tile_slab", () -> new BlockItemBase(SANDWICH_COOKIE_TILE_SLAB.get()));
    public static final RegistryObject<Item> SANDWICH_COOKIE_TILE_STAIRS_ITEM = ITEMS.register("sandwich_cookie_tile_stairs", () -> new BlockItemBase(SANDWICH_COOKIE_TILE_STAIRS.get()));
    public static final RegistryObject<Item> SANDWICH_COOKIE_TILE_VERTICAL_SLAB_ITEM = ITEMS.register("sandwich_cookie_tile_vertical_slab", () -> new BlockItemBase(SANDWICH_COOKIE_TILE_VERTICAL_SLAB.get()));
    public static final RegistryObject<Item> SANDWICH_COOKIE_CRATE_ITEM = ITEMS.register("sandwich_cookie_crate", () -> new BlockItemBase(SANDWICH_COOKIE_CRATE.get()));


    public static final RegistryObject<Item> CHOCOLATE_COOKIE_TILES_ITEM = ITEMS.register("chocolate_cookie_tiles", () -> new BlockItemBase(CHOCOLATE_COOKIE_TILES.get()));
    public static final RegistryObject<Item> CHOCOLATE_COOKIE_TILE_SLAB_ITEM = ITEMS.register("chocolate_cookie_tile_slab", () -> new BlockItemBase(CHOCOLATE_COOKIE_TILE_SLAB.get()));
    public static final RegistryObject<Item> CHOCOLATE_COOKIE_TILE_STAIRS_ITEM = ITEMS.register("chocolate_cookie_tile_stairs", () -> new BlockItemBase(CHOCOLATE_COOKIE_TILE_STAIRS.get()));
    public static final RegistryObject<Item> CHOCOLATE_COOKIE_TILE_VERTICAL_SLAB_ITEM = ITEMS.register("chocolate_cookie_tile_vertical_slab", () -> new BlockItemBase(CHOCOLATE_COOKIE_TILE_VERTICAL_SLAB.get()));
    public static final RegistryObject<Item> CHOCOLATE_COOKIE_CRATE_ITEM = ITEMS.register("chocolate_cookie_crate", () -> new BlockItemBase(CHOCOLATE_COOKIE_CRATE.get()));

    public static final RegistryObject<Item> HONEY_COOKIE_TILES_ITEM = ITEMS.register("honey_cookie_tiles", () -> new BlockItemBase(HONEY_COOKIE_TILES.get()));
    public static final RegistryObject<Item> HONEY_COOKIE_TILE_SLAB_ITEM = ITEMS.register("honey_cookie_tile_slab", () -> new BlockItemBase(HONEY_COOKIE_TILE_SLAB.get()));
    public static final RegistryObject<Item> HONEY_COOKIE_TILE_STAIRS_ITEM = ITEMS.register("honey_cookie_tile_stairs", () -> new BlockItemBase(HONEY_COOKIE_TILE_STAIRS.get()));
    public static final RegistryObject<Item> HONEY_COOKIE_TILE_VERTICAL_SLAB_ITEM = ITEMS.register("honey_cookie_tile_vertical_slab", () -> new BlockItemBase(HONEY_COOKIE_TILE_VERTICAL_SLAB.get()));

    public static final RegistryObject<Item> SWEET_BERRY_COOKIE_TILES_ITEM = ITEMS.register("sweet_berry_cookie_tiles", () -> new BlockItemBase(SWEET_BERRY_COOKIE_TILES.get()));
    public static final RegistryObject<Item> SWEET_BERRY_TILE_SLAB_ITEM = ITEMS.register("sweet_berry_cookie_tile_slab", () -> new BlockItemBase(SWEET_BERRY_COOKIE_TILE_SLAB.get()));
    public static final RegistryObject<Item> SWEET_BERRY_TILE_STAIRS_ITEM = ITEMS.register("sweet_berry_cookie_tile_stairs", () -> new BlockItemBase(SWEET_BERRY_COOKIE_TILE_STAIRS.get()));
    public static final RegistryObject<Item> SWEET_BERRY_TILE_VERTICAL_SLAB_ITEM = ITEMS.register("sweet_berry_cookie_tile_vertical_slab", () -> new BlockItemBase(SWEET_BERRY_TILE_VERTICAL_SLAB.get()));


    static class Foods {
        public static final Food STRAWBERRY_COOKIE = (new Food.Builder()).hunger(2).saturation(1F).fastToEat().build();
    }
}
