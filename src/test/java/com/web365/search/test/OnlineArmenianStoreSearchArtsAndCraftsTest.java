package com.web365.search.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.onlinearmenianstore.base.test.OnlineArmenianStoreBaseTest;
import com.web365.onlinearmenianstore.search.OnlineArmenianStoreSearchArtsAndCrafts;
import com.web365.onlinearmenianstore.search.OnlineArmenianStoreSearchBooks;

public class OnlineArmenianStoreSearchArtsAndCraftsTest extends OnlineArmenianStoreBaseTest {
	
	@Test
	public void searchArtsAndCraftsTest() throws InterruptedException {
		System.out.println("Test Case ID Search11");
		System.out.println("Verify user is able to filter searches to arts and crafts");
		OnlineArmenianStoreSearchArtsAndCrafts search = new OnlineArmenianStoreSearchArtsAndCrafts(driver);
		System.out.println("Navigate to onlinearmenianstore.com");
		search = search.searchField();
		System.out.println("Step 1. Click on the search field");
		search = search.field();
		System.out.println("Step 2.  Enter 'canvas' in the search field");
		search = search.allCategories();
		System.out.println("Step 3. Click on the 'All Catergories' button");
		search = search.artsAndCrafts();
		System.out.println("Step 4. Click on the arts and crafts button");
		search = search.searchIcon();
		System.out.println("Step 5.  Click on the search icon");


		Assert.assertTrue(search.productForArtsAndCrafts.isDisplayed());
	}



}
