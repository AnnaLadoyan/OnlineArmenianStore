package com.web365.home.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.onlinearmenianstore.base.test.OnlineArmenianStoreBaseTest;
import com.web365.onlinearmenianstore.home.OnlineArmenianStoreHomeProductsButton;

public class OnlineArmenianStoreHomeProductsButtonTest extends OnlineArmenianStoreBaseTest {
	

	@Test
	public void onlineArmenianStoreHomeProductsButton() throws InterruptedException {
		System.out.println("Test Case ID Home8");
		System.out.println("Verify 'Home Products' page is displayed when the button is clicked   ");
		OnlineArmenianStoreHomeProductsButton homeProductsButton = new OnlineArmenianStoreHomeProductsButton(driver);
		System.out.println("Navigate to onlinearmenianstore.com");
		homeProductsButton = homeProductsButton.homeProductsButton();
		System.out.println("Step 1. Click on the 'Home Products' button");
		
		Assert.assertTrue(homeProductsButton.homeProductsPage.isDisplayed());
	}


}
