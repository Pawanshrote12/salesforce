package seleniuminteractions;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Frames {

	
	WebDriver driver;
	@Test
	public void login() throws InterruptedException, AWTException
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\Seleniumdrivers\\chromedriver77\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	
		//driver.get("https://jqueryui.com/");
		
		/*driver.findElement(By.xpath("//a[contains(text(),'Droppable')]")).click();
		
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
		
		
		
		WebElement source = driver.findElement(By.id("draggable"));
		
		WebElement target = driver.findElement(By.id("droppable"));
		
		 Actions a = new Actions(driver);
			a.dragAndDrop(source, target).build().perform(); */
			
		driver.get("https://www.toolsqa.com/iframe-practice-page/");
		driver.findElement(By.id("cookie_action_close_header")).click();
		
	/*int totalframes = driver.findElements(By.tagName("iframe")).size();
	
	
	for(int i=0; i<totalframes;i++) {
	driver.switchTo().frame(i);
	if(driver.findElements(By.xpath("//a[contains(text(),'Skip to content')]")).size()==1)
	{
		driver.findElement(By.xpath("//a[contains(text(),'Skip to content')]")).click();
	}
	else
	{
		break;
	}
*/      
		driver.switchTo().frame("iframe1");
		driver.findElement(By.xpath("//a[contains(text(),'Skip to content')]")).click();
	
	
}}
