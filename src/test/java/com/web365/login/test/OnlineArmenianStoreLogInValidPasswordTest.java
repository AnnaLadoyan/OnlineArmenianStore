package com.web365.login.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.onlinearmenianstore.base.test.OnlineArmenianStoreBaseTest;
import com.web365.onlinearmenianstore.page.login.OnlineArmenianStoreLogInValidPassword;

public class OnlineArmenianStoreLogInValidPasswordTest extends OnlineArmenianStoreBaseTest{
	
	@Test
	public void onlineArmenianStoreLogInValidPassword() throws InterruptedException {
		System.out.println("Test Case ID LogIn7");
		System.out.println(" Verify user is able to login with a valid password");
		OnlineArmenianStoreLogInValidPassword logInValidPassword = new OnlineArmenianStoreLogInValidPassword(driver);
		System.out.println("Navigate to onlinearmenianstore.com");
		logInValidPassword = logInValidPassword.myAccount();
		System.out.println("Step 1.  Click on the 'My Account' button");
		logInValidPassword = logInValidPassword.emailFieldClick();
		System.out.println("Step 2.  Click on the email field");
		logInValidPassword = logInValidPassword.emailField();
		System.out.println("Step 3.  Enter 'annaladoyan@yahoo.com' in the email field");
		logInValidPassword = logInValidPassword.passwordFieldClick();
		System.out.println("Step 4.  Click on the password field");
		logInValidPassword = logInValidPassword.passwordField();
		System.out.println("Step 5.  Enter '1234567890' in the password field");
		logInValidPassword = logInValidPassword.logInButton();
		System.out.println("Step 6.  Click on the login button");
		
		
		Assert.assertTrue(logInValidPassword.logInPassword.isDisplayed());
	}




}
