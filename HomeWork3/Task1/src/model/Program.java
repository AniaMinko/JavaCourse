package model;

public class Program {

	public static void main(String[] args) {
		
		StringArray array=new StringArray();
		
		System.out.println("Source array: ");
		array.printArray();
		array.getSortArray(true);
		array.printArray();
		array.getSortArray(false);
		array.printArray();

	}

}
