package com.evoslab.cookielicious.core;

import org.apache.commons.lang3.tuple.Pair;

import com.evoslab.cookielicious.core.other.recipe.CookieliciousRecipeCondition;

import net.minecraftforge.common.ForgeConfigSpec;

public class CookieliciousConfig {

	public static class Common {
		public final ForgeConfigSpec.ConfigValue<Boolean> enableVanillaCookies;
		public final ForgeConfigSpec.ConfigValue<Boolean> enableStrawberryCookies;
		public final ForgeConfigSpec.ConfigValue<Boolean> enableVanillaCookieTiles;
		public final ForgeConfigSpec.ConfigValue<Boolean> enableStrawberryCookieTiles;
		public final ForgeConfigSpec.ConfigValue<Boolean> enableChocolateCookieTiles;
		
		Common(ForgeConfigSpec.Builder builder) {
			builder.push("common");
			
			enableVanillaCookies = builder.define("Whether vanilla cookies are enabled", true);
			enableStrawberryCookies = builder.define("Whether strawberry cookies are enabled", true);
			enableVanillaCookieTiles = builder.define("Whether vanilla cookie tiles are enabled", true);
			enableStrawberryCookieTiles = builder.define("Whether strawberry cookie tiles are enabled", true);
			enableChocolateCookieTiles = builder.define("Whether chocolate cookie tiles are enabled", true);
			
			builder.pop();
			
			CookieliciousRecipeCondition.TABLE.put("vanilla_cookies", enableVanillaCookies);
			CookieliciousRecipeCondition.TABLE.put("strawberry_cookies", enableStrawberryCookies);
			CookieliciousRecipeCondition.TABLE.put("vanilla_cookie_tiles", enableVanillaCookieTiles);
			CookieliciousRecipeCondition.TABLE.put("strawberry_cookie_tiles", enableStrawberryCookieTiles);
			CookieliciousRecipeCondition.TABLE.put("chocolate_cookie_tiles", enableChocolateCookieTiles);
		}
		
	}
	
	public static final ForgeConfigSpec COMMON_SPEC;
	public static final Common COMMON;
	static {
		final Pair<Common, ForgeConfigSpec> specPair = new ForgeConfigSpec.Builder().configure(Common::new);
		COMMON_SPEC = specPair.getRight();
		COMMON = specPair.getLeft();
	}
	
}
