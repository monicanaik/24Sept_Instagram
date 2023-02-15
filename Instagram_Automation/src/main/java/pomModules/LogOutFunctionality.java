package pomModules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOutFunctionality {
	
	@FindBy (xpath="(//*[name()='svg'])[9]")
	private WebElement ThreeLines;
	
	@FindBy (xpath="//div[text()='Log out']")
	private WebElement LogOut;
	
	public LogOutFunctionality(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void ClickOnThreeLines()
	{
		ThreeLines.click();
	}
	public void ClickOnLogOut()
	{
		LogOut.click();
	}

}
