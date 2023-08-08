package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import locators.PIMPageLocators;

public class PIMPage extends AdminPage {
	public static void addingNewPIMUser(WebDriver driver,String firstName,String lastName,ExtentTest extentTest) throws Throwable {
	    clickOn(driver,PIMPageLocators.pimAddButton);
	    extentTest.info("Clicking on add pim button");
	    enterTextOn(driver,PIMPageLocators.pimFirstname,firstName);
	    extentTest.info("Entering firstname");
	    enterTextOn(driver,PIMPageLocators.pimLastname,lastName);
	    extentTest.info("Entering lastname");
	    clickOn(driver,PIMPageLocators.pimSaveButton);
	    extentTest.info("Clicking on save button");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    verification(driver,PIMPageLocators.pimUserSuccess);
	    extentTest.info("Verification of user success ");
	}


}
