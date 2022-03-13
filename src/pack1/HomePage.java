package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	@FindBy (xpath = "//button[@class='_2KpZ6l _2doB4z']")
	private WebElement closePopUp;
	
	@FindBy (xpath = "//a[text()='Login']")
	private WebElement loginButton;
	
	@FindBy (xpath = "(//input[@type='text'])[2]")
	private WebElement mobileNumber;
	
	@FindBy (xpath = "//input[@type='password']")
	private WebElement password;
	
	@FindBy (xpath = "(//button[@type='submit'])[2]")
	private WebElement submitButton;
	
	@FindBy (xpath = "(//div[@class='_1mkliO'])[8]")
	private WebElement travel;
	
	public HomePage(WebDriver driver1)
	{
		PageFactory.initElements(driver1, this);
	}
	
	public void clickOnClosePopUp()
	{
		closePopUp.click();
	}
	
	public void clickOnLoginButton()
	{
		loginButton.click();
	}
	
	public void enterMobileNumber()
	{
		mobileNumber.sendKeys("7218009643");
	}
	
	public void enterPassword()
	{
		
		password.sendKeys("1200220199");
	}
	
	public void submitCredentials()
	{
		submitButton.click();
	}
	
	public void travelTabClick(WebDriver driver1)
	{
		Actions act = new Actions(driver1);
		act.moveToElement(travel).click().build().perform();
	} 

}
