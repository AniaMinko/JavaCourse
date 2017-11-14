package com.senla.bookshop.util.utils;

import com.senla.bookshop.model.entity.*;

import java.text.ParseException;
import java.util.Date;
import workingdate.ParsingDate;

public class Parser {
	public static Book parseBook(String line) throws ParseException {
		String[] bookString = line.split(" ");
		Integer id = Integer.parseInt(bookString[0]);
		String name = bookString[1];
		String author = bookString[2];
		Date dateOfPublication = ParsingDate.parse(bookString[3]);
		Double price = Double.parseDouble(bookString[4]);
		StatusOfBook status = StatusOfBook.valueOf(bookString[5]);
		Date dateOfReceipt = ParsingDate.parse(bookString[6]);
		return new Book(id, name, author, dateOfPublication, price, status, dateOfReceipt);
	}

	public static Client parseClient(String line) {
		String[] clientString = line.split(" ");
		Integer id = Integer.parseInt(clientString[0]);
		String name = clientString[1];
		return new Client(id, name);
	}

	public static Order parseOrder(String line) throws NumberFormatException, ParseException {
		String[] orderString = line.split(" ");
		Integer id = Integer.parseInt(orderString[0]);
		Client client = new Client(Integer.parseInt(orderString[1]), orderString[2]);
		Book book = new Book(Integer.parseInt(orderString[3]), orderString[4], orderString[5],
				ParsingDate.parse(orderString[6]), Double.parseDouble(orderString[7]),
				StatusOfBook.valueOf(orderString[8]), ParsingDate.parse(orderString[9]));
		Date date = ParsingDate.parse(orderString[10]);
		StatusOfOrder status = StatusOfOrder.valueOf(orderString[11]);
		return new Order(id, client, book, date, status);
	}

}
