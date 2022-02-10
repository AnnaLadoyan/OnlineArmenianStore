package com.web365.onlinearmenianstore.base.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class OnlineArmenianStoreBaseTest {
	
	protected WebDriver driver;

	@BeforeClass
	public void openOnlineArmenianStore() {
		driver = new ChromeDriver();
		driver.get("https://onlinearmenianstore.com/");
		driver.manage().window().maximize();
	}

	@AfterClass
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}
