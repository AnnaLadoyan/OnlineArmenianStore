package com.web365.onlinearmenianstore.page.login;

import static com.web365.onlinearmenianstore.page.login.OnlineArmenianStoreLogInConstants.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.onlinearmenianstore.page.base.OnlineArmenianStoreBasePage;

public class OnlineArmenianStorelogInRecoverPassword extends OnlineArmenianStoreBasePage {

	public OnlineArmenianStorelogInRecoverPassword(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = MY_ACCOUNT_XPATH)
	public WebElement myAccount;

	@FindBy(xpath = RECOVER_PASSWORD_BUTTON_XPATH)
	public WebElement recoverPasswordButton;

	@FindBy(xpath = RECOVER_PASSWORD_XPATH)
	public WebElement recoverPassword;

	public OnlineArmenianStorelogInRecoverPassword myAccount() {
		myAccount.click();
		return new OnlineArmenianStorelogInRecoverPassword(this.driver);
	}

	public OnlineArmenianStorelogInRecoverPassword recoverPasswordButton() {
		recoverPasswordButton.click();
		return new OnlineArmenianStorelogInRecoverPassword(this.driver);
	}

	
}
