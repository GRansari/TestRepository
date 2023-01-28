package windowsHandling;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToolTips {

	WebDriver driver;
	 
	@Before
	public void start() {
		
		driver= new ChromeDriver();	
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/tool-tips/");	
	
	}
	
	@Test
	public void windowHandle() {
		
		
		WebElement hover =driver.findElement(By.xpath("//button[@id='toolTipButton']"));
		Actions action = new Actions(driver);
		
		action.moveToElement(hover).build().perform();
		WebElement howerText = driver.findElement(By.xpath("//div[@class='tooltip-inner']"));
		Assert.assertEquals("You hovered over the Button",howerText.getText());
		System.out.println(howerText.getText());
		
	}
	
	@Test
	public void windowHandle2() {
		
		
		WebElement hover =driver.findElement(By.xpath("//input[@id='toolTipTextField']"));
		Actions action = new Actions(driver);
		
		action.moveToElement(hover).build().perform();
		WebElement howerText = driver.findElement(By.xpath("//div[text()='You hovered over the text field']"));
		Assert.assertEquals("You hovered over the text field",howerText.getText());
		System.out.println(howerText.getText());
		
	}
	
	@After
	public void end() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
		
	}
	
}
