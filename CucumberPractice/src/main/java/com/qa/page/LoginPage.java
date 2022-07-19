package com.qa.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	private WebDriver driver; 
	//1.By Locator
	private By usernameof = By.name("username");
	private By password =By.xpath("//input[@name='password']");
	private By login =By.xpath("//img[contains(@class,'img-responsive')]");
	private By signup =By.xpath("//*[@id=\"navbar-collapse\"]/ul/li[2]/a");
	//2.Crete constructor
	public LoginPage(WebDriver driver) {
	this.driver =driver;
	}
	//3.Page action
	public String title () {
	return driver.getTitle();
	}
	public boolean singupbutton () {
	return driver.findElement(signup).isDisplayed();
	}
	public void usernameenter (String username) {
	driver.findElement(usernameof).sendKeys(username);
	}
	public void passwod (String pwd) {
	driver.findElement(password).sendKeys(pwd);

	}
	public void login () {
	driver.findElement(login).click();}
	}







