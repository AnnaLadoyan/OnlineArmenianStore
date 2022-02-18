package com.web365.home.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.onlinearmenianstore.base.test.OnlineArmenianStoreBaseTest;
import com.web365.onlinearmenianstore.home.OnlineArmenianStoreHomeTermsOfServiceButton;

public class OnlineArmenianStoreHomeTermsOfServiceButtonTest extends OnlineArmenianStoreBaseTest{
	
	@Test
	public void onlineArmenianStoreHomeTermsOfServiceButton() throws InterruptedException {
		System.out.println("Test Case ID Home19");
		System.out.println("Verify 'Terms of Service' page is displayed when the button is clicked     ");
		OnlineArmenianStoreHomeTermsOfServiceButton termsOfServiceButton = new OnlineArmenianStoreHomeTermsOfServiceButton(driver);
		System.out.println("Navigate to onlinearmenianstore.com");
		termsOfServiceButton = termsOfServiceButton.termsOfServiceButton();
		System.out.println("Step 1. Click on the 'Terms of Service' button");
		
		Assert.assertTrue(termsOfServiceButton.termsOfServicePage.isDisplayed());
	}

}
