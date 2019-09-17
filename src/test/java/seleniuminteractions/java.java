package seleniuminteractions;

import java.awt.AWTException;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class java {

	public static void main(String[] args){
		 
	WebDriver driver;
		 
		System.setProperty("webdriver.chrome.driver", "D:\\Seleniumdrivers\\chromedriver77\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		 
		driver.get("https://www.goibibo.com");
		driver.findElement(By.id("departureCalendar")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
     
while(!driver.findElement(By.className("DayPicker-Caption")).getText().contains("October 2021")) {
	
	driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
			
}


List<WebElement> dates= driver.findElements(By.className("calDate"));
		 
      int sizze = driver.findElements(By.className("calDate")).size();
      for (int i=0;i<sizze;i++)
      {
    	 String date = driver.findElements(By.className("calDate")).get(i).getText();
    	 System.out.println(date);
      
    	if(date.equals("28"))
    	 {
    		 driver.findElements(By.className("calDate")).get(i).click();
    		 break;
    	 }
    	  
    	  
	}}}
		 
		