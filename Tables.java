package com.fbs.webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tables {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		String URL = "http://127.0.0.1:5500/tables.html";
		
		//get URL
		driver.get(URL);
		//print location of selected element
//		WebElement element=driver.findElement(By.xpath("//table/tbody/tr[1]/td[3]"));
//		System.out.println("Loaction:-->>"+element.getText());
		WebElement thead=driver.findElement(By.xpath("//table/thead"));
		System.out.println("Table Headers:-->>"+thead.getText());
		WebElement row1=driver.findElement(By.xpath("//table/tbody/tr[1]"));
		WebElement row2=driver.findElement(By.xpath("//table/tbody/tr[2]"));
		System.out.println("Table Rows:--->> "+row1.getText());
		System.out.println("Table Rows:--->> "+row2.getText());
		Thread.sleep(3000);
		driver.quit();
	}

}
