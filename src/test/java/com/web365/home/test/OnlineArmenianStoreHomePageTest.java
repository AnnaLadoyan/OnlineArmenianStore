package com.web365.home.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.web365.onlinearmenianstore.base.test.OnlineArmenianStoreBaseTest;
import com.web365.onlinearmenianstore.home.OnlineArmenianStoreHomeAboutUsButton;
import com.web365.onlinearmenianstore.home.OnlineArmenianStoreHomeAccessoriesButton;
import com.web365.onlinearmenianstore.home.OnlineArmenianStoreHomeAllButton;
import com.web365.onlinearmenianstore.home.OnlineArmenianStoreHomeBooksButton;
import com.web365.onlinearmenianstore.home.OnlineArmenianStoreHomeChatWithUsButton;
import com.web365.onlinearmenianstore.home.OnlineArmenianStoreHomeClothingJewelryAndAccessoriesButton;
import com.web365.onlinearmenianstore.home.OnlineArmenianStoreHomeContactUsButton;
import com.web365.onlinearmenianstore.home.OnlineArmenianStoreHomeDriedFruitButton;
import com.web365.onlinearmenianstore.home.OnlineArmenianStoreHomeFAQButton;
import com.web365.onlinearmenianstore.home.OnlineArmenianStoreHomeFacebookIcon;
import com.web365.onlinearmenianstore.home.OnlineArmenianStoreHomeFoodAndBeveragesButton;
import com.web365.onlinearmenianstore.home.OnlineArmenianStoreHomeForVendorsButton;
import com.web365.onlinearmenianstore.home.OnlineArmenianStoreHomeHealthAndBeautyButton;
import com.web365.onlinearmenianstore.home.OnlineArmenianStoreHomeJewelryButton;
import com.web365.onlinearmenianstore.home.OnlineArmenianStoreHomeKitchenAndDiningButton;
import com.web365.onlinearmenianstore.home.OnlineArmenianStoreHomeNewArrivalsButton;
import com.web365.onlinearmenianstore.home.OnlineArmenianStoreHomeOnSaleItemsButton;
import com.web365.onlinearmenianstore.home.OnlineArmenianStoreHomePage;
import com.web365.onlinearmenianstore.home.OnlineArmenianStoreHomePrivacyAndPolicyButton;
import com.web365.onlinearmenianstore.home.OnlineArmenianStoreHomeProductsButton;
import com.web365.onlinearmenianstore.home.OnlineArmenianStoreHomeRefundPolicyButton;
import com.web365.onlinearmenianstore.home.OnlineArmenianStoreHomeShippingPolicyButton;
import com.web365.onlinearmenianstore.home.OnlineArmenianStoreHomeTeaButton;
import com.web365.onlinearmenianstore.home.OnlineArmenianStoreHomeTermsOfServiceButton;
import com.web365.onlinearmenianstore.home.OnlineArmenianStoreHomeToysAndGamesButton;
import com.web365.onlinearmenianstore.home.OnlineArmenianStoreHomeViewAllButton;

public class OnlineArmenianStoreHomePageTest extends OnlineArmenianStoreBaseTest {

	@Test
	public void testLogoButton() throws InterruptedException {
		System.out.println("Test Case ID Home1");
		System.out.println("Verify user is able to go back to Home page after clicking the logo");
		OnlineArmenianStoreHomePage homePage = new OnlineArmenianStoreHomePage(driver);
		System.out.println("Navigate to onlinearmenianstore.com");
		homePage = homePage.oasLogo();
		System.out.println("Step 1. Click the 'About Us' button");
		homePage = homePage.oasLogo();
		System.out.println("Step 2.  Click the OnlineArmenianStore logo in the top left corner of the website");

		Assert.assertTrue(homePage.homePage.isDisplayed());
	}
		
		@Test
		public void testAllButton() throws InterruptedException {
			System.out.println("Test Case ID Home2");
			System.out.println("Verify 'All' page is displayed when the button is clicked ");
			OnlineArmenianStoreHomeAllButton allButton = new OnlineArmenianStoreHomeAllButton(driver);
			System.out.println("Navigate to onlinearmenianstore.com");
			allButton = allButton.allButton();
			System.out.println("Step 1. Click on the 'All' button");
			
			Assert.assertTrue(allButton.allPage.isDisplayed());
	
	}
		
		@Test
		public void testBooksButton() throws InterruptedException {
			System.out.println("Test Case ID Home3");
			System.out.println("Verify 'Books' page is displayed when the button is clicked  ");
			OnlineArmenianStoreHomeBooksButton booksButton = new OnlineArmenianStoreHomeBooksButton(driver);
			System.out.println("Navigate to onlinearmenianstore.com");
			booksButton = booksButton.booksButton();
			System.out.println("Step 1. Click on the 'Books' button");
			
			Assert.assertTrue(booksButton.booksPage.isDisplayed());
		}

		@Test
		public void testFoodAndBeveragesButton() throws InterruptedException {
			System.out.println("Test Case ID Home4");
			System.out.println("Verify 'Food and Beverages' page is displayed when the button is clicked   ");
			OnlineArmenianStoreHomeFoodAndBeveragesButton foodAndBeveragesButton = new OnlineArmenianStoreHomeFoodAndBeveragesButton(driver);
			System.out.println("Navigate to onlinearmenianstore.com");
			foodAndBeveragesButton = foodAndBeveragesButton.foodAndBeveragesButton();
			System.out.println("Step 1. Click on the 'Food and Beverages' button");
			
			Assert.assertTrue(foodAndBeveragesButton.foodAndBeveragesPage.isDisplayed());
		}
		
		@Test
		public void testClothingJewelryAndAccessoriesButton() throws InterruptedException {
			System.out.println("Test Case ID Home5");
			System.out.println("Verify 'Clothing, Jewelry, and Accessories' page is displayed when the button is clicked  ");
			OnlineArmenianStoreHomeClothingJewelryAndAccessoriesButton clothingJewelryAndAccessoriesButton = new OnlineArmenianStoreHomeClothingJewelryAndAccessoriesButton(driver);
			System.out.println("Navigate to onlinearmenianstore.com");
			clothingJewelryAndAccessoriesButton = clothingJewelryAndAccessoriesButton.clothingJewelryAndAccessoriesbutton();
			System.out.println("Step 1. Click on the 'Clothing, Jewelry, and Accessories' button");
			
			Assert.assertTrue(clothingJewelryAndAccessoriesButton.clothingJewelryAndAccessoriesPage.isDisplayed());
		}

		@Test
		public void testToysAndGamesButton() throws InterruptedException {
			System.out.println("Test Case ID Home6");
			System.out.println("Verify 'Toys and Games' page is displayed when the button is clicked  ");
			OnlineArmenianStoreHomeToysAndGamesButton toysAndGamesButton = new OnlineArmenianStoreHomeToysAndGamesButton(driver);
			System.out.println("Navigate to onlinearmenianstore.com");
			toysAndGamesButton = toysAndGamesButton.toysAnadGamesButton();
			System.out.println("Step 1. Click on the 'Toys and Games' buttonss");
			
			Assert.assertTrue(toysAndGamesButton.toysAnadGamesPage.isDisplayed());
		}

		@Test
		public void testHealthAndBeautyButton() throws InterruptedException {
			System.out.println("Test Case ID Home7");
			System.out.println("Verify 'Health and Beauty' page is displayed when the button is clicked   ");
			OnlineArmenianStoreHomeHealthAndBeautyButton healthAndBeautyButton = new OnlineArmenianStoreHomeHealthAndBeautyButton(driver);
			System.out.println("Navigate to onlinearmenianstore.com");
			healthAndBeautyButton = healthAndBeautyButton.healthAndBeautyButton();
			System.out.println("Step 1. Click on the 'Health and Beauty' button");
			
			Assert.assertTrue(healthAndBeautyButton.healthAndBeautyPage.isDisplayed());
		}
		
		@Test
		public void testHomeProductsButton() throws InterruptedException {
			System.out.println("Test Case ID Home8");
			System.out.println("Verify 'Home Products' page is displayed when the button is clicked   ");
			OnlineArmenianStoreHomeProductsButton homeProductsButton = new OnlineArmenianStoreHomeProductsButton(driver);
			System.out.println("Navigate to onlinearmenianstore.com");
			homeProductsButton = homeProductsButton.homeProductsButton();
			System.out.println("Step 1. Click on the 'Home Products' button");
			
			Assert.assertTrue(homeProductsButton.homeProductsPage.isDisplayed());
		}

		@Test
		public void testNewArrivalsButton() throws InterruptedException {
			System.out.println("Test Case ID Home9");
			System.out.println("Verify 'New Arrivals' page is displayed when the button is clicked   ");
			OnlineArmenianStoreHomeNewArrivalsButton newArrivalsButton = new OnlineArmenianStoreHomeNewArrivalsButton(driver);
			System.out.println("Navigate to onlinearmenianstore.com");
			newArrivalsButton = newArrivalsButton.newArrivalsButton();
			System.out.println("Step 1. Click on the 'New Arrivals' button");
			
			Assert.assertTrue(newArrivalsButton.newArrivalsPage.isDisplayed());
		}

		@Test
		public void testOnSaleItemButton() throws InterruptedException {
			System.out.println("Test Case ID Home10");
			System.out.println("Verify 'On Sale Items' page is displayed when the button is clicked    ");
			OnlineArmenianStoreHomeOnSaleItemsButton onSaleItemButton = new OnlineArmenianStoreHomeOnSaleItemsButton(driver);
			System.out.println("Navigate to onlinearmenianstore.com");
			onSaleItemButton = onSaleItemButton.onSaleItemButton();
			System.out.println("Step 1.  Click on the 'On Sale Items' button");
			
			Assert.assertTrue(onSaleItemButton.onSaleItemPage.isDisplayed());
		}
		
		@Test
		public void testJewelryButton() throws InterruptedException {
			System.out.println("Test Case ID Home11");
			System.out.println("Verify 'Jewelry' page is displayed when the button is clicked    ");
			OnlineArmenianStoreHomeJewelryButton jewelryButton = new OnlineArmenianStoreHomeJewelryButton(driver);
			System.out.println("Navigate to onlinearmenianstore.com");
			jewelryButton = jewelryButton.jewelryButton();
			System.out.println("Step 1. Click on the 'Jewelry' button");
			
			Assert.assertTrue(jewelryButton.jewelryPage.isDisplayed());
		}
		
		@Test
		public void testKitchenAndDiningButton() throws InterruptedException {
			System.out.println("Test Case ID Home12");
			System.out.println("Verify 'Kitchen and Dining' page is displayed when the button is clicked    ");
			OnlineArmenianStoreHomeKitchenAndDiningButton kitchenAndDiningButton = new OnlineArmenianStoreHomeKitchenAndDiningButton(driver);
			System.out.println("Navigate to onlinearmenianstore.com");
			kitchenAndDiningButton = kitchenAndDiningButton.kitchenAndDiningButton();
			System.out.println("Step 1. Click on the 'Kitchen and Dining' button");
			
			Assert.assertTrue(kitchenAndDiningButton.kitchenAndDiningPage.isDisplayed());
		}


		@Test
		public void testAccessoriesButton() throws InterruptedException {
			System.out.println("Test Case ID Home13");
			System.out.println("Verify 'Accessories' page is displayed when the button is clicked    ");
			OnlineArmenianStoreHomeAccessoriesButton accessoriesButton = new OnlineArmenianStoreHomeAccessoriesButton(driver);
			System.out.println("Navigate to onlinearmenianstore.com");
			accessoriesButton = accessoriesButton.accessoriesButton();
			System.out.println("Step 1. Click on the 'Accessories' button");
			
			Assert.assertTrue(accessoriesButton.accessoriesPage.isDisplayed());
		}

		@Test
		public void testTeaButton() throws InterruptedException {
			System.out.println("Test Case ID Home14");
			System.out.println("Verify 'Tea' page is displayed when the button is clicked     ");
			OnlineArmenianStoreHomeTeaButton teaButton = new OnlineArmenianStoreHomeTeaButton(driver);
			System.out.println("Navigate to onlinearmenianstore.com");
			teaButton = teaButton.teaButton();
			System.out.println("Step 1. Click on the 'Tea' button");
			
			Assert.assertTrue(teaButton.teaPage.isDisplayed());
		}

		@Test
		public void testDriedFruitButton() throws InterruptedException {
			System.out.println("Test Case ID Home15");
			System.out.println("Verify 'Dried Fruit' page is displayed when the button is clicked    ");
			OnlineArmenianStoreHomeDriedFruitButton driedFruitButton = new OnlineArmenianStoreHomeDriedFruitButton(driver);
			System.out.println("Navigate to onlinearmenianstore.com");
			driedFruitButton = driedFruitButton.driedFruitButton();
			System.out.println("Step 1. Click on the 'Dried Fruit' button");
			
			Assert.assertTrue(driedFruitButton.driedFruitPage.isDisplayed());
		}

		@Test
		public void testAboutUsButton() throws InterruptedException {
			System.out.println("Test Case ID Home16");
			System.out.println("Verify 'About Us' page is displayed when the button is clicked    ");
			OnlineArmenianStoreHomeAboutUsButton aboutUsButton = new OnlineArmenianStoreHomeAboutUsButton(driver);
			System.out.println("Navigate to onlinearmenianstore.com");
			aboutUsButton = aboutUsButton.aboutUsButton();
			System.out.println("Step 1. Click on the 'About Us' button");
			
			Assert.assertTrue(aboutUsButton.aboutUsPage.isDisplayed());
		}
		
		@Test
		public void testContactUsButton() throws InterruptedException {
			System.out.println("Test Case ID Home17");
			System.out.println("Verify 'Contact Us' page is displayed when the button is clicked     ");
			OnlineArmenianStoreHomeContactUsButton contactUsButton = new OnlineArmenianStoreHomeContactUsButton(driver);
			System.out.println("Navigate to onlinearmenianstore.com");
			contactUsButton = contactUsButton.contactUsButton();
			System.out.println("Step 1.  Click on the 'Contact Us' button");
			
			Assert.assertTrue(contactUsButton.contactUsPage.isDisplayed());
		}

		@Test
		public void testPrivacyAndPolicyButton() throws InterruptedException {
			System.out.println("Test Case ID Home18");
			System.out.println("Verify 'Privacy Policy' page is displayed when the button is clicked     ");
			OnlineArmenianStoreHomePrivacyAndPolicyButton privacyAndPolicyButton = new OnlineArmenianStoreHomePrivacyAndPolicyButton(driver);
			System.out.println("Navigate to onlinearmenianstore.com");
			privacyAndPolicyButton = privacyAndPolicyButton.privacyAndPolicyButton();
			System.out.println("Step 1. Click on the 'Privacy Policy' button");
			
			Assert.assertTrue(privacyAndPolicyButton.privacyAndPolicyPage.isDisplayed());
		}
		
		@Test
		public void testTermsOfServiceButton() throws InterruptedException {
			System.out.println("Test Case ID Home19");
			System.out.println("Verify 'Terms of Service' page is displayed when the button is clicked     ");
			OnlineArmenianStoreHomeTermsOfServiceButton termsOfServiceButton = new OnlineArmenianStoreHomeTermsOfServiceButton(driver);
			System.out.println("Navigate to onlinearmenianstore.com");
			termsOfServiceButton = termsOfServiceButton.termsOfServiceButton();
			System.out.println("Step 1. Click on the 'Terms of Service' button");
			
			Assert.assertTrue(termsOfServiceButton.termsOfServicePage.isDisplayed());
		}


		@Test
		public void testShippingPolicyButton() throws InterruptedException {
			System.out.println("Test Case ID Home20");
			System.out.println("Verify 'Shipping Policy' page is displayed when the button is clicked     ");
			OnlineArmenianStoreHomeShippingPolicyButton shippingPolicyButton = new OnlineArmenianStoreHomeShippingPolicyButton(driver);
			System.out.println("Navigate to onlinearmenianstore.com");
			shippingPolicyButton = shippingPolicyButton.shippingPolicyButton();
			System.out.println("Step 1. Click on the 'Shipping Policy' button");
			
			Assert.assertTrue(shippingPolicyButton.shippingPolicyPage.isDisplayed());
		}

		@Test
		public void testRefundPolicyButton() throws InterruptedException {
			System.out.println("Test Case ID Home21");
			System.out.println("Verify 'Refund Policy' page is displayed when the button is clicked");
			OnlineArmenianStoreHomeRefundPolicyButton refundPolicyButton = new OnlineArmenianStoreHomeRefundPolicyButton(driver);
			System.out.println("Navigate to onlinearmenianstore.com");
			refundPolicyButton = refundPolicyButton.refundPolicyButton();
			System.out.println("Step 1.  Click on the 'Refund Policy' button");
			
			Assert.assertTrue(refundPolicyButton.refundPolicyPage.isDisplayed());
		}
		
		@Test
		public void testFAQButton() throws InterruptedException {
			System.out.println("Test Case ID Home22");
			System.out.println("Verify 'FAQ' page is displayed when the button is clicked ");
			OnlineArmenianStoreHomeFAQButton FAQButton = new OnlineArmenianStoreHomeFAQButton(driver);
			System.out.println("Navigate to onlinearmenianstore.com");
			FAQButton = FAQButton.FAQButton();
			System.out.println("Step 1.  Click on the 'FAQ' button");
			
			Assert.assertTrue(FAQButton.FAQPage.isDisplayed());
		}
		
		@Test
		public void testForVendorsButton() throws InterruptedException {
			System.out.println("Test Case ID Home23");
			System.out.println("Verify 'For Vendors' page is displayed when the button is clicked  ");
			OnlineArmenianStoreHomeForVendorsButton forVendorsButton = new OnlineArmenianStoreHomeForVendorsButton(driver);
			System.out.println("Navigate to onlinearmenianstore.com");
			forVendorsButton = forVendorsButton.forVendorsButton();
			System.out.println("Step 1.   Click on the 'For Vendors' button");
			
			Assert.assertTrue(forVendorsButton.forVendorsPage.isDisplayed());
		}
		
		@Test
		public void testViewAllButton() throws InterruptedException {
			System.out.println("Test Case ID Home24");
			System.out.println("Verify 'View All' page is displayed when the button is clicked  ");
			OnlineArmenianStoreHomeViewAllButton viewAllButton = new OnlineArmenianStoreHomeViewAllButton(driver);		
			System.out.println("Navigate to onlinearmenianstore.com");
			viewAllButton = viewAllButton.viewAllButton();
			System.out.println("Step 1. Click on the 'View All' button");
			
			Assert.assertTrue(viewAllButton.viewAllPage.isDisplayed());
		}
		
		@Test
		public void testChatWithUsButton() throws InterruptedException {
			System.out.println("Test Case ID Home25");
			System.out.println("Verify 'Chat With Us' page is displayed when the button is clicked   ");
			OnlineArmenianStoreHomeChatWithUsButton chatWithUsButton = new OnlineArmenianStoreHomeChatWithUsButton(driver);		
			System.out.println("Navigate to onlinearmenianstore.com");
			chatWithUsButton = chatWithUsButton.chatWithUsButton();
			System.out.println("Step 1. Click on the 'Chat With Us' button");
			
			Assert.assertTrue(chatWithUsButton.chatWithUsPage.isDisplayed());
		}
		
		@Test
		public void testFacebookIcon() throws InterruptedException {
			System.out.println("Test Case ID Home26");
			System.out.println("Verify Facebook icon is clickable    ");
			OnlineArmenianStoreHomeFacebookIcon facebookIcon = new OnlineArmenianStoreHomeFacebookIcon(driver);		
			System.out.println("Navigate to onlinearmenianstore.com");
			facebookIcon = facebookIcon.facebookIcon();
			System.out.println("Step 1.  Click on the Facebook icon button");
			
			Assert.assertTrue(facebookIcon.facebookPage.isDisplayed());
		}
}
