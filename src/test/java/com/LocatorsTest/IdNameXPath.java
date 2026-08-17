package com.LocatorsTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IdNameXPath {
	WebDriver driver;
	
	@Test
	public void LocatorsDemo() {
		driver = new ChromeDriver();
		driver.navigate().to("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.name("password")).sendKeys("Password123");
		//xpath or xmlpath - incase of locator id and name is not available in html document or dom we will use xpath.
		//two types - 1.Abousolute xpath
		driver.findElement(By.xpath("/html/body/div/div/section/section/div[1]/button")).click();
		// 2.Relative xpath
		//driver.findElement(By.xpath("//button[@id='submit']")).click();
	}
	

}
