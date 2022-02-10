package com.web365.login.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.onlinearmenianstore.base.test.OnlineArmenianStoreBaseTest;
import com.web365.onlinearmenianstore.page.login.OnlineArmenianStoreLogInMissingChar;

public class OnlineArmenianStorelogInMissingCharTest extends OnlineArmenianStoreBaseTest {
	
	@Test
	public void onlineArmenianStorelogInMissingChar() throws InterruptedException {
		System.out.println("Test Case ID Search19");
		System.out.println("Verify user is not allowed to sign in without an @ in the email field");
		OnlineArmenianStoreLogInMissingChar logInMissingChar = new OnlineArmenianStoreLogInMissingChar(driver);
		System.out.println("Navigate to onlinearmenianstore.com");
		logInMissingChar = logInMissingChar.myAccount();
		System.out.println("Step 1.  Click on the 'My Account' button");
		logInMissingChar = logInMissingChar.emailFieldClick();
		System.out.println("Step 2.  Click on the email field");
		logInMissingChar = logInMissingChar.emailField();
		System.out.println("Step 3.  Enter 'annaladoyan' in the email field");
		logInMissingChar = logInMissingChar.logInButton();
		System.out.println("Step 4.  Click on the 'Login' button");
		
		Assert.assertTrue(logInMissingChar.missingChar.isDisplayed());
	}


}
