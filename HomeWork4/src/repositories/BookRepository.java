package repositories;

import entity.Book;
import entity.StatusOfBook;
//import java.util.Date;

public class BookRepository {
	private Book[] books = new Book[10000];

	public BookRepository(Book[] books){
		this.books=books;
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
				books[i] = null;
				books[i].setStatus(StatusOfBook.NO);
			}
		}
	}

	/*public Book[] getStaleBooks(Date date1) {
		Book[] staleBooks = new Book[1000];
		for (int i = 0; i < books.length; i++) {
			if (books[i] != null && date1.getMonth() - books[i].getDateOfReceipt().getMonth() > 6
					&& Checker.checkEmptyCells(staleBooks)) {
				int position = Checker.getPosition(staleBooks);
				staleBooks[position] = books[i];
			}
		}
		return staleBooks;
	}*/
}
