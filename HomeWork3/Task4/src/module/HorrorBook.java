package module;

public class HorrorBook extends ABook {

	public HorrorBook(String name, String author){
		super(name, author);
	}
	@Override
	public ABook getBook(){
		return new HorrorBook(getName(), getAuthor());
	}
}
