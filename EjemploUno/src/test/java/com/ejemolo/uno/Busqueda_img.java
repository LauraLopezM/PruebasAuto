package com.ejemolo.uno;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Busqueda_img {
	private WebDriver driver;
//ejercicio 5 hoja 1
	@Before
	public void setUp() throws Exception {
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
		searchbox.sendKeys("azul");
		searchbox.submit();
		String ventana1 =driver.getWindowHandle();
		System.out.print(driver.getTitle());
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		WebElement img= driver.findElement(By.className("hide-focus-ring"));
		img.click();
		
		
		driver.close();
	}

}
