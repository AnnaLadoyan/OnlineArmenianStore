package com.web365.onlinearmenianstore.home;

import static com.web365.onlinearmenianstore.home.OnlineArmenianStoreHomeConstants.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.onlinearmenianstore.page.base.OnlineArmenianStoreBasePage;

public class OnlineArmenianStoreHomeContactUsButton extends OnlineArmenianStoreBasePage {
	
	public OnlineArmenianStoreHomeContactUsButton(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = CONTACT_US_BUTTON_XPATH)
	public WebElement contactUsButton;

	@FindBy(xpath = CONTACT_US_PAGE_XPATH)
	public WebElement contactUsPage;

	public OnlineArmenianStoreHomeContactUsButton contactUsButton() {
		contactUsButton.click();
		return new OnlineArmenianStoreHomeContactUsButton(this.driver);
	}


}
