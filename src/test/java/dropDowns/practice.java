package dropDowns;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class practice {
	
	
	WebDriver driver;
	@Before
	public void start() {
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
	}
	@Test
	public void test1() throws InterruptedException {
		WebElement createNewAccountButton = driver.findElement(By.xpath("//a[@role='button' and text()='Create New Account']"));
		createNewAccountButton.click();
		WebElement birthDay = driver.findElement(By.id("day"));
		WebElement birthMonth = driver.findElement(By.id("month"));
		WebElement birthYear = driver.findElement(By.id("year"));
		
		Select daySelect = new Select(birthDay);
		daySelect.selectByVisibleText("3");
		Select monthSelect = new Select(birthMonth);
		monthSelect.selectByVisibleText("Dec");
		//monthSelect.selectByValue("12");


		
		// To Halt the execution for sometime (demonstration purposes)
		Thread.sleep(2000);
		
		Select yearSelect = new Select(birthYear);
		yearSelect.selectByVisibleText("2014");
		//yearSelect.selectByValue("2014");
		
		
	}

}
