package com.collinsongroup.common;

public enum Drinks {
	
	COKE("Coke", 25), PEPSI("Pepsi", 35), SODA("Soda", 45); 
	
	private String drink; 
	private int price; 
	
	private Drinks(String name, int price) { 
		this.drink = name; this.price = price; 
	} 
	
	public String getDrink() { 
		return drink; 
	} 
	
	public int getPrice(){ 
		return price; 
	} 	

}