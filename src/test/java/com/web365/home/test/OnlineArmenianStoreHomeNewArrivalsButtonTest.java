package com.web365.home.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.onlinearmenianstore.base.test.OnlineArmenianStoreBaseTest;
import com.web365.onlinearmenianstore.home.OnlineArmenianStoreHomeNewArrivalsButton;

public class OnlineArmenianStoreHomeNewArrivalsButtonTest extends OnlineArmenianStoreBaseTest {
	

	@Test
	public void onlineArmenianStoreHomeNewArrivalsButton() throws InterruptedException {
		System.out.println("Test Case ID Home9");
		System.out.println("Verify 'New Arrivals' page is displayed when the button is clicked   ");
		OnlineArmenianStoreHomeNewArrivalsButton newArrivalsButton = new OnlineArmenianStoreHomeNewArrivalsButton(driver);
		System.out.println("Navigate to onlinearmenianstore.com");
		newArrivalsButton = newArrivalsButton.newArrivalsButton();
		System.out.println("Step 1. Click on the 'New Arrivals' button");
		
		Assert.assertTrue(newArrivalsButton.newArrivalsButton.isDisplayed());
	}

}
