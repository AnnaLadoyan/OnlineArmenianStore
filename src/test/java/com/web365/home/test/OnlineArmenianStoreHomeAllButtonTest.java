package com.web365.home.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.onlinearmenianstore.base.test.OnlineArmenianStoreBaseTest;
import com.web365.onlinearmenianstore.home.OnlineArmenianStoreHomeAllButton;

public class OnlineArmenianStoreHomeAllButtonTest extends OnlineArmenianStoreBaseTest {
	
	@Test
	public void onlineArmenianStoreHomeAllButton() throws InterruptedException {
		System.out.println("Test Case ID Home2");
		System.out.println("Verify 'All' page is displayed when the button is clicked ");
		OnlineArmenianStoreHomeAllButton allButton = new OnlineArmenianStoreHomeAllButton(driver);
		System.out.println("Navigate to onlinearmenianstore.com");
		allButton = allButton.allButton();
		System.out.println("Step 1. Click on the 'All' button");
		
		Assert.assertTrue(allButton.allPage.isDisplayed());
	}

}
