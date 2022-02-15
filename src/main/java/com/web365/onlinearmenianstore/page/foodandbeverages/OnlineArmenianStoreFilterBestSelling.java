package com.web365.onlinearmenianstore.page.foodandbeverages;

import static com.web365.onlinearmenianstore.page.foodandbeverages.OnlineArmenianStoreFilterConstants.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.onlinearmenianstore.page.base.OnlineArmenianStoreBasePage;

public class OnlineArmenianStoreFilterBestSelling extends OnlineArmenianStoreBasePage {
	

	public OnlineArmenianStoreFilterBestSelling(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = FOOD_AND_BEVERAGES_XPATH)
	public WebElement foodAndBeverages;

	@FindBy(xpath = SORT_BY_XPATH)
	public WebElement sortBy;

	@FindBy(xpath = BEST_SELLING_XPATH)
	public WebElement bestSelling;

	@FindBy(xpath = SORT_BY_BEST_SELLING_XPATH)
	public WebElement sortByBestSelling;

	public OnlineArmenianStoreFilterBestSelling  foodAndBeverages() {
		foodAndBeverages.click();
		return new OnlineArmenianStoreFilterBestSelling(this.driver);
	}

	public OnlineArmenianStoreFilterBestSelling sortBy() {
		sortBy.click();
		return new OnlineArmenianStoreFilterBestSelling(this.driver);
	}

	public OnlineArmenianStoreFilterBestSelling bestSelling() {
		bestSelling.click();
		return new OnlineArmenianStoreFilterBestSelling(this.driver);
	}



}
