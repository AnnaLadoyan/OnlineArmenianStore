package com.web365.onlinearmenianstore.home;

import static com.web365.onlinearmenianstore.home.OnlineArmenianStoreHomeConstants.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.onlinearmenianstore.page.base.OnlineArmenianStoreBasePage;

public class OnlineArmenianStoreHomeFacebookIcon extends OnlineArmenianStoreBasePage{
	
	public OnlineArmenianStoreHomeFacebookIcon(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = FACEBOOK_BUTTON_XPATH)
	public WebElement facebookButton;

	@FindBy(xpath = FACEBOOK_PAGE_XPATH)
	public WebElement facebookPage;

	public OnlineArmenianStoreHomeFacebookIcon facebookButton() {
		facebookButton.click();
		return new OnlineArmenianStoreHomeFacebookIcon(this.driver);
	}



}
