package com.web365.onlinearmenianstore.search;

import static com.web365.onlinearmenianstore.search.OnlineArmenianStoreSearchConstants.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.onlinearmenianstore.page.base.OnlineArmenianStoreBasePage;

public class OnlineArmenianStoreSearchBooks extends OnlineArmenianStoreBasePage {

	public OnlineArmenianStoreSearchBooks(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = SEARCH_FIELD_XPATH)
	public WebElement searchField;

	@FindBy(xpath = ALL_CATEGORIES_XPATH)
	public WebElement searchAllCategories;

	@FindBy(xpath = BOOKS_XPATH)
	public WebElement searchbooks;

	@FindBy(xpath = SEARCH_ICON_XPATH)
	public WebElement searchIcon;

	@FindBy(xpath = PRODUCT_FOR_BOOKS_XPATH)
	public WebElement productForBooks;

	public OnlineArmenianStoreSearchBooks searchField() {
		searchField.click();
		return new OnlineArmenianStoreSearchBooks(this.driver);
	}

	public OnlineArmenianStoreSearchBooks field() {
		searchField.sendKeys("17");
		return new OnlineArmenianStoreSearchBooks(this.driver);
	}

	public OnlineArmenianStoreSearchBooks allCategories() {
		searchAllCategories.click();
		return new OnlineArmenianStoreSearchBooks(this.driver);
	}

	public OnlineArmenianStoreSearchBooks books() {
		searchbooks.click();
		return new OnlineArmenianStoreSearchBooks(this.driver);
	}

	public OnlineArmenianStoreSearchBooks searchIcon() {
		searchIcon.click();
		return new OnlineArmenianStoreSearchBooks(this.driver);
	}

}
