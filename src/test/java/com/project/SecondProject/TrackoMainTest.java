package com.project.SecondProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class TrackoMainTest {

	WebDriver driver;
	String name="Veda";
	String email="test4090@abc.com";
	String mobileno="1111193287";
	String passwordvalue="Vedavallabh12";
	String productName="Tracko-T1";

	@Test
	public void f() throws InterruptedException
	{
		SignUp ref2=new SignUp(driver);
		ref2.signUpMethod(name,email,mobileno,passwordvalue);


		LoginPage ref= new LoginPage(driver);
		ref.login(passwordvalue,mobileno);

		Thread.sleep(5000);  
		ProductSelection ref3 =new ProductSelection(driver);
		ref3.product(productName);




	}
	@Parameters("browserName")
	@BeforeTest
	public void beforeTest(String gbw)
	{
		String browser=gbw;
		if (browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
			driver=new ChromeDriver();


		}
		//			else if(browser.equalsIgnoreCase("firefox"))
		//			{
		//				System.setProperty("webdriver.gecko.driver", "Resources/geckodriver.exe");
		//				driver=new FirefoxDriver();
		//
		//			}
		//			else if(browser.equalsIgnoreCase("ie"))
		//			{
		//				System.setProperty("webdriver.ie.driver", "Resources/IEDriverServer.exe");
		//				driver=new InternetExplorerDriver();
		//			}
		else
		{
			System.out.println("close");

		}

		driver.get("https://dev.tracko.co.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@AfterTest
	public void afterTest() {
		System.out.println("Hiii after test world");
		//driver.quit();

	}

}
