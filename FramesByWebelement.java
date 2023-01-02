package com.fbs.webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesByWebelement {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		String URL = "https://docs.oracle.com/javase/8/docs/api/";
		
		//get URL
		driver.get(URL);
		//get first frame
		WebElement frame1 = driver.findElement(By.xpath("//frameset[1]/frameset[1]/frame[1]"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("//a[contains(text(),'java.applet')]")).click();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		
		//second frame
		WebElement frame2 = driver.findElement(By.xpath("//frameset[1]/frameset[1]/frame[2]"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.linkText("Applet")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		//third frame
		WebElement frame3 = driver.findElement(By.xpath("/html[1]/frameset[1]/frame[1]"));
		driver.switchTo().frame(frame3);
		driver.findElement(By.xpath("//body/div[1]/ul[1]/li[5]/a[1]")).click();
		Thread.sleep(3000);
		driver.close();
		
		
}

}
