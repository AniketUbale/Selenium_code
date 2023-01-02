package com.fbs.webelement;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseEvent {
	private static void Mousehavor() throws InterruptedException{

			WebDriverManager.chromedriver().setup();
			WebDriver driver= new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();
			
			String URL = "https://www.amazon.in/";
			driver.get(URL);
			
			WebElement prime=driver.findElement(By.xpath("//a[@id='nav-link-amazonprime']"));
			
			Actions action = new Actions(driver);
			action.moveToElement(prime).build().perform();
			Thread.sleep(3000);
			driver.close();
			
			
		}

	private static void rightClick() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		String URL = "https://swisnl.github.io/jQuery-contextMenu/demo.html";
		driver.get(URL);
		Thread.sleep(2000);
		
		//get xpath of button
		WebElement button = driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));
		
		Actions action = new Actions(driver);
		
		//perform click action
		action.contextClick(button).perform();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//body/ul[1]/li[2]")).click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		String msg=alert.getText();
		System.out.println(msg);
		Thread.sleep(2000);
		alert.accept();
		
		driver.close();
	}

	private static void doublClick() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		String URL = "https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_ondblclick";
		driver.get(URL);
		
		//switch to frame
		driver.switchTo().frame("iframeResult");
		Thread.sleep(2000);
		
		//get element
		WebElement para =driver.findElement(By.xpath("//p[contains(text(),'Double-click this paragraph to trigger a function.')]"));
		
		Actions action = new Actions(driver);
		
		//perform action
		action.doubleClick(para).perform();
		Thread.sleep(2000);
		
		driver.close();
	}

	private static void dragAndDrop() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		String URL = "http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html";
		
		//get url
		driver.get(URL);
		Thread.sleep(2000);
		
		//find element to drag
		//String myxpath="/html[1]/body[1]/div[3]/div[2]/div[1]/div[14]";
		///html[1]/body[1]/div[3]/div[2]/div[1]/div[10]
		WebElement drag1=driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[1]/div[10]"));
		
		WebElement drag2=driver.findElement(By.xpath("//div[@id='box6']"));
		
		
		//find element to drop
		//String dropxpath="/html[1]/body[1]/div[3]/div[3]/div[5]";
		WebElement drop1=driver.findElement(By.xpath("//div[@id='box105']"));
		
		WebElement drop2=driver.findElement(By.xpath("//div[@id='box106']"));
		
		Thread.sleep(2000);
		Actions action = new Actions(driver);
		
		//perform action
		action.dragAndDrop(drag1, drop1).perform();
		action.dragAndDrop(drag2, drop2).perform();
		Thread.sleep(3000);
		
		driver.close();
	}
	public static void main(String[] args) throws InterruptedException {
		//Mousehavor();
	//	rightClick();
		//doublClick();
		dragAndDrop();
	}

}
