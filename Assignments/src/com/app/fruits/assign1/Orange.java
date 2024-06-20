package com.app.fruits.assign1;

public class Orange extends Fruit {

	public Orange(String name, String colour, int weight, boolean fresh) {
		super(name, colour, weight, fresh);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String test() {
		
		return "Sour";
	}

	public void juice() {
		System.out.println(getName()+getWeight()+" extracting a juice");
	}
	
	@Override
	public String toString() {
		return "[" + super.toString() +  "]";
	}
}
