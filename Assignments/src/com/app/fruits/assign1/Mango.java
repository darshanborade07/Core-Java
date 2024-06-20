package com.app.fruits.assign1;

public class Mango extends Fruit {

	public Mango(String name, String colour, int weight, boolean fresh) {
		super(name, colour, weight, fresh);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String test() {
		
		return "Sweet";
	}
	
	public void pulp() {
		System.out.println(getName()+getColour()+" creating a pulp !");
	}
	
	@Override
	public String toString() {
		return "[" + super.toString() +  "]";
	}

}
