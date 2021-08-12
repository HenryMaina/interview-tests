package com.collinsongroup.page_object;

public class Change {
	
	public static String giveChange(int change){
	    int quarters = 0;
	    int dimes = 0;
	    int nickels = 0;
	    int pennies = 0;
	    while (change >= 25){
	        quarters = quarters + 1;
	        change = change - 25;
	    }
	    while (change >= 10){
	        dimes = dimes + 1;
	        change = change - 10;
	    }
	    while (change >= 5){
	        nickels = nickels + 1;
	        change = change - 5;
	    }
	    while (change >= 1){
	    	pennies = pennies + 1;
	        change = change - 1;
	    }
	    return "Here's your change " + quarters + " quarters, " + dimes + " dimes, " + nickels + " nickels, " + pennies + " pennies.";
	}

}