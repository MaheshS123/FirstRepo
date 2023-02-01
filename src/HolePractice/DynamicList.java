package HolePractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicList {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\javaSelenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
		 
		driver.findElement(By.name("q")).sendKeys("Bike");
		Thread.sleep(1000);
		List<WebElement> List = driver.findElements(By.xpath("(//ul[@role='listbox'])[1]/li"));
		
		System.out.println(List.size());
		
		Thread.sleep(1000);
		
		for(WebElement l:List) 
		{
			System.out.println(l.getText());
		}
		
		System.out.println("============================");

	
		for(WebElement l:List) {
			
			String Expected = "bike price";
			
			String Actual = l.getText();
			Thread.sleep(100);
			
			if(Expected.equals(Actual)) {
				
				System.out.println(l.getText());
				
				l.click();
				break;
			}
			
			
		}
	
	
	
	
	
	}

}
