package com.evoslab.cookielicious.core.other;

import com.evoslab.cookielicious.core.Cookielicious;
import com.evoslab.cookielicious.core.registry.CookieliciousItems;
import com.minecraftabnormals.abnormals_core.core.util.TradeUtil;
import com.minecraftabnormals.abnormals_core.core.util.TradeUtil.AbnormalsTrade;

import net.minecraft.entity.merchant.villager.VillagerProfession;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber(modid = Cookielicious.MOD_ID)
public class CookieliciousEvents {
	
	@SubscribeEvent
	public static void onVillagerTrades(VillagerTradesEvent event) {
		TradeUtil.addVillagerTrades(event, VillagerProfession.FARMER, TradeUtil.JOURNEYMAN,
				new AbnormalsTrade(3, CookieliciousItems.SANDWICH_COOKIE.get(), 18, 12, 10),
				new AbnormalsTrade(3, CookieliciousItems.STRAWBERRY_COOKIE.get(), 18, 12, 10),
				new AbnormalsTrade(3, CookieliciousItems.VANILLA_COOKIE.get(), 18, 12, 10),
				new AbnormalsTrade(3, CookieliciousItems.CHOCOLATE_COOKIE.get(), 18, 12, 10),
				new AbnormalsTrade(3, CookieliciousItems.BANANA_COOKIE.get(), 18, 12, 10),
				new AbnormalsTrade(3, CookieliciousItems.MINT_COOKIE.get(), 18, 12, 10),
				new AbnormalsTrade(3, CookieliciousItems.ADZUKI_COOKIE.get(), 18, 12, 10));
	}
	
}
