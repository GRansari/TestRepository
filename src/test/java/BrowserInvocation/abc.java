package BrowserInvocation;

/*import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//public class UseLocatorsToSearch {
	public static void main(String[] args) throws InterruptedException {
		

	
	WebDriver driver=new ChromeDriver();
	
	//driver.manage().window().maximize();
driver.manage().deleteAllCookies();
	
	driver.get("https://www.google.co.in");
	Thread.sleep(5000);
	System.out.println("URL 1:"+driver.getCurrentUrl());
	
	WebElement searchingTopic=driver.findElement(By.name("q"));
	searchingTopic.sendKeys("myntra");
	
	WebElement searchingBtn=driver.findElement(By.name("btnK"));
	searchingBtn.click();
	Thread.sleep(1000);
	
	WebElement productName=driver.findElement(By.className("desktop-searchBar"));
	searchingTopic.sendKeys("POLO TESHIRT");
	
	WebElement searchBtn=driver.findElement(By.className("myntraweb-sprite desktop-iconSearch sprites-search"));
	searchBtn.click();
	Thread.sleep(5000);

}
}
public class abc {
	
	
	public static void main(String[]args) throws InterruptedException {
		
	//	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir"+ "/chromedriver.exe"));
		WebDriver a = new ChromeDriver();
		
		a.manage().window().maximize();
		a.manage().deleteAllCookies();
		a.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		a.get("https://demo.automationtesting.in/Register.html");
		
		a.findElement(By.xpath("//input[@placeholder=\"First Name\"]"));//.sendKeys("smile");
		
		WebElement b = a.findElement(By.xpath("//input[@placeholder=\"First Name\"]"));
		
		if(b.isEnabled()) {
			b.sendKeys("hjdtred");
		}
		//System.out.println(b.isEnabled());
		
		
		
		b.sendKeys("smile");
		
		
		
		
		
		
		
		
		
		a.findElement(By.xpath("//input[@ng-model=\"LastName\"]")).sendKeys("ansari");
		a.findElement(By.xpath("//textarea[@ng-model=\"Adress\"]")).sendKeys("gat no 5 plot no 58 satpur ambad link road sanjive nagar");
		a.findElement(By.xpath("//input[@ng-model=\"EmailAdress\"]")).sendKeys("smile123@gmail.com");
		a.findElement(By.xpath("//input[@ng-model=\"Phone\"]")).sendKeys("7020270435");
		a.findElement(By.xpath("//input[@ng-model=\"radiovalue\"]")).click();
		a.findElement(By.id("checkbox1")).click();
		a.findElement(By.xpath("//div[@style=\"min-height:30px;max-width:200px\"]")).click();
		//a.findElement(By.xpath("//a[@style=\"text-decoration:none\"]")).click();
		
		Thread.sleep(3000);
		
		
		
		//a.quit();
		
		
		
		
		
		
	}

}*/
