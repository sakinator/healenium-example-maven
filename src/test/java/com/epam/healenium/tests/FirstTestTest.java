package com.epam.healenium.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.epam.healenium.SelfHealingDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTestTest {
	WebDriver driver;
	
  @Test
  public void testTest() 
  {
    
	WebDriverManager.chromedriver().setup();
	WebDriver delegate = new ChromeDriver();
	driver = SelfHealingDriver.create(delegate);
	driver.get ("http://www.google.com");
	driver.findElement (By.xpath ("//a[@ aria-label='Gmail (opens a new tab)']")).click ();
	System. out.println (delegate.getCurrentUrl ());
	driver. findElement (By. xpath ("//a[text()='Sign in']")).click ();

}
  }
