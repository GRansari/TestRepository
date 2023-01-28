package BrowserInvocation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath1 {

	
	
	public static void main(String []args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.in/");
		
		
		if (driver.getTitle().equalsIgnoreCase("babu")) {
			
			System.out.println("pass");
		}
		else {System.out.println("fail");}
		WebElement surchbox = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[2]/div[1]/input"));
surchbox.sendKeys("iphone");
	
	Thread.sleep(2000);
	
	WebElement btn = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[3]/div/span/input"));
		btn.click();
		
		driver.quit();
	}
	
	
	
}
