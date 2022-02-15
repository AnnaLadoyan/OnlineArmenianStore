package com.web365.onlinearmenianstore.page.foodandbeverages;

import static com.web365.onlinearmenianstore.page.foodandbeverages.OnlineArmenianStoreFilterConstants.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.onlinearmenianstore.page.base.OnlineArmenianStoreBasePage;


public class OnlineArmenianStoreFilterFeatured extends OnlineArmenianStoreBasePage {
	
	public OnlineArmenianStoreFilterFeatured(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = FOOD_AND_BEVERAGES_XPATH)
	public WebElement foodAndBeverages;

	@FindBy(xpath = SORT_BY_XPATH)
	public WebElement sortBy;

	@FindBy(xpath = FEATURED_XPATH)
	public WebElement featured;

	@FindBy(xpath = SORT_BY_FEATURED_XPATH)
	public WebElement sortByFeatured;

	public OnlineArmenianStoreFilterFeatured  foodAndBeverages() {
		foodAndBeverages.click();
		return new OnlineArmenianStoreFilterFeatured(this.driver);
	}

	public OnlineArmenianStoreFilterFeatured sortBy() {
		sortBy.click();
		return new OnlineArmenianStoreFilterFeatured(this.driver);
	}

	public OnlineArmenianStoreFilterFeatured featured() {
		featured.click();
		return new OnlineArmenianStoreFilterFeatured(this.driver);
	}


}
