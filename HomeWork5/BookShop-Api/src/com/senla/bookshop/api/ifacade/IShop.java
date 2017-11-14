package com.senla.bookshop.api.ifacade;


import java.util.List;

import com.senla.bookshop.model.entity.Book;
import com.senla.bookshop.model.entity.Order;
public interface IShop {

	List<Book> getListOfBooks();

	List<Order> getListOfOrders();

	List<Order> getListOfMadeOrders() throws Exception;

	Double getTotalPrice();

	Integer getNumberMadeOrders();

	void printInfoOfOrder(int id);

	void printInfoOfBook(int id);

	void addBookToStock(Book book) throws Exception;

	void writeOffBookFromStock(Book book) throws Exception;

	void addOrder(Order order) throws Exception;

	void makeOrder(Integer idOfOrder);

	void cancelOrder(Order order);

	void getSortedBooksByAlphabet();

	void getSortedBooksByPrice();

	void getSortedBooksByStock();

	void getSortedOrdersByPrice();

	void getSortedOrdersByStatus();

	void getSortedMadeOrdersByPrice() throws Exception;

	void getSortedMadeOrdersByDate() throws Exception;

	void getSortedBooksByDateOfPublication();

	Boolean sumbitApplication(Book book);
}
