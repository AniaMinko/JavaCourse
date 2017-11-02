package com.senla.utils;

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
	public static void printArray(Object[] obj){
		for(int i=0; i< obj.length;i++){
			if(obj[i]!=null){
				System.out.println(obj[i]);
			}
		}
	}
}
