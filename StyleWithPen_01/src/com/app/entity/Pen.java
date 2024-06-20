package com.app.entity;

import java.time.LocalDate;

public class Pen {

	private int id;
	private Brand brand;
	private String color;
	private String inkColor;
	private String material;
	private long stock;
	private LocalDate stockUpdatedate;
	private LocalDate stockListingDate;
	private double price;
	private double discount;
	
	private static int count=1;
	
	public Pen() {
		// TODO Auto-generated constructor stub
	}

	public Pen(Brand brand, String color, String inkColor, String material, long stock,
			LocalDate stockUpdatedate, LocalDate stockListingDate, double price, double discount) {
		super();
		this.id = count++;
		this.brand = brand;
		this.color = color;
		this.inkColor = inkColor;
		this.material = material;
		this.stock = stock;
		this.stockUpdatedate = stockUpdatedate;
		this.stockListingDate = stockListingDate;
		this.price = price;
		this.discount = discount;
	}

	public int getId() {
		return id;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getInkColor() {
		return inkColor;
	}

	public void setInkColor(String inkColor) {
		this.inkColor = inkColor;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public long getStock() {
		return stock;
	}

	public void setStock(long stock) {
		this.stock = stock;
	}

	public LocalDate getStockUpdatedate() {
		return stockUpdatedate;
	}

	public void setStockUpdatedate(LocalDate stockUpdatedate) {
		this.stockUpdatedate = stockUpdatedate;
	}

	public LocalDate getStockListingDate() {
		return stockListingDate;
	}

	public void setStockListingDate(LocalDate stockListingDate) {
		this.stockListingDate = stockListingDate;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Pen.count = count;
	}

	@Override
	public String toString() {
		return "Pen [id=" + id + ", brand=" + brand + ", color=" + color + ", inkColor=" + inkColor + ", material="
				+ material + ", stock=" + stock + ", stockUpdatedate=" + stockUpdatedate + ", stockListingDate="
				+ stockListingDate + ", price=" + price + ", discount=" + discount + "]";
	}
	
	
	
}
