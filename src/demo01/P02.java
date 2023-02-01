package demo01;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P02 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\javaSelenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		// 1) get- to enter url in browser or to open an application 
				driver.get("https://www.google.com/");
				Thread.sleep(1000);
				
				driver.findElement(By.name("q")).sendKeys("watch");
				Thread.sleep(1000);
				
				List<WebElement> searchResults = driver.findElements(By.xpath("(//div[@class='aajZCb'])[1]//ul/li"));
				System.out.println("no of item in list is = "+searchResults.size());
				
				Thread.sleep(1500);
				
				//for each loop
		         for(WebElement R:searchResults) {
		        	 System.out.println(R.getText());
		         }
		         System.out.println("======================");
		         for(WebElement result:searchResults)
		         {
		        	  String expectedText ="watches for women";
		        	  String actualText = result.getText();
		        	  
		        	  if(expectedText.equals(actualText))
		        	  {
		        		  System.out.println("clicked on "+result.getText());
		        		  result.click();
		        		  break;
		        	  }
		        }

		         Thread.sleep(1500);
	        	  driver.findElement(By.linkText("Images")).click();
	}

}
