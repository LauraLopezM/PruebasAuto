package com.ejemolo.uno;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariDriver.WindowType;
import org.openqa.selenium.Keys;

public class Google_prueba4 {
	private WebDriver driver;
	@Before
	public void setUp() throws Exception {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	public void test() throws AWTException {
		//ejercicio 4 hoja 1
			WebElement searchbox = driver.findElement(By.name("q"));
			searchbox.clear();
			searchbox.sendKeys("azul");
			searchbox.submit();
			String ventana1 =driver.getWindowHandle();
			System.out.print(driver.getTitle());
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			
			
			
	}
	@Test
	public void test2() throws AWTException {
		((JavascriptExecutor) driver).executeScript("window.open('https://google.com') ");	
		
		
		WebElement search = driver.findElement(By.name("q"));
		search.clear();      
		search.sendKeys("verde");
		search.submit();
		
			
		//System.out.print(driver.getTitle());
	}

}
