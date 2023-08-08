package locators;

import org.openqa.selenium.By;

public class PIMPageLocators {
	public final static By pimAddButton = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']");
	public final static By pimFirstname = By.xpath("//input[@class='oxd-input oxd-input--active orangehrm-firstname']");
	public final static By pimLastname = By.xpath("//input[@class='oxd-input oxd-input--active orangehrm-lastname']");
	public final static By pimSaveButton = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']");
	public final static By pimUserSuccess = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[1]/div[1]/div[1]/h6");
	
}
