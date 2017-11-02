package com.senla.services;

import java.util.Arrays;

import com.senla.comparators.SortingBooksByAlphabet;
import com.senla.comparators.SortingBooksByDateOfPublication;
import com.senla.comparators.SortingBooksByPrice;
import com.senla.comparators.SortingBooksByStock;
import com.senla.entity.Book;
import com.senla.repositories.BookRepository;
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
