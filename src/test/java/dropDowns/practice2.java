package dropDowns;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class practice2 {

	WebDriver driver;
	@Before
	
	
	public void start() {
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		//driver.get("https://www.facebook.com/");
	driver.get("https://demoqa.com/automation-practice-form");
	}
	
	@Test
	public void test1() {
		
		WebElement click = driver.findElement(By.xpath("//input[@type='text' and @id='dateOfBirthInput' ]"));
		click.click();
		WebElement month = driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
		month.click();
		//WebElement mnth = driver.findElement(By.xpath(""));
		Select select = new Select(month);
		select.selectByVisibleText("March");
	}
	
	
}
