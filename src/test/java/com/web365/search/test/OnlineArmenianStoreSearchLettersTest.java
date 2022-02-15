package com.web365.search.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.onlinearmenianstore.base.test.OnlineArmenianStoreBaseTest;
import com.web365.onlinearmenianstore.search.OnlineArmenianStoreSearchLetters;

public class OnlineArmenianStoreSearchLettersTest extends OnlineArmenianStoreBaseTest {
	
	@Test
	public void searchLettersTest() throws InterruptedException {
		System.out.println("Test Case ID Search3");
		System.out.println("Verify user is able to enter letters in the search field");
		OnlineArmenianStoreSearchLetters search = new OnlineArmenianStoreSearchLetters(driver);
		System.out.println("Navigate to onlinearmenianstore.com");
		search = search.searchField();
		System.out.println("Step 1. Click the search field");
		search = search.field();
		System.out.println("Step 2.  Enter 'books' in the search field");
		search = search.enter();
		System.out.println("Step 3.  Click the ENTER key");

		Assert.assertTrue(search.searchField.isDisplayed());
	}

}
