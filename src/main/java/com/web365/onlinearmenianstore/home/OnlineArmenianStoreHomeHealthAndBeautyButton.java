package com.web365.onlinearmenianstore.home;

import static com.web365.onlinearmenianstore.home.OnlineArmenianStoreHomeConstants.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.onlinearmenianstore.page.base.OnlineArmenianStoreBasePage;

public class OnlineArmenianStoreHomeHealthAndBeautyButton extends OnlineArmenianStoreBasePage {
	
	public OnlineArmenianStoreHomeHealthAndBeautyButton(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = HEALTH_AND_BEAUTY_BUTTON_XPATH)
	public WebElement healthAndBeautyButton;
	
	@FindBy(xpath = HEALTH_AND_BEAUTY_PAGE_XPATH)
	public WebElement healthAndBeautyPage;

	
	public OnlineArmenianStoreHomeHealthAndBeautyButton healthAndBeautyButton() {
		healthAndBeautyButton.click();
		return new OnlineArmenianStoreHomeHealthAndBeautyButton(this.driver);
	}


}
