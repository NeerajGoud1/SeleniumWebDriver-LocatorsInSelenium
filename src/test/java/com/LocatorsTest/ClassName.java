package com.LocatorsTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ClassName {
	WebDriver driver;
	int total = 0;
	
	@BeforeTest
	public void Setup() throws InterruptedException {
		driver = new ChromeDriver();
		driver.navigate().to("https://www.hollandandbarrett.com/shop/vitamins-supplements/vitamins/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]")).click();
	}
	
	@Test
	public void ClassTest() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@alt='Vitamin Drinks category product example']")).click();
		driver.findElement(By.className("ProductCardImage-module_picture__acftW ProductCardImage-module_pictureMobileSlider__W6QsJ")).click();
		
		String BrowserTitle = driver.getCurrentUrl();
		System.out.println(BrowserTitle);
		
		driver.navigate().back();
		BrowserTitle = driver.getCurrentUrl();
		System.out.println(BrowserTitle);
		
		driver.navigate().refresh();
		BrowserTitle = driver.getCurrentUrl();
		System.out.println(BrowserTitle);
		
		driver.navigate().forward();
		BrowserTitle = driver.getCurrentUrl();
		System.out.println(BrowserTitle);
		
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
