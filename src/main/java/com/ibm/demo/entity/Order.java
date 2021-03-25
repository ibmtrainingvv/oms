package com.ibm.demo.entity;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class Order {
	@NotNull
	@NotBlank
	private String item;
	@NotNull
	private float price;
	private int id; // TODO GENRATED BY DB AS PK

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		if (price <= 0) {
			throw new IllegalArgumentException("Price cant be negative and zero");
		}
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
