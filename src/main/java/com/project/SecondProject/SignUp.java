package com.project.SecondProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignUp {
	WebDriver driver;
	public SignUp(WebDriver driver2)
	{
		driver=driver2;

	}



	public void signUpMethod(String name1,String email1,String mobile1,String password1)
	{
		System.out.println("hello  test world");

		WebElement signUpfreeButton=  driver.findElement(By.xpath("//a[text()='Sign Up Free']"));
		signUpfreeButton.click();

		WebElement yourname=driver.findElement(By.xpath("//input[@id='name']"));
		yourname.sendKeys(name1);

		WebElement yourid=driver.findElement(By.xpath("//input[@id='email']"));
		yourid.sendKeys(email1);

		WebElement mobile=driver.findElement(By.xpath("//input[@id='mobile']"));
		mobile.sendKeys(mobile1);

		WebElement signupbutton = driver.findElement(By.xpath("//button[text()='Sign up']"));
		signupbutton.click();
        
		
		WebElement otp=driver.findElement(By.xpath("//input[@id='otp']"));
		otp.sendKeys("123456");

		WebElement verifymobile=  driver.findElement(By.xpath("//button[text()='Verify mobile']"));
		verifymobile.click();


		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='OK']")));
		WebElement okbutton=  driver.findElement(By.xpath("//button[text()='OK']"));
		okbutton.click();

		WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys(password1);

		WebElement Cpassword=driver.findElement(By.xpath("//input[@id='repassword']"));
		Cpassword.sendKeys(password1);

		WebElement loginbutton= driver.findElement(By.xpath("//button[text()='Set password & procceed to login>>']"));
		loginbutton.click();

	}
}
