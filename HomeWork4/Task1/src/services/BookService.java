package services;

import repositories.BookRepository;
import java.util.Arrays;

import entity.Book;
public class BookService {

	private BookRepository repository;
	
	public BookService(BookRepository repository){
		this.repository=repository;
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
