package pomModules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InstaHomePage {
	
	@FindBy (xpath="//button[text()='Not Now']")
	private WebElement NotNowButton;

	@FindBy (xpath="(//div[text()='Notifications'])[1]")
	private WebElement NotificationTab;
	
	public InstaHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void NotNowButton()
	{
		NotNowButton.click();
	}
	public  void ClickOnNotificationTab()
	{
		NotificationTab.click();
	}
	

}
