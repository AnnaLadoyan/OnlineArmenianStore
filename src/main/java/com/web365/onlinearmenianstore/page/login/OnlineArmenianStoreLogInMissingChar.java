package com.web365.onlinearmenianstore.page.login;

import static com.web365.onlinearmenianstore.page.login.OnlineArmenianStoreLogInConstants.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.onlinearmenianstore.page.base.OnlineArmenianStoreBasePage;

public class OnlineArmenianStoreLogInMissingChar extends OnlineArmenianStoreBasePage {
	
	public OnlineArmenianStoreLogInMissingChar(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = MY_ACCOUNT_XPATH)
	public WebElement myAccount;

	@FindBy(xpath = EMAIL_FIELD_XPATH )
	public WebElement emailField;

	@FindBy(xpath = LOGIN_BUTTON_XPATH)
	public WebElement logInButton;
	
	@FindBy(xpath = MISSING_CHAR_XPATH)
	public WebElement missingChar;

	public OnlineArmenianStoreLogInMissingChar myAccount() {
		myAccount.click();
		return new OnlineArmenianStoreLogInMissingChar(this.driver);
	}

	public OnlineArmenianStoreLogInMissingChar emailFieldClick() {
		emailField.click();
		return new OnlineArmenianStoreLogInMissingChar(this.driver);
	}

	public OnlineArmenianStoreLogInMissingChar emailField() {
		emailField.sendKeys("annaladoyan");
		return new OnlineArmenianStoreLogInMissingChar(this.driver);
	}

	public OnlineArmenianStoreLogInMissingChar logInButton() {
		logInButton.click();
		return new OnlineArmenianStoreLogInMissingChar(this.driver);
	}


}
