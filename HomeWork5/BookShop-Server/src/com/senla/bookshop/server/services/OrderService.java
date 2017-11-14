package com.senla.bookshop.server.services;

import java.util.Comparator;
import java.util.List;

import com.senla.bookshop.api.iservice.IOrderService;
import com.senla.bookshop.model.entity.Order;
import com.senla.bookshop.model.entity.StatusOfOrder;
import com.senla.bookshop.server.repositories.OrderRepository;

public class OrderService implements IOrderService {
	private OrderRepository repository;

	public OrderService() {
		repository = OrderRepository.getInstance();
	}

	@Override
	public List<Order> getOrders() {
		return repository.getOrders();
	}

	@Override
	public Order getOrderById(Integer id) {
		return repository.getOrderById(id);
	}

	@Override
	public Boolean addOrder(Order order) throws Exception {
		return repository.addOrder(order);
	}

	@Override
	public Boolean deleteOrder(Order order) throws Exception {
		return repository.deleteOrder(order);
	}

	@Override
	public List<Order> getMadeOrders() throws Exception {
		return repository.getMadeOrders();
	}

	@Override
	public void cancelStatus(Order order) {
		repository.cancelStatus(order);

	}

	@Override
	public List<Order> sortOrders(Comparator<Order> comparator) {
		repository.getOrders().sort(comparator);
		return repository.getOrders();
	}

	@Override
	public double getTotalPrice() {
		double sum = 0;
		for (int i = 0; i < repository.getOrders().size(); i++) {
			if (repository.getOrders().get(i) != null) {
				sum += repository.getOrders().get(i).getPrice();
			}
		}
		return sum;
	}

	@Override
	public void makeOrder(Integer id) {
		for (int i = 0; i < repository.getOrders().size(); i++) {
			if (repository.getOrders().get(i) != null
					&& repository.getOrders().get(i).getId().equals(repository.getOrderById(id))) {
				repository.getOrders().get(i).setStatus(StatusOfOrder.DURING);
			}
		}
	}

	@Override
	public int getQuantityMadeOrders() {
		int temp = 0;
		for (int i = 0; i < repository.getOrders().size(); i++) {
			if (repository.getOrders().get(i) != null && repository.getOrders().get(i).checkMadeOrder()) {
				temp++;
			}
		}
		return temp;
	}

	@Override
	public List<Order> sortMadeOrders(Comparator<Order> comparator) throws Exception {
		repository.getMadeOrders().sort(comparator);
		return repository.getMadeOrders();
	}

}
