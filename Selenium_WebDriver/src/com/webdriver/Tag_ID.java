package com.webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tag_ID {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tops\\Desktop\\Automation Tools\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#email")).sendKeys("jigar");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input.inputtext._55r1._6luy._9npi")).sendKeys("jigar");
		Thread.sleep(2000);
		driver.close();
	}
}
