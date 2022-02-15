package com.web365.foodandbeverages.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.onlinearmenianstore.base.test.OnlineArmenianStoreBaseTest;
import com.web365.onlinearmenianstore.page.foodandbeverages.OnlineArmenianStoreFilterOldToNew;

public class OnlineArmenianStoreFilterOldToNewTest extends OnlineArmenianStoreBaseTest {
	
	@Test
	public void oldToNewTest () throws InterruptedException {
		System.out.println("Test Case ID Filter4");
		System.out.println("Verify user is able to filter products from old to new");
		OnlineArmenianStoreFilterOldToNew filter = new OnlineArmenianStoreFilterOldToNew(driver);
		System.out.println("Navigate to onlinearmenianstore.com");
		filter = filter.foodAndBeverages();
		System.out.println("Step 1.  Click on the 'Food and Beverages' button");
		filter = filter.sortBy();
		System.out.println("Step 2.  Click on the 'Sort by' button");
		filter = filter.oldToNew();
		System.out.println("Step 3.  Click on the 'Old to New' button");

		Assert.assertTrue(filter.oldToNew.isDisplayed());
	}



}
