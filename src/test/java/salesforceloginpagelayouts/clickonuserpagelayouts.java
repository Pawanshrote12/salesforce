package salesforceloginpagelayouts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class clickonuserpagelayouts {
	
	 WebDriver driver;
	
	 @Test
	public void pagelayout()
	{
	System.setProperty("webdriver.chrome.driver", "D:\\Seleniumdrivers\\chromedriver_win64\\chromedriver.exe");
	 driver=new ChromeDriver();
	 
	 driver.get("https://login.salesforce.com/");
	 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	 driver.findElement(By.id("username")).sendKeys("nisham@eternussolutions.com"); 
	 driver.findElement(By.id("password")).sendKeys("Espl@2019");
	 driver.findElement(By.xpath("//input[@id='Login']")).click();
	 // asking for verification code
	 
	 driver.findElement(By.xpath("//a[@class='slds-button slds-button--icon']")).click();
	 driver.findElement(By.xpath("//a[contains(text(),'Job Posting')]")).click();
	 driver.findElement(By.xpath("//a[contains(text(),'Page Layouts')]")).click();
	 driver.findElement(By.xpath("//a[contains(text(),'nisha mehra')]")).click();
	 
	 
	 
	
	
	
}
}