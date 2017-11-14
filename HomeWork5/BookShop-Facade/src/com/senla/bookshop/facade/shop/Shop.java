package com.senla.bookshop.facade.shop;

import com.senla.bookshop.api.ifacade.IShop;
import com.senla.bookshop.server.services.*;
import com.senla.bookshop.util.utils.Printer;
import com.senla.bookshop.model.entity.*;
import com.senla.bookshop.model.comparator.*;
import java.util.List;

public class Shop implements IShop {

	private static Shop instance;
	private BookService bookService;
	private OrderService orderService;

	private Shop() {
		bookService = new BookService();
		orderService = new OrderService();
	}

	public static Shop getInstance() {
		if (instance == null) {
			instance = new Shop();
		}
		return instance;
	}

	public BookService getBookService() {
		return bookService;
	}

	public OrderService getOrderService() {
		return orderService;
	}

	@Override
	public List<Book> getListOfBooks() {
		return bookService.getBooks();
	}

	@Override
	public List<Order> getListOfOrders() {
		return orderService.getOrders();

	}

	@Override
	public List<Order> getListOfMadeOrders() throws Exception {
		return orderService.getMadeOrders();

	}

	@Override
	public Double getTotalPrice() {
		return orderService.getTotalPrice();

	}

	@Override
	public Integer getNumberMadeOrders() {
		return orderService.getQuantityMadeOrders();

	}

	@Override
	public void printInfoOfOrder(int id) {
		
	}

	@Override
	public void printInfoOfBook(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addBookToStock(Book book) throws Exception {
		bookService.addBook(book);

	}

	@Override
	public void writeOffBookFromStock(Book book) throws Exception {
		bookService.deleteBook(book);

	}

	@Override
	public void addOrder(Order order) throws Exception {
		orderService.addOrder(order);

	}

	@Override
	public void makeOrder(Integer idOfOrder) {
		orderService.makeOrder(idOfOrder);

	}

	@Override
	public void cancelOrder(Order order) {
		orderService.cancelStatus(order);

	}

	@Override
	public void getSortedBooksByAlphabet() {
		Printer.printBooks(bookService.sortBooks(new SortingBooksByAlphabet()));

	}

	@Override
	public void getSortedBooksByPrice() {
		Printer.printBooks(bookService.sortBooks(new SortingBooksByPrice()));

	}

	@Override
	public void getSortedBooksByStock() {
	Printer.printBooks(bookService.sortBooks(new SortingBooksByStock()));

	}

	@Override
	public void getSortedOrdersByPrice() {
		Printer.printOrders(orderService.sortOrders(new SortingOrdersByPrice()));

	}

	@Override
	public void getSortedOrdersByStatus() {
		Printer.printOrders(orderService.sortOrders(new SortingOrdersByStatus()));

	}

	@Override
	public void getSortedMadeOrdersByPrice() throws Exception {
		Printer.printOrders(orderService.sortMadeOrders(new SortingOrdersByPrice()));

	}

	@Override
	public void getSortedMadeOrdersByDate() throws Exception {
		Printer.printOrders(orderService.sortMadeOrders(new SortingOrdersByDate()));

	}

	@Override
	public void getSortedBooksByDateOfPublication() {
		Printer.printBooks(bookService.sortBooks(new SortingBooksByDateOfPublication()));

	}

	@Override
	public Boolean sumbitApplication(Book book) {
		return bookService.sumbitApplication(book);

	}
}
