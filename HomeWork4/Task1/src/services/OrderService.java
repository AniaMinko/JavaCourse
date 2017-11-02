package services;

import repositories.Checker;
import repositories.OrderRepository;
import java.util.Arrays;
import entity.Order;
import entity.StatusOfOrder;
import entity.Book;

//import java.util.Date;
public class OrderService {

	private OrderRepository repository;

	public OrderService(OrderRepository repository) {
		this.repository = repository;
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
		Arrays.sort(repository.getMadeOrders(), new SortingMadeOrdersByPrice());
		return repository.getOrders();
	}

	public Order[] sortMadeOrdersByDate() {
		Arrays.sort(repository.getMadeOrders(), new SortingMadeOrdersByDate());
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

	public void makeOrder(Book book, int idOfOrder) {
		if (Checker.checkEmptyCells(repository.getOrder(idOfOrder).getBooks())) {
			int position = Checker.getPosition(repository.getOrder(idOfOrder).getBooks());
			repository.getOrder(idOfOrder).getBooks()[position] = book;
			repository.getOrder(idOfOrder).setStatus(StatusOfOrder.DURING);
		}
	}

}
