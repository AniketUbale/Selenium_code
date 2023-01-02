package com.fbs.webelement;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class showprompt {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		String URL = "http://127.0.0.1:5500/radioButtons.html";
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get(URL);
		Thread.sleep(2000);
		WebElement prompt = driver.findElement(By.xpath("/html/body/div/div/button[3]"));
		prompt.click();
		Thread.sleep(2000);
		Alert prmpt = driver.switchTo().alert();
		prmpt.sendKeys("aniket");
		Thread.sleep(3000);
		String msg = prmpt.getText();
		System.out.println(msg);
		Thread.sleep(3000);		
		prmpt.accept();
		Thread.sleep(3000);
		driver.quit();
		
	}

}
