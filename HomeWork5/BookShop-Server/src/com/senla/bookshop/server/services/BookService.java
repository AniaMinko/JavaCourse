package com.senla.bookshop.server.services;

import java.util.List;
import java.util.Comparator;
import com.senla.bookshop.api.iservice.IBookService;
import com.senla.bookshop.model.entity.Book;
import com.senla.bookshop.server.repositories.BookRepository;

public class BookService implements IBookService {
		private BookRepository repository;

	public BookService() {
		this.repository=BookRepository.getInstance();
	}
	public BookRepository getRepository(){
		return repository;
	}
	@Override
	public List<Book> getBooks() {
		return repository.getBooks();
	}
	@Override
	public Book getBookById(Integer id) {
		return repository.getBookById(id);
	}
	@Override
	public Boolean addBook(Book book) throws Exception {
		return repository.addBook(book);
	}
	@Override
	public Boolean deleteBook(Book book) throws Exception {
		return repository.deleteBook(book);
	}
	@Override
	public Boolean sumbitApplication(Book book) {
		return repository.sumbitApplication(book);
	}
	@Override
	public List<Book> sortBooks(Comparator<Book> comparator) {
		repository.getBooks().sort(comparator);
		return repository.getBooks();
		
	}
}
