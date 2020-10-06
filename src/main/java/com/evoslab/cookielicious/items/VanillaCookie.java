package com.evoslab.cookielicious.items;

import com.minecraftabnormals.neapolitan.core.registry.NeapolitanEffects;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.EffectInstance;

public class VanillaCookie extends Item {
    public VanillaCookie() {
        super(new Properties()
                .group(ItemGroup.FOOD)
                .food(new Food.Builder()
                        .hunger(2)
                        .saturation(1f)
                        .effect(()-> new EffectInstance(NeapolitanEffects.VANILLA_SCENT.get(), 120, 0), 1)
                        .fastToEat()
                        .build())
        );
    }
}
