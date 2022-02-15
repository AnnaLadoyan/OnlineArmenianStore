package com.web365.onlinearmenianstore.page.foodandbeverages;

import static com.web365.onlinearmenianstore.page.foodandbeverages.OnlineArmenianStoreFilterConstants.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.onlinearmenianstore.page.base.OnlineArmenianStoreBasePage;

public class OnlineArmenianStoreFilterPriceHighToLow extends OnlineArmenianStoreBasePage {

	public OnlineArmenianStoreFilterPriceHighToLow(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = FOOD_AND_BEVERAGES_XPATH)
	public WebElement foodAndBeverages;

	@FindBy(xpath = SORT_BY_XPATH)
	public WebElement sortBy;

	@FindBy(xpath = PRICE_HIGH_TO_LOW_XPATH)
	public WebElement priceHighToLow;

	@FindBy(xpath = SORT_BY_PRICE_HIGH_TO_LOW_XPATH)
	public WebElement sortByPriceHighToLow;

	public OnlineArmenianStoreFilterPriceHighToLow foodAndBeverages() {
		foodAndBeverages.click();
		return new OnlineArmenianStoreFilterPriceHighToLow(this.driver);
	}

	public OnlineArmenianStoreFilterPriceHighToLow sortBy() {
		sortBy.click();
		return new OnlineArmenianStoreFilterPriceHighToLow(this.driver);
	}

	public OnlineArmenianStoreFilterPriceHighToLow priceHighToLow() {
		priceHighToLow.click();
		return new OnlineArmenianStoreFilterPriceHighToLow(this.driver);
	}

}
