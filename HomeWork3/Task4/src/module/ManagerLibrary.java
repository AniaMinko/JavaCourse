package module;

public class ManagerLibrary implements ILibrary {
	private Library library;

	public ManagerLibrary(Library library) {
		this.library = library;
	}

	public void addBookInLibrary(ABook book) {
		if (Checker.checkEmptyCells(library.getBooks())) {
			int position = Checker.getPosition(library.getBooks());
			library.getBooks()[position] = book;
		} else {
			Printer.print("you can't add book to library");
		}
	}

	public void addBookToReader(Reader reader, ABook book) {
		if (Checker.checkEmptyCells(reader.getBooks())) {
			int position = Checker.getPosition(reader.getBooks());
			reader.getBooks()[position] = book;
		} else {
			Printer.print("reader can't take a book");
		}

	}

	public void removeBookAtReader(Reader reader, ABook book) {
		if (reader.getBooks() != null) {
			for (int i = 0; i < reader.getBooks().length; i++) {
				if (reader.getBooks()[i].equals(book)) {
					reader.getBooks()[i] = null;
				}
			}
		} else {
			Printer.print("book isn't found");
		}

	}

	public void addNewReader(Reader reader) {
		if (Checker.checkEmptyCells(library.getReaders())) {
			int position = Checker.getPosition(library.getReaders());
			library.getReaders()[position] = reader;
		} else {
			Printer.print("you can't add new reader to the library");
		}
	}

	public void printAllBooksAtReader(Reader reader) {
		for (int i = 0; i < reader.getBooks().length; i++) {
			if (reader.getBooks()[i] != null) {
				Printer.print("books that has reader: " + reader.getBooks()[i].getName() + " "
						+ reader.getBooks()[i].getAuthor());
			}
		}
	}

	/*
	 * public void setReaderAtBook(ABook book) { //method works bad, I don't
	 * understand why( if (library.getReaders() != null) { for (int i = 0; i <
	 * library.getReaders().length; i++) { for (int j = 0; j <
	 * library.getReaders()[i].getBooks().length; j++) { if
	 * (library.getReaders()[i]!=null && library.getReaders()[i].getBooks()[j]
	 * != null && library.getReaders()[i].getBooks()[j].equals((ABook) book)) {
	 * System.out.println("reader is: " + library.getReaders()[i].getName()); }
	 * } // break; } } else { System.out.println("reader is not found"); } }
	 */

	public void printAllBooks() {
		for (int i = 0; i < library.getBooks().length; i++) {
			if (library.getBooks()[i] != null) {
				Printer.print(library.getBooks()[i].getName() + " " + library.getBooks()[i].getAuthor());
			}
		}
	}

	public void printAllReaders() {
		for (int i = 0; i < library.getReaders().length; i++) {
			if (library.getReaders()[i] != null) {
				Printer.print(library.getReaders()[i].getName() + " " + library.getReaders()[i].getNumberOfCard());
			}
		}
	}

}
