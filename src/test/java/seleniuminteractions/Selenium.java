package seleniuminteractions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Selenium {
	
	WebDriver driver;
	@Test
	public void login() throws InterruptedException, AWTException
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\Seleniumdrivers\\chromedriver77\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com");
		
		
	 driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	 driver.findElement( By.id("txtPassword")).sendKeys("admin123");
	 driver.findElement(By.id("btnLogin")).click();
	 
	 Thread.sleep(5000);
	 
	 Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']"))).build().perform();
		
		Thread.sleep(2000);
	 //Actions a1 = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//a[@id='menu_admin_UserManagement']"))).build().perform();
		Thread.sleep(2000);
		 driver.findElement(By.id("menu_admin_viewSystemUsers")).click();
		 
		 
	//a.moveToElement(driver.findElement(By.id("searchSystemUser_userName")).sendKeys("pawan"));
	a.moveToElement(driver.findElement(By.id("searchSystemUser_userName"))).click().keyDown(Keys.SHIFT).sendKeys("Pawan shrote").doubleClick().build().perform();
	
	//a.moveToElement(By.xpath("//a[@id='menu_admin_UserManagement']")).build.;
	a.moveToElement(driver.findElement(By.xpath("//a[@id='menu_admin_UserManagement']"))).contextClick().build().perform();;
	//.keyDown(Keys.ARROW_DOWN).keyDown(Keys.ENTER).build().perform();
	//.sendKeys(Keys.chord(Keys.ARROW_DOWN)).sendKeys(Keys.chord(Keys.ENTER));
	 Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		
		
		robot.keyPress(KeyEvent.VK_ENTER);
		
		/*String winHandleBefore = driver.getWindowHandle();
		
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);}
driver.findElement(By.id("MP_link")).click();
	
		 
driver.switchTo().window(winHandleBefore);
		driver.findElement(By.id("menu_directory_viewDirectory")).click();  */
		
		Set<String> id =driver.getWindowHandles();
		Iterator<String> it = id.iterator();
		String Parentid = it.next();
		String Childid = it.next();
		driver.switchTo().window(Childid);
		
		driver.findElement(By.id("MP_link")).click();
		
		driver.switchTo().window(Parentid);
		driver.findElement(By.id("menu_directory_viewDirectory")).click();
		
		
		
		
		
		
		
		
		

}
}