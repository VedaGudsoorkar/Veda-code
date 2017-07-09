package com.project.SecondProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductSelection {

	WebDriver driver;
	public ProductSelection(WebDriver driver2)
	{
		driver=driver2;
	}

	public void product(String productName) throws InterruptedException
	{
		WebElement detailbutton =driver.findElement(By.xpath("//h3[contains(text(),'"+productName+"')]/following::a[contains(text(),'Details')][1]"));
		detailbutton.click();
		
		Thread.sleep(2000);
		//WebDriverWait wait=new WebDriverWait(driver, 20);
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Order Now ']")));
		WebElement ordernow =driver.findElement(By.xpath("//a[text()='Order Now ']"));
		ordernow.click();

		WebElement selectionbutton=driver.findElement(By.xpath("//select[@id='cPmblans']"));
		selectionbutton.click();


		WebElement options =driver.findElement(By.xpath("//select[@id='cmbPlans']/option[2]"));
		options.click();


	}

}
