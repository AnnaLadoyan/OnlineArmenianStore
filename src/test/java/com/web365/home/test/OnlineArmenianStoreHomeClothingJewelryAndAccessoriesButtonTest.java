package com.web365.home.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.onlinearmenianstore.base.test.OnlineArmenianStoreBaseTest;
import com.web365.onlinearmenianstore.home.OnlineArmenianStoreHomeClothingJewelryAndAccessoriesButton;

public class OnlineArmenianStoreHomeClothingJewelryAndAccessoriesButtonTest extends OnlineArmenianStoreBaseTest {
	
	@Test
	public void onlineArmenianStoreHomeClothingJewelryAndAccessoriesButton() throws InterruptedException {
		System.out.println("Test Case ID Home5");
		System.out.println("Verify 'Clothing, Jewelry, and Accessories' page is displayed when the button is clicked  ");
		OnlineArmenianStoreHomeClothingJewelryAndAccessoriesButton clothingJewelryAndAccessoriesButton = new OnlineArmenianStoreHomeClothingJewelryAndAccessoriesButton(driver);
		System.out.println("Navigate to onlinearmenianstore.com");
		clothingJewelryAndAccessoriesButton = clothingJewelryAndAccessoriesButton.clothingJewelryAndAccessoriesbutton();
		System.out.println("Step 1. Click on the 'Clothing, Jewelry, and Accessories' button");
		
		Assert.assertTrue(clothingJewelryAndAccessoriesButton.clothingJewelryAndAccessoriesPage.isDisplayed());
	}


}
