package jUnitTesting;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class jUnitTestDemo {

	static WebDriver driver;
	
	@BeforeClass
	public static void beforeclass() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tops\\Desktop\\Automation Tools\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		System.out.println("URL Get Successfully");
	}
	@Before
	public void before() throws InterruptedException
	{
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
		System.out.println("Logged In Successfully");
	}
	@Test
	public void test1() throws InterruptedException
	{
		String success_url="https://www.saucedemo.com/inventory.html";
		String current_url=driver.getCurrentUrl();
		if(success_url.equals(current_url))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
		Thread.sleep(2000);
	}
	@Test
	public void test2() throws InterruptedException
	{
		driver.findElement(By.name("add-to-cart-sauce-labs-backpack")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("shopping_cart_link")).click();
		Thread.sleep(2000);
	}
	@After
	public void after() throws InterruptedException
	{
		driver.findElement(By.id("react-burger-menu-btn")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("logout_sidebar_link")).click();
		System.out.println("Logged Out Successfully");
	}
	@AfterClass
	public static void afterclass() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.close();
		System.out.println("Test Completed");
	}
}
