package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tops\\Desktop\\Automation Tools\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("C:\\Users\\Tops\\Java_Automation_8\\Selenium_WebDriver\\src\\html\\table.html");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		String data=driver.findElement(By.xpath("//table/tbody/tr[4]/td[2]")).getText();
		System.out.println("Fetched Data : "+data);
		Thread.sleep(2000);
		driver.close();
	}
}
