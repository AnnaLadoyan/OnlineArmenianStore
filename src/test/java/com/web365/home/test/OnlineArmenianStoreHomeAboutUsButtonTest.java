package com.web365.home.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.onlinearmenianstore.base.test.OnlineArmenianStoreBaseTest;
import com.web365.onlinearmenianstore.home.OnlineArmenianStoreHomeAboutUsButton;

public class OnlineArmenianStoreHomeAboutUsButtonTest extends OnlineArmenianStoreBaseTest{
	
	@Test
	public void onlineArmenianStoreHomeAboutUsButton() throws InterruptedException {
		System.out.println("Test Case ID Home16");
		System.out.println("Verify 'About Us' page is displayed when the button is clicked    ");
		OnlineArmenianStoreHomeAboutUsButton aboutUsButton = new OnlineArmenianStoreHomeAboutUsButton(driver);
		System.out.println("Navigate to onlinearmenianstore.com");
		aboutUsButton = aboutUsButton.aboutUsButton();
		System.out.println("Step 1. Click on the 'About Us' button");
		
		Assert.assertTrue(aboutUsButton.aboutUsPage.isDisplayed());
	}


}
