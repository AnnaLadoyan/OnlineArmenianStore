package com.web365.onlinearmenianstore.home;

import static com.web365.onlinearmenianstore.home.OnlineArmenianStoreHomeConstants.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.onlinearmenianstore.page.base.OnlineArmenianStoreBasePage;

public class OnlineArmenianStoreHomeKitchenAndDiningButton extends OnlineArmenianStoreBasePage {

	public OnlineArmenianStoreHomeKitchenAndDiningButton(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = KITCHEN_AND_DINING_BUTTON_XPATH)
	public WebElement kitchenAndDiningButton;

	@FindBy(xpath = KITCHEN_AND_DINING_PAGE_XPATH)
	public WebElement kitchenAndDiningPage;

	public OnlineArmenianStoreHomeKitchenAndDiningButton kitchenAndDiningButton() {
		kitchenAndDiningButton.click();
		return new OnlineArmenianStoreHomeKitchenAndDiningButton(this.driver);
	}

}
