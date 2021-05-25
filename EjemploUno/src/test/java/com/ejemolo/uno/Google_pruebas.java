package com.ejemolo.uno;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_pruebas {
	
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
		//driver.quit();
		
	}

	@Test
	public void testBusqueda1() {
		//ejercicio 3 hoja 1
		WebElement searchbox = driver.findElement(By.name("q"));
		searchbox.clear();
		searchbox.sendKeys("cachorritos");
		 
		searchbox.submit();
		System.out.print(driver.getTitle());
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		WebElement box= driver.findElement(By.name("q"));
		box.clear();
		box.sendKeys("cachorritos bebés");
		box.submit();

		
		System.out.print(driver.getTitle());
		
	
		
				
		}
	
	
	}


