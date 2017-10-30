package model;

public class Storage {
	private AProduct[] products;
	private int length;

	public Storage(AProduct[] products) {
		length = 10;
		products = new AProduct[length];
	}

	public AProduct[] getProducts() {
		return products;
	}

	public void setProducts(AProduct[] products) {
		this.products = products;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public void getInformation(AProduct[] products) {

		for(int i=0; i<getLength();i++){
			System.out.println(products[i].getProduct().getName()+ " " + products[i].getProduct().getWeigth());
		}
	}
	public double getWeigth(AProduct[] products){
		double sum=0;
		for(int i=0; i<getLength();i++){
			
			sum+=products[i].getWeigth();
		}
		return sum;
	}
	
 
	
}
