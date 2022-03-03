package com.web365.login.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.onlinearmenianstore.base.test.OnlineArmenianStoreBaseTest;
import com.web365.onlinearmenianstore.page.login.OnlineArmenianStoreLogInOnlyEmail;

public class OnlineArmenianStoreLogInOnlyEmailTest extends OnlineArmenianStoreBaseTest {
	
	@Test
	public void onlineArmenianStoreLogInEmail() throws InterruptedException {
		System.out.println("Test Case ID LogIn3");
		System.out.println("Verify user is not allowed to login with only email");
		OnlineArmenianStoreLogInOnlyEmail logIn = new OnlineArmenianStoreLogInOnlyEmail(driver);
		System.out.println("Navigate to onlinearmenianstore.com");
		logIn = logIn.myAccount();
		System.out.println("Step 1.  Click on the 'My Account' button");
		logIn = logIn.emailFieldClick();
		System.out.println("Step 2.  Click on the email field");
		logIn = logIn.emailField();
		System.out.println("Step 3.  Enter 'annaladoyan1989@gmail.com' in th email field");
		logIn = logIn.logInButton();
		System.out.println("Step 4.  Click on the 'Login' button");
		
		Assert.assertTrue(logIn.errorMessage.isDisplayed());
	}

}
