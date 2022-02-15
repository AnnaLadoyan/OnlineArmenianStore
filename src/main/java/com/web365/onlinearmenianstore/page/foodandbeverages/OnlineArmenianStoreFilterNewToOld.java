package com.web365.onlinearmenianstore.page.foodandbeverages;

import static com.web365.onlinearmenianstore.page.foodandbeverages.OnlineArmenianStoreFilterConstants.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.onlinearmenianstore.page.base.OnlineArmenianStoreBasePage;

public class OnlineArmenianStoreFilterNewToOld extends OnlineArmenianStoreBasePage {
	

	public OnlineArmenianStoreFilterNewToOld(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = FOOD_AND_BEVERAGES_XPATH)
	public WebElement foodAndBeverages;

	@FindBy(xpath = SORT_BY_XPATH)
	public WebElement sortBy;

	@FindBy(xpath = NEW_TO_OLD_XPATH)
	public WebElement newToOld;

	@FindBy(xpath = SORT_BY_NEW_TO_OLD_XPATH)
	public WebElement sortByNewToOld;

	public OnlineArmenianStoreFilterNewToOld  foodAndBeverages() {
		foodAndBeverages.click();
		return new OnlineArmenianStoreFilterNewToOld(this.driver);
	}

	public OnlineArmenianStoreFilterNewToOld sortBy() {
		sortBy.click();
		return new OnlineArmenianStoreFilterNewToOld(this.driver);
	}

	public OnlineArmenianStoreFilterNewToOld newToOld() {
		newToOld.click();
		return new OnlineArmenianStoreFilterNewToOld(this.driver);
	}




}
