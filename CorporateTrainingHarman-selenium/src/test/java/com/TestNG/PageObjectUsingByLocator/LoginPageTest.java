package com.TestNG.PageObjectUsingByLocator;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseClass
{
	
  @Test(priority=1)
  public void validateUrl()
  {
	  
	  /*to access the methods of  LoginPage we need to create an object every time in each method,it's better  define it globally 
	   * i.e in base class , so we will create an object of LoginPage class in Base class , so that we will able to call method 
	   * of LoginPage in base class and since LoginPageTest is extending BaseClass so we will able call methods of LoginPage in 
	   * LoginPageTest as well.
	   */
	  //LoginPage lp=new LoginPage();
	  String actUrl=lp.getAppUrl();
	  String exp="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	  Assert.assertEquals(actUrl,exp,"URl is not matching!");
	  System.out.println("Url is matching!");
	  
  }
  
  @Test(priority=2)
  public void validateTitle() 
  {
	  String actTitle=lp.getAppTitle();
	  Assert.assertTrue(actTitle.contains("HRM"),"Title not matched!");
	  System.out.println("Title matched");
	  
  }
  
  
  @Test(priority=3)
  public void validateLogin() 
  {
	  lp.doLogin("Admin","admin123");
	  Assert.assertTrue(lp.getAppUrl().contains("dashboard"),"Login Fail");
	  System.out.println("Login completed");
  }
}
