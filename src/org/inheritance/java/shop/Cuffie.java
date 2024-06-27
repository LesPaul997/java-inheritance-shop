package org.inheritance.java.shop;

public class Cuffie extends Prodotto{
	private String color;
	private boolean isWireless;
	
	public Cuffie(int code, String name, String brand, double price, double tax, String color, boolean isWireless) {
		super(code, name, brand, price, tax);
		this.color = color;
		this.isWireless = isWireless;
	}
	
	public String getColor() {
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
	
	@Override
    public String toString() {
        return "Cuffie{" +
                "codice=" + getCode() +
                ", nome='" + getName() + '\'' +
                ", marca='" + getBrand() + '\'' +
                ", prezzo=" + getPrice() +
                ", iva=" + getTax() +
                ", colore='" + color + '\'' +
                ", isWireless=" + isWireless +
                '}';
    }
} 
