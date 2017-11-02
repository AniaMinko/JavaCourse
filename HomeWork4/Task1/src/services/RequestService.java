package services;

import repositories.RequestRepository;
import entity.Request;
import java.util.Arrays;
import entity.Book;
//import entity.Order;

public class RequestService {

	private RequestRepository repository;

	public RequestService(RequestRepository repository){
		this.repository=repository;
	}
	public RequestRepository getRepository() {
		return repository;
	}

	public Request[] sortByInquiry(Book book) {
		Arrays.sort(repository.getRequestsForBook(book), new SortingRequestByInquiry());
		return repository.getRequestsForBook(book);
	}

	
}
