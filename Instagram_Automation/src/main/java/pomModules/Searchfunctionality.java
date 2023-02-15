package pomModules;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Searchfunctionality {
	@FindBy (xpath="(//*[name()='svg'])[3]")
	private WebElement SearchSymbol;
	
	@FindBy (xpath="//input[@aria-label='Search input']")
	private WebElement SearchText;
	
	public Searchfunctionality(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void ClickOnsearchSymbol()
	{
		SearchSymbol.click();
	}
	public void EntersearchText()
	{
		SearchText.sendKeys("shri_1992_");
		SearchText.sendKeys(Keys.ENTER);
	}

}
