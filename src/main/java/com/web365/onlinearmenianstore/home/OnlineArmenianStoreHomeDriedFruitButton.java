package com.web365.onlinearmenianstore.home;

import static com.web365.onlinearmenianstore.home.OnlineArmenianStoreHomeConstants.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.onlinearmenianstore.page.base.OnlineArmenianStoreBasePage;

public class OnlineArmenianStoreHomeDriedFruitButton extends OnlineArmenianStoreBasePage{
	
	public OnlineArmenianStoreHomeDriedFruitButton(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = DRIED_FRUIT_BUTTON_XPATH)
	public WebElement driedFruitButton;

	@FindBy(xpath = DRIED_FRUIT_PAGE_XPATH)
	public WebElement driedFruitPage;

	public OnlineArmenianStoreHomeDriedFruitButton driedFruitButton() {
		driedFruitButton.click();
		return new OnlineArmenianStoreHomeDriedFruitButton(this.driver);
	}




}
