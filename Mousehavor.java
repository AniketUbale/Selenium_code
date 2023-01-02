package com.fbs.webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mousehavor {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		String URL = "https://www.amazon.in/";
		driver.get(URL);
		
		WebElement prime=driver.findElement(By.xpath("//a[@id='nav-link-amazonprime']"));
		
		Actions action = new Actions(driver);
		action.moveToElement(prime).build().perform();
		Thread.sleep(3000);
		driver.close();
		
		
	}

}
