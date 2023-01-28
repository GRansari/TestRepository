package practice;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import BrowserInvocation.webdriver;

public class navigation {

	String driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.myntra.com/");
		//driver.get("https://www.amazon.in/");
		//driver.get("https://www.facebook.com");
		
		
		
		WebElement surchbox = driver.findElement(By.xpath("//div/input[@class='desktop-searchBar']"));
		surchbox.sendKeys("pepe");
		/*WebElement surchbtn =driver.findElement(By.xpath("//div/span/input[@type='submit']"));
		surchbtn.click();
		WebElement page = driver.findElement(By.xpath("//span[text()='\"books\"' and @class='a-color-state a-text-bold']"));
		String title="\"books\"";
		if (page.getText().equals(title) ) {
			System.out.println( "page is loaded");
			
		}
		else {
			System.out.println("page not loaded properly");
		}
		
		driver.navigate().back();
	*/
		List<WebElement> surchresults = driver.findElements(By.xpath("//ul[@class='desktop-group']//li"));
		
		System.out.println(surchresults.size());
		
		/*for (int i = 0 ; i<=surchresults.size() ; i++) {
			
			System.out.println(surchresults.get(i).getText());
		}
		*/
		
		//List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		//System.out.println(allLinks.size());
		
		//for(int i = 0; i<=allLinks.size(); i++) {
			
		//	System.out.println(allLinks.get(i).getText());
		//	System.out.println(allLinks.get(i).getAttribute("href"));
		}
		
		
		//Thread.sleep(4000);
		
		//driver.navigate().back();
		//System.out.println(driver.getTitle());
		
		//Thread.sleep(3000);
		
		//driver.navigate().forward();
		//System.out.println(driver.getTitle());
		
		//Thread.sleep(3000);
		
		//driver.navigate().refresh();
		
		
		//Thread.sleep(3000);
		
	//	driver.quit();
	}
	
	
	
	
