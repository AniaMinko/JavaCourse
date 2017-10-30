package module;

public class AdventureBook extends ABook {
	
	public AdventureBook(String name, String author){
		super(name, author);
	}
	@Override
	public ABook getBook(){
		return new AdventureBook(getName(), getAuthor());
	}
}
