package com.evoslab.cookielicious.core.other;

import com.evoslab.cookielicious.core.registry.CookieliciousItems;
import com.teamabnormals.abnormals_core.core.utils.DataUtils;

public class CookieliciousCompostables {
	
	public static void registerCompostables() {
		DataUtils.registerCompostable(CookieliciousItems.SANDWICH_COOKIE.get(), 0.85F);
		DataUtils.registerCompostable(CookieliciousItems.STRAWBERRY_COOKIE.get(), 0.85F);
		DataUtils.registerCompostable(CookieliciousItems.VANILLA_COOKIE.get(), 0.85F);
	}
}
