package com.web365.login.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.onlinearmenianstore.base.test.OnlineArmenianStoreBaseTest;
import com.web365.onlinearmenianstore.page.login.OnlineArmenianStoreLogInValidEmail;

public class OnlineArmenianStoreLogInValidEmailTest extends OnlineArmenianStoreBaseTest {
	
	@Test
	public void onlineArmenianStoreLogInValidEmail() throws InterruptedException {
		System.out.println("Test Case ID Search17");
		System.out.println(" Verify user is able to login with a valid email");
		OnlineArmenianStoreLogInValidEmail logInValidEmail = new OnlineArmenianStoreLogInValidEmail(driver);
		System.out.println("Navigate to onlinearmenianstore.com");
		logInValidEmail = logInValidEmail.myAccount();
		System.out.println("Step 1.  Click on the 'My Account' button");
		logInValidEmail = logInValidEmail.emailFieldClick();
		System.out.println("Step 2.  Click on the email field");
		logInValidEmail = logInValidEmail.emailField();
		System.out.println("Step 3.  Enter 'annaladoyan@yahoo.com' in the email field");
		logInValidEmail = logInValidEmail.passwordFieldClick();
		System.out.println("Step 4.  Click on the password field");
		logInValidEmail = logInValidEmail.passwordField();
		System.out.println("Step 5.  Enter '1234567890' in the password field");
		logInValidEmail = logInValidEmail.logInButton();
		System.out.println("Step 6.  Click on the login button");
		
		
		Assert.assertTrue(logInValidEmail.logInEmail.isDisplayed());
	}



}
