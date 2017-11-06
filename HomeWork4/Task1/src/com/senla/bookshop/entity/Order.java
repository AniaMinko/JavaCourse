package com.senla.bookshop.entity;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Order extends Entity {

	private StatusOfOrder status;
	private double price;
	private GregorianCalendar date;
	private Client client;
	private Book book;

	public Order(Integer id, Client client, Book book, GregorianCalendar date, StatusOfOrder status) {
		super(id);
		this.client = client;
		this.book = book;
		this.price = 0;
		this.price += book.getPrice();
		this.date = date;
		this.status = status;
	}

	public double getPrice() {
		return price;
	}

	public GregorianCalendar getDate() {
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
		return getId() + " " + client.getName() + " " + client.getId() + " " + book.toString() + " " + status + " "
				+ date.get(Calendar.DATE) + " " + date.get(Calendar.MONTH) + " " + date.get(Calendar.YEAR) + " "
				+ price;
	}
}
