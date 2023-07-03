package com.webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tops\\Desktop\\Automation Tools\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/radio.html");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		/*
		 * Thread.sleep(2000); driver.findElement(By.id("vfb-7-1")).click();
		 * Thread.sleep(2000); driver.findElement(By.id("vfb-7-2")).click();
		 * Thread.sleep(2000); driver.findElement(By.id("vfb-7-3")).click();
		 * Thread.sleep(2000); driver.findElement(By.id("vfb-6-0")).click();
		 * Thread.sleep(2000); driver.findElement(By.id("vfb-6-1")).click();
		 * Thread.sleep(2000); driver.findElement(By.id("vfb-6-2")).click();
		 */
		List<WebElement> list=driver.findElements(By.name("webform"));
		for(int i=list.size()-1;i>=0;i--)
		{
			System.out.println(list.get(i).getAttribute("value"));
			if(list.get(i).getAttribute("value").equals("checkbox2") || list.get(i).getAttribute("value").equals("Option 1"))
			{
				list.get(i).click();
			}
			Thread.sleep(1000);
		}
		Thread.sleep(2000);
		
		driver.close();
	}
}
