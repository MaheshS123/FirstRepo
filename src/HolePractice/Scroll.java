package HolePractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scroll {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\javaSelenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://en.wikipedia.org/wiki/Main_Page");

		Actions act=new Actions(driver);
		
		WebElement dist = driver.findElement(By.id("Other_areas_of_Wikipedia"));
		
		act.scrollToElement(dist).perform();
		
		
	}

}
