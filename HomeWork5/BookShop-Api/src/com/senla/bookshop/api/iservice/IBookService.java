package com.senla.bookshop.api.iservice;

import java.util.List;
import java.util.Comparator;
import com.senla.bookshop.model.entity.Book;

public interface IBookService {

	List<Book> getBooks();

	Book getBookById(Integer id);

	Boolean addBook(Book book)throws Exception;

	Boolean deleteBook(Book book)throws Exception;

	Boolean sumbitApplication(Book book);
	
	List<Book> sortBooks(Comparator<Book> comparator);
}
