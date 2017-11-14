package com.senla.bookshop.model.comparator;

import java.util.Comparator;
import com.senla.bookshop.model.entity.Book;
public class SortingBooksByStock implements Comparator<Book>{

	@Override
	public int compare(Book book1, Book book2) {
		return book1.getStatus().compareTo(book2.getStatus());
	}

}
