package model;



public class StringArray {
	
	private String[] array;
	
	public StringArray(){
	    array = new String[]{"Mother","Father", "Brother","java","Action","paper","action"};
	}
	
	private String[] sortArray1(String[] arr){
          for(int i=0; i<arr.length;i++){
        	  for(int j=i+1;j<arr.length; j++ ){
        		  if(arr[j].compareTo(arr[i])<0){
        			  String temp = array[j];
        			  arr[j]=arr[i];
        			  arr[i]=temp;
        		  }
        	  }
          }
          return arr;
	}
	private String[] sortArray2(String[] arr){
		for(int i=0; i<arr.length;i++){
      	  for(int j=i+1;j<arr.length; j++ ){
      		  if(arr[j].compareTo(arr[i])>0){
      			  String temp = arr[j];
      			  arr[j]=arr[i];
      			  arr[i]=temp;
      		  }
      	  }
        }
        return arr;
	}
	public void printArray(){
	for(int i=0; i<array.length;i++){
		System.out.println(array[i]+" ");
	}
}
	public void getSortArray(boolean value){
		if(value){
			System.out.println("alphabetically sorted array: " );
			sortArray1(array);
		}
		else{
			System.out.println("not alphabetically sorted array: ");
			sortArray2(array);
		}
	}

}
