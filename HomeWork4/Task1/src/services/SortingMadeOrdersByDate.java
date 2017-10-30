package services;

import java.util.Comparator;
import java.util.Date;
import entity.Order;

public class SortingMadeOrdersByDate implements Comparator<Order> {

	@Override
	public int compare(Order order1, Order order2) {
		if (order1.checkMadeOrder() && order2.checkMadeOrder()) {
			Date date1 = order1.getDate();
			Date date2 = order2.getDate();
			return date1.compareTo(date2);
		} else {
			return 0;
		}
	}

}
