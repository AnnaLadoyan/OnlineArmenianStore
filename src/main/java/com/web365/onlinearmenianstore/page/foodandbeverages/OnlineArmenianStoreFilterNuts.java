package com.web365.onlinearmenianstore.page.foodandbeverages;

import static com.web365.onlinearmenianstore.page.foodandbeverages.OnlineArmenianStoreFilterConstants.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.onlinearmenianstore.page.base.OnlineArmenianStoreBasePage;

public class OnlineArmenianStoreFilterNuts extends OnlineArmenianStoreBasePage {
	
	public OnlineArmenianStoreFilterNuts(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = FOOD_AND_BEVERAGES_XPATH)
	public WebElement foodAndBeverages;

	@FindBy(xpath = NUTS_BUTTON_XPATH)
	public WebElement nutsButton;

	@FindBy(xpath = NUTS_PAGE_XPATH)
	public WebElement nutsPage;

	public OnlineArmenianStoreFilterNuts foodAndBeverages() {
		foodAndBeverages.click();
		return new OnlineArmenianStoreFilterNuts(this.driver);
	}

	public OnlineArmenianStoreFilterNuts nutsButton() {
		nutsButton.click();
		return new OnlineArmenianStoreFilterNuts(this.driver);
	}


}
