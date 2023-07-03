package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseEvent {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tops\\Desktop\\Automation Tools\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Actions action=new Actions(driver);
		WebElement home=driver.findElement(By.linkText("Home"));
		Action movetohome=action.moveToElement(home).build();
		movetohome.perform();
		Thread.sleep(2000);
		
		WebElement flights=driver.findElement(By.linkText("Flights"));
		Action movetoflights=action.moveToElement(flights).build();
		movetoflights.perform();
		Thread.sleep(2000);
		
		WebElement hotels=driver.findElement(By.linkText("Hotels"));
		Action movetohotels=action.moveToElement(hotels).build();
		movetohotels.perform();
		Thread.sleep(2000);
		
		WebElement car=driver.findElement(By.linkText("Car Rentals"));
		Action movetocar=action.moveToElement(car).build();
		movetocar.perform();
		Thread.sleep(2000);
		
		WebElement cruises=driver.findElement(By.linkText("Cruises"));
		Action movetocruises=action.moveToElement(cruises).build();
		movetocruises.perform();
		Thread.sleep(2000);
		
		WebElement destinations=driver.findElement(By.linkText("Destinations"));
		Action movetodestination=action.moveToElement(destinations).build();
		movetodestination.perform();
		Thread.sleep(2000);
		
		WebElement vacations=driver.findElement(By.linkText("Vacations"));
		Action movetovacations=action.moveToElement(vacations).build();
		movetovacations.perform();
		Thread.sleep(2000);
		
		driver.close();
	}
}
