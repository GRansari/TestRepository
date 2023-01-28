package BrowserInvocation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {
	WebDriver driver;
	public void setup() {
		
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
	}
	public void validatetitle() {
		
		String actualtitle = driver.getTitle();
		//Assert.assertEquals
		
	}
   
	public void teardown() {
		
		driver.quit();
	}
	
	
	
	
}
