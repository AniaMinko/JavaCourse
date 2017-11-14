package com.senla.bookshop.util.utils;

import com.danco.training.TextFileWorker;
import com.senla.bookshop.model.entity.*;
import java.util.List;
import java.text.ParseException;
import java.util.ArrayList;
import com.senla.bookshop.util.utils.Parser;
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

	public void writeBooks(List<Book> books) {
		textFileWorker = new TextFileWorker(this.pathOfBook);
		String[] booksLine = new String[books.size()];
		for (int i = 0; i < books.size(); i++) {

			booksLine[i] = books.get(i).toString();

			textFileWorker.writeToFile(booksLine);
		}
	}

	public void writeOrder(List<Order> orders) {
		textFileWorker = new TextFileWorker(this.pathOfOrder);

		String[] ordersLine = new String[orders.size()];
		for (int i = 0; i < orders.size(); i++) {
			ordersLine[i] = orders.get(i).toString();

		}
		textFileWorker.writeToFile(ordersLine);
	}

	public void writeClient(List<Client> clients) {
		textFileWorker = new TextFileWorker(this.pathOfClient);
		String[] clientsLine = new String[clients.size()];
		for (int i = 0; i < clients.size(); i++) {

			clientsLine[i] = clients.get(i).toString();

		}
		textFileWorker.writeToFile(clientsLine);
	}

	public List<Book> readBooks() throws ParseException {
		textFileWorker = new TextFileWorker(this.pathOfBook);
		String[] booksLine = textFileWorker.readFromFile();
		List<Book> books = new ArrayList<Book>();
		for(int i=0;i<booksLine.length;i++){
			books.add(Parser.parseBook(booksLine[i]));
		}
		return books;
	}

	public List<Client> readClients() {
		textFileWorker = new TextFileWorker(this.pathOfClient);
		String[] clientsLine = textFileWorker.readFromFile();
		List<Client> clients = new ArrayList<Client>();
		for(int i=0; i<clientsLine.length;i++){
			clients.add(Parser.parseClient(clientsLine[i]));
		}
		return clients;
	}

	public List<Order> readOrders() throws NumberFormatException, ParseException {
		textFileWorker = new TextFileWorker(this.pathOfOrder);
		String[] ordersLine = textFileWorker.readFromFile();
		List<Order> orders = new ArrayList<Order>();
		for(int i=0;i<ordersLine.length;i++){
			orders.add(Parser.parseOrder(ordersLine[i]));
		}
		return orders;
	}
}
