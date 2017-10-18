package model;

public class IntArray {

	private int[] array;
	private final int length;

	public IntArray() {
		length=3;
		array = new int[length];
	}

	private int[] writeArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (new java.util.Random()).nextInt(999)%900+100;
		}
		return arr;
	}

	public void printArray() {
		for (int i = 0; i < length; i++) {
				System.out.println(array[i] + " ");
		}
	}
	private int getSum(int[] arr){
		int sum=0;
		for(int i=0; i<arr.length; i++){
			arr[i]=(arr[i]-(arr[i]%100))/100;
			sum+=arr[i];
		}
		return sum;
	}
	public void getResult(int value){
		if(value==1){
			writeArray(array);
		}
		else if(value==2){
			System.out.println("sum of firsts numbers: " + getSum(array));
		}
	}
}
