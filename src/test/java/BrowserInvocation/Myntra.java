package BrowserInvocation;


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

public class Myntra {
	WebDriver driver;
	
	 @Before
		public void setup() {
			
			
	    	driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			
			driver.get("https://www.myntra.com/");
			
				}
		@Test
		public void surchboxtest() {
			
			WebElement searchbx = driver.findElement(By.xpath("//input[@class='desktop-searchBar']"));
			searchbx.sendKeys("pepe");
	List <WebElement> surchedlist =	driver.findElements(By.xpath("//ul[@class='desktop-group']//li[@class='desktop-suggestion null']"));
			
	//System.out.println(surchedlist.size());
	
	for (int i = 0 ; i<surchedlist.size();i++) {
		if(surchedlist.get(i).getText().equals("Pepe Jea")) {
			
			surchedlist.get(i).click();
		
		WebElement page = driver.findElement(By.xpath("//span[@class='breadcrumbs-crumb']"));
		Assert.assertEquals("Pepe Jeans Clothing", page.getText());
		}
	}
		//System.out.println(surchedlist.get(i).getText());
	}
	
	//searchbx.sendKeys("pepe");
	
	@After
	public void teardown() {
		
	driver.quit();	
		
	

}
}