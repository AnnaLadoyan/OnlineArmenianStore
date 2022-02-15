package com.web365.onlinearmenianstore.home;

import static com.web365.onlinearmenianstore.home.OnlineArmenianStoreHomeConstants.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.onlinearmenianstore.page.base.OnlineArmenianStoreBasePage;

public class OnlineArmenianStoreHomeJewelryButton extends OnlineArmenianStoreBasePage {
	
	public OnlineArmenianStoreHomeJewelryButton(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = JEWELRY_BUTTON_XPATH)
	public WebElement jewelryButton;
	
	@FindBy(xpath = JEWELRY_PAGE_XPATH)
	public WebElement jewelryPage;

	
	public OnlineArmenianStoreHomeJewelryButton jewelryButton() {
		jewelryButton.click();
		return new OnlineArmenianStoreHomeJewelryButton(this.driver);
	}

}
