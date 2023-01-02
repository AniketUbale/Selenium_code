package com.fbs.mavenDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class locators_fb {

	public static void main(String[] args) throws InterruptedException {
		final String URL = "https://www.facebook.com";
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
	
		driver.get(URL);
		driver.findElement(By.id("email")).sendKeys("Admin");
		driver.findElement(By.id("pass")).sendKeys("Admin");
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		driver.close();
		
	}

}
