package model;

public class Program {

	public static void main(String[] args) {
		AProduct[] products = { new MeatProduct("Sausage", 500.5), new Beverage("Water", 450.0),
				new MilchProduct("Milch", 550.0), new MilchProduct("Ñheese", 450.6), new MeatProduct("Bacon", 180.4),
				new Beverage("Juice", 250.0), new MilchProduct("Butter", 80.6), new Beverage("Vodka", 950.5),
				new Beverage("Whiskey", 850.5), new MilchProduct("Kefir",450.0)

		};
		
		Storage storage=new Storage(products,12);
		storage.printInfoAboutStorage();
		System.out.println("Products in storage: ");
		Printer.getInformation(storage.getProducts());
		System.out.println("Weigth of all products: " + storage.getWeigth());
		
	}

}
