package framHandling;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrame {

	WebDriver driver;
	 
	@Before
	public void start() {
		
		driver= new ChromeDriver();	
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Frames.html");
	
	
	}
	@Test
	public void test() throws InterruptedException {
		
		WebElement frame = driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']"));
		frame.click();
		
		WebElement Parentframe = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(Parentframe).getTitle();
		
		driver.switchTo().frame(driver.findElement(By.xpath("//div//iframe[@src='SingleFrame.html'and@style='float: left;height: 250px;width: 400px']")));
		
		driver.findElement(By.xpath("//div[@class='row']//div[@class='col-xs-6 col-xs-offset-5']/input")).sendKeys("test");
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		System.out.println(driver.getTitle());
	}
}
