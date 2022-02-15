package com.web365.onlinearmenianstore.home;

import static com.web365.onlinearmenianstore.home.OnlineArmenianStoreHomeConstants.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.onlinearmenianstore.page.base.OnlineArmenianStoreBasePage;

public class OnlineArmenianStoreHomeClothingJewelryAndAccessoriesButton extends OnlineArmenianStoreBasePage{
	
	public OnlineArmenianStoreHomeClothingJewelryAndAccessoriesButton(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = CLOTHING_JEWELRY_AND_ACCESSORIES_BUTTON_XPATH)
	public WebElement clothingJewelryAndAccessoriesbutton;
	
	@FindBy(xpath =  CLOTHING_JEWELRY_AND_ACCESSORIES_PAGE_XPATH)
	public WebElement clothingJewelryAndAccessoriesPage;

	
	public OnlineArmenianStoreHomeClothingJewelryAndAccessoriesButton clothingJewelryAndAccessoriesbutton() {
		clothingJewelryAndAccessoriesbutton.click();
		return new OnlineArmenianStoreHomeClothingJewelryAndAccessoriesButton(this.driver);
	}

}
