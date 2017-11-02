package com.senla.main;

import com.senla.entity.Book;
import com.senla.entity.Order;
import com.senla.services.BookService;
import com.senla.services.OrderService;
public class BookShop implements IBookShop {
	private BookService bookService;
	private OrderService orderService;
	

	public BookShop() {
		bookService = new BookService();
		orderService = new OrderService();
	}

	public BookService getBookService() {
		return bookService;
	}

	@Override
	public void getListOfBooks() {
		Printer.print("list of books: ");
		Printer.printArray(bookService.getRepository().getBooks());
	}

	@Override
	public void getListOfOrders() {
		Printer.print("list of orders: ");
		Printer.printArray(orderService.getRepository().getOrders());
	}

	@Override
	public void getListOfMadeOrders() {
		Printer.print("list of made orders");
		Printer.printArray(orderService.getRepository().getMadeOrders());
	}

	@Override
	public void getTotalPrice() {
		Printer.print("total price: ");
		Printer.print(orderService.getTotalPrice());
	}

	@Override
	public void getNumberMadeOrders() {
		Printer.print("number of orders completed: ");
		Printer.print(orderService.getQuantityMadeOrders());
	}

	@Override
	public void printInfoOfOrder(int id) {
		Printer.print(orderService.getRepository().getOrder(id).toString());
	}

	@Override
	public void printInfoOfBook(int id) {
		Printer.print(bookService.getRepository().getBook(id).toString());
	}

	@Override
	public void addBookToStock(Book book) {
		bookService.getRepository().addBook(book);
	}

	@Override
	public void writeOffBookFromStock(Book book) {
		bookService.getRepository().removeBook(book);
		Printer.print("book is writed off from stock");

	}

	@Override
	public void addOrder(Order order) {
		orderService.getRepository().addOrder(order);
	}

	@Override
	public void makeOrder(Integer idOfOrder) {
		orderService.makeOrder(idOfOrder);
		Printer.print("order is satisfied");
	}

	@Override
	public void cancelOrder(Order order) {
		orderService.getRepository().cancelStatus(order);
		Printer.print("order is canceled");
	}

	@Override
	public void getSortedBooksByAlphabet() {
		Printer.print("sorted books by alphabet");
		Printer.printArray(bookService.sortBooksByAlphabet());
	}

	@Override
	public void getSortedBooksByPrice() {
		Printer.print("sorted books by price");
		Printer.printArray(bookService.sortBooksByPrice());
	}

	@Override
	public void getSortedBooksByStock() {
		Printer.print("sorted books by stock");
		Printer.printArray(bookService.sortBooksByStock());
	}

	@Override
	public void getSortedBooksByDateOfPublication() {
		Printer.print("sorted books by date of publication");
		Printer.printArray(bookService.sortBooksByDateOfPublication());
	}

	@Override
	public void getSortedOrdersByPrice() {
		Printer.print("sorted orders by price");
		Printer.printArray(orderService.sortOrdersByPrice());
	}

	@Override
	public void getSortedOrdersByStatus() {
		Printer.print("sorted orders by status");
		Printer.printArray(orderService.sortOrdersByStatus());
	}

	@Override
	public void getSortedMadeOrdersByPrice() {
		Printer.print("sorted made orders by price");
		Printer.printArray(orderService.sortMadeOrdersByPrice());
	}

	@Override
	public void getSortedMadeOrdersByDate() {
		Printer.print("sorted made orders by date");
		Printer.printArray(orderService.sortMadeOrdersByDate());
	}
   @Override
   public void sumbitApplication(Book book){
	   if(bookService.getRepository().sumbitApplication(book)){
		   Printer.print("you sumbided application");
	   }
	   else{
		   Printer.print("you can't sumbid application");
	   }
   }

}
