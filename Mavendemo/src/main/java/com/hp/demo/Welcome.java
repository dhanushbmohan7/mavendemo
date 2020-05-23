package com.hp.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Welcome {

	WebDriver driver;
	By myaccnt=By.linkText("My Account");
	public Welcome(WebDriver driver) {
		this.driver=driver;
	}
	
	public void clickOnMyAccount()
	{
		driver.findElement(myaccnt).click();
	}
}
