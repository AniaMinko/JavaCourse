package com.senla.bookshop.util.utils;

import java.util.List;
import com.senla.bookshop.model.entity.AEntity;
import com.senla.bookshop.model.entity.Book;
import com.senla.bookshop.model.entity.Order;
public class Printer {

	public static void printBooks(List<Book> list){
		for(AEntity entity:list){
			if(entity!=null){
				System.out.println(entity);
			}
		}
	}
	public static void printOrders(List<Order> list){
		for(Order order:list){
			if(order!=null){
				System.out.println(order);
			}
		}
	}
}
