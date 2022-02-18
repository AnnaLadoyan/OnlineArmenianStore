package com.web365.home.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.onlinearmenianstore.base.test.OnlineArmenianStoreBaseTest;
import com.web365.onlinearmenianstore.home.OnlineArmenianStoreHomeJewelryButton;


public class OnlineArmenianStoreHomeJewelryButtonTest extends OnlineArmenianStoreBaseTest {
	
	@Test
	public void onlineArmenianStoreHomeJewelryButton() throws InterruptedException {
		System.out.println("Test Case ID Home11");
		System.out.println("Verify 'Jewelry' page is displayed when the button is clicked    ");
		OnlineArmenianStoreHomeJewelryButton jewelryButton = new OnlineArmenianStoreHomeJewelryButton(driver);
		System.out.println("Navigate to onlinearmenianstore.com");
		jewelryButton = jewelryButton.jewelryButton();
		System.out.println("Step 1. Click on the 'Jewelry' button");
		
		Assert.assertTrue(jewelryButton.jewelryPage.isDisplayed());
	}


}
