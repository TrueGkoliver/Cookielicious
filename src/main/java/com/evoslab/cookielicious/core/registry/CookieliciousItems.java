package com.evoslab.cookielicious.core.registry;

import com.evoslab.cookielicious.common.items.SandwichCookie;
import com.evoslab.cookielicious.common.items.VanillaCookie;
import com.evoslab.cookielicious.core.Cookielicious;
import com.minecraftabnormals.neapolitan.common.item.HealingItem;
import com.teamabnormals.abnormals_core.core.utils.RegistryHelper;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = Cookielicious.MOD_ID, bus = Bus.MOD)
public class CookieliciousItems {
	
	public static final RegistryHelper HELPER = Cookielicious.REGISTRY_HELPER;
	
    public static final RegistryObject<Item> STRAWBERRY_COOKIE = HELPER.createItem("strawberry_cookie", () -> new HealingItem(1F, new Item.Properties().food(Foods.STRAWBERRY_COOKIE).group(ItemGroup.FOOD)));
    public static final RegistryObject<VanillaCookie> VANILLA_COOKIE = HELPER.createItem("vanilla_cookie", VanillaCookie::new);
    public static final RegistryObject<SandwichCookie> SANDWICH_COOKIE = HELPER.createItem("sandwich_cookie", SandwichCookie::new);
    
    static class Foods {
        public static final Food STRAWBERRY_COOKIE = (new Food.Builder()).hunger(2).saturation(1F).fastToEat().build();
    }

}
