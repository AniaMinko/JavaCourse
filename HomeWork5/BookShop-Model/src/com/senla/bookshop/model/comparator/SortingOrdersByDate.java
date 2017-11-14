package com.senla.bookshop.model.comparator;

import java.util.Comparator;
import com.senla.bookshop.model.entity.Order;
public class SortingOrdersByDate implements Comparator<Order>{

	@Override
	public int compare(Order order1, Order order2) {
		return order1.getDate().compareTo(order2.getDate());
	}

}
