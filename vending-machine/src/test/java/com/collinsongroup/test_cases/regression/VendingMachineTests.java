package com.collinsongroup.test_cases.regression;


import static com.smarttested.qa.smartassert.SmartAssert.assertSoft;
import static com.smarttested.qa.smartassert.SmartAssert.validateSoftAsserts;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import org.testng.annotations.Test;

import com.collinsongroup.TestId;
import com.collinsongroup.core.VendingMachine;

public class VendingMachineTests {

	/**
	 * <h2>Overview</h2> This test allows customer to select products 1 = Coke(25), 2 = Pepsi(35), 
	 * 3 = Soda(45) and 4 = Invalid section.
	 * <h2>Page</h2> 
	 * <h2>Steps To Reproduce:</h2>
	 * <ol>
	 * <li>Navigate to Page</li>
	 * <li>Select 1, 2, 3 or 4</li>
	 * <li>Appropriate Message displayed</li>
	 * </ol>
	 * <h2>Notes</h2> This test will be verified during Sanity testing
	 */
	@TestId("Jira Project ticket id e.g. VM-01")
	@Test(priority = 01, groups = "SanityTesting")
	public void test_Products_Selection() {
		VendingMachine vendingMachine = new VendingMachine();
		
		assertSoft(vendingMachine.getSelection(1), is(equalTo("You have selected Coke and the price is 25")), "");
		assertSoft(vendingMachine.getSelection(2), is(equalTo("You have selected Pepsi and the price is 35")), "");
		assertSoft(vendingMachine.getSelection(3), is(equalTo("You have selected Soda and the price is 45")), "");
		assertSoft(vendingMachine.getSelection(4), is(equalTo("Invalid selection. Product selection should be 1, 2 or 3. Please try again")), "");
		validateSoftAsserts();
	}

	/**
	 * <h2>Overview</h2> This test verifies insert coins message.
	 * <h2>Page</h2> 
	 * <h2>Steps To Reproduce:</h2>
	 * <ol>
	 * <li>Navigate to Page</li>
	 * <li>Click enter</li>
	 * <li>Insert coins message displayed</li>
	 * </ol>
	 * <h2>Notes</h2> This test will be verified during Regression testing
	 */
	@TestId("Jira Project ticket id e.g. VM-02")
	@Test(priority = 02, groups = "RegressionTesting")
	public void test_Insert_Coins() {
		VendingMachine vendingMachine = new VendingMachine();
		
		assertThat(vendingMachine.enterCoins(), is(equalTo("Please enter the amount in coins (1, 5, 10, 25)")));
	}

	/**
	 * <h2>Overview</h2> This test verifies change given.
	 * <h2>Page</h2> 
	 * <h2>Steps To Reproduce:</h2>
	 * <ol>
	 * <li>Navigate to Page</li>
	 * <li>Enter amount</li>
	 * <li>Appropriate change given</li>
	 * </ol>
	 * <h2>Notes</h2> This test will be verified during Regression testing
	 */
	@TestId("Jira Project ticket id e.g. VM-03")
	@Test(priority = 03, groups = "RegressionTesting")
	public void test_Change() {
		VendingMachine vendingMachine = new VendingMachine();
		
		assertSoft(vendingMachine.getChange(25), is(equalTo("Here's your change 1 quarters, 0 dimes, 0 nickels, 0 pennies.")), "");
		assertSoft(vendingMachine.getChange(40), is(equalTo("Here's your change 1 quarters, 1 dimes, 1 nickels, 0 pennies.")), "");
		assertSoft(vendingMachine.getChange(55), is(equalTo("Here's your change 2 quarters, 0 dimes, 1 nickels, 0 pennies.")), "");
		validateSoftAsserts();
	}

	/**
	 * <h2>Overview</h2> This test verifies selecting a drink and entering amount, returning change & insufficient funds message.
	 * <h2>Page</h2> 
	 * <h2>Steps To Reproduce:</h2>
	 * <ol>
	 * <li>Navigate to Page</li>
	 * <li>Select drink & enter amount</li>
	 * <li>Insufficient funds message displayed</li>
	 * <li>Drink purchased and change given</li>
	 * </ol>
	 * <h2>Notes</h2> This test will be verified during Regression testing
	 */
	@TestId("Jira Project ticket id e.g. VM-04")
	@Test(priority = 04, groups = "RegressionTesting")
	public void test_Insufficient_Funds_Buy_Return_Change() {
		VendingMachine vendingMachine = new VendingMachine();
		
		assertSoft(vendingMachine.purchase("Coke", 22), is(equalTo("Please insert sufficient funds.")), "");
		assertSoft(vendingMachine.purchase("Coke", 30), is(equalTo("Thank you for buying your Coke. Here's your change 0 quarters, 0 dimes, 1 nickels, 0 pennies.")), "");
		assertSoft(vendingMachine.purchase("Pepsi", 45), is(equalTo("Thank you for buying Pepsi. Here's your change 0 quarters, 1 dimes, 0 nickels, 0 pennies.")), "");
		assertSoft(vendingMachine.purchase("Soda", 60), is(equalTo("Thank you for buying Soda. Here's your change 0 quarters, 1 dimes, 1 nickels, 0 pennies.")), "");
		validateSoftAsserts();
	}

}