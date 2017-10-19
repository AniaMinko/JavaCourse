package model;

public class Printer {
	public static void getInformation(AProduct[] products) {

		for (int i = 0; i < products.length; i++) {
			if (products[i] != null) {
				System.out.println(products[i].getName() + " " + products[i].getWeigth());
			}
		}
	}

}
