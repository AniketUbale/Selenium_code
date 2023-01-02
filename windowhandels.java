package com.fbs.webelement;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowhandels {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		String URL = "http://127.0.0.1:5500/01-window.html";
		driver.get(URL);
		Thread.sleep(2000);
		String id1 = driver.getWindowHandle();
		System.out.println("[window handle ID]"+id1);
		Thread.sleep(3000);
		WebElement link = driver.findElement(By.linkText("Go to Dashboard"));
		link.click();
//		String id2 = driver.getWindowHandle();
//		System.out.println(id2);
		Thread.sleep(3000);
		System.out.println("printing all windows handle");
		Set<String> handles = driver.getWindowHandles();
		for (String string : handles) {
			System.out.println((string));
			
		}
		Thread.sleep(2000);
		driver.quit();

	}

}
