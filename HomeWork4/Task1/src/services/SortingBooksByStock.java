package services;

import java.util.Comparator;

import entity.Book;
import entity.StatusOfBook;

public class SortingBooksByStock implements Comparator<Book> {

	@Override
	public int compare(Book book1, Book book2) {
		StatusOfBook status1 = book1.getStatus();
		StatusOfBook status2 = book1.getStatus();
		return status1.compareTo(status2);
	}

}
