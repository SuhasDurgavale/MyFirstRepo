package testLayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Snapdeal {
	
		 @Test
		  public void OpenAmazon() 
		  {
			  WebDriver driver=new ChromeDriver();
			  driver.get("https://www.snapdeal.com/");
			  driver.manage().window().maximize();
			  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			  System.out.println("suhass");
			  System.out.println(" add to index");
			  System.out.println("practice");
			  }
}
