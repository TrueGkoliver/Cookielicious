package com.evoslab.cookielicious.core.other.recipe;

import java.util.HashMap;
import java.util.Map;

import com.evoslab.cookielicious.core.CookieliciousConfig;
import com.evoslab.cookielicious.core.CookieliciousConfig.Common;

import net.minecraftforge.common.ForgeConfigSpec.ConfigValue;

public class CookieliciousMap {
	private final Map<String, ConfigValue<Boolean>> map = new HashMap<>();
	
	public CookieliciousMap() {
		Common common = CookieliciousConfig.COMMON;
		map.put("vanilla_cookies", common.enableVanillaCookies);
		map.put("strawberry_cookies", common.enableStrawberryCookies);
		map.put("vanilla_cookie_tiles", common.enableVanillaCookieTiles);
		map.put("strawberry_cookie_tiles", common.enableStrawberryCookieTiles);
		map.put("chocolate_cookie_tiles", common.enableChocolateCookieTiles);
	}
	
	public boolean getValue(String key) {
		return map.containsKey(key) ? map.get(key).get() : true;
	}
	
}
