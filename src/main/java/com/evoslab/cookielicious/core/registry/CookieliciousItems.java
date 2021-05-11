package com.evoslab.cookielicious.core.registry;

import com.evoslab.cookielicious.common.item.CookieItem;
import com.evoslab.cookielicious.common.item.HealingCookieItem;
import com.evoslab.cookielicious.core.Cookielicious;
import com.minecraftabnormals.neapolitan.core.registry.NeapolitanEffects;

import co.eltrut.differentiate.core.registrator.ItemHelper;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(modid = Cookielicious.MOD_ID, bus = Bus.MOD)
public class CookieliciousItems {
	
	public static final ItemHelper HELPER = Cookielicious.REGISTRATOR.getHelper(ForgeRegistries.ITEMS);
	
    public static final RegistryObject<Item> VANILLA_COOKIE = HELPER.createItem("vanilla_cookie", () -> new CookieItem(Properties.VANILLA));
    public static final RegistryObject<Item> CHOCOLATE_COOKIE = HELPER.createItem("chocolate_cookie", () -> new CookieItem(Properties.CHOCOLATE));
    public static final RegistryObject<Item> SANDWICH_COOKIE = HELPER.createItem("sandwich_cookie", () -> new CookieItem(Properties.CHOCOLATE));
    public static final RegistryObject<Item> STRAWBERRY_COOKIE = HELPER.createItem("strawberry_cookie", () -> new HealingCookieItem(1F, Properties.STRAWBERRY));
    public static final RegistryObject<Item> BANANA_COOKIE = HELPER.createItem("banana_cookie", () -> new CookieItem(Properties.BANANA));
    public static final RegistryObject<Item> MINT_COOKIE = HELPER.createItem("mint_cookie", () -> new CookieItem(Properties.MINT));
    public static final RegistryObject<Item> ADZUKI_COOKIE = HELPER.createItem("adzuki_cookie", () -> new CookieItem(Properties.ADZUKI));
    
    public static class Properties {
    	
    	public static final Item.Properties VANILLA = getCookieProps(NeapolitanEffects.VANILLA_SCENT.get());
    	public static final Item.Properties CHOCOLATE = getCookieProps(NeapolitanEffects.SUGAR_RUSH.get());
    	public static final Item.Properties SANDWICH = getCookieProps(NeapolitanEffects.SUGAR_RUSH.get(), 4, 0.5F);
    	public static final Item.Properties STRAWBERRY = new Item.Properties().tab(ItemGroup.TAB_FOOD).food(new Food.Builder()
    			.nutrition(2)
    			.saturationMod(1F)
    			.fast()
    			.build());
    	public static final Item.Properties BANANA = getCookieProps(NeapolitanEffects.AGILITY.get());
    	public static final Item.Properties MINT = getCookieProps(NeapolitanEffects.BERSERKING.get());
    	public static final Item.Properties ADZUKI = getCookieProps(NeapolitanEffects.HARMONY.get());
    	
    	public static Item.Properties getCookieProps(Effect effect) {
    		return getCookieProps(effect, 2, 1F);
    	}
    	
    	public static Item.Properties getCookieProps(Effect effect, int nutrition, float saturation) {
    		return new Item.Properties().tab(ItemGroup.TAB_FOOD).food(new Food.Builder()
    				.nutrition(nutrition)
    				.saturationMod(saturation)
    				.effect(() -> new EffectInstance(effect, 120, 0), 1F)
    				.fast()
    				.build());
    	}
    	
    }
    
}
