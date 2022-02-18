package com.web365.home.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.onlinearmenianstore.base.test.OnlineArmenianStoreBaseTest;
import com.web365.onlinearmenianstore.home.OnlineArmenianStoreHomeShippingPolicyButton;

public class OnlineArmenianStoreShippingPolicyButtonTest extends OnlineArmenianStoreBaseTest {
	
	@Test
	public void onlineArmenianStoreShippingPolicyButton() throws InterruptedException {
		System.out.println("Test Case ID Home20");
		System.out.println("Verify 'Shipping Policy' page is displayed when the button is clicked     ");
		OnlineArmenianStoreHomeShippingPolicyButton shippingPolicyButton = new OnlineArmenianStoreHomeShippingPolicyButton(driver);
		System.out.println("Navigate to onlinearmenianstore.com");
		shippingPolicyButton = shippingPolicyButton.shippingPolicyButton();
		System.out.println("Step 1. Click on the 'Shipping Policy' button");
		
		Assert.assertTrue(shippingPolicyButton.shippingPolicyPage.isDisplayed());
	}


}
