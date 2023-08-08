package pages;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import locators.LoginPageLocators;
import webActions.actions;

public class LoginPage extends actions{
	public void login(WebDriver driver,String username,String Password,ExtentTest extentTest) throws Throwable {
		enterTextOn(driver,LoginPageLocators.userName,username);
		extentTest.info("Entering UserName");
		enterTextOn(driver,LoginPageLocators.password,Password);
		extentTest.info("Entering Password");
		clickOn(driver,LoginPageLocators.loginButton);
		extentTest.info("Clicking on Login button");
	}
}
