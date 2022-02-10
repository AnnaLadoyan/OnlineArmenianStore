package com.web365.onlinearmenianstore.search;

import static com.web365.onlinearmenianstore.search.OnlineArmenianStoreSearchConstants.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.onlinearmenianstore.page.base.OnlineArmenianStoreBasePage;

public class OnlineArmenianStoreSearchArtsAndCrafts extends OnlineArmenianStoreBasePage {

	public OnlineArmenianStoreSearchArtsAndCrafts(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = SEARCH_FIELD_XPATH)
	public WebElement searchField;

	@FindBy(xpath = ALL_CATEGORIES_XPATH)
	public WebElement searchAllCategories;

	@FindBy(xpath = ARTS_AND_CRAFTS_XPATH)
	public WebElement artsAndCrafts;

	@FindBy(xpath = SEARCH_ICON_XPATH)
	public WebElement searchIcon;

	@FindBy(xpath = PRODUCT_FOR_ARTS_AND_CRAFTS_XPATH)
	public WebElement productForArtsAndCrafts;

	public OnlineArmenianStoreSearchArtsAndCrafts searchField() {
		searchField.click();
		return new OnlineArmenianStoreSearchArtsAndCrafts(this.driver);
	}

	public OnlineArmenianStoreSearchArtsAndCrafts field() {
		searchField.sendKeys("canvas");
		return new OnlineArmenianStoreSearchArtsAndCrafts(this.driver);
	}

	public OnlineArmenianStoreSearchArtsAndCrafts allCategories() {
		searchAllCategories.click();
		return new OnlineArmenianStoreSearchArtsAndCrafts(this.driver);
	}

	public OnlineArmenianStoreSearchArtsAndCrafts artsAndCrafts() {
		productForArtsAndCrafts.click();
		return new OnlineArmenianStoreSearchArtsAndCrafts(this.driver);
	}

	public OnlineArmenianStoreSearchArtsAndCrafts searchIcon() {
		searchIcon.click();
		return new OnlineArmenianStoreSearchArtsAndCrafts(this.driver);
	}

}
