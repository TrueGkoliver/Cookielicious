package com.evoslab.cookielicious.core.registry;

import com.evoslab.cookielicious.common.item.CookieItem;
import com.evoslab.cookielicious.common.item.HealingCookieItem;
import com.evoslab.cookielicious.core.Cookielicious;
import com.minecraftabnormals.neapolitan.core.registry.NeapolitanEffects;

import co.eltrut.differentiate.core.registrator.ItemHelper;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.EffectInstance;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(modid = Cookielicious.MOD_ID, bus = Bus.MOD)
public class CookieliciousItems {
	
	public static final ItemHelper HELPER = Cookielicious.REGISTRATOR.getHelper(ForgeRegistries.ITEMS);
	
    public static final RegistryObject<Item> STRAWBERRY_COOKIE = HELPER.createItem("strawberry_cookie", () -> new HealingCookieItem(1F, Properties.STRAWBERRY));
    public static final RegistryObject<Item> VANILLA_COOKIE = HELPER.createItem("vanilla_cookie", () -> new CookieItem(Properties.VANILLA));
    public static final RegistryObject<Item> SANDWICH_COOKIE = HELPER.createItem("sandwich_cookie", () -> new CookieItem(Properties.SANDWICH));

    public static class Properties {
    	public static final Item.Properties VANILLA = new Item.Properties().tab(ItemGroup.TAB_FOOD).food(new Food.Builder()
    			.nutrition(2)
    			.saturationMod(1F)
    			.effect(() -> new EffectInstance(NeapolitanEffects.VANILLA_SCENT.get(), 120, 0), 1F)
    			.fast()
    			.build());
    	
    	public static final Item.Properties SANDWICH = new Item.Properties().tab(ItemGroup.TAB_FOOD).food(new Food.Builder()
    			.nutrition(4)
    			.saturationMod(0.5F)
    			.effect(() -> new EffectInstance(NeapolitanEffects.SUGAR_RUSH.get(), 120, 0), 1F)
    			.fast()
    			.build());
    	
    	public static final Item.Properties STRAWBERRY = new Item.Properties().tab(ItemGroup.TAB_FOOD).food(new Food.Builder()
    			.nutrition(2)
    			.saturationMod(1F)
    			.fast()
    			.build());
    }
    
}
