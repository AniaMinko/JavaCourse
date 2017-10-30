package entity;

import java.util.Date;

public class Order extends Entity {

	private StatusOfOrder status;
	private double price;
	private Date date;
	private Client client;
	private Book[] books = new Book[1000];

	public Order(double price, int id, Client client, StatusOfOrder status) {
		super(id);
		this.price = price;
		this.client = client;
		this.status = status;
	}
	/*
	 * public Order(double price, int numberOfOrder, Client client, int id) {
	 * super(id); this.price = price; this.numberOfOrder = numberOfOrder;
	 * this.client = client; }
	 */

	public double getPrice() {
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

	public Book[] getBooks() {
		return books;
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
		return status + " " + client.getName() + " " + client.getEmail() + " " + date + " " + " " + price;
	}
}
