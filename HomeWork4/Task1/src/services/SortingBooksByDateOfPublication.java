package services;

import java.util.Comparator;

import entity.Book;
import java.util.Date;

public class SortingBooksByDateOfPublication implements Comparator<Book> {

	@Override
	public int compare(Book book1, Book book2) {
		Date date1 = book1.getDateOfPublication();
		Date date2 = book2.getDateOfPublication();
		return date1.compareTo(date2);

	}

}
