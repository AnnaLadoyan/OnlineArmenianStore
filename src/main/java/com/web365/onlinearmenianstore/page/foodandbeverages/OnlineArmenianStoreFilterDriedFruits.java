package com.web365.onlinearmenianstore.page.foodandbeverages;

import static com.web365.onlinearmenianstore.page.foodandbeverages.OnlineArmenianStoreFilterConstants.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.onlinearmenianstore.page.base.OnlineArmenianStoreBasePage;

public class OnlineArmenianStoreFilterDriedFruits extends OnlineArmenianStoreBasePage {
	
	public OnlineArmenianStoreFilterDriedFruits(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = FOOD_AND_BEVERAGES_XPATH)
	public WebElement foodAndBeverages;

	@FindBy(xpath = DRIED_FRUIT_BUTTON_XPATH)
	public WebElement driedFruitButton;

	@FindBy(xpath = DRIED_FRUIT_PAGE_XPATH)
	public WebElement driedFruitPage;

	public OnlineArmenianStoreFilterDriedFruits foodAndBeverages() {
		foodAndBeverages.click();
		return new OnlineArmenianStoreFilterDriedFruits(this.driver);
	}

	public OnlineArmenianStoreFilterDriedFruits driedFruitButton() {
		driedFruitButton.click();
		return new OnlineArmenianStoreFilterDriedFruits(this.driver);
	}

}
