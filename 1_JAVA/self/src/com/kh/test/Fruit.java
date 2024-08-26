package com.kh.test;

public class Fruit {
	private String name;
	private String color;

	public Fruit(String name, String color) {
		this.name = name;
		this.color = color;
	}

	
	@Override
	public String toString() {
		return name + " (" + color + ")";
	}
}