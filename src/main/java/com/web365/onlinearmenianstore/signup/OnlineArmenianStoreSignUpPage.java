package com.web365.onlinearmenianstore.signup;

import static com.web365.onlinearmenianstore.signup.OnlineAemenianStoreSignUpConstants.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.onlinearmenianstore.page.base.OnlineArmenianStoreBasePage;

public class OnlineArmenianStoreSignUpPage extends OnlineArmenianStoreBasePage {

	public OnlineArmenianStoreSignUpPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = MY_ACCOUNT_XPATH)
	public WebElement myAccount;

	@FindBy(xpath = CREATE_YOUR_ACCOUNT_XPATH)
	public WebElement createYourAccount;

	@FindBy(xpath = CREATE_YOUR_ACCOUNT_TEXT_XPATH)
	public WebElement createYourAccountButton;

	public OnlineArmenianStoreSignUpPage signUpPage() {
		myAccount.click();
		return new OnlineArmenianStoreSignUpPage(this.driver);
	}

	public OnlineArmenianStoreSignUpPage signUp() {
		createYourAccount.click();
		return new OnlineArmenianStoreSignUpPage(this.driver);
	}

}
