package com.senla.bookshop.services;

import java.util.Arrays;

import com.senla.bookshop.comparator.SortingOrdersByDate;
import com.senla.bookshop.comparator.SortingOrdersByPrice;
import com.senla.bookshop.comparator.SortingOrdersByStatus;
import com.senla.bookshop.entity.Order;
import com.senla.bookshop.entity.StatusOfOrder;
import com.senla.bookshop.repositories.OrderRepository;

public class OrderService {

	private OrderRepository repository;

	public OrderService() {
		repository = new OrderRepository();
	}

	public OrderRepository getRepository() {
		return repository;
	}

	public Order[] sortOrdersByPrice() {
		Arrays.sort(repository.getOrders(), new SortingOrdersByPrice());
		return repository.getOrders();
	}

	public Order[] sortOrdersByStatus() {
		Arrays.sort(repository.getOrders(), new SortingOrdersByStatus());
		return repository.getOrders();
	}

	public Order[] sortOrdersByDate() {
		Arrays.sort(repository.getOrders(), new SortingOrdersByDate());
		return repository.getOrders();
	}

	public Order[] sortMadeOrdersByPrice() {
		Arrays.sort(repository.getMadeOrders(), new SortingOrdersByPrice());
		return repository.getMadeOrders();
	}

	public Order[] sortMadeOrdersByDate() {
		Arrays.sort(repository.getMadeOrders(), new SortingOrdersByPrice());
		return repository.getMadeOrders();
	}

	public int getQuantityMadeOrders() {
		int temp = 0;
		for (int i = 0; i < repository.getOrders().length; i++) {
			if (repository.getOrders()[i] != null && repository.getOrders()[i].checkMadeOrder()) {
				temp++;
			}
		}
		return temp;
	}

	public double getTotalPrice() {
		double sum = 0;
		for (int i = 0; i < repository.getOrders().length; i++) {
			if (repository.getOrders()[i] != null) {
				sum += repository.getOrders()[i].getPrice();
			}
		}
		return sum;
	}

	public void makeOrder(Integer id) {
		for (int i = 0; i < repository.getOrders().length; i++) {
			if (repository.getOrders()[i] != null
					&& repository.getOrders()[i].getId().equals(repository.getOrder(id))) {
				repository.getOrders()[i].setStatus(StatusOfOrder.DURING);
			}
		}
	}
	

}
