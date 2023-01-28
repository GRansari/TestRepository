package windowsHandling;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	WebDriver driver;
	 
	@Before
	public void start() {
		
		driver= new ChromeDriver();	
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/browser-windows");	
	
	}
	
	@Test
	public void windowHandle() {
		
		
		WebElement TabBTN = driver.findElement(By.xpath("//button[@class='btn btn-primary' and @id='tabButton']"));
		
		TabBTN.click();
		
		Set<String>handle=driver.getWindowHandles();
		Iterator<String> it = handle.iterator();
		
		String parentWindowId=it.next();
		String child1Windowid=it.next();
		System.out.println(driver.getTitle());
		System.out.println(parentWindowId);
		
		
		
		driver.switchTo().window(child1Windowid);
		System.out.println(child1Windowid);
		WebElement newtab = driver.findElement(By.xpath("//h1"));
		System.out.println("Text on new tab is => " + newtab.getText());
		driver.close();
		
		driver.switchTo().window(parentWindowId);
		System.out.println(driver.getTitle());
		System.out.println(parentWindowId);
		
        driver.findElement(By.xpath("//button[ @id='windowButton']")).click();
	}
	@Ignore
	@Test
	public void test() throws InterruptedException {
		//i run it without using Set or iterator , may be there are lot of mistakes
		System.out.println(driver.getWindowHandles().iterator());
		WebElement TabBTN = driver.findElement(By.xpath("//button[@class='btn btn-primary' and @id='tabButton']"));
		TabBTN.click();
		driver.getTitle();
		System.out.println(driver.getWindowHandles().iterator());
	}
	
}
