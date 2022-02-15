package com.web365.foodandbeverages.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.onlinearmenianstore.base.test.OnlineArmenianStoreBaseTest;
import com.web365.onlinearmenianstore.page.foodandbeverages.OnlineArmenianStoreFilterPriceLowToHigh;

public class OnlineArmenianStoreFilterPriceLowToHighTest extends OnlineArmenianStoreBaseTest {
	
	@Test
	public void priceLowToHighTest() throws InterruptedException {
		System.out.println("Test Case ID Filter5");
		System.out.println("Verify user is able to filter products from Price low to high");
		OnlineArmenianStoreFilterPriceLowToHigh filter = new OnlineArmenianStoreFilterPriceLowToHigh(driver);
		System.out.println("Navigate to onlinearmenianstore.com");
		filter = filter.foodAndBeverages();
		System.out.println("Step 1.  Click on the 'Food and Beverages' button");
		filter = filter.sortBy();
		System.out.println("Step 2.  Click on the 'Sort by' button");
		filter = filter.priceLowToHigh();
		System.out.println("Step 3.   Click on the 'Price, low to high' button");

		Assert.assertTrue(filter.priceLowToHigh.isDisplayed());
	}


}
