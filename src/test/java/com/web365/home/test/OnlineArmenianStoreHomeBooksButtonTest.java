package com.web365.home.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.onlinearmenianstore.base.test.OnlineArmenianStoreBaseTest;
import com.web365.onlinearmenianstore.home.OnlineArmenianStoreHomeBooksButton;


public class OnlineArmenianStoreHomeBooksButtonTest extends OnlineArmenianStoreBaseTest{
	
	@Test
	public void onlineArmenianStoreHomeBooksButton() throws InterruptedException {
		System.out.println("Test Case ID Home3");
		System.out.println("Verify 'Books' page is displayed when the button is clicked  ");
		OnlineArmenianStoreHomeBooksButton booksButton = new OnlineArmenianStoreHomeBooksButton(driver);
		System.out.println("Navigate to onlinearmenianstore.com");
		booksButton = booksButton.booksButton();
		System.out.println("Step 1. Click on the 'Books' button");
		
		Assert.assertTrue(booksButton.booksPage.isDisplayed());
	}

}
