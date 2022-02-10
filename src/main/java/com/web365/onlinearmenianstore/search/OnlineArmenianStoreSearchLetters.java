package com.web365.onlinearmenianstore.search;

import static com.web365.onlinearmenianstore.search.OnlineArmenianStoreSearchConstants.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.onlinearmenianstore.page.base.OnlineArmenianStoreBasePage;

public class OnlineArmenianStoreSearchLetters extends OnlineArmenianStoreBasePage {

	public OnlineArmenianStoreSearchLetters(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = SEARCH_FIELD_XPATH)
	public WebElement searchField;

	@FindBy(xpath = SEARCH_ICON_XPATH)
	public WebElement searchIcon;

	@FindBy(xpath = PRODUCT_FOR_BOOKS_XPATH)
	public WebElement productForBooks;

	public OnlineArmenianStoreSearchLetters searchField() {
		searchField.click();
		return new OnlineArmenianStoreSearchLetters(this.driver);
	}

	public OnlineArmenianStoreSearchLetters field() {
		searchField.sendKeys("books");
		return new OnlineArmenianStoreSearchLetters(this.driver);
	}

	public OnlineArmenianStoreSearchLetters enter() {
		searchIcon.sendKeys(Keys.ENTER);
		return new OnlineArmenianStoreSearchLetters(this.driver);
	}

}
