package com.web365.onlinearmenianstore.home;

import static com.web365.onlinearmenianstore.home.OnlineArmenianStoreHomeConstants.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.onlinearmenianstore.page.base.OnlineArmenianStoreBasePage;

public class OnlineArmenianStoreHomeToysAndGamesButton extends OnlineArmenianStoreBasePage {
	
	public OnlineArmenianStoreHomeToysAndGamesButton(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = TOYS_AND_GAMES_BUTTON_XPATH)
	public WebElement toysAnadGamesButton;
	
	@FindBy(xpath = TOYS_AND_GAMES_PAGE_XPATH)
	public WebElement toysAnadGamesPage;

	
	public OnlineArmenianStoreHomeToysAndGamesButton toysAnadGamesButton() {
		toysAnadGamesButton.click();
		return new OnlineArmenianStoreHomeToysAndGamesButton(this.driver);
	}

}
