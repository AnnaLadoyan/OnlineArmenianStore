package com.web365.onlinearmenianstore.home;

import static com.web365.onlinearmenianstore.home.OnlineArmenianStoreHomeConstants.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.onlinearmenianstore.page.base.OnlineArmenianStoreBasePage;

public class OnlineArmenianStoreHomeOnSaleItemsButton extends OnlineArmenianStoreBasePage {
	
	public OnlineArmenianStoreHomeOnSaleItemsButton(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = ON_SALE_ITEM_BUTTON_XPATH)
	public WebElement onSaleItemButton;
	
	@FindBy(xpath = ON_SALE_ITEM_PAGE_XPATH)
	public WebElement onSaleItemPage;

	
	public OnlineArmenianStoreHomeOnSaleItemsButton onSaleItemButton() {
		onSaleItemButton.click();
		return new OnlineArmenianStoreHomeOnSaleItemsButton(this.driver);
	}

}
