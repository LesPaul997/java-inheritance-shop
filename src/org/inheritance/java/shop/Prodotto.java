package org.inheritance.java.shop;

public class Prodotto {

	private int code;
	private String name;
	private String brand;
	private double price;
	private double tax;
	
	//Costruttore
	public Prodotto(int code, String name, String brand, double price, double tax) {
		this.code = code;
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.tax = tax;
		
	}
	
	//Getter Codice
	public int getCode() {
		return code;
	}
	
	//Getter e Setter per il Nome
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	//Getter e Setter per il Brand
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	//Getter e Setter per il Prezzo
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	//Getter e Setter per il prezzo comprensivo di IVA
	public double getTax() {
		return tax;
	}
	
	public void setTax(double tax) {
		this.tax = tax;
	}
	
	//Metodo per ottenere il prezzo base
	public double getBasePrice() {
		return price;
	}
	
	//Metodo per ottenere il prezzo comprensivo di IVA
	public double getPriceWithTax() {
		return price + (price * tax / 100);
	}
	
	//Nome esteso
	public String getExtendedName() {
		return code + "-" + name;
	}
	
}
