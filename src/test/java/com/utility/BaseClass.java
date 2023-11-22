package com.utility;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.stepDefinitions.loginStepdefinition;

public class BaseClass {
	private static BaseClass baseclass;
	public static Logger log;
	private static WebDriver driver;
	public final static int TIMEOUT =10;
	
	public BaseClass(){
		log = LogManager.getLogger(loginStepdefinition.class);
		//driver = new ChromeDriver();
		driver = new EdgeDriver();
		EdgeOptions options = new EdgeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		new WebDriverWait(driver,Duration.ofSeconds(TIMEOUT));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
		driver.manage().window().maximize();
	}
	public static void openPage(String url) {
		driver.get(url);
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
	
	public static void setUpDriver() {
		if (baseclass==null) {
			
			baseclass = new BaseClass();
		}
	}
	public static void tearDown() {
		if(driver!=null) {
			driver.close();
			driver.quit();
		}
	 baseclass =null;
	}
}
