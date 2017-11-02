package com.senla.repositories;
import com.senla.entity.Book;
import com.senla.entity.StatusOfBook;
import com.senla.utils.Checker;
public class BookRepository {
	private Book[] books;

	public BookRepository() {
		books = new Book[10000];
	}

	public Book[] getBooks() {
		return books;
	}

	public Book getBook(int id) {
		for (int i = 0; i < books.length; i++) {
			if (books[i] != null && books[i].getId() == id) {
				return books[i];
			}
		}
		return null;
	}

	public void addBook(Book book) {
		if (Checker.checkEmptyCells(getBooks())) {
			int position = Checker.getPosition(getBooks());
			getBooks()[position] = book;
			book.setStatus(StatusOfBook.YES);
		}
	}

	public void removeBook(Book book) {
		for (int i = 0; i < books.length; i++) {
			if (books[i] != null && books[i].getName().equals((String) book.getName())) {
				books[i].setStatus(StatusOfBook.NO);
			}
		}
	}

	public Boolean sumbitApplication(Book book) {
		for (int i = 0; i < books.length; i++) {
			if (books[i] != null && books[i].isInStock() && books[i].getId().equals(book.getId())) {
                 return true;
			}
			else{
				return false;
			}
		}
		return null;
	}
}
