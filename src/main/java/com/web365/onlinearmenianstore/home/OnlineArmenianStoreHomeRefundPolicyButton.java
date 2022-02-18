package com.web365.onlinearmenianstore.home;

import static com.web365.onlinearmenianstore.home.OnlineArmenianStoreHomeConstants.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.web365.onlinearmenianstore.page.base.OnlineArmenianStoreBasePage;

public class OnlineArmenianStoreHomeRefundPolicyButton extends OnlineArmenianStoreBasePage {
	
	public OnlineArmenianStoreHomeRefundPolicyButton(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@FindBy(xpath = REFUND_POLICY_BUTTON_XPATH)
	public WebElement refundPolicyButton;

	@FindBy(xpath = REFUND_POLICY_PAGE_XPATH)
	public WebElement refundPolicyPage;

	public OnlineArmenianStoreHomeRefundPolicyButton refundPolicyButton() {
		refundPolicyButton.click();
		return new OnlineArmenianStoreHomeRefundPolicyButton(this.driver);
	}


}
