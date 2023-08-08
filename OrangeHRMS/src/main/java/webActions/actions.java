package webActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

import org.junit.Assert;

public class actions{
//	public  void initializingBrowser(String url) throws Throwable{
//		WebDriverManager.chromedriver().setup();
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--remote-allow-origins=*");
//		driver = new ChromeDriver(options);
//		driver.manage().window().maximize();
//		driver.get("https://trytestingthis.netlify.app/");
//        }
	public static void clickOn(WebDriver driver,By ele) throws Throwable{
        if(driver.findElement(ele).isDisplayed()) {
            driver.findElement(ele).click();
        }
    }
	public static void enterTextOn(WebDriver driver,By ele, String value) throws Throwable{
        if(driver.findElement(ele).isDisplayed()) {
            driver.findElement(ele).clear();
            driver.findElement(ele).sendKeys(value);
        }
    }
	public static void suggestionDropDown(WebDriver driver,By ele) throws Throwable{
    	WebElement from = driver.findElement(ele);
        if(from.isDisplayed()) {
            from.click();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
            from.sendKeys(Keys.ARROW_DOWN);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
            from.sendKeys(Keys.ENTER);
        }
    }
	public static void suggestionValueDropDown(WebDriver driver,By ele,String value) throws Throwable{
    	WebElement fromValue = driver.findElement(ele);
        if(fromValue.isDisplayed()) {
            fromValue.sendKeys(value);
            Thread.sleep(3000);
            fromValue.sendKeys(Keys.ARROW_DOWN);
            fromValue.sendKeys(Keys.ENTER);
        }
    }
	
	public static void suggestionEnterDropDown(WebDriver driver,By ele,String value) throws Throwable{
    	WebElement fromValue = driver.findElement(ele);
        if(fromValue.isDisplayed()) {
            fromValue.sendKeys(value);
            Thread.sleep(3000);
            fromValue.sendKeys(Keys.ENTER);
        }
    }
	
        public static void dropdown(WebDriver driver,By ele,String Method,String value) throws Throwable{
            if(driver.findElement(ele).isDisplayed()) {
            	Select singleSel = new Select(driver.findElement(ele));
				switch (Method) {
				case "byValue":
					singleSel.selectByValue(value);
					break;
				case "byIndex":
					int i=Integer.parseInt(value);
				    singleSel.selectByIndex(i);
					break;
				case "byVisibleText":
				    singleSel.selectByVisibleText(value);
					break;
				}
        		
            }
        }
        public static void verification(WebDriver driver,By ele) throws Throwable{
        	boolean AssertCheck  = driver.findElement(ele).isDisplayed();
    		Assert.assertTrue(AssertCheck);
            }
        
}

