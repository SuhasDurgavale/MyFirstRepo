package testLayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Flipkart {
	 @Test
	  public void OpenAmazon() 
	  {
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.flipkart.com/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  
		  
		  }
}
