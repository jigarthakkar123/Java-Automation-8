package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tops\\Desktop\\Automation Tools\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("jigar");
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("jigar");
		Thread.sleep(2000);
		driver.findElement(By.name("login")).click();
		Thread.sleep(7000);
		driver.close();
	}
}
