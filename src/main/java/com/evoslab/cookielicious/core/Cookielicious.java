package com.evoslab.cookielicious.core;

import co.eltrut.differentiate.core.registrator.Registrator;
import com.evoslab.cookielicious.core.registry.CookieliciousItems;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("cookielicious")
public class Cookielicious {

    public static final String MOD_ID = "cookielicious";
    public static final Registrator REGISTRATOR = new Registrator(MOD_ID);
    public static Cookielicious instance;
    
    IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

    public Cookielicious() {
    	ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, CookieliciousConfig.COMMON_SPEC);
    	
        modEventBus.addListener(this::doCommonStuff);
        modEventBus.addListener(this::doClientStuff);
        instance = this;

        MinecraftForge.EVENT_BUS.register(this);
    }

	private void doCommonStuff(final FMLCommonSetupEvent event) {
        setStuff(CookieliciousItems.Effects.HARMONY);
    }
    public static void setStuff(Effect effect) {
        setStuff(effect, 2, 1F);
    }
    public static void setStuff(Effect effect, int nutrition, float saturation) {
        Item.Properties old = new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder()
					.hunger(nutrition)
					.saturation(saturation)
					.effect(() -> new EffectInstance(effect, 120, 0), 1F)
					.fastToEat()
					.build());
    		Item.Properties new_t = new Item.Properties().group(ItemGroup.FOOD).food(new Food.Builder()
					.hunger(2)
					.saturation(1F)
					.effect(() -> new EffectInstance(CookieliciousItems.Effects.HARMONY, 120, 0), 1F)
					.fastToEat()
					.build());
    		System.out.println(old.equals(new_t));
    		System.out.println("Old one:");
    		System.out.println(old.toString());
    		System.out.println("New one:");
    		System.out.println(new_t.toString());
    }
    private void doClientStuff(final FMLClientSetupEvent event) {
    }
}