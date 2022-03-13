package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TravelPage 
{
	@FindBy (xpath = "//label[@for='ROUND_TRIP']")
	private WebElement roundTripRadioButton;
	
	@FindBy (xpath = "(//input[@type='text'])[1]")
	private WebElement fromTextBox;
	
	@FindBy (xpath = "(//input[@type='text'])[2]")
	private WebElement toTextBox;
	
	@FindBy (xpath = "(//input[@type='text'])[3]")
	private WebElement departOn;
	
	@FindBy (xpath = "(//input[@type='text'])[4]")
	private WebElement returnOn;
	
	@FindBy (xpath = "(//input[@type='text'])[5]")
	private WebElement travelerandClass;
	
	@FindBy (xpath = "//button[@type='button']")
	private WebElement searchButton;
	
	@FindBy (xpath = "//div[text()='5 Mar - 6 Mar']")
	private WebElement recentlyViewed;
	
	
	public TravelPage(WebDriver driver1)
	{
		PageFactory.initElements(driver1, this);
	}
	
	public void clickOnRoundTripRadioButton(WebDriver driver1)
	{
		Actions act = new Actions(driver1);
		act.moveToElement(roundTripRadioButton).click().build().perform();
	}
	
	public void chooseFrom()
	{
		fromTextBox.clear();
		fromTextBox.sendKeys("Nagpur, NAG - Dr. Babasaheb Ambedkar, India");
		
	}
	
	public void chooseDestination()
	{
		toTextBox.clear();
		toTextBox.sendKeys("Pune, PNQ - Lohegaon, India");
	}
	
	public void selectDepartureDate(WebDriver driver1)
	{
		departOn.click();
		WebElement departDate = driver1.findElement(By.xpath("(//button[@class='jkj0H4'])[29]"));
		Actions act = new Actions(driver1);
		act.moveToElement(departDate).click().build().perform();
		
	}
	
	public void selectReturnDate(WebDriver driver1)
	{
		returnOn.click();
		WebElement returnDate = driver1.findElement(By.xpath("(//button[@class='jkj0H4'])[30]"));
		Actions act = new Actions(driver1);
		act.moveToElement(returnDate).click().build().perform();
		
	}
	
	public void travellerAndClassDetails(WebDriver driver1)
	{
		 travelerandClass.click();
		 WebElement adult = driver1.findElement(By.xpath("(//button[@class='_2KpZ6l _34K0qG _37Ieie'])[1]"));
		 adult.click();
		 
		 WebElement classSelection = driver1.findElement(By.xpath("//div[text()='Economy']"));
		 Actions act = new Actions(driver1);
		 act.moveToElement(classSelection).click().build().perform();
 
	}
	
	public void clickSearchButton()
	{
		searchButton.click();
	}
	
	public void useRecentlyViewedFunctionality(WebDriver driver1)
	{
		Actions act = new Actions(driver1);
		act.moveToElement(recentlyViewed).click().build().perform();
	}

}
