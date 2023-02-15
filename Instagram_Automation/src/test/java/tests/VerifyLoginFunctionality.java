package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomModules.LoginOrSignUpPage;

public class VerifyLoginFunctionality {
	
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver","F:\\AutomationSelenium\\chromedriver_win32\\chromedriver.exe");
	 
	WebDriver driverTest= new ChromeDriver();
	driverTest.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driverTest.manage().window().maximize();
	
	driverTest.get("https://www.instagram.com/");
	
	LoginOrSignUpPage loginorsignuppage= new LoginOrSignUpPage(driverTest);
	loginorsignuppage.SendUserName("9422625614");
	
	loginorsignuppage.SendPassword("9422625614");
	
	loginorsignuppage.ClickOnLoginButton();

}
}