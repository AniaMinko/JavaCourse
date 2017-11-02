package com.senla.comparators;

import java.util.Comparator;

import com.senla.entity.Order;
import com.senla.entity.StatusOfOrder;;

public class SortingOrdersByStatus implements Comparator<Order> {

	@Override
	public int compare(Order order1, Order order2) {
		if (order1 != null && order2 != null) {
			StatusOfOrder status1 = order1.getStatus();
			StatusOfOrder status2 = order2.getStatus();
			return status1.compareTo(status2);
		}
		else{
			return 0;
		}
	}

}
