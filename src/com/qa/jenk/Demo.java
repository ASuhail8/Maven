package com.qa.jenk;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.*;

public class Demo {

	
	@Test
	public void A()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.google.co.in");
		Reporter.log(driver.getTitle(),true);
		Reporter.log("Maven executed",true);
		driver.quit();
	}
}
