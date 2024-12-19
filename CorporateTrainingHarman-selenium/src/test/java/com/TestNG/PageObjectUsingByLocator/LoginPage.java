package com.TestNG.PageObjectUsingByLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage
{
	
	//Encapsulation=private data+ public function
	
	private WebDriver driver;
	
	
	//constructor is used to initialize driver
		//calling driver from base class i.e from constructor and initializing into LoginPage class independently
		
	public LoginPage(WebDriver driver)//this is constructor and calling driver from base class 
	{
		this.driver=driver;
	}
	
	//Locator
	private By usern=By.name("username");
	private By psw=By.name("password");
	private By loginbtn=By.xpath("//button[@type='submit']");
	
	
	//public methods-action
	public void enterUsername(String un)
	{
		driver.findElement(usern).sendKeys(un);
	}
	
	public void doLogin(String un,String ps)
	{
		driver.findElement(usern).sendKeys(un);
		driver.findElement(psw).sendKeys(ps);
		driver.findElement(loginbtn).click();
	}
	
	public String getAppUrl()
	{
		return driver.getCurrentUrl();
	}
	
	public String getAppTitle()
	{
		return driver.getTitle();
	}
	
	

}
