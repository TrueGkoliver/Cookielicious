package com.evoslab.cookielicious.core.other.conditions;

import com.evoslab.cookielicious.core.Cookielicious;
import com.google.gson.JsonObject;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.crafting.conditions.ICondition;
import net.minecraftforge.common.crafting.conditions.IConditionSerializer;

public class CookieliciousCondition implements ICondition {
	private final CookieliciousMap map;
	private final ResourceLocation location;
	private final String condition;
	
	public CookieliciousCondition(CookieliciousMap map, ResourceLocation location, String condition) {
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
	
	public static class Serializer implements IConditionSerializer<CookieliciousCondition> {
		private final CookieliciousMap map;
		private final ResourceLocation location;
		
		public Serializer(CookieliciousMap map, String name) {
			this.map = map;
			this.location = new ResourceLocation(Cookielicious.MOD_ID, name);
		}
		
		@Override
		public void write(JsonObject json, CookieliciousCondition value) {
			json.addProperty("condition", value.condition);
		}

		@Override
		public CookieliciousCondition read(JsonObject json) {
			return new CookieliciousCondition(this.map, this.location, json.getAsJsonPrimitive("condition").getAsString());
		}

		@Override
		public ResourceLocation getID() {
			return this.location;
		}
		
	}

}
