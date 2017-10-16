package model;

public class Beverage extends AProduct{
	
	public Beverage(String name, double weigth){
		super(name,weigth);
	}
	
	@Override
    public AProduct getProduct(){
	   return new Beverage(getName(),getWeigth());
   }
}
