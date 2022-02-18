package com.web365.home.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.onlinearmenianstore.base.test.OnlineArmenianStoreBaseTest;
import com.web365.onlinearmenianstore.home.OnlineArmenianStoreHomePage;

public class OnlineArmenianStoreHomePageButtonTest extends OnlineArmenianStoreBaseTest {

	@Test
	public void onlineArmenianStoreHomePage() throws InterruptedException {
		System.out.println("Test Case ID Home1");
		System.out.println("Verify user is able to go back to Home page after clicking the logo");
		OnlineArmenianStoreHomePage homePage = new OnlineArmenianStoreHomePage(driver);
		System.out.println("Navigate to onlinearmenianstore.com");
		homePage = homePage.oasLogo();
		System.out.println("Step 1. Click the 'About Us' button");
		homePage = homePage.oasLogo();
		System.out.println("Step 2.  Click the OnlineArmenianStore logo in the top left corner of the website");

		Assert.assertTrue(homePage.homePage.isDisplayed());
	}

}
