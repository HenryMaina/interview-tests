package com.collinsongroup.page_object;

public class Price {
	
	public static int getPrice(int menuOption){
	    if (menuOption == 1)
	        return 25;
	    if (menuOption == 2)
	        return 35;
	    if (menuOption == 3)
	        return 45;
	    else return 0;
	}
}