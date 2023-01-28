package popup;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpHandling {
	
	WebDriver driver;
	
	 @Before
		public void setup() {
			
			
	    	driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			
			driver.get("https://demo.automationtesting.in/Alerts.html");
			
				}
		@Test
		public void drop() throws InterruptedException {
			
			WebElement selectbtn =driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
			selectbtn.click();	
			Thread.sleep(1000);
			
			WebElement btn =driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']"));
			btn.click();
			Thread.sleep(1000);
			
			Alert alert = driver.switchTo().alert();
	
			alert.sendKeys("babu bhai");
			alert.accept();
			Thread.sleep(1000);
			
			WebElement cheke = driver.findElement(By.xpath("//p[@id='demo1']"));
			Assert.assertEquals("Hello babu bhai How are you today", cheke.getText());
			
			
			//WebElement asserts = driver.findElement(By.xpath("//p[text()='You Pressed Cancel']"));
			//Assert.assertEquals("somthing wrong","You Pressed Cancel", asserts.getText());
		}
		@After
		public void teardown() {
			
		driver.quit();	
		}
	
	
	
	
	

}
