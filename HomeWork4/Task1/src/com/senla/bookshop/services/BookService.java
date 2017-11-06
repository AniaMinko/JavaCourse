package com.senla.bookshop.services;

import java.util.Arrays;

import com.senla.bookshop.comparator.SortingBooksByAlphabet;
import com.senla.bookshop.comparator.SortingBooksByDateOfPublication;
import com.senla.bookshop.comparator.SortingBooksByPrice;
import com.senla.bookshop.comparator.SortingBooksByStock;
import com.senla.bookshop.entity.Book;
import com.senla.bookshop.repositories.BookRepository;
public class BookService {

	private BookRepository repository;
	
	public BookService(){
		repository = new BookRepository();
	}
	public BookRepository getRepository(){
		return repository;
	}
	public Book[] sortBooksByAlphabet(){
		Arrays.sort(repository.getBooks(), new SortingBooksByAlphabet());
		return repository.getBooks();
	}
    public Book[] sortBooksByDateOfPublication(){
    	Arrays.sort(repository.getBooks(), new SortingBooksByDateOfPublication());
    	return repository.getBooks();
    }
    public Book[] sortBooksByPrice(){
    	Arrays.sort(repository.getBooks(), new SortingBooksByPrice());
    	return repository.getBooks();
    }
    public Book[] sortBooksByStock(){
    	Arrays.sort(repository.getBooks(), new SortingBooksByStock());
    	return repository.getBooks();
    }
	
}
