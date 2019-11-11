package one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelement {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Radhika\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
		    driver.get("https://web.whatsapp.com");
	WebElement check = driver.findElement(By.xpath("//input [@type='checkbox']"));
	
		boolean result = check.isEnabled();
		if (result==true) {
		    
	
		    System.out.println("is enable");
		
		
		
	}
		else{
			System.out.println("is not slected");
		}
		boolean result1 = check.isDisplayed();
		if (result1==true) {
			System.out.println("is displayed");
		}
		else {
		
		System.out.println("not displayed");
		
	}
		
		
		
		 String rv = driver.findElement(By.xpath("//input [@type='checkbox']")).getText();
		
		
		 System.out.println(rv);
		 
	
	}
}
