package pomModules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {
	

	@FindBy (xpath="//input[@id='f385a7401538ed']")
	private WebElement MobNumOrEmail;
	
	@FindBy (xpath="//button[text()='Send Login Link']")
	private WebElement FullName;
	
	@FindBy (xpath="//a[text()='Back to Login']")
	private WebElement UserName;
	
	@FindBy (xpath="//button[text()='Send Login Link']")
	private WebElement Password;
	
	@FindBy (xpath="//a[text()='Back to Login']")
	private WebElement SignUpButton;
	
	public SignUpPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterEmailOrMobNum(String email)
	{
		MobNumOrEmail.sendKeys(email);
	}
	public void EnterFullName(String fullname)
	{
		FullName.sendKeys(fullname);
	}

	public void enterUserName(String username)
	{
		UserName.sendKeys(username);
	}

	public void EnterPassword(String passwrd)
	{
		Password.sendKeys(passwrd);
	}

	public void ClickOnSignUpButton()
	{
		SignUpButton.click();
	}


}
