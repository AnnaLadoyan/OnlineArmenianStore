package com.web365.login.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.onlinearmenianstore.base.test.OnlineArmenianStoreBaseTest;
import com.web365.onlinearmenianstore.page.login.OnlineArmenianStorelogInRecoverPassword;

public class OnlineArmenianStoreLogInRecoverPasswordTest extends OnlineArmenianStoreBaseTest {
	
	@Test
	public void onlineArmenianStoreLogInRecoverPassword() throws InterruptedException {
		System.out.println("Test Case ID LogIn5");
		System.out.println("Verify 'Recover Password' button is clickable");
		OnlineArmenianStorelogInRecoverPassword logIn = new OnlineArmenianStorelogInRecoverPassword(driver);
		System.out.println("Navigate to onlinearmenianstore.com");
		logIn = logIn.myAccount();
		System.out.println("Step 1.  Click on the 'My Account' button");
		logIn = logIn.recoverPasswordButton();
		System.out.println("Step 2.  Click on the 'Recover password' button");
		
		Assert.assertTrue(logIn.recoverPassword.isDisplayed());
	}

}
