package com.fbs.webelement;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class confirm {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();;
		WebDriver driver = new ChromeDriver();
		
		String URL = "http://127.0.0.1:5500/radioButtons.html";
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get(URL);
		Thread.sleep(2000);
		WebElement confirmbtn = driver.findElement(By.xpath("/html/body/div/div/button[2]"));
		confirmbtn.click();
		Thread.sleep(2000);
		Alert confrm = driver.switchTo().alert();
		String msg = confrm.getText();
		System.out.println("Confirmation msg-->> "+msg);
		confrm.dismiss();
		Thread.sleep(2000);
		driver.quit();
	}

}
