package loginPageRegistration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login {
	WebDriver driver;

	@BeforeTest
	public void launchBrowser() {
	    driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
	}
	
	
	@Test
	public void login() throws InterruptedException {
		WebElement firstName=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		firstName.sendKeys("Jyoti");
		
		WebElement lasttName=driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		lasttName.sendKeys("Sharma");
		
		WebElement address=driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
		address.sendKeys("Rajnandgaon Chattisghar");
		
		WebElement email=driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("jyoti@gmail.com");
		
		WebElement telephone=driver.findElement(By.xpath("//input[@type='tel']"));
		telephone.sendKeys("1234567890");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//label[text()=' FeMale']")).click();
		driver.findElement(By.xpath("//input[@value='Movies']")).click();
		
		Thread.sleep(2000);
		
		WebElement language=driver.findElement(By.xpath("//div[@id='msdd']/following-sibling::div/ul/li/a"));
		
		
		Select languageList=new Select(language);
     	//languageList.selectByValue("English");
		// languageList.selectByValue("Hindi");
		    
		 if(languageList.isMultiple()) {
	            // Select multiple options
			 languageList.selectByValue("English");
			 languageList.selectByValue("Hindi");
	        } else {
	            System.out.println("This dropdown does not support multiple selections.");
	        }
		
                   Thread.sleep(4000);		 

//		WebElement selectSkill=driver.findElement(By.id("Skills"));
//		
//		Select dropdownList=new Select(selectSkill);
//		 dropdownList.selectByValue("C");
//		 
//		 
//		 WebElement selectCountry=driver.findElement(By.xpath("(//span[@id='select2-country-container'])[1]"));
//			
//			Select countryList=new Select(selectCountry);
//			 countryList.selectByValue("India");
//			 
		
		
	}
  @AfterTest
	public void closeBrowser() {
		driver.close();
		
	}
}
