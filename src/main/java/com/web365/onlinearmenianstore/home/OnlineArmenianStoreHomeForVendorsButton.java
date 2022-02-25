package com.web365.onlinearmenianstore.home;

import static com.web365.onlinearmenianstore.home.OnlineArmenianStoreHomeConstants.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.onlinearmenianstore.page.base.OnlineArmenianStoreBasePage;

public class OnlineArmenianStoreHomeForVendorsButton extends OnlineArmenianStoreBasePage {
	
	public OnlineArmenianStoreHomeForVendorsButton(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = FOR_VENDORS_BUTTON_XPATH)
	public WebElement forVendorsButton;

	@FindBy(xpath = FOR_VENDORS_PAGE_XPATH)
	public WebElement forVendorsPage;

	public OnlineArmenianStoreHomeForVendorsButton forVendorsButton() {
		forVendorsButton.click();
		return new OnlineArmenianStoreHomeForVendorsButton(this.driver);
	}


}
