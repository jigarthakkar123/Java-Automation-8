package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GroupDemoTestNG {
	
	WebDriver driver;
	String myid="mngr516604";
	@BeforeClass(groups = { "bonding", "strong_ties" })
	public void before() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tops\\Desktop\\Automation Tools\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.demo.guru99.com/V4/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		
	}

	@Test(groups = { "bonding" })
	public void test1() {
		Assert.assertTrue(driver.findElement(By.xpath("/html/body/div[2]/h2")).isDisplayed(), "Heading Not Shown");
		System.out.println("Heading Displayed");
	}
	@Test(groups = { "bonding", "strong_ties" })
	public void test2() throws InterruptedException
	{
		driver.findElement(By.name("uid")).sendKeys("mngr516604");
		driver.findElement(By.name("password")).sendKeys("mEqAzet");
		driver.findElement(By.name("btnLogin")).click();
		Thread.sleep(2000);
	}
	@Test(groups = { "strong_ties" })
	public void test3() {
		Assert.assertTrue(driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[3]/td")).isDisplayed(), "Manager Id Not Shown");
		String mgrid=driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[3]/td")).getText();
		String cd[]=mgrid.split(" ");
		String mid="";
		for(String s:cd)
		{
			if(s.startsWith("mngr"))
			{
				mid=s;
			}
		}
		System.out.println(mid);
		if(myid.equals(mid))
		{
			System.out.println("Manager Id Displayed");
		}
		
	}
	
	@Test(groups = { "bonding" })	
	public void test4() {
		Assert.assertTrue(driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[2]/a")).isEnabled(), "New Customer Link Not Shown");
		System.out.println("New Customer Link Displayed");
		Assert.assertTrue(driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[10]/a")).isEnabled(), "Fund Transfer Link Not Shown");
		System.out.println("Fund Transfer Link Displayed");
	}
	@AfterClass(groups = { "strong_ties" })
	public void after() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close();
	}
}
