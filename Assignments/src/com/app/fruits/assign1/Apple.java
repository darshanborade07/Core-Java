package com.app.fruits.assign1;

public class Apple extends Fruit {

	public Apple(String name, String colour, int weight, boolean fresh) {
		super(name, colour, weight, fresh);
	}

	@Override
	public String test() {
		
		return "Sweet"+"Sour";
	}
	
	public void jam() {
		System.out.println(getName()+getColour()+" making jam");
	}

	@Override
	public String toString() {
		return "[" + super.toString() +  "]";
	}
	
	
}
