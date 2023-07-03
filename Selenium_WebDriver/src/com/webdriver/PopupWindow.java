package com.webdriver;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupWindow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tops\\Desktop\\Automation Tools\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Click Here")).click();
		Thread.sleep(2000);
		String mainWindow=driver.getWindowHandle();
		System.out.println(mainWindow);
		Set<String> set=driver.getWindowHandles();
		Iterator<String> itr=set.iterator();
		while(itr.hasNext())
		{
			String childWindow=itr.next();
			if(!mainWindow.equalsIgnoreCase(childWindow))
			{
				Thread.sleep(2000);
				driver.switchTo().window(childWindow);
				Thread.sleep(2000);
				driver.findElement(By.name("emailid")).sendKeys("jigar@gmail.com");
				Thread.sleep(2000);
				driver.findElement(By.name("btnLogin")).click();
				Thread.sleep(2000);
				driver.close();
			}
		}
		driver.switchTo().window(mainWindow);
		Thread.sleep(2000);
		driver.close();
	}
}
