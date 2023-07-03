package com.webdriver;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class KeyboardEvent {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tops\\Desktop\\Automation Tools\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement email=driver.findElement(By.id("email"));
		Actions builder=new Actions(driver);
		Thread.sleep(2000);
		Action action=builder.moveToElement(email)
				.click()
				.keyDown(email,Keys.SHIFT)
				.sendKeys("jigar")
				.keyUp(email,Keys.SHIFT)
				.doubleClick()
				.contextClick()
				.build();
		Thread.sleep(2000);
		action.perform();
		Thread.sleep(2000);
		driver.close();
	}
}
