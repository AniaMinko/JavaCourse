package module;

public class Program {
	public static void main(String[] args) {

		Reader[] readers = { new Reader("Anna", 1265), new Reader("Masha", 1236), new Reader("Pasha", 1245)

		};
		ABook[] books =  {new Detective("The Da Vinci Code", "Dan Draun"),
				new AdventureBook("Journey to the center of the earth", "Jules Verne"),
				new HorrorBook("It", "Stephen King") };
		Library library = new Library();
		ManagerLibrary managerLibrary = new ManagerLibrary(library);
		managerLibrary.addBookInLibrary(books[0]);
		managerLibrary.addBookInLibrary(books[1]);
		managerLibrary.addBookInLibrary(books[2]);
		managerLibrary.printAllBooks();
		
		managerLibrary.addNewReader(readers[0]);
		managerLibrary.addNewReader(readers[1]);
		managerLibrary.addNewReader(readers[2]);
		managerLibrary.addNewReader(new Reader("Sasha",1278));
		managerLibrary.printAllReaders();
		
		managerLibrary.addBookToReader(readers[0], books[0]);
		managerLibrary.addBookToReader(readers[0], books[1]);
		managerLibrary.addBookToReader(readers[0], books[2]);
		managerLibrary.addBookToReader(readers[1], books[0]);
		managerLibrary.printAllBooksAtReader(readers[0]);
		managerLibrary.printAllBooksAtReader(readers[1]);
		managerLibrary.removeBookAtReader(readers[0], books[0]);
		managerLibrary.printAllBooksAtReader(readers[0]);
		
		//managerLibrary.setReaderAtBook(books[1]);
		//managerLibrary.setReaderAtBook(books[2]);
		//managerLibrary.setReaderAtBook(books[0]);
		
	

	}
}
