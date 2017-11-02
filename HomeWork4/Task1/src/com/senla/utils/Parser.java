package com.senla.utils;

import java.util.GregorianCalendar;

import com.senla.entity.*;

public class Parser {

	public static Book parseBook(String line) {
		String[] bookString = line.split(" ");
		Integer id = Integer.parseInt(bookString[0]);
		String name = bookString[1];
		String author = bookString[2];
		Double price = Double.parseDouble(bookString[3]);
		GregorianCalendar dateOfPublication = new GregorianCalendar(Integer.parseInt(bookString[4]),
				Integer.parseInt(bookString[5]), Integer.parseInt(bookString[6]));
		StatusOfBook status = StatusOfBook.valueOf(bookString[7]);
		return new Book(id, name, author, price, dateOfPublication, status);
	}

	public static Client parseClient(String line) {
		String[] clientString = line.split(" ");
		Integer id = Integer.parseInt(clientString[0]);
		String name = clientString[1];
		return new Client(id, name);
	}

	public static Order parseOrder(String line) {
		String[] orderString = line.split(" ");
		Integer id = Integer.parseInt(orderString[0]);
		Client client = new Client(Integer.parseInt(orderString[1]), orderString[2]);
		Book book = new Book(Integer.parseInt(orderString[3]), orderString[4], orderString[5],
				Double.parseDouble(orderString[6]), new GregorianCalendar(Integer.parseInt(orderString[7]),
						Integer.parseInt(orderString[8]), Integer.parseInt(orderString[9])),
				StatusOfBook.valueOf(orderString[10]));
		GregorianCalendar date = new GregorianCalendar(Integer.parseInt(orderString[11]),
				Integer.parseInt(orderString[12]), Integer.parseInt(orderString[13]));
		StatusOfOrder status = StatusOfOrder.valueOf(orderString[14]);
		return new Order(id, client, book, date, status);
	}

	
}
