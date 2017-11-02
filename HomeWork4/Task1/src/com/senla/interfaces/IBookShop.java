package com.senla.interfaces;

import com.senla.entity.Book;
import com.senla.entity.Order;

public interface IBookShop {
	void getListOfBooks();

	void getListOfOrders();

	void getListOfMadeOrders();

	void getTotalPrice();

	void getNumberMadeOrders();

	void printInfoOfOrder(int id);

	void printInfoOfBook(int id);

	void addBookToStock(Book book);

	void writeOffBookFromStock(Book book);

	void addOrder(Order order);

	void makeOrder(Integer idOfOrder);

	void cancelOrder(Order order);

	void getSortedBooksByAlphabet();

	void getSortedBooksByPrice();

	void getSortedBooksByStock();

	void getSortedOrdersByPrice();

	void getSortedOrdersByStatus();

	void getSortedMadeOrdersByPrice();

	void getSortedMadeOrdersByDate();

	void getSortedBooksByDateOfPublication();

	void sumbitApplication(Book book);
}
