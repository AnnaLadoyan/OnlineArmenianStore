package com.web365.onlinearmenianstore.home;

import static com.web365.onlinearmenianstore.home.OnlineArmenianStoreHomeConstants.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.onlinearmenianstore.page.base.OnlineArmenianStoreBasePage;

public class OnlineArmenianStoreHomeBooksButton extends OnlineArmenianStoreBasePage{
	
	public OnlineArmenianStoreHomeBooksButton(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = BOOKS_BUTTON_XPATH)
	public WebElement booksButton;
	
	@FindBy(xpath =  BOOKS_PAGE_XPATH)
	public WebElement booksPage;

	
	public OnlineArmenianStoreHomeBooksButton booksButton() {
		booksButton.click();
		return new OnlineArmenianStoreHomeBooksButton(this.driver);
	}

	




}
