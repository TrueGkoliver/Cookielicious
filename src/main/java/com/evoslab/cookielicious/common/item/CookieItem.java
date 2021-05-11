package com.evoslab.cookielicious.common.item;

import co.eltrut.differentiate.common.interf.ICompostableItem;
import net.minecraft.item.Item;

public class CookieItem extends Item implements ICompostableItem {

	public CookieItem(Properties p_i48487_1_) {
		super(p_i48487_1_);
	}

	@Override
	public float getCompostableChance() {
		return 0.85F;
	}

}
