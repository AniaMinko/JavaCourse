package com.senla.comparators;

import java.util.Comparator;
import java.util.GregorianCalendar;

import com.senla.entity.Order;

public class SortingOrdersByDate implements Comparator<Order> {

	@Override
	public int compare(Order order1, Order order2) {
		if (order1 != null && order2 != null) {
			GregorianCalendar date1 = order1.getDate();
			GregorianCalendar date2 = order2.getDate();
			return date1.compareTo(date2);
		}
		else{
			return 0;
		}
	}

}
