package com.evoslab.cookielicious.core.registry;

import com.evoslab.cookielicious.core.Cookielicious;
import com.minecraftabnormals.abnormals_core.core.util.registry.ItemSubRegistryHelper;
import com.minecraftabnormals.neapolitan.common.item.HealingItem;
import com.minecraftabnormals.neapolitan.core.registry.NeapolitanEffects;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.EffectInstance;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = Cookielicious.MOD_ID, bus = Bus.MOD)
public class CookieliciousItems {
	
	public static final ItemSubRegistryHelper HELPER = Cookielicious.REGISTRY_HELPER.getItemSubHelper();
	
    public static final RegistryObject<Item> STRAWBERRY_COOKIE = HELPER.createItem("strawberry_cookie", () -> new HealingItem(1F, Properties.STRAWBERRY));
    public static final RegistryObject<Item> VANILLA_COOKIE = HELPER.createItem("vanilla_cookie", () -> new Item(Properties.VANILLA));
    public static final RegistryObject<Item> SANDWICH_COOKIE = HELPER.createItem("sandwich_cookie", () -> new Item(Properties.SANDWICH));

    public static class Properties {
    	public static final Item.Properties VANILLA = new Item.Properties()
    			.group(ItemGroup.FOOD)
    			.food(new Food.Builder()
    					.hunger(2)
    					.saturation(1f)
    					.effect(()-> new EffectInstance(NeapolitanEffects.VANILLA_SCENT.get(), 120, 0), 1f)
    					.fastToEat()
    					.build());
    	
    	public static final Item.Properties SANDWICH = new Item.Properties()
    			.group(ItemGroup.FOOD)
    			.food(new Food.Builder()
    					.hunger(4)
    					.saturation(0.5f)
    					.effect(()-> new EffectInstance(NeapolitanEffects.SUGAR_RUSH.get(), 120, 0), 1f)
    					.fastToEat()
    					.build());
    	
    	public static final Item.Properties STRAWBERRY = new Item.Properties()
    			.group(ItemGroup.FOOD)
    			.food(new Food.Builder()
    					.hunger(2)
    					.saturation(1f)
    					.fastToEat()
    					.build());
    }
    
}
