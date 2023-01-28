package practice;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {

	WebDriver driver;
	
	@Before
	public void base() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://demoqa.com/browser-windows");
			}
	@Test
	public void tabHandling() throws InterruptedException {
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		
		String windowid = driver.getWindowHandle();
		System.out.println(windowid);
		System.out.println(driver.getCurrentUrl());
		WebElement newtab = driver.findElement(By.xpath("//button[@id='tabButton']"));
		newtab.click();	
		
		Set<String> handel = driver.getWindowHandles();
		Iterator<String> it = handel.iterator();
		
		String page1 = it.next();
		String page2 = it.next();
		driver.switchTo().window(page2);
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getWindowHandle());
		System.out.println(driver.getCurrentUrl());
		
		System.out.println("..............................................");
		driver.switchTo().window(page1);
		//System.out.println(driver.getTitle());
		System.out.println(driver.getWindowHandle());
		System.out.println(driver.getCurrentUrl());
		
		//driver.close();
	}
	
	@Test
	public void windowsHandling() throws InterruptedException{
		
		WebElement winbtn = driver.findElement(By.xpath("//button[@id='windowButton']"));
		System.out.println(driver.getTitle());
		System.out.println(driver.getWindowHandle());
		System.out.println(driver.getCurrentUrl());
		winbtn.click();
		
		Set<String> handel = driver.getWindowHandles();
		Iterator<String> it = handel.iterator();
		String page1 = it.next();
		String page2 = it.next();
		
		driver.switchTo().window(page2);
		System.out.println(driver.getTitle());
		System.out.println(driver.getWindowHandle());
		System.out.println(driver.getCurrentUrl());
		
		WebElement page2text = driver.findElement(By.xpath("//h1"));
		System.out.println(page2text.getText());
		Assert.assertEquals("your text is wrong ","This is a sample page", page2text.getText());
		
		driver.switchTo().window(page1);
		
		System.out.println(driver.getTitle());
		
	}  
	
        @After
	
	    public void end() {
		
		driver.quit();
		
	}
}
