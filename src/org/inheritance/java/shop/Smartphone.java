package org.inheritance.java.shop;

public class Smartphone extends Prodotto {
	private String imei;
	private int memory;
	
	public Smartphone(int code, String name, String brand, double price, double tax, String imei, int memory) {
		super(code, name, brand, price, tax);
		this.imei = imei;
		this.memory = memory;
	}
	
	public String getImei() {
		return imei;
	}
	
	public void setImei(String imei) {
		this.imei = imei;
	}
	
	public int getMemory() {
		return memory;
	}
	
	public void setMemory(int memory) {
		this.memory = memory;
	}
}
