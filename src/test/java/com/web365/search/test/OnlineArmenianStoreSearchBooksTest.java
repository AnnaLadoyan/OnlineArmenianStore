package com.web365.search.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.onlinearmenianstore.base.test.OnlineArmenianStoreBaseTest;
import com.web365.onlinearmenianstore.search.OnlineArmenianStoreSearchBooks;
import com.web365.onlinearmenianstore.search.OnlineArmenianStoreSearchLetters;

public class OnlineArmenianStoreSearchBooksTest extends OnlineArmenianStoreBaseTest {
	
	@Test
	public void searchBooksTest() throws InterruptedException {
		System.out.println("Test Case ID Search10");
		System.out.println("Verify user is able to filter searches to books");
		OnlineArmenianStoreSearchBooks search = new OnlineArmenianStoreSearchBooks(driver);
		System.out.println("Navigate to onlinearmenianstore.com");
		search = search.searchField();
		System.out.println("Step 1. Click on the search field");
		search = search.field();
		System.out.println("Step 2. Enter '17' in the search field");
		search = search.allCategories();
		System.out.println("Step 3. Click on the 'All Catergories' button");
		search = search.books();
		System.out.println("Step 4. Click on the books button");
		search = search.searchIcon();
		System.out.println("Step 5.  Click on the search icon");


		Assert.assertTrue(search.productForBooks.isDisplayed());
	}


}
