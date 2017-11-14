package com.senla.bookshop.api.ireposotiry;

import java.util.List;
import com.senla.bookshop.model.entity.Order;
public interface IOrderRepository {

	List<Order> getOrders();
	Order getOrderById(Integer id);
	Boolean addOrder(Order order) throws Exception;
	Boolean deleteOrder(Order order) throws Exception;
	List<Order> getMadeOrders() throws Exception;
	void cancelStatus(Order order);
}
