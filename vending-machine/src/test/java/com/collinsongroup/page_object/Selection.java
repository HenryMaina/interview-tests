package com.collinsongroup.page_object;

import com.collinsongroup.common.Drinks;

public class Selection {
	
	// select drink
	public static String choose(int drink) {
		if (drink == 1) {
			return "You have selected " + Drinks.COKE.getDrink() + " and the price is " + Drinks.COKE.getPrice();	
		}else if (drink == 2) {
			return "You have selected " + Drinks.PEPSI.getDrink() + " and the price is " + Drinks.PEPSI.getPrice();	
		}else if (drink == 3) {
			return "You have selected " + Drinks.SODA.getDrink() + " and the price is " + Drinks.SODA.getPrice();	
		}else {
			return "Invalid selection. Product selection should be 1, 2 or 3. Please try again";
		}
	}

}