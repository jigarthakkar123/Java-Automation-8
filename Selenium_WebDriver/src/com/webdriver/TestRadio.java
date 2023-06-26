package com.webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestRadio {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tops\\Desktop\\Automation Tools\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/ajax.html");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		List<WebElement> list=driver.findElements(By.name("name"));
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i).getAttribute("value"));
		}
		driver.close();
	}
}
