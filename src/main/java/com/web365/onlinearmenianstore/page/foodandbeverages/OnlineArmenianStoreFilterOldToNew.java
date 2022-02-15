package com.web365.onlinearmenianstore.page.foodandbeverages;

import static com.web365.onlinearmenianstore.page.foodandbeverages.OnlineArmenianStoreFilterConstants.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.onlinearmenianstore.page.base.OnlineArmenianStoreBasePage;

public class OnlineArmenianStoreFilterOldToNew extends OnlineArmenianStoreBasePage {
	
	public OnlineArmenianStoreFilterOldToNew(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = FOOD_AND_BEVERAGES_XPATH)
	public WebElement foodAndBeverages;

	@FindBy(xpath = SORT_BY_XPATH)
	public WebElement sortBy;

	@FindBy(xpath = OLD_TO_NEW_XPATH)
	public WebElement oldToNew;

	@FindBy(xpath = SORT_BY_OLD_TO_NEW_XPATH)
	public WebElement sortByOldTonew;

	public OnlineArmenianStoreFilterOldToNew  foodAndBeverages() {
		foodAndBeverages.click();
		return new OnlineArmenianStoreFilterOldToNew(this.driver);
	}

	public OnlineArmenianStoreFilterOldToNew sortBy() {
		sortBy.click();
		return new OnlineArmenianStoreFilterOldToNew(this.driver);
	}

	public OnlineArmenianStoreFilterOldToNew oldToNew() {
		oldToNew.click();
		return new OnlineArmenianStoreFilterOldToNew(this.driver);
	}





}
