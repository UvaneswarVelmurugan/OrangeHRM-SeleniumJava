package locators;

import org.openqa.selenium.By;

public class LoginPageLocators {
	public final static By userName = By.xpath("//input[@name='username']");
	public final static By password = By.xpath("//input[@name='password']");
	public final static By loginButton = By.xpath("//button[@type='submit']");
}
