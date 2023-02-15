package pomModules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotYourPassword {
	
	//monica
	
	@FindBy (xpath="//span[text()='Email address, phone number or username']")
	private WebElement EmailPhNumOrUserName;
	
	@FindBy (xpath="//button[text()='Send Login Link']")
	private WebElement SendLoginLinkButton;
	
	@FindBy (xpath="//a[text()='Back to Login']")
	private WebElement backToLoginLink;
	
	@FindBy (xpath="(//div[@class='_ac06 x78zum5 xdt5ytf']//div)[10]//a")
	private WebElement CantResetYourPassword;
	
	public ForgotYourPassword(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void EnterEmailOrPhNumUserName(String userOrEmail)
	{
		EmailPhNumOrUserName.sendKeys(userOrEmail);
	}
	public void ClickOnsendLoginLinkButton()
	{
		SendLoginLinkButton.click();
	}
	public void ClickOnBackToLogin()
	{
		backToLoginLink.click();
	}
	public void clickonCantResetYourPassword()
	{
		CantResetYourPassword.click();
	}


}
