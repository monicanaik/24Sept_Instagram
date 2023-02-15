package testNGPackage;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pomModules.ForgotYourPassword;
import pomModules.LoginOrSignUpPage;
import pomModules.LoginWithFaceBook;

public class VerifyforgotpasswordLink {
	private static final int priority = 0;
	private WebDriver driver;
	private LoginOrSignUpPage loginOrSignUpPage;
	private ForgotYourPassword forgotYourPassword;
	
	
	@BeforeTest(alwaysRun=true)
	@Parameters("browser1")
	
	public void launchBrowser(String browser)
	{
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","F:\\AutomationSelenium\\chromedriver_win32 (2)\\chromedriver.exe");
			driver= new ChromeDriver();
		}
	else
		if(browser.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","F:\\AutomationSelenium\\geckodriver-v0.32.0-win64 (2)\\geckodriver.exe");
			driver= new FirefoxDriver();
		}
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
	}
	@BeforeClass
	public void createPOMObjects()
	{
		loginOrSignUpPage= new LoginOrSignUpPage(driver);
		forgotYourPassword= new ForgotYourPassword(driver);
		
		
	}
	@BeforeMethod
	public void forgotPasswordLink()
	{
		driver.get("https://www.instagram.com/");
		loginOrSignUpPage.ClickOnForgotPasswrdLink();
		forgotYourPassword.EnterEmailOrPhNumUserName("9422625614");
		forgotYourPassword.ClickOnsendLoginLinkButton();
		
	
		
		
	}
	@Test
	public void test1()
	{
		forgotYourPassword.clickonCantResetYourPassword();
		String expectedUrl= "https://help.instagram.com/374546259294234";
		String actualUrl= driver.getCurrentUrl();
		
		if(expectedUrl.equals(actualUrl))
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("fail");
		}
	}
	@AfterMethod
	public void aftermethod()
	{
		ArrayList<String> addr=new	ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(addr.get(0));
		
	}
	@AfterClass
	public void afterClass()
	{
		loginOrSignUpPage= null;
		forgotYourPassword= null;
	}
	@AfterTest
	public void aftertest()
	{
		
		driver.close();
		driver= null;
		System.gc();
	}
	

}
