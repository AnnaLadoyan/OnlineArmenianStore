package com.web365.foodandbeverages.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.onlinearmenianstore.base.test.OnlineArmenianStoreBaseTest;
import com.web365.onlinearmenianstore.page.foodandbeverages.OnlineArmenianStoreFilterNewToOld;

public class OnlineArmenianStoreFilterNewToOldTest extends OnlineArmenianStoreBaseTest {
	
	@Test
	public void newToOldTest() throws InterruptedException {
		System.out.println("Test Case ID Filter3");
		System.out.println("Verify user is able to filter products from new to old");
		OnlineArmenianStoreFilterNewToOld filter = new OnlineArmenianStoreFilterNewToOld(driver);
		System.out.println("Navigate to onlinearmenianstore.com");
		filter = filter.foodAndBeverages();
		System.out.println("Step 1.  Click on the 'Food and Beverages' button");
		filter = filter.sortBy();
		System.out.println("Step 2.  Click on the 'Sort by' button");
		filter = filter.newToOld();
		System.out.println("Step 3.  Click on the 'New to Old' button");

		Assert.assertTrue(filter.newToOld.isDisplayed());
	}


}
