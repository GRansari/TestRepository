package BrowserInvocation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CromeBrowserInvoc {
	
	
	public static void main(String Args[]) throws InterruptedException {
		
		
	WebDriver driver = new ChromeDriver();
			
		
		driver.manage ().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("http://www.google.co.in");
		Thread.sleep(2000);
		
		String pagetitle = driver.getTitle();
		System.out.println(pagetitle);
		Thread.sleep(2000);
		
		String pagelink = driver.getCurrentUrl();
		System.out.println(pagelink);
		Thread.sleep(2000);
		
		if (pagetitle.equals("Google")) {
			
			System.out.println("page name is currect");
		}
		else {
			System.out.println("name did not match");
		}
		
		
       if (pagelink.equals("https://www.google.co.in/?gws_rd=ssl")) {
			
			System.out.println("page link is currect");
		}
		else {
			System.out.println("");
		}

     driver.navigate().to("https://www.facebook.com");
     System.out.println(driver.getTitle());
     System.out.println(driver.getCurrentUrl());
     Thread.sleep(2000);
     
     driver.navigate().back();
     Thread.sleep(200);
     
     driver.navigate().forward();
     System.out.println(driver.getTitle());
     Thread.sleep(2000);
     
     driver.navigate().back();
     
     Thread.sleep(2000);
     driver.navigate().to("https://whatsapp.com");
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
		
		driver.quit();
	}

}
