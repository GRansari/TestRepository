package AlertHaandling;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class popupalert {

	WebDriver driver;
	
	@Before
	public void Start() {
	
	driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.get("http://demo.automationtesting.in/Alerts.html");
	}
	
	@Test
	
	public void start() {
	    WebElement	alertOk = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
	    
		WebElement alertOkandCancel = driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
		WebElement Okcancel= driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		
		WebElement alertSendKeys = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
		WebElement alertSkeys =	driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		
		
		alertOk.click();
		
		Alert alert = driver.switchTo().alert();
		Assert.assertEquals("I am an alert box!",alert.getText());
		alert.accept();
		
		alertOkandCancel.click();
		Okcancel.click();
		Alert alert1 = driver.switchTo().alert();
		alert1.dismiss();
		
		Assert.assertEquals("You Pressed Cancel", driver.findElement(By.xpath("//p[@id='demo']")).getText());
		
		alertSendKeys.click();
		alertSkeys .click();
	    Alert alert2 =	driver.switchTo().alert();
	    alert2.sendKeys("hey i am automation tester");
	    alert2.accept();
	     
	    Assert.assertEquals("Hello hey i am automation tester How are you today", driver.findElement(By.xpath("//p[@id='demo1']")).getText());
	}
	
	
	
}
