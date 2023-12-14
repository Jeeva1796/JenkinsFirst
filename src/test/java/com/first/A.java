package com.first;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class A {
	
	@Test
	public void test1() {
		
		//WebDriverManager.firefoxdriver().setup();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace2\\TestngJenk\\Driver\\chromedriver.exe");
		ChromeOptions cp = new ChromeOptions();
		cp.setBinary("C:\\Users\\ELCOT\\eclipse-workspace2\\TestngJenk\\Browser\\chrome.exe");
		
		//WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        
		if (driver.findElement(By.id("email")).isDisplayed()==true)
		{
			System.out.println("hello");
		}
		else
		{
			System.out.println("no element");
		}
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertTrue(driver.getTitle().contains("Facebook"),"title not match");
		driver.quit();
		
	}

}
