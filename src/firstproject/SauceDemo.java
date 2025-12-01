package firstproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SauceDemo {

	
	

	WebDriver driver = new ChromeDriver();
	
	String TheWebSite =  "https://www.saucedemo.com/";
	String TheWebSite2 = "https://www.google.com/";
	
	String U1 = "standard_user";
	String P1 = "secret_sauce";
	
	
	
	
	@BeforeTest
	
	public void mySetup () throws InterruptedException {
	
//	driver.get(TheWebSite);
//	driver.manage().window().maximize();
//	driver.navigate().to(TheWebSite2);
//	Thread.sleep(4000);
//	driver.navigate().back();
//	Thread.sleep(4000);
//	driver.navigate().forward();
//	Thread.sleep(4000);
//	driver.navigate().refresh();
	
		driver.get(TheWebSite);
		driver.manage().window().maximize();
		

	}
	
	
	
@Test 	(priority = 1 )

public void Login () {
	
	WebElement userNameInputField = driver.findElement(By.id("user-name"));
	WebElement passwordInputField = driver.findElement(By.id("password"));
	WebElement LoginButton = driver.findElement(By.id("login-button"));
	
	userNameInputField.sendKeys(U1);
	
	passwordInputField.sendKeys(P1);
	
	LoginButton.click();
	
	String ExpectedResult = "https://www.saucedemo.com/inventory.html";
	
	
	Assert.assertEquals(driver.getCurrentUrl(), ExpectedResult);
	
	
}
	@Test (priority = 2 )
	
	
	public void AddNewItemToTheCart() {
		
	WebElement AddBackPackToTheCart = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
	AddBackPackToTheCart.click();
	String ExpectedResult = "Remove";
	Assert.assertEquals(driver.findElement(By.id("remove-sauce-labs-backpack")).getText(),ExpectedResult);
	
	
	}
//	  driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
//	  driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
//	  driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();
//	  driver.findElement(By.id("add-to-cart-sauce-labs-onesie")).click();
//	 driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)")).click();
//	driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
//	driver.findElement(By.id("checkout")).click();
	
		

	
	
	
	
@AfterTest 

public void AfterFinishingTheTest()  {}


	
	
}
