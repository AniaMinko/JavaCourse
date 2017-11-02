package entity;

public class Request extends Entity {

	private int quantity; 
	private Client client;
	private Book book;

	public Request(int quantity,int id, Book book) {
		super(id);
		this.quantity=quantity;
		this.book=book;
	}

	public int getQuantity() {
		return quantity;
	}

	public Client getClient() {
		return client;
	}
	public Book getBook(){
		return book;
	}
	@Override
    public String toString() {
       return quantity+" " + book;
    }
}
