package services;

import java.util.Comparator;
import entity.Order;

public class SortingOrdersByPrice implements Comparator<Order> {

	@Override
	public int compare(Order order1, Order order2) {
		double price1= order1.getPrice();
		double price2=order2.getPrice();
		if(price1>price2){
			return 1;
		}
		else if(price1<price2){
			return -1;
		}
		else{
			return 0;
		}
	}

}
