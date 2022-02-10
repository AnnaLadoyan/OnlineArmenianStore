package com.web365.onlinearmenianstore.home;

import static com.web365.onlinearmenianstore.home.OnlineArmenianStoreHomeConstants.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.onlinearmenianstore.page.base.OnlineArmenianStoreBasePage;

public class OnlineArmenianStoreHomePage extends OnlineArmenianStoreBasePage {
	
	public OnlineArmenianStoreHomePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = ABOUT_US_XPATH)
	public WebElement aboutUs;
	
	@FindBy(xpath = ONLINE_ARMENIAN_STORE_LOGO_XPATH)
	public WebElement onlineArmenianStoreLogo;

	@FindBy(xpath = HOME_PAGE_XPATH)
	public WebElement homePage;

	public OnlineArmenianStoreHomePage homePage() {
		aboutUs.click();
		return new OnlineArmenianStoreHomePage(this.driver);
	}

	public OnlineArmenianStoreHomePage home() {
		onlineArmenianStoreLogo.click();
		return new OnlineArmenianStoreHomePage(this.driver);
	}

	


}
