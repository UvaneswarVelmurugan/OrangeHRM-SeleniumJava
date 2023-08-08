package locators;

import org.openqa.selenium.By;

public class HomePageLocators {
    public final static By adminButton = By.xpath("//a[@href='/web/index.php/admin/viewAdminModule']");
	public final static By pimButton = By.xpath("//a[@href='/web/index.php/pim/viewPimModule']");
    public final static By buzzButton = By.xpath("//a[@href='/web/index.php/buzz/viewBuzz']");
}
