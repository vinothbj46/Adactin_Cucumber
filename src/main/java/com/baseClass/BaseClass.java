package com.baseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	// 1. Launching the Browser
	public static WebDriver launchBrowser(String browsername) {
		if (browsername.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
		}
		else if (browsername.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
		}
		driver.manage().window().maximize();
		return driver;
	}
	// 2.Get Url
	public static void launchUrl(String url) {
		driver.get(url);
	}
	// 3.close()
	public static void closeBrowser() {
		driver.close();
	}
	// 4.Quit()
	public static void quitBrowser() {
		driver.quit();
	}
	// 5.Navigate Forward
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
