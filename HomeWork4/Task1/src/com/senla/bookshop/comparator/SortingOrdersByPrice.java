package com.senla.bookshop.comparator;

import java.util.Comparator;

import com.senla.bookshop.entity.Order;

public class SortingOrdersByPrice implements Comparator<Order> {

	@Override
	public int compare(Order order1, Order order2) {
		if (order1 != null && order2 != null) {
			double price1 = order1.getPrice();
			double price2 = order2.getPrice();
			if (price1 > price2) {
				return 1;
			} else if (price1 < price2) {
				return -1;
			} else {
				return 0;
			}
		}
		else{
			return 0;
		}
	}

}
