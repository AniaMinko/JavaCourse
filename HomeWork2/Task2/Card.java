public class Card{
private int number;
private String adress;
public void setNumber(int number){
     
        this.number=number;
    }
    public int getNumber() { return number; }
	public void setAdress(String adress){
		this.adress=adress;
	}
    public String getAdress() { return adress; }
	
	public Card(int number,String adress)
	{
	this.number=number;
	this.adress=adress;
	}
	}
    