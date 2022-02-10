package com.web365.onlinearmenianstore.page.login;

import static com.web365.onlinearmenianstore.page.login.OnlineArmenianStoreLogInConstants.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.onlinearmenianstore.page.base.OnlineArmenianStoreBasePage;

public class OnlineArmenianStoreLogInValidPassword extends OnlineArmenianStoreBasePage {
	
	public OnlineArmenianStoreLogInValidPassword(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = MY_ACCOUNT_XPATH)
	public WebElement myAccount;

	@FindBy(xpath = EMAIL_FIELD_XPATH)
	public WebElement emailField;

	@FindBy(xpath = PASSWORD_FIELD_XPATH)
	public WebElement passwordField;

	@FindBy(xpath = LOGIN_BUTTON_XPATH)
	public WebElement logInButton;

	@FindBy(xpath = LOGIN_PASSWORD_XPATH)
	public WebElement logInPassword;


	
	public OnlineArmenianStoreLogInValidPassword myAccount() {
		myAccount.click();
		return new OnlineArmenianStoreLogInValidPassword(this.driver);
	}

	public OnlineArmenianStoreLogInValidPassword emailFieldClick() {
		emailField.click();
		return new OnlineArmenianStoreLogInValidPassword(this.driver);
	}

	public OnlineArmenianStoreLogInValidPassword emailField() {
		emailField.sendKeys("annaladoyan@yahoo.com");
		return new OnlineArmenianStoreLogInValidPassword(this.driver);
	}

	public OnlineArmenianStoreLogInValidPassword logInButton() {
		logInButton.click();
		return new OnlineArmenianStoreLogInValidPassword(this.driver);
	}

	public OnlineArmenianStoreLogInValidPassword passwordFieldClick() {
		passwordField.sendKeys("1234567890");
		return new OnlineArmenianStoreLogInValidPassword(this.driver);
	}

	public OnlineArmenianStoreLogInValidPassword passwordField() {
		passwordField.click();
		return new OnlineArmenianStoreLogInValidPassword(this.driver);
	}


}
