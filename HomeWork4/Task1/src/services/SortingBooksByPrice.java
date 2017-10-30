package services;

import java.util.Comparator;

import entity.Book;

public class SortingBooksByPrice implements Comparator<Book> {

	@Override
	public int compare(Book book1, Book book2) {
		double price1 = book1.getPrice();
		double price2 = book2.getPrice();

		if (price1 > price2) {
			return 1;
		} else if (price1 < price2) {
			return -1;
		} else {
			return 0;
		}
	}
}
