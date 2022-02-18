package com.web365.home.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.onlinearmenianstore.base.test.OnlineArmenianStoreBaseTest;
import com.web365.onlinearmenianstore.home.OnlineArmenianStoreHomeAccessoriesButton;

public class OnlineArmeinianStoreHomeAccessoriesButtonTest extends OnlineArmenianStoreBaseTest{
	
	@Test
	public void onlineArmenianStoreHomeAccessoriesButton() throws InterruptedException {
		System.out.println("Test Case ID Home13");
		System.out.println("Verify 'Accessories' page is displayed when the button is clicked    ");
		OnlineArmenianStoreHomeAccessoriesButton accessoriesButton = new OnlineArmenianStoreHomeAccessoriesButton(driver);
		System.out.println("Navigate to onlinearmenianstore.com");
		accessoriesButton = accessoriesButton.accessoriesButton();
		System.out.println("Step 1. Click on the 'Accessories' button");
		
		Assert.assertTrue(accessoriesButton.accessoriesPage.isDisplayed());
	}


}
