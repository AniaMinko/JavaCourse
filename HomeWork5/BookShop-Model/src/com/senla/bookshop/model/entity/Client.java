package com.senla.bookshop.model.entity;

public class Client extends AEntity {
	private String name;
	public Client(Integer id,String name){
		super(id);
		this.name=name;

	}
	public String getName(){
		return name;
	}
	@Override
	public String toString(){
		return getId() + " " + name;
	}
}
