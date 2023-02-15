package pomModules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginOrSignUpPage {

	
	@FindBy (xpath="//input[@aria-label='Phone number, username or email address']")
	private WebElement UserName;
	
	@FindBy (xpath="//input[@aria-label='Password']")
	private WebElement Password;
	
	@FindBy (xpath="//button[@type='submit']")
	private WebElement LoginButton;
	
	@FindBy (xpath="//span[text()='Log in with Facebook']")
	private WebElement LoginWithFacebookLink;
	
	@FindBy (xpath="//a[text()='Forgotten your password?']")
	private WebElement ForgotPasswrdLink;
	
	@FindBy (xpath="//span[text()='Sign up'")
	private WebElement SignUp;
	
	public LoginOrSignUpPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public  void SendUserName(String user)
	{
		UserName.sendKeys(user);
	}
	public void SendPassword(String passwrd)
	{
		Password.sendKeys(passwrd);
	}
	public void ClickOnLoginButton()
	{
		LoginButton.click();
	}
	public void ClickOnLoginWithFacebookLink()
	{
		LoginWithFacebookLink.click();
	}
	public void ClickOnForgotPasswrdLink()
	{
		ForgotPasswrdLink.click();
	}
	public void ClickOnSignUp()
	{
		SignUp.click();
	}

}
