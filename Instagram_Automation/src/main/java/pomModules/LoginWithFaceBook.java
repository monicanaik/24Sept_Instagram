package pomModules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginWithFaceBook {
	

	@FindBy (xpath="//input[@id='email']")
	private WebElement EmailOrPhNum;
	
	@FindBy (xpath="//input[@autocomplete='current-password']")
	private WebElement Password;
	
	@FindBy (xpath="//button[@id='loginbutton']")
	private WebElement LoginButton;
	
	@FindBy (xpath="//font[text()='Forgot your account?']")
	private WebElement ForgotYourAccLink;
	
	@FindBy (xpath="(//font[text()='Create a new account'])[2]")
	private WebElement CreateNewAccButton;
	
	@FindBy (xpath="//button[text()='Not Now']")
	private WebElement NotNow;
	
	
	
	public LoginWithFaceBook(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void sendEmailOrPhNum(String user)
	{
		EmailOrPhNum.sendKeys(user);
	}
	public void sendPassword(String pass)
	{
		Password.sendKeys(pass);
	}
	public void ClickOnLoginButon()
	{
		LoginButton.click();
	}
	public void ClickOnForgotYourAccLink()
	{
		ForgotYourAccLink.click();
	}
	public void ClickOnCreatNewAccAccButton()
	{
		CreateNewAccButton.click();
	}
	public void ClickOnNotNow()
	{
		NotNow.click();
	}
	

}

