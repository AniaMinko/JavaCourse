package com.senla.bookshop.server.repositories;

import com.senla.bookshop.api.ireposotiry.IOrderRepository;
import com.senla.bookshop.model.entity.Order;
import com.senla.bookshop.util.utils.FileWorker;
import com.senla.bookshop.model.entity.StatusOfOrder;
import java.util.List;

import org.apache.log4j.Logger;

import java.util.ArrayList;

public class OrderRepository implements IOrderRepository {
	private static OrderRepository instance;
	private static Logger log = Logger.getLogger(BookRepository.class.getName());
	private FileWorker fileWorker;
	private List<Order> orders;

	private OrderRepository() {
		orders = new ArrayList<Order>();
	}
	public static OrderRepository getInstance() {
		if (instance == null) {
			instance = new OrderRepository();
		}
		return instance;
	}
	@Override
	public List<Order> getOrders() {
		return orders;
	}

	@Override
	public Order getOrderById(Integer id) {
		return orders.get(id);
	}

	@Override
	public Boolean addOrder(Order order) throws Exception {
		try {
			Boolean temp = orders.add(order);
			fileWorker.writeOrder(orders);
			return temp;
		} catch (NullPointerException e) {
			log.error(e);
		}
		return null;
	}

	@Override
	public Boolean deleteOrder(Order order) throws Exception {
		try {
			Boolean temp = orders.remove(order);

			return temp;
		} catch (NullPointerException e) {
			log.error(e);
		}
		return null;
	}

	@Override
	public List<Order> getMadeOrders() throws Exception {
		List<Order> madeOrders = new ArrayList<Order>();
		try {
			for (int i = 0; i < orders.size(); i++) {
				if (orders.get(i).checkMadeOrder()) {
					madeOrders.add(orders.get(i));
				}
			}
			return madeOrders;
		} catch (NullPointerException e) {
			log.error(e);
			return null;
		}
	}

	@Override
	public void cancelStatus(Order order) {
		order.setStatus(StatusOfOrder.CANCELED);
	}
}
