package firstproject;

import java.time.Duration;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test3CodenBox {

	
	

	WebDriver driver = new ChromeDriver();
	String Website = "https://codenboxautomationlab.com/practice/";
	
	Random rand = new Random();
	
	
	@BeforeTest
	public void mySetup () {
		
		
	driver.get(Website);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	}
	
	
	
	@Test (enabled = false)
	public void RadioButton () {
	

		WebElement 	DivRadio = driver.findElement(By.id("radio-btn-example"));
		List <WebElement> AllRadioButtons = DivRadio.findElements(By.tagName("input"));
		
		int randominput = rand.nextInt(DivRadio.findElements(By.tagName("input")).size());
		AllRadioButtons.get(randominput).click();
		
		
		
		
	
	}
	
	
	
	@Test (enabled = false)
	
	public void Dynamic_Drop_down() throws InterruptedException {
		
		String [] countries = { "Jo", "United"};
		int RandomCountry = rand.nextInt(countries.length);
	WebElement Autocompleteinput = driver.findElement(By.id("autocomplete"));
	
	Autocompleteinput.sendKeys(countries[RandomCountry]);
	
	Thread.sleep(1000);
	Autocompleteinput.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER);
		
		
	
	}
	
	@Test (enabled = false )
	public void SelectDropDown (){
	
		
	WebElement mySelectInput = driver.findElement(By.id("dropdown-class-example"));
			 int totaloption = mySelectInput.findElements(By.tagName("option")).size();
  Select mySelector = new Select (mySelectInput);
int RadnomIndex = rand.nextInt(1,totaloption);
mySelector.selectByIndex(RadnomIndex);
	
	
		//int Selector = rand.nextInt(SelectorBox.findElements(By.tagName("option")).size());
		//SelectOption.get(SelectOption[Selector]). 
	
	
	}
	
	@Test (enabled = false)
	public void CheckBox () {
		
	WebElement DivBox =driver.findElement(By.id("checkbox-example"));
	 List  < WebElement > CheckOptions = DivBox.findElements(By.tagName("input"));
	for (int i = 0 ; i < CheckOptions.size() ; i++) {
		CheckOptions.get(i).click();	
		
		
	}
}
	@Test ( enabled = false )
	public void zxc () throws InterruptedException {
		
		
		
		WebElement Placeholder = driver.findElement(By.id("autocomplete"));
		String [] Countries = {"sau" , "united"} ; 
		int Randomcountry = rand.nextInt(Countries.length);
		Placeholder.sendKeys(Countries[Randomcountry]);
		Thread.sleep(1000);
		Placeholder.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER);	
	}
	
	
	
	@Test (enabled = false )
	
	
	public void OpenWindow () {
		
		
		
		
	
		
	}	
	}

	
	
	
	

	
	



	
	// WebElement 	DivRadio = driver.findElement(By.id("radio-btn-example"));
	//List <WebElement> AllRadioButtons = DivRadio.findElements(By.tagName("input"));
	
	
	
	//int randominput = rand.nextInt(DivRadio.findElements(By.tagName("input")).size());
	//AllRadioButtons.get(randominput).click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

