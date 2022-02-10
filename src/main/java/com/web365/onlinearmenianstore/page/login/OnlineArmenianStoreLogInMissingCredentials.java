package com.web365.onlinearmenianstore.page.login;

import static com.web365.onlinearmenianstore.page.login.OnlineArmenianStoreLogInConstants.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.onlinearmenianstore.page.base.OnlineArmenianStoreBasePage;

public class OnlineArmenianStoreLogInMissingCredentials extends OnlineArmenianStoreBasePage{
	
	public OnlineArmenianStoreLogInMissingCredentials(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = MY_ACCOUNT_XPATH)
	public WebElement myAccount;

	@FindBy(xpath = LOGIN_BUTTON_XPATH)
	public WebElement logInButton;

	@FindBy(xpath = MISSING_CREDENTIALS_XPATH)
	public WebElement missingCredentials;

	public OnlineArmenianStoreLogInMissingCredentials myAccount() {
		myAccount.click();
		return new OnlineArmenianStoreLogInMissingCredentials(this.driver);
	}

	public OnlineArmenianStoreLogInMissingCredentials logInButton() {
		logInButton.click();
		return new OnlineArmenianStoreLogInMissingCredentials(this.driver);
	}

	

}
