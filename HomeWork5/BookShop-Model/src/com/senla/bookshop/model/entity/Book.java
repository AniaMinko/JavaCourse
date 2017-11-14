package com.senla.bookshop.model.entity;

import java.util.Date;
import workingdate.ParsingDate;

public class Book extends AEntity {

	private String name;
	private String author;
	private Date dateOfPublication;
	private Double price;
	private StatusOfBook status;
	private Date dateOfReceipt;

	public Book(Integer id, String name, String author, Date dateOfPublication, Double price, StatusOfBook status,
			Date dateOfReceipt) {
		super(id);
		this.name = name;
		this.author = author;
		this.dateOfPublication = dateOfPublication;
		this.price = price;
		this.status = status;
		this.dateOfReceipt = dateOfPublication;
	}

	/*public Book() {

	} */

	public String getName() {
		return name;
	}

	public String getAuthor() {
		return author;
	}

	public Date getDateOfPublication() {
		return dateOfPublication;
	}

	public Double getPrice() {
		return price;
	}

	public StatusOfBook getStatus() {
		return status;
	}

	public void setStatus(StatusOfBook status) {
		this.status = status;
	}

	public Date getDateOfReceipt() {
		return dateOfReceipt;
	}

	public boolean isInStock() {
		if (getStatus().equals(StatusOfBook.YES)) {
			return true;
		} else {
			return false;
		}
	}
	/*public Book getOldBook(){
		
	}*/

	@Override
	public String toString() {
		return getId() + " " + name + " " + author + " " + ParsingDate.format(dateOfPublication) + " " + price + " "
				+ status + " " + ParsingDate.format(dateOfReceipt);
	}

}
