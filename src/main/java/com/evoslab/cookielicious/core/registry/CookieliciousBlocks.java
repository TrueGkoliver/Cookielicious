package com.evoslab.cookielicious.core.registry;

import com.evoslab.cookielicious.core.Cookielicious;

import co.eltrut.differentiate.common.repo.VariantBlocksRepo;
import co.eltrut.differentiate.core.registrator.BlockHelper;
import co.eltrut.differentiate.core.util.CompatUtil.Mods;
import net.minecraft.block.Block;
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
	
	// Cookie Tiles
	public static final VariantBlocksRepo COOKIE_TILES = HELPER.createSimpleBlockWithVariants("cookie_tiles", Properties.COOKIE, ItemGroup.BUILDING_BLOCKS);
	public static final VariantBlocksRepo STRAWBERRY_COOKIE_TILES = HELPER.createSimpleBlockWithVariants("strawberry_cookie_tiles", Properties.COOKIE, ItemGroup.BUILDING_BLOCKS);
	public static final VariantBlocksRepo CHOCOLATE_COOKIE_TILES = HELPER.createSimpleBlockWithVariants("chocolate_cookie_tiles", Properties.COOKIE, ItemGroup.BUILDING_BLOCKS);
	public static final VariantBlocksRepo VANILLA_COOKIE_TILES = HELPER.createSimpleBlockWithVariants("vanilla_cookie_tiles", Properties.COOKIE, ItemGroup.BUILDING_BLOCKS);
	public static final VariantBlocksRepo SANDWICH_COOKIE_TILES = HELPER.createSimpleBlockWithVariants("sandwich_cookie_tiles", Properties.COOKIE, ItemGroup.BUILDING_BLOCKS);
	public static final VariantBlocksRepo HONEY_COOKIE_TILES = HELPER.createSimpleBlockWithVariants("honey_cookie_tiles", Properties.COOKIE, ItemGroup.BUILDING_BLOCKS, Mods.FARMERS_DELIGHT);
	public static final VariantBlocksRepo SWEET_BERRY_COOKIE_TILES = HELPER.createSimpleBlockWithVariants("sweet_berry_cookie_tiles", Properties.COOKIE, ItemGroup.BUILDING_BLOCKS, Mods.FARMERS_DELIGHT);
	public static final VariantBlocksRepo BANANA_COOKIE_TILES = HELPER.createSimpleBlockWithVariants("banana_cookie_tiles", Properties.COOKIE, ItemGroup.BUILDING_BLOCKS);
	public static final VariantBlocksRepo MINT_COOKIE_TILES = HELPER.createSimpleBlockWithVariants("mint_cookie_tiles", Properties.COOKIE, ItemGroup.BUILDING_BLOCKS);
	public static final VariantBlocksRepo ADZUKI_COOKIE_TILES = HELPER.createSimpleBlockWithVariants("adzuki_cookie_tiles", Properties.COOKIE, ItemGroup.BUILDING_BLOCKS);
	
    // Cookie Crates
    public static final RegistryObject<Block> STRAWBERRY_COOKIE_CRATE = HELPER.createSimpleBlock("strawberry_cookie_crate", () -> new Block(Properties.COOKIE), ItemGroup.DECORATIONS, Mods.QUARK);
    public static final RegistryObject<Block> CHOCOLATE_COOKIE_CRATE = HELPER.createSimpleBlock("chocolate_cookie_crate", () -> new Block(Properties.COOKIE), ItemGroup.DECORATIONS, Mods.QUARK);
    public static final RegistryObject<Block> VANILLA_COOKIE_CRATE = HELPER.createSimpleBlock("vanilla_cookie_crate", () -> new Block(Properties.COOKIE), ItemGroup.DECORATIONS, Mods.QUARK);
    public static final RegistryObject<Block> SANDWICH_COOKIE_CRATE = HELPER.createSimpleBlock("sandwich_cookie_crate", () -> new Block(Properties.COOKIE), ItemGroup.DECORATIONS, Mods.QUARK);
    
    public static class Properties {
    	
    	public static final Block.Properties COOKIE = Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD).harvestTool(ToolType.HOE);
    	
    }
    
}
