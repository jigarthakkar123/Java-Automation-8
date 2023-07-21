package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstTestNG {
	
	ChromeDriver driver;
  @Test(priority = 0)
  public void getURL() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tops\\Desktop\\Automation Tools\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.saucedemo.com/");
	  driver.manage().window().maximize();
	  Thread.sleep(3000);
  }
  @Test(priority = 1)
  public void credential() throws InterruptedException {
	  driver.findElement(By.name("user-name")).sendKeys("standard_user");
	  Thread.sleep(3000);
	  driver.findElement(By.name("password")).sendKeys("secret_sauce");
	  Thread.sleep(3000);
  }
  @Test(priority = 3)
  public void login() throws InterruptedException {
	  driver.findElement(By.name("login-button")).click();
	  Thread.sleep(3000);
  }
  @Test(priority = 4)
  public void logout() throws InterruptedException {
	  driver.findElement(By.id("react-burger-menu-btn")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.id("logout_sidebar_link")).click();
	  Thread.sleep(3000);
  }
  @Test(priority = 5)
  public void close() throws InterruptedException {
	  driver.close();
  }
}
