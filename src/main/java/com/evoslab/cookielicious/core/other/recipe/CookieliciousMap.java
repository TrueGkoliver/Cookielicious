package com.evoslab.cookielicious.core.other.recipe;

import java.util.HashMap;
import java.util.Map;

import com.evoslab.cookielicious.core.CookieliciousConfig;
import com.evoslab.cookielicious.core.CookieliciousConfig.Common;

public class CookieliciousMap {
	private final Map<String, Boolean> map = new HashMap<>();
	
	public CookieliciousMap() {
		Common common = CookieliciousConfig.COMMON;
		map.put("vanilla_cookies", common.enableVanillaCookies.get());
		map.put("strawberry_cookies", common.enableStrawberryCookies.get());
		map.put("vanilla_cookie_tiles", common.enableVanillaCookieTiles.get());
		map.put("strawberry_cookie_tiles", common.enableStrawberryCookieTiles.get());
		map.put("chocolate_cookie_tiles", common.enableChocolateCookieTiles.get());
	}
	
	public boolean getValue(String key) {
		return map.containsKey(key) ? map.get(key) : false;
	}
	
}
