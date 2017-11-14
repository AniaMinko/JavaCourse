package com.senla.bookshop.model.entity;

public abstract class AEntity {
	private Integer id;

	public AEntity(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;

	}

	public void setId(Integer id) {
		this.id = id;
	}

	public abstract String toString();
}
