package com.web365.login.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.onlinearmenianstore.base.test.OnlineArmenianStoreBaseTest;
import com.web365.onlinearmenianstore.page.login.OnlineArmenianStoreLogInValidEmail;

public class OnlineArmenianStoreLogInValidEmailTest extends OnlineArmenianStoreBaseTest {
	
	@Test
	public void onlineArmenianStoreLogInValidEmail() throws InterruptedException {
		System.out.println("Test Case ID LogIn6");
		System.out.println(" Verify user is able to login with a valid email");
		OnlineArmenianStoreLogInValidEmail logIn = new OnlineArmenianStoreLogInValidEmail(driver);
		System.out.println("Navigate to onlinearmenianstore.com");
		logIn = logIn.myAccount();
		System.out.println("Step 1.  Click on the 'My Account' button");
		logIn = logIn.emailFieldClick();
		System.out.println("Step 2.  Click on the email field");
		logIn = logIn.emailField();
		System.out.println("Step 3.  Enter 'annaladoyan@yahoo.com' in the email field");
		logIn = logIn.passwordFieldClick();
		System.out.println("Step 4.  Click on the password field");
		logIn = logIn.passwordField();
		System.out.println("Step 5.  Enter '1234567890' in the password field");
		logIn = logIn.logInButton();
		System.out.println("Step 6.  Click on the login button");
		
		
		Assert.assertTrue(logIn.logInEmail.isDisplayed());
	}



}
