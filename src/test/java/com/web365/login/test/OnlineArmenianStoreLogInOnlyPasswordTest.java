package com.web365.login.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.onlinearmenianstore.base.test.OnlineArmenianStoreBaseTest;
import com.web365.onlinearmenianstore.page.login.OnlineArmenianStoreLogInOnlyPassword;

public class OnlineArmenianStoreLogInOnlyPasswordTest extends OnlineArmenianStoreBaseTest {
	
	@Test
	public void onlineArmenianStoreLogInOnlyPassword() throws InterruptedException {
		System.out.println("Test Case ID Search15");
		System.out.println("Verify user is not allowed to login with only password");
		OnlineArmenianStoreLogInOnlyPassword logInPassword = new OnlineArmenianStoreLogInOnlyPassword(driver);
		System.out.println("Navigate to onlinearmenianstore.com");
		logInPassword = logInPassword.myAccount();
		System.out.println("Step 1.  Click on the 'My Account' button");
		logInPassword = logInPassword.passwordFieldClick();
		System.out.println("Step 2.  Click on the password field");
		logInPassword = logInPassword.passwordField();
		System.out.println("Step 3.   Enter '573424' in th password field");
		logInPassword = logInPassword.loginButton();
		System.out.println("Step 4.   Click on the 'Login' button");
		
		Assert.assertTrue(logInPassword.errorMessage.isDisplayed());
	}


}
