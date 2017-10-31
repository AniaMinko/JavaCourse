package main;

import entity.Book;
import entity.Order;

public interface IBookShop {
	public void getListOfBooks();
	public void getListOfOrders();
	public void getListOfMadeOrders();
	public void getListofRequestForBook(Book book);
	public void getTotalPrice();
	public void getNumberMadeOrders();
	public void printInfoOfOrder(int id);
	public void printInfoOfBook(int id);
	public void addBookToStock(Book book);
	public void writeOffBookFromStock(Book book);
	public void addOrder(Order order);
	public void makeOrder(Book book, int idOfOrder);
	public void cancelOrder(Order order);
	public void getSortedBooksByAlphabet();
	public void getSortedBooksByPrice();
	public void getSortedBooksByStock();
	public void getSortedOrdersByPrice();
	public void getSortedOrdersByStatus();
	public void getSortedMadeOrdersByPrice();
	public void getSortedRequestsByInquiry(Book book);

}
