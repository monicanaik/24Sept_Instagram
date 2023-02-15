package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomModules.LoginOrSignUpPage;
import pomModules.LoginWithFaceBook;

public class VerifyLoginWithFBFunctionality {
	
	public static void main(String[] args) {
			
		
		System.setProperty("webdriver.chrome.driver","F:\\AutomationSelenium\\chromedriver_win32\\chromedriver.exe");
		 
		WebDriver driverTest= new ChromeDriver();
		
		driverTest.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driverTest.manage().window().maximize();
		
		driverTest.get("https://www.instagram.com/");
		
		LoginOrSignUpPage loginOrSignUpPage= new LoginOrSignUpPage(driverTest);
		loginOrSignUpPage.ClickOnLoginWithFacebookLink();
		
		LoginWithFaceBook loginWithFaceBook= new LoginWithFaceBook(driverTest);
		loginWithFaceBook.sendEmailOrPhNum("9422625614");
		loginWithFaceBook.sendPassword("9422625614");
		loginWithFaceBook.ClickOnLoginButon();
		
		

}
	}
