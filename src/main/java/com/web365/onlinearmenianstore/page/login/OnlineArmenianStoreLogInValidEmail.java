package com.web365.onlinearmenianstore.page.login;

import static com.web365.onlinearmenianstore.page.login.OnlineArmenianStoreLogInConstants.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.onlinearmenianstore.page.base.OnlineArmenianStoreBasePage;

public class OnlineArmenianStoreLogInValidEmail extends OnlineArmenianStoreBasePage {

	public OnlineArmenianStoreLogInValidEmail(WebDriver driver) {
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

	@FindBy(xpath = LOGIN_EMAIL_XPATH)
	public WebElement logInEmail;


	
	public OnlineArmenianStoreLogInValidEmail myAccount() {
		myAccount.click();
		return new OnlineArmenianStoreLogInValidEmail(this.driver);
	}

	public OnlineArmenianStoreLogInValidEmail emailFieldClick() {
		emailField.click();
		return new OnlineArmenianStoreLogInValidEmail(this.driver);
	}

	public OnlineArmenianStoreLogInValidEmail emailField() {
		emailField.sendKeys("annaladoyan@yahoo.com");
		return new OnlineArmenianStoreLogInValidEmail(this.driver);
	}

	public OnlineArmenianStoreLogInValidEmail logInButton() {
		logInButton.click();
		return new OnlineArmenianStoreLogInValidEmail(this.driver);
	}

	public OnlineArmenianStoreLogInValidEmail passwordFieldClick() {
		passwordField.sendKeys("1234567890");
		return new OnlineArmenianStoreLogInValidEmail(this.driver);
	}

	public OnlineArmenianStoreLogInValidEmail passwordField() {
		passwordField.click();
		return new OnlineArmenianStoreLogInValidEmail(this.driver);
	}

}
