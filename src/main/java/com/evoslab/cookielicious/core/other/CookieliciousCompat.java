package com.evoslab.cookielicious.core.other;

import com.evoslab.cookielicious.core.registry.CookieliciousItems;
import com.minecraftabnormals.abnormals_core.core.util.DataUtil;

public class CookieliciousCompat {
	
	public static void registerCompostables() {
		DataUtil.registerCompostable(CookieliciousItems.SANDWICH_COOKIE.get(), 0.85F);
		DataUtil.registerCompostable(CookieliciousItems.STRAWBERRY_COOKIE.get(), 0.85F);
		DataUtil.registerCompostable(CookieliciousItems.VANILLA_COOKIE.get(), 0.85F);
	}
	
}
