package com.senla.bookshop.entity;

import java.util.Calendar;
import java.util.GregorianCalendar;

//import java.util.Date;
public class Book extends Entity {
	private String name;
	private String author;
	private GregorianCalendar dateOfPublication;
	private Double price;
	private StatusOfBook status;
	private GregorianCalendar dateOfReceipt;
	private Integer request;

	public Book(Integer id, String name, String author, Double price, GregorianCalendar dateOfPublication,
			StatusOfBook status) {
		super(id);
		this.name = name;
		this.author = author;
		this.price = price;
		this.dateOfPublication = dateOfPublication;
		this.status = status;
	}

	public String getName() {
		return name;
	}

	public String getAuthor() {
		return author;
	}

	public GregorianCalendar getDateOfPublication() {
		return dateOfPublication;
	}

	public void setDateOfPublication(GregorianCalendar dateOfPublication) {
		this.dateOfPublication = dateOfPublication;
	}

	public GregorianCalendar getDateOfReceipt() {
		return dateOfReceipt;
	}

	public void setDateOfReceipt(GregorianCalendar dateOfReceipt) {
		this.dateOfReceipt = dateOfReceipt;
	}

	public Double getPrice() {
		return price;
	}
    public Integer getRequest(){
    	return request;
    }
	public boolean isInStock() {
		if (getStatus().equals(StatusOfBook.YES)) {
			return true;
		} else {
			return false;
		}
	}
  
	public StatusOfBook getStatus() {
		return status;
	}

	public void setStatus(StatusOfBook status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return getId() + " " + name + " " + author + " " + price + " " + dateOfPublication.get(Calendar.DATE) + "/"
				+ dateOfPublication.get(Calendar.MONTH) + "/" + dateOfPublication.get(Calendar.YEAR) + " " + status;
	}
   
}
