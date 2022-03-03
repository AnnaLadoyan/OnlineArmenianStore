package com.web365.onlinearmenianstore.home;

import static com.web365.onlinearmenianstore.home.OnlineArmenianStoreHomeConstants.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.onlinearmenianstore.page.base.OnlineArmenianStoreBasePage;

public class OnlineArmenianStoreHomeInstagramIcon extends OnlineArmenianStoreBasePage {
	
	public OnlineArmenianStoreHomeInstagramIcon(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = INSTAGRAM_BUTTON_XPATH)
	public WebElement instagramIcon;

	@FindBy(xpath = INSTAGRAM_PAGE_XPATH)
	public WebElement instagramPage;

	public OnlineArmenianStoreHomeInstagramIcon instagramIcon() {
		instagramIcon.click();
		return new OnlineArmenianStoreHomeInstagramIcon(this.driver);
	}




}
