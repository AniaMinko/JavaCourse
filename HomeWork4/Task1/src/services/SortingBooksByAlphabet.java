package services;
import java.util.Comparator;

import entity.Book;
public class SortingBooksByAlphabet implements Comparator<Book> {
	@Override
	public int compare(Book book1, Book book2) {
		String name1=book1.getName();
		String name2=book2.getName();
		return name1.compareTo(name2);
	}
}
