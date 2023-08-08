package pages;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import locators.BuzzPageLocators;

public class BuzzPage extends PIMPage {
	public void addingNewNewsFeed(WebDriver driver,String newsFeed,ExtentTest extentTest) throws Throwable {
		enterTextOn(driver,BuzzPageLocators.newsFeedTextBox,newsFeed);
		extentTest.info("Entering Newsfeed");
		clickOn(driver, BuzzPageLocators.postButton);
		extentTest.info("Clicking on post button");
	}

}
