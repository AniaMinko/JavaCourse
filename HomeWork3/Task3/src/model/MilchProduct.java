package model;

public class MilchProduct extends AProduct{
	public MilchProduct(String name, double weigth){
		super(name,weigth);
	}
	@Override
    public AProduct getProduct(){
	   return new MilchProduct(getName(),getWeigth());
   }
}
