package firstproject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SauceDemo2 {

		
	WebDriver driver = new EdgeDriver();
	String WebSite = "https://www.saucedemo.com/";

	@BeforeTest
	
	public void	MySetUp () {
	driver.get(WebSite);
	driver.manage().window().maximize();

	}
	
	
	
	
	
	@Test (priority = 1)
	public void	Login () {
		
		WebElement MyUserName = driver.findElement(By.id("user-name"));
		WebElement  MyPassword = driver.findElement(By.id("password"));
		MyUserName.sendKeys("standard_user");
		MyPassword.sendKeys("secret_sauce");
	    driver.findElement(By.id("login-button")).click(); 
	}
	 
	 
		@Test (priority =2)
public void AddToCartButoon () {
			
			
	 List <WebElement> AddToCartButtons = driver.findElements(By.cssSelector(".btn.btn_primary.btn_small.btn_inventory"));
	 
	 List <WebElement> ItemsName = driver.findElements(By.className("inventory_item_name"));
	 
	 
      for (int i = 0 ; i < AddToCartButtons.size() ; i++) {
	         AddToCartButtons.get(i).click();
	         ItemsName.get(i).getText();
	  String ItemName = ItemsName.get(i).getText();
	  
	  System.out.println(ItemName + "has been added ");
      }
		}

      
              
		@Test (priority = 3 )
public void	RemoveFromCartButton()  {
List <WebElement> RemoveFromCartButtons = driver.findElements(By.cssSelector(".btn.btn_secondary.btn_small.btn_inventory"));

for ( int i = 0 ; i < RemoveFromCartButtons.size() ; i++) {
	
	RemoveFromCartButtons.get(i).click();
}
		}	
	
}
