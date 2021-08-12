package com.collinsongroup.core;

import com.collinsongroup.page_object.Change;
import com.collinsongroup.page_object.Coins;
import com.collinsongroup.page_object.Selection;

public class VendingMachine {

	public VendingMachine() {
	}
	
	public String getSelection(int choice) {
		return Selection.choose(choice);
	}

	public String enterCoins() {
		return Coins.insertCoins();
	}

	public String getChange(int money) {
		return Change.giveChange(money);
	}

	public String purchase(String drink, int money) {
		return Coins.buy(drink, money);
	}

}