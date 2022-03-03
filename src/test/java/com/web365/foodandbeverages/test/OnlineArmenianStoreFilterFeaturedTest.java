package com.web365.foodandbeverages.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.onlinearmenianstore.base.test.OnlineArmenianStoreBaseTest;
import com.web365.onlinearmenianstore.page.foodandbeverages.OnlineArmenianStoreFilterBestSelling;
import com.web365.onlinearmenianstore.page.foodandbeverages.OnlineArmenianStoreFilterDriedFruits;
import com.web365.onlinearmenianstore.page.foodandbeverages.OnlineArmenianStoreFilterFeatured;
import com.web365.onlinearmenianstore.page.foodandbeverages.OnlineArmenianStoreFilterNewToOld;
import com.web365.onlinearmenianstore.page.foodandbeverages.OnlineArmenianStoreFilterNuts;
import com.web365.onlinearmenianstore.page.foodandbeverages.OnlineArmenianStoreFilterOldToNew;
import com.web365.onlinearmenianstore.page.foodandbeverages.OnlineArmenianStoreFilterPriceHighToLow;
import com.web365.onlinearmenianstore.page.foodandbeverages.OnlineArmenianStoreFilterPriceLowToHigh;
import com.web365.onlinearmenianstore.page.foodandbeverages.OnlineArmenianStoreFilterTea;

public class OnlineArmenianStoreFilterFeaturedTest extends OnlineArmenianStoreBaseTest {
	
	@Test
	public void testFeaturedButton() throws InterruptedException {
		System.out.println("Test Case ID Filter1");
		System.out.println("Verify user is able to filter products from Featured");
		OnlineArmenianStoreFilterFeatured foodandbeverages = new OnlineArmenianStoreFilterFeatured(driver);
		System.out.println("Navigate to onlinearmenianstore.com");
		foodandbeverages = foodandbeverages.foodAndBeverages();
		System.out.println("Step 1.  Click on the 'Food and Beverages' button");
		foodandbeverages = foodandbeverages.sortBy();
		System.out.println("Step 2.  Click on the 'Sort by' button");
		foodandbeverages = foodandbeverages.featured();
		System.out.println("Step 3.  Click on the 'Featured' button");

		Assert.assertTrue(foodandbeverages.sortByFeatured.isDisplayed());
	}

	@Test
	public void testBestSellingButton() throws InterruptedException {
		System.out.println("Test Case ID Filter2");
		System.out.println("Verify user is able to filter products from Best Selling");
		OnlineArmenianStoreFilterBestSelling foodandbeverages = new OnlineArmenianStoreFilterBestSelling(driver);
		System.out.println("Navigate to onlinearmenianstore.com");
		foodandbeverages = foodandbeverages.foodAndBeverages();
		System.out.println("Step 1.  Click on the 'Food and Beverages' button");
		foodandbeverages = foodandbeverages.sortBy();
		System.out.println("Step 2.  Click on the 'Sort by' button");
		foodandbeverages = foodandbeverages.bestSelling();
		System.out.println("Step 3.   Click on the ' Best Selling' button");

		Assert.assertTrue(foodandbeverages.sortByBestSelling.isDisplayed());
	}
	

	@Test
	public void testNewToOldButton() throws InterruptedException {
		System.out.println("Test Case ID Filter3");
		System.out.println("Verify user is able to filter products from new to old");
		OnlineArmenianStoreFilterNewToOld foodandbeverages = new OnlineArmenianStoreFilterNewToOld(driver);
		System.out.println("Navigate to onlinearmenianstore.com");
		foodandbeverages = foodandbeverages.foodAndBeverages();
		System.out.println("Step 1.  Click on the 'Food and Beverages' button");
		foodandbeverages = foodandbeverages.sortBy();
		System.out.println("Step 2.  Click on the 'Sort by' button");
		foodandbeverages = foodandbeverages.newToOld();
		System.out.println("Step 3.  Click on the 'New to Old' button");

		Assert.assertTrue(foodandbeverages.sortByNewToOld.isDisplayed());
	}
	
	@Test
	public void testOldToNewButton () throws InterruptedException {
		System.out.println("Test Case ID Filter4");
		System.out.println("Verify user is able to filter products from old to new");
		OnlineArmenianStoreFilterOldToNew foodandbeverages = new OnlineArmenianStoreFilterOldToNew(driver);
		System.out.println("Navigate to onlinearmenianstore.com");
		foodandbeverages = foodandbeverages.foodAndBeverages();
		System.out.println("Step 1.  Click on the 'Food and Beverages' button");
		foodandbeverages = foodandbeverages.sortBy();
		System.out.println("Step 2.  Click on the 'Sort by' button");
		foodandbeverages = foodandbeverages.oldToNew();
		System.out.println("Step 3.  Click on the 'Old to New' button");

		Assert.assertTrue(foodandbeverages.sortByOldTonew.isDisplayed());
	}
	
	@Test
	public void testPriceLowToHighButton() throws InterruptedException {
		System.out.println("Test Case ID Filter5");
		System.out.println("Verify user is able to filter products from Price low to high");
		OnlineArmenianStoreFilterPriceLowToHigh foodandbeverages = new OnlineArmenianStoreFilterPriceLowToHigh(driver);
		System.out.println("Navigate to onlinearmenianstore.com");
		foodandbeverages = foodandbeverages.foodAndBeverages();
		System.out.println("Step 1.  Click on the 'Food and Beverages' button");
		foodandbeverages = foodandbeverages.sortBy();
		System.out.println("Step 2.  Click on the 'Sort by' button");
		foodandbeverages = foodandbeverages.priceLowToHigh();
		System.out.println("Step 3.   Click on the 'Price, low to high' button");

		Assert.assertTrue(foodandbeverages.sortByPriceLowToHigh.isDisplayed());
	}

	@Test
	public void testPriceHighToLowButton() throws InterruptedException {
		System.out.println("Test Case ID Filter6");
		System.out.println("Verify user is able to filter products from Price high to low");
		OnlineArmenianStoreFilterPriceHighToLow foodandbeverages = new OnlineArmenianStoreFilterPriceHighToLow(driver);
		System.out.println("Navigate to onlinearmenianstore.com");
		foodandbeverages = foodandbeverages.foodAndBeverages();
		System.out.println("Step 1.  Click on the 'Food and Beverages' button");
		foodandbeverages = foodandbeverages.sortBy();
		System.out.println("Step 2.  Click on the 'Sort by' button");
		foodandbeverages = foodandbeverages.priceHighToLow();
		System.out.println("Step 3.   Click on the 'Price, high to low' button");

		Assert.assertTrue(foodandbeverages.sortByPriceHighToLow.isDisplayed());
	}
	
	@Test
	public void testFriedFruits() throws InterruptedException {
		System.out.println("Test Case ID Filter7");
		System.out.println("Verify the dried fruits page is displayed when the button is clicked");
		OnlineArmenianStoreFilterDriedFruits foodandbeverages = new OnlineArmenianStoreFilterDriedFruits(driver);
		System.out.println("Navigate to onlinearmenianstore.com");
		foodandbeverages = foodandbeverages.foodAndBeverages();
		System.out.println("Step 1. Click on the 'Food and Beverages' button");
		foodandbeverages = foodandbeverages.driedFruitButton();
		System.out.println("Step 2. Click on the 'Dried Fruits' button");
		
		Assert.assertTrue(foodandbeverages.driedFruitPage.isDisplayed());
	}
	
	@Test
	public void testNuts() throws InterruptedException {
		System.out.println("Test Case ID Filter8");
		System.out.println("Verify the Nuts page is displayed when the button is clicked");
		OnlineArmenianStoreFilterNuts foodandbeverages = new OnlineArmenianStoreFilterNuts(driver);
		System.out.println("Navigate to onlinearmenianstore.com");
		foodandbeverages = foodandbeverages.foodAndBeverages();
		System.out.println("Step 1.  Click on the 'Food and Beverages' button");
		foodandbeverages = foodandbeverages.nutsButton();
		System.out.println("Step 2. Click on the 'Nuts ' button");
		
		Assert.assertTrue(foodandbeverages.nutsPage.isDisplayed());
	}
	
	@Test
	public void testTea() throws InterruptedException {
		System.out.println("Test Case ID Filter9");
		System.out.println("Verify the Tea page is displayed when the button is clicked");
		OnlineArmenianStoreFilterTea foodandbeverages = new OnlineArmenianStoreFilterTea(driver);
		System.out.println("Navigate to onlinearmenianstore.com");
		foodandbeverages = foodandbeverages.foodAndBeverages();
		System.out.println("Step 1. Click on the 'Food and Beverages' button");
		foodandbeverages = foodandbeverages.teaButton();
		System.out.println("Step 2. Click on the 'Tea ' button");
		
		Assert.assertTrue(foodandbeverages.teaPage.isDisplayed());
	}




}
