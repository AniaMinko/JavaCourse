package entity;
import java.util.Date;
public class Book extends Entity {
	private String name;
	private String author;
	private Date dateOfPublication;
	private double price;
	private StatusOfBook status;
    private Date dateOfReceipt;
	public Book(String name, String author, double price, int id, StatusOfBook status) {
		super(id);
		this.name = name;
		this.author = author;
		this.price = price;
		this.status=status;
	}

	public String getName() {
		return name;
	}

	public String getAuthor() {
		return author;
	}

	
	public Date getDateOfPublication() {
		return dateOfPublication;
	}
	public void setDateOfPublication(Date dateOfPublication){
		this.dateOfPublication=dateOfPublication;
	}
	public Date getDateOfReceipt() {
		return dateOfReceipt;
	}
	public void setDateOfReceipt(Date dateOfReceipt){
		this.dateOfReceipt=dateOfReceipt;
	}
	public double getPrice() {
		return price;
	}
    public boolean isInStock(){
    	if(getStatus().equals(StatusOfBook.YES)){
    		return true;
    	}
    	else{
    		return false;
    	}
    }
	public StatusOfBook getStatus() {
		return status;
	}

	public void setStatus(StatusOfBook status) {
		this.status = status;
	}
	
	@Override
	public String toString(){
		return name + " " + author + " " + dateOfPublication + " " + price + " " + dateOfReceipt + " " + status;
	}

}
