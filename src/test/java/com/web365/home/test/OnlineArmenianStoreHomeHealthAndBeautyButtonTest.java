package com.web365.home.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.onlinearmenianstore.base.test.OnlineArmenianStoreBaseTest;
import com.web365.onlinearmenianstore.home.OnlineArmenianStoreHomeHealthAndBeautyButton;

public class OnlineArmenianStoreHomeHealthAndBeautyButtonTest extends OnlineArmenianStoreBaseTest{
	
	@Test
	public void onlineArmenianStoreHomeHealthAndBeautyButton() throws InterruptedException {
		System.out.println("Test Case ID Home7");
		System.out.println("Verify 'Health and Beauty' page is displayed when the button is clicked   ");
		OnlineArmenianStoreHomeHealthAndBeautyButton healthAndBeautyButton = new OnlineArmenianStoreHomeHealthAndBeautyButton(driver);
		System.out.println("Navigate to onlinearmenianstore.com");
		healthAndBeautyButton = healthAndBeautyButton.healthAndBeautyButton();
		System.out.println("Step 1. Click on the 'Health and Beauty' button");
		
		Assert.assertTrue(healthAndBeautyButton.healthAndBeautyPage.isDisplayed());
	}


}
