package com.ejemolo.uno;


import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {
	
	private WebDriver driver;
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
	}
	@Test
	public void testGooglePage() {
		//ejercicio 1 hoja 1
		WebElement searchbox = driver.findElement(By.name("q"));
		searchbox.clear();
		searchbox.sendKeys("cachorritos");
		
		searchbox.submit();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		System.out.print(driver.getTitle());
		
	}
	@After
	
	public void tearDown(){
		// driver.quit();
	}
	
}
