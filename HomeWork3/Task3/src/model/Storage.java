package model;

public class Storage {
	private AProduct[] products;

	public Storage(AProduct[] products) {
		this.products = products;
	}

	public Storage(AProduct[] products, int length) {
		this.products = new AProduct[length];
		copyArray(products);
	}

	public AProduct[] getProducts() {
		return products;
	}

	public void setProducts(AProduct[] products) {
		this.products = products;
	}

	public void copyArray(AProduct[] products) {
		for (int i = 0; i < products.length; i++) {
			this.products[i] = products[i];
		}
	}

	public double getWeigth() {
		double sum = 0;
		for (int i = 0; i < products.length; i++) {
			if (products[i] != null) {
				sum += products[i].getWeigth();
			}
		}
		return sum;
	}
	public void addProduct(AProduct product) {
		if (Cheker.checkEmptyCells(products)) {
			int position = Cheker.getPosition(products);
			products[position] = product;
		} 
	}
	public void printInfoAboutStorage() {
		if (Cheker.checkEmptyCells(products)) {
			System.out.println("Storage is not full");
			System.out.println("products has been added");
			for (int i = 0; i <= products.length; i++) {
				addProduct(new MeatProduct("Turkey", 155.5));
				addProduct(new Beverage("Juice", 450.0));
			}
		}
		else{
			System.out.println("Storage is full");
		}
	}

}
