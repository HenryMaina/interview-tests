package com.collinsongroup.page_object;

public class Coins {
	
	public static String insertCoins(){
	    return "Please enter the amount in coins (1, 5, 10, 25)";
	}

	public static String buy(String drink, int money){
		if (drink.equalsIgnoreCase("Coke") && money >= Price.getPrice(1)) {
			money = money - Price.getPrice(1);
			return "Thank you for buying your Coke. " + Change.giveChange(money);
		}else if (drink.equalsIgnoreCase("Pepsi") && money >= Price.getPrice(2)) {
			money = money - Price.getPrice(2);
			return "Thank you for buying Pepsi. " + Change.giveChange(money);
		} else if (drink.equalsIgnoreCase("Soda") && money >= Price.getPrice(3)) {
			money = money - Price.getPrice(3);
			return "Thank you for buying Soda. " + Change.giveChange(money);
		} else {
			return "Please insert sufficient funds.";
		}
	}

}