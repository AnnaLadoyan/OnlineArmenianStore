package com.web365.onlinearmenianstore.page.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class OnlineArmenianStoreBasePage {
protected WebDriver driver;
	
	public OnlineArmenianStoreBasePage (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver,this);
	}


}
