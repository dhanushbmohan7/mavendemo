package com.hp.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Logout {

	WebDriver driver;
	By log=By.linkText("Log Out");
	public Logout(WebDriver driver) {
		this.driver=driver;
		
		
		
	}
	public void clickOnLogout() {
		driver.findElement(log).click();
	}

}
