package com.web365.home.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.onlinearmenianstore.base.test.OnlineArmenianStoreBaseTest;
import com.web365.onlinearmenianstore.home.OnlineArmenianStoreHomePrivacyAndPolicyButton;

public class OnlineArmenianStoreHomePrivacyAndPolicyButtonTest extends OnlineArmenianStoreBaseTest {

	@Test
	public void onlineArmenianStoreHomePrivacyAndPolicyButton() throws InterruptedException {
		System.out.println("Test Case ID Home18");
		System.out.println("Verify 'Privacy Policy' page is displayed when the button is clicked     ");
		OnlineArmenianStoreHomePrivacyAndPolicyButton privacyAndPolicyButton = new OnlineArmenianStoreHomePrivacyAndPolicyButton(driver);
		System.out.println("Navigate to onlinearmenianstore.com");
		privacyAndPolicyButton = privacyAndPolicyButton.privacyAndPolicyButton();
		System.out.println("Step 1. Click on the 'Privacy Policy' button");
		
		Assert.assertTrue(privacyAndPolicyButton.privacyAndPolicyPage.isDisplayed());
	}

}
