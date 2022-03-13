package pack1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\irg\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		HomePage homepage = new HomePage(driver);
		homepage.clickOnClosePopUp();
		Thread.sleep(5000);
		homepage.clickOnLoginButton();
		homepage.enterMobileNumber();
		homepage.enterPassword();
		homepage.submitCredentials();
		Thread.sleep(9000);
		homepage.travelTabClick(driver);
		Thread.sleep(9000);
		System.out.println("1) Everything is fine on Home Page");
		
		
		TravelPage travel = new TravelPage(driver);
		Thread.sleep(9000);
		travel.clickOnRoundTripRadioButton(driver);
//		travel.chooseFrom();
//		travel.chooseDestination();
//		travel.selectDepartureDate(driver);
//		Thread.sleep(5000);
//		travel.selectReturnDate(driver);
//		travel.travellerAndClassDetails(driver);
//		travel.clickSearchButton();
		travel.useRecentlyViewedFunctionality(driver);
		System.out.println("2) Everything is Fine Upto Trvel Page");
		
		
		FlightSelectionPage fsp = new FlightSelectionPage(driver);
		fsp.clickOnBookButton();
		System.out.println("3) Everything is Fine upto Flight Selection");
		
		TravellersDetailPage tdp = new TravellersDetailPage(driver);
		Thread.sleep(5000);
		tdp.clickContinueButton(driver);
		tdp.selectTitleForFirstTraveller();
		tdp.mentionTraveller1Name();
		tdp.mentionTraveller1lastName();
		tdp.selectTitleForSecondTraveller();
		tdp.mentionTraveller2Name();
		tdp.mentionTraveller2lastName();
		tdp.mentionPhoneNumber();
		tdp.mentionEmail();
		tdp.clickOnSecondContinueButton(driver);
		System.out.println("4) everything is Fine upto TravellersDetailPage");
		
		PaymentPage payment = new PaymentPage(driver);
		payment.moveToFlipkartPlusPage(driver);
		System.out.println("5) everything is Fine upto PaymentPage");
		
		FlipKartPlusPage fkpp = new FlipKartPlusPage(driver);
		fkpp.openUserOption(driver);
		fkpp.logOut(driver);
		System.out.println("6) everything is Fine upto FlipKartPlusPage");
		System.out.println();
		System.out.println("Complete Process is completed Successfully");
		
		driver.close();

		
		
		
		
	}

}
