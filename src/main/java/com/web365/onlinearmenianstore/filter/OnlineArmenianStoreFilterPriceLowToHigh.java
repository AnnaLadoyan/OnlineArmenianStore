package com.web365.onlinearmenianstore.filter;

import static com.web365.onlinearmenianstore.filter.OnlineArmenianStoreFilterConstants.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.onlinearmenianstore.page.base.OnlineArmenianStoreBasePage;

public class OnlineArmenianStoreFilterPriceLowToHigh extends OnlineArmenianStoreBasePage {

	public OnlineArmenianStoreFilterPriceLowToHigh(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = FOOD_AND_BEVERAGES_XPATH)
	public WebElement foodAndBeverages;

	@FindBy(xpath = SORT_BY_XPATH)
	public WebElement sortBy;

	@FindBy(xpath = PRICE_LOW_TO_HIGH_XPATH)
	public WebElement priceLowToHigh;

	@FindBy(xpath = SORT_BY_PRICE_LOW_TO_HIGH_XPATH)
	public WebElement sortByPriceLowToHigh;

	public OnlineArmenianStoreFilterPriceLowToHigh foodAndBeverages() {
		foodAndBeverages.click();
		return new OnlineArmenianStoreFilterPriceLowToHigh(this.driver);
	}

	public OnlineArmenianStoreFilterPriceLowToHigh sortBy() {
		sortBy.click();
		return new OnlineArmenianStoreFilterPriceLowToHigh(this.driver);
	}

	public OnlineArmenianStoreFilterPriceLowToHigh priceLowToHigh() {
		priceLowToHigh.click();
		return new OnlineArmenianStoreFilterPriceLowToHigh(this.driver);
	}

}
