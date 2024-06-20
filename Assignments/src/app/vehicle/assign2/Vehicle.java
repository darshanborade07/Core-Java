package app.vehicle.assign2;

import java.time.LocalDate;

public class Vehicle {

	private int chasisNo;
	private Colour colour;
	private double price;
	private LocalDate manufactureDate;
	private LocalDate insuranceDate;
	private double pollutionLvl;
	public Vehicle(int chasisNo, Colour colour, double price, LocalDate manufactureDate, LocalDate insuranceDate,
			double pollutionLvl) {
	
		this.chasisNo = chasisNo;
		this.colour = colour;
		this.price = price;
		this.manufactureDate = manufactureDate;
		this.insuranceDate = insuranceDate;
		this.pollutionLvl = pollutionLvl;
	}
	public int getChasisNo() {
		return chasisNo;
	}
	public void setChasisNo(int chasisNo) {
		this.chasisNo = chasisNo;
	}
	public Colour getColour() {
		return colour;
	}
	public void setColour(Colour colour) {
		this.colour = colour;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public LocalDate getManufactureDate() {
		return manufactureDate;
	}
	public void setManufactureDate(LocalDate manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	public LocalDate getInsuranceDate() {
		return insuranceDate;
	}
	public void setInsuranceDate(LocalDate insuranceDate) {
		this.insuranceDate = insuranceDate;
	}
	public double getPollutionLvl() {
		return pollutionLvl;
	}
	public void setPollutionLvl(double pollutionLvl) {
		this.pollutionLvl = pollutionLvl;
	}
	
	@Override
	public String toString() {
		return "Vehicle [chasisNo=" + chasisNo + ", colour=" + colour + ", price=" + price + ", manufactureDate="
				+ manufactureDate + ", insuranceDate=" + insuranceDate + ", pollutionLvl=" + pollutionLvl + "]";
	}
		
	
}
