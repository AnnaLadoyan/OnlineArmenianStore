package com.web365.home.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.onlinearmenianstore.base.test.OnlineArmenianStoreBaseTest;
import com.web365.onlinearmenianstore.home.OnlineArmenianStoreHomeDriedFruitButton;

public class OnlineArmenianStoreHomeDriedFruitButtonTest extends OnlineArmenianStoreBaseTest {
	
	@Test
	public void onlineArmenianStoreHomeDriedFruitButton() throws InterruptedException {
		System.out.println("Test Case ID Home15");
		System.out.println("Verify 'Dried Fruit' page is displayed when the button is clicked    ");
		OnlineArmenianStoreHomeDriedFruitButton driedFruitButton = new OnlineArmenianStoreHomeDriedFruitButton(driver);
		System.out.println("Navigate to onlinearmenianstore.com");
		driedFruitButton = driedFruitButton.driedFruitButton();
		System.out.println("Step 1. Click on the 'Dried Fruit' button");
		
		Assert.assertTrue(driedFruitButton.driedFruitPage.isDisplayed());
	}


}
