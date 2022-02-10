package com.web365.search.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.onlinearmenianstore.base.test.OnlineArmenianStoreBaseTest;
import com.web365.onlinearmenianstore.filter.OnlineArmenianStoreFilterFeatured;
import com.web365.onlinearmenianstore.search.OnlineArmenianStoreSearchNumbers;

public class OnlineArmenianStoreSearchNumbersTest extends OnlineArmenianStoreBaseTest {
	
	@Test
	public void searchNumbersTest() throws InterruptedException {
		System.out.println("Test Case ID Search7");
		System.out.println("Verify user is able to enter numbers in the search field");
		OnlineArmenianStoreSearchNumbers search = new OnlineArmenianStoreSearchNumbers(driver);
		System.out.println("Navigate to onlinearmenianstore.com");
		search = search.searchField();
		System.out.println("Step 1. Click the search field");
		search = search.field();
		System.out.println("Step 2. Enter '17' in the search field");
		search = search.enter();
		System.out.println("Step 3.  Click the ENTER key");

		Assert.assertTrue(search.searchField.isDisplayed());
	}


}
