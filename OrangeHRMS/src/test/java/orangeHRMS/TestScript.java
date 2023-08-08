package orangeHRMS;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import commonUtils.ScreenShotUtility;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.BuzzPage;

public class TestScript extends BuzzPage {
	WebDriver driver;
	ExtentReports reports;
	ExtentSparkReporter spark;
	ExtentTest extentTest;
	ExtentTest logger;
	
	@BeforeTest
	public void browserInitialization() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		
		reports = new ExtentReports();
		spark = new ExtentSparkReporter("Reports\\OrangeHRMSparkReport.html");
		reports.attachReporter(spark);
	}
	@Test(priority=1)
	@Parameters({"url"})
	  public void applicationInitialization(String Url) {
		
		extentTest = reports.createTest("Valid Initialization of Application");
				
		driver.get(Url);
		extentTest.info("opening url");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	@Test(priority=2)
	 @Parameters({"UserName","Password"})
	  public void enteringLoginCredentials(String username,String password) throws Throwable {
		
		extentTest = reports.createTest("Valid Login Test");
		
		login(driver,username,password,extentTest);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	@Test(priority=3)
	 @Parameters({"Name","User","RoleValue","StatusValue","Pass","ConPass"})
	  public void addingAdminUser(String name,String user,String roleValue,String statusValue,String pass,String conPass) throws Throwable {
		
		extentTest = reports.createTest("Adding Admin User");
		
		clickingOnAdmin(driver,extentTest);
		addingNewAdminUser(driver,name,user,roleValue,statusValue,pass,conPass,extentTest);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	@Test(priority=4)
	 @Parameters({"FirstName","LastName"})
	  public void addingPIMUser(String firstName,String lastName) throws Throwable {
		
		extentTest = reports.createTest("Adding PIM User");
		
		clickingOnPIM(driver,extentTest);
		addingNewPIMUser(driver,firstName,lastName,extentTest);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	@Test(priority=5)
	 @Parameters({"NewsFeed"})
	  public void addingBuzzNewsFeed(String newsFeed) throws Throwable {
		
		extentTest = reports.createTest("Adding Newsfeed");
		
		clickingOnBuzz(driver,extentTest);
		addingNewNewsFeed(driver,newsFeed,extentTest);
	}
	@AfterMethod
	  public void tearout(ITestResult result) {
		if(ITestResult.FAILURE == result.getStatus()) {
			extentTest.log(Status.FAIL, result.getThrowable().getMessage());
			String failureScreenShot = ScreenShotUtility.getScreenshotPath(driver);
			extentTest.addScreenCaptureFromPath(failureScreenShot);
		}
	  }

    @AfterTest
	public void browserClosing() {
    	
    	reports.flush();
		
		driver.quit();
	}
}

