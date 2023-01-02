package com.fbs.webelement;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class multipleWindowHandel {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String URL = "http://127.0.0.1:5500/01-window.html";
		driver.get(URL);
		Thread.sleep(3000);
		//get window ID
		String mainwindow = driver.getWindowHandle();
		System.out.println("window id-->>"+mainwindow);
		//open dashboard
		WebElement link = driver.findElement(By.linkText("Go to Dashboard"));
		link.click();
		Thread.sleep(2000);
		//open profile page
		driver.findElement(By.linkText("Go to Profile")).click();
		//get all window handels
		Set<String> handels=driver.getWindowHandles();
		for (String s : handels) {
			System.out.println(s);
			
		}
		Thread.sleep(3000);
//		ArrayList<String> windows = new ArrayList<String>(handels);
//				for (String a : windows) {
//					System.out.println(a);
//				}
//				Thread.sleep(2000);
//				driver.switchTo().window(windows.get(1));
//				driver.close();
		
				//handle window on the basis of title
				ArrayList<String> windowsHandel = new ArrayList<String>(handels);
				for (String a : windowsHandel) {
					String title = driver.switchTo().window(a).getTitle();
					System.out.println(title);
					if(title.equals("Profile page")) {
						driver.close();
						break;
					}
				}
				Thread.sleep(3000);
				driver.quit();
	}

}
