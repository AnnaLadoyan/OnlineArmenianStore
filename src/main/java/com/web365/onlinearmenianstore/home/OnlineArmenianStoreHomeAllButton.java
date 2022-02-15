package com.web365.onlinearmenianstore.home;

import static com.web365.onlinearmenianstore.home.OnlineArmenianStoreHomeConstants.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.onlinearmenianstore.page.base.OnlineArmenianStoreBasePage;

public class OnlineArmenianStoreHomeAllButton extends OnlineArmenianStoreBasePage {
	
	public OnlineArmenianStoreHomeAllButton(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = ALL_BUTTON_XPATH)
	public WebElement allButton;
	
	@FindBy(xpath = ALL_PAGE_XPATH)
	public WebElement allPage;

	
	public OnlineArmenianStoreHomeAllButton allButton() {
		allButton.click();
		return new OnlineArmenianStoreHomeAllButton(this.driver);
	}

	



}
