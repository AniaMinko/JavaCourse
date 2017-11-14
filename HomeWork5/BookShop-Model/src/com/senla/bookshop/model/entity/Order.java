package com.senla.bookshop.model.entity;

import java.util.Date;
import workingdate.ParsingDate;

public class Order extends AEntity {
	private StatusOfOrder status;
	private Double price;
	private Date date;
	private Client client;
	private Book book;

	public Order(Integer id, Client client, Book book, Date date, StatusOfOrder status) {
		super(id);
		this.client = client;
		this.book = book;
		this.price += book.getPrice();
		this.date = date;
		this.status = status;
	}

	public Double getPrice() {
		return price;
	}

	public Date getDate() {
		return date;
	}

	public StatusOfOrder getStatus() {
		return status;
	}

	public void setStatus(StatusOfOrder status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public Book getBooks() {
		return book;
	}

	public boolean checkMadeOrder() {
		if (getStatus().equals(StatusOfOrder.MADE)) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return getId() + " " + client.getName() + " " + client.getId() + " " + book.toString() + " " + price + " "
				+ ParsingDate.format(date) + " " + status;

	}
}
