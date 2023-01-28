package mouseAction;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebook {

	
	WebDriver driver;
	
	 @Before
		public void setup() {
			
			
	    	driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			
			driver.get("https://www.facebook.com/");
			
				}
		@Test
		public void drop() throws InterruptedException {
			
			
			WebElement page = driver.findElement(By.xpath("//a[text()='Create New Account']"));
			page.click();
			
			WebElement username =	driver.findElement(By.xpath("//input[@name='firstname']"));
			username.sendKeys("babu");
			
			WebElement surname= driver.findElement(By.xpath("//input[@name='lastname']"));
			surname.sendKeys("bhai");
			
			WebElement mno= driver.findElement(By.xpath("//input[@name='reg_email__']"));
			mno.sendKeys("1234567890");
			
			WebElement psw= driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
			psw.sendKeys("babubhai@123");
			
			
			
			
			
			List <WebElement> daybtn = driver.findElements(By.xpath("//select[@id='day']//option"));
			
			for(int i=0;i<daybtn.size();i++) {
				
				if(daybtn.get(i).getText().equals("20")){
					
				daybtn.get(i).click();
				}
			}
				
				WebElement month =driver.findElement(By.xpath("//select[@name='birthday_month']"));
				Select select = new Select(month);
			select.selectByVisibleText("Feb");
			
			WebElement year =driver.findElement(By.xpath("//select[@name='birthday_year']"));
			Select yrselect = new Select(year);
			yrselect.selectByVisibleText("2004");
			
			WebElement male = driver.findElement(By.xpath("//input[@value='2']"));
			male.click();
			
			Thread.sleep(2000);
			WebElement signup = driver.findElement(By.xpath("//button[@type='submit' and @name='websubmit']"));
			signup.click();
			Thread.sleep(10000);
		}
			@After
			public void teardown() {
				
			driver.quit();	
				
			
			
			
		
			
			
			
	//WebElement page = driver.findElement(By.xpath("//a[text()='Create New Account']"));
	//page.click();
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
		}
	

