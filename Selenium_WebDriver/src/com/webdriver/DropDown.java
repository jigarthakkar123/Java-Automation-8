package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tops\\Desktop\\Automation Tools\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		Select country=new Select(driver.findElement(By.name("country")));
		Thread.sleep(2000);
		country.selectByVisibleText("INDIA");
		Thread.sleep(2000);
		country.selectByVisibleText("ZIMBABWE");
		Thread.sleep(2000);
		driver.close();
	}
}
