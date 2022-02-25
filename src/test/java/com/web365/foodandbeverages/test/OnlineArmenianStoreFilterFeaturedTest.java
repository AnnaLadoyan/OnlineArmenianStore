package com.web365.foodandbeverages.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.onlinearmenianstore.base.test.OnlineArmenianStoreBaseTest;
import com.web365.onlinearmenianstore.page.foodandbeverages.OnlineArmenianStoreFilterBestSelling;
import com.web365.onlinearmenianstore.page.foodandbeverages.OnlineArmenianStoreFilterFeatured;
import com.web365.onlinearmenianstore.page.foodandbeverages.OnlineArmenianStoreFilterNewToOld;
import com.web365.onlinearmenianstore.page.foodandbeverages.OnlineArmenianStoreFilterOldToNew;
import com.web365.onlinearmenianstore.page.foodandbeverages.OnlineArmenianStoreFilterPriceHighToLow;
import com.web365.onlinearmenianstore.page.foodandbeverages.OnlineArmenianStoreFilterPriceLowToHigh;

public class OnlineArmenianStoreFilterFeaturedTest extends OnlineArmenianStoreBaseTest {
	
	@Test
	public void testFeaturedButton() throws InterruptedException {
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

	@Test
	public void testBestSellingButton() throws InterruptedException {
		System.out.println("Test Case ID Filter2");
		System.out.println("Verify user is able to filter products from Best Selling");
		OnlineArmenianStoreFilterBestSelling filter = new OnlineArmenianStoreFilterBestSelling(driver);
		System.out.println("Navigate to onlinearmenianstore.com");
		filter = filter.foodAndBeverages();
		System.out.println("Step 1.  Click on the 'Food and Beverages' button");
		filter = filter.sortBy();
		System.out.println("Step 2.  Click on the 'Sort by' button");
		filter = filter.bestSelling();
		System.out.println("Step 3.   Click on the ' Best Selling' button");

		Assert.assertTrue(filter.sortByBestSelling.isDisplayed());
	}
	

	@Test
	public void testNewToOldButton() throws InterruptedException {
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

		Assert.assertTrue(filter.sortByNewToOld.isDisplayed());
	}
	
	@Test
	public void testOldToNewButton () throws InterruptedException {
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

		Assert.assertTrue(filter.sortByOldTonew.isDisplayed());
	}
	
	@Test
	public void testPriceLowToHighButton() throws InterruptedException {
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

		Assert.assertTrue(filter.sortByPriceLowToHigh.isDisplayed());
	}

	@Test
	public void testPriceHighToLowButton() throws InterruptedException {
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
