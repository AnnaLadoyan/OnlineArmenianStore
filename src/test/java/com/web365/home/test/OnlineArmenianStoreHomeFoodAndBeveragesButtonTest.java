package com.web365.home.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.onlinearmenianstore.base.test.OnlineArmenianStoreBaseTest;
import com.web365.onlinearmenianstore.home.OnlineArmenianStoreHomeFoodAndBeveragesButton;

public class OnlineArmenianStoreHomeFoodAndBeveragesButtonTest extends OnlineArmenianStoreBaseTest {
	
	@Test
	public void onlineArmenianStoreHomeFoodAndBeveragesButton() throws InterruptedException {
		System.out.println("Test Case ID Home4");
		System.out.println("Verify 'Food and Beverages' page is displayed when the button is clicked   ");
		OnlineArmenianStoreHomeFoodAndBeveragesButton foodAndBeveragesButton = new OnlineArmenianStoreHomeFoodAndBeveragesButton(driver);
		System.out.println("Navigate to onlinearmenianstore.com");
		foodAndBeveragesButton = foodAndBeveragesButton.foodAndBeveragesButton();
		System.out.println("Step 1. Click on the 'Food and Beverages' buttonn");
		
		Assert.assertTrue(foodAndBeveragesButton.foodAndBeveragesPage.isDisplayed());
	}

}
