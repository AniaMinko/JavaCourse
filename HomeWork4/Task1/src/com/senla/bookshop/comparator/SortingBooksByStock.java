package com.senla.bookshop.comparator;

import java.util.Comparator;

import com.senla.bookshop.entity.Book;
import com.senla.bookshop.entity.StatusOfBook;

public class SortingBooksByStock implements Comparator<Book> {

	@Override
	public int compare(Book book1, Book book2) {
		if (book1 != null && book2 != null) {
			StatusOfBook status1 = book1.getStatus();
			StatusOfBook status2 = book1.getStatus();
			return status1.compareTo(status2);
		}
		else{
			return 0;
		}
	}

}
