package BrowserInvocation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriver {

	public class UseLocatorsToSearch {
		public void main(String[] args) throws InterruptedException {
			

		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

