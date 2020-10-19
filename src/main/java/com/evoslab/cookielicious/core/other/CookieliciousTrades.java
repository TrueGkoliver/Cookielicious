package com.evoslab.cookielicious.core.other;

import java.util.List;

import com.evoslab.cookielicious.core.Cookielicious;
import com.evoslab.cookielicious.core.registry.CookieliciousItems;
import com.teamabnormals.abnormals_core.core.utils.TradeUtils;

import net.minecraft.entity.merchant.villager.VillagerProfession;
import net.minecraft.entity.merchant.villager.VillagerTrades.ITrade;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Cookielicious.MOD_ID)
public class CookieliciousTrades {
	
	@SubscribeEvent
	public static void onVillagerTradesEvent(VillagerTradesEvent event) {
		List<ITrade> novice = event.getTrades().get(1);
		List<ITrade> apprentice = event.getTrades().get(2);
		List<ITrade> journeyman = event.getTrades().get(3);
		List<ITrade> expert = event.getTrades().get(4);
		List<ITrade> master = event.getTrades().get(5);
		
		if (event.getType() == VillagerProfession.FARMER) {
			journeyman.add(new TradeUtils.ItemsForEmeraldsTrade(CookieliciousItems.SANDWICH_COOKIE.get(), 3, 18, 12, 10));
			journeyman.add(new TradeUtils.ItemsForEmeraldsTrade(CookieliciousItems.STRAWBERRY_COOKIE.get(), 3, 18, 12, 10));
			journeyman.add(new TradeUtils.ItemsForEmeraldsTrade(CookieliciousItems.VANILLA_COOKIE.get(), 3, 18, 12, 10));
		}
		
	}

}
