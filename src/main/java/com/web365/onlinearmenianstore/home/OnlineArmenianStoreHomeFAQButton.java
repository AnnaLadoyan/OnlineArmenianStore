package com.web365.onlinearmenianstore.home;

import static com.web365.onlinearmenianstore.home.OnlineArmenianStoreHomeConstants.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.onlinearmenianstore.page.base.OnlineArmenianStoreBasePage;

public class OnlineArmenianStoreHomeFAQButton extends OnlineArmenianStoreBasePage {
	
	public OnlineArmenianStoreHomeFAQButton(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = FAQ_BUTTON_XPATH)
	public WebElement FAQButton;

	@FindBy(xpath = FAQ_PAGE_XPATH)
	public WebElement FAQPage;

	public OnlineArmenianStoreHomeFAQButton FAQButton() {
		FAQButton.click();
		return new OnlineArmenianStoreHomeFAQButton(this.driver);
	}


}
