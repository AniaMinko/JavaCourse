package com.senla.bookshop.model.comparator;

import java.util.Comparator;
import com.senla.bookshop.model.entity.Book;
public class SortingBooksByDateOfPublication implements Comparator<Book>{

	@Override
	public int compare(Book book1, Book book2) {
		return book1.getDateOfPublication().compareTo(book2.getDateOfPublication());
	}

}
