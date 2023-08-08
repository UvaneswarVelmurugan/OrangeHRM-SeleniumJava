package locators;

import org.openqa.selenium.By;

public class AdminPageLocators {
	public final static By adminAddButton = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']");
	public final static By adminUserRole = By.xpath("//div[@class='oxd-select-text-input'][1]");
	public final static By adminStatus = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div/div[1]");
	public final static By adminEmployeeName = By.xpath("//input[@placeholder='Type for hints...']");
	public final static By adminUserName = By.xpath("//div[@class='oxd-grid-item oxd-grid-item--gutters']//input[@autocomplete='off'][1]");
	public final static By adminPassword = By.xpath("//input[@type='password'][1]");
	public final static By adminConfirmPassword = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/input");
	public final static By adminSaveButton = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']");
}
