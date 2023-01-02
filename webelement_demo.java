package com.fbs.webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webelement_demo {

	public static void main(String[] args) throws InterruptedException {
	String URL = "http://127.0.0.1:5500/radioButtons.html";
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(URL);
		driver.manage().window().maximize();
		WebElement radio1 = driver.findElement(By.id("rcb"));
		radio1.click();
		Thread.sleep(2000);
		WebElement radio2 = driver.findElement(By.xpath("/html/body/div/input[5]"));
		radio2.click();
		Thread.sleep(2000);
		driver.close();
	}

}
