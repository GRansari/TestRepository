package BrowserInvocation;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath2 {
WebDriver driver;


   
   @Before
	public void setup() {
		
		
    	driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.in/");
		
			}
	@Test
	public void title() {
		
		String actualtitle = driver.getTitle();
		Assert.assertEquals("the title is not match","Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in",actualtitle );
		
	}
	@Test
	public void surchProduct() throws InterruptedException {
		WebElement surchbox = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[2]/div[1]/input"));
		surchbox.sendKeys("iphone");
			
			Thread.sleep(2000);
			
			WebElement btn = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[3]/div/span/input"));
				btn.click();
				Assert.assertEquals("iphone", btn.getText());
			
	}
	
	@Test
	//public void returnbtn() {
		
	//	WebElement returnbtn = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/a[3]/span[1]"));
		//returnbtn.click();
		//Assert.assertEquals("Amazon Sign In",driver.getTitle());
		
	//}
	
	
	
	@After
	public void teardown() {
		
	driver.quit();	
		
		
	}
	
	
	
	
}
