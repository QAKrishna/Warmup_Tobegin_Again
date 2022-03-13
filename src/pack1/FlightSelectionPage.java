package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightSelectionPage 
{
	@FindBy (xpath = "//span[text()='Book']")
	private WebElement bookButton;
	
	public FlightSelectionPage(WebDriver driver1)
	{
		PageFactory.initElements(driver1,this);
	}
			
	public void clickOnBookButton()
	{
		bookButton.click();
	}

}
