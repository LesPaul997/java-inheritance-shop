package org.inheritance.java.shop;

public class Cuffie extends Prodotto{
	private String color;
	private boolean isWireless;
	
	public Cuffie(int code, String name, String brand, double price, double tax, String color, boolean isWireless) {
		super(code, name, brand, price, tax);
		this.color = color;
		this.isWireless = isWireless;
	}
	
	public String getCOlor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public boolean isWireless() {
		return isWireless;
	}
	
	public void setWireless(boolean isWireless) {
		this.isWireless = isWireless;
	}
} 
