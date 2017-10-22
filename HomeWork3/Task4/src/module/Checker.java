package module;

public class Checker {
	public static boolean checkEmptyCells(ABook[] books) {
		return ((books.length - getPosition(books)) >0);

	}
	public static int getPosition(ABook[] books){
		for(int i=0; i<books.length;i++){
			if(books[i]==null){
				return i;
			}
			
		}
		return books.length;
	}
	public static boolean checkEmptyCells(Reader[] readers) {
		return ((readers.length - getPosition(readers)) > 0);
	}
	public static int getPosition(Reader[] readers){
		for(int i=0; i<readers.length;i++){
			if(readers[i]==null){
				return i;
			}
			
		}
		return readers.length;
	}

}
