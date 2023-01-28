package practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {
	
	WebDriver driver;
	String surchText ="watch";
	String clickText = "Watch Girls";
	
	
	@Before
	public void start() {
		
	    driver= new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.myntra.com/");
		
	}
	
	@Test
	public void surching() {
		
		WebElement surchbtn = driver.findElement(By.xpath("//input[@class='desktop-searchBar']"));
		surchbtn.sendKeys(surchText);
		
		List<WebElement> list = driver.findElements(By.xpath("//ul[@class='desktop-group']//li"));
		
		System.out.println(list.size());
		
		for(int i= 0; i<=list.size();i++) {
			
			System.out.println(list.get(i).getText());
			
			if(list.get(i).getText().equals(clickText)) {
				
				
				System.out.println(list.get(i).getText());
				list.get(i).click();
				
			}
			
			
		}
		
		WebElement validationText = driver.findElement(By.xpath("//span[@class='breadcrumbs-crumb']"));
		Assert.assertEquals("Watch Girls", validationText.getText());
		}
	@After
	
	public void end () throws InterruptedException {
		
		Thread.sleep(4000);
		driver.quit();
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
