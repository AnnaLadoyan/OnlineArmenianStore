package com.web365.foodandbeverages.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.onlinearmenianstore.base.test.OnlineArmenianStoreBaseTest;
import com.web365.onlinearmenianstore.page.foodandbeverages.OnlineArmenianStoreFilterFeatured;

public class OnlineArmenianStoreFilterFeaturedTest extends OnlineArmenianStoreBaseTest {
	
	@Test
	public void featuredTest() throws InterruptedException {
		System.out.println("Test Case ID Filter1");
		System.out.println("Verify user is able to filter products from Featured");
		OnlineArmenianStoreFilterFeatured filter = new OnlineArmenianStoreFilterFeatured(driver);
		System.out.println("Navigate to onlinearmenianstore.com");
		filter = filter.foodAndBeverages();
		System.out.println("Step 1.  Click on the 'Food and Beverages' button");
		filter = filter.sortBy();
		System.out.println("Step 2.  Click on the 'Sort by' button");
		filter = filter.featured();
		System.out.println("Step 3.  Click on the 'Featured' button");

		Assert.assertTrue(filter.sortByFeatured.isDisplayed());
	}


}
