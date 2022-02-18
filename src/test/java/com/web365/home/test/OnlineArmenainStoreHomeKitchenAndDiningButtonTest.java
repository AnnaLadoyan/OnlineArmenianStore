package com.web365.home.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.onlinearmenianstore.base.test.OnlineArmenianStoreBaseTest;
import com.web365.onlinearmenianstore.home.OnlineArmenianStoreHomeKitchenAndDiningButton;

public class OnlineArmenainStoreHomeKitchenAndDiningButtonTest extends OnlineArmenianStoreBaseTest {
	
	@Test
	public void onlineArmenainStoreHomeKitchenAndDiningButton() throws InterruptedException {
		System.out.println("Test Case ID Home12");
		System.out.println("Verify 'Kitchen and Dining' page is displayed when the button is clicked    ");
		OnlineArmenianStoreHomeKitchenAndDiningButton kitchenAndDiningButton = new OnlineArmenianStoreHomeKitchenAndDiningButton(driver);
		System.out.println("Navigate to onlinearmenianstore.com");
		kitchenAndDiningButton = kitchenAndDiningButton.kitchenAndDiningButton();
		System.out.println("Step 1. Click on the 'Kitchen and Dining' button");
		
		Assert.assertTrue(kitchenAndDiningButton.kitchenAndDiningPage.isDisplayed());
	}


}
