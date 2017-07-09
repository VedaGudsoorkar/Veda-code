package com.project.SecondProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;






public class LoginPage {
	
	 WebDriver driver; 
	 public LoginPage(WebDriver driver2) 
	 {
		driver=driver2;
	}
	

public void login(String password1,String mobile) throws InterruptedException
{
	WebElement login=driver.findElement(By.xpath("//input[@id='login-mobile']"));
	  login.sendKeys(mobile);
	  WebElement Lpassword=driver.findElement(By.xpath("//input[@id='login-password']"));
	  Lpassword.sendKeys(password1);
	WebElement loginButton=  driver.findElement(By.xpath("//button[text()='Log in']"));
		loginButton.click();
	  
}
	
}
