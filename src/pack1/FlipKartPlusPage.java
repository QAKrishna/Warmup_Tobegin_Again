package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipKartPlusPage 
{
	@FindBy (xpath = "//div[text()='Krishna']")
	private WebElement user;
	
	@FindBy (xpath = "//div[text()='Logout']")
	private WebElement logOut;
	
	public FlipKartPlusPage (WebDriver driver1)
	{
		PageFactory.initElements(driver1, this);
	}
	
	public void openUserOption(WebDriver driver1)
	{
		Actions act = new Actions(driver1);
		act.moveToElement(user).perform();
	}
	
	public void logOut(WebDriver driver1)
	{
		Actions act = new Actions(driver1);
		act.moveToElement(logOut).click().build().perform();
	}

}
