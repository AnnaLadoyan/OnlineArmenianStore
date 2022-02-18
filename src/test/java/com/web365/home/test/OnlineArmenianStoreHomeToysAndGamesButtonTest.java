package com.web365.home.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.onlinearmenianstore.base.test.OnlineArmenianStoreBaseTest;
import com.web365.onlinearmenianstore.home.OnlineArmenianStoreHomeToysAndGamesButton;

public class OnlineArmenianStoreHomeToysAndGamesButtonTest extends OnlineArmenianStoreBaseTest {
	

	@Test
	public void onlineArmenianStoreHomeToysAndGamesButton() throws InterruptedException {
		System.out.println("Test Case ID Home6");
		System.out.println("Verify 'Toys and Games' page is displayed when the button is clicked  ");
		OnlineArmenianStoreHomeToysAndGamesButton toysAndGamesButton = new OnlineArmenianStoreHomeToysAndGamesButton(driver);
		System.out.println("Navigate to onlinearmenianstore.com");
		toysAndGamesButton = toysAndGamesButton.toysAnadGamesButton();
		System.out.println("Step 1. Click on the 'Toys and Games' buttonss");
		
		Assert.assertTrue(toysAndGamesButton.toysAnadGamesPage.isDisplayed());
	}


}
