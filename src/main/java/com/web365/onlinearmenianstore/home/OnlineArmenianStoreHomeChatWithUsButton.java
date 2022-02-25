package com.web365.onlinearmenianstore.home;

import static com.web365.onlinearmenianstore.home.OnlineArmenianStoreHomeConstants.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.onlinearmenianstore.page.base.OnlineArmenianStoreBasePage;

public class OnlineArmenianStoreHomeChatWithUsButton extends OnlineArmenianStoreBasePage{
	
	public OnlineArmenianStoreHomeChatWithUsButton(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = CHAT_WITH_US_BUTTON_XPATH)
	public WebElement chatWithUsButton;

	@FindBy(xpath = CHAT_WITH_US_PAGE_XPATH)
	public WebElement chatWithUsPage;

	public OnlineArmenianStoreHomeChatWithUsButton chatWithUsButton() {
		chatWithUsButton.click();
		return new OnlineArmenianStoreHomeChatWithUsButton(this.driver);
	}


}
