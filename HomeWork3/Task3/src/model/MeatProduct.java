package model;

public class MeatProduct extends AProduct{
	public MeatProduct(String name, double weigth){
		super(name, weigth);
	}
	@Override
    public AProduct getProduct(){
	   return new MeatProduct(getName(),getWeigth());
   }
}
