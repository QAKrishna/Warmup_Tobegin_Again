package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage
{
	@FindBy (xpath = "//img[@title='Flipkart']")
	private WebElement flipKartIcon;
	
	public PaymentPage (WebDriver driver1)
	{
		PageFactory.initElements(driver1, this);
	}
	
	public void moveToFlipkartPlusPage(WebDriver driver1)
	{
		Actions act = new Actions(driver1);
		act.moveToElement(flipKartIcon).click().build().perform();
	}

}
