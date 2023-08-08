package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import locators.AdminPageLocators;

public class AdminPage extends HomePage {
	public static void addingNewAdminUser(WebDriver driver,String name,String user,String roleValue,String statusValue,String pass,String conPass,ExtentTest extentTest) throws Throwable {
	    clickOn(driver,AdminPageLocators.adminAddButton);
	    extentTest.info("Clicking on Add Admin button");
	    suggestionValueDropDown(driver,AdminPageLocators.adminEmployeeName,name);
	    extentTest.info("Entering EmployeeName");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    enterTextOn(driver,AdminPageLocators.adminUserName,user);
	    extentTest.info("Entering UserName");
	    suggestionEnterDropDown(driver,AdminPageLocators.adminUserRole,roleValue);
	    extentTest.info("Entering User Role");
	    suggestionEnterDropDown(driver,AdminPageLocators.adminStatus,statusValue);
	    extentTest.info("Entering User status");
	    enterTextOn(driver,AdminPageLocators.adminPassword,pass);
	    extentTest.info("Entering Password");
	    enterTextOn(driver,AdminPageLocators.adminConfirmPassword,conPass);
	    extentTest.info("Entering Confirm password");
	    clickOn(driver,AdminPageLocators.adminSaveButton);
	    extentTest.info("Clicking on save button");
	}

}
