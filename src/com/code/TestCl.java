package com.code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\61469\\eclipse-workspace\\JavaSelTest\\chromedriver.exe");
		WebDriver chromeDriver=new ChromeDriver();
		
		chromeDriver.get("https://www.google.com");
		
		WebElement chromeWebElement=chromeDriver.findElement(By.name("q"));
		chromeWebElement.sendKeys("Selenium Web Automation");
		chromeWebElement.submit();
		
		

	}

}
