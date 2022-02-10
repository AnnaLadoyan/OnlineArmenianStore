package com.web365.onlinearmenianstore.page.login;

import static com.web365.onlinearmenianstore.page.login.OnlineArmenianStoreLogInConstants.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.onlinearmenianstore.page.base.OnlineArmenianStoreBasePage;

public class OnlineArmenianStoreLogInOnlyEmail extends OnlineArmenianStoreBasePage {
	
	public OnlineArmenianStoreLogInOnlyEmail(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = MY_ACCOUNT_XPATH)
	public WebElement myAccount;

	@FindBy(xpath = EMAIL_FIELD_XPATH )
	public WebElement emailField;

	@FindBy(xpath = LOGIN_BUTTON_XPATH)
	public WebElement logInButton;
	
	@FindBy(xpath = ERROR_MESSAGE_XPATH)
	public WebElement errorMessage;

	public OnlineArmenianStoreLogInOnlyEmail myAccount() {
		myAccount.click();
		return new OnlineArmenianStoreLogInOnlyEmail(this.driver);
	}

	public OnlineArmenianStoreLogInOnlyEmail emailFieldClick() {
		emailField.click();
		return new OnlineArmenianStoreLogInOnlyEmail(this.driver);
	}

	public OnlineArmenianStoreLogInOnlyEmail emailField() {
		emailField.sendKeys("annaladoyan1989@gmail.com");
		return new OnlineArmenianStoreLogInOnlyEmail(this.driver);
	}

	public OnlineArmenianStoreLogInOnlyEmail logInButton() {
		logInButton.click();
		return new OnlineArmenianStoreLogInOnlyEmail(this.driver);
	}

}
