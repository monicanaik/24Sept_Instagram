package testNGPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pomModules.LogOutFunctionality;
import pomModules.LoginOrSignUpPage;
import pomModules.LoginWithFaceBook;
import pomModules.Searchfunctionality;

public class VerifyInstagramLoginFunctionality {
	
	private static final int priority = 0;
	private WebDriver driver;
	private LoginOrSignUpPage loginOrSignUpPage;
	private LoginWithFaceBook loginWithFaceBook;
	private LogOutFunctionality logOutFunctionality;
	private Searchfunctionality searchfunctionality;
	
	
	
	
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
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
	}
	@BeforeClass
	public void createPOMObjects()
	{
		loginOrSignUpPage= new LoginOrSignUpPage(driver);
		//signUpPage= new SignUpPage(driver);
		loginWithFaceBook= new LoginWithFaceBook(driver);
		logOutFunctionality =new LogOutFunctionality(driver);
		searchfunctionality =new Searchfunctionality(driver);
		
		
	}
	@BeforeMethod
	public void loginFunctionality() throws InterruptedException
	{
		driver.get("https://www.instagram.com/");
		loginOrSignUpPage.ClickOnLoginWithFacebookLink();
		loginWithFaceBook.sendEmailOrPhNum("9422625614");
		loginWithFaceBook.sendPassword("9422625614");
		loginWithFaceBook.ClickOnLoginButon();
		Thread.sleep(3000);
		loginWithFaceBook.ClickOnNotNow();
		Thread.sleep(3000);
		
		
		
	}
	@Test
	public void verifySearchFunctionality() throws InterruptedException
	{
		
		System.out.println("test");
		Thread.sleep(3000);
		
		searchfunctionality.ClickOnsearchSymbol();
		searchfunctionality.EntersearchText();
		
		String expectedResult= "https://www.instagram.com/shri_1992_/";
		String actualResult= driver.getCurrentUrl();
		
		if(expectedResult.equals(actualResult))
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("fail");
		}
		
	}
	@AfterMethod
	public void clickOnLogOutFunctionality() throws InterruptedException
	{
		Thread.sleep(3000);
		System.out.println("logout");
		logOutFunctionality.ClickOnThreeLines();
		logOutFunctionality.ClickOnLogOut();
	
	}
	@AfterClass
	public void afterClass()
	{
		loginOrSignUpPage= null;
		loginWithFaceBook= null;
		logOutFunctionality= null;
		searchfunctionality=null;
	}
	@AfterTest
	public void aftertest()
	{
		System.out.println("after class");
		driver.close();
		driver= null;
		System.gc();
	}
	
	
	

}
