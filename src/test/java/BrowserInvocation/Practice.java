package BrowserInvocation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	
	public static void main (String args[]) throws InterruptedException  {
		
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		//driver.manage().deleteAllCookies();
		
		driver.get("https://www.facebook.com/");
	//	Thread.sleep(1000);
		
		//driver.findElement(By.id("email")).sendKeys("gulam@123");
		//Thread.sleep(1000);
		//driver.findElement(By.id("pass")).sendKeys("babu@123");
	
		Thread.sleep(1000);
    
		//driver.findElement(By.name("login")).click();
		
	 //  Thread.sleep(1000);
		
		//driver.navigate().back();
		
		driver.findElement(By.xpath("//a[@ajaxify=\"/reg/spotlight/\"]")).click();
		
	//	driver.findElement(By.xpath("//input[@placeholder="First name"]"))
	
		//WebElement b = driver.findElement(By.xpath("//a[@rel=\"async\"]"));
		//b.sendKeys("gjhvj");
	 //    System.out.println(b.isEnabled());
	    //System.out.println(b.sendKeys("jgvv")); 
	
	driver.findElement(By.xpath("//input[@placeholder=\"First name\"]")).sendKeys("babu");
	driver.findElement(By.name("lastname")).sendKeys("ansari");
	driver.findElement(By.name("reg_email__")).sendKeys("1234567890");
	driver.findElement(By.name("reg_passwd__")).sendKeys("babu@1232");
	driver.findElement(By.id("day")).sendKeys("20");
	driver.findElement(By.id("month")).click();
	driver.findElement(By.id("month")).sendKeys("jan");
	
	
	}
	
	
	
	
	
	
	
}
