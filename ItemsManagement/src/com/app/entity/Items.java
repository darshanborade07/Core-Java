package com.app.entity;

import java.io.Serializable;
import java.time.LocalDate;

public class Items implements Comparable<Items>, Serializable{

	private String itemCode;
	private String description;
	private double price;
	private LocalDate shipmentDate;
	
	public Items(String itemCode, String description, double price, LocalDate shipmentDate) {
		super();
		this.itemCode = itemCode;
		this.description = description;
		this.price = price;
		this.shipmentDate = shipmentDate;
	}
	
	public String getItemCode() {
		return itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public LocalDate getShipmentDate() {
		return shipmentDate;
	}
	public void setShipmentDate(LocalDate shipmentDate) {
		this.shipmentDate = shipmentDate;
	}
	
	@Override
	public String toString() {
		return "Items [itemCode=" + itemCode + ", description=" + description + ", price=" + price + ", shipmentDate="
				+ shipmentDate + "]";
	}
	
	@Override
	public boolean equals(Object o) {
		if(o instanceof Items) {
			return this.itemCode.equals(((Items)o).itemCode);
		}
			
		return false;
	}

	@Override
	public int compareTo(Items o) {
		
		return this.itemCode.compareTo(((Items)o).itemCode);
	}
	
	
}
