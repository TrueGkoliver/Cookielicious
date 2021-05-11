package com.evoslab.cookielicious.core;

import org.apache.commons.lang3.tuple.Pair;

import co.eltrut.differentiate.core.condition.BooleanRecipeCondition;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.ForgeConfigSpec.ConfigValue;

public class CookieliciousConfig {

	public static class Common {
		public final ConfigValue<Boolean> enableVanillaCookies;
		public final ConfigValue<Boolean> enableStrawberryCookies;
		public final ConfigValue<Boolean> enableOreoCookies;
		public final ConfigValue<Boolean> enableVanillaCookieTiles;
		public final ConfigValue<Boolean> enableStrawberryCookieTiles;
		public final ConfigValue<Boolean> enableChocolateCookieTiles;
		public final ConfigValue<Boolean> enableOreoCookieTiles;
		public final ConfigValue<Boolean> enableHoneyCookieTiles;
		public final ConfigValue<Boolean> enableSweetBerryCookieTiles;
		
		Common(ForgeConfigSpec.Builder builder) {
			builder.push("common");
			
			enableVanillaCookies = builder.define("Whether vanilla cookies are enabled", true);
			enableStrawberryCookies = builder.define("Whether strawberry cookies are enabled", true);
			enableOreoCookies = builder.define("Whether oreo cookies are enabled", true);
			enableVanillaCookieTiles = builder.define("Whether vanilla cookie tiles are enabled", true);
			enableStrawberryCookieTiles = builder.define("Whether strawberry cookie tiles are enabled", true);
			enableChocolateCookieTiles = builder.define("Whether chocolate cookie tiles are enabled", true);
			enableOreoCookieTiles = builder.define("Whether oreo cookie tiles are enabled", true);
			enableHoneyCookieTiles = builder.define("Whether honey cookie tiles are enabled", true);
			enableSweetBerryCookieTiles = builder.define("Whether sweet berry cookie tiles are enabled", true);
			
			builder.pop();
			
			BooleanRecipeCondition.TABLE.put("vanilla_cookies", enableVanillaCookies);
			BooleanRecipeCondition.TABLE.put("strawberry_cookies", enableStrawberryCookies);
			BooleanRecipeCondition.TABLE.put("sandwich_cookies", enableOreoCookies);
			BooleanRecipeCondition.TABLE.put("vanilla_cookie_tiles", enableVanillaCookieTiles);
			BooleanRecipeCondition.TABLE.put("strawberry_cookie_tiles", enableStrawberryCookieTiles);
			BooleanRecipeCondition.TABLE.put("chocolate_cookie_tiles", enableChocolateCookieTiles);
			BooleanRecipeCondition.TABLE.put("sandwich_cookie_tiles", enableOreoCookieTiles);
			BooleanRecipeCondition.TABLE.put("honey_cookie_tiles", enableHoneyCookieTiles);
			BooleanRecipeCondition.TABLE.put("sweet_berry_cookie_tiles", enableSweetBerryCookieTiles);
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
