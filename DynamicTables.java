package com.fbs.webelement;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicTables {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		//get URL
		String URL = "https://stats.espncricinfo.com/ci/content/records/283235.html";
		driver.get(URL);
		Thread.sleep(3000);
		//get column size
		List<WebElement> column = driver.findElements(By.xpath("//table/thead/tr/th"));
		System.out.println("Total Column: "+column.size());
		Thread.sleep(3000);
		//get row size
		List<WebElement> row = driver.findElements(By.xpath("//table/tbody/tr"));
		int size=row.size();
		System.out.println("Total Row: "+size);
		Thread.sleep(3000);
		//get header text
//		WebElement header = driver.findElement(By.xpath("//table/thead/tr"));
//		System.out.println(header.getText());
//		//get all row text
//		int cnt=0;
//		for(int i =0;i<row.size();i+=2,cnt++) {
//			System.out.println((cnt+1)+row.get(i).getText());
//		}
		//get all rows of only indian women team
//		System.out.println("Printing india women Rows");
//		for(int i =0;i<row.size();i+=2,cnt++) {
//			if(row.get(i).getText().contains("India Women")) {
//			System.out.println((cnt+1)+row.get(i).getText());
//			}
//		}
//		List<WebElement>c=driver.findElements(By.xpath("//table/tbody/tr[1]/td[2]"));
//		for(int i=0;i<c.size();i++) {
//			System.out.println(c.get(i).getText());
//		}
		driver.close();
		}
	}
