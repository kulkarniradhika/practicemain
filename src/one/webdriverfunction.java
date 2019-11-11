package one;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriverfunction {
	public static void main(String[] args)  {
   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Radhika\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
   WebDriver driver= new ChromeDriver();
   driver.get("https://www.facebook.com/");
  String url = driver.getCurrentUrl();
  System.out.println(url); 
   String title = driver.getTitle();
    System.out.println(title);
    driver.manage().window().maximize();
  Point p = new Point(200, 300);
  driver.manage().window().setPosition(p);
  Dimension d=new Dimension(300, 400);
  driver.manage().window().setSize(d);
  
  driver.navigate().to("https://www.google.com/");
  driver.navigate().back();
  driver.navigate().forward();
 try {
	Thread.sleep(3000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
  driver.navigate().refresh();
  driver.close();
  driver.quit();
  
  
  

  
	}
	

}
