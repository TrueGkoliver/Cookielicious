package com.evoslab.cookielicious.core;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.evoslab.cookielicious.core.other.CookieliciousCompat;
import com.evoslab.cookielicious.core.other.conditions.CookieliciousCondition;
import com.evoslab.cookielicious.core.other.conditions.CookieliciousMap;
import com.minecraftabnormals.abnormals_core.core.util.registry.RegistryHelper;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.crafting.CraftingHelper;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("cookielicious")
public class Cookielicious {

    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "cookielicious";
    public static final RegistryHelper REGISTRY_HELPER = new RegistryHelper(MOD_ID);
    public static Cookielicious instance;
    
    IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

    public Cookielicious() {
    	ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, CookieliciousConfig.COMMON_SPEC);
    	
    	CraftingHelper.register(new CookieliciousCondition.Serializer(new CookieliciousMap(), "condition"));
    	
        modEventBus.addListener(this::setup);
        modEventBus.addListener(this::doClientStuff);
        instance = this;

        REGISTRY_HELPER.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }

	private void setup(final FMLCommonSetupEvent event) {
    	event.enqueueWork(() -> {
    		CookieliciousCompat.registerCompostables();
    	});
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
    }
}