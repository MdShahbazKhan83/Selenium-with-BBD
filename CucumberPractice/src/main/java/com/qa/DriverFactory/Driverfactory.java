package com.qa.DriverFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driverfactory {
	//1. create the object of webdriver 
	public WebDriver driver;
	//2.create the object of Thread driver
	public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<WebDriver>();
	//3.Cretaed one method of the browser
	public WebDriver init_driver(String browser) {
	if(browser.equals("chrome")) {
	WebDriverManager.chromedriver().setup();
	//4.This thread driver provide the set and get method sp we are setting chromedriver in Thread driver and thread driver is a chromedriver
	tlDriver.set(new ChromeDriver ());
	}
	else if(browser.equals("firefox")) {
	WebDriverManager.firefoxdriver().setup();
	tlDriver.set(new FirefoxDriver());
	}else {
	System.out.println("Please pass correct browsre");
	}

	getDriver().manage().deleteAllCookies();
	getDriver().manage().window().maximize(); 
	return getDriver();


	}

	public static synchronized WebDriver getDriver() {
	return tlDriver.get();
	}


	//We use this therad to do the pareller execution





	}



