package com.evoslab.cookielicious.core.other.recipe;

import com.evoslab.cookielicious.core.Cookielicious;
import com.google.gson.JsonObject;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.crafting.conditions.ICondition;
import net.minecraftforge.common.crafting.conditions.IConditionSerializer;

public class CookieliciousRecipeCondition implements ICondition {
	private final CookieliciousMap map;
	private final ResourceLocation location;
	private final String condition;
	
	public CookieliciousRecipeCondition(CookieliciousMap map, ResourceLocation location, String condition) {
		this.map = map;
		this.location = location;
		this.condition = condition;
	}

	@Override
	public ResourceLocation getID() {
		return this.location;
	}

	@Override
	public boolean test() {
		return map.getValue(condition);
	}
	
	public static class Serializer implements IConditionSerializer<CookieliciousRecipeCondition> {
		private final CookieliciousMap map;
		private final ResourceLocation location;
		
		public Serializer(CookieliciousMap map, String name) {
			this.map = map;
			this.location = new ResourceLocation(Cookielicious.MOD_ID, name);
		}
		
		@Override
		public void write(JsonObject json, CookieliciousRecipeCondition value) {
			json.addProperty("condition", value.condition);
		}

		@Override
		public CookieliciousRecipeCondition read(JsonObject json) {
			return new CookieliciousRecipeCondition(this.map, this.location, json.getAsJsonPrimitive("condition").getAsString());
		}

		@Override
		public ResourceLocation getID() {
			return this.location;
		}
		
	}

}
