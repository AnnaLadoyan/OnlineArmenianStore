package com.web365.onlinearmenianstore.home;

import static com.web365.onlinearmenianstore.home.OnlineArmenianStoreHomeConstants.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.onlinearmenianstore.page.base.OnlineArmenianStoreBasePage;

public class OnlineArmenianStoreHomeViewAllButton extends OnlineArmenianStoreBasePage{
	
	public OnlineArmenianStoreHomeViewAllButton(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = VIEW_ALL_BUTTON_XPATH)
	public WebElement viewAllButton;

	@FindBy(xpath = VIEW_ALL_PAGE_XPATH)
	public WebElement viewAllPage;

	public OnlineArmenianStoreHomeViewAllButton viewAllButton() {
		viewAllButton.click();
		return new OnlineArmenianStoreHomeViewAllButton(this.driver);
	}

}
