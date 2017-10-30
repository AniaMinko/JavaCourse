package model;

//import java.lang.reflect.Array;

public class StringArray {
	
	private String[] array;
	
	public StringArray(){
	    array = new String[]{"Mother","Father", "Brother","java","Action","paper","action"};
	}
	
	public void sortArray(){
          for(int i=0; i<array.length;i++){
        	  for(int j=i+1;j<array.length; j++ ){
        		  if(array[j].compareTo(array[i])<0){
        			  String temp = array[j];
        			  array[j]=array[i];
        			  array[i]=temp;
        		  }
        	  }
          }
          printArray();
	}
	
	public void printArray(){
		for(int i=0; i<array.length;i++){
			System.out.print(array[i]+" ");
		}
	}

}
