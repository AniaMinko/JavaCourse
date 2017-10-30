package model;

public class Program {

	public static void main(String[] args) {
		
		IntArray array1= new IntArray();
		array1.writeArray();
		System.out.println("randomly-filled array: ");
		array1.printArray();
		System.out.println("sum of first numbers: ");
		array1.getSum();

	}

}
