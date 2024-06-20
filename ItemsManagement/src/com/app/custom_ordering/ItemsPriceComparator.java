package com.app.custom_ordering;

import java.util.Comparator;

import com.app.entity.Items;

public class ItemsPriceComparator implements Comparator<Items> {

	@Override
	public int compare(Items o1, Items o2) {
		if(o1.getPrice() < o2.getPrice())
			return 1;
		if(o1.getPrice() == o2.getPrice())
			return 0;
		return -1;
	}

}
