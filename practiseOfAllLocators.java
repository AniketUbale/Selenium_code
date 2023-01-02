package com.fbs.mavenDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class practiseOfAllLocators {

	public static void main(String[] args) throws InterruptedException {
		String URL = "https://www.amazon.in/";
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.navigate().to("https://www.google.com/");
		driver.navigate().refresh();
		driver.navigate().back();
		driver.findElement(By.id("searchDropdownBox")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Nokia Mobiles");
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		driver.findElement(By.linkText("Mobiles")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		driver.findElement(By.linkText("Visit our furniture store")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		WebElement Text = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div[1]/div/div/div[1]/h2"));
		String text = Text.getText();
		System.out.println("Result is: "+text);
		Thread.sleep(2000);
		driver.quit();
	}

}
