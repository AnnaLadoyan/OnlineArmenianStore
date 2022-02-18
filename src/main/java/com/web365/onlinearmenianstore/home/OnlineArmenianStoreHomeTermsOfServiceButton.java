package com.web365.onlinearmenianstore.home;

import static com.web365.onlinearmenianstore.home.OnlineArmenianStoreHomeConstants.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.onlinearmenianstore.page.base.OnlineArmenianStoreBasePage;

public class OnlineArmenianStoreHomeTermsOfServiceButton extends OnlineArmenianStoreBasePage{
	
	public OnlineArmenianStoreHomeTermsOfServiceButton(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = TERMS_OF_SERVICE_BUTTON_XPATH)
	public WebElement termsOfServiceButton;

	@FindBy(xpath = TERMS_OF_SERVICE_PAGE_XPATH)
	public WebElement termsOfServicePage;

	public OnlineArmenianStoreHomeTermsOfServiceButton termsOfServiceButton() {
		termsOfServiceButton.click();
		return new OnlineArmenianStoreHomeTermsOfServiceButton(this.driver);
	}


}
