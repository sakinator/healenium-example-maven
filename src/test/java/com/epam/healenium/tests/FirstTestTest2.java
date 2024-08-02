package com.epam.healenium.tests;

import java.util.List;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.epam.healenium.SelfHealingDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class FirstTestTest2
{

	WebDriver driver;

	@Test

	public void test () throws InterruptedException
	{

		//WebDriverManager.chromedriver().setup();
		WebDriverManager.chromedriver().setup();
		WebDriver delegate = new ChromeDriver();
		driver = SelfHealingDriver.create(delegate);
		driver.manage().window().maximize();
		driver.get("https://www.happyfares.in/");
		driver.manage().window().maximize();
		System.out.println (delegate.getCurrentUrl());
		Thread.sleep(4000);
		driver.findElement(By.xpath ("//span[contains(@class,'font-weight-600 bgreturn text-uppercase')]")).click();
		System.out.println("RoundTrip");
		Thread.sleep(2000);
		//change
		driver.findElement(By.xpath("//input[@ng-model='RoundTrip_Fare']/following-sibling::span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath ("(//input[@placeholder='Select Origin City'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath ("(//input[@placeholder='Select Origin City'])[1]")).sendKeys("DELHI");
		Thread.sleep(4000);
		driver.findElement(By.xpath ("(//input[@placeholder='Select Origin City'])[1]")).sendKeys(Keys.ENTER);

		Thread.sleep(3000);
		driver.findElement(By.xpath ("(//input[@placeholder='Select Destination City'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath ("(//input[@placeholder='Select Destination City'])[1]")).sendKeys("MUMBAI");
		Thread.sleep(4000);
		driver.findElement(By.xpath ("(//input[@placeholder='Select Destination City'])[1]")).sendKeys(Keys.ENTER);
		//change
		System.out.println("DirectFlight");
		Thread.sleep(3000);
		driver.findElement(By.xpath ("//input[@ng-model='DirectFlight']/following-sibling::span")).click();
		Thread.sleep(2000);	
		driver.findElement(By.xpath ("(//span[@ng-click='TravellerDropdown()'])[1]")).click();
		driver.findElement(By.xpath ("(//span[@ng-click='TravellerDropdown()'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#business")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath ("(//input[@Value='Done'])[1]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath ("(//input[@value='Search'])[1]")).click();
//		Thread.sleep(10000);
//		driver.findElement(By.xpath ("//label[contains(text(),'Non-Stop')]")).click();
//		driver.findElement(By.xpath ("//label[contains(text(),'Refundable')]")).click();


		//driver.close();

	}

}

