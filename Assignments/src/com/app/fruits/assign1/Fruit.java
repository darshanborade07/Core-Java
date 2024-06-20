package com.app.fruits.assign1;

public abstract class Fruit {
	private String name;
	private String colour;
	private int weight;
	private boolean fresh;
	
	public Fruit(String name, String colour, int weight, boolean fresh) {
		super();
		this.setName(name);
		this.colour = colour;
		this.weight = weight;
		this.fresh = fresh;
	}

	@Override
	public String toString() {
		return "Fruit [name=" + getName() + ", colour=" + colour + ", weight=" + weight + "]";
	}
	
	public abstract String test();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public boolean isFresh() {
		return fresh;
	}

	public void setFresh(boolean fresh) {
		this.fresh = fresh;
	}
	
}
