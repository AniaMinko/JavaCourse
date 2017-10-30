package services;

import java.util.Comparator;
import entity.Order;
import java.util.Date;;

public class SortingOrdersByDate implements Comparator<Order> {

	@Override
	public int compare(Order order1, Order order2) {
		Date date1 = order1.getDate();
		Date date2 = order2.getDate();
		return date1.compareTo(date2);
	}

}
