package com.epam.healenium.tests;

import com.epam.healenium.SelfHealingDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;


public class FirstTestTest3
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
		driver.get("https://docs.google.com/forms/d/e/1FAIpQLSd5hw4vZ7XR3QKVD-oJNilMwJlwlL34Qbrag35VRpLKnxT_Qg/viewform");
		driver.manage().window().maximize();
		System.out.println (delegate.getCurrentUrl());
		Select drpCountry = new Select(driver.findElement(By.xpath("(//div[@data-value='grapes']/span)[2]")));

	}

}

