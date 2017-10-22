package module;

public class Reader {
	private String name;
	private int numberOfCard;
	private ABook[] books = new ABook[3];
	
	public Reader(String name, int numberOfCard){
		this.name=name;
		this.numberOfCard=numberOfCard;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public int getNumberOfCard(){
		return numberOfCard;
	}
	public void setNumberOfCard(int numberOfCard){
		this.numberOfCard=numberOfCard;
	}
	public ABook[] getBooks(){
		return books;
	}

}
