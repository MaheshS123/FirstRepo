package HolePractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) 
	{System.setProperty("webdriver.chrome.driver", "D:\\javaSelenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://demoqa.com/buttons");
	
	driver.manage().window().maximize();
	
	Actions act=new Actions(driver);
	
	WebElement Rb = driver.findElement(By.id("rightClickBtn"));
		
	act.contextClick(Rb).perform();

	}

}
