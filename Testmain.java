
package com.fbs.mavenDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testmain {
		public static void basicMethods(){
			WebDriverManager.firefoxdriver().setup();
			WebDriver driver = new FirefoxDriver();
			
			final String URL = "https://www.google.com";
			driver.get(URL);
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
//			driver.switchTo().newWindow(WindowType.WINDOW);
			Dimension size = driver.manage().window().getSize();
			System.out.println("Width:"+ size.getWidth());
			System.out.println("Height is:"+ size.getHeight());
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Dimension newsize = new Dimension(800,500);
			driver.manage().window().setSize(newsize);
			System.out.println("width:"+newsize.getWidth());
			System.out.println("Height:"+newsize.getHeight());
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Point position = driver.manage().window().getPosition();
			System.out.println(position.getX());
			System.out.println(position.getY());
			
			Point newpos = new Point(100,60);
			driver.manage().window().setPosition(newpos);
			System.out.println(driver.manage().window().getPosition().getX());
			System.out.println(driver.manage().window().getPosition().getY());
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			driver.close();
			
		}
		
		public static void navigateMethods() throws InterruptedException {
			final String URL = "https://www.amazon.in/";
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get(URL);
			driver.manage().window().maximize();
			Thread.sleep(3000);
			driver.navigate().to("https://www.google.com/");
			driver.navigate().refresh();
			Thread.sleep(3000);
			driver.navigate().back();
			Thread.sleep(3000);
			driver.navigate().forward();
			Thread.sleep(3000);
			driver.quit();
		}

		public static void locators() throws InterruptedException {

			final String URL = "https://www.amazon.in";
			WebDriverManager.firefoxdriver().setup();
			WebDriver driver = new FirefoxDriver();
			driver.get(URL);
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("one plus mobiles");
			driver.findElement(By.id("nav-search-submit-button")).click();
			Thread.sleep(3000);
			driver.quit();
		}

		public static void linktextlocators() throws InterruptedException {
			final String URL = "https://www.amazon.in/";
			
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			
			driver.get(URL);
			driver.manage().window().maximize();
			driver.findElement(By.linkText("Visit our furniture store")).click();
			Thread.sleep(3000);
			driver.navigate().back();
			Thread.sleep(2000);
			driver.close();
			
		}
		public static void xpath() throws InterruptedException {
			final String URL = "https://www.amazon.in/";
			
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			
			driver.get(URL);
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("one plus mobile");
			driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
			Thread.sleep(2000);
			driver.quit();
			
			
			
		}
		public static void main(String[] args) throws InterruptedException {
//			basicMethods();
//			navigateMethods();
//			locators();
//			linktextlocators();
			xpath();
			
		}

}