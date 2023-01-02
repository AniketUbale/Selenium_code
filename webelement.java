package com.fbs.mavenDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webelement {

	public static void main(String[] args) throws InterruptedException {
		String URL = "https://www.amazon.in/";
		
//		WebDriverManager.firefoxdriver().setup();;
//		WebDriver driver = new FirefoxDriver();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get(URL);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement text = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div[1]/div/div/div[1]/h2"));
		String Text = text.getText();
		System.out.println("Result is: "+Text);
		Thread.sleep(2000);
//		driver.quit();
		
		
	}

}
