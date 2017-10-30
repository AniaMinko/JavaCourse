package main;

import services.BookService;
import services.OrderService;
import services.RequestService;
import entity.Order;
import entity.Book;

public class BookShop {
	private BookService bookService;
	private OrderService orderService;
	private RequestService requestService;

	public BookShop(BookService bookService) {
		this.bookService = bookService;
	}

	public BookShop(OrderService orderService) {
		this.orderService = orderService;
	}

	public BookShop(RequestService requestService) {
		this.requestService = requestService;
	}

	public BookService getBookService() {
		return bookService;
	}

	public void getListOfBooks() {
		Printer.print("list of books: ");
		for (int i = 0; i < bookService.getRepository().getBooks().length; i++) {
			if (bookService.getRepository().getBooks()[i] != null) {
				Printer.print(bookService.getRepository().getBooks()[i].toString());
			}
		}
	}

	public void getListOfOrders() {
		Printer.print("list of orders: ");
		for (int i = 0; i < orderService.getRepository().getOrders().length; i++) {
			if (orderService.getRepository().getOrders()[i] != null) {
				Printer.print(orderService.getRepository().getOrders()[i].toString());
			}
		}
	}

	/*
	 * public void getListOfRequests() { for (int i = 0; i <
	 * requestService.getRepository().getRequests().length; i++) { if
	 * (requestService.getRepository().getRequests()[i] != null) {
	 * Printer.print(requestService.getRepository().getRequests()[i].toString())
	 * ; } } }
	 */

	public void getListOfMadeOrders() {
		Printer.print("list of made orders");
		for (int i = 0; i < orderService.getRepository().getMadeOrders().length; i++) {
			if (orderService.getRepository().getMadeOrders()[i] != null) {
				Printer.print(orderService.getRepository().getMadeOrders()[i].toString());
			}
		}
	}

	public void getListofRequestForBook(Book book) {
		Printer.print("list of requests for a book");
		for (int i = 0; i < requestService.getRepository().getRequestsForBook(book).length; i++) {
			if (requestService.getRepository().getRequestsForBook(book)[i] != null) {
				Printer.print(requestService.getRepository().getRequestsForBook(book)[i].toString());
			}
		}
	}

	public void getTotalPrice() {
		Printer.print("total price: ");
		Printer.print(orderService.getTotalPrice());
	}

	public void getNumberMadeOrders() {
		Printer.print("number of orders completed: ");
		Printer.print(orderService.getQuantityMadeOrders());
	}

	public void printInfoOfOrder(int id) {
		Printer.print(orderService.getRepository().getOrder(id).toString());
	}

	public void printInfoOfBook(int id) {
		Printer.print(bookService.getRepository().getBook(id).toString());
	}

	public void addBookToStock(Book book) {
		bookService.getRepository().addBook(book);
		Printer.print("book is added");
	}

	public void writeOffBookFromStock(Book book) {
		bookService.getRepository().removeBook(book);
		Printer.print("book is writed off from stock");

	}

	public void addOrder(Order order) {
		orderService.getRepository().addOrder(order);
		Printer.print("order is added");
	}

	public void makeOrder(Book book, int idOfOrder) {
		orderService.makeOrder(book, idOfOrder);
		Printer.print("order is maked");
	}

	public void cancelOrder(Order order) {
		orderService.getRepository().cancelStatus(order);
		Printer.print("order is canceled");
	}

	public void getSortedBooksByAlphabet() {
		Printer.print("sorted books by alphabet");
		Printer.printArray(bookService.sortBooksByAlphabet());
	}

	public void getSortedBooksByPrice() {
		Printer.print("sorted books by price");
		Printer.printArray(bookService.sortBooksByPrice());
	}

	public void getSortedBooksByStock() {
		Printer.print("sorted books by stock");
		Printer.printArray(bookService.sortBooksByStock());
	}

	public void getSortedOrdersByPrice() {
		Printer.print("sorted orders by price");
		Printer.printArray(orderService.sortOrdersByPrice());
	}

	public void getSortedOrdersByStatus() {
		Printer.print("sorted orders by status");
		Printer.printArray(orderService.sortOrdersByStatus());
	}

	public void getSortedMadeOrdersByPrice() {
		Printer.print("sorted made orders by price");
		Printer.printArray(orderService.sortMadeOrdersByPrice());
	}

	public void getSortedRequestsByInquiry(Book book) {
		Printer.print("sorted requests by inquiry");
		Printer.printArray(requestService.sortByInquiry(book));
	}
}
