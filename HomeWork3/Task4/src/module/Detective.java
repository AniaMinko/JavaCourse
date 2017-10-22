package module;

public class Detective extends ABook {

	public Detective(String name, String author){
		super(name, author);
	}
	@Override
	public ABook getBook(){
		return new Detective(getName(), getAuthor());
	}
}
