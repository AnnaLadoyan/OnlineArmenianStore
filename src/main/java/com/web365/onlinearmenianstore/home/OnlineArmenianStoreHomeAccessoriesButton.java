package com.web365.onlinearmenianstore.home;

import static com.web365.onlinearmenianstore.home.OnlineArmenianStoreHomeConstants.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.onlinearmenianstore.page.base.OnlineArmenianStoreBasePage;

public class OnlineArmenianStoreHomeAccessoriesButton extends OnlineArmenianStoreBasePage {
	
	public OnlineArmenianStoreHomeAccessoriesButton(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = ACCESSORIES_BUTTON_XPATH)
	public WebElement accessoriesButton;

	@FindBy(xpath = ACCESSORIES_PAGE_XPATH)
	public WebElement accessoriesPage;

	public OnlineArmenianStoreHomeAccessoriesButton accessoriesButton() {
		accessoriesButton.click();
		return new OnlineArmenianStoreHomeAccessoriesButton(this.driver);
	}


}
