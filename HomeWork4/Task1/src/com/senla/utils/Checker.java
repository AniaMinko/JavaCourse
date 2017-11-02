package com.senla.utils;

import com.senla.entity.Book;
import com.senla.entity.Order;

public class Checker {
	public static boolean checkEmptyCells(Book[] books) {
		return ((books.length - getPosition(books)) > 0);

	}

	public static int getPosition(Book[] books) {
		for (int i = 0; i < books.length; i++) {
			if (books[i] == null) {
				return i;
			}

		}
		return books.length;
	}

	public static int getPosition(Order[] orders) {
		for (int i = 0; i < orders.length; i++) {
			if (orders[i] == null) {
				return i;
			}
		}
		return orders.length;
	}


	public static boolean checkEmptyCells(Order[] orders) {
		return (orders.length - getPosition(orders) > 0);
	}
}
