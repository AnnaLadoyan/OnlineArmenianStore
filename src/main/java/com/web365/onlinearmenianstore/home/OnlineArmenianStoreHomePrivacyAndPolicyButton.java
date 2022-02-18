package com.web365.onlinearmenianstore.home;

import static com.web365.onlinearmenianstore.home.OnlineArmenianStoreHomeConstants.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.onlinearmenianstore.page.base.OnlineArmenianStoreBasePage;

public class OnlineArmenianStoreHomePrivacyAndPolicyButton extends OnlineArmenianStoreBasePage {
	
	public OnlineArmenianStoreHomePrivacyAndPolicyButton(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = PRIVACY_AND_POLICY_BUTTON_XPATH)
	public WebElement privacyAndPolicyButton;

	@FindBy(xpath = PRIVACY_AND_POLICY_PAGE_XPATH)
	public WebElement privacyAndPolicyPage;

	public OnlineArmenianStoreHomePrivacyAndPolicyButton privacyAndPolicyButton() {
		privacyAndPolicyButton.click();
		return new OnlineArmenianStoreHomePrivacyAndPolicyButton(this.driver);
	}

}
