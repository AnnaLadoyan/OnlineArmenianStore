package com.web365.signup.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.onlinearmenianstore.base.test.OnlineArmenianStoreBaseTest;
import com.web365.onlinearmenianstore.signup.OnlineArmenianStoreSignUpPage;

public class OnlineArmenianStoreSignUpTest extends OnlineArmenianStoreBaseTest{
	
	@Test
	public void onlineArmenianStoreSignUp() throws InterruptedException {
		System.out.println("Test Case ID SignUp1");
		System.out.println("Verify 'Create your Account' button is clickable");
		OnlineArmenianStoreSignUpPage signUp = new OnlineArmenianStoreSignUpPage(driver);
		System.out.println("Navigate to onlinearmenianstore.com");
		signUp = signUp.signUpPage();
		System.out.println("Step 1. Click on the 'My Account' button");
		signUp = signUp.signUp();
		System.out.println("Step 2. Click on the 'Create your Account' button");

		Assert.assertTrue(signUp.createYourAccountButton.isDisplayed());
	}

}
