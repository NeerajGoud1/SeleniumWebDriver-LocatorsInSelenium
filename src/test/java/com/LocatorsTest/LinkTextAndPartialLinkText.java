package com.LocatorsTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LinkTextAndPartialLinkText {
	WebDriver driver;
	int total = 0;
	
	@BeforeTest
	public void Setup() throws InterruptedException {
		driver = new ChromeDriver();
		driver.navigate().to("https://www.hollandandbarrett.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]")).click();
	}
	
	@Test
	public void LinkTest() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Vitamins")).click();
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		int linkCount = links.size();
		total += linkCount;
		System.out.println("Number of links: " + linkCount);
		
		for(int i=0; i<links.size(); i++) {
			System.out.println(links.get(i).getText());
			String str = links.get(i).getText();
			String str1 = "Vitamins";
			if(str == str1) {
				driver.findElement(By.linkText("Vitamins")).click();
			}
		}
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
