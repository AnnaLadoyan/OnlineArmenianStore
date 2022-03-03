package com.web365.onlinearmenianstore.page.foodandbeverages;

import static com.web365.onlinearmenianstore.page.foodandbeverages.OnlineArmenianStoreFilterConstants.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.onlinearmenianstore.page.base.OnlineArmenianStoreBasePage;

public class OnlineArmenianStoreFilterTea extends OnlineArmenianStoreBasePage {
	
	public OnlineArmenianStoreFilterTea(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = FOOD_AND_BEVERAGES_XPATH)
	public WebElement foodAndBeverages;

	@FindBy(xpath = TEA_BUTTON_XPATH)
	public WebElement teaButton;

	@FindBy(xpath = TEA_PAGE_XPATH)
	public WebElement teaPage;

	public OnlineArmenianStoreFilterTea foodAndBeverages() {
		foodAndBeverages.click();
		return new OnlineArmenianStoreFilterTea(this.driver);
	}

	public OnlineArmenianStoreFilterTea teaButton() {
		teaButton.click();
		return new OnlineArmenianStoreFilterTea(this.driver);
	}



}
