package com.Adactin.Runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.FirefoxDriverManager;
@RunWith(Cucumber.class)
@CucumberOptions(features ="src//test//java//com//Adactin//Feature",
dryRun = false,
glue = "com.Adactin.Stepdefinition",
plugin = {"html:Reports/Adactin_Cucumber.html",
		"pretty",
		"json:Reports/JsonFile.json",
	//"com.cucumber.listener.ExtentCucumberFormatter:Reports/ExtentReport.html"
})
public class Runner_class {
	public static WebDriver driver;
@BeforeClass
	public static void setUp() {
	
	//System.setProperty("webdriver.gecko.driver", ".\\Driver\\geckodriver.exe");
		
		 //WebDriverManager. firefoxdriver(). setup();
		//driver= new FirefoxDriver();
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			
	}
@AfterClass
public static void close() throws InterruptedException {
	Thread.sleep(4000);
driver.quit();
}
}
