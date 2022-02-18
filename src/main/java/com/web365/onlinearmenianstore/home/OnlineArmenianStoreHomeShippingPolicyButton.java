package com.web365.onlinearmenianstore.home;

import static com.web365.onlinearmenianstore.home.OnlineArmenianStoreHomeConstants.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.onlinearmenianstore.page.base.OnlineArmenianStoreBasePage;

public class OnlineArmenianStoreHomeShippingPolicyButton extends OnlineArmenianStoreBasePage {
	
	public OnlineArmenianStoreHomeShippingPolicyButton(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = ShIPPING_POLICY_BUTTON_XPATH)
	public WebElement shippingPolicyButton;

	@FindBy(xpath = ShIPPING_POLICY_PAGE_XPATH)
	public WebElement shippingPolicyPage;

	public OnlineArmenianStoreHomeShippingPolicyButton shippingPolicyButton() {
		shippingPolicyButton.click();
		return new OnlineArmenianStoreHomeShippingPolicyButton(this.driver);
	}

}
