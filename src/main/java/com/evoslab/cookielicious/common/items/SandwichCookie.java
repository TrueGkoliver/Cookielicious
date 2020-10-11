package com.evoslab.cookielicious.common.items;

import com.minecraftabnormals.neapolitan.core.registry.NeapolitanEffects;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.EffectInstance;

public class SandwichCookie extends Item {
    public SandwichCookie() {
        super(new Properties()
                .group(ItemGroup.FOOD)
                .food(new Food.Builder()
                        .hunger(4)
                        .saturation(0.5f)
                        .effect(()-> new EffectInstance(NeapolitanEffects.SUGAR_RUSH.get(), 120, 0), 1f)
                        .fastToEat()
                        .build())
        );
    }
}
