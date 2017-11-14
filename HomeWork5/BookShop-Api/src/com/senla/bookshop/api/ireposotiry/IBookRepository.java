package com.senla.bookshop.api.ireposotiry;

import com.senla.bookshop.model.entity.Book;
import java.util.List;

public interface IBookRepository {

	List<Book> getBooks();

	Book getBookById(Integer id);

	//List<Book> getOldBooks();

	Boolean addBook(Book book)throws Exception;

	Boolean deleteBook(Book book)throws Exception;

	Boolean sumbitApplication(Book book);
}
