package com.web365.onlinearmenianstore.home;

import static com.web365.onlinearmenianstore.home.OnlineArmenianStoreHomeConstants.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.onlinearmenianstore.page.base.OnlineArmenianStoreBasePage;

public class OnlineArmenianStoreHomeFoodAndBeveragesButton extends OnlineArmenianStoreBasePage {
	

	public OnlineArmenianStoreHomeFoodAndBeveragesButton(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = FOOD_AND_BEVERAGES_BUTTON_XPATH)
	public WebElement foodAndBeveragesButton;
	
	@FindBy(xpath =  FOOD_AND_BEVERAGES_PAGE_XPATH)
	public WebElement foodAndBeveragesPage;

	
	public OnlineArmenianStoreHomeFoodAndBeveragesButton foodAndBeveragesButton() {
		foodAndBeveragesButton.click();
		return new OnlineArmenianStoreHomeFoodAndBeveragesButton(this.driver);
	}

	


}
