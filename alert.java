package com.fbs.webelement;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alert {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String URL = "http://127.0.0.1:5500/radioButtons.html";
		driver.get(URL);
		Thread.sleep(2000);
		WebElement alertbtn = driver.findElement(By.xpath("/html/body/div/div/button[1]"));
		alertbtn.click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		String msg = alert.getText();
		System.out.println("Mesage-> "+msg);
		alert.accept();
		Thread.sleep(2000);
		driver.quit();
		
		
		
		

	}

}
