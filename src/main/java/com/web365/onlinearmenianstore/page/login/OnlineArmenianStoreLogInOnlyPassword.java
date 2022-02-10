package com.web365.onlinearmenianstore.page.login;

import static com.web365.onlinearmenianstore.page.login.OnlineArmenianStoreLogInConstants.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.onlinearmenianstore.page.base.OnlineArmenianStoreBasePage;

public class OnlineArmenianStoreLogInOnlyPassword extends OnlineArmenianStoreBasePage {

	public OnlineArmenianStoreLogInOnlyPassword(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = MY_ACCOUNT_XPATH)
	public WebElement myAccount;

	@FindBy(xpath = PASSWORD_FIELD_XPATH)
	public WebElement passwordField;

	@FindBy(xpath = LOGIN_BUTTON_XPATH)
	public WebElement loginButton;

	@FindBy(xpath = EMAIL_FIELD_XPATH)
	public WebElement errorMessage;

	public OnlineArmenianStoreLogInOnlyPassword myAccount() {
		myAccount.click();
		return new OnlineArmenianStoreLogInOnlyPassword(this.driver);
	}

	public OnlineArmenianStoreLogInOnlyPassword passwordFieldClick() {
		passwordField.click();
		return new OnlineArmenianStoreLogInOnlyPassword(this.driver);
	}

	public OnlineArmenianStoreLogInOnlyPassword passwordField() {
		passwordField.sendKeys("573424");
		return new OnlineArmenianStoreLogInOnlyPassword(this.driver);
	}

	public OnlineArmenianStoreLogInOnlyPassword loginButton() {
		loginButton.click();
		return new OnlineArmenianStoreLogInOnlyPassword(this.driver);
	}

}
