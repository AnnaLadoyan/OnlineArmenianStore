package com.web365.search.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.onlinearmenianstore.base.test.OnlineArmenianStoreBaseTest;
import com.web365.onlinearmenianstore.search.OnlineArmenianStoreSearchNumbers;

public class OnlineArmenianStoreSearchSpecialCharactersTest extends OnlineArmenianStoreBaseTest {

	@Test
	public void searchSpecialCharactersTest() throws InterruptedException {
		System.out.println("Test Case ID Search5");
		System.out.println("Verify user is able to enter special characters in the search field");
		OnlineArmenianStoreSearchNumbers search = new OnlineArmenianStoreSearchNumbers(driver);
		System.out.println("Navigate to onlinearmenianstore.com");
		search = search.searchField();
		System.out.println("Step 1. Click the search field");
		search = search.field();
		System.out.println("Step 2. Enter '^!$%^@' in the search field");
		search = search.enter();
		System.out.println("Step 3.  Click the ENTER key");

		Assert.assertTrue(search.searchField.isDisplayed());
	}

}
