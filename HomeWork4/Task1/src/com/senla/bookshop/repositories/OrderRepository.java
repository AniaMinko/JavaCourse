package com.senla.bookshop.repositories;

import com.senla.bookshop.entity.Order;
import com.senla.bookshop.entity.StatusOfOrder;
import com.senla.bookshop.utils.Checker;
//import entity.Book;
public class OrderRepository {

	private Order[] orders;
	public OrderRepository(){
		orders = new Order[10];
	}

	public Order[] getOrders() {
		return orders;
	}

	public Order getOrder(int id) {
		for (int i = 0; i < orders.length; i++) {
			if (orders[i] != null && orders[i].getId() == id) {
				return orders[i];
			}
		}
		return null;

	}

	public void addOrder(Order order) {
		if (Checker.checkEmptyCells(getOrders())) {
			int position = Checker.getPosition(getOrders());
			getOrders()[position] = order;
		}
	}

	public void removeOrder(Order order) {
		for (int i = 0; i < orders.length; i++) {
			if (orders[i] != null && orders[i].getId() == order.getId()) {
				orders[i] = null;
			}
		}
	}

	public Order[] getMadeOrders() { 
		Order[] madeOrders = new Order[10000];
		for (int i = 0; i < orders.length; i++) {
			if (orders[i] != null && orders[i].checkMadeOrder() && Checker.checkEmptyCells(madeOrders)) {
				int position = Checker.getPosition(madeOrders);
				madeOrders[position] = orders[i];
			}
		}

		return madeOrders;
	}
	public void cancelStatus(Order order){
		order.setStatus(StatusOfOrder.CANCELED);
	}
  
}
