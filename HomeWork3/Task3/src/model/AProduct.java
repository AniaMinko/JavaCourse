package model;

public abstract class AProduct  {
	private String name;
	private double weigth;
	
	public AProduct(String name, double weigth){
		this.name=name;
		this.weigth=weigth;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	
	public void setWeigth(double weigth){
		this.weigth=weigth;
	}
	public double getWeigth(){
		return weigth;
	}
	
	
	
	

}
