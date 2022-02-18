package com.web365.home.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.onlinearmenianstore.base.test.OnlineArmenianStoreBaseTest;
import com.web365.onlinearmenianstore.home.OnlineArmenianStoreHomeTeaButton;

public class OnlineArmenianStoreHomeTeaButtonTest extends OnlineArmenianStoreBaseTest {
	
	@Test
	public void onlineArmenianStoreHomeTeaButton() throws InterruptedException {
		System.out.println("Test Case ID Home14");
		System.out.println("Verify 'Tea' page is displayed when the button is clicked     ");
		OnlineArmenianStoreHomeTeaButton teaButton = new OnlineArmenianStoreHomeTeaButton(driver);
		System.out.println("Navigate to onlinearmenianstore.com");
		teaButton = teaButton.teaButton();
		System.out.println("Step 1. Click on the 'Tea' button");
		
		Assert.assertTrue(teaButton.teaPage.isDisplayed());
	}


}
