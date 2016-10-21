package com.qait.hris.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest {

	WebDriver driver= new FirefoxDriver();

	@Test
	public void launchHomePage(){

		driver.get("http://hris.qait.com/qaithris/login.php");
		driver.manage().window().maximize();
	}

	//@Test
	public void logIn(){
		driver.findElement(By.cssSelector("#txtUserName")).clear();
		driver.findElement(By.cssSelector("#txtUserName")).sendKeys("nikhilbansal");
		driver.findElement(By.cssSelector("#txtPassword")).clear();
		driver.findElement(By.cssSelector("#txtPassword")).sendKeys("ok");
		driver.findElement(By.cssSelector(".btn.pull-left")).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		String nikhil = driver.getTitle();
		Assert.assertEquals(nikhil.contains("QAIT HRIS"), true);
	}








}
