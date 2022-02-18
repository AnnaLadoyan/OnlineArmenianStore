package com.web365.onlinearmenianstore.home;

import static com.web365.onlinearmenianstore.home.OnlineArmenianStoreHomeConstants.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.onlinearmenianstore.page.base.OnlineArmenianStoreBasePage;

public class OnlineArmenianStoreHomeAboutUsButton extends OnlineArmenianStoreBasePage{
	
	public OnlineArmenianStoreHomeAboutUsButton(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = ABOUT_US_BUTTON_XPATH)
	public WebElement aboutUsButton;

	@FindBy(xpath = ABOUT_US_PAGE_XPATH)
	public WebElement aboutUsPage;

	public OnlineArmenianStoreHomeAboutUsButton aboutUsButton() {
		aboutUsButton.click();
		return new OnlineArmenianStoreHomeAboutUsButton(this.driver);
	}

}
