package com.web365.onlinearmenianstore.home;

import static com.web365.onlinearmenianstore.home.OnlineArmenianStoreHomeConstants.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.onlinearmenianstore.page.base.OnlineArmenianStoreBasePage;

public class OnlineArmenianStoreHomeNewArrivalsButton extends OnlineArmenianStoreBasePage {
	
	public OnlineArmenianStoreHomeNewArrivalsButton(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = NEW_ARRIVALS_BUTTON_XPATH)
	public WebElement newArrivalsButton;
	
	@FindBy(xpath = NEW_ARRIVALS_PAGE_XPATH )
	public WebElement newArrivalsPage;

	
	public OnlineArmenianStoreHomeNewArrivalsButton newArrivalsButton() {
		newArrivalsButton.click();
		return new OnlineArmenianStoreHomeNewArrivalsButton(this.driver);
	}

}
