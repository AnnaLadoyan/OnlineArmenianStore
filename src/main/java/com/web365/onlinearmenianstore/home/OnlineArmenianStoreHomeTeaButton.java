package com.web365.onlinearmenianstore.home;

import static com.web365.onlinearmenianstore.home.OnlineArmenianStoreHomeConstants.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.onlinearmenianstore.page.base.OnlineArmenianStoreBasePage;

public class OnlineArmenianStoreHomeTeaButton extends OnlineArmenianStoreBasePage {
	
	public OnlineArmenianStoreHomeTeaButton(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = TEA_BUTTON_XPATH)
	public WebElement teaButton;

	@FindBy(xpath = TEA_PAGE_XPATH)
	public WebElement teaPage;

	public OnlineArmenianStoreHomeTeaButton teaButton() {
		teaButton.click();
		return new OnlineArmenianStoreHomeTeaButton(this.driver);
	}



}
