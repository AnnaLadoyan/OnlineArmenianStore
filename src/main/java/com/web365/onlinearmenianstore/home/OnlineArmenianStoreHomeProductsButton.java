package com.web365.onlinearmenianstore.home;

import static com.web365.onlinearmenianstore.home.OnlineArmenianStoreHomeConstants.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.onlinearmenianstore.page.base.OnlineArmenianStoreBasePage;

public class OnlineArmenianStoreHomeProductsButton extends OnlineArmenianStoreBasePage {
	
	public OnlineArmenianStoreHomeProductsButton(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = HOME_PRODUCTS_BUTTON_XPATH)
	public WebElement homeProductsButton;
	
	@FindBy(xpath = HOME_PRODUCTS_PAGE_XPATH)
	public WebElement homeProductsPage;

	
	public OnlineArmenianStoreHomeProductsButton homeProductsButton() {
		homeProductsButton.click();
		return new OnlineArmenianStoreHomeProductsButton(this.driver);
	}

}
