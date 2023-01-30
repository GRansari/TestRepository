package AlertHaandling;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice {

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
}}
