package org.inheritance.java.shop;

public class Televisore extends Prodotto{
	private int dimensions;
	private boolean isSmart;
	
	public Televisore(int code, String name, String brand, double price, double tax, int dimensions, boolean isSmart) {
		super(code, name, brand, price, tax);
		this.dimensions = dimensions;
		this.isSmart = isSmart;
	}
	
	public int getDimensions() {
		return dimensions;
	}
	
	public void setDimensions(int dimensions) {
		this.dimensions = dimensions;
	}
	
	public boolean isSmart() {
		return isSmart;
	}
	
	public void setSmart(boolean isSmart) {
		this.isSmart = isSmart;
	}
	
	 @Override
	    public String toString() {
	        return "Televisore{" +
	                "codice=" + getCode() +
	                ", nome='" + getName() + '\'' +
	                ", marca='" + getBrand() + '\'' +
	                ", prezzo=" + getPrice() +
	                ", iva=" + getTax() +
	                ", dimensioni=" + dimensions +
	                ", isSmart=" + isSmart +
	                '}';
	    }
}
