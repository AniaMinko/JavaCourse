package repositories;

import entity.Request;
import entity.Book;;

public class RequestRepository {
	private Request[] requests = new Request[10000];

	public RequestRepository(Request[] requests){
		this.requests=requests;
	}
	public Request[] getRequests() {
		return requests;
	}

	public Request getRequest(Request request) {
		for (int i = 0; i < requests.length; i++) {
			if (requests[i] != null && requests[i].getId() == request.getId()) {
				return requests[i];
			}
		}
		return null;
	}

	public void addRequest(Request request) {
		if (Checker.checkEmptyCells(requests)) {
			int position = Checker.getPosition(requests);
			requests[position] = request;
		}
	}

	public void removeRequest(Request request) {
		for (int i = 0; i < requests.length; i++) {
			if (requests[i] != null && requests[i].getId() == request.getId()) {
				requests[i] = null;
			}
		}
	}

	public Request[] getRequestsForBook(Book book) {
		Request[] requestsForBook = new Request[100];
		for (int i = 0; i < requests.length; i++) {
			if (requests[i] != null && requests[i].getBook().getName().equals(book.getName())
					&& Checker.checkEmptyCells(requestsForBook)) {
				int position = Checker.getPosition(requestsForBook);
				requestsForBook[position] = requests[i];
			}
		}
		return requestsForBook;

	}
}
