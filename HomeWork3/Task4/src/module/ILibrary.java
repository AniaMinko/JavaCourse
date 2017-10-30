package module;

public interface ILibrary {
	public void addBookInLibrary(ABook book);
	public void addNewReader(Reader reader);
	public void addBookToReader(Reader reader, ABook book);
	public void removeBookAtReader(Reader reader, ABook book);
	public void printAllBooksAtReader(Reader reader);
	//public void setReaderAtBook(ABook book);
	public void printAllBooks();
	public void printAllReaders();

}
