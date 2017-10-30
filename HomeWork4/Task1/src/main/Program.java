package main;

import entity.Book;
import repositories.BookRepository;
import repositories.OrderRepository;
import repositories.RequestRepository;
import services.BookService;
import services.OrderService;
import services.RequestService;
import entity.StatusOfBook;
import entity.StatusOfOrder;
import entity.Order;
import entity.Client;
import entity.Request;

public class Program {

	public static void main(String[] args) {

		Client client1 = new Client("Anna", "ann7856@hdbs.ru");
		Client client2 = new Client("Sasha", "sasha20@gl.com");
		Client client3 = new Client("Pasha", "pashka6@lg.com");
		Book[] books = { new Book("It", "Stephen King", 120.0, 1216, StatusOfBook.YES),
				new Book("The Da Vinci Code", "Dan Draun", 75.5, 1369, StatusOfBook.YES),
				new Book("Journey to the center of the earth", "Jules Verne", 48.8, 1963, StatusOfBook.NO) };

		Order[] orders = { new Order(140.5, 1785, client1, StatusOfOrder.DURING),
				new Order(120.4, 1396, client2, StatusOfOrder.MADE),
				new Order(450.2, 7856, client3, StatusOfOrder.MADE) };
		Request[] requests = { new Request(5, 1345, books[0]), new Request(1, 1675, books[0]) };

		BookRepository repository1 = new BookRepository(books);
		BookService bookService = new BookService(repository1);

		OrderRepository repository2 = new OrderRepository(orders);
		OrderService orderService = new OrderService(repository2);

		RequestRepository repository3 = new RequestRepository(requests);
		RequestService requestService = new RequestService(repository3);

		BookShop bookShop = new BookShop(bookService, orderService, requestService);

		bookShop.getListOfBooks();
		bookShop.getListOfOrders();
		bookShop.getListOfMadeOrders();
		bookShop.getListofRequestForBook(books[0]);

		bookShop.getSortedBooksByAlphabet();
		bookShop.getSortedBooksByPrice();
		bookShop.getSortedBooksByStock();
		
		bookShop.getSortedOrdersByPrice();
		bookShop.getSortedOrdersByStatus();

		bookShop.getSortedMadeOrdersByPrice();
		
		//bookShop.getSortedRequestsByInquiry(books[0]);
		Printer.print("Info about book: ");
		bookShop.printInfoOfBook(1369);
		bookShop.printInfoOfBook(1963);
		
		Printer.print("Info about order: ");
		bookShop.printInfoOfOrder(1785);

		bookShop.addBookToStock(new Book("Anna Karenina","Lev Tolstoy",85.5,3000,StatusOfBook.YES));
		bookShop.writeOffBookFromStock(books[1]);
		
		bookShop.addOrder(new Order(130.2,2000,new Client("Dasha","dashka74@gfl.com"),StatusOfOrder.DURING));
		bookShop.makeOrder(new Book("Anna Karenina","Lev Tolstoy",85.5,3000,StatusOfBook.YES), 7856);
		bookShop.cancelOrder(orders[0]);
	}

}
