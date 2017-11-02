package services;

import java.util.Comparator;
import entity.Order;

public class SortingMadeOrdersByPrice implements Comparator<Order> {

	@Override
	public int compare(Order order1, Order order2) {
		if (order1!=null && order2!=null && order1.checkMadeOrder() && order2.checkMadeOrder() ) {
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
		return 0;

	}
}
