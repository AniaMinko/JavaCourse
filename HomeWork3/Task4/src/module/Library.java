package module;

public class Library {
	private ABook[] books = new ABook[1000];
	private Reader[] readers = new Reader[1000];
	
	public ABook[] getBooks(){
		return books;
	}
	public Reader[] getReaders(){
		return readers;
	}

}
