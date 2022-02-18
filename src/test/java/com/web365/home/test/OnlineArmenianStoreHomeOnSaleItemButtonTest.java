package com.web365.home.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.onlinearmenianstore.base.test.OnlineArmenianStoreBaseTest;
import com.web365.onlinearmenianstore.home.OnlineArmenianStoreHomeOnSaleItemsButton;


public class OnlineArmenianStoreHomeOnSaleItemButtonTest extends OnlineArmenianStoreBaseTest{
	
	@Test
	public void onlineArmenianStoreHomeOnSaleItemButton() throws InterruptedException {
		System.out.println("Test Case ID Home10");
		System.out.println("Verify 'On Sale Items' page is displayed when the button is clicked    ");
		OnlineArmenianStoreHomeOnSaleItemsButton onSaleItemButton = new OnlineArmenianStoreHomeOnSaleItemsButton(driver);
		System.out.println("Navigate to onlinearmenianstore.com");
		onSaleItemButton = onSaleItemButton.onSaleItemButton();
		System.out.println("Step 1.  Click on the 'On Sale Items' button");
		
		Assert.assertTrue(onSaleItemButton.onSaleItemPage.isDisplayed());
	}

}
