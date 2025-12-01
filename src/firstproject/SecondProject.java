package firstproject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SecondProject {
	
	
	WebDriver driver = new ChromeDriver();
	String TheWebsite =  "https://automationexercise.com/";
	String SignUpwebsiteButton = "https://automationexercise.com/login";
	String MyEmail = "mohammadnajjar98@outlook.com";	
	String MyName = "Mohammad";
	String MyPassword = "491016600lol";
	
	
@BeforeTest

public void MySetup() {
	
driver.get(TheWebsite);
driver.manage().window().maximize();


}




@Test (priority = 1 )                        //  FIRST PRIORITY IS THE SIGN UP STAGE 

public void SignUp () {
	
	 driver.navigate().to(SignUpwebsiteButton);
	 
	 
	  WebElement NamePlaceHolder = driver.findElement(By.name("name"));
	  WebElement EmailPlaceHolder = driver.findElements(By.name("email")).get(1);   // كان في x3 email بالصفحة
	   WebElement SignUpButton = driver.findElement(By.cssSelector("button[data-qa='signup-button']"));             
	 
	   NamePlaceHolder.sendKeys(MyName);
	  EmailPlaceHolder.sendKeys(MyEmail);
	  SignUpButton.click();
	 
	 
	  WebElement SelectGender = driver.findElement(By.id("id_gender1"));
	  SelectGender.click();
	 
	  WebElement PasswordInPutField = driver.findElement(By.id("password"));                              
	  PasswordInPutField.sendKeys(MyPassword);
	 
	 
	  WebElement DateOfBirthInDays = driver.findElement(By.id("days"));                               
	  DateOfBirthInDays.sendKeys("19");
	
	 
	  WebElement DateOfBirthInMonth = driver.findElement(By.id("months"));
	  DateOfBirthInMonth.sendKeys("August");
	 
	 
	  WebElement DateOfBirthInYear = driver.findElement(By.id("years"));
	  DateOfBirthInYear.sendKeys("1998");
	 
	 
	  WebElement NewsLetter = driver.findElement(By.id("newsletter"));
	  NewsLetter.click();
	 
	
	  WebElement NewsSpecialOffers = driver.findElement(By.id("optin"));
	  NewsSpecialOffers.click();
	 
	 
	  WebElement FirstNamePlaceHolder = driver.findElement(By.id("first_name"));
	  FirstNamePlaceHolder.sendKeys("mohammad");
	 
	 
	  WebElement LastNamePlaceHolder = driver.findElement(By.id("last_name"));
	  LastNamePlaceHolder.sendKeys("najjar");
	 
	 
	  WebElement CompanyPlaceHolder = driver.findElement(By.id("company"));
	  CompanyPlaceHolder.sendKeys("ICon consultant Engineers");
	 
	 
	  WebElement AddressPlaceHolder = driver.findElement(By.id("address1"));
	  AddressPlaceHolder.sendKeys("Jordan,Amman,Rewaq,Sayyah al barayseh");
	 
	 
	  WebElement Address2PlaceHolder = driver.findElement(By.id("address2"));
	  Address2PlaceHolder.sendKeys("IM LIVING ON MARS!");
	 
	 
	  WebElement CountryPlaceHolder = driver.findElement(By.id("country"));
	  CountryPlaceHolder.sendKeys("United States");
	 
	 
	  WebElement StatePlaceHolder = driver.findElement(By.id("state"));
	   StatePlaceHolder.sendKeys("Newyork");
	 
	 
	 WebElement CityPlaceHolder = driver.findElement(By.id("city"));
	 CityPlaceHolder.sendKeys("الا لا لا لا لا لا لا لا");
	 
	 
	 WebElement ZipCodePlaceHolder = driver.findElement(By.id("zipcode"));
	 ZipCodePlaceHolder.sendKeys("1122334455");
	 
	 
	  WebElement MobileNumberPlaceHolder = driver.findElement(By.id("mobile_number"));
	 MobileNumberPlaceHolder.sendKeys("0786161217");
	 
	 
	 WebElement CreateAccountButton = driver.findElement(By.cssSelector("button[data-qa='create-account']"));
	 CreateAccountButton.click();
	 
	 WebElement ContinueButton = driver.findElement(By.cssSelector("a[data-qa='continue-button']"));
	 ContinueButton.click();
	 

	 WebElement LogOutButton =  driver.findElement(By.cssSelector("i.fa.fa-lock"));
	 LogOutButton.click();
}

@Test ( priority = 2 )               //  SECOND PRIORITY IS THE LOGIN STAGE 


	public void Login() {
	
	WebElement EmailPlaceHolder  = driver.findElement(By.name("email"));
	EmailPlaceHolder.sendKeys(MyEmail);
	
	
	WebElement PasswordPlaceHolder  = driver.findElement(By.name("password"));
	PasswordPlaceHolder.sendKeys(MyPassword);
	
	
	WebElement LoginButton = driver.findElement(By.cssSelector("button[data-qa='login-button']"));
	LoginButton.click();
	
		
}

@Test (priority = 3 )               // THIRD PRIORITY IS THE DELETE STAGE 

public void DeleteAaccount() {
	
	WebElement DeleteAccount = driver.findElement(By.cssSelector("a[href='/delete_account']"));
	DeleteAccount.click();
	
}


@AfterTest

public void Test() {}
}



