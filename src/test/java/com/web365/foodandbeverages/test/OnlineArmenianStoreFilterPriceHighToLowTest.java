package com.web365.foodandbeverages.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.onlinearmenianstore.base.test.OnlineArmenianStoreBaseTest;
import com.web365.onlinearmenianstore.page.foodandbeverages.OnlineArmenianStoreFilterPriceHighToLow;

public class OnlineArmenianStoreFilterPriceHighToLowTest extends OnlineArmenianStoreBaseTest {
	
	@Test
	public void priceHighToLowTest() throws InterruptedException {
		System.out.println("Test Case ID Filter6");
		System.out.println("Verify user is able to filter products from Price high to low");
		OnlineArmenianStoreFilterPriceHighToLow filter = new OnlineArmenianStoreFilterPriceHighToLow(driver);
		System.out.println("Navigate to onlinearmenianstore.com");
		filter = filter.foodAndBeverages();
		System.out.println("Step 1.  Click on the 'Food and Beverages' button");
		filter = filter.sortBy();
		System.out.println("Step 2.  Click on the 'Sort by' button");
		filter = filter.priceHighToLow();
		System.out.println("Step 3.   Click on the 'Price, high to low' button");

		Assert.assertTrue(filter.sortByPriceHighToLow.isDisplayed());
	}


}
