package com.fbs.webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesByIndex {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		String URL = "https://docs.oracle.com/javase/8/docs/api/";
		
		//get URL
		driver.get(URL);
		//switch to first frame
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//a[contains(text(),'java.applet')]")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		//second frame
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//a[contains(text(),'Applet')]")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		//third frame
		driver.switchTo().frame(2);
		driver.findElement(By.xpath("//body/div[1]/ul[1]/li[5]/a[1]")).click();
		Thread.sleep(3000);
		driver.quit();

	}

}
