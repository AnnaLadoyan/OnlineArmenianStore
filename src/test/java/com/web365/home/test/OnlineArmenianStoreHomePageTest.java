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
import com.web365.onlinearmenianstore.home.OnlineArmenianStoreHomeInstagramIcon;
import com.web365.onlinearmenianstore.home.OnlineArmenianStoreHomeJewelryButton;
import com.web365.onlinearmenianstore.home.OnlineArmenianStoreHomeKitchenAndDiningButton;
import com.web365.onlinearmenianstore.home.OnlineArmenianStoreHomeNewArrivalsButton;
import com.web365.onlinearmenianstore.home.OnlineArmenianStoreHomeOnSaleItemsButton;
import com.web365.onlinearmenianstore.home.OnlineArmenianStoreHomePage;
import com.web365.onlinearmenianstore.home.OnlineArmenianStoreHomePinterestIcon;
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
		OnlineArmenianStoreHomePage home = new OnlineArmenianStoreHomePage(driver);
		System.out.println("Navigate to onlinearmenianstore.com");
		home = home.oasLogo();
		System.out.println("Step 1. Click the 'About Us' button");
		home = home.oasLogo();
		System.out.println("Step 2.  Click the OnlineArmenianStore logo in the top left corner of the website");

		Assert.assertTrue(home.homePage.isDisplayed());
	}
		
		@Test
		public void testAllButton() throws InterruptedException {
			System.out.println("Test Case ID Home2");
			System.out.println("Verify 'All' page is displayed when the button is clicked ");
			OnlineArmenianStoreHomeAllButton home = new OnlineArmenianStoreHomeAllButton(driver);
			System.out.println("Navigate to onlinearmenianstore.com");
			home = home.allButton();
			System.out.println("Step 1. Click on the 'All' button");
			
			Assert.assertTrue(home.allPage.isDisplayed());
	
	}
		
		@Test
		public void testBooksButton() throws InterruptedException {
			System.out.println("Test Case ID Home3");
			System.out.println("Verify 'Books' page is displayed when the button is clicked  ");
			OnlineArmenianStoreHomeBooksButton home = new OnlineArmenianStoreHomeBooksButton(driver);
			System.out.println("Navigate to onlinearmenianstore.com");
			home = home.booksButton();
			System.out.println("Step 1. Click on the 'Books' button");
			
			Assert.assertTrue(home.booksPage.isDisplayed());
		}

		@Test
		public void testFoodAndBeveragesButton() throws InterruptedException {
			System.out.println("Test Case ID Home4");
			System.out.println("Verify 'Food and Beverages' page is displayed when the button is clicked   ");
			OnlineArmenianStoreHomeFoodAndBeveragesButton home = new OnlineArmenianStoreHomeFoodAndBeveragesButton(driver);
			System.out.println("Navigate to onlinearmenianstore.com");
			home = home.foodAndBeveragesButton();
			System.out.println("Step 1. Click on the 'Food and Beverages' button");
			
			Assert.assertTrue(home.foodAndBeveragesPage.isDisplayed());
		}
		
		@Test
		public void testClothingJewelryAndAccessoriesButton() throws InterruptedException {
			System.out.println("Test Case ID Home5");
			System.out.println("Verify 'Clothing, Jewelry, and Accessories' page is displayed when the button is clicked  ");
			OnlineArmenianStoreHomeClothingJewelryAndAccessoriesButton home = new OnlineArmenianStoreHomeClothingJewelryAndAccessoriesButton(driver);
			System.out.println("Navigate to onlinearmenianstore.com");
			home = home.clothingJewelryAndAccessoriesbutton();
			System.out.println("Step 1. Click on the 'Clothing, Jewelry, and Accessories' button");
			
			Assert.assertTrue(home.clothingJewelryAndAccessoriesPage.isDisplayed());
		}

		@Test
		public void testToysAndGamesButton() throws InterruptedException {
			System.out.println("Test Case ID Home6");
			System.out.println("Verify 'Toys and Games' page is displayed when the button is clicked  ");
			OnlineArmenianStoreHomeToysAndGamesButton home = new OnlineArmenianStoreHomeToysAndGamesButton(driver);
			System.out.println("Navigate to onlinearmenianstore.com");
			home = home.toysAnadGamesButton();
			System.out.println("Step 1. Click on the 'Toys and Games' buttonss");
			
			Assert.assertTrue(home.toysAnadGamesPage.isDisplayed());
		}

		@Test
		public void testHealthAndBeautyButton() throws InterruptedException {
			System.out.println("Test Case ID Home7");
			System.out.println("Verify 'Health and Beauty' page is displayed when the button is clicked   ");
			OnlineArmenianStoreHomeHealthAndBeautyButton home = new OnlineArmenianStoreHomeHealthAndBeautyButton(driver);
			System.out.println("Navigate to onlinearmenianstore.com");
			home = home.healthAndBeautyButton();
			System.out.println("Step 1. Click on the 'Health and Beauty' button");
			
			Assert.assertTrue(home.healthAndBeautyPage.isDisplayed());
		}
		
		@Test
		public void testHomeProductsButton() throws InterruptedException {
			System.out.println("Test Case ID Home8");
			System.out.println("Verify 'Home Products' page is displayed when the button is clicked   ");
			OnlineArmenianStoreHomeProductsButton home = new OnlineArmenianStoreHomeProductsButton(driver);
			System.out.println("Navigate to onlinearmenianstore.com");
			home = home.homeProductsButton();
			System.out.println("Step 1. Click on the 'Home Products' button");
			
			Assert.assertTrue(home.homeProductsPage.isDisplayed());
		}

		@Test
		public void testNewArrivalsButton() throws InterruptedException {
			System.out.println("Test Case ID Home9");
			System.out.println("Verify 'New Arrivals' page is displayed when the button is clicked   ");
			OnlineArmenianStoreHomeNewArrivalsButton home = new OnlineArmenianStoreHomeNewArrivalsButton(driver);
			System.out.println("Navigate to onlinearmenianstore.com");
			home = home.newArrivalsButton();
			System.out.println("Step 1. Click on the 'New Arrivals' button");
			
			Assert.assertTrue(home.newArrivalsPage.isDisplayed());
		}

		@Test
		public void testOnSaleItemButton() throws InterruptedException {
			System.out.println("Test Case ID Home10");
			System.out.println("Verify 'On Sale Items' page is displayed when the button is clicked    ");
			OnlineArmenianStoreHomeOnSaleItemsButton home = new OnlineArmenianStoreHomeOnSaleItemsButton(driver);
			System.out.println("Navigate to onlinearmenianstore.com");
			home = home.onSaleItemButton();
			System.out.println("Step 1.  Click on the 'On Sale Items' button");
			
			Assert.assertTrue(home.onSaleItemPage.isDisplayed());
		}
		
		@Test
		public void testJewelryButton() throws InterruptedException {
			System.out.println("Test Case ID Home11");
			System.out.println("Verify 'Jewelry' page is displayed when the button is clicked    ");
			OnlineArmenianStoreHomeJewelryButton home = new OnlineArmenianStoreHomeJewelryButton(driver);
			System.out.println("Navigate to onlinearmenianstore.com");
			home = home.jewelryButton();
			System.out.println("Step 1. Click on the 'Jewelry' button");
			
			Assert.assertTrue(home.jewelryPage.isDisplayed());
		}
		
		@Test
		public void testKitchenAndDiningButton() throws InterruptedException {
			System.out.println("Test Case ID Home12");
			System.out.println("Verify 'Kitchen and Dining' page is displayed when the button is clicked    ");
			OnlineArmenianStoreHomeKitchenAndDiningButton home = new OnlineArmenianStoreHomeKitchenAndDiningButton(driver);
			System.out.println("Navigate to onlinearmenianstore.com");
			home = home.kitchenAndDiningButton();
			System.out.println("Step 1. Click on the 'Kitchen and Dining' button");
			
			Assert.assertTrue(home.kitchenAndDiningPage.isDisplayed());
		}


		@Test
		public void testAccessoriesButton() throws InterruptedException {
			System.out.println("Test Case ID Home13");
			System.out.println("Verify 'Accessories' page is displayed when the button is clicked    ");
			OnlineArmenianStoreHomeAccessoriesButton home = new OnlineArmenianStoreHomeAccessoriesButton(driver);
			System.out.println("Navigate to onlinearmenianstore.com");
			home = home.accessoriesButton();
			System.out.println("Step 1. Click on the 'Accessories' button");
			
			Assert.assertTrue(home.accessoriesPage.isDisplayed());
		}

		@Test
		public void testTeaButton() throws InterruptedException {
			System.out.println("Test Case ID Home14");
			System.out.println("Verify 'Tea' page is displayed when the button is clicked     ");
			OnlineArmenianStoreHomeTeaButton home = new OnlineArmenianStoreHomeTeaButton(driver);
			System.out.println("Navigate to onlinearmenianstore.com");
			home = home.teaButton();
			System.out.println("Step 1. Click on the 'Tea' button");
			
			Assert.assertTrue(home.teaPage.isDisplayed());
		}

		@Test
		public void testDriedFruitButton() throws InterruptedException {
			System.out.println("Test Case ID Home15");
			System.out.println("Verify 'Dried Fruit' page is displayed when the button is clicked    ");
			OnlineArmenianStoreHomeDriedFruitButton home = new OnlineArmenianStoreHomeDriedFruitButton(driver);
			System.out.println("Navigate to onlinearmenianstore.com");
			home = home.driedFruitButton();
			System.out.println("Step 1. Click on the 'Dried Fruit' button");
			
			Assert.assertTrue(home.driedFruitPage.isDisplayed());
		}

		@Test
		public void testAboutUsButton() throws InterruptedException {
			System.out.println("Test Case ID Home16");
			System.out.println("Verify 'About Us' page is displayed when the button is clicked    ");
			OnlineArmenianStoreHomeAboutUsButton home = new OnlineArmenianStoreHomeAboutUsButton(driver);
			System.out.println("Navigate to onlinearmenianstore.com");
			home = home.aboutUsButton();
			System.out.println("Step 1. Click on the 'About Us' button");
			
			Assert.assertTrue(home.aboutUsPage.isDisplayed());
		}
		
		@Test
		public void testContactUsButton() throws InterruptedException {
			System.out.println("Test Case ID Home17");
			System.out.println("Verify 'Contact Us' page is displayed when the button is clicked     ");
			OnlineArmenianStoreHomeContactUsButton home = new OnlineArmenianStoreHomeContactUsButton(driver);
			System.out.println("Navigate to onlinearmenianstore.com");
			home = home.contactUsButton();
			System.out.println("Step 1.  Click on the 'Contact Us' button");
			
			Assert.assertTrue(home.contactUsPage.isDisplayed());
		}

		@Test
		public void testPrivacyAndPolicyButton() throws InterruptedException {
			System.out.println("Test Case ID Home18");
			System.out.println("Verify 'Privacy Policy' page is displayed when the button is clicked     ");
			OnlineArmenianStoreHomePrivacyAndPolicyButton home = new OnlineArmenianStoreHomePrivacyAndPolicyButton(driver);
			System.out.println("Navigate to onlinearmenianstore.com");
			home = home.privacyAndPolicyButton();
			System.out.println("Step 1. Click on the 'Privacy Policy' button");
			
			Assert.assertTrue(home.privacyAndPolicyPage.isDisplayed());
		}
		
		@Test
		public void testTermsOfServiceButton() throws InterruptedException {
			System.out.println("Test Case ID Home19");
			System.out.println("Verify 'Terms of Service' page is displayed when the button is clicked     ");
			OnlineArmenianStoreHomeTermsOfServiceButton home = new OnlineArmenianStoreHomeTermsOfServiceButton(driver);
			System.out.println("Navigate to onlinearmenianstore.com");
			home = home.termsOfServiceButton();
			System.out.println("Step 1. Click on the 'Terms of Service' button");
			
			Assert.assertTrue(home.termsOfServicePage.isDisplayed());
		}


		@Test
		public void testShippingPolicyButton() throws InterruptedException {
			System.out.println("Test Case ID Home20");
			System.out.println("Verify 'Shipping Policy' page is displayed when the button is clicked     ");
			OnlineArmenianStoreHomeShippingPolicyButton home = new OnlineArmenianStoreHomeShippingPolicyButton(driver);
			System.out.println("Navigate to onlinearmenianstore.com");
			home = home.shippingPolicyButton();
			System.out.println("Step 1. Click on the 'Shipping Policy' button");
			
			Assert.assertTrue(home.shippingPolicyPage.isDisplayed());
		}

		@Test
		public void testRefundPolicyButton() throws InterruptedException {
			System.out.println("Test Case ID Home21");
			System.out.println("Verify 'Refund Policy' page is displayed when the button is clicked");
			OnlineArmenianStoreHomeRefundPolicyButton home = new OnlineArmenianStoreHomeRefundPolicyButton(driver);
			System.out.println("Navigate to onlinearmenianstore.com");
			home = home.refundPolicyButton();
			System.out.println("Step 1.  Click on the 'Refund Policy' button");
			
			Assert.assertTrue(home.refundPolicyPage.isDisplayed());
		}
		
		@Test
		public void testFAQButton() throws InterruptedException {
			System.out.println("Test Case ID Home22");
			System.out.println("Verify 'FAQ' page is displayed when the button is clicked ");
			OnlineArmenianStoreHomeFAQButton home = new OnlineArmenianStoreHomeFAQButton(driver);
			System.out.println("Navigate to onlinearmenianstore.com");
			home = home.FAQButton();
			System.out.println("Step 1.  Click on the 'FAQ' button");
			
			Assert.assertTrue(home.FAQPage.isDisplayed());
		}
		
		@Test
		public void testForVendorsButton() throws InterruptedException {
			System.out.println("Test Case ID Home23");
			System.out.println("Verify 'For Vendors' page is displayed when the button is clicked  ");
			OnlineArmenianStoreHomeForVendorsButton home = new OnlineArmenianStoreHomeForVendorsButton(driver);
			System.out.println("Navigate to onlinearmenianstore.com");
			home = home.forVendorsButton();
			System.out.println("Step 1.   Click on the 'For Vendors' button");
			
			Assert.assertTrue(home.forVendorsPage.isDisplayed());
		}
		
		@Test
		public void testViewAllButton() throws InterruptedException {
			System.out.println("Test Case ID Home24");
			System.out.println("Verify 'View All' page is displayed when the button is clicked  ");
			OnlineArmenianStoreHomeViewAllButton home = new OnlineArmenianStoreHomeViewAllButton(driver);		
			System.out.println("Navigate to onlinearmenianstore.com");
			home = home.viewAllButton();
			System.out.println("Step 1. Click on the 'View All' button");
			
			Assert.assertTrue(home.viewAllPage.isDisplayed());
		}
		
		@Test
		public void testChatWithUsButton() throws InterruptedException {
			System.out.println("Test Case ID Home25");
			System.out.println("Verify 'Chat With Us' page is displayed when the button is clicked   ");
			OnlineArmenianStoreHomeChatWithUsButton home = new OnlineArmenianStoreHomeChatWithUsButton(driver);		
			System.out.println("Navigate to onlinearmenianstore.com");
			home = home.chatWithUsButton();
			System.out.println("Step 1. Click on the 'Chat With Us' button");
			
			Assert.assertTrue(home.chatWithUsPage.isDisplayed());
		}
		
		@Test
		public void testFacebookIcon() throws InterruptedException {
			System.out.println("Test Case ID Home26");
			System.out.println("Verify Facebook icon is clickable    ");
			OnlineArmenianStoreHomeFacebookIcon home = new OnlineArmenianStoreHomeFacebookIcon(driver);		
			System.out.println("Navigate to onlinearmenianstore.com");
			home = home.facebookIcon();
			System.out.println("Step 1. Click on the Facebook icon button");
			
			Assert.assertTrue(home.facebookPage.isDisplayed());
		}
		
		
		@Test
		public void testInstagramIcon() throws InterruptedException {
			System.out.println("Test Case ID Home27");
			System.out.println("Verify Instagram icon is clickable");
			OnlineArmenianStoreHomeInstagramIcon home = new OnlineArmenianStoreHomeInstagramIcon(driver);		
			System.out.println("Navigate to onlinearmenianstore.com");
			home = home.instagramIcon();
			System.out.println("Step 1. Click on the Instagram icon button");
			
			Assert.assertTrue(home.instagramPage.isDisplayed());
		}
		
		@Test
		public void testPinterestIcon() throws InterruptedException {
			System.out.println("Test Case ID Home28");
			System.out.println("Verify Pinterest icon is clickable");
			OnlineArmenianStoreHomePinterestIcon home = new OnlineArmenianStoreHomePinterestIcon(driver);		
			System.out.println("Navigate to onlinearmenianstore.com");
			home = home.pinterestIcon();
			System.out.println("Step 1. Click on the Pinterest icon button");
			
			Assert.assertTrue(home.pinterestPage.isDisplayed());
		}
}
