package com.web365.login.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.onlinearmenianstore.base.test.OnlineArmenianStoreBaseTest;
import com.web365.onlinearmenianstore.page.login.OnlineArmenianStoreLogInMissingCredentials;

public class OnlineArmenianStoreLogInMissingCredentialsTest extends OnlineArmenianStoreBaseTest {
	
	@Test
	public void onlineArmenianStoreLogInMissingCredentials() throws InterruptedException {
		System.out.println("Test Case ID LogIn2");
		System.out.println("Verify user is not allowed to login without filling in the email and password fields");
		OnlineArmenianStoreLogInMissingCredentials logIn = new OnlineArmenianStoreLogInMissingCredentials(driver);
		System.out.println("Navigate to onlinearmenianstore.com");
		logIn = logIn.myAccount();
		System.out.println("Step 1. Click on the 'My Account' button");
		logIn = logIn.logInButton();
		System.out.println("Step 2. Click on the 'Login' button");
		
		Assert.assertTrue(logIn.missingCredentials.isDisplayed());
	}

}
