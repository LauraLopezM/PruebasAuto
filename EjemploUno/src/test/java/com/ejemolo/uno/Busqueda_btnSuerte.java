package com.ejemolo.uno;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Busqueda_btnSuerte {
	private WebDriver driver;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		
		WebElement searchbox = driver.findElement(By.name("q"));
		searchbox.clear();
		searchbox.sendKeys("mexico");
		
		//WebElement btn =driver.findElement(By.name("btnI"));
		WebElement btn =driver.findElement(By.name("btnI"));
		((JavascriptExecutor)driver).executeScript("arguments[0].click()", btn);
		
	
	}

}
