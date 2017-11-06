package com.senla.bookshop.main;

import java.util.GregorianCalendar;

import com.senla.bookshop.entity.Book;
import com.senla.bookshop.entity.Client;
import com.senla.bookshop.entity.Order;
import com.senla.bookshop.entity.StatusOfBook;
import com.senla.bookshop.entity.StatusOfOrder;
import com.senla.bookshop.facade.BookShop;
import com.senla.bookshop.utils.FileWorker;

public class Program {

	public static FileWorker fileWorker;

	public static void main(String[] args) {
		fileWorker = new FileWorker("Books.txt", "Orders.txt", "Clients.txt");
		GregorianCalendar date1 = new GregorianCalendar(2015, 10, 22);
		GregorianCalendar date2 = new GregorianCalendar(2016, 02, 15);
		GregorianCalendar date3 = new GregorianCalendar(2017, 02, 22);
		GregorianCalendar date4 = new GregorianCalendar(2016, 03, 31);
		GregorianCalendar date5 = new GregorianCalendar(2017, 10, 30);

		Book[] books = {
				new Book(1100, "Journey to the center of the world", "Jules Verne", 75.5, date2, StatusOfBook.NO),
				new Book(1002, "It", "Steven King", 90.6, date3, StatusOfBook.YES),
				new Book(1333, "Blown away by the wind", "Margaret Mitchell", 130.2, date1, StatusOfBook.NO),
				new Book(1360, "War and Peace", "Lev Tolstoy", 100.0, date4, StatusOfBook.NO),
				new Book(1520, "Anna Karenina", "Lev Tolstoy", 103.2, date5, StatusOfBook.NO) };

		Client[] clients = { new Client(1111, "Anna"), new Client(1122, "Sasha"), new Client(1133, "Kirill") };

		Order[] orders = { new Order(101, clients[0], books[0], date4, StatusOfOrder.DURING),
				new Order(102, clients[1], books[2], date3, StatusOfOrder.MADE),
				new Order(103, clients[2], books[1], date5, StatusOfOrder.MADE) };
		fileWorker.writeBooks(books);
		fileWorker.writeClient(clients);
		BookShop bookShop = new BookShop();
		bookShop.addBookToStock(books[0]);
		bookShop.addBookToStock(books[1]);
		bookShop.addBookToStock(books[2]);
		bookShop.addBookToStock(books[3]);
		bookShop.addBookToStock(books[4]);

		bookShop.getListOfBooks();
		bookShop.printInfoOfBook(1100);

		bookShop.sumbitApplication(books[0]);

		bookShop.addOrder(orders[0]);
		bookShop.addOrder(orders[1]);
		bookShop.addOrder(orders[2]);
		fileWorker.writeOrder(orders);
		bookShop.printInfoOfOrder(103);

		bookShop.getListOfOrders();
		bookShop.getListOfMadeOrders();

		bookShop.getSortedOrdersByPrice();
		bookShop.getSortedOrdersByStatus();
		bookShop.getNumberMadeOrders();
		bookShop.getSortedMadeOrdersByPrice();
		bookShop.getSortedMadeOrdersByDate();
		bookShop.makeOrder(103);
		bookShop.cancelOrder(orders[2]);

		bookShop.writeOffBookFromStock(books[0]);
		bookShop.getListOfBooks();
		bookShop.getSortedBooksByAlphabet();
		bookShop.getSortedBooksByPrice();
		bookShop.getSortedBooksByStock();
		bookShop.getSortedBooksByDateOfPublication();

		bookShop.getTotalPrice();

	}
}
