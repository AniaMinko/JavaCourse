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
		
		Client client1= new Client("Anna","ann7856@hdbs.ru");
		Client client2=new Client("Sasha", "sasha20@gl.com");
		Client client3 = new Client("Pasha", "pashka6@lg.com");
		Book[] books = { new Book("It", "Stephen King", 120.0, 1216, StatusOfBook.YES),
				new Book("The Da Vinci Code", "Dan Draun", 75.5, 1369, StatusOfBook.YES),
				new Book("Journey to the center of the earth", "Jules Verne", 48.8, 1963, StatusOfBook.NO) };
		
		Order[] orders= {new Order(140.5,1785,client1, StatusOfOrder.DURING), new Order(120.4,1396, client2,StatusOfOrder.MADE), new Order(450.2,7856,client3,StatusOfOrder.MADE)};
		Request[] requests ={new Request(5,1345,books[0]), new Request(1,1675,books[1])};
		
		
		BookRepository repository1 = new BookRepository(books);
		BookService bookService = new BookService(repository1);
		BookShop bookShop = new BookShop(bookService);
		bookShop.getListOfBooks();
        
		OrderRepository repository2=new OrderRepository(orders);
		OrderService orderService = new OrderService(repository2);
		BookShop bookShop1 =  new BookShop(orderService);
		bookShop1.getListOfOrders();
		bookShop1.getListOfMadeOrders();
		
		RequestRepository repository3 = new RequestRepository(requests);
		RequestService requestService=new RequestService(repository3);
		BookShop bookShop2 = new BookShop(requestService);
		bookShop2.getListofRequestForBook(books[0]);
		
		
		bookShop1.getSortedOrdersByPrice();
		bookShop1.getSortedOrdersByStatus();
		
		bookShop1.getSortedMadeOrdersByPrice();
		Printer.print("Info about book: ");
		bookShop.printInfoOfBook(1369);
		bookShop.printInfoOfBook(1963);

        bookShop.getSortedBooksByAlphabet();
		bookShop.getSortedBooksByPrice();
		bookShop.getSortedBooksByStock();
	}

}
