package com.app.entity;

public class Order {

	private int orderId;
	private Pet pet;
	private int quantity;
	private Status status;
	private static int auto_id = 1;
	
	public Order(Pet petId, int quantity) {
		super();
		this.orderId = auto_id++;
		this.pet = petId;
		this.quantity = quantity;
		this.status = Status.PLACED;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public Pet getPet() {
		return pet;
	}

	public void setPet(Pet petId) {
		this.pet = petId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", pet=" + pet + ", quantity=" + quantity + ", status=" + status + "]";
	}
	
}
