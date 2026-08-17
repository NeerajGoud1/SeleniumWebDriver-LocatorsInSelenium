package com.LocatorsTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class LinkCountPrint {
	
	WebDriver driver;
	int total = 0;
	
	@BeforeTest
	public void Setup() {
		driver = new ChromeDriver();
		driver.navigate().to("https://www.easycalculation.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void findElementById() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.linkText("Calculators")).click();
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int linkCount = links.size();
		total += linkCount;
		System.out.println("Number of links: " + linkCount);
		
		for(int i=0; i<links.size(); i++) {
			System.out.println(links.get(i).getText());
		}
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
