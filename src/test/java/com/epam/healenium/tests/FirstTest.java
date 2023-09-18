package com.epam.healenium.tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.epam.healenium.SelfHealingDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTest {

		WebDriver driver;
		
		@Test
		public void test ()
		{
		WebDriverManager.chromedriver().setup();
		WebDriver delegate = new ChromeDriver();
		driver = SelfHealingDriver.create(delegate);
		driver.get ("http://www.google.com");
		driver.findElement (By.xpath ("//a[text() ='gmail']")).click ();
		System. out.println (delegate.getCurrentUrl ());
		driver. findElement (By. xpath ("//a[text()='Sign in']")).click ();

	}

}
