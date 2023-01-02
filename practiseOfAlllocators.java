package com.selenium.practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class practiseOfAlllocators {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		String URL = "https://www.amazon.in/";
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.navigate().to("https://www.google.com/");
		driver.navigate().refresh();
		driver.navigate().back();
		driver.findElement(By.xpath("//select[@id='searchDropdownBox']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Nokia Mobiles");
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		driver.findElement(By.xpath("//a[@id='icp-touch-link-language']")).click();
		Thread.sleep(2000);
		WebElement e = driver.findElement(By.linkText("Amazon miniTV"));
		e.click();
		String msg = e.getText();
		System.out.println("test result-->>"+msg);
		driver.navigate().back();
		driver.close();
	}

}
