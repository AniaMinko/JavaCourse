package com.senla.bookshop.api.iservice;

import java.util.Comparator;
import java.util.List;

import com.senla.bookshop.model.entity.Order;

public interface IOrderService {
	List<Order> getOrders();

	Order getOrderById(Integer id);

	Boolean addOrder(Order order) throws Exception;

	Boolean deleteOrder(Order order) throws Exception;

	List<Order> getMadeOrders() throws Exception;

	void cancelStatus(Order order);

	List<Order> sortOrders(Comparator<Order> comparator);

	List<Order> sortMadeOrders(Comparator<Order> comparator) throws Exception;

	double getTotalPrice();

	void makeOrder(Integer id);

	int getQuantityMadeOrders();
}
