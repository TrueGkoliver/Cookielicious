package com.evoslab.cookielicious.core.other.recipe;

import java.util.Hashtable;

import com.evoslab.cookielicious.core.Cookielicious;
import com.google.gson.JsonObject;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.ForgeConfigSpec.ConfigValue;
import net.minecraftforge.common.crafting.conditions.ICondition;
import net.minecraftforge.common.crafting.conditions.IConditionSerializer;

public class CookieliciousRecipeCondition implements ICondition {
	
	public static final Hashtable<String, ConfigValue<Boolean>> TABLE = new Hashtable<>();
	
	private final ResourceLocation location;
	private final String condition;
	
	public CookieliciousRecipeCondition(ResourceLocation location, String condition) {
		this.location = location;
		this.condition = condition;
	}

	@Override
	public ResourceLocation getID() {
		return this.location;
	}

	@Override
	public boolean test() {
		return TABLE.containsKey(this.condition) ? TABLE.get(this.condition).get() : true;
	}
	
	public static class Serializer implements IConditionSerializer<CookieliciousRecipeCondition> {
		private final ResourceLocation location;
		
		public Serializer(String name) {
			this.location = new ResourceLocation(Cookielicious.MOD_ID, name);
		}
		
		@Override
		public void write(JsonObject json, CookieliciousRecipeCondition value) {
			json.addProperty("condition", value.condition);
		}

		@Override
		public CookieliciousRecipeCondition read(JsonObject json) {
			return new CookieliciousRecipeCondition(this.location, json.getAsJsonPrimitive("condition").getAsString());
		}

		@Override
		public ResourceLocation getID() {
			return this.location;
		}
		
	}

}
