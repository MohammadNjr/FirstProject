package firstproject;

import java.sql.Driver;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Radnom {

	

	
	WebDriver driver = new ChromeDriver ();
	
	String website = "https://www.saucedemo.com/" ; 
	
	
	@BeforeTest 
	
	public void fasttest () {
		
		driver.get(website);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		

}
	
	@Test
	public void Test1 () {
		
		
	WebElement UsernamePlaceholder = driver.findElement(By.id("user-name"));
	WebElement PasswordPlaceHolder = driver.findElement(By.id("password"));
	WebElement loginButton =driver.findElement(By.id("login-button"));
	
	
	UsernamePlaceholder.sendKeys("standard_user");
	PasswordPlaceHolder.sendKeys("secret_sauce");
	loginButton.click();
	
	
	
	
	}
	
	
	@Test (priority = 2 )
	
	public  void Dsa () {
		
		
	 List <WebElement> addtocartButton =	driver.findElements(By.cssSelector(".btn.btn_primary.btn_small.btn_inventory"));
		System.out.println(addtocartButton);

		
	 
	 for (int i = 0 ; i < addtocartButton.size() ; ++i ) {
		 
		 
		 addtocartButton.get(i).click();
		 
		 
	 }

		
	}
	
	
	
	
}
