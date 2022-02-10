package com.web365.onlinearmenianstore.search;

import static com.web365.onlinearmenianstore.search.OnlineArmenianStoreSearchConstants.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.onlinearmenianstore.page.base.OnlineArmenianStoreBasePage;

public class OnlineArmenianStoreSearchSpecialCharacters extends OnlineArmenianStoreBasePage {
	
	public OnlineArmenianStoreSearchSpecialCharacters(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = SEARCH_FIELD_XPATH)
	public WebElement searchField;
	
	@FindBy(xpath = SEARCH_ICON_XPATH)
	public WebElement searchIcon;

	@FindBy(xpath = PRODUCT_FOR_SPECIAL_CHAR_XPATH)
	public WebElement productForSpecialChar;

	public OnlineArmenianStoreSearchSpecialCharacters searchField() {
		searchField.click();
		return new OnlineArmenianStoreSearchSpecialCharacters(this.driver);
	}

	public OnlineArmenianStoreSearchSpecialCharacters field() {
		searchField.sendKeys("^!$%^@");
		return new OnlineArmenianStoreSearchSpecialCharacters(this.driver);
	}

	public OnlineArmenianStoreSearchSpecialCharacters enter() {
		searchIcon.sendKeys(Keys.ENTER);
		return new OnlineArmenianStoreSearchSpecialCharacters(this.driver);
	}


}
