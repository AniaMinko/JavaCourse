package main;
import entity.Book;
import entity.Order;
import entity.Request;
public class Printer {
	public static void print(String string) {
		System.out.println(string);
	}
	public static void print(double number){
		System.out.println(number);
	}
	public static void print(int number){
		System.out.println(number);
	}
	public static void printArray(Book[] books){
		for(int i=0; i< books.length;i++){
			if(books[i]!=null){
				System.out.println(books[i]);
			}
		}
	}
	public static void printArray(Order[] orders){
		for(int i=0; i<orders.length;i++){
			if(orders[i]!=null){
				System.out.println(orders[i]);
			}
		}
	}
	public static void printArray(Request[] requests){
		for(int i=0; i<requests.length;i++){
			if(requests[i]!=null){
				System.out.println(requests[i]);
			}
		}
	}
}
