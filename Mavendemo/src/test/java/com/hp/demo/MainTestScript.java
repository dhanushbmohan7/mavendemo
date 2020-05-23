package com.hp.demo;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;



public class MainTestScript {
	@Test
	public void launch() {

	
		System.setProperty("webdriver.chrome.driver", "/home/dhanush/Downloads/geckodriver");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.MINUTES);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);
		driver.get("http://www.magento.com");
		
		Welcome wel=new Welcome(driver);
		wel.clickOnMyAccount();
		
		Login l=new Login(driver);
		l.enterEmail();
		l.enterPasswrd();
		l.clickOnlogin();
		
		Logout lo=new Logout(driver);
		lo.clickOnLogout();
		
	
	}
}
