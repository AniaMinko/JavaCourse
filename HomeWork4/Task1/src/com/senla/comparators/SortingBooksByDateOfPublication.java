package com.senla.comparators;

import java.util.Comparator;
import java.util.GregorianCalendar;

import com.senla.entity.Book;

public class SortingBooksByDateOfPublication implements Comparator<Book> {

	@Override
	public int compare(Book book1, Book book2) {
		if (book1 != null && book2 != null) {
			GregorianCalendar date1 = book1.getDateOfPublication();
			GregorianCalendar date2 = book2.getDateOfPublication();
			return date1.compareTo(date2);

		}
		else{
			return 0;
		}
	}

}
