package com.senla.bookshop.server.repositories;

import com.senla.bookshop.api.ireposotiry.IBookRepository;
import java.util.List;
import java.util.ArrayList;
import com.senla.bookshop.model.entity.Book;
import org.apache.log4j.Logger;
import com.senla.bookshop.util.utils.FileWorker;

public class BookRepository implements IBookRepository {
	private static BookRepository instance;
	private List<Book> books;
	private static Logger log = Logger.getLogger(BookRepository.class.getName());
	private FileWorker fileWorker;

	private BookRepository() {
		books = new ArrayList<Book>();
	}

	public static BookRepository getInstance() {
		if (instance == null) {
			instance = new BookRepository();
		}
		return instance;
	}

	@Override
	public List<Book> getBooks() {
		return books;
	}

	@Override
	public Book getBookById(Integer id) {
		return books.get(id);
	}

	/*
	 * @Override public List<Book> getOldBooks() { List<Book> oldBooks = new
	 * ArrayList<Book>(); for(int i=0; i<books.size();i++){
	 * 
	 * } }
	 */

	@Override
	public Boolean addBook(Book book) throws Exception {
		try {
			Boolean temp = books.add((Book) book);
			fileWorker.writeBooks(books);
			return temp;
		} catch (NullPointerException e) {
			log.error(e);
		}
		return null;
	}

	@Override
	public Boolean deleteBook(Book book) throws Exception {
		try {
			Boolean temp = books.remove((Book) book);

			return temp;
		} catch (NullPointerException e) {
			log.error(e);
		}
		return null;
	}

	@Override
	public Boolean sumbitApplication(Book book) {
		for (int i = 0; i < books.size(); i++) {
			if (books.get(i) != null && books.get(i).isInStock() && books.get(i).getId() == book.getId()) {
				return true;
			} else {
				return false;
			}
		}
		return null;
	}

}
