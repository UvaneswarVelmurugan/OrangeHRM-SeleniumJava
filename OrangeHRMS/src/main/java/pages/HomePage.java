package pages;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import locators.HomePageLocators;

public class HomePage extends LoginPage{
	public static void clickingOnAdmin(WebDriver driver,ExtentTest extentTest) throws Throwable {
		clickOn(driver,HomePageLocators.adminButton);
		extentTest.info("Clicking on admin button");
	}
	public static void clickingOnPIM(WebDriver driver,ExtentTest extentTest) throws Throwable {
		clickOn(driver,HomePageLocators.pimButton);
		extentTest.info("Clicking on Pim button");
	}
	public static void clickingOnBuzz(WebDriver driver,ExtentTest extentTest) throws Throwable {
		clickOn(driver,HomePageLocators.buzzButton);
		extentTest.info("Clicking on buzz button");
	}
}
