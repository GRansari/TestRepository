package mouseAction;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	WebDriver driver;
	
	 @Before
		public void setup() {
			
			
	    	driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			
			//driver.get("https://demoqa.com/droppable/");
			driver.get("https://www.facebook.com/");
				}
		@Test
		public void drop() {
			
			
			
			
			WebElement page = driver.findElement(By.xpath("//a[text()='Create New Account']"));
			page.click();
			
			driver.findElement(By.xpath("//input[@id='u_2_b_U9' and @class='inputtext _58mg _5dba _2ph-']")).sendKeys("sdfgvfs");
			//username.sendKeys("babu");
			/*WebElement surname= driver.findElement(By.xpath("//input[@id='u_2_d_g4']"));
			surname.sendKeys("bhai");
			WebElement mno= driver.findElement(By.xpath("//input[@id='u_2_g_32']"));
			mno.sendKeys("1234567890");
			WebElement psw= driver.findElement(By.xpath("//input[@id='password_step_input']"));
			psw.sendKeys("babubhai@123");
			
		/*WebElement el1 =	driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement el2 = 	driver.findElement(By.xpath("//div[@class='simple-drop-container']//div[@class='drop-box ui-droppable']"));
		
		Actions action = new Actions(driver);
		//action.clickAndHold(el1).moveToElement(el2).release(el1).build().perform();
		action.dragAndDrop(el1, el2).perform();
		WebElement dtext=driver.findElement(By.xpath("//p[text()='Dropped!']"));
		Assert.assertEquals("drag and drop is not perform properly","Dropped!", dtext.getText());*/
		}
		
		@After
		public void teardown() {
			
		driver.quit();	
			
}}
