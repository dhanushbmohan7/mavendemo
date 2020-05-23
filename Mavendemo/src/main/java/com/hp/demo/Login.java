package com.hp.demo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	WebDriver driver;
	By em=By.id("email");
	By pas=By.id("pass");
	By log=By.id("send2");



	public Login(WebDriver driver) {
		this.driver=driver;
		
	}
	public void enterEmail()
	{
		driver.findElement(em).sendKeys("sharonvictoria0692@gmail.com");
	}
	public void enterPasswrd() {
		driver.findElement(pas).sendKeys("Welcome@12345");
	}
	public void clickOnlogin() {
		driver.findElement(log).click();
	}

}
