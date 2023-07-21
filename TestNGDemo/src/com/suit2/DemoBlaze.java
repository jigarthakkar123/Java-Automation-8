package com.suit2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DemoBlaze {

	WebDriver driver;
	

	@BeforeClass
	public void init() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tops\\Desktop\\Automation Tools\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.demoblaze.com/index.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}

	@Test
	public void login() throws InterruptedException {
		driver.findElement(By.id("login2")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("loginusername")).sendKeys("jigar93776");
		Thread.sleep(2000);
		driver.findElement(By.id("loginpassword")).sendKeys("jigar");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")).click();
		Thread.sleep(2000);
	}

	@Test
	public void logout() throws InterruptedException {
		driver.findElement(By.className("nav-link")).click();
		Thread.sleep(2000);
	}

	@AfterClass
	public void destroy() {
		driver.close();
	}
}
