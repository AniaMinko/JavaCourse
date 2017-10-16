package model;

public class IntArray {

	private int[] array;
	private int length;

	public IntArray() {
		length=3;
		array = new int[length];
	}

	public void writeArray() {
		for (int i = 0; i < length; i++) {
			array[i] = (new java.util.Random()).nextInt(999)%900+100;
		}
	}

	public void printArray() {
		for (int i = 0; i < length; i++) {
				System.out.println(array[i] + " ");
		}
	}
	public void getSum(){
		int sum=0;
		for(int i=0; i<length; i++){
			array[i]=(array[i]-(array[i]%100))/100;
			sum+=array[i];
		}
		System.out.print(sum);
	}
}
