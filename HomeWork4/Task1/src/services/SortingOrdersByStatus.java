package services;

import java.util.Comparator;
import entity.Order;
import entity.StatusOfOrder;;

public class SortingOrdersByStatus implements Comparator<Order> {

	@Override
	public int compare(Order order1, Order order2) {
		StatusOfOrder status1 = order1.getStatus();
		StatusOfOrder status2 = order2.getStatus();
		return status1.compareTo(status2);
	}

}
