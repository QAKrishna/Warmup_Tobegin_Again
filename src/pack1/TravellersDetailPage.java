package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TravellersDetailPage 
{
	@FindBy (xpath = "//div[text()='CONTINUE']")
	private WebElement continueButton;
	
	@FindBy (xpath = "(//select[@class='_1EDlbo _1bIJ-k iUXLpR b8a4WZ'])[1]")
	private WebElement title1;
	
	@FindBy (xpath = "(//select[@class='_1EDlbo _1bIJ-k iUXLpR b8a4WZ'])[2]")
	private WebElement title2;
	
	@FindBy (xpath = "(//input[@name='First Name and Middle Name'])[1]")
	private WebElement firstMiddleName1;
	
	@FindBy (xpath = "(//input[@name='First Name and Middle Name'])[2]")
	private WebElement firstMiddleName2;
	
	@FindBy (xpath = "(//input[@name='Last Name'])[1]")
	private WebElement lastName1;
	
	@FindBy (xpath = "(//input[@name='Last Name'])[2]")
	private WebElement lastName2;
	
	@FindBy (xpath = "//input[@name='Phone Number']")
	private WebElement phoneNumber;
	
	@FindBy (xpath = "//input[@name='Email Address']")
	private WebElement email;
	
	@FindBy (xpath = "//div[text()='Continue']")
	private WebElement continueButton2;
		
	public TravellersDetailPage(WebDriver driver1)
	{
		PageFactory.initElements(driver1, this);
	}
	
	public void clickContinueButton(WebDriver driver1)
	{
		Actions act = new Actions(driver1);
		act.moveToElement(continueButton).click().build().perform();
	}
	
	public void selectTitleForFirstTraveller()
	{
		Select s = new Select(title1);
		s.selectByVisibleText("Mr");
	}
	
	public void mentionTraveller1Name()
	{
		firstMiddleName1.sendKeys("Krishna Rajaram");
	}
	
	public void mentionTraveller1lastName()
	{
		lastName1.sendKeys("Londe");
	}
	
	public void selectTitleForSecondTraveller()
	{
		Select s = new Select(title1);
		s.selectByVisibleText("Ms");
	}
	
	public void mentionTraveller2Name()
	{
		firstMiddleName1.sendKeys("Juhili Dashrath");
	}
	
	public void mentionTraveller2lastName()
	{
		lastName1.sendKeys("Shende");
	}
	
	public void mentionPhoneNumber()
	{
		phoneNumber.sendKeys("7218009643");
	}
	
	public void mentionEmail()
	{
		phoneNumber.sendKeys("krishnalonde31@gmail.com");
	}
	
	public void clickOnSecondContinueButton(WebDriver driver1)
	{
		Actions act = new Actions(driver1);
		act.moveToElement(continueButton2).click().build().perform();
	}
	
	
}
