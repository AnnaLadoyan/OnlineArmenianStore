package com.web365.onlinearmenianstore.home;

import static com.web365.onlinearmenianstore.home.OnlineArmenianStoreHomeConstants.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.onlinearmenianstore.page.base.OnlineArmenianStoreBasePage;

public class OnlineArmenianStoreHomePinterestIcon extends OnlineArmenianStoreBasePage{
	
	public OnlineArmenianStoreHomePinterestIcon(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = PINTEREST_BUTTON_XPATH)
	public WebElement pinterestIcon;

	@FindBy(xpath = PINTEREST_PAGE_XPATH)
	public WebElement pinterestPage;

	public OnlineArmenianStoreHomePinterestIcon pinterestIcon() {
		pinterestIcon.click();
		return new OnlineArmenianStoreHomePinterestIcon(this.driver);
	}


}
