package com.web365.home.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.onlinearmenianstore.base.test.OnlineArmenianStoreBaseTest;
import com.web365.onlinearmenianstore.home.OnlineArmenianStoreHomeContactUsButton;

public class OnlineArmenianStoreHomeContactUsButtonTest extends OnlineArmenianStoreBaseTest{
	
	@Test
	public void onlineArmenianStoreHomeContactUsButton() throws InterruptedException {
		System.out.println("Test Case ID Home17");
		System.out.println("Verify 'Contact Us' page is displayed when the button is clicked     ");
		OnlineArmenianStoreHomeContactUsButton contactUsButton = new OnlineArmenianStoreHomeContactUsButton(driver);
		System.out.println("Navigate to onlinearmenianstore.com");
		contactUsButton = contactUsButton.contactUsButton();
		System.out.println("Step 1.  Click on the 'Contact Us' button");
		
		Assert.assertTrue(contactUsButton.contactUsPage.isDisplayed());
	}

}
