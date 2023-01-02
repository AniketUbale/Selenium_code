package com.fbs.webelement;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		String URL = "https://jqueryui.com/datepicker/";
		driver.get(URL);
		Thread.sleep(3000);
		//switch to frames
		driver.switchTo().frame(0);
		//find element date by sending keys
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		Thread.sleep(3000);
		//find element manually
		String year="2021";
		String month = "March";
		String day="15";
		
		
		int ynum= Integer.parseInt(year);
		String myxpath="";
		if(ynum<=2022) {
			myxpath="//span[contains(text(),'Prev')]";
		}else {
			myxpath="//span[contains(text(),'Next')]";
		}
//		boolean prev=false;
//		if(ynum<=2022) {
//			prev=true;
//		}
		while(true) {
		String y=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		String m=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		
		if(y.equals(year) && m.equals(month)) {
			break;
		}
		Thread.sleep(3000);
		driver.findElement(By.xpath(myxpath)).click();
		}
		//get day
		List<WebElement> days = driver.findElements(By.xpath("//table//td"));
		for (WebElement d : days) {
			if(d.getText().equals(day)) {
				d.click();
				break;
			}
		}
		Thread.sleep(3000);
		driver.quit();	
	}

}
