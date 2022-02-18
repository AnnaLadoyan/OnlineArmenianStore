package com.web365.home.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.onlinearmenianstore.base.test.OnlineArmenianStoreBaseTest;
import com.web365.onlinearmenianstore.home.OnlineArmenianStoreHomeRefundPolicyButton;

public class OnlineArmenianStoreHomeRefundPolicyButtonTest extends OnlineArmenianStoreBaseTest{
	
	@Test
	public void onlineArmenianStoreHomeRefundPolicyButton() throws InterruptedException {
		System.out.println("Test Case ID Home21");
		System.out.println("Verify 'Refund Policy' page is displayed when the button is clicked");
		OnlineArmenianStoreHomeRefundPolicyButton refundPolicyButton = new OnlineArmenianStoreHomeRefundPolicyButton(driver);
		System.out.println("Navigate to onlinearmenianstore.com");
		refundPolicyButton = refundPolicyButton.refundPolicyButton();
		System.out.println("Step 1.  Click on the 'Refund Policy' button");
		
		Assert.assertTrue(refundPolicyButton.refundPolicyPage.isDisplayed());
	}


}
