package com.senla.utils;
import com.danco.training.*;
import com.senla.entity.Book;
import com.senla.entity.Client;
import com.senla.entity.Order;

public class FileWorker {

	private static TextFileWorker textFileWorker;
	public final String bookPath = "src/Books.txt";
	private final String clientPath = "src/Clients.txt";
	private final String orderPath = "src/Orders.txt";
	public String pathOfBook;
	private String pathOfOrder;

	private String pathOfClient;

	public FileWorker(String pathOfBook, String pathOfOrder, String pathOfClient) {
		if (pathOfBook != null && pathOfOrder != null && pathOfOrder != null) {
			this.pathOfBook = pathOfBook;
			this.pathOfOrder = pathOfOrder;
			this.pathOfClient = pathOfClient;
		} else {
			this.pathOfBook = bookPath;
			this.pathOfOrder = orderPath;
			this.pathOfClient = clientPath;
		}
	}

	public void writeBooks(Book[] books) {
		int length = 0;
		textFileWorker = new TextFileWorker(this.pathOfBook);
		for (int i = 0; i < books.length; i++) {
			if (books[i] != null) {
				length++;
			}
		}
		String[] booksLine = new String[length];
		for (int i = 0; i < books.length; i++) {
			if (books[i] != null) {
				booksLine[i] = books[i].toString();
			}
			textFileWorker.writeToFile(booksLine);
		}
	}

	public void writeOrder(Order[] orders) {
		int length = 0;
		textFileWorker = new TextFileWorker(this.pathOfOrder);
		for (int i = 0; i < orders.length; i++) {
			if (orders[i] != null) {
				length++;
			}
		}
		String[] ordersLine = new String[length];
		for (int i = 0; i < orders.length; i++) {
			if (orders[i] != null) {
				ordersLine[i] = orders[i].toString();
			}

		}
		textFileWorker.writeToFile(ordersLine);
	}

	public void writeClient(Client[] clients) {
		int length = 0;
		textFileWorker = new TextFileWorker(this.pathOfClient);
		for (int i = 0; i < clients.length; i++) {
			if (clients[i] != null) {
				length++;
			}
		}
		String[] clientsLine = new String[length];
		for (int i = 0; i < clients.length; i++) {
				if (clients[i] != null) {
					clientsLine[i] = clients[i].toString();
				}
		}
		textFileWorker.writeToFile(clientsLine);
	}

	public Book[] readBooks() {
		textFileWorker = new TextFileWorker(this.pathOfBook);
		String[] booksLine = textFileWorker.readFromFile();
		if (booksLine != null) {
			Book[] books = new Book[booksLine.length];
			for (int i = 0; i < booksLine.length; i++) {
				books[i] = Parser.parseBook(booksLine[i]);
			}
			return books;
		} else {
			return null;
		}
	}

	public Client[] readClients() {
		textFileWorker = new TextFileWorker(this.pathOfClient);
		String[] clientsLine = textFileWorker.readFromFile();
		if (clientsLine != null) {
			Client[] clients = new Client[clientsLine.length];
			for (int i = 0; i < clientsLine.length; i++) {
				clients[i] = Parser.parseClient(clientsLine[i]);
			}
			return clients;
		} else {
			return null;
		}
	}

	public Order[] readOrders() {
		textFileWorker = new TextFileWorker(this.pathOfOrder);
		String[] ordersLine = textFileWorker.readFromFile();
		if (ordersLine != null) {
			Order[] orders = new Order[ordersLine.length];
			for (int i = 0; i < ordersLine.length; i++) {
				orders[i] = Parser.parseOrder(ordersLine[i]);
			}
			return orders;
		} else {
			return null;
		}
	}

}
