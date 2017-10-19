package model;

public class Cheker {

	public static boolean checkEmptyCells(AProduct[] products){ // checks if there are empty cells in the array
		if((products.length-getPosition(products))>0){
			return true;
		}
		else{
			return false;
		}
	}
	public static int getPosition(AProduct[] products){
		for(int i=0; i<products.length;i++){
			if(products[i]==null){
				 return i;
			}
		}
		return products.length;
	}
	
	
}
